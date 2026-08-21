/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class ku
implements df<dsu> {
    private final List<bn> a;

    protected ku(List<bn> $$0) {
        this.a = $$0;
    }

    public static <T extends ku> Codec<T> a(Function<List<bn>, T> $$0) {
        return bn.a.listOf().xmap($$0, ku::b);
    }

    protected List<bn> b() {
        return this.a;
    }

    @Override
    public boolean a(dsu $$0) {
        for (bn $$1 : this.a) {
            if ($$1.a($$0)) continue;
            return false;
        }
        return true;
    }

    public static a a(List<bn> $$0) {
        return new a($$0);
    }

    public static b b(List<bn> $$0) {
        return new b($$0);
    }

    public static class a
    extends ku {
        public static final Codec<a> a = ku$a.a(a::new);

        protected a(List<bn> $$0) {
            super($$0);
        }

        @Override
        public kh<dsu> a() {
            return ki.o;
        }
    }

    public static class b
    extends ku {
        public static final Codec<b> a = b.a(b::new);

        protected b(List<bn> $$0) {
            super($$0);
        }

        @Override
        public kh<dsu> a() {
            return ki.Q;
        }
    }
}

