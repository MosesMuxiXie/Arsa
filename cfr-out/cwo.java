/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class cwo
extends cwn {
    private static final int cG = 300;

    public cwo(cgu<? extends cwo> $$0, dwo $$1) {
        super((cgu<? extends cwn>)$$0, $$1);
    }

    protected cim.b<cwo> ew() {
        return cwp.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cwp.a(this.ew().a($$0));
    }

    public cim<cwo> ev() {
        return super.ev();
    }

    public @Nullable cwo b(axf $$0, cfy $$1) {
        cwo $$2 = cgu.aM.a($$0, cgt.e);
        if ($$2 != null && this.p()) {
            $$2.b(this.ae_());
            $$2.a(true, true);
        }
        return $$2;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("nautilusBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("nautilusActivityUpdate");
        cwp.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    protected bcz W() {
        if (this.e_()) {
            return this.bC() ? bda.be : bda.bf;
        }
        return this.bC() ? bda.sS : bda.sT;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.e_()) {
            return this.bC() ? bda.bj : bda.bk;
        }
        return this.bC() ? bda.tb : bda.tc;
    }

    @Override
    protected bcz fd() {
        if (this.e_()) {
            return this.bC() ? bda.bg : bda.bh;
        }
        return this.bC() ? bda.sY : bda.sZ;
    }

    @Override
    protected bcz hg() {
        return this.bC() ? bda.sU : bda.sV;
    }

    @Override
    protected bcz hh() {
        return this.bC() ? bda.sW : bda.sX;
    }

    @Override
    protected void gX() {
        bcz $$0 = this.e_() ? bda.bi : bda.ta;
        this.b($$0);
    }

    @Override
    protected bcz bk() {
        return this.e_() ? bda.bm : bda.td;
    }

    @Override
    public int cJ() {
        return 300;
    }

    protected void a(axf $$0, int $$1) {
        if (this.cb() && !this.by()) {
            this.j($$1 - 1);
            if (this.cK() <= -20) {
                this.j(0);
                this.a($$0, this.en().t(), 2.0f);
            }
        } else {
            this.j(300);
        }
    }

    @Override
    public void aJ() {
        dwo dwo2;
        int $$0 = this.cK();
        super.aJ();
        if (!this.gG() && (dwo2 = this.ao()) instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.a($$1, $$0);
        }
    }

    @Override
    public boolean aj_() {
        return !this.hm();
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

