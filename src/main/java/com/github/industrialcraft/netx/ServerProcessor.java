package com.github.industrialcraft.netx;

import com.github.industrialcraft.netx.timeout.PingMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.AttributeKey;

public class ServerProcessor extends ChannelInboundHandlerAdapter {
    AttributeKey SOCKET_USER_ATTR = AttributeKey.valueOf("SOCKET_USER");

    private NetXServer server;
    public ServerProcessor(NetXServer server) {
        this.server = server;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        SocketUser user = new SocketUser(ctx.channel());
        server.users.add(user);
        ctx.channel().attr(SOCKET_USER_ATTR).set(user);
        server.addToMessageQueue(new ServerMessage.Connect(user));
    }
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        SocketUser user = (SocketUser) ctx.channel().attr(SOCKET_USER_ATTR).get();
        server.users.remove(user);
        server.addToMessageQueue(new ServerMessage.Disconnect(user));
        ctx.channel().attr(SOCKET_USER_ATTR).set(null);
    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if(msg instanceof PingMessage)
            return;
        server.addToMessageQueue(new ServerMessage.IncomingMessage((SocketUser) ctx.channel().attr(SOCKET_USER_ATTR).get(), msg));
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        server.addToMessageQueue(new ServerMessage.Exception((SocketUser) ctx.channel().attr(SOCKET_USER_ATTR).get(), cause));
    }
}
