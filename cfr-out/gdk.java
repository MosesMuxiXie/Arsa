/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.slf4j.Logger;

class gdk
extends gmr
implements gdh {
    static final Logger b = LogUtils.getLogger();
    static final yh a = yh.c("mco.configure.world.players.title");
    static final yh d = yh.c("mco.question");
    private static final int e = 8;
    final gdi f;
    final gfj g;
    final gio h;
    gbg i;
    final c j;

    gdk(gdi $$0, gfj $$1, gbg $$2) {
        super(a);
        this.f = $$0;
        this.g = $$1;
        this.h = $$0.C();
        this.i = $$2;
        got.b $$32 = this.c.c(8).d(1);
        this.j = $$32.a(new c($$0.o, this.a()), gox.i().d().b());
        $$32.a(gje.a(yh.c("mco.configure.world.buttons.invite"), $$3 -> $$1.a(new gdj($$0, $$2))).a(), gox.i().f().b());
        this.a($$2);
    }

    public int a() {
        return this.f.h() - 20 - 16;
    }

    @Override
    public void a(gpm $$0) {
        this.j.a(this.f.o, this.a(), this.f.a.c());
        super.a($$0);
    }

    @Override
    public void a(gbg $$0) {
        this.i = $$0;
        this.j.a($$0);
    }

    class c
    extends gjk<a> {
        private static final int f = 36;

        public c(int $$0, int $$1) {
            super(gfj.V(), $$0, $$1, gdk.this.f.j(), 36);
        }

        @Override
        void a(gbg $$0) {
            this.s();
            this.b($$0);
        }

        @Override
        private void b(gbg $$02) {
            b $$1 = new b();
            this.a($$1, $$1.a(gdk.this.h.b));
            for (d $$2 : $$02.i.stream().map($$0 -> new d((gay)$$0)).toList()) {
                this.c($$2);
            }
        }

        @Override
        protected void a(gir $$0) {
        }

        @Override
        protected void b(gir $$0) {
        }

        @Override
        public int a() {
            return 300;
        }
    }

    class b
    extends a {
        private String b = "";
        private final gjp c;

        public b() {
            yw $$0 = yh.a("mco.configure.world.invited.number", new Object[]{""}).a(l.t);
            this.c = gjp.a($$0, gdk.this.h).a(false).a(gjp.a.b).a();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            String $$5;
            String string = $$5 = gdk.this.i.i != null ? Integer.toString(gdk.this.i.i.size()) : "0";
            if (!$$5.equals(this.b)) {
                this.b = $$5;
                yw $$6 = yh.a("mco.configure.world.invited.number", new Object[]{$$5}).a(l.t);
                this.c.a_($$6);
            }
            this.c.c(gdk.this.j.w() + gdk.this.j.a() / 2 - this.c.aS_() / 2, this.aU_() + this.aR_() / 2 - this.c.aR_() / 2);
            this.c.a($$0, $$1, $$2, $$4);
        }

        int a(int $$0) {
            return $$0 + this.c.e() * 2;
        }

        @Override
        public List<? extends gpb> b() {
            return List.of(this.c);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return List.of(this.c);
        }
    }

    class d
    extends a {
        protected static final int a = 32;
        private static final yh c = yh.c("mco.configure.world.invites.normal.tooltip");
        private static final yh d = yh.c("mco.configure.world.invites.ops.tooltip");
        private static final yh e = yh.c("mco.configure.world.invites.remove.tooltip");
        private static final amo f = amo.b("player_list/make_operator");
        private static final amo g = amo.b("player_list/remove_operator");
        private static final amo i = amo.b("player_list/remove_player");
        private static final int j = 8;
        private static final int k = 7;
        private final gay l;
        private final gje m;
        private final gje n;
        private final gje o;

        public d(gay $$0) {
            this.l = $$0;
            int $$12 = gdk.this.i.i.indexOf(this.l);
            this.n = gkn.a(c, $$1 -> this.a($$12), false).a(f, 8, 7).a(16 + gdk.this.f.C().a(c)).a((Supplier<yw> $$1) -> yg.a(yh.a("mco.invited.player.narration", new Object[]{$$0.a}), (yh)$$1.get(), yh.a("narration.cycle_button.usage.focused", d))).b();
            this.o = gkn.a(d, $$1 -> this.b($$12), false).a(g, 8, 7).a(16 + gdk.this.f.C().a(d)).a((Supplier<yw> $$1) -> yg.a(yh.a("mco.invited.player.narration", new Object[]{$$0.a}), (yh)$$1.get(), yh.a("narration.cycle_button.usage.focused", c))).b();
            this.m = gkn.a(e, $$1 -> this.c($$12), false).a(i, 8, 7).a(16 + gdk.this.f.C().a(e)).a((Supplier<yw> $$1) -> yg.a(new yh[]{yh.a("mco.invited.player.narration", new Object[]{$$0.a}), (yh)$$1.get()})).b();
            this.c();
        }

        private void a(int $$02) {
            UUID $$12 = gdk.this.i.i.get((int)$$02).b;
            gdz.a((fzz $$1) -> $$1.b(gdk.this.i.b, $$12), (gce $$0) -> b.error("Couldn't op the user", (Throwable)$$0)).thenAcceptAsync($$0 -> {
                this.a((gat)$$0);
                this.c();
                this.a(this.o);
            }, (Executor)gdk.this.g);
        }

        private void b(int $$02) {
            UUID $$12 = gdk.this.i.i.get((int)$$02).b;
            gdz.a((fzz $$1) -> $$1.c(gdk.this.i.b, $$12), (gce $$0) -> b.error("Couldn't deop the user", (Throwable)$$0)).thenAcceptAsync($$0 -> {
                this.a((gat)$$0);
                this.c();
                this.a(this.n);
            }, (Executor)gdk.this.g);
        }

        private void c(int $$0) {
            if ($$0 >= 0 && $$0 < gdk.this.i.i.size()) {
                gay $$1 = gdk.this.i.i.get($$0);
                gcp $$22 = new gcp($$2 -> {
                    if ($$2) {
                        gdz.a((fzz $$1) -> $$1.a(gdk.this.i.b, $$0.b), (gce $$0) -> b.error("Couldn't uninvite user", (Throwable)$$0));
                        gdk.this.i.i.remove($$0);
                        gdk.this.a(gdk.this.i);
                    }
                    gdk.this.g.a(gdk.this.f);
                }, d, (yh)yh.a("mco.configure.world.uninvite.player", new Object[]{$$1.a}));
                gdk.this.g.a($$22);
            }
        }

        private void a(gat $$0) {
            for (gay $$1 : gdk.this.i.i) {
                $$1.c = $$0.a().contains($$1.a);
            }
        }

        private void c() {
            this.n.l = !this.l.c;
            this.o.l = !this.n.l;
        }

        private gje t() {
            if (this.n.l) {
                return this.n;
            }
            return this.o;
        }

        @Override
        public List<? extends gmm> aJ_() {
            return ImmutableList.of((Object)this.t(), (Object)this.m);
        }

        @Override
        public List<? extends gpb> b() {
            return ImmutableList.of((Object)this.t(), (Object)this.m);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$7;
            if (!this.l.d) {
                int $$5 = -6250336;
            } else if (this.l.e) {
                int $$6 = -16711936;
            } else {
                $$7 = -1;
            }
            int $$8 = this.j() - 16;
            gdz.a($$0, this.d(), $$8, 32, this.l.b);
            int $$9 = this.j() - gdk.this.h.b / 2;
            $$0.b(gdk.this.h, this.l.a, this.d() + 8 + 32, $$9, $$7);
            int $$10 = this.j() - 10;
            int $$11 = this.n() - this.m.aS_();
            this.m.c($$11, $$10);
            this.m.a($$0, $$1, $$2, $$4);
            int $$12 = $$11 - this.t().aS_() - 8;
            this.n.c($$12, $$10);
            this.n.a($$0, $$1, $$2, $$4);
            this.o.c($$12, $$10);
            this.o.a($$0, $$1, $$2, $$4);
        }
    }

    static abstract class a
    extends gjk.a<a> {
        a() {
        }
    }
}

