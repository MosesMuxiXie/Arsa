/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dic
extends dhj {
    private static final int p = 3;
    private static final int q = 3;
    public static final int o = 0;
    private static final int r = 1;
    private static final int s = 9;
    private static final int t = 10;
    private static final int u = 10;
    private static final int v = 37;
    private static final int w = 37;
    private static final int x = 46;
    private final dhw y;
    private final ddm z;
    private boolean A;

    public dic(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public dic(int $$0, ddl $$1, dhw $$2) {
        super(dis.m, $$0, 3, 3);
        this.y = $$2;
        this.z = $$1.j;
        this.a(this.z, 124, 35);
        this.d(30, 17);
        this.c($$1, 8, 84);
    }

    protected static void a(dhi $$0, axf $$1, ddm $$2, dib $$3, djd $$4, @Nullable dqx<dqh> $$5) {
        dqg $$6 = $$3.aE_();
        axg $$7 = (axg)$$2;
        dlt $$8 = dlt.l;
        Optional<dqx<dqh>> $$9 = $$1.s().aJ().a(drd.a, $$6, (dwo)$$1, $$5);
        if ($$9.isPresent()) {
            dlt $$12;
            dqx<dqh> $$10 = $$9.get();
            dqh $$11 = $$10.b();
            if ($$4.a($$7, $$10) && ($$12 = $$11.a($$6, $$1.J_())).a($$1.Q())) {
                $$8 = $$12;
            }
        }
        $$4.a(0, $$8);
        $$0.a(0, $$8);
        $$7.g.b(new adx($$0.l, $$0.k(), 0, $$8));
    }

    @Override
    public void a(ccv $$02) {
        if (!this.A) {
            this.y.a((dwo $$0, is $$1) -> {
                if ($$0 instanceof axf) {
                    axf $$2 = (axf)$$0;
                    dic.a(this, $$2, this.z, this.m, this.n, null);
                }
            });
        }
    }

    @Override
    public void l() {
        this.A = true;
    }

    @Override
    public void a(axf $$0, dqx<dqh> $$1) {
        this.A = false;
        dic.a(this, $$0, this.z, this.m, this.n, $$1);
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.y.a((dwo $$1, is $$2) -> this.a($$0, this.m));
    }

    @Override
    public boolean b(ddm $$0) {
        return dic.a(this.y, $$0, dzs.cX);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 0) {
                $$4.h().c($$4, $$0);
                if (!this.a($$4, 10, 46, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 >= 10 && $$1 < 46 ? !this.a($$4, 1, 10, false) && ($$1 < 37 ? !this.a($$4, 37, 46, false) : !this.a($$4, 10, 37, false)) : !this.a($$4, 10, 46, false)) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            } else {
                $$3.d();
            }
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
            if ($$1 == 0) {
                $$0.a($$4, false);
            }
        }
        return $$2;
    }

    @Override
    public boolean a(dlt $$0, dji $$1) {
        return $$1.c != this.n && super.a($$0, $$1);
    }

    @Override
    public dji m() {
        return (dji)this.k.get(0);
    }

    @Override
    public List<dji> n() {
        return this.k.subList(1, 10);
    }

    @Override
    public dja ao_() {
        return dja.a;
    }

    @Override
    protected ddm q() {
        return this.z;
    }
}

