/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edm
extends dzq {
    public static final MapCodec<edm> d = edm.b(edm::new);

    protected MapCodec<? extends edm> a() {
        return d;
    }

    protected edm(eog.d $$0) {
        super($$0);
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        if ($$1.a(this)) {
            return true;
        }
        return super.b($$0, $$1, $$2);
    }
}

