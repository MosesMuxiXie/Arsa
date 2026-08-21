/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class gwp
extends gkb<a> {
    static final amo a = amo.b("transferable_list/select_highlighted");
    static final amo f = amo.b("transferable_list/select");
    static final amo n = amo.b("transferable_list/unselect_highlighted");
    static final amo o = amo.b("transferable_list/unselect");
    static final amo p = amo.b("transferable_list/move_up_highlighted");
    static final amo q = amo.b("transferable_list/move_up");
    static final amo r = amo.b("transferable_list/move_down_highlighted");
    static final amo s = amo.b("transferable_list/move_down");
    static final yh t = yh.c("pack.incompatible");
    static final yh u = yh.c("pack.incompatible.confirm.title");
    private static final int v = 2;
    private final yh w;
    final gwo x;

    public gwp(gfj $$0, gwo $$1, int $$2, int $$3, yh $$4) {
        super($$0, $$2, $$3, 33, 36);
        this.x = $$1;
        this.w = $$4;
        this.e = false;
    }

    @Override
    public int a() {
        return this.g - 4;
    }

    @Override
    protected int m() {
        return this.E() - 6;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.q() != null) {
            return ((a)this.q()).a($$0);
        }
        return super.a($$0);
    }

    public void a(Stream<gwn.a> $$0, @Nullable gwn.b $$12) {
        this.s();
        yw $$2 = yh.i().b(this.w).a(l.t, l.r);
        b b2 = new b(this, this.c.g, $$2);
        Objects.requireNonNull(this.c.g);
        this.a(b2, (int)(9.0f * 1.5f));
        this.a(null);
        $$0.forEach($$1 -> {
            c $$2 = new c(this.c, this, (gwn.a)$$1);
            this.c($$2);
            if ($$12 != null && $$12.c().equals($$1.c())) {
                this.x.a(this);
                this.a($$2);
            }
        });
        this.i();
    }

    public abstract class a
    extends gkb.a<a> {
        @Override
        public int aS_() {
            return super.aS_() - (gwp.this.k() ? 6 : 0);
        }

        public abstract String b();
    }

    public class b
    extends a {
        private final gio b;
        private final yh c;

        public b(gwp $$0, gio $$1, yh $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.a(this.b, this.c, this.aT_() + this.aS_() / 2, this.j() - this.b.b / 2, -1);
        }

        @Override
        public yh a() {
            return this.c;
        }

        @Override
        public String b() {
            return "";
        }
    }

    public class c
    extends a
    implements gkl {
        private static final int e = 157;
        public static final int b = 32;
        private final gwp f;
        protected final gfj c;
        private final gwn.a g;
        private final gko i;
        private final gjz j;

        public c(gfj $$1, gwp $$2, gwn.a $$3) {
            this.c = $$1;
            this.g = $$3;
            this.f = $$2;
            this.i = new gko($$3.d(), $$1.g);
            this.j = new gjz(yk.a($$3.g(), zf.a.a(-8355712)), $$1.g);
            this.j.b(2);
        }

        @Override
        public yh a() {
            return yh.a("narrator.select", this.g.d());
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            bai $$5 = this.g.b();
            if (!$$5.a()) {
                int $$6 = this.d() - 1;
                int $$7 = this.h() - 1;
                int $$8 = this.n() + 1;
                int $$9 = this.k() + 1;
                $$0.a($$6, $$7, $$8, $$9, -8978432);
            }
            $$0.a(hpa.at, this.g.a(), this.d(), this.h(), 0.0f, 0.0f, 32, 32, 32, 32);
            if (!this.i.B().equals(this.g.d())) {
                this.i.a_(this.g.d());
            }
            if (!this.j.B().b().equals(this.g.g().b())) {
                this.j.a_(yk.a(this.g.g(), zf.a.a(-8355712)));
            }
            if (this.e() && (this.c.k.an().b().booleanValue() || $$3 || this.f.q() == this && this.f.aP_())) {
                $$0.a(this.d(), this.h(), this.d() + 32, this.h() + 32, -1601138544);
                int $$10 = $$1 - this.d();
                int $$11 = $$2 - this.h();
                if (!this.g.b().a()) {
                    this.i.a_(t);
                    this.j.a_(this.g.b().b());
                }
                if (this.g.o()) {
                    if (this.a($$10, $$11, 32)) {
                        $$0.a(hpa.at, a, this.d(), this.h(), 32, 32);
                        gwp.this.d($$0);
                    } else {
                        $$0.a(hpa.at, f, this.d(), this.h(), 32, 32);
                    }
                } else {
                    if (this.g.p()) {
                        if (this.b($$10, $$11, 32)) {
                            $$0.a(hpa.at, n, this.d(), this.h(), 32, 32);
                            gwp.this.d($$0);
                        } else {
                            $$0.a(hpa.at, o, this.d(), this.h(), 32, 32);
                        }
                    }
                    if (this.g.q()) {
                        if (this.d($$10, $$11, 32)) {
                            $$0.a(hpa.at, p, this.d(), this.h(), 32, 32);
                            gwp.this.d($$0);
                        } else {
                            $$0.a(hpa.at, q, this.d(), this.h(), 32, 32);
                        }
                    }
                    if (this.g.r()) {
                        if (this.e($$10, $$11, 32)) {
                            $$0.a(hpa.at, r, this.d(), this.h(), 32, 32);
                            gwp.this.d($$0);
                        } else {
                            $$0.a(hpa.at, s, this.d(), this.h(), 32, 32);
                        }
                    }
                }
            }
            this.i.a(157 - (gwp.this.k() ? 6 : 0));
            this.i.c(this.d() + 32 + 2, this.h() + 1);
            this.i.a($$0, $$1, $$2, $$4);
            this.j.a(157 - (gwp.this.k() ? 6 : 0));
            this.j.c(this.d() + 32 + 2, this.h() + 12);
            this.j.a($$0, $$1, $$2, $$4);
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if (this.e()) {
                int $$2 = (int)$$0.u() - this.d();
                int $$3 = (int)$$0.v() - this.h();
                if (this.g.o() && this.a($$2, $$3, 32)) {
                    this.u();
                    return true;
                }
                if (this.g.p() && this.b($$2, $$3, 32)) {
                    this.g.k();
                    return true;
                }
                if (this.g.q() && this.d($$2, $$3, 32)) {
                    this.g.l();
                    return true;
                }
                if (this.g.r() && this.e($$2, $$3, 32)) {
                    this.g.m();
                    return true;
                }
            }
            return super.a($$0, $$1);
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.d()) {
                this.c();
                return true;
            }
            if ($$0.m()) {
                if ($$0.h()) {
                    this.f();
                    return true;
                }
                if ($$0.i()) {
                    this.t();
                    return true;
                }
            }
            return super.a($$0);
        }

        private boolean e() {
            return !this.g.h() || !this.g.i();
        }

        public void c() {
            if (this.g.o()) {
                this.u();
            } else if (this.g.p()) {
                this.g.k();
            }
        }

        private void f() {
            if (this.g.q()) {
                this.g.l();
            }
        }

        private void t() {
            if (this.g.r()) {
                this.g.m();
            }
        }

        private void u() {
            if (this.g.b().a()) {
                this.g.j();
            } else {
                yh $$02 = this.g.b().c();
                this.c.a(new gra($$0 -> {
                    this.c.a(this.f.x);
                    if ($$0) {
                        this.g.j();
                    }
                }, u, $$02));
            }
        }

        @Override
        public String b() {
            return this.g.c();
        }

        @Override
        public boolean H() {
            return gwp.this.aJ_().stream().anyMatch($$0 -> $$0.b().equals(this.b()));
        }
    }
}

