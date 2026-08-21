/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ejo
extends ejg {
    public static final MapCodec<ejo> a = ejo.b(ejo::new);
    private static final fug b = dzq.b(14.0, 0.0, 1.5);

    public MapCodec<ejo> a() {
        return a;
    }

    protected ejo(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if ($$1 instanceof axf && $$3 instanceof dgb) {
            $$1.a(new is($$2), true, $$3);
        }
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        flb $$3 = $$1.b_($$2);
        flb $$4 = $$1.b_($$2.d());
        return ($$3.a() == flc.c || $$0.b() instanceof edv) && $$4.a() == flc.a;
    }
}

