/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class cga
extends cgk
implements cik {
    private static final int e = 5;
    private static final alw<Float> f = ama.a(cga.class, aly.d);
    private static final alw<Boolean> g = ama.a(cga.class, aly.k);
    private static final alw<lw> h = ama.a(cga.class, aly.l);
    private static final float i = 32.0f;
    private static final int j = 0;
    private static final int k = 0;
    private static final float l = 0.0f;
    private static final float m = 0.0f;
    private static final float n = 1.0f;
    private static final float o = 0.5f;
    private static final float p = 3.0f;
    public static final float a = 6.0f;
    public static final float b = 0.5f;
    public static final int c = -1;
    public static final int d = 600;
    private static final int q = 20;
    private static final int r = 20;
    private static final lq s = lq.a(ly.v, -1);
    private @Nullable lw t;
    private dnr u = dnr.a;
    private float aN = 1.0f;
    private final Map<cgk, Integer> aO = Maps.newHashMap();
    private int aP = -1;
    private int aQ = 20;
    private int aR = 20;
    private int aS = 0;
    private float aT = 0.0f;
    private float aU = 0.0f;
    private @Nullable cgr<chl> aV;

    public cga(cgu<? extends cga> $$0, dwo $$1) {
        super($$0, $$1);
        this.ar = true;
    }

    public cga(dwo $$0, double $$1, double $$2, double $$3) {
        this((cgu<? extends cga>)cgu.f, $$0);
        this.a_($$1, $$2, $$3);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(f, Float.valueOf(3.0f));
        $$0.a(g, false);
        $$0.a(h, s);
    }

    public void a(float $$0) {
        if (!this.ao().B_()) {
            this.aD().a(f, Float.valueOf(bgj.a($$0, 0.0f, 32.0f)));
        }
    }

    @Override
    public void j_() {
        double $$0 = this.dP();
        double $$1 = this.dR();
        double $$2 = this.dV();
        super.j_();
        this.a_($$0, $$1, $$2);
    }

    public float c() {
        return this.aD().a(f).floatValue();
    }

    public void a(dnr $$0) {
        this.u = $$0;
        this.q();
    }

    public void a(@Nullable lw $$0) {
        this.t = $$0;
        this.q();
    }

    public void b(float $$0) {
        this.aN = $$0;
    }

    private void q() {
        if (this.t != null) {
            this.az.a(h, this.t);
        } else {
            int $$0 = bel.g(this.u.b());
            this.az.a(h, lq.a(s.a(), $$0));
        }
    }

    public void a(cfm $$0) {
        this.a(this.u.a($$0));
    }

    public lw e() {
        return this.aD().a(h);
    }

    protected void a(boolean $$0) {
        this.aD().a(g, $$0);
    }

    public boolean f() {
        return this.aD().a(g);
    }

    public int h() {
        return this.aP;
    }

    public void a(int $$0) {
        this.aP = $$0;
    }

    @Override
    public void g() {
        super.g();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            this.a($$0);
        } else {
            this.r();
        }
    }

    private void r() {
        float $$6;
        int $$5;
        boolean $$0 = this.f();
        float $$1 = this.c();
        if ($$0 && this.as.h()) {
            return;
        }
        lw $$2 = this.e();
        if ($$0) {
            int $$3 = 2;
            float $$4 = 0.2f;
        } else {
            $$5 = bgj.d((float)Math.PI * $$1 * $$1);
            $$6 = $$1;
        }
        for (int $$7 = 0; $$7 < $$5; ++$$7) {
            float $$8 = this.as.i() * ((float)Math.PI * 2);
            float $$9 = bgj.a(this.as.i()) * $$6;
            double $$10 = this.dP() + (double)(bgj.b((double)$$8) * $$9);
            double $$11 = this.dR();
            double $$12 = this.dV() + (double)(bgj.a((double)$$8) * $$9);
            if ($$2.a() == ly.v) {
                if ($$0 && this.as.h()) {
                    this.ao().b(s, $$10, $$11, $$12, 0.0, 0.0, 0.0);
                    continue;
                }
                this.ao().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
                continue;
            }
            if ($$0) {
                this.ao().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
                continue;
            }
            this.ao().b($$2, $$10, $$11, $$12, (0.5 - this.as.j()) * 0.15, 0.01f, (0.5 - this.as.j()) * 0.15);
        }
    }

    private void a(axf $$02) {
        boolean $$2;
        if (this.aP != -1 && this.at - this.aQ >= this.aP) {
            this.aC();
            return;
        }
        boolean $$1 = this.f();
        boolean bl2 = $$2 = this.at < this.aQ;
        if ($$1 != $$2) {
            this.a($$2);
        }
        if ($$2) {
            return;
        }
        float $$3 = this.c();
        if (this.aU != 0.0f) {
            if (($$3 += this.aU) < 0.5f) {
                this.aC();
                return;
            }
            this.a($$3);
        }
        if (this.at % 5 == 0) {
            this.aO.entrySet().removeIf($$0 -> this.at >= (Integer)$$0.getValue());
            if (!this.u.c()) {
                this.aO.clear();
            } else {
                ArrayList $$4 = new ArrayList();
                this.u.a($$4::add, this.aN);
                List<chl> $$5 = this.ao().a(chl.class, this.dj());
                if (!$$5.isEmpty()) {
                    for (chl $$6 : $$5) {
                        double $$8;
                        double $$7;
                        double $$9;
                        if (this.aO.containsKey($$6) || !$$6.gl()) continue;
                        if ($$4.stream().noneMatch($$6::b) || !(($$9 = ($$7 = $$6.dP() - this.dP()) * $$7 + ($$8 = $$6.dV() - this.dV()) * $$8) <= (double)($$3 * $$3))) continue;
                        this.aO.put($$6, this.at + this.aR);
                        for (cfm $$10 : $$4) {
                            if ($$10.c().a().a()) {
                                $$10.c().a().a($$02, this, this.n(), $$6, $$10.e(), 0.5);
                                continue;
                            }
                            $$6.b(new cfm($$10), (cgk)this);
                        }
                        if (this.aT != 0.0f) {
                            if (($$3 += this.aT) < 0.5f) {
                                this.aC();
                                return;
                            }
                            this.a($$3);
                        }
                        if (this.aS == 0 || this.aP == -1) continue;
                        this.aP += this.aS;
                        if (this.aP > 0) continue;
                        this.aC();
                        return;
                    }
                }
            }
        }
    }

    public float i() {
        return this.aT;
    }

    public void c(float $$0) {
        this.aT = $$0;
    }

    public float j() {
        return this.aU;
    }

    public void d(float $$0) {
        this.aU = $$0;
    }

    public int k() {
        return this.aS;
    }

    public void b(int $$0) {
        this.aS = $$0;
    }

    public int m() {
        return this.aQ;
    }

    public void d(int $$0) {
        this.aQ = $$0;
    }

    public void a(@Nullable chl $$0) {
        this.aV = cgr.a($$0);
    }

    public @Nullable chl n() {
        return cgr.b(this.aV, this.ao());
    }

    @Override
    protected void a(fnq $$0) {
        this.at = $$0.a("Age", 0);
        this.aP = $$0.a("Duration", -1);
        this.aQ = $$0.a("WaitTime", 20);
        this.aR = $$0.a("ReapplicationDelay", 20);
        this.aS = $$0.a("DurationOnUse", 0);
        this.aT = $$0.a("RadiusOnUse", 0.0f);
        this.aU = $$0.a("RadiusPerTick", 0.0f);
        this.a($$0.a("Radius", 3.0f));
        this.aV = cgr.a($$0, "Owner");
        this.a((lw)$$0.a("custom_particle", ly.bl).orElse(null));
        this.a($$0.a("potion_contents", dnr.c).orElse(dnr.a));
        this.aN = $$0.a("potion_duration_scale", 1.0f);
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("Age", this.at);
        $$0.a("Duration", this.aP);
        $$0.a("WaitTime", this.aQ);
        $$0.a("ReapplicationDelay", this.aR);
        $$0.a("DurationOnUse", this.aS);
        $$0.a("RadiusOnUse", this.aT);
        $$0.a("RadiusPerTick", this.aU);
        $$0.a("Radius", this.c());
        $$0.b("custom_particle", ly.bl, this.t);
        cgr.a(this.aV, $$0, "Owner");
        if (!this.u.equals(dnr.a)) {
            $$0.a("potion_contents", dnr.c, this.u);
        }
        if (this.aN != 1.0f) {
            $$0.a("potion_duration_scale", this.aN);
        }
    }

    @Override
    public void a(alw<?> $$0) {
        if (f.equals($$0)) {
            this.j_();
        }
        super.a($$0);
    }

    @Override
    public flg n_() {
        return flg.d;
    }

    @Override
    public cgn a(chx $$0) {
        return cgn.b(this.c() * 2.0f, 0.5f);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.Y) {
            return cga.c($$0, this.u);
        }
        if ($$0 == ki.Z) {
            return cga.c($$0, Float.valueOf(this.aN));
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.Y);
        this.a($$0, ki.Z);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.Y) {
            this.a(cga.c(ki.Y, $$1));
            return true;
        }
        if ($$0 == ki.Z) {
            this.b(cga.c(ki.Z, $$1).floatValue());
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public /* synthetic */ @Nullable cgk p() {
        return this.n();
    }
}

