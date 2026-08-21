/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gnr
implements AutoCloseable {
    private static final float a = 32.0f;
    private static final goa b = new goa(){

        @Override
        public fwp a() {
            return goe.b;
        }

        @Override
        public @Nullable gnz.a a(float $$0, float $$1, int $$2, int $$3, zf $$4, float $$5, float $$6) {
            return null;
        }
    };
    final gnu c;
    final fwt.a d = new fwt.a(){

        @Override
        public goa a(fwp $$0, fwo $$1) {
            return Objects.requireNonNullElse(gnr.this.c.a($$0, $$1), gnr.this.j);
        }

        @Override
        public goa a() {
            return gnr.this.j;
        }
    };
    private List<fwq.a> e = List.of();
    private List<fwq> f = List.of();
    private final Int2ObjectMap<IntList> g = new Int2ObjectOpenHashMap();
    private final gnn<b> h = new gnn(b[]::new, $$0 -> new b[$$0][]);
    private final IntFunction<b> i = this::a;
    goa j = b;
    private final Supplier<goa> k = () -> this.j;
    private final b l = new b(this.k, this.k);
    private @Nullable goc m;
    private final gip n = new c(false);
    private final gip o = new c(true);

    public gnr(gnu $$02) {
        this.c = $$02;
    }

    public void a(List<fwq.a> $$0, Set<gnq> $$1) {
        this.e = $$0;
        this.a($$1);
    }

    public void a(Set<gnq> $$0) {
        this.f = List.of();
        this.b();
        this.f = this.b(this.e, $$0);
    }

    private void b() {
        this.c.a();
        this.h.a();
        this.g.clear();
        this.j = Objects.requireNonNull(goe.b.a(this.c));
        this.m = goe.a.a(this.c);
    }

    private List<fwq> b(List<fwq.a> $$0, Set<gnq> $$1) {
        IntOpenHashSet $$22 = new IntOpenHashSet();
        ArrayList<fwq> $$3 = new ArrayList<fwq>();
        for (fwq.a $$4 : $$0) {
            if (!$$4.b().a($$1)) continue;
            $$3.add($$4.a());
            $$22.addAll((IntCollection)$$4.a().a());
        }
        HashSet $$5 = Sets.newHashSet();
        $$22.forEach($$2 -> {
            for (fwq $$3 : $$3) {
                fwt $$4 = $$3.a($$2);
                if ($$4 == null) continue;
                $$5.add($$3);
                if ($$4.a() == goe.b) break;
                ((IntList)this.g.computeIfAbsent(bgj.d($$4.a().a(false)), $$0 -> new IntArrayList())).add($$2);
                break;
            }
        });
        return $$3.stream().filter($$5::contains).toList();
    }

    @Override
    public void close() {
        this.c.close();
    }

    private static boolean a(fwp $$0) {
        float $$1 = $$0.a(false);
        if ($$1 < 0.0f || $$1 > 32.0f) {
            return true;
        }
        float $$2 = $$0.a(true);
        return $$2 < 0.0f || $$2 > 32.0f;
    }

    private b a(int $$0) {
        a $$1 = null;
        for (fwq $$2 : this.f) {
            fwt $$3 = $$2.a($$0);
            if ($$3 == null) continue;
            if ($$1 == null) {
                $$1 = new a($$3);
            }
            if (gnr.a($$3.a())) continue;
            if ($$1.b == $$3) {
                return new b($$1, $$1);
            }
            return new b($$1, new a($$3));
        }
        if ($$1 != null) {
            return new b($$1, this.k);
        }
        return this.l;
    }

    b b(int $$0) {
        return this.h.a($$0, this.i);
    }

    public goa a(bgr $$0, int $$1) {
        IntList $$2 = (IntList)this.g.get($$1);
        if ($$2 != null && !$$2.isEmpty()) {
            return this.b($$2.getInt($$0.a($$2.size()))).b().get();
        }
        return this.j;
    }

    public goc a() {
        return Objects.requireNonNull(this.m);
    }

    public gip a(boolean $$0) {
        return $$0 ? this.o : this.n;
    }

    record b(Supplier<goa> a, Supplier<goa> b) {
        Supplier<goa> a(boolean $$0) {
            return $$0 ? this.b : this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "any;nonFishy", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "any;nonFishy", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "any;nonFishy", "a", "b"}, this, $$0);
        }
    }

    public class c
    implements gip {
        private final boolean b;

        public c(boolean $$1) {
            this.b = $$1;
        }

        @Override
        public goa a(int $$0) {
            return gnr.this.b($$0).a(this.b).get();
        }

        @Override
        public goa a(bgr $$0, int $$1) {
            return gnr.this.a($$0, $$1);
        }
    }

    class a
    implements Supplier<goa> {
        final fwt b;
        private @Nullable goa c;

        a(fwt $$0) {
            this.b = $$0;
        }

        public goa a() {
            if (this.c == null) {
                this.c = this.b.a(gnr.this.d);
            }
            return this.c;
        }

        @Override
        public /* synthetic */ Object get() {
            return this.a();
        }
    }
}

