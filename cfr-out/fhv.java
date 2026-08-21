/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class fhv
extends ffo {
    public static final cbn<dya.c> d = cbn.b().a(new dya.c(cgu.q, 2, 3), 10).a(new dya.c(cgu.ca, 4, 4), 5).a(new dya.c(cgu.bS, 5, 5), 8).a(new dya.c(cgu.bn, 5, 5), 2).a(new dya.c(cgu.aE, 4, 4), 3).a();
    public static final MapCodec<fhv> e = fhv.a(fhv::new);

    public fhv(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        dvu $$12 = $$0.h();
        is $$2 = new is($$12.e(), 64, $$12.f());
        return Optional.of(new ffo.b($$2, $$1 -> fhv.a($$1, $$0)));
    }

    private static void a(fgg $$0, ffo.a $$1) {
        fhu.q $$2 = new fhu.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
        $$0.a($$2);
        $$2.a($$2, $$0, $$1.f());
        List<ffs> $$3 = $$2.a;
        while (!$$3.isEmpty()) {
            int $$4 = $$1.f().a($$3.size());
            ffs $$5 = $$3.remove($$4);
            $$5.a($$2, $$0, $$1.f());
        }
        $$0.a($$1.f(), 48, 70);
    }

    @Override
    public ffx<?> e() {
        return ffx.d;
    }
}

