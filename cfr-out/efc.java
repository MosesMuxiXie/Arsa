/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efc
extends ehw {
    public static final MapCodec<efc> a = efc.b(efc::new);

    public MapCodec<efc> a() {
        return a;
    }

    public efc(eog.d $$0) {
        super($$0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        super.a($$0, $$1, $$2, $$3);
        if ($$3.a(10) == 0) {
            $$1.a(ly.ad, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
        }
    }
}

