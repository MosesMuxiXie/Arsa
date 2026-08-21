/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eyy
extends exx<faq> {
    public eyy(Codec<faq> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faq> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        faq $$3 = $$0.f();
        for (fak.a $$4 : $$3.b) {
            if (!$$4.b.a($$1.a_($$2), $$0.d())) continue;
            $$1.a($$2, $$4.c, 2);
            break;
        }
        return true;
    }
}

