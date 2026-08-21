/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class fhz
extends ffo {
    public static final MapCodec<fhz> d = fhz.a(fhz::new);

    public fhz(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        int $$12 = $$0.h().a(9);
        int $$2 = $$0.h().b(9);
        Set<jd<dxo>> $$3 = $$0.c().a($$12, $$0.b().f(), $$2, 29, $$0.d().b());
        for (jd<dxo> $$4 : $$3) {
            if ($$4.a(bdo.X)) continue;
            return Optional.empty();
        }
        return fhz.a($$0, euq.a.c, (fgg $$1) -> fhz.a($$1, $$0));
    }

    private static ffs a(dvu $$0, evp $$1) {
        int $$2 = $$0.e() - 29;
        int $$3 = $$0.f() - 29;
        iz $$4 = iz.c.a.a($$1);
        return new fhy.h($$1, $$2, $$3, $$4);
    }

    private static void a(fgg $$0, ffo.a $$1) {
        $$0.a(fhz.a($$1.h(), $$1.f()));
    }

    public static fgd a(dvu $$0, long $$1, fgd $$2) {
        if ($$2.a()) {
            return $$2;
        }
        evp $$3 = new evp(new eur(evf.a()));
        $$3.c($$1, $$0.h, $$0.i);
        ffs $$4 = $$2.c().get(0);
        ffg $$5 = $$4.f();
        int $$6 = $$5.h();
        int $$7 = $$5.j();
        iz $$8 = iz.c.a.a($$3);
        iz $$9 = Objects.requireNonNullElse($$4.i(), $$8);
        fhy.h $$10 = new fhy.h($$3, $$6, $$7, $$9);
        fgg $$11 = new fgg();
        $$11.a($$10);
        return $$11.a();
    }

    @Override
    public ffx<?> e() {
        return ffx.j;
    }
}

