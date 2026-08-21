/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectFunction
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class inz {
    private static final Logger a = LogUtils.getLogger();
    private final Object2ObjectMap<amo, a> b = new Object2ObjectOpenHashMap();
    private final a c;
    private final Object2ObjectFunction<amo, a> d;
    private final ioe.a e;
    private final Queue<a> f = new ArrayDeque<a>();

    public inz(Map<amo, ioi> $$0, ioi $$12) {
        this.c = new a(inv.a, $$12, true);
        this.b.put((Object)inv.a, (Object)this.c);
        this.d = $$1 -> {
            amo $$2 = (amo)$$1;
            ioi $$3 = (ioi)$$0.get($$2);
            if ($$3 == null) {
                a.warn("Missing block model: {}", (Object)$$2);
                return this.c;
            }
            return this.b($$2, $$3);
        };
        this.e = this::a;
    }

    private static boolean a(ioi $$0) {
        return $$0.f() == null;
    }

    private a a(amo $$0) {
        return (a)this.b.computeIfAbsent((Object)$$0, this.d);
    }

    private a b(amo $$0, ioi $$1) {
        boolean $$2 = inz.a($$1);
        a $$3 = new a($$0, $$1, $$2);
        if (!$$2) {
            this.f.add($$3);
        }
        return $$3;
    }

    public void a(ioe $$0) {
        $$0.a(this.e);
    }

    public void a(amo $$0, ioi $$1) {
        if (!inz.a($$1)) {
            a.warn("Trying to add non-root special model {}, ignoring", (Object)$$0);
            return;
        }
        a $$2 = (a)this.b.put((Object)$$0, (Object)this.b($$0, $$1));
        if ($$2 != null) {
            a.warn("Duplicate special model {}", (Object)$$0);
        }
    }

    public iof a() {
        return this.c;
    }

    public Map<amo, iof> b() {
        ArrayList<a> $$0 = new ArrayList<a>();
        this.a($$0);
        inz.b($$0);
        ImmutableMap.Builder $$12 = ImmutableMap.builder();
        this.b.forEach(($$1, $$2) -> {
            if ($$2.l) {
                $$12.put($$1, $$2);
            } else {
                a.warn("Model {} ignored due to cyclic dependency", $$1);
            }
        });
        return $$12.build();
    }

    private void a(List<a> $$0) {
        a $$1;
        while (($$1 = this.f.poll()) != null) {
            a $$3;
            amo $$2 = Objects.requireNonNull($$1.n.f());
            $$1.m = $$3 = this.a($$2);
            if ($$3.l) {
                $$1.l = true;
                continue;
            }
            $$0.add($$1);
        }
    }

    private static void b(List<a> $$0) {
        boolean $$1 = true;
        while ($$1) {
            $$1 = false;
            Iterator<a> $$2 = $$0.iterator();
            while ($$2.hasNext()) {
                a $$3 = $$2.next();
                if (!Objects.requireNonNull($$3.m).l) continue;
                $$3.l = true;
                $$2.remove();
                $$1 = true;
            }
        }
    }

    static class a
    implements iof {
        private static final b<Boolean> c = inz$a.a(0);
        private static final b<ioi.a> d = inz$a.a(1);
        private static final b<ioh> e = inz$a.a(2);
        private static final b<hql> f = inz$a.a(3);
        private static final b<hqp> g = inz$a.a(4);
        private static final b<ilp> h = inz$a.a(5);
        private static final b<iod> i = inz$a.a(6);
        private static final int j = 7;
        private final amo k;
        boolean l;
        @Nullable a m;
        final ioi n;
        private final AtomicReferenceArray<@Nullable Object> o = new AtomicReferenceArray(7);
        private final Map<ioc, iod> p = new ConcurrentHashMap<ioc, iod>();

        private static <T> b<T> a(int $$0) {
            Objects.checkIndex($$0, 7);
            return new b($$0);
        }

        a(amo $$0, ioi $$1, boolean $$2) {
            this.k = $$0;
            this.n = $$1;
            this.l = $$2;
        }

        @Override
        public ioi a() {
            return this.n;
        }

        @Override
        public @Nullable iof b() {
            return this.m;
        }

        @Override
        public String debugName() {
            return this.k.toString();
        }

        private <T> @Nullable T a(b<T> $$0) {
            return (T)this.o.get($$0.a);
        }

        private <T> T a(b<T> $$0, T $$1) {
            T $$2 = this.o.compareAndExchange($$0.a, null, $$1);
            if ($$2 == null) {
                return $$1;
            }
            return $$2;
        }

        private <T> T a(b<T> $$0, Function<iof, T> $$1) {
            T $$2 = this.a($$0);
            if ($$2 != null) {
                return $$2;
            }
            return this.a($$0, $$1.apply(this));
        }

        @Override
        public boolean c() {
            return this.a(c, iof::b);
        }

        @Override
        public ioi.a d() {
            return this.a(d, iof::c);
        }

        @Override
        public hql e() {
            return this.a(f, iof::e);
        }

        @Override
        public ioh f() {
            return this.a(e, iof::d);
        }

        @Override
        public hqp g() {
            return this.a(g, iof::a);
        }

        @Override
        public ilp a(hqp $$0, inw $$1) {
            ilp $$2 = this.a(h);
            if ($$2 != null) {
                return $$2;
            }
            return this.a(h, iof.a($$0, $$1, this));
        }

        private iod b(hqp $$0, inw $$1, ioc $$2) {
            iod $$3 = this.a(i);
            if ($$3 != null) {
                return $$3;
            }
            return this.a(i, this.f().bake($$0, $$1, $$2, this));
        }

        @Override
        public iod a(hqp $$0, inw $$1, ioc $$22) {
            if ($$22 == inm.a) {
                return this.b($$0, $$1, $$22);
            }
            return this.p.computeIfAbsent($$22, $$2 -> {
                ioh $$3 = this.f();
                return $$3.bake($$0, $$1, (ioc)$$2, this);
            });
        }
    }

    static final class b<T>
    extends Record {
        final int a;

        b(int $$0) {
            this.a = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "index", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "index", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "index", "a"}, this, $$0);
        }

        public int a() {
            return this.a;
        }
    }
}

