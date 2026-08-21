/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class exn
extends exx<ezx> {
    private static final ImmutableList<dzq> a = ImmutableList.of((Object)dzs.I, (Object)dzs.gc, (Object)dzs.gd, (Object)dzs.ge, (Object)dzs.gf, (Object)dzs.cS, (Object)dzs.cP);
    private static final iz[] b = iz.values();
    private static final double c = 0.9;

    public exn(Codec<ezx> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezx> $$0) {
        boolean $$1 = false;
        bgr $$2 = $$0.d();
        dxn $$3 = $$0.b();
        ezx $$4 = $$0.f();
        is $$5 = $$0.e();
        boolean $$6 = $$2.j() < 0.9;
        int $$7 = $$6 ? $$4.d().a($$2) : 0;
        int $$8 = $$6 ? $$4.d().a($$2) : 0;
        boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
        int $$10 = $$4.c().a($$2);
        int $$11 = $$4.c().a($$2);
        int $$12 = Math.max($$10, $$11);
        for (is $$13 : is.a($$5, $$10, 0, $$11)) {
            is $$14;
            if ($$13.k($$5) > $$12) break;
            if (!exn.a($$3, $$13, $$4)) continue;
            if ($$9) {
                $$1 = true;
                this.a($$3, $$13, $$4.b());
            }
            if (!exn.a($$3, $$14 = $$13.b($$7, 0, $$8), $$4)) continue;
            $$1 = true;
            this.a($$3, $$14, $$4.a());
        }
        return $$1;
    }

    private static boolean a(dwp $$0, is $$1, ezx $$2) {
        eoh $$3 = $$0.a_($$1);
        if ($$3.a($$2.a().b())) {
            return false;
        }
        if (a.contains((Object)$$3.b())) {
            return false;
        }
        for (iz $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ((!$$5 || $$4 == iz.b) && ($$5 || $$4 != iz.b)) continue;
            return false;
        }
        return true;
    }
}

