/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public class dim
extends dhj {
    public static final int o = 0;
    public static final int p = 0;
    private static final int H = 2;
    private static final int I = 2;
    public static final int q = 1;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = 5;
    public static final int u = 4;
    public static final int v = 9;
    public static final int w = 9;
    public static final int x = 36;
    public static final int y = 36;
    public static final int z = 45;
    public static final int A = 45;
    public static final amo B = amo.b("container/slot/helmet");
    public static final amo C = amo.b("container/slot/chestplate");
    public static final amo D = amo.b("container/slot/leggings");
    public static final amo E = amo.b("container/slot/boots");
    public static final amo F = amo.b("container/slot/shield");
    private static final Map<cgv, amo> J = Map.of(cgv.c, E, cgv.d, D, cgv.e, C, cgv.f, B);
    private static final cgv[] K = new cgv[]{cgv.f, cgv.e, cgv.d, cgv.c};
    public final boolean G;
    private final ddm L;

    public dim(ddl $$0, boolean $$1, final ddm $$2) {
        super(null, 0, 2, 2);
        this.G = $$1;
        this.L = $$2;
        this.a($$2, 154, 28);
        this.d(98, 18);
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            cgv $$4 = K[$$3];
            amo $$5 = J.get($$4);
            this.a(new dhn($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
        }
        this.c($$0, 8, 84);
        this.a(new dji(this, $$0, 40, 77, 62){

            @Override
            public void a(dlt $$0, dlt $$1) {
                $$2.a(cgv.b, $$1, $$0);
                super.a($$0, $$1);
            }

            @Override
            public amo c() {
                return F;
            }
        });
    }

    public static boolean e(int $$0) {
        return $$0 >= 36 && $$0 < 45 || $$0 == 45;
    }

    @Override
    public void a(ccv $$0) {
        dwo dwo2 = this.L.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            dic.a(this, $$1, this.L, this.m, this.n, null);
        }
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.n.a();
        if ($$0.ao().B_()) {
            return;
        }
        this.a($$0, this.m);
    }

    @Override
    public boolean b(ddm $$0) {
        return true;
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3.h()) {
            int $$6;
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            cgv $$5 = $$0.f($$2);
            if ($$1 == 0) {
                if (!this.a($$4, 9, 45, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 >= 1 && $$1 < 5 ? !this.a($$4, 9, 45, false) : ($$1 >= 5 && $$1 < 9 ? !this.a($$4, 9, 45, false) : ($$5.a() == cgv.a.b && !((dji)this.k.get(8 - $$5.b())).h() ? !this.a($$4, $$6 = 8 - $$5.b(), $$6 + 1, false) : ($$5 == cgv.b && !((dji)this.k.get(45)).h() ? !this.a($$4, 45, 46, false) : ($$1 >= 9 && $$1 < 36 ? !this.a($$4, 36, 45, false) : ($$1 >= 36 && $$1 < 45 ? !this.a($$4, 9, 36, false) : !this.a($$4, 9, 45, false))))))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.a(dlt.l, $$2);
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
        return this.k.subList(1, 5);
    }

    public dib r() {
        return this.m;
    }

    @Override
    public dja ao_() {
        return dja.a;
    }

    @Override
    protected ddm q() {
        return this.L;
    }
}

