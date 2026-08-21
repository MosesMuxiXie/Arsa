/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gcr
extends isc {
    private static final Logger a = LogUtils.getLogger();
    private static final ReentrantLock b = new ReentrantLock();
    private static final int c = 200;
    private static final int F = 80;
    private static final int G = 95;
    private static final int H = 1;
    private final gsb I;
    private final gby J;
    private final yh K;
    private final RateLimiter L;
    private gje M;
    private final String N;
    private final a O;
    private volatile @Nullable yh P;
    private volatile yh Q = yh.c("mco.download.preparing");
    private volatile @Nullable String R;
    private volatile boolean S;
    private volatile boolean T = true;
    private volatile boolean U;
    private volatile boolean V;
    private @Nullable Long W;
    private @Nullable Long X;
    private long Y;
    private int Z;
    private static final String[] aa = new String[]{"", ".", ". .", ". . ."};
    private int ab;
    private boolean ac;
    private final BooleanConsumer ad;

    public gcr(gsb $$0, gby $$1, String $$2, BooleanConsumer $$3) {
        super(gfa.a);
        this.ad = $$3;
        this.I = $$0;
        this.N = $$2;
        this.J = $$1;
        this.O = new a();
        this.K = yh.c("mco.download.title");
        this.L = RateLimiter.create((double)0.1f);
    }

    @Override
    public void bg_() {
        this.M = this.c(gje.a(yg.e, (gje $$0) -> this.aX_()).a((this.o - 200) / 2, this.p - 42, 200, 20).a());
        this.o();
    }

    private void o() {
        if (this.U || this.ac) {
            return;
        }
        this.ac = true;
        if (this.a(this.J.a()) >= 0x140000000L) {
            yw $$02 = yh.a("mco.download.confirmation.oversized", new Object[]{fzv.b(0x140000000L)});
            this.n.a(gcy.c(this, $$02, $$0 -> {
                this.n.a(this);
                this.J();
            }));
        } else {
            this.J();
        }
    }

    private long a(String $$0) {
        return fzw.a($$0).orElse(0L);
    }

    @Override
    public void e() {
        super.e();
        ++this.Z;
        if (this.Q != null && this.L.tryAcquire(1)) {
            yh $$0 = this.I();
            this.n.aZ().d($$0);
        }
    }

    private yh I() {
        ArrayList $$0 = Lists.newArrayList();
        $$0.add(this.K);
        $$0.add(this.Q);
        if (this.R != null) {
            $$0.add(yh.a("mco.download.percent", new Object[]{this.R}));
            $$0.add(yh.a("mco.download.speed.narration", new Object[]{fzv.b(this.Y)}));
        }
        if (this.P != null) {
            $$0.add(this.P);
        }
        return yg.a($$0);
    }

    @Override
    public void aX_() {
        this.S = true;
        if (this.U && this.ad != null && this.P == null) {
            this.ad.accept(true);
        }
        this.n.a(this.I);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.K, this.o / 2, 20, -1);
        $$0.a(this.q, this.Q, this.o / 2, 50, -1);
        if (this.T) {
            this.d($$0);
        }
        if (this.O.a != 0L && !this.S) {
            this.e($$0);
            this.f($$0);
        }
        if (this.P != null) {
            $$0.a(this.q, this.P, this.o / 2, 110, -65536);
        }
    }

    private void d(gir $$0) {
        int $$1 = this.q.a(this.Q);
        if (this.Z != 0 && this.Z % 10 == 0) {
            ++this.ab;
        }
        $$0.b(this.q, aa[this.ab % aa.length], this.o / 2 + $$1 / 2 + 5, 50, -1);
    }

    private void e(gir $$0) {
        double $$1 = Math.min((double)this.O.a / (double)this.O.b, 1.0);
        this.R = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
        int $$2 = (this.o - 200) / 2;
        int $$3 = $$2 + (int)Math.round(200.0 * $$1);
        $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
        $$0.a($$2, 80, $$3, 95, -8355712);
        $$0.a(this.q, (yh)yh.a("mco.download.percent", new Object[]{this.R}), this.o / 2, 84, -1);
    }

    private void f(gir $$0) {
        if (this.Z % 20 == 0) {
            if (this.W != null) {
                long $$1 = bhs.c() - this.X;
                if ($$1 == 0L) {
                    $$1 = 1L;
                }
                this.Y = 1000L * (this.O.a - this.W) / $$1;
                this.a($$0, this.Y);
            }
            this.W = this.O.a;
            this.X = bhs.c();
        } else {
            this.a($$0, this.Y);
        }
    }

    private void a(gir $$0, long $$1) {
        if ($$1 > 0L) {
            int $$2 = this.q.b(this.R);
            $$0.b(this.q, yh.a("mco.download.speed", new Object[]{fzv.b($$1)}), this.o / 2 + $$2 / 2 + 15, 84, -1);
        }
    }

    private void J() {
        new Thread(() -> {
            try {
                if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                    this.Q = yh.c("mco.download.failed");
                    return;
                }
                if (this.S) {
                    this.K();
                    return;
                }
                this.Q = yh.a("mco.download.downloading", new Object[]{this.N});
                fzw $$0 = new fzw();
                $$0.a(this.J, this.N, this.O, this.n.q());
                while (!$$0.b()) {
                    if ($$0.c()) {
                        $$0.a();
                        this.P = yh.c("mco.download.failed");
                        this.M.a_(yg.d);
                        return;
                    }
                    if ($$0.d()) {
                        if (!this.V) {
                            this.Q = yh.c("mco.download.extracting");
                        }
                        this.V = true;
                    }
                    if (this.S) {
                        $$0.a();
                        this.K();
                        return;
                    }
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException $$1) {
                        a.error("Failed to check Realms backup download status");
                    }
                }
                this.U = true;
                this.Q = yh.c("mco.download.done");
                this.M.a_(yg.d);
            }
            catch (InterruptedException $$2) {
                a.error("Could not acquire upload lock");
            }
            catch (Exception $$3) {
                this.P = yh.c("mco.download.failed");
                a.info("Exception while downloading world", (Throwable)$$3);
            }
            finally {
                if (!b.isHeldByCurrentThread()) {
                    return;
                }
                b.unlock();
                this.T = false;
                this.U = true;
            }
        }).start();
    }

    private void K() {
        this.Q = yh.c("mco.download.cancelled");
    }

    public static class a {
        public volatile long a;
        public volatile long b;
    }
}

