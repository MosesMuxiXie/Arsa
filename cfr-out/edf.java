/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edf
extends edt {
    public static final MapCodec<edf> a = edf.b(edf::new);

    public MapCodec<edf> a() {
        return a;
    }

    public edf(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{f});
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(f, $$0.g().g());
    }
}

