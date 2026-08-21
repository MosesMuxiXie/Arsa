/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hrp<T extends elb>
implements hri<T, hsq> {
    private final inu a;
    private final hgv b;
    private final hgv c;
    private final hgv d;
    private final boolean e;

    public hrp(hrj.a $$0) {
        this.a = $$0.h();
        this.e = hrp.a();
        this.b = new hgv($$0.a(hdf.X));
        this.c = new hgv($$0.a(hdf.aK));
        this.d = new hgv($$0.a(hdf.aL));
    }

    public static boolean a() {
        return bhd.c();
    }

    public hsq d() {
        return new hsq();
    }

    @Override
    public void a(T $$0, hsq $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        eca.c<elj> $$9;
        dzq dzq2;
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        boolean $$5 = ((elb)$$0).j() != null;
        eoh $$6 = $$5 ? ((elb)$$0).o() : (eoh)dzs.cS.m().b(eau.c, iz.d);
        $$1.a = $$6.b(eau.d) ? $$6.c(eau.d) : eoz.a;
        $$1.c = $$6.c(eau.c).p();
        $$1.d = this.a((elb)$$0, this.e);
        if ($$5 && (dzq2 = $$6.b()) instanceof eau) {
            eau $$7 = (eau)dzq2;
            eca.c<? extends elj> $$8 = $$7.a($$6, ((elb)$$0).j(), ((elb)$$0).aD_(), true);
        } else {
            $$9 = eca.b::b;
        }
        $$1.b = $$9.apply(eau.a((emj)$$0)).get($$2);
        if ($$1.a != eoz.a) {
            $$1.i = ((Int2IntFunction)$$9.apply(new hrm())).applyAsInt($$1.i);
        }
    }

    @Override
    public void a(hsq $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a(0.5f, 0.5f, 0.5f);
        $$1.a((Quaternionfc)a.d.rotationDegrees(-$$0.c));
        $$1.a(-0.5f, -0.5f, -0.5f);
        float $$4 = $$0.b;
        $$4 = 1.0f - $$4;
        $$4 = 1.0f - $$4 * $$4 * $$4;
        ins $$5 = hpj.a($$0.d, $$0.a);
        ijs $$6 = $$5.a(ijt::f);
        ilp $$7 = this.a.a($$5);
        if ($$0.a != eoz.a) {
            if ($$0.a == eoz.b) {
                $$2.a(this.c, Float.valueOf($$4), $$1, $$6, $$0.i, ilg.d, -1, $$7, 0, $$0.j);
            } else {
                $$2.a(this.d, Float.valueOf($$4), $$1, $$6, $$0.i, ilg.d, -1, $$7, 0, $$0.j);
            }
        } else {
            $$2.a(this.b, Float.valueOf($$4), $$1, $$6, $$0.i, ilg.d, -1, $$7, 0, $$0.j);
        }
        $$1.b();
    }

    private hsq.a a(elb $$0, boolean $$1) {
        if ($$0 instanceof ema) {
            return hsq.a.a;
        }
        if ($$1) {
            return hsq.a.b;
        }
        if ($$0 instanceof end) {
            return hsq.a.c;
        }
        dzq dzq2 = $$0.o().b();
        if (dzq2 instanceof ebg) {
            ebg $$2 = (ebg)dzq2;
            return switch ($$2.t()) {
                default -> throw new MatchException(null, null);
                case ejq.a.a -> hsq.a.d;
                case ejq.a.b -> hsq.a.e;
                case ejq.a.c -> hsq.a.f;
                case ejq.a.d -> hsq.a.g;
            };
        }
        return hsq.a.h;
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.d();
    }
}

