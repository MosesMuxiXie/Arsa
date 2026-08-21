/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class fho
extends ffo {
    public static final MapCodec<fho> d = fho.a(fho::new);

    public fho(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        return fho.a($$0, euq.a.a, $$1 -> this.a((fgg)$$1, $$0));
    }

    private void a(fgg $$0, ffo.a $$1) {
        dvu $$2 = $$1.h();
        evp $$3 = $$1.f();
        is $$4 = new is($$2.e(), 90, $$2.f());
        egm $$5 = egm.a($$3);
        fhn.a($$1.e(), $$4, $$5, $$0, $$3);
    }

    @Override
    public ffx<?> e() {
        return ffx.e;
    }
}

