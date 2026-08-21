/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;

class evv
extends evz {
    public static final MapCodec<evv> a = evv.a(evv::new);

    public evv(List<evx> $$0) {
        super($$0);
    }

    public boolean a(dxn $$0, is $$1) {
        for (evx $$2 : this.e) {
            if ($$2.test($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    @Override
    public evy<?> a() {
        return evy.j;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

