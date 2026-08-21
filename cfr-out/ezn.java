/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezn
extends exx<faj> {
    public ezn(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        $$0.f();
        if (!$$1.A($$2)) {
            return false;
        }
        for (iz $$3 : iz.values()) {
            if ($$3 == iz.a || !ejh.a((dvt)$$1, $$2.a($$3), $$3)) continue;
            $$1.a($$2, (eoh)dzs.fN.m().b(ejh.a($$3), true), 2);
            return true;
        }
        return false;
    }
}

