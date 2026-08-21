/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.net.HostAndPort
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.HttpServerCodec
 *  io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.handler.ssl.SslContext
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.google.common.net.HostAndPort;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import java.net.InetSocketAddress;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class aty {
    private static final Logger a = LogUtils.getLogger();
    private final HostAndPort b;
    final avx c;
    private @Nullable Channel d;
    private final NioEventLoopGroup e;
    private final Set<atr> f = Sets.newIdentityHashSet();

    public aty(HostAndPort $$0, avx $$1) {
        this.b = $$0;
        this.c = $$1;
        this.e = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Management server IO #%d").setDaemon(true).build());
    }

    public aty(HostAndPort $$0, avx $$1, NioEventLoopGroup $$2) {
        this.b = $$0;
        this.c = $$1;
        this.e = $$2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(atr $$0) {
        Set<atr> set = this.f;
        synchronized (set) {
            this.f.add($$0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(atr $$0) {
        Set<atr> set = this.f;
        synchronized (set) {
            this.f.remove((Object)$$0);
        }
    }

    public void a(auo $$0) {
        this.b($$0, null);
    }

    public void a(auo $$0, SslContext $$1) {
        this.b($$0, $$1);
    }

    private void b(final auo $$0, final @Nullable SslContext $$1) {
        final atw $$2 = new atw();
        ChannelFuture $$3 = ((ServerBootstrap)((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().handler((ChannelHandler)new LoggingHandler(LogLevel.DEBUG))).channel(NioServerSocketChannel.class)).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$02) {
                try {
                    $$02.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                ChannelPipeline $$12 = $$02.pipeline();
                if ($$1 != null) {
                    $$12.addLast(new ChannelHandler[]{$$1.newHandler($$02.alloc())});
                }
                $$12.addLast(new ChannelHandler[]{new HttpServerCodec()}).addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)}).addLast(new ChannelHandler[]{aty.this.c}).addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/")}).addLast(new ChannelHandler[]{new awc()}).addLast(new ChannelHandler[]{new awb()}).addLast(new ChannelHandler[]{new atr($$02, aty.this, $$0, $$2)});
            }
        }).group((EventLoopGroup)this.e).localAddress(this.b.getHost(), this.b.getPort())).bind();
        this.d = $$3.channel();
        $$3.syncUninterruptibly();
        a.info("Json-RPC Management connection listening on {}:{}", (Object)this.b.getHost(), (Object)this.b());
    }

    public void a(boolean $$0) throws InterruptedException {
        if (this.d != null) {
            this.d.close().sync();
            this.d = null;
        }
        this.f.clear();
        if ($$0) {
            this.e.shutdownGracefully().sync();
        }
    }

    public void a() {
        this.a(atr::a);
    }

    public int b() {
        return this.d != null ? ((InetSocketAddress)this.d.localAddress()).getPort() : this.b.getPort();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(Consumer<atr> $$0) {
        Set<atr> set = this.f;
        synchronized (set) {
            this.f.forEach($$0);
        }
    }
}

