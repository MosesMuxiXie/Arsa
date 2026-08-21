/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class exa
extends exx<ezv> {
    private static final ImmutableList<dzq> a = ImmutableList.of((Object)dzs.K, (Object)dzs.I, (Object)dzs.lF, (Object)dzs.ez, (Object)dzs.gc, (Object)dzs.gd, (Object)dzs.ge, (Object)dzs.gf, (Object)dzs.cS, (Object)dzs.cP);
    private static final int b = 5;
    private static final int c = 50;
    private static final int d = 8;
    private static final int ap = 15;

    public exa(Codec<ezv> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezv> $$0) {
        int $$1 = $$0.c().f();
        is $$2 = $$0.e();
        dxn $$3 = $$0.b();
        bgr $$4 = $$0.d();
        ezv $$5 = $$0.f();
        if (!exa.a((dwp)$$3, $$1, $$2.k())) {
            return false;
        }
        int $$6 = $$5.b().a($$4);
        boolean $$7 = $$4.i() < 0.9f;
        int $$8 = Math.min($$6, $$7 ? 5 : 8);
        int $$9 = $$7 ? 50 : 15;
        boolean $$10 = false;
        for (is $$11 : is.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 < 0) continue;
            $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
        }
        return $$10;
    }

    private boolean a(dwp $$0, int $$1, is $$2, int $$3, int $$4) {
        boolean $$5 = false;
        block0: for (is $$6 : is.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
            is $$8;
            int $$7 = $$6.k($$2);
            is is2 = $$8 = exa.a($$0, $$1, $$6) ? exa.a($$0, $$1, $$6.k(), $$7) : exa.a($$0, $$6.k(), $$7);
            if ($$8 == null) continue;
            is.a $$10 = $$8.k();
            for (int $$9 = $$3 - $$7 / 2; $$9 >= 0; --$$9) {
                if (exa.a($$0, $$1, (is)$$10)) {
                    this.a($$0, $$10, dzs.eB.m());
                    $$10.c(iz.b);
                    $$5 = true;
                    continue;
                }
                if (!$$0.a_($$10).a(dzs.eB)) continue block0;
                $$10.c(iz.b);
            }
        }
        return $$5;
    }

    private static @Nullable is a(dwp $$0, int $$1, is.a $$2, int $$3) {
        while ($$2.v() > $$0.K_() + 1 && $$3 > 0) {
            --$$3;
            if (exa.a($$0, $$1, $$2)) {
                return $$2;
            }
            $$2.c(iz.a);
        }
        return null;
    }

    private static boolean a(dwp $$0, int $$1, is.a $$2) {
        if (exa.a($$0, $$1, (is)$$2)) {
            eoh $$3 = $$0.a_($$2.c(iz.a));
            $$2.c(iz.b);
            return !$$3.l() && !a.contains((Object)$$3.b());
        }
        return false;
    }

    private static @Nullable is a(dwp $$0, is.a $$1, int $$2) {
        while ($$1.v() <= $$0.aw() && $$2 > 0) {
            --$$2;
            eoh $$3 = $$0.a_($$1);
            if (a.contains((Object)$$3.b())) {
                return null;
            }
            if ($$3.l()) {
                return $$1;
            }
            $$1.c(iz.b);
        }
        return null;
    }

    private static boolean a(dwp $$0, int $$1, is $$2) {
        eoh $$3 = $$0.a_($$2);
        return $$3.l() || $$3.a(dzs.K) && $$2.v() <= $$1;
    }
}

