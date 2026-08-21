/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class hsa
implements hri<emu, htc> {
    private final Function<ehh.a, hhm> a;
    private static final Map<ehh.a, amo> b = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put(ehh.b.c, amo.b("textures/entity/skeleton/skeleton.png"));
        $$0.put(ehh.b.d, amo.b("textures/entity/skeleton/wither_skeleton.png"));
        $$0.put(ehh.b.f, amo.b("textures/entity/zombie/zombie.png"));
        $$0.put(ehh.b.g, amo.b("textures/entity/creeper/creeper.png"));
        $$0.put(ehh.b.i, amo.b("textures/entity/enderdragon/dragon.png"));
        $$0.put(ehh.b.h, amo.b("textures/entity/piglin/piglin.png"));
        $$0.put(ehh.b.e, imh.a());
    });
    private final hou c;

    public static @Nullable hhm a(hdc $$0, ehh.a $$1) {
        if ($$1 instanceof ehh.b) {
            ehh.b $$2 = (ehh.b)$$1;
            return switch ($$2) {
                default -> throw new MatchException(null, null);
                case ehh.b.c -> new hhl($$0.a(hdf.do));
                case ehh.b.d -> new hhl($$0.a(hdf.eo));
                case ehh.b.e -> new hhl($$0.a(hdf.cH));
                case ehh.b.f -> new hhl($$0.a(hdf.ez));
                case ehh.b.g -> new hhl($$0.a(hdf.az));
                case ehh.b.i -> new hhj($$0.a(hdf.aM));
                case ehh.b.h -> new hhk($$0.a(hdf.cy));
            };
        }
        return null;
    }

    public hsa(hrj.a $$0) {
        hdc $$12 = $$0.f();
        this.c = $$0.i();
        this.a = bhs.b($$1 -> hsa.a($$12, $$1));
    }

    public htc a() {
        return new htc();
    }

    @Override
    public void a(emu $$0, htc $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a = $$0.a($$2);
        eoh $$5 = $$0.o();
        boolean $$6 = $$5.b() instanceof ejm;
        $$1.b = $$6 ? $$5.c(ejm.d) : null;
        int $$7 = $$6 ? epn.a($$1.b.g()) : $$5.c(ehh.e);
        $$1.c = epn.b($$7);
        $$1.d = ((dym)$$5.b()).b();
        $$1.e = this.a($$1.d, $$0);
    }

    @Override
    public void a(htc $$0, fzm $$1, hpo $$2, ikp $$3) {
        hhm $$4 = this.a.apply($$0.d);
        hsa.a($$0.b, $$0.c, $$0.a, $$1, $$2, $$0.i, $$4, $$0.e, 0, $$0.j);
    }

    public static void a(@Nullable iz $$0, float $$1, float $$2, fzm $$3, hpo $$4, int $$5, hhm $$6, ijs $$7, int $$8, @Nullable igi.a $$9) {
        $$3.a();
        if ($$0 == null) {
            $$3.a(0.5f, 0.0f, 0.5f);
        } else {
            float $$10 = 0.25f;
            $$3.a(0.5f - (float)$$0.j() * 0.25f, 0.25f, 0.5f - (float)$$0.l() * 0.25f);
        }
        $$3.b(-1.0f, -1.0f, 1.0f);
        hhm.a $$11 = new hhm.a();
        $$11.a = $$2;
        $$11.b = $$1;
        $$4.a($$6, $$11, $$3, $$7, $$5, ilg.d, $$8, $$9);
        $$3.b();
    }

    private ijs a(ehh.a $$0, emu $$1) {
        doy $$2;
        if ($$0 == ehh.b.e && ($$2 = $$1.a()) != null) {
            return this.c.a($$2).c();
        }
        return hsa.a($$0, null);
    }

    public static ijs a(ehh.a $$0, @Nullable amo $$1) {
        return ijt.h($$1 != null ? $$1 : b.get($$0));
    }

    public static ijs a(amo $$0) {
        return ijt.j($$0);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

