/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class edh
extends ehw
implements dzt {
    public static final MapCodec<edh> a = edh.b(edh::new);

    public MapCodec<edh> a() {
        return a;
    }

    public edh(eog.d $$0) {
        super($$0);
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
        is $$4 = $$2.d();
        eoh $$5 = dzs.bA.m();
        Optional $$6 = $$0.J_().f(mj.bp).a(sj.o);
        block0: for (int $$7 = 0; $$7 < 128; ++$$7) {
            jd $$15;
            dzt $$11;
            is $$8 = $$4;
            for (int $$9 = 0; $$9 < $$7 / 16; ++$$9) {
                if (!$$0.a_(($$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1)).e()).a(this) || $$0.a_($$8).m($$0, $$8)) continue block0;
            }
            eoh $$10 = $$0.a_($$8);
            if ($$10.a($$5.b()) && $$1.a(10) == 0 && ($$11 = (dzt)((Object)$$5.b())).a($$0, $$8, $$10)) {
                $$11.a($$0, $$1, $$8, $$10);
            }
            if (!$$10.l()) continue;
            if ($$1.a(8) == 0) {
                List<exi<?, ?>> $$12 = $$0.z($$8).a().c().b();
                if ($$12.isEmpty()) continue;
                int $$13 = $$1.a($$12.size());
                jd<fes> $$14 = ((fap)$$12.get($$13).c()).d();
            } else {
                if (!$$6.isPresent()) continue;
                $$15 = (jd)$$6.get();
            }
            ((fes)$$15.a()).a($$0, $$0.p().g(), $$1, $$8);
        }
    }

    @Override
    public dzt.a as_() {
        return dzt.a.a;
    }
}

