/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.Channel
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.IoHandlerFactory
 *  io.netty.channel.MultiThreadIoEventLoopGroup
 *  io.netty.channel.ServerChannel
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollIoHandler
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.kqueue.KQueue
 *  io.netty.channel.kqueue.KQueueIoHandler
 *  io.netty.channel.kqueue.KQueueServerSocketChannel
 *  io.netty.channel.kqueue.KQueueSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalIoHandler
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioIoHandler
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.IoHandlerFactory;
import io.netty.channel.MultiThreadIoEventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollIoHandler;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.kqueue.KQueue;
import io.netty.channel.kqueue.KQueueIoHandler;
import io.netty.channel.kqueue.KQueueServerSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalIoHandler;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.concurrent.ThreadFactory;
import org.jspecify.annotations.Nullable;

public abstract class axw {
    private static final axw a = new axw("NIO", NioSocketChannel.class, NioServerSocketChannel.class){

        @Override
        protected IoHandlerFactory b() {
            return NioIoHandler.newFactory();
        }
    };
    private static final axw b = new axw("Epoll", EpollSocketChannel.class, EpollServerSocketChannel.class){

        @Override
        protected IoHandlerFactory b() {
            return EpollIoHandler.newFactory();
        }
    };
    private static final axw c = new axw("Kqueue", KQueueSocketChannel.class, KQueueServerSocketChannel.class){

        @Override
        protected IoHandlerFactory b() {
            return KQueueIoHandler.newFactory();
        }
    };
    private static final axw d = new axw("Local", LocalChannel.class, LocalServerChannel.class){

        @Override
        protected IoHandlerFactory b() {
            return LocalIoHandler.newFactory();
        }
    };
    private final String e;
    private final Class<? extends Channel> f;
    private final Class<? extends ServerChannel> g;
    private volatile @Nullable EventLoopGroup h;

    public static axw a(boolean $$0) {
        if ($$0) {
            if (KQueue.isAvailable()) {
                return c;
            }
            if (Epoll.isAvailable()) {
                return b;
            }
        }
        return a;
    }

    public static axw a() {
        return d;
    }

    axw(String $$0, Class<? extends Channel> $$1, Class<? extends ServerChannel> $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    private ThreadFactory f() {
        return new ThreadFactoryBuilder().setNameFormat("Netty " + this.e + " IO #%d").setDaemon(true).build();
    }

    protected abstract IoHandlerFactory b();

    private EventLoopGroup g() {
        return new MultiThreadIoEventLoopGroup(this.f(), this.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public EventLoopGroup c() {
        EventLoopGroup $$0 = this.h;
        if ($$0 == null) {
            axw axw2 = this;
            synchronized (axw2) {
                $$0 = this.h;
                if ($$0 == null) {
                    this.h = $$0 = this.g();
                }
            }
        }
        return $$0;
    }

    public Class<? extends Channel> d() {
        return this.f;
    }

    public Class<? extends ServerChannel> e() {
        return this.g;
    }
}

