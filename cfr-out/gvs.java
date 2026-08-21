/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gvs
extends gkb<a> {
    static final amo a = amo.b("server_list/incompatible");
    static final amo f = amo.b("server_list/unreachable");
    static final amo n = amo.b("server_list/ping_1");
    static final amo o = amo.b("server_list/ping_2");
    static final amo p = amo.b("server_list/ping_3");
    static final amo q = amo.b("server_list/ping_4");
    static final amo r = amo.b("server_list/ping_5");
    static final amo s = amo.b("server_list/pinging_1");
    static final amo t = amo.b("server_list/pinging_2");
    static final amo u = amo.b("server_list/pinging_3");
    static final amo v = amo.b("server_list/pinging_4");
    static final amo w = amo.b("server_list/pinging_5");
    static final amo x = amo.b("server_list/join_highlighted");
    static final amo y = amo.b("server_list/join");
    static final amo z = amo.b("server_list/move_up_highlighted");
    static final amo A = amo.b("server_list/move_up");
    static final amo B = amo.b("server_list/move_down_highlighted");
    static final amo C = amo.b("server_list/move_down");
    static final Logger D = LogUtils.getLogger();
    static final ThreadPoolExecutor E = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new p(D)).build());
    static final yh F = yh.c("lanServer.scanning");
    static final yh G = yh.c("multiplayer.status.cannot_resolve").b(-65536);
    static final yh H = yh.c("multiplayer.status.cannot_connect").b(-65536);
    static final yh I = yh.c("multiplayer.status.incompatible");
    static final yh J = yh.c("multiplayer.status.no_connection");
    static final yh K = yh.c("multiplayer.status.pinging");
    static final yh L = yh.c("multiplayer.status.online");
    private final gvp M;
    private final List<d> N = Lists.newArrayList();
    private final a O = new b();
    private final List<c> P = Lists.newArrayList();

    public gvs(gvp $$0, gfj $$1, int $$2, int $$3, int $$4, int $$5) {
        super($$1, $$2, $$3, $$4, $$5);
        this.M = $$0;
    }

    private void I() {
        a $$0 = (a)this.q();
        ArrayList<d> $$1 = new ArrayList<d>(this.N);
        $$1.add((d)this.O);
        $$1.addAll(this.P);
        this.a($$1);
        if ($$0 != null) {
            for (a a2 : $$1) {
                if (!a2.a($$0)) continue;
                this.a(a2);
                break;
            }
        }
    }

    @Override
    public void a(@Nullable a $$0) {
        super.a($$0);
        this.M.o();
    }

    @Override
    public void a(hiu $$0) {
        this.N.clear();
        for (int $$1 = 0; $$1 < $$0.c(); ++$$1) {
            this.N.add(new d(this.M, $$0.a($$1)));
        }
        this.I();
    }

    @Override
    public void b(List<iqb> $$0) {
        int $$1 = $$0.size() - this.P.size();
        this.P.clear();
        for (iqb $$2 : $$0) {
            this.P.add(new c(this.M, $$2));
        }
        this.I();
        for (int $$3 = this.P.size() - $$1; $$3 < this.P.size(); ++$$3) {
            c $$4 = this.P.get($$3);
            int $$5 = $$3 - this.P.size() + this.aJ_().size();
            int $$6 = this.a($$5);
            int $$7 = this.b($$5);
            if ($$7 < this.aU_() || $$6 > this.F()) continue;
            this.c.aZ().c(yh.a("multiplayer.lan.server_found", $$4.c()));
        }
    }

    @Override
    public int a() {
        return 305;
    }

    public void d() {
    }

    public static class b
    extends a {
        private final gfj a = gfj.V();
        private final gju b;

        public b() {
            this.b = new gju(this.a.g, F);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.b.c(this.m() - this.a.g.a(F) / 2, this.h());
            this.b.a($$0, $$1, $$2, $$4);
        }

        @Override
        public yh a() {
            return F;
        }

        @Override
        boolean a(a $$0) {
            return $$0 instanceof b;
        }

        @Override
        public void b() {
        }
    }

    public static abstract class a
    extends gkb.a<a>
    implements AutoCloseable {
        @Override
        public void close() {
        }

        abstract boolean a(a var1);

        public abstract void b();
    }

    public class d
    extends a
    implements gkl {
        private static final int b = 32;
        private static final int c = 5;
        private static final int d = 10;
        private static final int e = 8;
        private final gvp f;
        private final gfj g;
        private final hit i;
        private final grl j;
        private byte @Nullable [] k;
        private @Nullable List<yh> l;
        private @Nullable amo m;
        private @Nullable yh n;

        protected d(gvp $$1, hit $$2) {
            this.f = $$1;
            this.i = $$2;
            this.g = gfj.V();
            this.j = grl.b(this.g.af(), $$2.b);
            this.f();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            byte[] $$10;
            if (this.i.h() == hit.b.a) {
                this.i.a(hit.b.b);
                this.i.d = yg.a;
                this.i.c = yg.a;
                E.submit(() -> {
                    try {
                        this.f.p().a(this.i, () -> this.g.execute(this::c), () -> {
                            this.i.a(this.i.g == w.b().d() ? hit.b.e : hit.b.d);
                            this.g.execute(this::f);
                        }, axw.a(this.g.k.aU()));
                    }
                    catch (UnknownHostException $$0) {
                        this.i.a(hit.b.c);
                        this.i.d = G;
                        this.g.execute(this::f);
                    }
                    catch (Exception $$1) {
                        this.i.a(hit.b.c);
                        this.i.d = H;
                        this.g.execute(this::f);
                    }
                });
            }
            $$0.b(this.g.g, this.i.a, this.d() + 32 + 3, this.h() + 1, -1);
            List<bfr> $$5 = this.g.g.c(this.i.d, this.l() - 32 - 2);
            for (int $$6 = 0; $$6 < Math.min($$5.size(), 2); ++$$6) {
                $$0.b(this.g.g, $$5.get($$6), this.d() + 32 + 3, this.h() + 12 + this.g.g.b * $$6, -8355712);
            }
            this.a($$0, this.d(), this.h(), this.j.b());
            int $$7 = gvs.this.aJ_().indexOf(this);
            if (this.i.h() == hit.b.b) {
                int $$8 = (int)(bhs.c() / 100L + (long)($$7 * 2) & 7L);
                if ($$8 > 4) {
                    $$8 = 8 - $$8;
                }
                this.m = switch ($$8) {
                    default -> s;
                    case 1 -> t;
                    case 2 -> u;
                    case 3 -> v;
                    case 4 -> w;
                };
            }
            int $$9 = this.n() - 10 - 5;
            if (this.m != null) {
                $$0.a(hpa.at, this.m, $$9, this.h(), 10, 8);
            }
            if (!Arrays.equals($$10 = this.i.c(), this.k)) {
                if (this.a($$10)) {
                    this.k = $$10;
                } else {
                    this.i.a((byte[])null);
                    this.c();
                }
            }
            yh $$11 = this.i.h() == hit.b.d ? this.i.h.f().a(l.m) : this.i.c;
            int $$12 = this.g.g.a($$11);
            int $$13 = $$9 - $$12 - 5;
            $$0.b(this.g.g, $$11, $$13, this.h() + 1, -8355712);
            if (this.n != null && $$1 >= $$9 && $$1 <= $$9 + 10 && $$2 >= this.h() && $$2 <= this.h() + 8) {
                $$0.a(this.n, $$1, $$2);
            } else if (this.l != null && $$1 >= $$13 && $$1 <= $$13 + $$12 && $$2 >= this.h() && $$2 <= this.h() - 1 + this.g.g.b) {
                $$0.a(Lists.transform(this.l, yh::g), $$1, $$2);
            }
            if (this.g.k.an().b().booleanValue() || $$3) {
                $$0.a(this.d(), this.h(), this.d() + 32, this.h() + 32, -1601138544);
                int $$14 = $$1 - this.d();
                int $$15 = $$2 - this.h();
                if (this.c($$14, $$15, 32)) {
                    $$0.a(hpa.at, x, this.d(), this.h(), 32, 32);
                    gvs.this.d($$0);
                } else {
                    $$0.a(hpa.at, y, this.d(), this.h(), 32, 32);
                }
                if ($$7 > 0) {
                    if (this.f($$14, $$15, 32)) {
                        $$0.a(hpa.at, z, this.d(), this.h(), 32, 32);
                        gvs.this.d($$0);
                    } else {
                        $$0.a(hpa.at, A, this.d(), this.h(), 32, 32);
                    }
                }
                if ($$7 < this.f.F().c() - 1) {
                    if (this.g($$14, $$15, 32)) {
                        $$0.a(hpa.at, B, this.d(), this.h(), 32, 32);
                        gvs.this.d($$0);
                    } else {
                        $$0.a(hpa.at, C, this.d(), this.h(), 32, 32);
                    }
                }
            }
        }

        private void f() {
            this.l = null;
            switch (this.i.h()) {
                case a: 
                case b: {
                    this.m = n;
                    this.n = K;
                    break;
                }
                case d: {
                    this.m = a;
                    this.n = I;
                    this.l = this.i.i;
                    break;
                }
                case c: {
                    this.m = f;
                    this.n = J;
                    break;
                }
                case e: {
                    this.m = this.i.f < 150L ? r : (this.i.f < 300L ? q : (this.i.f < 600L ? p : (this.i.f < 1000L ? o : n)));
                    this.n = yh.a("multiplayer.status.ping", this.i.f);
                    this.l = this.i.i;
                }
            }
        }

        public void c() {
            this.f.F().b();
        }

        protected void a(gir $$0, int $$1, int $$2, amo $$3) {
            $$0.a(hpa.at, $$3, $$1, $$2, 0.0f, 0.0f, 32, 32, 32, 32);
        }

        private boolean a(byte @Nullable [] $$0) {
            if ($$0 == null) {
                this.j.a();
            } else {
                try {
                    this.j.a(fyh.a($$0));
                }
                catch (Throwable $$1) {
                    D.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, $$1});
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c()) {
                this.b();
                return true;
            }
            if ($$0.m()) {
                gvs $$1 = this.f.a;
                int $$2 = $$1.aJ_().indexOf(this);
                if ($$2 == -1) {
                    return true;
                }
                if ($$0.i() && $$2 < this.f.F().c() - 1 || $$0.h() && $$2 > 0) {
                    this.a($$2, $$0.i() ? $$2 + 1 : $$2 - 1);
                    return true;
                }
            }
            return super.a($$0);
        }

        @Override
        public void b() {
            this.f.a(this.i);
        }

        private void a(int $$0, int $$1) {
            this.f.F().a($$0, $$1);
            this.f.a.a($$0, $$1);
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            int $$3;
            int $$2 = (int)$$0.u() - this.d();
            if (this.c($$2, $$3 = (int)$$0.v() - this.h(), 32)) {
                this.b();
                return true;
            }
            int $$4 = this.f.a.aJ_().indexOf(this);
            if ($$4 > 0 && this.f($$2, $$3, 32)) {
                this.a($$4, $$4 - 1);
                return true;
            }
            if ($$4 < this.f.F().c() - 1 && this.g($$2, $$3, 32)) {
                this.a($$4, $$4 + 1);
                return true;
            }
            if ($$1) {
                this.b();
            }
            return super.a($$0, $$1);
        }

        public hit e() {
            return this.i;
        }

        @Override
        public yh a() {
            yw $$0 = yh.i();
            $$0.b(yh.a("narrator.select", new Object[]{this.i.a}));
            $$0.b(yg.v);
            switch (this.i.h()) {
                case d: {
                    $$0.b(I);
                    $$0.b(yg.v);
                    $$0.b(yh.a("multiplayer.status.version.narration", this.i.h));
                    $$0.b(yg.v);
                    $$0.b(yh.a("multiplayer.status.motd.narration", this.i.d));
                    break;
                }
                case c: {
                    $$0.b(J);
                    break;
                }
                case b: {
                    $$0.b(K);
                    break;
                }
                default: {
                    $$0.b(L);
                    $$0.b(yg.v);
                    $$0.b(yh.a("multiplayer.status.ping.narration", this.i.f));
                    $$0.b(yg.v);
                    $$0.b(yh.a("multiplayer.status.motd.narration", this.i.d));
                    if (this.i.e == null) break;
                    $$0.b(yg.v);
                    $$0.b(yh.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                    $$0.b(yg.v);
                    $$0.b(yk.a(this.i.i, yh.b(", ")));
                }
            }
            return $$0;
        }

        @Override
        public void close() {
            this.j.close();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        boolean a(a $$0) {
            if (!($$0 instanceof d)) return false;
            d $$1 = (d)$$0;
            if ($$1.i != this.i) return false;
            return true;
        }
    }

    public static class c
    extends a {
        private static final int c = 32;
        private static final yh d = yh.c("lanServer.title");
        private static final yh e = yh.c("selectServer.hiddenAddress");
        private final gvp f;
        protected final gfj a;
        protected final iqb b;

        protected c(gvp $$0, iqb $$1) {
            this.f = $$0;
            this.b = $$1;
            this.a = gfj.V();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.b(this.a.g, d, this.d() + 32 + 3, this.h() + 1, -1);
            $$0.b(this.a.g, this.b.a(), this.d() + 32 + 3, this.h() + 12, -8355712);
            if (this.a.k.j) {
                $$0.b(this.a.g, e, this.d() + 32 + 3, this.h() + 12 + 11, -8355712);
            } else {
                $$0.b(this.a.g, this.b.b(), this.d() + 32 + 3, this.h() + 12 + 11, -8355712);
            }
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if ($$1) {
                this.b();
            }
            return super.a($$0, $$1);
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c()) {
                this.b();
                return true;
            }
            return super.a($$0);
        }

        @Override
        public void b() {
            this.f.a(new hit(this.b.a(), this.b.b(), hit.c.a));
        }

        @Override
        public yh a() {
            return yh.a("narrator.select", this.c());
        }

        public yh c() {
            return yh.i().b(d).b(yg.x).f(this.b.a());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        boolean a(a $$0) {
            if (!($$0 instanceof c)) return false;
            c $$1 = (c)$$0;
            if ($$1.b != this.b) return false;
            return true;
        }
    }
}

