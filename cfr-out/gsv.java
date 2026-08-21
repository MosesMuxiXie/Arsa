/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class gsv {
    private static final Map<MapCodec<? extends asj>, a<?>> a = new HashMap();

    private static <T extends asj> void a(MapCodec<T> $$0, a<? super T> $$1) {
        a.put($$0, $$1);
    }

    public static <T extends asj> @Nullable gsu<T> a(T $$0, @Nullable gsb $$1, gsr $$2) {
        a<?> $$3 = a.get($$0.a());
        if ($$3 != null) {
            return $$3.create($$1, $$0, $$2);
        }
        return null;
    }

    public static void a() {
        gsv.a(asi.a, gsy::new);
        gsv.a(asq.h, gsy::new);
        gsv.a(asl.a, gst::new);
        gsv.a(asp.a, gsw::new);
        gsv.a(asr.a, gsx::new);
    }

    @FunctionalInterface
    public static interface a<T extends asj> {
        public gsu<T> create(@Nullable gsb var1, T var2, gsr var3);
    }
}

