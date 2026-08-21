/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;

class evw
extends evz {
    public static final MapCodec<evw> a = evw.a(evw::new);

    public evw(List<evx> $$0) {
        super($$0);
    }

    public boolean a(dxn $$0, is $$1) {
        for (evx $$2 : this.e) {
            if (!$$2.test($$0, $$1)) continue;
            return true;
        }
        return false;
    }

    @Override
    public evy<?> a() {
        return evy.i;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

