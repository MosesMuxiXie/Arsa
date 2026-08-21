/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eik
extends ecb
implements dzt {
    public static final MapCodec<eik> c = eik.b(eik::new);

    public MapCodec<eik> a() {
        return c;
    }

    public eik(eog.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        eik.a((dwo)$$0, $$2, new dlt(this));
    }
}

