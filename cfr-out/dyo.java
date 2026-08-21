/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dyo
extends dzq {
    public static final MapCodec<dyo> a = dyo.b(dyo::new);

    public MapCodec<? extends dyo> a() {
        return a;
    }

    public dyo(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        if (!$$0.B_()) {
            is $$4 = $$2.b();
            $$0.a(null, $$4, bda.E, bdb.e, 1.0f, 0.5f + $$0.y.i() * 1.2f);
        }
    }
}

