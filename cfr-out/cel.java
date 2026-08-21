/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Map;

public interface cel<Subject, Argument> {
    public static final Map<a, cel<Boolean, ?>> a = Map.of(cel$a.i, cem.e, cel$a.j, cem.f, cel$a.k, cem.g, cel$a.l, cem.h, cel$a.m, cem.i, cel$a.n, cem.j);
    public static final Map<a, cel<Float, ?>> b = Map.of(cel$a.b, ceo.e, cel$a.c, ceo.f, cel$a.d, ceo.g, cel$a.e, ceo.h, cel$a.g, ceo.i, cel$a.h, ceo.j);
    public static final Map<a, cel<Integer, ?>> c = Map.of(cel$a.b, cen.e, cel$a.c, cen.f, cel$a.d, cen.g, cel$a.e, cen.h, cel$a.f, cen.j);
    public static final Map<a, cel<Integer, ?>> d = Map.of(cel$a.b, cen.e, cel$a.c, cen.f, cel$a.d, cen.g, cel$a.e, cen.i, cel$a.f, cen.j);

    public static <Value> cel<Value, Value> a() {
        return cel$b.e;
    }

    public Subject apply(Subject var1, Argument var2);

    public Codec<Argument> argumentCodec(cea<Subject> var1);

    public cei<Argument> argumentKeyframeLerp(cea<Subject> var1);

    public record b<Value>() implements cel<Value, Value>
    {
        static final b<?> e = new b();

        @Override
        public Value apply(Value $$0, Value $$1) {
            return $$1;
        }

        @Override
        public Codec<Value> argumentCodec(cea<Value> $$0) {
            return $$0.c();
        }

        @Override
        public cei<Value> argumentKeyframeLerp(cea<Value> $$0) {
            return $$0.a().d();
        }
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("override");
        public static final /* enum */ a b = new a("alpha_blend");
        public static final /* enum */ a c = new a("add");
        public static final /* enum */ a d = new a("subtract");
        public static final /* enum */ a e = new a("multiply");
        public static final /* enum */ a f = new a("blend_to_gray");
        public static final /* enum */ a g = new a("minimum");
        public static final /* enum */ a h = new a("maximum");
        public static final /* enum */ a i = new a("and");
        public static final /* enum */ a j = new a("nand");
        public static final /* enum */ a k = new a("or");
        public static final /* enum */ a l = new a("nor");
        public static final /* enum */ a m = new a("xor");
        public static final /* enum */ a n = new a("xnor");
        public static final Codec<a> o;
        private final String p;
        private static final /* synthetic */ a[] q;

        public static a[] values() {
            return (a[])q.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.p = $$0;
        }

        @Override
        public String c() {
            return this.p;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
        }

        static {
            q = cel$a.a();
            o = bhh.a(a::values);
        }
    }
}

