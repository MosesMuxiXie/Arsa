/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyv
extends exx<fap> {
    public eyv(Codec<fap> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fap> $$0) {
        fap $$1 = $$0.f();
        bgr $$2 = $$0.d();
        is $$3 = $$0.e();
        dxn $$4 = $$0.b();
        int $$5 = 0;
        is.a $$6 = new is.a();
        int $$7 = $$1.b() + 1;
        int $$8 = $$1.c() + 1;
        for (int $$9 = 0; $$9 < $$1.a(); ++$$9) {
            $$6.a($$3, $$2.a($$7) - $$2.a($$7), $$2.a($$8) - $$2.a($$8), $$2.a($$7) - $$2.a($$7));
            if (!$$1.d().a().a($$4, $$0.c(), $$2, $$6)) continue;
            ++$$5;
        }
        return $$5 > 0;
    }
}

