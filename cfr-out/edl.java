/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class edl
extends edj
implements dzt {
    public static final eph e = eox.aB;
    public static final int f = 25;
    private final double c;

    protected edl(eog.d $$0, iz $$1, fug $$2, boolean $$3, double $$4) {
        super($$0, $$1, $$2, $$3);
        this.c = $$4;
        this.l((eoh)((eoh)this.C.b()).b(e, 0));
    }

    protected abstract MapCodec<? extends edl> a();

    @Override
    public eoh b(bgr $$0) {
        return (eoh)this.m().b(e, $$0.a(25));
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(e) < 25;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        is $$4;
        if ($$0.c(e) < 25 && $$3.j() < this.c && this.h($$1.a_($$4 = $$2.a(this.a)))) {
            $$1.c($$4, this.a($$0, $$1.y));
        }
    }

    protected eoh a(eoh $$0, bgr $$1) {
        return (eoh)$$0.a(e);
    }

    public eoh q(eoh $$0) {
        return (eoh)$$0.b(e, 25);
    }

    public boolean r(eoh $$0) {
        return $$0.c(e) == 25;
    }

    protected eoh a(eoh $$0, eoh $$1) {
        return $$1;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == this.a.g()) {
            if (!$$0.a($$1, $$3)) {
                $$2.a($$3, this, 1);
            } else {
                eoh $$8 = $$1.a_($$3.a(this.a));
                if ($$8.a(this) || $$8.a(this.b())) {
                    return this.a($$0, this.b().m());
                }
            }
        }
        if ($$4 == this.a && ($$6.a(this) || $$6.a(this.b()))) {
            return this.a($$0, this.b().m());
        }
        if (this.b) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{e});
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return this.h($$0.a_($$1.a(this.a)));
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        is $$4 = $$2.a(this.a);
        int $$5 = Math.min($$3.c(e) + 1, 25);
        int $$6 = this.a($$1);
        for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); ++$$7) {
            $$0.c($$4, (eoh)$$3.b(e, $$5));
            $$4 = $$4.a(this.a);
            $$5 = Math.min($$5 + 1, 25);
        }
    }

    protected abstract int a(bgr var1);

    protected abstract boolean h(eoh var1);

    @Override
    protected edl c() {
        return this;
    }
}

