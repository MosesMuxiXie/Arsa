/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eic
extends dzq {
    public static final MapCodec<eic> a = eic.b(eic::new);
    private static final yh c = yh.c("container.stonecutter");
    public static final epf<iz> b = edt.f;
    private static final fug d = dzq.b(16.0, 0.0, 9.0);

    public MapCodec<eic> a() {
        return a;
    }

    public eic(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.c));
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.g().g());
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.aA);
        }
        return cdc.a;
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new djo($$2, $$3, dhw.a($$1, $$22)), c);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
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
        $$0.a(new epk[]{b});
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

