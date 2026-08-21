/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efj
extends dzq
implements dzt {
    public static final MapCodec<efj> a = efj.b(efj::new);

    public MapCodec<efj> a() {
        return a;
    }

    protected efj(eog.d $$0) {
        super($$0);
    }

    private static boolean b(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.d();
        eoh $$4 = $$1.a_($$3);
        int $$5 = fks.a($$0, $$4, iz.b, $$4.g());
        return $$5 < 15;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!efj.b($$0, (dwr)$$1, $$2)) {
            $$1.c($$2, dzs.ey.m());
        }
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.d()).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        eoh $$4 = $$0.a_($$2);
        is $$5 = $$2.d();
        eqg $$6 = $$0.p().g();
        jq<exi<?, ?>> $$7 = $$0.J_().f(mj.aY);
        if ($$4.a(dzs.pu)) {
            this.a($$7, ru.h, $$0, $$6, $$1, $$5);
        } else if ($$4.a(dzs.pl)) {
            this.a($$7, ru.j, $$0, $$6, $$1, $$5);
            this.a($$7, ru.l, $$0, $$6, $$1, $$5);
            if ($$1.a(8) == 0) {
                this.a($$7, ru.n, $$0, $$6, $$1, $$5);
            }
        }
    }

    private void a(jq<exi<?, ?>> $$0, amt<exi<?, ?>> $$1, axf $$2, eqg $$3, bgr $$42, is $$5) {
        $$0.a($$1).ifPresent($$4 -> ((exi)$$4.a()).a($$2, $$3, $$42, $$5));
    }

    @Override
    public dzt.a as_() {
        return dzt.a.a;
    }
}

