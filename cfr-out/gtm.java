/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import java.util.stream.IntStream;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public abstract class gtm
extends gsb {
    protected final ems a;
    private emt c;
    private final String[] d;
    private final boolean e;
    protected final epw b;
    private int f;
    private int t;
    private @Nullable gny u;

    public gtm(ems $$0, boolean $$1, boolean $$2) {
        this($$0, $$1, $$2, yh.c("sign.edit"));
    }

    public gtm(ems $$0, boolean $$12, boolean $$2, yh $$3) {
        super($$3);
        this.a = $$0;
        this.c = $$0.a($$12);
        this.e = $$12;
        this.b = ehf.a($$0.o().b());
        this.d = (String[])IntStream.range(0, 4).mapToObj($$1 -> this.c.a($$1, $$2)).map(yh::getString).toArray(String[]::new);
    }

    @Override
    protected void bg_() {
        this.c(gje.a(yg.d, (gje $$0) -> this.I()).a(this.o / 2 - 100, this.p / 4 + 144, 200, 20).a());
        this.u = new gny(() -> this.d[this.t], this::a, gny.a(this.n), gny.c(this.n), $$0 -> this.n.g.b((String)$$0) <= this.a.c());
    }

    @Override
    public void e() {
        ++this.f;
        if (!this.F()) {
            this.I();
        }
    }

    private boolean F() {
        return this.n.s != null && !this.a.p() && !this.a.b(this.n.s.cY());
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.h()) {
            this.t = this.t - 1 & 3;
            this.u.f();
            return true;
        }
        if ($$0.i() || $$0.d()) {
            this.t = this.t + 1 & 3;
            this.u.f();
            return true;
        }
        if (this.u.a($$0)) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    public boolean a(gyy $$0) {
        this.u.a($$0);
        return true;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 40, -1);
        this.e($$0);
    }

    @Override
    public void aX_() {
        this.I();
    }

    @Override
    public void aZ_() {
        hig $$0 = this.n.R();
        if ($$0 != null) {
            $$0.b(new aka(this.a.aD_(), this.e, this.d[0], this.d[1], this.d[2], this.d[3]));
        }
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean v() {
        return true;
    }

    protected abstract void d(gir var1);

    protected abstract Vector3f o();

    protected abstract float p();

    private void e(gir $$0) {
        $$0.e().pushMatrix();
        $$0.e().translate((float)this.o / 2.0f, this.p());
        $$0.e().pushMatrix();
        this.d($$0);
        $$0.e().popMatrix();
        this.f($$0);
        $$0.e().popMatrix();
    }

    private void f(gir $$0) {
        Vector3f $$1 = this.o();
        $$0.e().scale($$1.x(), $$1.y());
        int $$2 = this.c.a() ? this.c.b().g() : hrc.a(this.c);
        boolean $$3 = this.f / 6 % 2 == 0;
        int $$4 = this.u.g();
        int $$5 = this.u.h();
        int $$6 = 4 * this.a.a() / 2;
        int $$7 = this.t * this.a.a() - $$6;
        for (int $$8 = 0; $$8 < this.d.length; ++$$8) {
            String $$9 = this.d[$$8];
            if ($$9 == null) continue;
            if (this.q.a()) {
                $$9 = this.q.a($$9);
            }
            int $$10 = -this.q.b($$9) / 2;
            $$0.a(this.q, $$9, $$10, $$8 * this.a.a() - $$6, $$2, false);
            if ($$8 != this.t || $$4 < 0 || !$$3) continue;
            int $$11 = this.q.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
            int $$12 = $$11 - this.q.b($$9) / 2;
            if ($$4 < $$9.length()) continue;
            $$0.a(this.q, "_", $$12, $$7, $$2, false);
        }
        for (int $$13 = 0; $$13 < this.d.length; ++$$13) {
            String $$14 = this.d[$$13];
            if ($$14 == null || $$13 != this.t || $$4 < 0) continue;
            int $$15 = this.q.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.q.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
                $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.a.a(), bel.g($$2));
            }
            if ($$5 == $$4) continue;
            int $$17 = Math.min($$4, $$5);
            int $$18 = Math.max($$4, $$5);
            int $$19 = this.q.b($$14.substring(0, $$17)) - this.q.b($$14) / 2;
            int $$20 = this.q.b($$14.substring(0, $$18)) - this.q.b($$14) / 2;
            int $$21 = Math.min($$19, $$20);
            int $$22 = Math.max($$19, $$20);
            $$0.a($$21, $$7, $$22, $$7 + this.a.a(), true);
        }
    }

    private void a(String $$0) {
        this.d[this.t] = $$0;
        this.c = this.c.a(this.t, yh.b($$0));
        this.a.a(this.c, this.e);
    }

    private void I() {
        this.n.a((gsb)null);
    }
}

