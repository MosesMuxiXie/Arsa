/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gxh
extends gsb {
    static final amo a = amo.b("icon/checkmark");
    private static final yh b = yh.c("gui.chatSelection.title");
    private static final yh c = yh.c("gui.chatSelection.context");
    private final @Nullable gsb d;
    private final hjn e;
    private gje f;
    private gjy t;
    private @Nullable a u;
    final hjg.a v;
    private final Consumer<hjg.a> w;
    private gxg x;

    public gxh(@Nullable gsb $$0, hjn $$1, hjg.a $$2, Consumer<hjg.a> $$3) {
        super(b);
        this.d = $$0;
        this.e = $$1;
        this.v = $$2.d();
        this.w = $$3;
    }

    @Override
    protected void bg_() {
        this.x = new gxg(this.e, this::a);
        this.t = gjy.a(this.q, c, this.o - 16);
        this.u = this.c(new a(this.n, (this.t.a() + 1) * this.q.b));
        this.c(gje.a(yg.k, (gje $$0) -> this.aX_()).a(this.o / 2 - 155, this.p - 32, 150, 20).a());
        this.f = this.c(gje.a(yg.d, (gje $$0) -> {
            this.w.accept(this.v);
            this.aX_();
        }).a(this.o / 2 - 155 + 160, this.p - 32, 150, 20).a());
        this.F();
        this.o();
        this.u.a((double)this.u.j());
    }

    private boolean a(hjc $$0) {
        return $$0.a(this.v.f());
    }

    private void o() {
        int $$0 = this.u.d();
        this.x.a($$0, this.u);
    }

    void p() {
        this.o();
    }

    void F() {
        this.f.k = !this.v.a().isEmpty();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        gil $$4 = $$0.h();
        $$0.a(this.q, this.m, this.o / 2, 10, -1);
        AbuseReportLimits $$5 = this.e.a().b();
        int $$6 = this.v.a().size();
        int $$7 = $$5.maxReportedMessageCount();
        yw $$8 = yh.a("gui.chatSelection.selected", $$6, $$7);
        $$0.a(this.q, (yh)$$8, this.o / 2, 26, -1);
        int $$9 = this.u.I();
        this.t.a(git.b, this.o / 2, $$9, this.q.b, $$4);
    }

    @Override
    public void aX_() {
        this.n.a(this.d);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), c});
    }

    public class gxh$a
    extends gkb<b>
    implements gxg.a {
        public static final int a = 16;
        private @Nullable c n;

        public gxh$a(gfj $$1, int $$2) {
            super($$1, gxh.this.o, gxh.this.p - $$2 - 80, 40, 16);
        }

        @Override
        public void a(double $$0) {
            double $$1 = this.h();
            super.a($$0);
            if ((float)this.j() > 1.0E-5f && $$0 <= (double)1.0E-5f && !bgj.b($$0, $$1)) {
                gxh.this.p();
            }
        }

        @Override
        public void a(int $$0, hjc.a $$1) {
            boolean $$2 = $$1.a(gxh.this.v.f());
            hja $$3 = $$1.h();
            gfd $$4 = $$3.a($$1.g());
            d $$5 = new d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
            this.d($$5);
            this.a($$1, $$2);
        }

        private void a(hjc.a $$0, boolean $$1) {
            e $$2 = new e($$0.f(), $$0.d(), $$1);
            this.d($$2);
            c $$3 = new c($$0.e(), $$2);
            if (this.n != null && this.n.a($$3)) {
                this.e(this.n.b());
            }
            this.n = $$3;
        }

        @Override
        public void a(yh $$0) {
            this.d(new f());
            this.d(new a($$0));
            this.d(new f());
            this.n = null;
        }

        @Override
        public int a() {
            return Math.min(350, this.g - 50);
        }

        public int d() {
            return bgj.f(this.h, 16);
        }

        @Override
        protected void a(gir $$0, int $$1, int $$2, float $$3, b $$4) {
            if (this.b($$4)) {
                boolean $$5 = this.q() == $$4;
                int $$6 = this.aP_() && $$5 ? -1 : -8355712;
                this.a($$0, $$4, $$6);
            }
            $$4.a($$0, $$1, $$2, this.z() == $$4, $$3);
        }

        private boolean b(b $$0) {
            if ($$0.c()) {
                boolean $$1 = this.q() == $$0;
                boolean $$2 = this.q() == null;
                boolean $$3 = this.z() == $$0;
                return $$1 || $$2 && $$3 && $$0.e();
            }
            return false;
        }

        protected @Nullable b b(gpk $$0) {
            return this.a($$0, b::c);
        }

        @Override
        public void a(@Nullable b $$0) {
            super.a($$0);
            b $$1 = this.b(gpk.a);
            if ($$1 == null) {
                gxh.this.p();
            }
        }

        @Override
        public boolean a(gzb $$0) {
            b $$1 = (b)this.q();
            if ($$1 != null && $$1.a($$0)) {
                return true;
            }
            return super.a($$0);
        }

        public int I() {
            return this.F() + ((gxh)gxh.this).q.b;
        }

        @Override
        protected /* synthetic */ @Nullable giy.a a(gpk gpk2) {
            return this.b(gpk2);
        }

        public class d
        extends b {
            private static final int b = 9;
            private static final int c = 8;
            private static final int d = 11;
            private static final int e = 4;
            private final int f;
            private final yn g;
            private final yh i;
            private final @Nullable List<bfr> j;
            private final @Nullable gfd.a k;
            private final @Nullable List<bfr> l;
            private final boolean m;
            private final boolean n;

            public d(int $$1, yh $$2, @Nullable yh $$3, gfd $$4, boolean $$5, boolean $$6) {
                this.f = $$1;
                this.k = t.a($$4, gfd::f);
                this.l = $$4 != null && $$4.g() != null ? gxh.this.q.c($$4.g(), a.this.a()) : null;
                this.m = $$5;
                this.n = $$6;
                yn $$7 = gxh.this.q.a($$2, this.f() - gxh.this.q.a(yg.w));
                if ($$2 != $$7) {
                    this.g = yn.a($$7, yg.w);
                    this.j = gxh.this.q.c($$2, a.this.a());
                } else {
                    this.g = $$2;
                    this.j = null;
                }
                this.i = $$3;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                if (this.b() && this.m) {
                    this.a($$0, this.h(), this.d(), this.i());
                }
                int $$5 = this.d() + this.t();
                int $$6 = this.h() + 1 + (this.i() - ((gxh)gxh.this).q.b) / 2;
                $$0.b(gxh.this.q, uu.a().a(this.g), $$5, $$6, this.m ? -1 : -1593835521);
                if (this.j != null && $$3) {
                    $$0.a(this.j, $$1, $$2);
                }
                int $$7 = gxh.this.q.a(this.g);
                this.a($$0, $$5 + $$7 + 4, this.h(), this.i(), $$1, $$2);
            }

            private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
                if (this.k != null) {
                    int $$6 = $$2 + ($$3 - this.k.d) / 2;
                    this.k.a($$0, $$1, $$6);
                    if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                        $$0.a(this.l, $$4, $$5);
                    }
                }
            }

            private void a(gir $$0, int $$1, int $$2, int $$3) {
                int $$4 = $$2;
                int $$5 = $$1 + ($$3 - 8) / 2;
                $$0.a(hpa.at, gxh.a, $$4, $$5, 9, 8);
            }

            private int f() {
                int $$0 = this.k != null ? this.k.c + 4 : 0;
                return a.this.a() - this.t() - 4 - $$0;
            }

            private int t() {
                return this.n ? 11 : 0;
            }

            @Override
            public yh a() {
                return this.b() ? yh.a("narrator.select", this.i) : this.i;
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                a.this.a((b)null);
                return this.u();
            }

            @Override
            public boolean a(gzb $$0) {
                if ($$0.c()) {
                    return this.u();
                }
                return false;
            }

            @Override
            public boolean b() {
                return gxh.this.v.b(this.f);
            }

            @Override
            public boolean c() {
                return true;
            }

            @Override
            public boolean e() {
                return this.m;
            }

            private boolean u() {
                if (this.m) {
                    gxh.this.v.a(this.f);
                    gxh.this.F();
                    return true;
                }
                return false;
            }
        }

        public class e
        extends b {
            private static final int b = 12;
            private static final int c = 4;
            private final yh d;
            private final Supplier<ddq> e;
            private final boolean f;

            public e(GameProfile $$1, yh $$2, boolean $$3) {
                this.d = $$2;
                this.f = $$3;
                this.e = a.this.c.at().a($$1, true);
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                int $$5 = this.d() - 12 + 4;
                int $$6 = this.h() + (this.i() - 12) / 2;
                gke.a($$0, this.e.get(), $$5, $$6, 12);
                int $$7 = this.h() + 1 + (this.i() - ((gxh)gxh.this).q.b) / 2;
                $$0.b(gxh.this.q, this.d, $$5 + 12 + 4, $$7, this.f ? -1 : -1593835521);
            }
        }

        record c(UUID a, b b) {
            public boolean a(c $$0) {
                return $$0.a.equals(this.a);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "sender;entry", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "sender;entry", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "sender;entry", "a", "b"}, this, $$0);
            }
        }

        public static abstract class b
        extends gkb.a<b> {
            @Override
            public yh a() {
                return yg.a;
            }

            public boolean b() {
                return false;
            }

            public boolean c() {
                return false;
            }

            public boolean e() {
                return this.c();
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                return this.c();
            }
        }

        public static class f
        extends b {
            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            }
        }

        public class a
        extends b {
            private final yh b;

            public a(yh $$1) {
                this.b = $$1;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                int $$5 = this.j();
                int $$6 = this.n() - 8;
                int $$7 = gxh.this.q.a(this.b);
                int $$8 = (this.d() + $$6 - $$7) / 2;
                int $$9 = $$5 - ((gxh)gxh.this).q.b / 2;
                $$0.b(gxh.this.q, this.b, $$8, $$9, -6250336);
            }

            @Override
            public yh a() {
                return this.b;
            }
        }
    }
}

