/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class edk
extends edj
implements dzt {
    protected edk(eog.d $$0, iz $$1, fug $$2, boolean $$3) {
        super($$0, $$1, $$2, $$3);
    }

    protected abstract MapCodec<? extends edk> a();

    protected eoh a(eoh $$0, eoh $$1) {
        return $$1;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        edl $$8 = this.c();
        if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
            return this.a($$0, $$8.b($$7));
        }
        if (this.b) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(this.c());
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        Optional<is> $$3 = this.a((dvt)$$0, $$1, $$2.b());
        return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        Optional<is> $$4 = this.a((dvt)$$0, $$2, $$3.b());
        if ($$4.isPresent()) {
            eoh $$5 = $$0.a_($$4.get());
            ((edl)$$5.b()).a($$0, $$1, $$4.get(), $$5);
        }
    }

    private Optional<is> a(dvt $$0, is $$1, dzq $$2) {
        return ber.a($$0, $$1, $$2, this.a, this.c());
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        boolean $$2 = super.a($$0, $$1);
        if ($$2 && $$1.n().a(this.c().h())) {
            return false;
        }
        return $$2;
    }

    @Override
    protected dzq b() {
        return this;
    }
}

