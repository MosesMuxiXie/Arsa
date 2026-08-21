/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.local.LocalAddress
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  io.netty.util.HashedWheelTimer
 *  io.netty.util.Timeout
 *  io.netty.util.Timer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.local.LocalAddress;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ayh {
    private static final Logger b = LogUtils.getLogger();
    final MinecraftServer c;
    public volatile boolean a;
    private final List<ChannelFuture> d = Collections.synchronizedList(Lists.newArrayList());
    final List<wu> e = Collections.synchronizedList(Lists.newArrayList());

    public ayh(MinecraftServer $$0) {
        this.c = $$0;
        this.a = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(@Nullable InetAddress $$0, int $$1) throws IOException {
        List<ChannelFuture> list = this.d;
        synchronized (list) {
            axw $$2 = axw.a(this.c.p());
            this.d.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel($$2.e())).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

                protected void initChannel(Channel $$0) {
                    try {
                        $$0.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                    }
                    catch (ChannelException channelException) {
                        // empty catch block
                    }
                    ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30));
                    if (ayh.this.c.an()) {
                        $$1.addLast("legacy_query", (ChannelHandler)new aya(ayh.this.d()));
                    }
                    wu.a($$1, aaz.a, false, null);
                    int $$2 = ayh.this.c.o();
                    wu $$3 = $$2 > 0 ? new xp($$2) : new wu(aaz.a);
                    ayh.this.e.add($$3);
                    $$3.a($$1);
                    $$3.a(new ayj(ayh.this.c, $$3));
                }
            }).group($$2.c()).localAddress($$0, $$1)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public SocketAddress a() {
        void $$1;
        List<ChannelFuture> list = this.d;
        synchronized (list) {
            ChannelFuture $$0 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(axw.a().e())).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

                protected void initChannel(Channel $$0) {
                    wu $$1 = new wu(aaz.a);
                    $$1.a(new ayc(ayh.this.c, $$1));
                    ayh.this.e.add($$1);
                    ChannelPipeline $$2 = $$0.pipeline();
                    wu.a($$2, aaz.a);
                    if (w.aJ > 0) {
                        $$2.addLast("latency", (ChannelHandler)new a(w.aJ, w.aK));
                    }
                    $$1.a($$2);
                }
            }).group(axw.a().c()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.d.add($$0);
        }
        return $$1.channel().localAddress();
    }

    public void b() {
        this.a = false;
        for (ChannelFuture $$0 : this.d) {
            try {
                $$0.channel().close().sync();
            }
            catch (InterruptedException $$1) {
                b.error("Interrupted whilst closing channel");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List<wu> list = this.e;
        synchronized (list) {
            Iterator<wu> $$0 = this.e.iterator();
            while ($$0.hasNext()) {
                wu $$1 = $$0.next();
                if ($$1.j()) continue;
                if ($$1.i()) {
                    try {
                        $$1.b();
                    }
                    catch (Exception $$2) {
                        if ($$1.e()) {
                            throw new v(m.a($$2, "Ticking memory connection"));
                        }
                        b.warn("Failed to handle packet for {}", (Object)$$1.a(this.c.bn()), (Object)$$2);
                        yw $$3 = yh.b("Internal server error");
                        $$1.a(new abk($$3), xm.a(() -> $$1.a($$3)));
                        $$1.m();
                    }
                    continue;
                }
                $$0.remove();
                $$1.n();
            }
        }
    }

    public MinecraftServer d() {
        return this.c;
    }

    public List<wu> e() {
        return this.e;
    }

    static class ayh$a
    extends ChannelInboundHandlerAdapter {
        private static final Timer a = new HashedWheelTimer();
        private final int b;
        private final int c;
        private final List<a> d = Lists.newArrayList();

        public ayh$a(int $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public void channelRead(ChannelHandlerContext $$0, Object $$1) {
            this.a($$0, $$1);
        }

        private void a(ChannelHandlerContext $$0, Object $$1) {
            int $$2 = this.b + (int)(Math.random() * (double)this.c);
            this.d.add(new a($$0, $$1));
            a.newTimeout(this::a, (long)$$2, TimeUnit.MILLISECONDS);
        }

        private void a(Timeout $$0) {
            a $$1 = this.d.remove(0);
            $$1.a.fireChannelRead($$1.b);
        }

        static class a {
            public final ChannelHandlerContext a;
            public final Object b;

            public a(ChannelHandlerContext $$0, Object $$1) {
                this.a = $$0;
                this.b = $$1;
            }
        }
    }
}

