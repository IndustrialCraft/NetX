package com.github.industrialcraft.netx;

import com.github.industrialcraft.netx.timeout.PingMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class MessageDecoder extends ByteToMessageDecoder {
    MessageRegistry registry;
    public MessageDecoder(MessageRegistry registry) {
        this.registry = registry;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        int id = in.readInt();
        if(id == 0) { //ping
            out.add(new PingMessage());
            return;
        }
        MessageRegistry.MessageDescriptor descriptor = registry.byID(id);
        if(descriptor == null) {
            ctx.fireExceptionCaught(new RuntimeException("unknown packet id: " + id));
            return;
        }
        out.add(descriptor.reader.read(new ByteBufInputStream(in)));
    }
}
