/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongArraySet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class tf {
    public static final int a = 8;
    private static final Logger b = LogUtils.getLogger();
    final axf c;
    private final ti d;
    private final List<ta> e;
    private ImmutableList<st> f;
    final List<sv> g = Lists.newArrayList();
    private final List<ta> h = Lists.newArrayList();
    private final b i;
    private boolean j = true;
    private @Nullable jd<tv> k;
    private final c l;
    private final c m;
    final boolean n;
    private final boolean o;

    protected tf(b $$02, Collection<st> $$1, axf $$2, ti $$3, c $$4, c $$5, boolean $$6, boolean $$7) {
        this.c = $$2;
        this.d = $$3;
        this.i = $$02;
        this.l = $$4;
        this.m = $$5;
        this.f = ImmutableList.copyOf($$1);
        this.n = $$6;
        this.o = $$7;
        this.e = this.f.stream().flatMap($$0 -> $$0.b().stream()).collect(bhs.b());
        $$3.a(this);
        this.e.forEach($$0 -> $$0.a(new tp()));
    }

    public List<ta> a() {
        return this.e;
    }

    public void b() {
        this.j = false;
        this.a(0);
    }

    public void c() {
        this.j = true;
        if (this.k != null) {
            this.d();
        }
    }

    public void a(ta $$0) {
        ta $$1 = $$0.D();
        $$0.C().forEach($$2 -> $$2.a($$0, $$1, this));
        this.e.add($$1);
        this.h.add($$1);
        if (this.j) {
            this.e();
        }
    }

    void a(final int $$02) {
        if ($$02 >= this.f.size()) {
            this.d();
            this.e();
            return;
        }
        if ($$02 > 0 && this.o) {
            st $$12 = (st)this.f.get($$02 - 1);
            $$12.b().forEach($$0 -> {
                emz $$1 = $$0.f();
                ts.a($$1.d(), this.c);
                this.c.b($$1.aD_(), false);
            });
        }
        final st $$2 = (st)this.f.get($$02);
        this.l.a(this.c);
        this.m.a(this.c);
        Collection<ta> $$3 = this.a($$2.b());
        b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$2.c().g(), $$2.a(), $$3.size()});
        this.d();
        this.k = $$2.c();
        this.k.a().a(this.c);
        this.g.forEach($$1 -> $$1.a($$2));
        final to $$4 = new to();
        $$3.forEach($$4::a);
        $$4.a(new td(){

            private void b(ta $$022) {
                $$022.f().F();
                if ($$4.i()) {
                    tf.this.g.forEach($$1 -> $$1.b($$2));
                    LongArraySet $$12 = new LongArraySet(tf.this.c.D());
                    $$12.forEach($$0 -> tf.this.c.a(dvu.a($$0), dvu.b($$0), false));
                    tf.this.a($$02 + 1);
                }
            }

            @Override
            public void a(ta $$0) {
            }

            @Override
            public void a(ta $$0, tf $$1) {
                this.b($$0);
            }

            @Override
            public void b(ta $$022, tf $$1) {
                if (tf.this.n) {
                    tf.this.d();
                    LongArraySet $$22 = new LongArraySet(tf.this.c.D());
                    $$22.forEach($$0 -> tf.this.c.a(dvu.a($$0), dvu.b($$0), false));
                    ti.a.a();
                    $$022.f().F();
                } else {
                    this.b($$022);
                }
            }

            @Override
            public void a(ta $$0, ta $$1, tf $$22) {
            }
        });
        $$3.forEach(this.d::a);
    }

    void d() {
        if (this.k != null) {
            this.k.a().b(this.c);
            this.k = null;
        }
    }

    private void e() {
        if (!this.h.isEmpty()) {
            b.info("Starting re-run of tests: {}", (Object)this.h.stream().map($$0 -> $$0.b().toString()).collect(Collectors.joining(", ")));
            this.f = ImmutableList.copyOf(this.i.batch(this.h));
            this.h.clear();
            this.j = false;
            this.a(0);
        } else {
            this.f = ImmutableList.of();
            this.j = true;
        }
    }

    public void a(sv $$0) {
        this.g.add($$0);
    }

    private Collection<ta> a(Collection<ta> $$0) {
        return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
    }

    private Optional<ta> b(ta $$0) {
        if ($$0.c() == null) {
            return this.m.spawnStructure($$0);
        }
        return this.l.spawnStructure($$0);
    }

    public static interface b {
        public Collection<st> batch(Collection<ta> var1);
    }

    public static interface c {
        public static final c a = $$02 -> Optional.ofNullable($$02.o()).map($$0 -> $$0.a(1));
        public static final c b = $$0 -> Optional.empty();

        public Optional<ta> spawnStructure(ta var1);

        default public void a(axf $$0) {
        }
    }

    public static class a {
        private final axf a;
        private final ti b = ti.a;
        private b c = su.a();
        private c d = tf$c.a;
        private c e = tf$c.b;
        private final Collection<st> f;
        private boolean g = false;
        private boolean h = false;

        private a(Collection<st> $$0, axf $$1) {
            this.f = $$0;
            this.a = $$1;
        }

        public static a a(Collection<st> $$0, axf $$1) {
            return new a($$0, $$1);
        }

        public static a b(Collection<ta> $$0, axf $$1) {
            return tf$a.a(su.a().batch($$0), $$1);
        }

        public a a() {
            this.g = true;
            return this;
        }

        public a b() {
            this.h = true;
            return this;
        }

        public a a(c $$0) {
            this.e = $$0;
            return this;
        }

        public a a(tr $$0) {
            this.d = $$0;
            return this;
        }

        public a a(b $$0) {
            this.c = $$0;
            return this;
        }

        public tf c() {
            return new tf(this.c, this.f, this.a, this.b, this.d, this.e, this.g, this.h);
        }
    }
}

