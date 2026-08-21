/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.jspecify.annotations.Nullable;

public class gdd
extends isc
implements gan {
    private static final int b = 200;
    private static final int c = 80;
    private static final int F = 95;
    private static final int G = 1;
    private static final String[] H = new String[]{"", ".", ". .", ". . ."};
    private static final yh I = yh.c("mco.upload.verifying");
    private final gcz J;
    private final fnj K;
    private final @Nullable gej L;
    private final long M;
    private final int N;
    final AtomicReference<@Nullable gam> a = new AtomicReference();
    private final gad O;
    private final RateLimiter P;
    private volatile yh @Nullable [] Q;
    private volatile yh R = yh.c("mco.upload.preparing");
    private volatile @Nullable String S;
    private volatile boolean T;
    private volatile boolean U;
    private volatile boolean V = true;
    private volatile boolean W;
    private @Nullable gje X;
    private @Nullable gje Y;
    private int Z;
    private final gou aa = new gou(this);

    public gdd(@Nullable gej $$0, long $$1, int $$2, gcz $$3, fnj $$4) {
        super(gfa.a);
        this.L = $$0;
        this.M = $$1;
        this.N = $$2;
        this.J = $$3;
        this.K = $$4;
        this.O = new gad();
        this.P = RateLimiter.create((double)0.1f);
    }

    @Override
    public void bg_() {
        this.X = this.aa.b(gje.a(yg.k, (gje $$0) -> this.o()).a());
        this.X.l = false;
        this.Y = this.aa.b(gje.a(yg.e, (gje $$0) -> this.I()).a());
        if (!this.W) {
            if (this.J.b == -1) {
                this.W = true;
                this.K();
            } else {
                ArrayList<geh> $$02 = new ArrayList<geh>();
                if (this.L != null) {
                    $$02.add(this.L);
                }
                $$02.add(new geo(this.M, this.J.b, () -> {
                    if (!this.W) {
                        this.W = true;
                        this.n.execute(() -> {
                            this.n.a(this);
                            this.K();
                        });
                    }
                }));
                this.n.a(new gcu(this.J, $$02.toArray(new geh[0])));
            }
        }
        this.aa.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.aa.a();
    }

    private void o() {
        this.n.a(new gdi(new fzu(new gsd()), this.M));
    }

    private void I() {
        this.T = true;
        gam $$0 = this.a.get();
        if ($$0 != null) {
            $$0.b();
        } else {
            this.n.a(this.J);
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.t() == 256) {
            if (this.V) {
                this.I();
            } else {
                this.o();
            }
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        yh[] $$4;
        super.a($$0, $$1, $$2, $$3);
        if (!this.U && this.O.d() && this.O.e() && this.Y != null) {
            this.R = I;
            this.Y.k = false;
        }
        $$0.a(this.q, this.R, this.o / 2, 50, -1);
        if (this.V) {
            $$0.b(this.q, H[this.Z / 10 % H.length], this.o / 2 + this.q.a(this.R) / 2 + 5, 50, -1);
        }
        if (this.O.d() && !this.T) {
            this.d($$0);
            this.e($$0);
        }
        if (($$4 = this.Q) != null) {
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                $$0.a(this.q, $$4[$$5], this.o / 2, 110 + 12 * $$5, -65536);
            }
        }
    }

    private void d(gir $$0) {
        double $$1 = this.O.f();
        this.S = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
        int $$2 = (this.o - 200) / 2;
        int $$3 = $$2 + (int)Math.round(200.0 * $$1);
        $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
        $$0.a($$2, 80, $$3, 95, -8355712);
        $$0.a(this.q, (yh)yh.a("mco.upload.percent", new Object[]{this.S}), this.o / 2, 84, -1);
    }

    private void e(gir $$0) {
        this.a($$0, this.O.h());
    }

    private void a(gir $$0, long $$1) {
        String $$2 = this.S;
        if ($$1 > 0L && $$2 != null) {
            int $$3 = this.q.b($$2);
            String $$4 = "(" + fzv.b($$1) + "/s)";
            $$0.b(this.q, $$4, this.o / 2 + $$3 / 2 + 15, 84, -1);
        }
    }

    @Override
    public void e() {
        super.e();
        ++this.Z;
        this.O.g();
        if (this.P.tryAcquire(1)) {
            yh $$0 = this.J();
            this.n.aZ().d($$0);
        }
    }

    private yh J() {
        yh[] $$1;
        ArrayList $$0 = Lists.newArrayList();
        $$0.add(this.R);
        if (this.S != null) {
            $$0.add(yh.a("mco.upload.percent", new Object[]{this.S}));
        }
        if (($$1 = this.Q) != null) {
            $$0.addAll(Arrays.asList($$1));
        }
        return yg.a($$0);
    }

    private void K() {
        gbn $$12;
        gbk $$2;
        Path $$02 = this.n.p.toPath().resolve("saves").resolve(this.K.a());
        gam $$3 = new gam($$02, $$2 = new gbk(this.N, $$12 = gbn.a(this.K.g(), this.K.l().c()), List.of(gbj.a(this.K.g().c()))), this.n.ac(), this.M, this);
        if (!this.a.compareAndSet(null, $$3)) {
            throw new IllegalStateException("Tried to start uploading but was already uploading");
        }
        $$3.a().handleAsync(($$0, $$1) -> {
            if ($$1 != null) {
                if ($$1 instanceof CompletionException) {
                    CompletionException $$2 = (CompletionException)$$1;
                    $$1 = $$2.getCause();
                }
                if ($$1 instanceof gah) {
                    gah $$3 = (gah)$$1;
                    if ($$3.a() != null) {
                        this.R = $$3.a();
                    }
                    this.a($$3.b());
                } else {
                    this.R = yh.a("mco.upload.failed", new Object[]{$$1.getMessage()});
                }
            } else {
                this.R = yh.c("mco.upload.done");
                if (this.X != null) {
                    this.X.a_(yg.d);
                }
            }
            this.U = true;
            this.V = false;
            if (this.X != null) {
                this.X.l = true;
            }
            if (this.Y != null) {
                this.Y.l = false;
            }
            this.a.set(null);
            return null;
        }, (Executor)this.n);
    }

    private void a(yh ... $$0) {
        this.Q = $$0;
    }

    @Override
    public gad b() {
        return this.O;
    }

    @Override
    public void d() {
        this.R = yh.a("mco.upload.uploading", new Object[]{this.K.b()});
    }
}

