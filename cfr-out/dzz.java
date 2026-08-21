/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dzz
extends dyo {
    public static final MapCodec<dzz> b = dzz.b(dzz::new);
    public static final int c = 5;
    private static final iz[] d = iz.values();

    public MapCodec<dzz> a() {
        return b;
    }

    public dzz(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(5) != 0) {
            return;
        }
        iz $$4 = d[$$3.a(d.length)];
        is $$5 = $$2.a($$4);
        eoh $$6 = $$1.a_($$5);
        dzq $$7 = null;
        if (dzz.h($$6)) {
            $$7 = dzs.ry;
        } else if ($$6.a(dzs.ry) && $$6.c(dyp.d) == $$4) {
            $$7 = dzs.rx;
        } else if ($$6.a(dzs.rx) && $$6.c(dyp.d) == $$4) {
            $$7 = dzs.rw;
        } else if ($$6.a(dzs.rw) && $$6.c(dyp.d) == $$4) {
            $$7 = dzs.rv;
        }
        if ($$7 != null) {
            eoh $$8 = (eoh)((eoh)$$7.m().b(dyp.d, $$4)).b(dyp.c, $$6.y().a() == flc.c);
            $$1.c($$5, $$8);
        }
    }

    public static boolean h(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J) && $$0.y().e() == 8;
    }
}

