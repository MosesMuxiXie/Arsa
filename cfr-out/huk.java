/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public class huk {
    private static final int a = 10000;
    private static final float b = 0.02f;
    private final Map<is, a> c = Maps.newHashMap();

    public void a(is $$0, is $$1) {
        String $$2 = $$1.y();
        this.c.put($$0, new a(0x6000FF00, $$2, bhs.c() + 10000L));
    }

    public void a() {
        this.c.clear();
    }

    public void b() {
        long $$02 = bhs.c();
        this.c.entrySet().removeIf($$1 -> $$02 > ((a)$$1.getValue()).c);
        this.c.forEach(($$0, $$1) -> this.a((is)$$0, (a)$$1));
    }

    private void a(is $$0, a $$1) {
        um.a($$0, 0.02f, ul.b($$1.a()));
        if (!$$1.b.isEmpty()) {
            um.a($$1.b, ftm.a($$0, 0.5, 1.2, 0.5), ur.a.a().a(0.16f)).a();
        }
    }

    static final class a
    extends Record {
        private final int a;
        final String b;
        final long c;

        a(int $$0, String $$1, long $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "color;text;removeAtTime", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "color;text;removeAtTime", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "color;text;removeAtTime", "a", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }
    }
}

