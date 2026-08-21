/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;

public class gwg
extends gwc {
    private static final yh a = yh.c("options.videoTitle");
    private static final yh f = yh.c("options.improvedTransparency").a(l.u);
    private static final yh t = yh.a("options.graphics.warning.message", f, f);
    private static final yh u = yh.c("options.graphics.warning.title").a(l.m);
    private static final yh v = yh.c("options.graphics.warning.accept");
    private static final yh w = yh.c("options.graphics.warning.cancel");
    private static final yh x = yh.c("options.video.display.header");
    private static final yh y = yh.c("options.video.quality.header");
    private static final yh z = yh.c("options.video.preferences.header");
    private final hod A;
    private final int B;
    private final int C;
    private final gfv D;

    private static gfn<?>[] a(gfo $$0) {
        return new gfn[]{$$0.P(), $$0.e(), $$0.s(), $$0.f(), $$0.q(), $$0.k(), $$0.aJ(), $$0.K(), $$0.ab(), $$0.g(), $$0.w(), $$0.l(), $$0.n(), $$0.p(), $$0.N(), $$0.L(), $$0.m()};
    }

    private static gfn<?>[] b(gfo $$0) {
        return new gfn[]{$$0.h(), $$0.aa(), $$0.j(), $$0.aI(), $$0.ao(), $$0.aH()};
    }

    private static gfn<?>[] c(gfo $$0) {
        return new gfn[]{$$0.aw(), $$0.o(), $$0.O(), $$0.r()};
    }

    public gwg(gsb $$0, gfj $$1, gfo $$2) {
        super($$0, $$2, a);
        this.A = $$1.ao();
        this.A.f();
        if ($$2.p().b().booleanValue()) {
            this.A.d();
        }
        this.B = $$2.K().b();
        this.C = $$2.L().b();
        this.D = $$2.N().b();
    }

    @Override
    protected void o() {
        int $$5;
        int $$0 = -1;
        fyk $$12 = this.n.aR();
        fyf $$22 = $$12.t();
        if ($$22 == null) {
            int $$3 = -1;
        } else {
            Optional<fyj> $$4 = $$12.e();
            $$5 = $$4.map($$22::a).orElse(-1);
        }
        gfn<Integer> $$6 = new gfn<Integer>("options.fullscreen.resolution", gfn.a(), ($$1, $$2) -> {
            if ($$22 == null) {
                return yh.c("options.fullscreen.unavailable");
            }
            if ($$2 == -1) {
                return gfo.a($$1, yh.c("options.fullscreen.current"));
            }
            fyj $$3 = $$22.a((int)$$2);
            return gfo.a($$1, yh.a("options.fullscreen.entry", $$3.a(), $$3.b(), $$3.f(), $$3.c() + $$3.d() + $$3.e()));
        }, new gfn.f(-1, $$22 != null ? $$22.e() - 1 : -1), $$5, $$2 -> {
            if ($$22 == null) {
                return;
            }
            $$12.a($$2 == -1 ? Optional.empty() : Optional.of($$22.a((int)$$2)));
        });
        this.d.c(x);
        this.d.a((gfn<?>)$$6);
        this.d.a(gwg.b(this.c));
        this.d.c(y);
        this.d.a((gfn<?>)this.c.i());
        this.d.a(gwg.a(this.c));
        this.d.c(z);
        this.d.a(gwg.c(this.c));
    }

    @Override
    public void e() {
        gjc gjc2;
        if (this.d != null && (gjc2 = this.d.b(this.c.L())) instanceof giz) {
            giz $$0 = (giz)gjc2;
            $$0.k = this.c.N().b() == gfv.c;
        }
        super.e();
    }

    @Override
    public void aX_() {
        this.n.aR().f();
        super.aX_();
    }

    @Override
    public void aZ_() {
        if (this.c.K().b() != this.B || this.c.L().b() != this.C || this.c.N().b() != this.D) {
            this.n.a(this.c.K().b());
            this.n.W();
        }
        super.aZ_();
    }

    @Override
    public boolean a(gzc $$02, boolean $$1) {
        if (super.a($$02, $$1)) {
            if (this.A.e()) {
                String $$5;
                String $$4;
                ArrayList $$2 = Lists.newArrayList((Object[])new yh[]{t, yg.u});
                String $$3 = this.A.g();
                if ($$3 != null) {
                    $$2.add(yg.u);
                    $$2.add(yh.a("options.graphics.warning.renderer", new Object[]{$$3}).a(l.h));
                }
                if (($$4 = this.A.i()) != null) {
                    $$2.add(yg.u);
                    $$2.add(yh.a("options.graphics.warning.vendor", new Object[]{$$4}).a(l.h));
                }
                if (($$5 = this.A.h()) != null) {
                    $$2.add(yg.u);
                    $$2.add(yh.a("options.graphics.warning.version", new Object[]{$$5}).a(l.h));
                }
                this.n.a(new gwf(u, $$2, (ImmutableList<gwf.a>)ImmutableList.of((Object)new gwf.a(v, $$0 -> {
                    this.c.p().a(true);
                    gfj.V().e.d();
                    this.A.d();
                    this.n.a(this);
                }), (Object)new gwf.a(w, $$0 -> {
                    this.A.d();
                    this.c.p().a(false);
                    this.J();
                    this.n.a(this);
                }))));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (this.n.d()) {
            gfn<Integer> $$4 = this.c.aI();
            gfn.o<Integer> o2 = $$4.d();
            if (o2 instanceof gfn.c) {
                gjl $$9;
                gfn.c $$5 = (gfn.c)o2;
                int $$6 = $$4.b();
                int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
                int $$8 = $$7 + (int)Math.signum($$3);
                if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d() && ($$9 = (gjl)this.d.b($$4)) != null) {
                    $$4.a($$8);
                    $$9.a(Integer.valueOf($$8));
                    this.d.a(0.0);
                    return true;
                }
            }
            return false;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public void c(boolean $$0) {
        gjc $$1;
        if (this.d != null && ($$1 = this.d.b(this.c.ao())) != null) {
            gjl $$2 = (gjl)$$1;
            $$2.a($$0);
        }
    }

    public void J() {
        gfn<Boolean> $$0;
        gjc $$1;
        if (this.d != null && ($$1 = this.d.b($$0 = this.c.p())) != null) {
            gjl $$2 = (gjl)$$1;
            $$2.a($$0.b());
        }
    }
}

