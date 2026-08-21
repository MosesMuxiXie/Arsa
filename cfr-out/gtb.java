/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gtb {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<MapCodec<? extends ata>, gta<?>> b = new HashMap();

    private static <B extends ata> void a(MapCodec<B> $$0, gta<? super B> $$1) {
        b.put($$0, $$1);
    }

    private static <B extends ata> @Nullable gta<B> a(B $$0) {
        return b.get($$0.a());
    }

    public static <B extends ata> @Nullable gow a(gsu<?> $$0, B $$1) {
        gta<B> $$2 = gtb.a($$1);
        if ($$2 == null) {
            a.warn("Unrecognized dialog body {}", $$1);
            return null;
        }
        return $$2.a($$0, $$1);
    }

    public static void a() {
        gtb.a(atd.d, new b());
        gtb.a(atc.c, new a());
    }

    static void a(gsu<?> $$0, @Nullable zf $$1) {
        yf $$2;
        if ($$1 != null && ($$2 = $$1.i()) != null) {
            $$0.a(Optional.of($$2));
        }
    }

    static class b
    implements gta<atd> {
        b() {
        }

        @Override
        public gow a(gsu<?> $$0, atd $$12) {
            return gjp.a($$12.b(), $$0.C()).a($$12.c()).a(false).a(gjp.a.c).a().a(true).b($$1 -> gtb.a($$0, $$1));
        }
    }

    static class a
    implements gta<atc> {
        a() {
        }

        @Override
        public gow a(gsu<?> $$0, atc $$12) {
            if ($$12.c().isPresent()) {
                atd $$2 = $$12.c().get();
                goy $$3 = goy.e().a(2);
                $$3.c().e();
                gjs $$4 = new gjs(gfj.V(), 0, 0, $$12.f(), $$12.g(), yg.a, $$12.b(), $$12.d(), $$12.e());
                $$3.a($$4);
                $$3.a(gjp.a($$2.b(), $$0.C()).a($$2.c()).a(false).a(gjp.a.c).a().b($$1 -> gtb.a($$0, $$1)));
                return $$3;
            }
            return new gjs(gfj.V(), 0, 0, $$12.f(), $$12.g(), $$12.b().y(), $$12.b(), $$12.d(), $$12.e());
        }
    }
}

