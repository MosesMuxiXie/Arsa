/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface hjb {
    public static final Codec<hjb> a = bhh.a(a::values).dispatch(hjb::a, a::a);

    public a a();

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("player", () -> hjc.a.b);
        public static final /* enum */ a b = new a("system", () -> hjc.b.b);
        private final String c;
        private final Supplier<MapCodec<? extends hjb>> d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, Supplier<MapCodec<? extends hjb>> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        private MapCodec<? extends hjb> a() {
            return this.d.get();
        }

        @Override
        public String c() {
            return this.c;
        }

        private static /* synthetic */ a[] e() {
            return new a[]{a, b};
        }

        static {
            e = hjb$a.e();
        }
    }
}

