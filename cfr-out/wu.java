/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelOutboundHandler
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.ChannelPromise
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.handler.flow.FlowControlHandler
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class wu
extends SimpleChannelInboundHandler<aay<?>> {
    private static final float e = 0.75f;
    private static final Logger f = LogUtils.getLogger();
    public static final Marker a = MarkerFactory.getMarker((String)"NETWORK");
    public static final Marker b = bhs.a(MarkerFactory.getMarker((String)"NETWORK_PACKETS"), (? super T $$0) -> $$0.add(a));
    public static final Marker c = bhs.a(MarkerFactory.getMarker((String)"PACKET_RECEIVED"), (? super T $$0) -> $$0.add(b));
    public static final Marker d = bhs.a(MarkerFactory.getMarker((String)"PACKET_SENT"), (? super T $$0) -> $$0.add(b));
    private static final xn<akm> g = akl.b;
    private final aaz h;
    private volatile boolean i = true;
    private final Queue<Consumer<wu>> j = Queues.newConcurrentLinkedQueue();
    private Channel k;
    private SocketAddress l;
    private volatile @Nullable xk m;
    private volatile @Nullable xk n;
    private @Nullable ww o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private boolean w;
    private volatile @Nullable ww x;
    @Nullable wn y;

    public wu(aaz $$0) {
        this.h = $$0;
    }

    public void channelActive(ChannelHandlerContext $$0) throws Exception {
        super.channelActive($$0);
        this.k = $$0.channel();
        this.l = this.k.remoteAddress();
        if (this.x != null) {
            this.a(this.x);
        }
    }

    public void channelInactive(ChannelHandlerContext $$0) {
        this.a(yh.c("disconnect.endOfStream"));
    }

    public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
        if ($$1 instanceof xu) {
            f.debug("Skipping packet due to errors", $$1.getCause());
            return;
        }
        boolean $$2 = !this.w;
        this.w = true;
        if (!this.k.isOpen()) {
            return;
        }
        if ($$1 instanceof TimeoutException) {
            f.debug("Timeout", $$1);
            this.a(yh.c("disconnect.timeout"));
        } else {
            ww $$6;
            yw $$3 = yh.a("disconnect.genericReason", new Object[]{"Internal Exception: " + String.valueOf($$1)});
            xk $$4 = this.n;
            if ($$4 != null) {
                ww $$5 = $$4.a($$3, $$1);
            } else {
                $$6 = new ww($$3);
            }
            if ($$2) {
                f.debug("Failed to sent packet", $$1);
                if (this.g() == aaz.b) {
                    Record $$7 = this.i ? new aks($$3) : new abk($$3);
                    this.a((aay<?>)((Object)$$7), xm.a(() -> this.a($$6)));
                } else {
                    this.a($$6);
                }
                this.m();
            } else {
                f.debug("Double fault", $$1);
                this.a($$6);
            }
        }
    }

    protected void a(ChannelHandlerContext $$0, aay<?> $$1) {
        if (!this.k.isOpen()) {
            return;
        }
        xk $$2 = this.n;
        if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
        }
        if ($$2.a($$1)) {
            try {
                wu.a($$1, $$2);
            }
            catch (anf anf2) {
            }
            catch (RejectedExecutionException $$3) {
                this.a(yh.c("multiplayer.disconnect.server_shutdown"));
            }
            catch (ClassCastException $$4) {
                f.error("Received {} that couldn't be processed", $$1.getClass(), (Object)$$4);
                this.a(yh.c("multiplayer.disconnect.invalid_packet"));
            }
            ++this.r;
        }
    }

    private static <T extends xk> void a(aay<T> $$0, xk $$1) {
        $$0.a($$1);
    }

    private void b(xn<?> $$0, xk $$1) {
        Objects.requireNonNull($$1, "packetListener");
        aaz $$2 = $$1.N_();
        if ($$2 != this.h) {
            throw new IllegalStateException("Trying to set listener for wrong side: connection is " + String.valueOf((Object)this.h) + ", but listener is " + String.valueOf((Object)$$2));
        }
        wv $$3 = $$1.b();
        if ($$0.a() != $$3) {
            throw new IllegalStateException("Listener protocol (" + String.valueOf((Object)$$3) + ") does not match requested one " + String.valueOf($$0));
        }
    }

    private static void a(ChannelFuture $$0) {
        try {
            $$0.syncUninterruptibly();
        }
        catch (Exception $$1) {
            if ($$1 instanceof ClosedChannelException) {
                f.info("Connection closed during protocol change");
                return;
            }
            throw $$1;
        }
    }

    public <T extends xk> void a(xn<T> $$0, T $$12) {
        this.b($$0, $$12);
        if ($$0.b() != this.f()) {
            throw new IllegalStateException("Invalid inbound protocol: " + String.valueOf((Object)$$0.a()));
        }
        this.n = $$12;
        this.m = null;
        xw.b $$2 = xw.a($$0);
        aaw $$3 = $$0.d();
        if ($$3 != null) {
            xg $$4 = new xg($$3);
            $$2 = $$2.andThen($$1 -> $$1.pipeline().addAfter("decoder", "bundler", (ChannelHandler)$$4));
        }
        wu.a(this.k.writeAndFlush((Object)$$2));
    }

    public void a(xn<?> $$0) {
        if ($$0.b() != this.g()) {
            throw new IllegalStateException("Invalid outbound protocol: " + String.valueOf((Object)$$0.a()));
        }
        xw.d $$12 = xw.b($$0);
        aaw $$2 = $$0.d();
        if ($$2 != null) {
            xh $$3 = new xh($$2);
            $$12 = $$12.andThen($$1 -> $$1.pipeline().addAfter("encoder", "unbundler", (ChannelHandler)$$3));
        }
        boolean $$4 = $$0.a() == wv.d;
        wu.a(this.k.writeAndFlush((Object)$$12.andThen($$1 -> {
            this.i = $$4;
        })));
    }

    public void a(xk $$0) {
        if (this.n != null) {
            throw new IllegalStateException("Listener already set");
        }
        if (this.h != aaz.a || $$0.N_() != aaz.a || $$0.b() != g.a()) {
            throw new IllegalStateException("Invalid initial listener");
        }
        this.n = $$0;
    }

    public void a(String $$0, int $$1, alo $$2) {
        this.a($$0, $$1, alu.b, alu.d, $$2, aki.a);
    }

    public void a(String $$0, int $$1, ako $$2) {
        this.a($$0, $$1, akv.b, akv.d, $$2, aki.b);
    }

    public <S extends xr, C extends wr> void a(String $$0, int $$1, xn<S> $$2, xn<C> $$3, C $$4, boolean $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5 ? aki.c : aki.b);
    }

    private <S extends xr, C extends wr> void a(String $$0, int $$1, xn<S> $$2, xn<C> $$3, C $$4, aki $$5) {
        if ($$2.a() != $$3.a()) {
            throw new IllegalStateException("Mismatched initial protocols");
        }
        this.m = $$4;
        this.a((wu $$6) -> {
            this.a($$3, $$4);
            $$6.b(new akj(w.b().d(), $$0, $$1, $$5), null, true);
            this.a($$2);
        });
    }

    public void a(aay<?> $$0) {
        this.a($$0, null);
    }

    public void a(aay<?> $$0, @Nullable ChannelFutureListener $$1) {
        this.a($$0, $$1, true);
    }

    public void a(aay<?> $$0, @Nullable ChannelFutureListener $$1, boolean $$2) {
        if (this.i()) {
            this.r();
            this.b($$0, $$1, $$2);
        } else {
            this.j.add($$3 -> $$3.b($$0, $$1, $$2));
        }
    }

    public void a(Consumer<wu> $$0) {
        if (this.i()) {
            this.r();
            $$0.accept(this);
        } else {
            this.j.add($$0);
        }
    }

    private void b(aay<?> $$0, @Nullable ChannelFutureListener $$1, boolean $$2) {
        ++this.s;
        if (this.k.eventLoop().inEventLoop()) {
            this.c($$0, $$1, $$2);
        } else {
            this.k.eventLoop().execute(() -> this.c($$0, $$1, $$2));
        }
    }

    private void c(aay<?> $$0, @Nullable ChannelFutureListener $$1, boolean $$2) {
        if ($$1 != null) {
            ChannelFuture $$3 = $$2 ? this.k.writeAndFlush($$0) : this.k.write($$0);
            $$3.addListener((GenericFutureListener)$$1);
        } else if ($$2) {
            this.k.writeAndFlush($$0, this.k.voidPromise());
        } else {
            this.k.write($$0, this.k.voidPromise());
        }
    }

    public void a() {
        if (this.i()) {
            this.q();
        } else {
            this.j.add(wu::q);
        }
    }

    private void q() {
        if (this.k.eventLoop().inEventLoop()) {
            this.k.flush();
        } else {
            this.k.eventLoop().execute(() -> this.k.flush());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void r() {
        if (this.k == null || !this.k.isOpen()) {
            return;
        }
        Queue<Consumer<wu>> queue = this.j;
        synchronized (queue) {
            Consumer<wu> $$0;
            while (($$0 = this.j.poll()) != null) {
                $$0.accept(this);
            }
        }
    }

    public void b() {
        this.r();
        xk xk2 = this.n;
        if (xk2 instanceof xv) {
            xv $$0 = (xv)xk2;
            $$0.d();
        }
        if (!this.i() && !this.q) {
            this.n();
        }
        if (this.k != null) {
            this.k.flush();
        }
        if (this.v++ % 20 == 0) {
            this.c();
        }
        if (this.y != null) {
            this.y.a();
        }
    }

    protected void c() {
        this.u = bgj.h(0.75f, this.s, this.u);
        this.t = bgj.h(0.75f, this.r, this.t);
        this.s = 0;
        this.r = 0;
    }

    public SocketAddress d() {
        return this.l;
    }

    public String a(boolean $$0) {
        if (this.l == null) {
            return "local";
        }
        if ($$0) {
            return this.l.toString();
        }
        return "IP hidden";
    }

    public void a(yh $$0) {
        this.a(new ww($$0));
    }

    public void a(ww $$0) {
        if (this.k == null) {
            this.x = $$0;
        }
        if (this.i()) {
            this.k.close().awaitUninterruptibly();
            this.o = $$0;
        }
    }

    public boolean e() {
        return this.k instanceof LocalChannel || this.k instanceof LocalServerChannel;
    }

    public aaz f() {
        return this.h;
    }

    public aaz g() {
        return this.h.a();
    }

    public static wu a(InetSocketAddress $$0, axw $$1, @Nullable bxn $$2) {
        wu $$3 = new wu(aaz.b);
        if ($$2 != null) {
            $$3.a($$2);
        }
        ChannelFuture $$4 = wu.a($$0, $$1, $$3);
        $$4.syncUninterruptibly();
        return $$3;
    }

    public static ChannelFuture a(InetSocketAddress $$0, axw $$1, final wu $$2) {
        return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$1.c())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$0) {
                try {
                    $$0.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30));
                wu.a($$1, aaz.b, false, $$2.y);
                $$2.a($$1);
            }
        })).channel($$1.d())).connect($$0.getAddress(), $$0.getPort());
    }

    private static String b(boolean $$0) {
        return $$0 ? "encoder" : "outbound_config";
    }

    private static String c(boolean $$0) {
        return $$0 ? "decoder" : "inbound_config";
    }

    public void a(ChannelPipeline $$0) {
        $$0.addLast("hackfix", (ChannelHandler)new ChannelOutboundHandlerAdapter(this){

            public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
                super.write($$0, $$1, $$2);
            }
        }).addLast("packet_handler", (ChannelHandler)this);
    }

    public static void a(ChannelPipeline $$0, aaz $$1, boolean $$2, @Nullable wn $$3) {
        aaz $$4 = $$1.a();
        boolean $$5 = $$1 == aaz.a;
        boolean $$6 = $$4 == aaz.a;
        $$0.addLast("splitter", (ChannelHandler)wu.a($$3, $$2)).addLast(new ChannelHandler[]{new FlowControlHandler()}).addLast(wu.c($$5), $$5 ? new xi<akm>(g) : new xw.a()).addLast("prepender", (ChannelHandler)wu.d($$2)).addLast(wu.b($$6), $$6 ? new xj<akm>(g) : new xw.c());
    }

    private static ChannelOutboundHandler d(boolean $$0) {
        return $$0 ? new xd() : new yb();
    }

    private static ChannelInboundHandler a(@Nullable wn $$0, boolean $$1) {
        if (!$$1) {
            return new ya($$0);
        }
        if ($$0 != null) {
            return new xf($$0);
        }
        return new xc();
    }

    public static void a(ChannelPipeline $$0, aaz $$1) {
        wu.a($$0, $$1, true, null);
    }

    public static wu a(SocketAddress $$0) {
        final wu $$1 = new wu(aaz.b);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(axw.a().c())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$0) {
                ChannelPipeline $$12 = $$0.pipeline();
                wu.a($$12, aaz.b);
                $$1.a($$12);
            }
        })).channel(axw.a().d())).connect($$0).syncUninterruptibly();
        return $$1;
    }

    public void a(Cipher $$0, Cipher $$1) {
        this.p = true;
        this.k.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new wp($$0));
        this.k.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new wq($$1));
    }

    public boolean h() {
        return this.p;
    }

    public boolean i() {
        return this.k != null && this.k.isOpen();
    }

    public boolean j() {
        return this.k == null;
    }

    public @Nullable xk k() {
        return this.n;
    }

    public @Nullable ww l() {
        return this.o;
    }

    public void m() {
        if (this.k != null) {
            this.k.config().setAutoRead(false);
        }
    }

    public void a(int $$0, boolean $$1) {
        if ($$0 >= 0) {
            ChannelHandler channelHandler = this.k.pipeline().get("decompress");
            if (channelHandler instanceof ws) {
                ws $$2 = (ws)channelHandler;
                $$2.a($$0, $$1);
            } else {
                this.k.pipeline().addAfter("splitter", "decompress", (ChannelHandler)new ws($$0, $$1));
            }
            channelHandler = this.k.pipeline().get("compress");
            if (channelHandler instanceof wt) {
                wt $$3 = (wt)channelHandler;
                $$3.a($$0);
            } else {
                this.k.pipeline().addAfter("prepender", "compress", (ChannelHandler)new wt($$0));
            }
        } else {
            if (this.k.pipeline().get("decompress") instanceof ws) {
                this.k.pipeline().remove("decompress");
            }
            if (this.k.pipeline().get("compress") instanceof wt) {
                this.k.pipeline().remove("compress");
            }
        }
    }

    public void n() {
        xk $$1;
        if (this.k == null || this.k.isOpen()) {
            return;
        }
        if (this.q) {
            f.warn("handleDisconnection() called twice");
            return;
        }
        this.q = true;
        xk $$0 = this.k();
        xk xk2 = $$1 = $$0 != null ? $$0 : this.m;
        if ($$1 != null) {
            ww $$2 = Objects.requireNonNullElseGet(this.l(), () -> new ww(yh.c("multiplayer.disconnect.generic")));
            $$1.a($$2);
        }
    }

    public float o() {
        return this.t;
    }

    public float p() {
        return this.u;
    }

    public void a(bxn $$0) {
        this.y = new wn($$0);
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.a(channelHandlerContext, (aay)object);
    }
}

