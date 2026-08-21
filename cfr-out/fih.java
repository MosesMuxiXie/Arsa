/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class fih
extends ffo {
    public static final MapCodec<fih> d = fih.a(fih::new);

    public fih(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        return Optional.of(new ffo.b($$0.h().m(), $$1 -> fih.a($$1, $$0)));
    }

    private static void a(fgg $$0, ffo.a $$1) {
        fig.m $$3;
        int $$2 = 0;
        do {
            $$0.b();
            $$1.f().c($$1.g() + (long)$$2++, $$1.h().h, $$1.h().i);
            fig.a();
            $$3 = new fig.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
            $$0.a($$3);
            $$3.a($$3, $$0, $$1.f());
            List<ffs> $$4 = $$3.c;
            while (!$$4.isEmpty()) {
                int $$5 = $$1.f().a($$4.size());
                ffs $$6 = $$4.remove($$5);
                $$6.a($$3, $$0, $$1.f());
            }
            $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
        } while ($$0.c() || $$3.b == null);
    }

    @Override
    public ffx<?> e() {
        return ffx.n;
    }
}

