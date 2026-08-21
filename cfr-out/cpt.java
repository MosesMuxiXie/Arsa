/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpt
extends cop {
    private final cup a;
    private final double b;
    private double c;
    private double d;
    private double e;

    public cpt(cup $$0, double $$1) {
        this.a = $$0;
        this.b = $$1;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        if (this.a.ho() || this.a.hn() || !this.a.cr()) {
            return false;
        }
        ftm $$0 = cso.a(this.a, 5, 4);
        if ($$0 == null) {
            return false;
        }
        this.c = $$0.g;
        this.d = $$0.h;
        this.e = $$0.i;
        return true;
    }

    @Override
    public void d() {
        this.a.N().a(this.c, this.d, this.e, this.b);
    }

    @Override
    public boolean c() {
        return !this.a.hn() && !this.a.N().l() && this.a.cr();
    }

    @Override
    public void a() {
        if (!this.a.hn() && this.a.ep().a(this.a(50)) == 0) {
            cgk $$0 = this.a.do();
            if ($$0 == null) {
                return;
            }
            if ($$0 instanceof ddm) {
                ddm $$1 = (ddm)$$0;
                int $$2 = this.a.ht();
                int $$3 = this.a.hy();
                if ($$3 > 0 && this.a.ep().a($$3) < $$2) {
                    this.a.i($$1);
                    return;
                }
                this.a.u(5);
            }
            this.a.ce();
            this.a.hD();
            this.a.ao().a((cgk)this.a, (byte)6);
        }
    }
}

