/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ekf
extends dzq {
    public static final MapCodec<ekf> a = ekf.b(ekf::new);

    public MapCodec<ekf> a() {
        return a;
    }

    public ekf(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        chl $$7;
        ftm $$6 = new ftm(0.25, 0.05f, 0.25);
        if ($$3 instanceof chl && ($$7 = (chl)$$3).d(cfo.K)) {
            $$6 = new ftm(0.5, 0.25, 0.5);
        }
        $$3.a($$0, $$6);
    }
}

