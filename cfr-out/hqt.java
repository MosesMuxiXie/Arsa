/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;

public final class hqt
extends Record
implements hqu {
    private final a b;
    private final List<hqu> c;

    public hqt(a $$0, List<hqu> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public <O, S extends eoj<O, S>> Predicate<S> instantiate(eoi<O, S> $$0) {
        return this.b.a(Lists.transform(this.c, $$1 -> $$1.instantiate($$0)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqt.class, "operation;terms", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqt.class, "operation;terms", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqt.class, "operation;terms", "b", "c"}, this, $$0);
    }

    public a a() {
        return this.b;
    }

    public List<hqu> b() {
        return this.c;
    }

    public static abstract sealed class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("AND"){

            @Override
            public <V> Predicate<V> a(List<Predicate<V>> $$0) {
                return bhs.a($$0);
            }
        };
        public static final /* enum */ a b = new a("OR"){

            @Override
            public <V> Predicate<V> a(List<Predicate<V>> $$0) {
                return bhs.b($$0);
            }
        };
        public static final Codec<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        public abstract <V> Predicate<V> a(List<Predicate<V>> var1);

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = hqt$a.a();
            c = bhh.a(a::values);
        }
    }
}

