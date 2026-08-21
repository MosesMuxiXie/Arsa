/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eum {

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("raw_generation");
        public static final /* enum */ a b = new a("lakes");
        public static final /* enum */ a c = new a("local_modifications");
        public static final /* enum */ a d = new a("underground_structures");
        public static final /* enum */ a e = new a("surface_structures");
        public static final /* enum */ a f = new a("strongholds");
        public static final /* enum */ a g = new a("underground_ores");
        public static final /* enum */ a h = new a("underground_decoration");
        public static final /* enum */ a i = new a("fluid_springs");
        public static final /* enum */ a j = new a("vegetal_decoration");
        public static final /* enum */ a k = new a("top_layer_modification");
        public static final Codec<a> l;
        private final String m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.m = $$0;
        }

        public String a() {
            return this.m;
        }

        @Override
        public String c() {
            return this.m;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k};
        }

        static {
            n = eum$a.b();
            l = bhh.a(a::values);
        }
    }
}

