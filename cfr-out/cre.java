/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class cre {
    private static final int p = 20;
    private static final int q = 100;
    private static final float r = 0.25f;
    protected final chn a;
    protected final dwo b;
    protected @Nullable flp c;
    protected double d;
    protected int e;
    protected int f;
    protected ftm g = ftm.c;
    protected jy h = jy.i;
    protected long i;
    protected long j;
    protected double k;
    protected float l = 0.5f;
    protected boolean m;
    protected long n;
    protected flo o;
    private @Nullable is s;
    private int t;
    private float u = 1.0f;
    private final flr v;
    private boolean w;
    private float x = 16.0f;

    public cre(chn $$0, dwo $$1) {
        this.a = $$0;
        this.b = $$1;
        this.v = this.a(bgj.c($$0.j(cis.o) * 16.0));
        if ($$1 instanceof axf) {
            axf $$2 = (axf)$$1;
            bxj $$3 = $$2.s().bw();
            this.v.a(() -> $$3.a(bxf.f));
        }
    }

    public void f() {
        int $$0 = bgj.b(this.s() * 16.0f);
        this.v.a($$0);
    }

    public void a(float $$0) {
        this.x = $$0;
        this.f();
    }

    private float s() {
        return Math.max((float)this.a.i(cis.o), this.x);
    }

    public void g() {
        this.u = 1.0f;
    }

    public void b(float $$0) {
        this.u = $$0;
    }

    public @Nullable is h() {
        return this.s;
    }

    protected abstract flr a(int var1);

    public void a(double $$0) {
        this.d = $$0;
    }

    public void i() {
        if (this.b.au() - this.n > 20L) {
            if (this.s != null) {
                this.c = null;
                this.c = this.a(this.s, this.t);
                this.n = this.b.au();
                this.m = false;
            }
        } else {
            this.m = true;
        }
    }

    public final @Nullable flp a(double $$0, double $$1, double $$2, int $$3) {
        return this.a(is.a($$0, $$1, $$2), $$3);
    }

    public @Nullable flp a(Stream<is> $$0, int $$1) {
        return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
    }

    public @Nullable flp a(Set<is> $$0, int $$1) {
        return this.a($$0, 8, false, $$1);
    }

    public @Nullable flp a(is $$0, int $$1) {
        return this.a((Set<is>)ImmutableSet.of((Object)$$0), 8, false, $$1);
    }

    public @Nullable flp a(is $$0, int $$1, int $$2) {
        return this.a((Set<is>)ImmutableSet.of((Object)$$0), 8, false, $$1, $$2);
    }

    public @Nullable flp a(cgk $$0, int $$1) {
        return this.a((Set<is>)ImmutableSet.of((Object)$$0.dK()), 16, true, $$1);
    }

    protected @Nullable flp a(Set<is> $$0, int $$1, boolean $$2, int $$3) {
        return this.a($$0, $$1, $$2, $$3, this.s());
    }

    protected @Nullable flp a(Set<is> $$0, int $$1, boolean $$2, int $$3, float $$4) {
        if ($$0.isEmpty()) {
            return null;
        }
        if (this.a.dR() < (double)this.b.K_()) {
            return null;
        }
        if (!this.a()) {
            return null;
        }
        if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
            return this.c;
        }
        bzm $$5 = bzl.a();
        $$5.a("pathfind");
        is $$6 = $$2 ? this.a.dK().d() : this.a.dK();
        int $$7 = (int)($$4 + (float)$$1);
        dxb $$8 = new dxb(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
        flp $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
        $$5.c();
        if ($$9 != null && $$9.l() != null) {
            this.s = $$9.l();
            this.t = $$3;
            this.u();
        }
        return $$9;
    }

    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        return this.a(this.a($$0, $$1, $$2, 1), $$3);
    }

    public boolean a(double $$0, double $$1, double $$2, int $$3, double $$4) {
        return this.a(this.a($$0, $$1, $$2, $$3), $$4);
    }

    public boolean a(cgk $$0, double $$1) {
        flp $$2 = this.a($$0, 1);
        return $$2 != null && this.a($$2, $$1);
    }

    public boolean a(@Nullable flp $$0, double $$1) {
        if ($$0 == null) {
            this.c = null;
            return false;
        }
        if (!$$0.a(this.c)) {
            this.c = $$0;
        }
        if (this.l()) {
            return false;
        }
        this.e();
        if (this.c.e() <= 0) {
            return false;
        }
        this.d = $$1;
        ftm $$2 = this.b();
        this.f = this.e;
        this.g = $$2;
        return true;
    }

    public @Nullable flp j() {
        return this.c;
    }

    public void d() {
        ++this.e;
        if (this.m) {
            this.i();
        }
        if (this.l()) {
            return;
        }
        if (this.a()) {
            this.k();
        } else if (this.c != null && !this.c.c()) {
            ftm $$0 = this.b();
            ftm $$1 = this.c.a(this.a);
            if ($$0.h > $$1.h && !this.a.aV() && bgj.c($$0.g) == bgj.c($$1.g) && bgj.c($$0.i) == bgj.c($$1.i)) {
                this.c.a();
            }
        }
        if (this.l()) {
            return;
        }
        ftm $$2 = this.c.a(this.a);
        this.a.K().a($$2.g, this.a($$2), $$2.i, this.d);
    }

    protected double a(ftm $$0) {
        is $$1 = is.a($$0);
        return this.b.a_($$1.e()).l() ? $$0.h : flx.a(this.b, $$1);
    }

    protected void k() {
        boolean $$5;
        ftm $$0 = this.b();
        this.l = this.a.dF() > 0.75f ? this.a.dF() / 2.0f : 0.75f - this.a.dF() / 2.0f;
        is $$1 = this.c.g();
        double $$2 = Math.abs(this.a.dP() - ((double)$$1.u() + 0.5));
        double $$3 = Math.abs(this.a.dR() - (double)$$1.v());
        double $$4 = Math.abs(this.a.dV() - ((double)$$1.w() + 0.5));
        boolean bl2 = $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
        if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
            this.c.a();
        }
        this.b($$0);
    }

    private boolean c(ftm $$0) {
        boolean $$8;
        if (this.c.f() + 1 >= this.c.e()) {
            return false;
        }
        ftm $$1 = ftm.c(this.c.g());
        if (!$$0.a((jn)$$1, 2.0)) {
            return false;
        }
        if (this.a($$0, this.c.a(this.a))) {
            return true;
        }
        ftm $$2 = ftm.c(this.c.d(this.c.f() + 1));
        ftm $$3 = $$1.d($$0);
        ftm $$4 = $$2.d($$0);
        double $$5 = $$3.h();
        double $$6 = $$4.h();
        boolean $$7 = $$6 < $$5;
        boolean bl2 = $$8 = $$5 < 0.5;
        if ($$7 || $$8) {
            ftm $$9 = $$3.d();
            ftm $$10 = $$4.d();
            return $$10.b($$9) < 0.0;
        }
        return false;
    }

    protected void b(ftm $$0) {
        if (this.e - this.f > 100) {
            float $$1 = this.a.fM() >= 1.0f ? this.a.fM() : this.a.fM() * this.a.fM();
            float $$2 = $$1 * 100.0f * 0.25f;
            if ($$0.g(this.g) < (double)($$2 * $$2)) {
                this.w = true;
                this.n();
            } else {
                this.w = false;
            }
            this.f = this.e;
            this.g = $$0;
        }
        if (this.c != null && !this.c.c()) {
            is $$3 = this.c.g();
            long $$4 = this.b.au();
            if ($$3.equals(this.h)) {
                this.i += $$4 - this.j;
            } else {
                this.h = $$3;
                double $$5 = $$0.f(ftm.c(this.h));
                double d2 = this.k = this.a.fM() > 0.0f ? $$5 / (double)this.a.fM() * 20.0 : 0.0;
            }
            if (this.k > 0.0 && (double)this.i > this.k * 3.0) {
                this.t();
            }
            this.j = $$4;
        }
    }

    private void t() {
        this.u();
        this.n();
    }

    private void u() {
        this.h = jy.i;
        this.i = 0L;
        this.k = 0.0;
        this.w = false;
    }

    public boolean l() {
        return this.c == null || this.c.c();
    }

    public boolean m() {
        return !this.l();
    }

    public void n() {
        this.c = null;
    }

    protected abstract ftm b();

    protected abstract boolean a();

    protected void e() {
        if (this.c == null) {
            return;
        }
        for (int $$0 = 0; $$0 < this.c.e(); ++$$0) {
            fln $$1 = this.c.a($$0);
            fln $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            eoh $$3 = this.b.a_(new is($$1.a, $$1.b, $$1.c));
            if (!$$3.a(bdp.by)) continue;
            this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
            if ($$2 == null || $$1.b < $$2.b) continue;
            this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
        }
    }

    protected boolean a(ftm $$0, ftm $$1) {
        return false;
    }

    public boolean b(fls $$0) {
        return $$0 != fls.n && $$0 != fls.p && $$0 != fls.d;
    }

    protected static boolean a(chn $$0, ftm $$1, ftm $$2, boolean $$3) {
        ftm $$4 = new ftm($$2.g, $$2.h + (double)$$0.dG() * 0.5, $$2.i);
        return $$0.ao().a(new dvw($$1, $$4, dvw.a.a, $$3 ? dvw.b.c : dvw.b.a, $$0)).d() == ftk.a.a;
    }

    public boolean a(is $$0) {
        is $$1 = $$0.e();
        return this.b.a_($$1).s();
    }

    public flo o() {
        return this.o;
    }

    public void a(boolean $$0) {
        this.o.c($$0);
    }

    public boolean p() {
        return this.o.f();
    }

    public boolean b(is $$0) {
        if (this.m) {
            return false;
        }
        if (this.c == null || this.c.c() || this.c.e() == 0) {
            return false;
        }
        fln $$1 = this.c.d();
        ftm $$2 = new ftm(((double)$$1.a + this.a.dP()) / 2.0, ((double)$$1.b + this.a.dR()) / 2.0, ((double)$$1.c + this.a.dV()) / 2.0);
        return $$0.a($$2, (double)(this.c.e() - this.c.f()));
    }

    public float q() {
        return this.l;
    }

    public boolean r() {
        return this.w;
    }

    public abstract boolean c();

    public void e(boolean $$0) {
        this.o.b($$0);
    }
}

