/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ejd
extends edk {
    public static final MapCodec<ejd> c = ejd.b(ejd::new);
    private static final fug e = dzq.b(8.0, 0.0, 16.0);

    public MapCodec<ejd> a() {
        return c;
    }

    public ejd(eog.d $$0) {
        super($$0, iz.b, e, false);
    }

    @Override
    protected edl c() {
        return (edl)dzs.pz;
    }
}

