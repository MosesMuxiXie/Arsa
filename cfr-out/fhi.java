/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class fhi
extends ffo {
    public static final MapCodec<fhi> d = fhi.a(fhi::new);

    public fhi(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        return fhi.a($$0, euq.a.c, $$1 -> fhi.a($$1, $$0));
    }

    private static void a(fgg $$0, ffo.a $$1) {
        is $$2 = new is($$1.h().a(9), 90, $$1.h().b(9));
        $$0.a(new fhh.a($$2));
    }

    @Override
    public ffx<?> e() {
        return ffx.a;
    }
}

