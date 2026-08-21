/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efh
extends dzq
implements dzt {
    public static final MapCodec<efh> a = efh.b(efh::new);

    public MapCodec<efh> a() {
        return a;
    }

    public efh(eog.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        if (!$$0.a_($$1.d()).f()) {
            return false;
        }
        for (is $$3 : is.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if (!$$0.a_($$3).a(bdp.aZ)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        boolean $$4 = false;
        boolean $$5 = false;
        for (is $$6 : is.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
            eoh $$7 = $$0.a_($$6);
            if ($$7.a(dzs.pl)) {
                $$5 = true;
            }
            if ($$7.a(dzs.pu)) {
                $$4 = true;
            }
            if (!$$5 || !$$4) continue;
            break;
        }
        if ($$5 && $$4) {
            $$0.a($$2, $$1.h() ? dzs.pl.m() : dzs.pu.m(), 3);
        } else if ($$5) {
            $$0.a($$2, dzs.pl.m(), 3);
        } else if ($$4) {
            $$0.a($$2, dzs.pu.m(), 3);
        }
    }

    @Override
    public dzt.a as_() {
        return dzt.a.a;
    }
}

