/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eeq
extends edt {
    public static final MapCodec<eeq> a = eeq.b(eeq::new);
    private static final yh b = yh.c("container.loom");

    public MapCodec<eeq> a() {
        return a;
    }

    protected eeq(eog.d $$0) {
        super($$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.az);
        }
        return cdc.a;
    }

    @Override
    protected cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new diq($$2, $$3, dhw.a($$1, $$22)), b);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(f, $$0.g().g());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{f});
    }
}

