/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

class ewj
implements evx {
    public static ewj a = new ewj();
    public static final MapCodec<ewj> e = MapCodec.unit(() -> a);

    private ewj() {
    }

    public boolean a(dxn $$0, is $$1) {
        return true;
    }

    @Override
    public evy<?> a() {
        return evy.l;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

