/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyq
extends exx<fai> {
    public eyq(Codec<fai> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fai> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        eoh $$3 = $$1.a_($$2.e());
        fai $$4 = $$0.f();
        bgr $$5 = $$0.d();
        if (!$$3.a(bdp.aZ)) {
            return false;
        }
        int $$6 = $$2.v();
        if ($$6 < $$1.K_() + 1 || $$6 + 1 > $$1.aw()) {
            return false;
        }
        int $$7 = 0;
        for (int $$8 = 0; $$8 < $$4.d * $$4.d; ++$$8) {
            is $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
            eoh $$10 = $$4.b.a($$5, $$9);
            if (!$$1.A($$9) || $$9.v() <= $$1.K_() || !$$10.a($$1, $$9)) continue;
            $$1.a($$9, $$10, 2);
            ++$$7;
        }
        return $$7 > 0;
    }
}

