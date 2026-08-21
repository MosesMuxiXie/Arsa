/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyw
extends exx<fao> {
    public eyw(Codec<fao> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fao> $$0) {
        fao $$1 = $$0.f();
        bgr $$2 = $$0.d();
        dxn $$3 = $$0.b();
        eqg $$4 = $$0.c();
        is $$5 = $$0.e();
        for (ezr $$6 : $$1.b) {
            if (!($$2.i() < $$6.c)) continue;
            return $$6.a($$3, $$4, $$2, $$5);
        }
        return $$1.c.a().a($$3, $$4, $$2, $$5);
    }
}

