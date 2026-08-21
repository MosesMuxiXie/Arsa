/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFuture
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class grb
extends gsb {
    private static final AtomicInteger c = new AtomicInteger(0);
    static final Logger d = LogUtils.getLogger();
    private static final long e = 2000L;
    public static final yh a = yh.c("connect.aborted");
    public static final yh b = yh.a("disconnect.genericReason", yh.c("disconnect.unknownHost"));
    volatile @Nullable wu f;
    @Nullable ChannelFuture t;
    volatile boolean u;
    final gsb v;
    private yh w = yh.c("connect.connecting");
    private long x = -1L;
    final yh y;

    private grb(gsb $$0, yh $$1) {
        super(gfa.a);
        this.v = $$0;
        this.y = $$1;
    }

    public static void a(gsb $$0, gfj $$1, hjw $$2, hit $$3, boolean $$4, @Nullable hix $$5) {
        yh $$8;
        if ($$1.x instanceof grb) {
            d.error("Attempt to connect while already connecting");
            return;
        }
        if ($$5 != null) {
            yh $$6 = yg.s;
        } else if ($$4) {
            yh $$7 = hnp.a;
        } else {
            $$8 = yg.t;
        }
        grb $$9 = new grb($$0, $$8);
        if ($$5 != null) {
            $$9.a(yh.c("connect.transferring"));
        }
        $$1.c(false);
        $$1.aX();
        $$1.a(hjk.a($$3.b));
        $$1.bd().a(hnq.c.b, $$3.b, $$3.a);
        $$1.a($$9);
        $$9.a($$1, $$2, $$3, $$5);
    }

    private void a(final gfj $$0, final hjw $$1, final hit $$2, final @Nullable hix $$3) {
        d.info("Connecting to {}, {}", (Object)$$1.a(), (Object)$$1.b());
        Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             * WARNING - void declaration
             */
            @Override
            public void run() {
                InetSocketAddress $$02 = null;
                try {
                    if (grb.this.u) {
                        return;
                    }
                    Optional<InetSocketAddress> $$12 = hjy.a.a($$1).map(hjv::d);
                    if (grb.this.u) {
                        return;
                    }
                    if ($$12.isEmpty()) {
                        $$0.execute(() -> $$0.a(new grj(grb.this.v, grb.this.y, b)));
                        return;
                    }
                    $$02 = $$12.get();
                    grb grb2 = grb.this;
                    synchronized (grb2) {
                        if (grb.this.u) {
                            return;
                        }
                        wu $$22 = new wu(aaz.b);
                        $$22.a($$0.aT().k());
                        grb.this.t = wu.a($$02, axw.a($$0.k.aU()), $$22);
                    }
                    grb.this.t.syncUninterruptibly();
                    grb2 = grb.this;
                    synchronized (grb2) {
                        void $$32;
                        if (grb.this.u) {
                            $$32.a(a);
                            return;
                        }
                        grb.this.f = $$32;
                        $$0.ak().a((wu)$$32, 1.a($$2.b()));
                    }
                    grb.this.f.a($$02.getHostName(), $$02.getPort(), akv.b, akv.d, new hie(grb.this.f, $$0, $$2, grb.this.v, false, null, grb.this::a, new hin(), $$3), $$3 != null);
                    grb.this.f.a(new aky($$0.ac().c(), $$0.ac().b()));
                }
                catch (Exception $$4) {
                    Exception $$7;
                    if (grb.this.u) {
                        return;
                    }
                    Throwable throwable = $$4.getCause();
                    if (throwable instanceof Exception) {
                        Exception $$5;
                        Exception $$6 = $$5 = (Exception)throwable;
                    } else {
                        $$7 = $$4;
                    }
                    d.error("Couldn't connect to server", (Throwable)$$4);
                    String $$8 = $$02 == null ? $$7.getMessage() : $$7.getMessage().replaceAll($$02.getHostName() + ":" + $$02.getPort(), "").replaceAll($$02.toString(), "");
                    $$0.execute(() -> $$0.a(new grj(grb.this.v, grb.this.y, (yh)yh.a("disconnect.genericReason", new Object[]{$$8}))));
                }
            }

            private static ioq.c a(hit.a $$02) {
                return switch ($$02) {
                    default -> throw new MatchException(null, null);
                    case hit.a.a -> ioq.c.b;
                    case hit.a.b -> ioq.c.c;
                    case hit.a.c -> ioq.c.a;
                };
            }
        };
        $$4.setUncaughtExceptionHandler(new p(d));
        $$4.start();
    }

    private void a(yh $$0) {
        this.w = $$0;
    }

    @Override
    public void e() {
        if (this.f != null) {
            if (this.f.i()) {
                this.f.b();
            } else {
                this.f.n();
            }
        }
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    protected void bg_() {
        this.c(gje.a(yg.e, (gje $$0) -> {
            grb grb2 = this;
            synchronized (grb2) {
                this.u = true;
                if (this.t != null) {
                    this.t.cancel(true);
                    this.t = null;
                }
                if (this.f != null) {
                    this.f.a(a);
                }
            }
            this.n.a(this.v);
        }).a(this.o / 2 - 100, this.p / 4 + 120 + 12, 200, 20).a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        long $$4 = bhs.c();
        if ($$4 - this.x > 2000L) {
            this.x = $$4;
            this.n.aZ().d(yh.c("narrator.joining"));
        }
        $$0.a(this.q, this.w, this.o / 2, this.p / 2 - 50, -1);
    }
}

