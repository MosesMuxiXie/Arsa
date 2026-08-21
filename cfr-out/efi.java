/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class efi
extends dzq {
    public static final MapCodec<efi> a = efi.b(efi::new);
    public static final epf<epi> b = eox.bk;
    public static final eoy c = eox.A;
    public static final eph d = eox.aV;
    public static final int e = 3;

    public MapCodec<efi> a() {
        return a;
    }

    public efi(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, epi.a)).b(d, 0)).b(c, false));
    }

    private eoh a(dwr $$0, is $$1, eoh $$2) {
        epi $$3 = $$0.a_($$1.d()).E();
        if ($$3.e()) {
            return (eoh)$$2.b(b, $$3);
        }
        epi $$4 = $$0.a_($$1.e()).E();
        epi $$5 = $$4.e() ? epi.a : $$4;
        return (eoh)$$2.b(b, $$5);
    }

    @Override
    public eoh a(dpu $$0) {
        return this.a((dwr)$$0.q(), $$0.a(), this.m());
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        boolean $$8;
        boolean bl2 = $$8 = $$4.o() == iz.a.b;
        if ($$8) {
            return this.a($$1, $$3, $$0);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        boolean $$6 = $$1.I($$2);
        if ($$6 != $$0.c(c)) {
            if ($$6) {
                this.a(null, $$0, $$1, $$2);
            }
            $$1.a($$2, (eoh)$$0.b(c, $$6), 3);
        }
    }

    private void a(@Nullable cgk $$0, eoh $$1, dwo $$2, is $$3) {
        if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
            $$2.a($$3, (dzq)this, 0, 0);
            $$2.a($$0, etk.H, $$3);
        }
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$0.a(bdy.bQ) && $$6.c() == iz.b) {
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$0 = (eoh)$$0.a(d);
            $$1.a($$2, $$0, 3);
            this.a($$3, $$0, $$1, $$2);
            $$3.a(bdk.ai);
        }
        return cdc.a;
    }

    @Override
    protected void a_(eoh $$0, dwo $$1, is $$2, ddm $$3) {
        if ($$1.B_()) {
            return;
        }
        this.a($$3, $$0, $$1, $$2);
        $$3.a(bdk.ah);
    }

    public static float b(int $$0) {
        return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
    }

    @Override
    protected boolean a(eoh $$0, dwo $$1, is $$2, int $$3, int $$4) {
        jd<bcz> $$11;
        float $$8;
        epi $$5 = $$0.c(b);
        if ($$5.b()) {
            int $$6 = $$0.c(d);
            float $$7 = efi.b($$6);
            $$1.a(ly.ae, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
        } else {
            $$8 = 1.0f;
        }
        if ($$5.d()) {
            amo $$9 = this.a($$1, $$2);
            if ($$9 == null) {
                return false;
            }
            jd<bcz> $$10 = jd.a(bcz.a($$9));
        } else {
            $$11 = $$5.a();
        }
        $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$11, bdb.c, 3.0f, $$8, $$1.y.g());
        return true;
    }

    private @Nullable amo a(dwo $$0, is $$1) {
        elb elb2 = $$0.c_($$1.d());
        if (elb2 instanceof emu) {
            emu $$2 = (emu)elb2;
            return $$2.c();
        }
        return null;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }
}

