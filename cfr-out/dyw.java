/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dyw
extends dzc {
    public static final MapCodec<dyw> a = dyw.b(dyw::new);
    public static final epf<iz> b = eox.R;
    public static final eoy c = eox.y;

    public MapCodec<dyw> a() {
        return a;
    }

    public dyw(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false));
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$1 instanceof axf) {
            axf $$5 = (axf)$$1;
            elb elb2 = $$1.c_($$2);
            if (elb2 instanceof ekt) {
                ekt $$6 = (ekt)elb2;
                $$3.a($$6);
                $$3.a(bdk.at);
                dbk.a($$5, $$3, true);
            }
        }
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof ekt) {
            ((ekt)$$4).l();
        }
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new ekt($$0, $$1);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.a($$1.c_($$2));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.d().g());
    }
}

