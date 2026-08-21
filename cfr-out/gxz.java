/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.DataResult;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gxz
extends gsb {
    private static final yh a = yh.c("editGamerule.title");
    private static final int b = 8;
    final gou c = new gou(this);
    private final Consumer<Optional<eua>> d;
    private final Set<f> e = Sets.newHashSet();
    final eua f;
    private @Nullable g t;
    private @Nullable gje u;

    public gxz(eua $$0, Consumer<Optional<eua>> $$1) {
        super(a);
        this.f = $$0;
        this.d = $$1;
    }

    @Override
    protected void bg_() {
        this.c.a(a, this.q);
        this.t = this.c.c(new g(this.f));
        goy $$02 = this.c.b(goy.e().a(8));
        this.u = $$02.a(gje.a(yg.d, (gje $$0) -> this.d.accept(Optional.of(this.f))).a());
        $$02.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a());
        this.c.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.c.a();
        if (this.t != null) {
            this.t.a(this.o, this.c);
        }
    }

    @Override
    public void aX_() {
        this.d.accept(Optional.empty());
    }

    private void o() {
        if (this.u != null) {
            this.u.k = this.e.isEmpty();
        }
    }

    void a(f $$0) {
        this.e.add($$0);
        this.o();
    }

    void b(f $$0) {
        this.e.remove($$0);
        this.o();
    }

    public class g
    extends gjk<f> {
        private static final int f = 24;

        public g(eua $$1) {
            super(gfj.V(), gxz.this.o, gxz.this.c.d(), gxz.this.c.c(), 24);
            final HashMap $$2 = Maps.newHashMap();
            $$1.a(new etz(){

                @Override
                public void b(etv<Boolean> $$02) {
                    this.a($$02, ($$0, $$1, $$2, $$3) -> new a($$0, $$1, $$2, $$3));
                }

                @Override
                public void c(etv<Integer> $$02) {
                    this.a($$02, ($$0, $$1, $$2, $$3) -> new e($$0, $$1, $$2, $$3));
                }

                private <T> void a(etv<T> $$02, c<T> $$1) {
                    String $$11;
                    ImmutableList $$10;
                    yw $$22 = yh.c($$02.c());
                    yw $$3 = yh.b($$02.a()).a(l.o);
                    yw $$4 = yh.a("editGamerule.default", yh.b($$02.a($$02.i()))).a(l.h);
                    String $$5 = $$02.c() + ".description";
                    if (imu.a($$5)) {
                        ImmutableList.Builder $$6 = ImmutableList.builder().add((Object)$$3.g());
                        yw $$7 = yh.c($$5);
                        gxz.this.q.c($$7, 150).forEach(arg_0 -> ((ImmutableList.Builder)$$6).add(arg_0));
                        ImmutableList $$8 = $$6.add((Object)$$4.g()).build();
                        String $$9 = $$7.getString() + "\n" + $$4.getString();
                    } else {
                        $$10 = ImmutableList.of((Object)$$3.g(), (Object)$$4.g());
                        $$11 = $$4.getString();
                    }
                    $$2.computeIfAbsent($$02.e(), $$0 -> Maps.newHashMap()).put($$02, $$1.create($$22, (List<bfr>)$$10, $$11, $$02));
                }
            });
            $$2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(etw::a))).forEach($$02 -> {
                this.c(new b(((etw)$$02.getKey()).b().a(l.r, l.o)));
                ((Map)$$02.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(etv::c))).forEach($$0 -> this.c((f)$$0.getValue()));
            });
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            super.a_($$0, $$1, $$2, $$3);
            f $$4 = (f)this.z();
            if ($$4 != null && $$4.a != null) {
                $$0.a($$4.a, $$1, $$2);
            }
        }
    }

    public class e
    extends d {
        private final gjn d;

        public e(yh $$12, List<bfr> $$2, String $$3, etv<Integer> $$4) {
            super($$2, $$12);
            this.d = new gjn(((gxz)gxz.this).n.g, 10, 5, 44, 20, $$12.f().f("\n").f($$3).f("\n"));
            this.d.a(gxz.this.f.b($$4));
            this.d.b((String $$1) -> {
                DataResult $$2 = $$4.a((String)$$1);
                if ($$2.isSuccess()) {
                    this.d.l(-2039584);
                    gxz.this.b(this);
                    gxz.this.f.a($$4, (Integer)$$2.getOrThrow(), null);
                } else {
                    this.d.l(-65536);
                    gxz.this.a(this);
                }
            });
            this.b.add(this.d);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.a($$0, this.h(), this.d());
            this.d.f(this.n() - 45);
            this.d.g(this.h());
            this.d.a($$0, $$1, $$2, $$4);
        }
    }

    public class a
    extends d {
        private final gjl<Boolean> d;

        public a(yh $$12, List<bfr> $$22, String $$3, etv<Boolean> $$4) {
            super($$22, $$12);
            this.d = gjl.a((boolean)gxz.this.f.a($$4)).a().a((gjl<T> $$1) -> $$1.c().f("\n").f($$3)).a(10, 5, 44, 20, $$12, ($$1, $$2) -> gxz.this.f.a($$4, $$2, null));
            this.b.add(this.d);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.a($$0, this.h(), this.d());
            this.d.f(this.n() - 45);
            this.d.g(this.h());
            this.d.a($$0, $$1, $$2, $$4);
        }
    }

    public abstract class d
    extends f {
        private final List<bfr> a;
        protected final List<gjc> b;

        public d(List<bfr> $$1, yh $$2) {
            super($$1);
            this.b = Lists.newArrayList();
            this.a = ((gxz)gxz.this).n.g.c($$2, 175);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return this.b;
        }

        @Override
        public List<? extends gpb> b() {
            return this.b;
        }

        protected void a(gir $$0, int $$1, int $$2) {
            if (this.a.size() == 1) {
                $$0.b(((gxz)gxz.this).n.g, this.a.get(0), $$2, $$1 + 5, -1);
            } else if (this.a.size() >= 2) {
                $$0.b(((gxz)gxz.this).n.g, this.a.get(0), $$2, $$1, -1);
                $$0.b(((gxz)gxz.this).n.g, this.a.get(1), $$2, $$1 + 10, -1);
            }
        }
    }

    @FunctionalInterface
    static interface c<T> {
        public f create(yh var1, List<bfr> var2, String var3, etv<T> var4);
    }

    public class b
    extends f {
        final yh b;

        public b(yh $$1) {
            super(null);
            this.b = $$1;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.a(((gxz)gxz.this).n.g, this.b, this.m(), this.h() + 5, -1);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return ImmutableList.of();
        }

        @Override
        public List<? extends gpb> b() {
            return ImmutableList.of((Object)new gpb(){

                @Override
                public gpb.a y() {
                    return gpb.a.b;
                }

                @Override
                public void b(gpd $$0) {
                    $$0.a(gpc.a, b.this.b);
                }
            });
        }
    }

    public static abstract class f
    extends gjk.a<f> {
        final @Nullable List<bfr> a;

        public f(@Nullable List<bfr> $$0) {
            this.a = $$0;
        }
    }
}

