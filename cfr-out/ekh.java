/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ekh
extends edk {
    public static final MapCodec<ekh> c = ekh.b(ekh::new);
    private static final fug e = dzq.b(14.0, 0.0, 16.0);

    public MapCodec<ekh> a() {
        return c;
    }

    public ekh(eog.d $$0) {
        super($$0, iz.a, e, false);
    }

    @Override
    protected edl c() {
        return (edl)dzs.px;
    }
}

