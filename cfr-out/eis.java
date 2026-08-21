/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eis
extends dzq {
    public static final MapCodec<eis> a = eis.b(eis::new);
    public static final eoy b = eox.H;

    public MapCodec<eis> a() {
        return a;
    }

    public eis(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(b, false));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        if ($$1.I($$2) && eis.a($$1, $$2)) {
            $$1.a($$2, false);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.I($$2) && eis.a($$1, $$2)) {
            $$1.a($$2, false);
        }
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if (!$$0.B_() && !$$3.gL().d && $$2.c(b).booleanValue()) {
            eis.a($$0, $$1);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(axf $$0, is $$1, dwi $$2) {
        if (!$$0.U().a(eua.ad).booleanValue()) {
            return;
        }
        czm $$3 = new czm($$0, (double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5, $$2.c());
        int $$4 = $$3.f();
        $$3.a((short)($$0.y.a($$4 / 4) + $$4 / 8));
        $$0.b($$3);
    }

    public static boolean a(dwo $$0, is $$1) {
        return eis.a($$0, $$1, null);
    }

    private static boolean a(dwo $$0, is $$1, @Nullable chl $$2) {
        axf $$3;
        if (!($$0 instanceof axf) || !($$3 = (axf)$$0).U().a(eua.ad).booleanValue()) {
            return false;
        }
        czm $$5 = new czm($$0, (double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5, $$2);
        $$0.b($$5);
        $$0.a(null, $$5.dP(), $$5.dR(), $$5.dV(), bda.CQ, bdb.e, 1.0f, 1.0f);
        $$0.a((cgk)$$2, etk.I, $$1);
        return true;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        axf $$8;
        if (!$$0.a(dlx.pT) && !$$0.a(dlx.wi)) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }
        if (eis.a($$2, $$3, $$4)) {
            $$2.a($$3, dzs.a.m(), 11);
            dlp $$7 = $$0.h();
            if ($$0.a(dlx.pT)) {
                $$0.a(1, (chl)$$4, $$5.a());
            } else {
                $$0.a(1, (chl)$$4);
            }
            $$4.b(bdk.c.b($$7));
        } else if ($$2 instanceof axf && !($$8 = (axf)$$2).U().a(eua.ad).booleanValue()) {
            $$4.a(yh.c("block.minecraft.tnt.disabled"), true);
            return cdc.e;
        }
        return cdc.a;
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        if ($$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            is $$5 = $$2.b();
            cgk $$6 = $$3.p();
            if ($$3.cp() && $$3.c($$4, $$5) && eis.a($$0, $$5, $$6 instanceof chl ? (chl)$$6 : null)) {
                $$0.a($$5, false);
            }
        }
    }

    @Override
    public boolean a(dwi $$0) {
        return false;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

