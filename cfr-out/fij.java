/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class fij
extends ffo {
    public static final MapCodec<fij> d = fij.a(fij::new);

    public fij(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        return fij.a($$0, euq.a.a, $$1 -> fij.a($$1, $$0));
    }

    private static void a(fgg $$0, ffo.a $$1) {
        $$0.a(new fii($$1.f(), $$1.h().e(), $$1.h().f()));
    }

    @Override
    public ffx<?> e() {
        return ffx.o;
    }
}

