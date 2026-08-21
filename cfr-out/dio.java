/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class dio {
    private final List<b> a;
    private final b b;

    dio(List<b> $$0, b $$1) {
        if ($$0.isEmpty() || $$1.equals(dio$b.e)) {
            throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
        }
        this.a = $$0;
        this.b = $$1;
    }

    public static a a() {
        return new a();
    }

    public b a(int $$0) {
        return this.a.get($$0);
    }

    public b b() {
        return this.b;
    }

    public List<b> c() {
        return this.a;
    }

    public int d() {
        return this.a.size();
    }

    public int e() {
        return this.d();
    }

    public static final class b
    extends Record {
        final int a;
        private final int b;
        private final int c;
        private final Predicate<dlt> d;
        static final b e = new b(0, 0, 0, $$0 -> true);

        public b(int $$0, int $$1, int $$2, Predicate<dlt> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "slotIndex;x;y;mayPlace", "a", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public Predicate<dlt> d() {
            return this.d;
        }
    }

    public static class a {
        private final List<b> a = new ArrayList<b>();
        private b b = dio$b.e;

        public a a(int $$0, int $$1, int $$2, Predicate<dlt> $$3) {
            this.a.add(new b($$0, $$1, $$2, $$3));
            return this;
        }

        public a a(int $$02, int $$1, int $$2) {
            this.b = new b($$02, $$1, $$2, $$0 -> false);
            return this;
        }

        public dio a() {
            int $$0 = this.a.size();
            for (int $$1 = 0; $$1 < $$0; ++$$1) {
                b $$2 = this.a.get($$1);
                if ($$2.a == $$1) continue;
                throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
            if (this.b.a != $$0) {
                throw new IllegalArgumentException("Expected result slot index to follow last input slot");
            }
            return new dio(this.a, this.b);
        }
    }
}

