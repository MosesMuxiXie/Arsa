/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ekj
extends dzq {
    public static final MapCodec<ekj> a = ekj.b(ekj::new);

    public MapCodec<ekj> a() {
        return a;
    }

    protected ekj(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$1.c().a(ceg.B, $$2).booleanValue()) {
            $$1.a($$2, dzs.aV.m(), 3);
            $$1.c(2009, $$2, 0);
            $$1.a(null, $$2, bda.FE, bdb.e, 1.0f, (1.0f + $$1.G_().i() * 0.2f) * 0.7f);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        iz $$4 = iz.b($$3);
        if ($$4 == iz.b) {
            return;
        }
        is $$5 = $$2.a($$4);
        eoh $$6 = $$1.a_($$5);
        if ($$0.t() && $$6.c((dvt)$$1, $$5, $$4.g())) {
            return;
        }
        double $$7 = $$2.u();
        double $$8 = $$2.v();
        double $$9 = $$2.w();
        if ($$4 == iz.a) {
            $$8 -= 0.05;
            $$7 += $$3.j();
            $$9 += $$3.j();
        } else {
            $$8 += $$3.j() * 0.8;
            if ($$4.o() == iz.a.a) {
                $$9 += $$3.j();
                $$7 = $$4 == iz.f ? ($$7 += 1.1) : ($$7 += 0.05);
            } else {
                $$7 += $$3.j();
                $$9 = $$4 == iz.d ? ($$9 += 1.1) : ($$9 += 0.05);
            }
        }
        $$1.a(ly.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
    }
}

