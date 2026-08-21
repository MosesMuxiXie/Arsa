/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eze
extends exx<fau> {
    public eze(Codec<fau> $$0) {
        super($$0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(exz<fau> $$0) {
        fau $$1 = $$0.f();
        dxn $$2 = $$0.b();
        is $$3 = $$0.e();
        eoh $$4 = $$1.a().a($$0.d(), $$3);
        if (!$$4.a($$2, $$3)) return false;
        if ($$4.b() instanceof ecb) {
            if (!$$2.A($$3.d())) return false;
            ecb.a($$2, $$4, $$3, 2);
        } else if ($$4.b() instanceof eew) {
            eew.a($$2, $$3, $$2.G_(), 2);
        } else {
            $$2.a($$3, $$4, 2);
        }
        if (!$$1.b()) return true;
        $$2.a($$3, $$2.a_($$3).b(), 1);
        return true;
    }
}

