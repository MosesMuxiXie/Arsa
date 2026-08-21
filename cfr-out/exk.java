/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class exk
extends exx<faj> {
    public exk(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        bgr $$1 = $$0.d();
        dxn $$2 = $$0.b();
        is $$3 = $$0.e();
        Optional<dzq> $$4 = mi.e.a(bdp.aG, $$1).map(jd::a);
        if ($$4.isEmpty()) {
            return false;
        }
        return this.a((dwp)$$2, $$1, $$3, $$4.get().m());
    }

    protected abstract boolean a(dwp var1, bgr var2, is var3, eoh var4);

    protected boolean b(dwp $$0, bgr $$1, is $$22, eoh $$32) {
        is $$4 = $$22.d();
        eoh $$5 = $$0.a_($$22);
        if (!$$5.a(dzs.J) && !$$5.a(bdp.aJ) || !$$0.a_($$4).a(dzs.J)) {
            return false;
        }
        $$0.a($$22, $$32, 3);
        if ($$1.i() < 0.25f) {
            mi.e.a(bdp.aJ, $$1).map(jd::a).ifPresent($$2 -> $$0.a($$4, $$2.m(), 2));
        } else if ($$1.i() < 0.05f) {
            $$0.a($$4, (eoh)dzs.nS.m().b(egx.c, $$1.a(4) + 1), 2);
        }
        for (iz $$6 : iz.c.a) {
            is $$7;
            if (!($$1.i() < 0.2f) || !$$0.a_($$7 = $$22.a($$6)).a(dzs.J)) continue;
            mi.e.a(bdp.aH, $$1).map(jd::a).ifPresent($$3 -> {
                eoh $$4 = $$3.m();
                if ($$4.b(dzb.d)) {
                    $$4 = (eoh)$$4.b(dzb.d, $$6);
                }
                $$0.a($$7, $$4, 2);
            });
        }
        return true;
    }
}

