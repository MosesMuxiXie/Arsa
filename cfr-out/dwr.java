/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface dwr
extends dvq,
dvx,
dxg,
dxq.a {
    public @Nullable eqf a(int var1, int var2, erj var3, boolean var4);

    @Deprecated
    public boolean b(int var1, int var2);

    public int a(euq.a var1, int var2, int var3);

    default public int b(euq.a $$0, is $$1) {
        return this.a($$0, $$1.u(), $$1.w());
    }

    public int E_();

    public dxq H_();

    default public jd<dxo> z(is $$0) {
        return this.H_().a($$0);
    }

    default public Stream<eoh> c(fth $$0) {
        int $$6;
        int $$1 = bgj.c($$0.a);
        int $$2 = bgj.c($$0.d);
        int $$3 = bgj.c($$0.b);
        int $$4 = bgj.c($$0.e);
        int $$5 = bgj.c($$0.c);
        if (this.a($$1, $$3, $$5, $$2, $$4, $$6 = bgj.c($$0.f))) {
            return this.a($$0);
        }
        return Stream.empty();
    }

    @Override
    default public int a(is $$0, dvz $$1) {
        return $$1.getColor(this.z($$0).a(), $$0.u(), $$0.w());
    }

    @Override
    default public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2) {
        eqf $$3 = this.a(jo.e($$0), jo.e($$2), erj.f, false);
        if ($$3 != null) {
            return $$3.getNoiseBiome($$0, $$1, $$2);
        }
        return this.a($$0, $$1, $$2);
    }

    public jd<dxo> a(int var1, int var2, int var3);

    public boolean B_();

    public int V();

    public esh F_();

    @Override
    default public int K_() {
        return this.F_().h();
    }

    @Override
    default public int L_() {
        return this.F_().i();
    }

    default public is a(euq.a $$0, is $$1) {
        return new is($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
    }

    default public boolean A(is $$0) {
        return this.a_($$0).l();
    }

    default public boolean B(is $$0) {
        if ($$0.v() >= this.V()) {
            return this.k($$0);
        }
        is $$1 = new is($$0.u(), this.V(), $$0.w());
        if (!this.k($$1)) {
            return false;
        }
        $$1 = $$1.e();
        while ($$1.v() > $$0.v()) {
            eoh $$2 = this.a_($$1);
            if ($$2.g() > 0 && !$$2.n()) {
                return false;
            }
            $$1 = $$1.e();
        }
        return true;
    }

    default public float C(is $$0) {
        return this.D($$0) - 0.5f;
    }

    @Deprecated
    default public float D(is $$0) {
        float $$1 = (float)this.G($$0) / 15.0f;
        float $$2 = $$1 / (4.0f - 3.0f * $$1);
        return bgj.h(this.F_().l(), $$2, 1.0f);
    }

    default public eqf E(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.w()));
    }

    default public eqf a(int $$0, int $$1) {
        return this.a($$0, $$1, erj.n, true);
    }

    default public eqf a(int $$0, int $$1, erj $$2) {
        return this.a($$0, $$1, $$2, true);
    }

    @Override
    default public @Nullable dvt c(int $$0, int $$1) {
        return this.a($$0, $$1, erj.c, false);
    }

    default public boolean F(is $$0) {
        return this.b_($$0).a(bdv.a);
    }

    default public boolean d(fth $$0) {
        int $$1 = bgj.c($$0.a);
        int $$2 = bgj.e($$0.d);
        int $$3 = bgj.c($$0.b);
        int $$4 = bgj.e($$0.e);
        int $$5 = bgj.c($$0.c);
        int $$6 = bgj.e($$0.f);
        is.a $$7 = new is.a();
        for (int $$8 = $$1; $$8 < $$2; ++$$8) {
            for (int $$9 = $$3; $$9 < $$4; ++$$9) {
                for (int $$10 = $$5; $$10 < $$6; ++$$10) {
                    eoh $$11 = this.a_($$7.d($$8, $$9, $$10));
                    if ($$11.y().c()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    default public int G(is $$0) {
        return this.c($$0, this.E_());
    }

    default public int c(is $$0, int $$1) {
        if ($$0.u() < -30000000 || $$0.w() < -30000000 || $$0.u() >= 30000000 || $$0.w() >= 30000000) {
            return 15;
        }
        return this.b($$0, $$1);
    }

    @Deprecated
    default public boolean f(int $$0, int $$1) {
        return this.b(jw.a($$0), jw.a($$1));
    }

    @Deprecated
    default public boolean H(is $$0) {
        return this.f($$0.u(), $$0.w());
    }

    @Deprecated
    default public boolean a(is $$0, is $$1) {
        return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
    }

    @Deprecated
    default public boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if ($$4 < this.K_() || $$1 > this.aw()) {
            return false;
        }
        return this.b($$0, $$2, $$3, $$5);
    }

    @Deprecated
    default public boolean b(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = jw.a($$0);
        int $$5 = jw.a($$2);
        int $$6 = jw.a($$1);
        int $$7 = jw.a($$3);
        for (int $$8 = $$4; $$8 <= $$5; ++$$8) {
            for (int $$9 = $$6; $$9 <= $$7; ++$$9) {
                if (this.b($$8, $$9)) continue;
                return false;
            }
        }
        return true;
    }

    public jr J_();

    public dgz Q();

    default public <T> jf<T> a(amt<? extends jq<? extends T>> $$0) {
        jq $$1 = this.J_().f($$0);
        return $$1.a(this.Q());
    }

    public cee ad();
}

