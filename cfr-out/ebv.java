/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class ebv
extends edt {
    public static final eoy c = eox.A;
    private static final fug a = dzq.b(16.0, 0.0, 2.0);

    protected ebv(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends ebv> a();

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return this.a($$1, $$3, $$1.a_($$3));
    }

    protected boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.a((dvt)$$0, $$1, iz.b, eig.c);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (this.b((dwr)$$1, $$2, $$0)) {
            return;
        }
        boolean $$4 = $$0.c(c);
        boolean $$5 = this.a((dwo)$$1, $$2, $$0);
        if ($$4 && !$$5) {
            $$1.a($$2, (eoh)$$0.b(c, false), 2);
        } else if (!$$4) {
            $$1.a($$2, (eoh)$$0.b(c, true), 2);
            if (!$$5) {
                $$1.a($$2, (dzq)this, this.h($$0), fvi.b);
            }
        }
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.a($$1, $$2, $$3);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if (!$$0.c(c).booleanValue()) {
            return 0;
        }
        if ($$0.c(f) == $$3) {
            return this.a($$1, $$2, $$0);
        }
        return 0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$0.a((dwr)$$1, $$2)) {
            this.c($$1, $$2, $$0);
            return;
        }
        elb $$6 = $$0.x() ? $$1.c_($$2) : null;
        ebv.a($$0, $$1, $$2, $$6);
        $$1.a($$2, false);
        for (iz $$7 : iz.values()) {
            $$1.a($$2.a($$7), this);
        }
    }

    protected void c(dwo $$0, is $$1, eoh $$2) {
        boolean $$4;
        if (this.b((dwr)$$0, $$1, $$2)) {
            return;
        }
        boolean $$3 = $$2.c(c);
        if ($$3 != ($$4 = this.a($$0, $$1, $$2)) && !$$0.af().b($$1, this)) {
            fvi $$5 = fvi.c;
            if (this.b((dvt)$$0, $$1, $$2)) {
                $$5 = fvi.a;
            } else if ($$3) {
                $$5 = fvi.b;
            }
            $$0.a($$1, (dzq)this, this.h($$2), $$5);
        }
    }

    public boolean b(dwr $$0, is $$1, eoh $$2) {
        return false;
    }

    protected boolean a(dwo $$0, is $$1, eoh $$2) {
        return this.b($$0, $$1, $$2) > 0;
    }

    protected int b(dwo $$0, is $$1, eoh $$2) {
        iz $$3 = (iz)$$2.c(f);
        is $$4 = $$1.a($$3);
        int $$5 = $$0.c($$4, $$3);
        if ($$5 >= 15) {
            return $$5;
        }
        eoh $$6 = $$0.a_($$4);
        return Math.max($$5, $$6.a(dzs.cT) ? $$6.c(egb.f) : 0);
    }

    protected int a(dxg $$0, is $$1, eoh $$2) {
        iz $$3 = (iz)$$2.c(f);
        iz $$4 = $$3.h();
        iz $$5 = $$3.i();
        boolean $$6 = this.b();
        return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(f, $$0.g().g());
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        if (this.a($$0, $$1, $$2)) {
            $$0.a($$1, (dzq)this, 1);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        this.d($$1, $$2, $$0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3) {
            this.d($$1, $$2, $$0);
        }
    }

    protected void d(dwo $$0, is $$1, eoh $$2) {
        iz $$3 = (iz)$$2.c(f);
        is $$4 = $$1.a($$3.g());
        fmj $$5 = fmf.a($$0, $$3.g(), iz.b);
        $$0.b($$4, this, $$5);
        $$0.a($$4, (dzq)this, $$3, $$5);
    }

    protected boolean b() {
        return false;
    }

    protected int a(dvt $$0, is $$1, eoh $$2) {
        return 15;
    }

    public static boolean n(eoh $$0) {
        return $$0.b() instanceof ebv;
    }

    public boolean b(dvt $$0, is $$1, eoh $$2) {
        iz $$3 = ((iz)$$2.c(f)).g();
        eoh $$4 = $$0.a_($$1.a($$3));
        return ebv.n($$4) && $$4.c(f) != $$3;
    }

    protected abstract int h(eoh var1);
}

