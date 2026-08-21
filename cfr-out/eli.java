/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eli
extends elb
implements cct {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 2;
    private static final int c = 4;
    private final jm<dlt> d = jm.a(4, dlt.l);
    private final int[] e = new int[4];
    private final int[] f = new int[4];

    public eli(is $$0, eoh $$1) {
        super(eld.H, $$0, $$1);
    }

    public static void a(axf $$0, is $$1, eoh $$22, eli $$3, dqz.a<drl, dqd> $$4) {
        boolean $$5 = false;
        for (int $$6 = 0; $$6 < $$3.d.size(); ++$$6) {
            drl $$8;
            dlt $$9;
            dlt $$7 = $$3.d.get($$6);
            if ($$7.f()) continue;
            $$5 = true;
            int n2 = $$6;
            $$3.e[n2] = $$3.e[n2] + 1;
            if ($$3.e[$$6] < $$3.f[$$6] || !($$9 = $$4.a($$8 = new drl($$7), $$0).map($$2 -> ((dqd)$$2.b()).a($$8, (jf.a)$$0.J_())).orElse($$7)).a($$0.Q())) continue;
            ccy.a((dwo)$$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$3.d.set($$6, dlt.l);
            $$0.a($$1, $$22, $$22, 3);
            $$0.a(etk.c, $$1, etk.a.a($$22));
        }
        if ($$5) {
            eli.a($$0, $$1, $$22);
        }
    }

    public static void a(dwo $$0, is $$1, eoh $$2, eli $$3) {
        boolean $$4 = false;
        for (int $$5 = 0; $$5 < $$3.d.size(); ++$$5) {
            if ($$3.e[$$5] <= 0) continue;
            $$4 = true;
            $$3.e[$$5] = bgj.a($$3.e[$$5] - 2, 0, $$3.f[$$5]);
        }
        if ($$4) {
            eli.a($$0, $$1, $$2);
        }
    }

    public static void b(dwo $$0, is $$1, eoh $$2, eli $$3) {
        bgr $$4 = $$0.y;
        if ($$4.i() < 0.11f) {
            for (int $$5 = 0; $$5 < $$4.a(2) + 2; ++$$5) {
                eag.a($$0, $$1, $$2.c(eag.c), false);
            }
        }
        int $$6 = $$2.c(eag.e).e();
        for (int $$7 = 0; $$7 < $$3.d.size(); ++$$7) {
            if ($$3.d.get($$7).f() || !($$4.i() < 0.2f)) continue;
            iz $$8 = iz.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125f;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125f) + (double)((float)$$8.h().j() * 0.3125f);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125f) + (double)((float)$$8.h().l() * 0.3125f);
            for (int $$13 = 0; $$13 < 4; ++$$13) {
                $$0.a(ly.ai, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
        }
    }

    public jm<dlt> c() {
        return this.d;
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.d.clear();
        ccw.a($$02, this.d);
        $$02.h("CookingTimes").ifPresentOrElse($$0 -> System.arraycopy($$0, 0, this.e, 0, Math.min(this.f.length, ((int[])$$0).length)), () -> Arrays.fill(this.e, 0));
        $$02.h("CookingTotalTimes").ifPresentOrElse($$0 -> System.arraycopy($$0, 0, this.f, 0, Math.min(this.f.length, ((int[])$$0).length)), () -> Arrays.fill(this.f, 0));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        ccw.a($$0, this.d, true);
        $$0.a("CookingTimes", this.e);
        $$0.a("CookingTotalTimes", this.f);
    }

    public adh d() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        try (bgp.j $$1 = new bgp.j(this.v(), a);){
            fnp $$2 = fnp.a($$1, $$0);
            ccw.a($$2, this.d, true);
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    public boolean a(axf $$0, @Nullable chl $$1, dlt $$2) {
        for (int $$3 = 0; $$3 < this.d.size(); ++$$3) {
            dlt $$4 = this.d.get($$3);
            if (!$$4.f()) continue;
            Optional<dqx<dqd>> $$5 = $$0.x().a(drd.e, new drl($$2), $$0);
            if ($$5.isEmpty()) {
                return false;
            }
            this.f[$$3] = $$5.get().b().d();
            this.e[$$3] = 0;
            this.d.set($$3, $$2.b(1, $$1));
            $$0.a(etk.c, this.aD_(), etk.a.a($$1, this.o()));
            this.f();
            return true;
        }
        return false;
    }

    private void f() {
        this.e();
        this.j().a(this.aD_(), this.o(), this.o(), 3);
    }

    @Override
    public void a() {
        this.d.clear();
    }

    @Override
    public void a(is $$0, eoh $$1) {
        if (this.n != null) {
            ccy.a(this.n, $$0, this.c());
        }
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        $$0.a(ki.aw, doo.a).a(this.c());
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.aw, doo.a(this.c()));
    }

    @Override
    public void b(fns $$0) {
        $$0.c("Items");
    }

    public /* synthetic */ aay ax_() {
        return this.d();
    }
}

