/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpp<T extends czz>
extends cop {
    private final T a;
    private final double b;
    private int c;
    private final float d;
    private int e = -1;
    private int f;
    private boolean g;
    private boolean h;
    private int i = -1;

    public cpp(T $$0, double $$1, int $$2, float $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3 * $$3;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    public void c(int $$0) {
        this.c = $$0;
    }

    @Override
    public boolean b() {
        if (((chn)this.a).ag_() == null) {
            return false;
        }
        return this.h();
    }

    protected boolean h() {
        return ((chl)this.a).b(dlx.pW);
    }

    @Override
    public boolean c() {
        return (this.b() || !((chn)this.a).N().l()) && this.h();
    }

    @Override
    public void d() {
        super.d();
        ((chn)this.a).w(true);
    }

    @Override
    public void e() {
        super.e();
        ((chn)this.a).w(false);
        this.f = 0;
        this.e = -1;
        ((chl)this.a).gf();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        boolean $$3;
        chl $$0 = ((chn)this.a).ag_();
        if ($$0 == null) {
            return;
        }
        double $$1 = ((cgk)this.a).h($$0.dP(), $$0.dR(), $$0.dV());
        boolean $$2 = ((chn)this.a).P().a($$0);
        boolean bl2 = $$3 = this.f > 0;
        if ($$2 != $$3) {
            this.f = 0;
        }
        this.f = $$2 ? ++this.f : --this.f;
        if ($$1 > (double)this.d || this.f < 20) {
            ((chn)this.a).N().a((cgk)$$0, this.b);
            this.i = -1;
        } else {
            ((chn)this.a).N().n();
            ++this.i;
        }
        if (this.i >= 20) {
            if ((double)((cgk)this.a).ep().i() < 0.3) {
                boolean bl3 = this.g = !this.g;
            }
            if ((double)((cgk)this.a).ep().i() < 0.3) {
                this.h = !this.h;
            }
            this.i = 0;
        }
        if (this.i > -1) {
            if ($$1 > (double)(this.d * 0.75f)) {
                this.h = false;
            } else if ($$1 < (double)(this.d * 0.25f)) {
                this.h = true;
            }
            ((chn)this.a).K().a(this.h ? -0.5f : 0.5f, this.g ? 0.5f : -0.5f);
            cgk cgk2 = ((cgk)this.a).dA();
            if (cgk2 instanceof chn) {
                chn $$4 = (chn)cgk2;
                $$4.a((cgk)$$0, 30.0f, 30.0f);
            }
            ((chn)this.a).a((cgk)$$0, 30.0f, 30.0f);
        } else {
            ((chn)this.a).J().a($$0, 30.0f, 30.0f);
        }
        if (((chl)this.a).fZ()) {
            int $$5;
            if (!$$2 && this.f < -60) {
                ((chl)this.a).gf();
            } else if ($$2 && ($$5 = ((chl)this.a).gd()) >= 20) {
                ((chl)this.a).gf();
                ((dac)this.a).a($$0, dkf.a($$5));
                this.e = this.c;
            }
        } else if (--this.e <= 0 && this.f >= -60) {
            ((chl)this.a).c(dee.a(this.a, dlx.pW));
        }
    }
}

