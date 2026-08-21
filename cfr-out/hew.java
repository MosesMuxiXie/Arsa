/*
 * Decompiled with CFR 0.152.
 */
public class hew
extends hev<iet> {
    public hew(hdg $$0) {
        super($$0);
    }

    @Override
    public void a(iet $$0) {
        super.a($$0);
        float $$1 = 0.5235988f;
        float $$2 = $$0.m;
        dbl $$3 = $$0.d;
        if ($$3 == dbl.e) {
            float $$4 = $$0.L / 60.0f;
            this.v.g = 0.5235988f + (float)Math.PI / 180 * bgj.a((double)($$4 * 30.0f)) * 10.0f;
            this.w.g = -0.5235988f - (float)Math.PI / 180 * bgj.b((double)($$4 * 30.0f)) * 10.0f;
            this.h.b += bgj.a((double)($$4 * 10.0f));
            this.h.c += bgj.a((double)($$4 * 40.0f)) + 0.4f;
            this.k.g = (float)Math.PI / 180 * (70.0f + bgj.b((double)($$4 * 40.0f)) * 10.0f);
            this.l.g = this.k.g * -1.0f;
            this.k.c += bgj.a((double)($$4 * 40.0f)) * 0.5f - 0.5f;
            this.l.c += bgj.a((double)($$4 * 40.0f)) * 0.5f + 0.5f;
            this.j.c += bgj.a((double)($$4 * 40.0f)) * 0.35f;
        } else if ($$3 == dbl.a && $$2 == 0.0f) {
            this.c($$0);
        } else if ($$3 == dbl.b) {
            gzj.a(this.k, this.l, this.h, $$0.e == chb.b);
        } else if ($$3 == dbl.c) {
            gzj.a(this.k, this.l, $$0.c, $$0.ae, $$0.e == chb.b);
        } else if ($$3 == dbl.d) {
            this.h.e = 0.5f;
            this.h.f = 0.0f;
            if ($$0.e == chb.a) {
                this.k.f = -0.5f;
                this.k.e = -0.9f;
            } else {
                this.l.f = 0.5f;
                this.l.e = -0.9f;
            }
        }
    }

    @Override
    protected void b(iet $$0) {
        float $$1 = $$0.m;
        if ($$1 > 0.0f && $$0.d == dbl.a) {
            gzj.a(this.k, this.l, $$0.e, $$1, $$0.L);
            return;
        }
        super.b($$0);
    }

    private void c(iet $$0) {
        if ($$0.e == chb.a) {
            this.l.e = -1.8f;
        } else {
            this.k.e = -1.8f;
        }
    }

    @Override
    public void a(boolean $$0) {
        super.a($$0);
        this.q.k = $$0;
        this.r.k = $$0;
        this.s.k = $$0;
        this.t.k = $$0;
        this.u.k = $$0;
    }
}

