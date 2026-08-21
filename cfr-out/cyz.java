/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class cyz
extends cgk {
    private static final Logger b = LogUtils.getLogger();
    private int c;
    protected is a;

    protected cyz(cgu<? extends cyz> $$0, dwo $$1) {
        super($$0, $$1);
    }

    protected cyz(cgu<? extends cyz> $$0, dwo $$1, is $$2) {
        this($$0, $$1);
        this.a = $$2;
    }

    protected abstract void e();

    @Override
    public void g() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            this.aL();
            if (this.c++ == 100) {
                this.c = 0;
                if (!this.eh() && !this.f()) {
                    this.aC();
                    this.a($$0, (cgk)null);
                }
            }
        }
    }

    public abstract boolean f();

    @Override
    public boolean bX() {
        return true;
    }

    @Override
    public boolean w(cgk $$0) {
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            if (!this.ao().a((cgk)$$1, this.a)) {
                return true;
            }
            return this.b(this.en().a($$1), 0.0f);
        }
        return false;
    }

    @Override
    public boolean b(cex $$0) {
        return !this.d($$0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.d($$1)) {
            return false;
        }
        if (!$$0.U().a(eua.F).booleanValue() && $$1.d() instanceof chn) {
            return false;
        }
        if (!this.eh()) {
            this.c($$0);
            this.bT();
            this.a($$0, $$1.d());
        }
        return true;
    }

    @Override
    public boolean a(dwi $$0) {
        cgk $$1 = $$0.d();
        if ($$1 != null && $$1.by()) {
            return true;
        }
        if ($$0.h()) {
            return super.a($$0);
        }
        return true;
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if (!this.eh() && $$1.h() > 0.0) {
                this.c($$2);
                this.a($$2, (cgk)null);
            }
        }
    }

    @Override
    public void i(double $$0, double $$1, double $$2) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$3 = (axf)dwo2;
            if (!this.eh() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
                this.c($$3);
                this.a($$3, (cgk)null);
            }
        }
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("block_pos", is.a, this.i());
    }

    @Override
    protected void a(fnq $$0) {
        is $$1 = $$0.a("block_pos", is.a).orElse(null);
        if ($$1 == null || !$$1.a(this.dK(), 16.0)) {
            b.error("Block-attached entity at invalid position: {}", (Object)$$1);
            return;
        }
        this.a = $$1;
    }

    public abstract void a(axf var1, @Nullable cgk var2);

    @Override
    protected boolean bZ() {
        return false;
    }

    @Override
    public void a_(double $$0, double $$1, double $$2) {
        this.a = is.a($$0, $$1, $$2);
        this.e();
        this.aF = true;
    }

    public is i() {
        return this.a;
    }

    @Override
    public void a(axf $$0, chk $$1) {
    }

    @Override
    public void j_() {
    }
}

