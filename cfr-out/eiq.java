/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eiq
extends eiv {
    public static final MapCodec<eiq> a = eiq.b(eiq::new);

    public MapCodec<eiq> a() {
        return a;
    }

    public eiq(eog.d $$0) {
        super($$0);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return false;
    }

    @Override
    protected int i_(eoh $$0) {
        return 15;
    }
}

