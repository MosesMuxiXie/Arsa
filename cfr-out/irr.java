/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irr
implements irv {
    private static final int a = 40;
    private static final int b = 40;
    private static final int c = 100;
    private static final int d = 20;
    private static final int e = -1;
    private static final yh f = yh.a("tutorial.move.title", iru.a("forward"), iru.a("left"), iru.a("back"), iru.a("right"));
    private static final yh g = yh.a("tutorial.move.description", iru.a("jump"));
    private static final yh h = yh.c("tutorial.look.title");
    private static final yh i = yh.c("tutorial.look.description");
    private final iru j;
    private @Nullable gnd k;
    private @Nullable gnd l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int r = -1;
    private int s = -1;

    public irr(iru $$0) {
        this.j = $$0;
    }

    @Override
    public void a() {
        ++this.m;
        if (this.p) {
            ++this.n;
            this.p = false;
        }
        if (this.q) {
            ++this.o;
            this.q = false;
        }
        if (this.r == -1 && this.n > 40) {
            if (this.k != null) {
                this.k.c();
                this.k = null;
            }
            this.r = this.m;
        }
        if (this.s == -1 && this.o > 40) {
            if (this.l != null) {
                this.l.c();
                this.l = null;
            }
            this.s = this.m;
        }
        if (this.r != -1 && this.s != -1) {
            if (this.j.f()) {
                this.j.a(irw.b);
            } else {
                this.j.a(irw.f);
            }
        }
        if (this.k != null) {
            this.k.a((float)this.n / 40.0f);
        }
        if (this.l != null) {
            this.l.a((float)this.o / 40.0f);
        }
        if (this.m >= 100) {
            gfj $$0 = this.j.e();
            if (this.r == -1 && this.k == null) {
                this.k = new gnd($$0.g, gnd.a.a, f, g, true);
                $$0.aG().a(this.k);
            } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
                this.l = new gnd($$0.g, gnd.a.b, h, i, true);
                $$0.aG().a(this.l);
            }
        }
    }

    @Override
    public void b() {
        if (this.k != null) {
            this.k.c();
            this.k = null;
        }
        if (this.l != null) {
            this.l.c();
            this.l = null;
        }
    }

    @Override
    public void a(hnf $$0) {
        if ($$0.a.a() || $$0.a.b() || $$0.a.c() || $$0.a.d() || $$0.a.e()) {
            this.p = true;
        }
    }

    @Override
    public void a(double $$0, double $$1) {
        if (Math.abs($$0) > 0.01 || Math.abs($$1) > 0.01) {
            this.q = true;
        }
    }
}

