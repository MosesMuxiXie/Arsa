/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dzi
extends dzc
implements dzh {
    public static final MapCodec<dzi> a = dzi.b(dzi::new);

    public MapCodec<dzi> a() {
        return a;
    }

    public dzi(eog.d $$0) {
        super($$0);
    }

    @Override
    public dkr b() {
        return dkr.a;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ekw($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return dzi.a($$2, eld.p, ekw::a);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if (!$$1.B_() && (elb2 = $$1.c_($$2)) instanceof ekw) {
            ekw $$5 = (ekw)elb2;
            $$3.a($$5);
            $$3.a(bdk.ad);
        }
        return cdc.a;
    }
}

