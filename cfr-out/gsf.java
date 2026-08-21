/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class gsf
extends gsb {
    private static final yh b = yh.c("gui.stats");
    static final amo c = amo.b("container/slot");
    static final amo d = amo.b("statistics/header");
    static final amo e = amo.b("statistics/sort_up");
    static final amo f = amo.b("statistics/sort_down");
    private static final yh t = yh.c("multiplayer.downloadingStats");
    static final yh u = yh.c("stats.none");
    private static final yh v = yh.c("stat.generalButton");
    private static final yh w = yh.c("stat.itemsButton");
    private static final yh x = yh.c("stat.mobsButton");
    protected final gsb a;
    private static final int y = 280;
    final gou z = new gou(this);
    private final gmu A = new gmu($$1 -> {
        gjc cfr_ignored_0 = (gjc)this.c($$1);
    }, $$1 -> this.e((gmm)$$1));
    private @Nullable gmv B;
    final bdl C;
    private boolean D = true;

    public gsf(gsb $$0, bdl $$12) {
        super(b);
        this.a = $$0;
        this.C = $$12;
    }

    @Override
    protected void bg_() {
        yh $$02 = t;
        this.B = gmv.a(this.A, this.o).a(new gms(this.C(), v, $$02), new gms(this.C(), w, $$02), new gms(this.C(), x, $$02)).a();
        this.c(this.B);
        this.z.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.B.b(0, true);
        this.B.b(1, false);
        this.B.b(2, false);
        this.z.a($$0 -> {
            $$0.e(1);
            this.c($$0);
        });
        this.B.a(0, false);
        this.c();
        this.n.R().b(new ain(ain.a.b));
    }

    public void o() {
        if (this.D) {
            if (this.B != null) {
                this.e(this.B);
            }
            this.B = gmv.a(this.A, this.o).a(new d(v, new a(this.n)), new d(w, new b(this.n)), new d(x, new c(this.n))).a();
            this.a(this.B);
            this.c(this.B);
            this.a(1);
            this.a(2);
            this.B.a(0, false);
            this.c();
            this.D = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(int $$0) {
        if (this.B == null) {
            return;
        }
        var4_2 = this.B.d().get($$0);
        if (!(var4_2 instanceof d)) ** GOTO lbl-1000
        $$1 = (d)var4_2;
        if (!$$1.a.aJ_().isEmpty()) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        $$2 = v0;
        this.B.b($$0, $$2);
        if ($$2) {
            this.B.a($$0, (gks)null);
        } else {
            this.B.a($$0, gks.a(yh.c("gui.stats.none_found")));
        }
    }

    @Override
    protected void c() {
        if (this.B == null) {
            return;
        }
        this.B.a(this.o);
        this.B.h();
        int $$0 = this.B.aV_().c();
        gpm $$1 = new gpm(0, $$0, this.o, this.p - this.z.b() - $$0);
        this.B.d().forEach($$12 -> $$12.a((gjc $$1) -> $$1.d($$1.h())));
        this.A.a($$1);
        this.z.b($$0);
        this.z.a();
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.B != null && this.B.a($$0)) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, gsb.i, 0, this.p - this.z.b(), 0.0f, 0.0f, this.o, 2, 32, 2);
    }

    @Override
    protected void a(gir $$0) {
        $$0.a(hpa.at, gxx.a, 0, 0, 0.0f, 0.0f, this.o, this.z.c(), 16, 16);
        this.a($$0, 0, this.z.c(), this.o, this.p);
    }

    @Override
    public void aX_() {
        this.n.a(this.a);
    }

    static String a(bdh<amo> $$0) {
        return "stat." + $$0.b().toString().replace(':', '.');
    }

    class d
    extends gmr {
        protected final giy<?> a;

        public d(yh $$0, giy<?> $$1) {
            super($$0);
            this.c.a($$1, 1, 1);
            this.a = $$1;
        }

        @Override
        public void a(gpm $$0) {
            this.a.a(gsf.this.o, gsf.this.z.d(), gsf.this.z.c());
            super.a($$0);
        }
    }

    class gsf$a
    extends gkb<a> {
        public gsf$a(gfj $$02) {
            super($$02, gsf.this.o, gsf.this.z.d(), 33, 14);
            ObjectArrayList $$1 = new ObjectArrayList(bdk.i.iterator());
            $$1.sort(Comparator.comparing($$0 -> imu.a(gsf.a($$0), new Object[0])));
            for (bdh $$2 : $$1) {
                this.c(new a($$2));
            }
        }

        @Override
        public int a() {
            return 280;
        }

        @Override
        protected void a(gir $$0) {
        }

        @Override
        protected void b(gir $$0) {
        }

        class a
        extends gkb.a<a> {
            private final bdh<amo> b;
            private final yh c;

            a(bdh<amo> $$0) {
                this.b = $$0;
                this.c = yh.c(gsf.a($$0));
            }

            private String b() {
                return this.b.a(gsf.this.C.a(this.b));
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                int $$5 = this.j() - ((gsf)gsf.this).q.b / 2;
                int $$6 = a.this.aJ_().indexOf(this);
                int $$7 = $$6 % 2 == 0 ? -1 : -4539718;
                $$0.b(gsf.this.q, this.c, this.d() + 2, $$5, $$7);
                String $$8 = this.b();
                $$0.b(gsf.this.q, $$8, this.n() - gsf.this.q.b($$8) - 4, $$5, $$7);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", yh.i().b(this.c).b(yg.x).f(this.b()));
            }
        }
    }

    class gsf$b
    extends gjk<a> {
        private static final int r = 18;
        private static final int s = 22;
        private static final int t = 1;
        private static final int u = 0;
        private static final int v = -1;
        private static final int w = 1;
        protected final List<bdj<dzq>> a;
        protected final List<bdj<dlp>> f;
        protected final Comparator<c> n;
        protected @Nullable bdj<?> o;
        protected int p;

        public gsf$b(gfj $$0) {
            super($$0, gsf.this.o, gsf.this.z.d(), 33, 22);
            this.n = new d();
            this.a = Lists.newArrayList();
            this.a.add(bdk.a);
            this.f = Lists.newArrayList((Object[])new bdj[]{bdk.d, bdk.b, bdk.c, bdk.e, bdk.f});
            Set $$1 = Sets.newIdentityHashSet();
            for (dlp $$2 : mi.h) {
                boolean $$3 = false;
                for (bdj<dlp> bdj2 : this.f) {
                    if (!bdj2.a($$2) || gsf.this.C.a(bdj2.b($$2)) <= 0) continue;
                    $$3 = true;
                }
                if (!$$3) continue;
                $$1.add($$2);
            }
            for (dzq $$5 : mi.e) {
                boolean $$6 = false;
                for (bdj<dgw> bdj3 : this.a) {
                    if (!bdj3.a($$5) || gsf.this.C.a(bdj3.b($$5)) <= 0) continue;
                    $$6 = true;
                }
                if (!$$6) continue;
                $$1.add($$5.h());
            }
            $$1.remove(dlx.a);
            if (!$$1.isEmpty()) {
                this.c(new b());
                for (dlp $$8 : $$1) {
                    this.c(new c($$8));
                }
            }
        }

        @Override
        protected void a(gir $$0) {
        }

        int h(int $$0) {
            return 75 + 40 * $$0;
        }

        @Override
        public int a() {
            return 280;
        }

        bdj<?> i(int $$0) {
            return $$0 < this.a.size() ? this.a.get($$0) : this.f.get($$0 - this.a.size());
        }

        int b(bdj<?> $$0) {
            int $$1 = this.a.indexOf($$0);
            if ($$1 >= 0) {
                return $$1;
            }
            int $$2 = this.f.indexOf($$0);
            if ($$2 >= 0) {
                return $$2 + this.a.size();
            }
            return -1;
        }

        @Override
        protected void a(bdj<?> $$0) {
            if ($$0 != this.o) {
                this.o = $$0;
                this.p = -1;
            } else if (this.p == -1) {
                this.p = 1;
            } else {
                this.o = null;
                this.p = 0;
            }
            this.b(this.n);
        }

        @Override
        protected void b(Comparator<c> $$0) {
            List<c> $$1 = this.d();
            $$1.sort($$0);
            this.b((a)this.aJ_().getFirst());
            for (c $$2 : $$1) {
                this.c($$2);
            }
        }

        private List<c> d() {
            ArrayList<c> $$0 = new ArrayList<c>();
            this.aJ_().forEach($$1 -> {
                if ($$1 instanceof c) {
                    c $$2 = (c)$$1;
                    $$0.add($$2);
                }
            });
            return $$0;
        }

        @Override
        protected void b(gir $$0) {
        }

        class d
        implements Comparator<c> {
            d() {
            }

            public int a(c $$0, c $$1) {
                int $$11;
                int $$10;
                dlp $$2 = $$0.c();
                dlp $$3 = $$1.c();
                if (b.this.o == null) {
                    boolean $$4 = false;
                    boolean $$5 = false;
                } else if (b.this.a.contains(b.this.o)) {
                    bdj<?> $$6 = b.this.o;
                    int $$7 = $$2 instanceof dkb ? gsf.this.C.a($$6, ((dkb)$$2).c()) : -1;
                    int $$8 = $$3 instanceof dkb ? gsf.this.C.a($$6, ((dkb)$$3).c()) : -1;
                } else {
                    bdj<?> $$9 = b.this.o;
                    $$10 = gsf.this.C.a($$9, $$2);
                    $$11 = gsf.this.C.a($$9, $$3);
                }
                if ($$10 == $$11) {
                    return b.this.p * Integer.compare(dlp.a($$2), dlp.a($$3));
                }
                return b.this.p * Integer.compare($$10, $$11);
            }

            @Override
            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((c)object, (c)object2);
            }
        }

        class b
        extends gsf$b$a {
            private static final amo b = amo.b("statistics/block_mined");
            private static final amo c = amo.b("statistics/item_broken");
            private static final amo d = amo.b("statistics/item_crafted");
            private static final amo e = amo.b("statistics/item_used");
            private static final amo f = amo.b("statistics/item_picked_up");
            private static final amo g = amo.b("statistics/item_dropped");
            private final a i;
            private final a j;
            private final a k;
            private final a l;
            private final a m;
            private final a n;
            private final List<gjc> o = new ArrayList<gjc>();

            b() {
                this.i = new a(this, 0, b);
                this.j = new a(this, 1, c);
                this.k = new a(this, 2, d);
                this.l = new a(this, 3, e);
                this.m = new a(this, 4, f);
                this.n = new a(this, 5, g);
                this.o.addAll(List.of(this.i, this.j, this.k, this.l, this.m, this.n));
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                this.i.c(this.d() + b.this.h(0) - 18, this.h() + 1);
                this.i.a($$0, $$1, $$2, $$4);
                this.j.c(this.d() + b.this.h(1) - 18, this.h() + 1);
                this.j.a($$0, $$1, $$2, $$4);
                this.k.c(this.d() + b.this.h(2) - 18, this.h() + 1);
                this.k.a($$0, $$1, $$2, $$4);
                this.l.c(this.d() + b.this.h(3) - 18, this.h() + 1);
                this.l.a($$0, $$1, $$2, $$4);
                this.m.c(this.d() + b.this.h(4) - 18, this.h() + 1);
                this.m.a($$0, $$1, $$2, $$4);
                this.n.c(this.d() + b.this.h(5) - 18, this.h() + 1);
                this.n.a($$0, $$1, $$2, $$4);
                if (b.this.o != null) {
                    int $$5 = b.this.h(b.this.b(b.this.o)) - 36;
                    amo $$6 = b.this.p == 1 ? e : gsf.f;
                    $$0.a(hpa.at, $$6, this.d() + $$5, this.h() + 1, 18, 18);
                }
            }

            @Override
            public List<? extends gmm> aJ_() {
                return this.o;
            }

            @Override
            public List<? extends gpb> b() {
                return this.o;
            }

            class a
            extends gjq {
                private final amo b;

                a(b b2, int $$0, amo $$1) {
                    super(18, 18, new gku(gsf.d, gsf.c), $$2 -> b2.b.this.a(b2.b.this.i($$0)), b2.b.this.i($$0).c());
                    this.b = $$1;
                    this.a(gks.a(this.B()));
                }

                @Override
                public void b(gir $$0, int $$1, int $$2, float $$3) {
                    amo $$4 = this.a.a(this.b(), this.D());
                    $$0.a(hpa.at, $$4, this.aT_(), this.aU_(), this.g, this.h);
                    $$0.a(hpa.at, this.b, this.aT_(), this.aU_(), this.g, this.h);
                }
            }
        }

        class c
        extends gsf$b$a {
            private final dlp b;
            private final a c;

            c(dlp $$0) {
                this.b = $$0;
                this.c = new a($$0.m());
            }

            protected dlp c() {
                return this.b;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                this.c.c(this.d(), this.h());
                this.c.a($$0, $$1, $$2, $$4);
                gsf$b $$5 = b.this;
                int $$6 = $$5.aJ_().indexOf(this);
                for (int $$7 = 0; $$7 < $$5.a.size(); ++$$7) {
                    bdh<?> $$10;
                    dlp dlp2 = this.b;
                    if (dlp2 instanceof dkb) {
                        dkb $$8 = (dkb)dlp2;
                        bdh<dzq> $$9 = $$5.a.get($$7).b($$8.c());
                    } else {
                        $$10 = null;
                    }
                    this.a($$0, $$10, this.d() + b.this.h($$7), this.j() - ((gsf)gsf.this).q.b / 2, $$6 % 2 == 0);
                }
                for (int $$11 = 0; $$11 < $$5.f.size(); ++$$11) {
                    this.a($$0, $$5.f.get($$11).b(this.b), this.d() + b.this.h($$11 + $$5.a.size()), this.j() - ((gsf)gsf.this).q.b / 2, $$6 % 2 == 0);
                }
            }

            protected void a(gir $$0, @Nullable bdh<?> $$1, int $$2, int $$3, boolean $$4) {
                yh $$5 = $$1 == null ? gsf.u : yh.b($$1.a(gsf.this.C.a($$1)));
                $$0.b(gsf.this.q, $$5, $$2 - gsf.this.q.a($$5), $$3, $$4 ? -1 : -4539718);
            }

            @Override
            public List<? extends gpb> b() {
                return List.of(this.c);
            }

            @Override
            public List<? extends gmm> aJ_() {
                return List.of(this.c);
            }

            class a
            extends gjs {
                a(dlt $$0) {
                    super(b.this.c, 1, 1, 18, 18, $$0.y(), $$0, false, true);
                }

                @Override
                protected void a_(gir $$0, int $$1, int $$2, float $$3) {
                    $$0.a(hpa.at, gsf.c, c.this.d(), c.this.h(), 18, 18);
                    super.a_($$0, $$1, $$2, $$3);
                }

                @Override
                protected void a(gir $$0, int $$1, int $$2) {
                    super.a($$0, c.this.d() + 18, c.this.h() + 18);
                }
            }
        }

        static abstract class a
        extends gjk.a<a> {
            a() {
            }
        }
    }

    class c
    extends gkb<a> {
        public c(gfj $$0) {
            super($$0, gsf.this.o, gsf.this.z.d(), 33, ((gsf)gsf.this).q.b * 4);
            for (cgu cgu2 : mi.g) {
                if (gsf.this.C.a(bdk.g.b(cgu2)) <= 0 && gsf.this.C.a(bdk.h.b(cgu2)) <= 0) continue;
                this.c(new a(cgu2));
            }
        }

        @Override
        public int a() {
            return 280;
        }

        @Override
        protected void a(gir $$0) {
        }

        @Override
        protected void b(gir $$0) {
        }

        class a
        extends gkb.a<a> {
            private final yh b;
            private final yh c;
            private final yh d;
            private final boolean e;
            private final boolean f;

            public a(cgu<?> $$0) {
                this.b = $$0.h();
                int $$1 = gsf.this.C.a(bdk.g.b($$0));
                if ($$1 == 0) {
                    this.c = yh.a("stat_type.minecraft.killed.none", this.b);
                    this.e = false;
                } else {
                    this.c = yh.a("stat_type.minecraft.killed", $$1, this.b);
                    this.e = true;
                }
                int $$2 = gsf.this.C.a(bdk.h.b($$0));
                if ($$2 == 0) {
                    this.d = yh.a("stat_type.minecraft.killed_by.none", this.b);
                    this.f = false;
                } else {
                    this.d = yh.a("stat_type.minecraft.killed_by", this.b, $$2);
                    this.f = true;
                }
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                $$0.b(gsf.this.q, this.b, this.d() + 2, this.h() + 1, -1);
                $$0.b(gsf.this.q, this.c, this.d() + 2 + 10, this.h() + 1 + ((gsf)gsf.this).q.b, this.e ? -4539718 : -8355712);
                $$0.b(gsf.this.q, this.d, this.d() + 2 + 10, this.h() + 1 + ((gsf)gsf.this).q.b * 2, this.f ? -4539718 : -8355712);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", yg.a(new yh[]{this.c, this.d}));
            }
        }
    }
}

