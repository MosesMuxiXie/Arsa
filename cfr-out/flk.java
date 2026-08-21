/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class flk
extends flx {
    private final boolean a;
    private float m;
    private float n;

    public flk(boolean $$0) {
        this.a = $$0;
    }

    @Override
    public void a(dxb $$0, chn $$1) {
        super.a($$0, $$1);
        $$1.a(fls.j, 0.0f);
        this.m = $$1.a(fls.c);
        $$1.a(fls.c, 6.0f);
        this.n = $$1.a(fls.k);
        $$1.a(fls.k, 4.0f);
    }

    @Override
    public void b() {
        this.c.a(fls.c, this.m);
        this.c.a(fls.k, this.n);
        super.b();
    }

    @Override
    public fln a() {
        if (!this.c.by()) {
            return super.a();
        }
        return this.c(new is(bgj.c(this.c.dj().a), bgj.c(this.c.dj().b + 0.5), bgj.c(this.c.dj().c)));
    }

    @Override
    public flw a(double $$0, double $$1, double $$2) {
        return this.b($$0, $$1 + 0.5, $$2);
    }

    @Override
    public int a(fln[] $$0, fln $$1) {
        int $$6;
        int $$2 = super.a($$0, $$1);
        fls $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
        fls $$4 = this.b($$1.a, $$1.b, $$1.c);
        if (this.c.a($$3) >= 0.0f && $$4 != fls.w) {
            int $$5 = bgj.b(Math.max(1.0f, this.c.eg()));
        } else {
            $$6 = 0;
        }
        double $$7 = this.d(new is($$1.a, $$1.b, $$1.c));
        fln $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$6 - 1), $$7, iz.b, $$4);
        fln $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$6, $$7, iz.a, $$4);
        if (this.b($$8, $$1)) {
            $$0[$$2++] = $$8;
        }
        if (this.b($$9, $$1) && $$4 != fls.e) {
            $$0[$$2++] = $$9;
        }
        for (int $$10 = 0; $$10 < $$2; ++$$10) {
            fln $$11 = $$0[$$10];
            if ($$11.l != fls.j || !this.a || $$11.b >= this.c.ao().V() - 10) continue;
            $$11.k += 1.0f;
        }
        return $$2;
    }

    private boolean b(@Nullable fln $$0, fln $$1) {
        return this.a($$0, $$1) && $$0.l == fls.j;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3) {
        fls $$4 = $$0.a($$1, $$2, $$3);
        if ($$4 == fls.j) {
            is.a $$5 = new is.a();
            for (iz $$6 : iz.values()) {
                $$5.d($$1, $$2, $$3).c($$6);
                fls $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
                if ($$7 != fls.a) continue;
                return fls.k;
            }
            return fls.j;
        }
        return super.a($$0, $$1, $$2, $$3);
    }
}

