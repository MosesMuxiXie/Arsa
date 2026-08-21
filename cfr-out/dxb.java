/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class dxb
implements dvx {
    protected final int a;
    protected final int b;
    protected final eqf[][] c;
    protected boolean d;
    protected final dwo e;
    private final Supplier<jd<dxo>> f;

    public dxb(dwo $$0, is $$1, is $$2) {
        this.e = $$0;
        this.f = Suppliers.memoize(() -> $$0.J_().f(mj.aS).b(dxv.b));
        this.a = jw.a($$1.u());
        this.b = jw.a($$1.w());
        int $$3 = jw.a($$2.u());
        int $$4 = jw.a($$2.w());
        this.c = new eqf[$$3 - this.a + 1][$$4 - this.b + 1];
        eqj $$5 = $$0.ac();
        this.d = true;
        for (int $$6 = this.a; $$6 <= $$3; ++$$6) {
            for (int $$7 = this.b; $$7 <= $$4; ++$$7) {
                this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
            }
        }
        for (int $$8 = jw.a($$1.u()); $$8 <= jw.a($$2.u()); ++$$8) {
            for (int $$9 = jw.a($$1.w()); $$9 <= jw.a($$2.w()); ++$$9) {
                eqf $$10 = this.c[$$8 - this.a][$$9 - this.b];
                if ($$10 == null || $$10.a($$1.v(), $$2.v())) continue;
                this.d = false;
                return;
            }
        }
    }

    private eqf c(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.w()));
    }

    private eqf a(int $$0, int $$1) {
        int $$2 = $$0 - this.a;
        int $$3 = $$1 - this.b;
        if ($$2 < 0 || $$2 >= this.c.length || $$3 < 0 || $$3 >= this.c[$$2].length) {
            return new eqm(this.e, new dvu($$0, $$1), this.f.get());
        }
        eqf $$4 = this.c[$$2][$$3];
        return $$4 != null ? $$4 : new eqm(this.e, new dvu($$0, $$1), this.f.get());
    }

    @Override
    public eqa w() {
        return this.e.w();
    }

    @Override
    public dvt c(int $$0, int $$1) {
        return this.a($$0, $$1);
    }

    @Override
    public List<fug> e(@Nullable cgk $$0, fth $$1) {
        return List.of();
    }

    @Override
    public @Nullable elb c_(is $$0) {
        eqf $$1 = this.c($$0);
        return $$1.c_($$0);
    }

    @Override
    public eoh a_(is $$0) {
        if (this.y($$0)) {
            return dzs.a.m();
        }
        eqf $$1 = this.c($$0);
        return $$1.a_($$0);
    }

    @Override
    public flb b_(is $$0) {
        if (this.y($$0)) {
            return flc.a.g();
        }
        eqf $$1 = this.c($$0);
        return $$1.b_($$0);
    }

    @Override
    public int K_() {
        return this.e.K_();
    }

    @Override
    public int L_() {
        return this.e.L_();
    }
}

