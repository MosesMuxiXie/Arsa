/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class gjx
extends gjb {
    private static final int c = 1;
    private static final int d = -3092272;
    private static final String e = "_";
    private static final int f = bel.f(204, -2039584);
    private static final int n = 300;
    private final gio o;
    private final yh p;
    private final gka q;
    private final int r;
    private final boolean s;
    private final int t;
    private long u = bhs.c();

    gjx(gio $$0, int $$1, int $$2, int $$3, int $$4, yh $$5, yh $$6, int $$7, boolean $$8, int $$9, boolean $$10, boolean $$11) {
        super($$1, $$2, $$3, $$4, $$6, $$10, $$11);
        this.o = $$0;
        this.s = $$8;
        this.r = $$7;
        this.t = $$9;
        this.p = $$5;
        this.q = new gka($$0, $$3 - this.c());
        this.q.a(this::w);
    }

    public void a(int $$0) {
        this.q.a($$0);
    }

    public void b(int $$0) {
        this.q.b($$0);
    }

    public void b(Consumer<String> $$0) {
        this.q.a($$0);
    }

    public void a(String $$0) {
        this.a($$0, false);
    }

    public void a(String $$0, boolean $$1) {
        this.q.a($$0, $$1);
    }

    public String u() {
        return this.q.d();
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)yh.a("gui.narrate.editBox", this.B(), this.u()));
    }

    @Override
    public void b(gzc $$0, boolean $$1) {
        if ($$1) {
            this.q.i();
        } else {
            this.q.a($$0.m());
            this.b($$0.u(), $$0.v());
        }
    }

    @Override
    protected void b(gzc $$0, double $$1, double $$2) {
        this.q.a(true);
        this.b($$0.u(), $$0.v());
        this.q.a($$0.m());
    }

    @Override
    public boolean a(gzb $$0) {
        return this.q.a($$0);
    }

    @Override
    public boolean a(gyy $$0) {
        if (!(this.l && this.aP_() && $$0.b())) {
            return false;
        }
        this.q.b($$0.a());
        return true;
    }

    @Override
    protected void c(gir $$0, int $$1, int $$2, float $$3) {
        String $$4 = this.q.d();
        if ($$4.isEmpty() && !this.aP_()) {
            $$0.a(this.o, (yn)this.p, this.e(), this.t(), this.g - this.c(), f);
            return;
        }
        int $$5 = this.q.e();
        boolean $$6 = this.aP_() && (bhs.c() - this.u) / 300L % 2L == 0L;
        boolean $$7 = $$5 < $$4.length();
        int $$8 = 0;
        int $$9 = 0;
        int $$10 = this.t();
        boolean $$11 = false;
        for (gka.a $$12 : this.q.j()) {
            boolean $$13 = this.a($$10, $$10 + this.o.b);
            int $$14 = this.e();
            if ($$6 && $$7 && $$5 >= $$12.a() && $$5 <= $$12.b()) {
                if ($$13) {
                    String $$15 = $$4.substring($$12.a(), $$5);
                    $$0.a(this.o, $$15, $$14, $$10, this.r, this.s);
                    $$8 = $$14 + this.o.b($$15);
                    if (!$$11) {
                        $$0.a($$8, $$10 - 1, $$8 + 1, $$10 + 1 + this.o.b, this.t);
                        $$11 = true;
                    }
                    $$0.a(this.o, $$4.substring($$5, $$12.b()), $$8, $$10, this.r, this.s);
                }
            } else {
                if ($$13) {
                    String $$16 = $$4.substring($$12.a(), $$12.b());
                    $$0.a(this.o, $$16, $$14, $$10, this.r, this.s);
                    $$8 = $$14 + this.o.b($$16) - 1;
                }
                $$9 = $$10;
            }
            $$10 += this.o.b;
        }
        if ($$6 && !$$7 && this.a($$9, $$9 + this.o.b)) {
            $$0.a(this.o, e, $$8 + 1, $$9, this.t, this.s);
        }
        if (this.q.k()) {
            gka.a $$17 = this.q.f();
            int $$18 = this.e();
            $$10 = this.t();
            for (gka.a $$19 : this.q.j()) {
                if ($$17.a() > $$19.b()) {
                    $$10 += this.o.b;
                    continue;
                }
                if ($$19.a() > $$17.b()) break;
                if (this.a($$10, $$10 + this.o.b)) {
                    int $$22;
                    int $$20 = this.o.b($$4.substring($$19.a(), Math.max($$17.a(), $$19.a())));
                    if ($$17.b() > $$19.b()) {
                        int $$21 = this.g - this.a();
                    } else {
                        $$22 = this.o.b($$4.substring($$19.a(), $$17.b()));
                    }
                    $$0.a($$18 + $$20, $$10, $$18 + $$22, $$10 + this.o.b, true);
                }
                $$10 += this.o.b;
            }
        }
        if (this.C()) {
            $$0.a(fyn.b);
        }
    }

    @Override
    protected void a(gir $$0) {
        super.a($$0);
        if (this.q.b()) {
            int $$1 = this.q.a();
            yw $$2 = yh.a("gui.multiLineEditBox.character_limit", this.q.d().length(), $$1);
            $$0.b(this.o, $$2, this.aT_() + this.g - this.o.a($$2), this.aU_() + this.h + 4, -6250336);
        }
    }

    @Override
    public int d() {
        return this.o.b * this.q.g();
    }

    @Override
    protected double p() {
        return (double)this.o.b / 2.0;
    }

    private void w() {
        double $$0 = this.h();
        gka.a $$1 = this.q.d((int)($$0 / (double)this.o.b));
        if (this.q.e() <= $$1.a()) {
            $$0 = this.q.h() * this.o.b;
        } else {
            gka.a $$2 = this.q.d((int)(($$0 + (double)this.h) / (double)this.o.b) - 1);
            if (this.q.e() > $$2.b()) {
                $$0 = this.q.h() * this.o.b - this.h + this.o.b + this.c();
            }
        }
        this.a($$0);
    }

    private void b(double $$0, double $$1) {
        double $$2 = $$0 - (double)this.aT_() - (double)this.a();
        double $$3 = $$1 - (double)this.aU_() - (double)this.a() + this.h();
        this.q.a($$2, $$3);
    }

    @Override
    public void b(boolean $$0) {
        super.b($$0);
        if ($$0) {
            this.u = bhs.c();
        }
    }

    public static a v() {
        return new a();
    }

    public static class a {
        private int a;
        private int b;
        private yh c = yg.a;
        private int d = -2039584;
        private boolean e = true;
        private int f = -3092272;
        private boolean g = true;
        private boolean h = true;

        public a a(int $$0) {
            this.a = $$0;
            return this;
        }

        public a b(int $$0) {
            this.b = $$0;
            return this;
        }

        public a a(yh $$0) {
            this.c = $$0;
            return this;
        }

        public a c(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(boolean $$0) {
            this.e = $$0;
            return this;
        }

        public a d(int $$0) {
            this.f = $$0;
            return this;
        }

        public a b(boolean $$0) {
            this.g = $$0;
            return this;
        }

        public a c(boolean $$0) {
            this.h = $$0;
            return this;
        }

        public gjx a(gio $$0, int $$1, int $$2, yh $$3) {
            return new gjx($$0, this.a, this.b, $$1, $$2, this.c, $$3, this.d, this.e, this.f, this.g, this.h);
        }
    }
}

