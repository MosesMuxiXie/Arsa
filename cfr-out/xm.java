/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFutureListener
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class xm {
    private static final Logger a = LogUtils.getLogger();

    public static ChannelFutureListener a(Runnable $$0) {
        return $$1 -> {
            $$0.run();
            if (!$$1.isSuccess()) {
                $$1.channel().pipeline().fireExceptionCaught($$1.cause());
            }
        };
    }

    public static ChannelFutureListener a(Supplier<@Nullable aay<?>> $$0) {
        return $$1 -> {
            if (!$$1.isSuccess()) {
                aay $$2 = (aay)$$0.get();
                if ($$2 != null) {
                    a.warn("Failed to deliver packet, sending fallback {}", $$2.a(), (Object)$$1.cause());
                    $$1.channel().writeAndFlush((Object)$$2, $$1.channel().voidPromise());
                } else {
                    $$1.channel().pipeline().fireExceptionCaught($$1.cause());
                }
            }
        };
    }
}

