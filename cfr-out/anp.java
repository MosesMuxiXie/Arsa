/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 */
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Queue;

public class anp {
    private static final int a = 8;
    private final Queue<a> b = new beo<a>();
    private final Object2IntLinkedOpenHashMap<b> c = new Object2IntLinkedOpenHashMap();

    private static long b() {
        return System.currentTimeMillis();
    }

    public synchronized void a(String $$0, Throwable $$1) {
        long $$2 = anp.b();
        String $$3 = $$1.getMessage();
        this.b.add(new a($$2, $$0, $$1.getClass(), $$3));
        while (this.b.size() > 8) {
            this.b.remove();
        }
        b $$4 = new b($$0, $$1.getClass());
        int $$5 = this.c.getInt((Object)$$4);
        this.c.putAndMoveToFirst((Object)$$4, $$5 + 1);
    }

    public synchronized String a() {
        long $$0 = anp.b();
        StringBuilder $$1 = new StringBuilder();
        if (!this.b.isEmpty()) {
            $$1.append("\n\t\tLatest entries:\n");
            for (a $$2 : this.b) {
                $$1.append("\t\t\t").append($$2.b).append(":").append($$2.c).append(": ").append($$2.d).append(" (").append($$0 - $$2.a).append("ms ago)").append("\n");
            }
        }
        if (!this.c.isEmpty()) {
            if ($$1.isEmpty()) {
                $$1.append("\n");
            }
            $$1.append("\t\tEntry counts:\n");
            for (Object2IntMap.Entry $$3 : Object2IntMaps.fastIterable(this.c)) {
                $$1.append("\t\t\t").append(((b)$$3.getKey()).a).append(":").append(((b)$$3.getKey()).b).append(" x ").append($$3.getIntValue()).append("\n");
            }
        }
        if ($$1.isEmpty()) {
            return "~~NONE~~";
        }
        return $$1.toString();
    }

    static final class a
    extends Record {
        final long a;
        final String b;
        final Class<? extends Throwable> c;
        final String d;

        a(long $$0, String $$1, Class<? extends Throwable> $$2, String $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "timestampMs;location;cls;message", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "timestampMs;location;cls;message", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "timestampMs;location;cls;message", "a", "b", "c", "d"}, this, $$0);
        }

        public long a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public Class<? extends Throwable> c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }
    }

    static final class b
    extends Record {
        final String a;
        final Class<? extends Throwable> b;

        b(String $$0, Class<? extends Throwable> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "location;cls", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "location;cls", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "location;cls", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public Class<? extends Throwable> b() {
            return this.b;
        }
    }
}

