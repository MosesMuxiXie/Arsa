/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eea
extends dzc {
    public static final MapCodec<eea> a = eea.b(eea::new);
    public static final eoy b = eox.q;

    public MapCodec<eea> a() {
        return a;
    }

    protected eea(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, false));
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        dpf<eld<?>> $$5 = $$4.a(ki.ah);
        if ($$5 != null && $$5.a("RecordItem")) {
            $$0.a($$1, (eoh)$$2.b(b, true), 2);
        }
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if ($$0.c(b).booleanValue() && (elb2 = $$1.c_($$2)) instanceof emh) {
            emh $$5 = (emh)elb2;
            $$5.l();
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$1.c(b).booleanValue()) {
            return cdc.f;
        }
        dlt $$7 = $$4.b($$5);
        cdc $$8 = dly.a($$2, $$3, $$7, $$4);
        if (!$$8.a()) {
            return cdc.f;
        }
        return $$8;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emh($$0, $$1);
    }

    @Override
    public boolean f_(eoh $$0) {
        return true;
    }

    @Override
    public int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        emh $$4;
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof emh && ($$4 = (emh)elb2).h().a()) {
            return 15;
        }
        return 0;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof emh) {
            emh $$4 = (emh)elb2;
            return $$4.m();
        }
        return 0;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        if ($$1.c(b).booleanValue()) {
            return eea.a($$2, eld.e, emh::a);
        }
        return null;
    }
}

