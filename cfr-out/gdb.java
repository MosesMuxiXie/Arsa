/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gdb
extends isc {
    static final Logger a = LogUtils.getLogger();
    static final amo b = amo.b("widget/slot_frame");
    private static final yh c = yh.c("mco.template.button.select");
    private static final yh F = yh.c("mco.template.button.trailer");
    private static final yh G = yh.c("mco.template.button.publisher");
    private static final int H = 100;
    final gou I = new gou(this);
    final Consumer<gbz> J;
    b K;
    private final gbg.d L;
    private final List<yh> M;
    private gje N;
    private gje O;
    private gje P;
    @Nullable gbz Q = null;
    @Nullable String R;
    @Nullable List<gea.a> S;

    public gdb(yh $$0, Consumer<gbz> $$1, gbg.d $$2, @Nullable gca $$3) {
        this($$0, $$1, $$2, $$3, List.of());
    }

    public gdb(yh $$0, Consumer<gbz> $$1, gbg.d $$2, @Nullable gca $$3, List<yh> $$4) {
        super($$0);
        this.J = $$1;
        this.L = $$2;
        if ($$3 == null) {
            this.K = new b();
            this.a(new gca(10));
        } else {
            this.K = new b(Lists.newArrayList($$3.b()));
            this.a($$3);
        }
        this.M = $$4;
    }

    @Override
    public void bg_() {
        this.I.b(33 + this.M.size() * (this.C().b + 4));
        goy $$02 = this.I.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(this.m, this.q));
        this.M.forEach($$1 -> $$02.a(new gko((yh)$$1, this.q)));
        this.K = this.I.c(new b(this.K.d()));
        goy $$12 = this.I.b(goy.e().a(8));
        $$12.c().b();
        this.O = $$12.a(gje.a(F, (gje $$0) -> this.J()).a(100).a());
        this.N = $$12.a(gje.a(c, (gje $$0) -> this.I()).a(100).a());
        $$12.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a(100).a());
        this.P = $$12.a(gje.a(G, (gje $$0) -> this.K()).a(100).a());
        this.o();
        this.I.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.K.a(this.o, this.I);
        this.I.a();
    }

    @Override
    public yh i() {
        ArrayList $$0 = Lists.newArrayListWithCapacity((int)2);
        $$0.add(this.m);
        $$0.addAll(this.M);
        return yg.a($$0);
    }

    void o() {
        this.P.l = this.Q != null && !this.Q.e().isEmpty();
        this.O.l = this.Q != null && !this.Q.g().isEmpty();
        this.N.k = this.Q != null;
    }

    @Override
    public void aX_() {
        this.J.accept(null);
    }

    private void I() {
        if (this.Q != null) {
            this.J.accept(this.Q);
        }
    }

    private void J() {
        if (this.Q != null && !this.Q.g().isBlank()) {
            gqz.a((gsb)this, this.Q.g());
        }
    }

    private void K() {
        if (this.Q != null && !this.Q.e().isBlank()) {
            gqz.a((gsb)this, this.Q.e());
        }
    }

    private void a(final gca $$0) {
        new Thread("realms-template-fetcher"){

            @Override
            public void run() {
                gca $$02 = $$0;
                fzz $$1 = fzz.a();
                while ($$02 != null) {
                    Either<gca, Exception> $$2 = gdb.this.a($$02, $$1);
                    $$02 = gdb.this.n.a(() -> {
                        if ($$2.right().isPresent()) {
                            a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                            if (gdb.this.K.c()) {
                                gdb.this.S = gea.a(imu.a("mco.template.select.failure", new Object[0]), new gea.b[0]);
                            }
                            return null;
                        }
                        gca $$1 = (gca)$$2.left().get();
                        for (gbz $$2 : $$1.b()) {
                            gdb.this.K.a($$2);
                        }
                        if ($$1.b().isEmpty()) {
                            if (gdb.this.K.c()) {
                                String $$3 = imu.a("mco.template.select.none", "%link");
                                gea.b $$4 = gea.b.a(imu.a("mco.template.select.none.linkTitle", new Object[0]), bez.t.toString());
                                gdb.this.S = gea.a($$3, $$4);
                            }
                            return null;
                        }
                        return $$1;
                    }).join();
                }
            }
        }.start();
    }

    Either<gca, Exception> a(gca $$0, fzz $$1) {
        try {
            return Either.left((Object)$$1.a($$0.c() + 1, $$0.d(), this.L));
        }
        catch (gce $$2) {
            return Either.right((Object)$$2);
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.R = null;
        if (this.S != null) {
            this.a($$0, $$1, $$2, this.S);
        }
    }

    private void a(gir $$02, int $$1, int $$2, List<gea.a> $$3) {
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            gea.a $$5 = $$3.get($$4);
            int $$6 = gdb.a(4 + $$4);
            int $$7 = $$5.a.stream().mapToInt($$0 -> this.q.b($$0.a())).sum();
            int $$8 = this.o / 2 - $$7 / 2;
            for (gea.b $$9 : $$5.a) {
                int $$10 = $$9.b() ? -13408581 : -1;
                String $$11 = $$9.a();
                $$02.b(this.q, $$11, $$8, $$6, $$10);
                int $$12 = $$8 + this.q.b($$11);
                if ($$9.b() && $$1 > $$8 && $$1 < $$12 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
                    $$02.a(yh.b($$9.c()), $$1, $$2);
                    this.R = $$9.c();
                }
                $$8 = $$12;
            }
        }
    }

    class b
    extends gkb<a> {
        public b() {
            this(Collections.emptyList());
        }

        public b(Iterable<gbz> $$0) {
            super(gfj.V(), gdb.this.o, gdb.this.I.d(), gdb.this.I.c(), 46);
            $$0.forEach(this::a);
        }

        @Override
        public void a(gbz $$0) {
            this.c(new a($$0));
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if (gdb.this.R != null) {
                gqz.a((gsb)gdb.this, gdb.this.R);
                return true;
            }
            return super.a($$0, $$1);
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            gdb.this.Q = $$0 == null ? null : $$0.a;
            gdb.this.o();
        }

        @Override
        public int a() {
            return 300;
        }

        public boolean c() {
            return this.u() == 0;
        }

        public List<gbz> d() {
            return this.aJ_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
        }
    }

    class a
    extends gkb.a<a> {
        private static final gku c = new gku(amo.b("icon/link"), amo.b("icon/link_highlighted"));
        private static final gku d = new gku(amo.b("icon/video_link"), amo.b("icon/video_link_highlighted"));
        private static final yh e = yh.c("mco.template.info.tooltip");
        private static final yh f = yh.c("mco.template.trailer.tooltip");
        public final gbz a;
        private @Nullable gjq g;
        private @Nullable gjq i;

        public a(gbz $$0) {
            this.a = $$0;
            if (!$$0.e().isBlank()) {
                this.g = new gjq(15, 15, c, gqz.b((gsb)gdb.this, $$0.e()), e);
                this.g.a(gks.a(e));
            }
            if (!$$0.g().isBlank()) {
                this.i = new gjq(15, 15, d, gqz.b((gsb)gdb.this, $$0.g()), f);
                this.i.a(gks.a(f));
            }
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            gdb.this.Q = this.a;
            gdb.this.o();
            if ($$1 && this.aP_()) {
                gdb.this.J.accept(this.a);
            }
            if (this.g != null) {
                this.g.a($$0, $$1);
            }
            if (this.i != null) {
                this.i.a($$0, $$1);
            }
            return super.a($$0, $$1);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.a(hpa.at, gdy.a(this.a.a(), this.a.f()), this.d() + 1, this.h() + 1 + 1, 0.0f, 0.0f, 38, 38, 38, 38);
            $$0.a(hpa.at, b, this.d(), this.h() + 1, 40, 40);
            int $$5 = 5;
            int $$6 = gdb.this.q.b(this.a.c());
            if (this.g != null) {
                this.g.c(this.n() - $$6 - this.g.aS_() - 10, this.h());
                this.g.a($$0, $$1, $$2, $$4);
            }
            if (this.i != null) {
                this.i.c(this.n() - $$6 - this.i.aS_() * 2 - 15, this.h());
                this.i.a($$0, $$1, $$2, $$4);
            }
            int $$7 = this.d() + 45 + 20;
            int $$8 = this.h() + 5;
            $$0.b(gdb.this.q, this.a.b(), $$7, $$8, -1);
            $$0.b(gdb.this.q, this.a.c(), this.n() - $$6 - 5, $$8, -6250336);
            $$0.b(gdb.this.q, this.a.d(), $$7, $$8 + ((gdb)gdb.this).q.b + 5, -6250336);
            if (!this.a.h().isBlank()) {
                $$0.b(gdb.this.q, this.a.h(), $$7, this.k() - ((gdb)gdb.this).q.b / 2 - 5, -8355712);
            }
        }

        @Override
        public yh a() {
            yh $$0 = yg.b(yh.b(this.a.b()), yh.a("mco.template.select.narrate.authors", new Object[]{this.a.d()}), yh.b(this.a.h()), yh.a("mco.template.select.narrate.version", new Object[]{this.a.c()}));
            return yh.a("narrator.select", $$0);
        }
    }
}

