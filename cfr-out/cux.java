/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cux
extends cus {
    private static final int cv = 47999;
    private int cw = 47999;

    public cux(cgu<? extends cux> $$0, dwo $$1) {
        super((cgu<? extends cus>)$$0, $$1);
    }

    @Override
    public boolean gS() {
        return true;
    }

    @Override
    protected @Nullable cus hf() {
        return cgu.bG.a(this.ao(), cgt.e);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("DespawnDelay", this.cw);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.cw = $$0.a("DespawnDelay", 47999);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(1, new cpi(this, 2.0));
        this.ct.a(1, new a(this));
        this.ct.a(2, new cqj<dcn>((chn)this, dcn.class, true, ($$0, $$1) -> $$0.ay() != cgu.ca));
        this.ct.a(2, new cqj<dba>((chn)this, dba.class, true));
    }

    public void w(int $$0) {
        this.cw = $$0;
    }

    @Override
    protected void g(ddm $$0) {
        cgk $$1 = this.C();
        if ($$1 instanceof dde) {
            return;
        }
        super.g($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_()) {
            this.hk();
        }
    }

    private void hk() {
        if (!this.hl()) {
            return;
        }
        int n2 = this.cw = this.hm() ? ((dde)this.C()).gT() - 1 : this.cw - 1;
        if (this.cw <= 0) {
            this.r();
            this.aC();
        }
    }

    private boolean hl() {
        return !this.hn() && !this.hI() && !this.dt();
    }

    private boolean hm() {
        return this.C() instanceof dde;
    }

    private boolean hI() {
        return this.S_() && !this.hm();
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$2 == cgt.h) {
            this.d_(0);
        }
        if ($$3 == null) {
            $$3 = new cfy.a(false);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    protected static class a
    extends cqq {
        private final cus a;
        private chl b;
        private int c;

        public a(cus $$0) {
            super($$0, false);
            this.a = $$0;
            this.a(EnumSet.of(cop.a.d));
        }

        @Override
        public boolean b() {
            if (!this.a.S_()) {
                return false;
            }
            cgk $$0 = this.a.C();
            if (!($$0 instanceof dde)) {
                return false;
            }
            dde $$1 = (dde)$$0;
            this.b = $$1.eK();
            int $$2 = $$1.eM();
            return $$2 != this.c && this.a(this.b, csk.a);
        }

        @Override
        public void d() {
            this.e.g(this.b);
            cgk $$0 = this.a.C();
            if ($$0 instanceof dde) {
                this.c = ((dde)$$0).eM();
            }
            super.d();
        }
    }
}

