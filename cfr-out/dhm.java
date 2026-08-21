/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dhm
extends din {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    private static final Logger u = LogUtils.getLogger();
    private static final boolean v = false;
    public static final int p = 50;
    private int w;
    private @Nullable String x;
    private final did y = did.a();
    private boolean z = false;
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 1;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 1;
    private static final int G = 1;
    private static final int H = 27;
    private static final int I = 76;
    private static final int J = 134;
    private static final int K = 47;

    public dhm(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public dhm(int $$0, ddl $$1, dhw $$2) {
        super(dis.i, $$0, $$1, $$2, dhm.o());
        this.a(this.y);
    }

    private static dio o() {
        return dio.a().a(0, 27, 47, (dlt $$0) -> true).a(1, 76, 47, (dlt $$0) -> true).a(2, 134, 47).a();
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.a(bdp.K);
    }

    @Override
    protected boolean a(ddm $$0, boolean $$1) {
        return ($$0.gv() || $$0.cs >= this.y.b()) && this.y.b() > 0;
    }

    @Override
    protected void a(ddm $$0, dlt $$12) {
        if (!$$0.gv()) {
            $$0.c(-this.y.b());
        }
        if (this.w > 0) {
            dlt $$22 = this.s.a(1);
            if (!$$22.f() && $$22.N() > this.w) {
                $$22.h(this.w);
                this.s.a(1, $$22);
            } else {
                this.s.a(1, dlt.l);
            }
        } else if (!this.z) {
            this.s.a(1, dlt.l);
        }
        this.y.a(0);
        if ($$0 instanceof axg) {
            axg $$3 = (axg)$$0;
            if (!bhi.h(this.x) && !this.s.a(0).y().getString().equals(this.x)) {
                $$3.Y().a(this.x);
            }
        }
        this.s.a(0, dlt.l);
        this.q.a((dwo $$1, is $$2) -> {
            eoh $$3 = $$1.a_((is)$$2);
            if (!$$0.gv() && $$3.a(bdp.K) && $$0.ep().i() < 0.12f) {
                eoh $$4 = dyq.e($$3);
                if ($$4 == null) {
                    $$1.a((is)$$2, false);
                    $$1.c(1029, (is)$$2, 0);
                } else {
                    $$1.a((is)$$2, $$4, 2);
                    $$1.c(1030, (is)$$2, 0);
                }
            } else {
                $$1.c(1030, (is)$$2, 0);
            }
        });
    }

    @Override
    public void l() {
        dlt $$0 = this.s.a(0);
        this.z = false;
        this.y.a(1);
        int $$1 = 0;
        long $$2 = 0L;
        int $$3 = 0;
        if ($$0.f() || !dsq.a($$0)) {
            this.t.a(0, dlt.l);
            this.y.a(0);
            return;
        }
        dlt $$4 = $$0.v();
        dlt $$5 = this.s.a(1);
        dsu.a $$6 = new dsu.a(dsq.b($$4));
        $$2 += (long)$$0.a(ki.u, Integer.valueOf(0)).intValue() + (long)$$5.a(ki.u, Integer.valueOf(0)).intValue();
        this.w = 0;
        if (!$$5.f()) {
            boolean $$7 = $$5.c(ki.Q);
            if ($$4.m() && $$0.c($$5)) {
                int $$9;
                int $$8 = Math.min($$4.o(), $$4.p() / 4);
                if ($$8 <= 0) {
                    this.t.a(0, dlt.l);
                    this.y.a(0);
                    return;
                }
                for ($$9 = 0; $$8 > 0 && $$9 < $$5.N(); ++$$9) {
                    int $$10 = $$4.o() - $$8;
                    $$4.b($$10);
                    ++$$1;
                    $$8 = Math.min($$4.o(), $$4.p() / 4);
                }
                this.w = $$9;
            } else {
                if (!($$7 || $$4.a($$5.h()) && $$4.m())) {
                    this.t.a(0, dlt.l);
                    this.y.a(0);
                    return;
                }
                if ($$4.m() && !$$7) {
                    int $$11 = $$0.p() - $$0.o();
                    int $$12 = $$5.p() - $$5.o();
                    int $$13 = $$12 + $$4.p() * 12 / 100;
                    int $$14 = $$11 + $$13;
                    int $$15 = $$4.p() - $$14;
                    if ($$15 < 0) {
                        $$15 = 0;
                    }
                    if ($$15 < $$4.o()) {
                        $$4.b($$15);
                        $$1 += 2;
                    }
                }
                dsu $$16 = dsq.b($$5);
                boolean $$17 = false;
                boolean $$18 = false;
                for (Object2IntMap.Entry<jd<dso>> $$19 : $$16.b()) {
                    int $$22;
                    jd $$20 = (jd)$$19.getKey();
                    int $$21 = $$6.a($$20);
                    $$22 = $$21 == ($$22 = $$19.getIntValue()) ? $$22 + 1 : Math.max($$22, $$21);
                    dso $$23 = (dso)$$20.a();
                    boolean $$24 = $$23.c($$0);
                    if (this.r.gv() || $$0.a(dlx.wI)) {
                        $$24 = true;
                    }
                    for (jd<dso> $$25 : $$6.a()) {
                        if ($$25.equals($$20) || dso.a((jd<dso>)$$20, $$25)) continue;
                        $$24 = false;
                        ++$$1;
                    }
                    if (!$$24) {
                        $$18 = true;
                        continue;
                    }
                    $$17 = true;
                    if ($$22 > $$23.e()) {
                        $$22 = $$23.e();
                    }
                    $$6.a($$20, $$22);
                    int $$26 = $$23.c();
                    if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                    }
                    $$1 += $$26 * $$22;
                    if ($$0.N() <= 1) continue;
                    $$1 = 40;
                }
                if ($$18 && !$$17) {
                    this.t.a(0, dlt.l);
                    this.y.a(0);
                    return;
                }
            }
        }
        if (this.x == null || bhi.h(this.x)) {
            if ($$0.c(ki.h)) {
                $$3 = 1;
                $$1 += $$3;
                $$4.e(ki.h);
            }
        } else if (!this.x.equals($$0.y().getString())) {
            $$3 = 1;
            $$1 += $$3;
            $$4.b(ki.h, yh.b(this.x));
        }
        int $$27 = $$1 <= 0 ? 0 : (int)bgj.a($$2 + (long)$$1, 0L, Integer.MAX_VALUE);
        this.y.a($$27);
        if ($$1 <= 0) {
            $$4 = dlt.l;
        }
        if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
                this.y.a(39);
            }
            this.z = true;
        }
        if (this.y.b() >= 40 && !this.r.gv()) {
            $$4 = dlt.l;
        }
        if (!$$4.f()) {
            int $$28 = $$4.a(ki.u, Integer.valueOf(0));
            if ($$28 < $$5.a(ki.u, Integer.valueOf(0))) {
                $$28 = $$5.a(ki.u, Integer.valueOf(0));
            }
            if ($$3 != $$1 || $$3 == 0) {
                $$28 = dhm.e($$28);
            }
            $$4.b(ki.u, Integer.valueOf($$28));
            dsq.a($$4, $$6.b());
        }
        this.t.a(0, $$4);
        this.d();
    }

    public static int e(int $$0) {
        return (int)Math.min((long)$$0 * 2L + 1L, Integer.MAX_VALUE);
    }

    public boolean a(String $$0) {
        String $$1 = dhm.b($$0);
        if ($$1 == null || $$1.equals(this.x)) {
            return false;
        }
        this.x = $$1;
        if (this.b(2).h()) {
            dlt $$2 = this.b(2).g();
            if (bhi.h($$1)) {
                $$2.e(ki.h);
            } else {
                $$2.b(ki.h, yh.b($$1));
            }
        }
        this.l();
        return true;
    }

    private static @Nullable String b(String $$0) {
        String $$1 = bhi.g($$0);
        if ($$1.length() <= 50) {
            return $$1;
        }
        return null;
    }

    public int m() {
        return this.y.b();
    }
}
