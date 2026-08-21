/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class dvb
extends dux {
    public static final MapCodec<dvb> b = dvb.a(dvb::new);
    public static final Codec<dvb> c = dvb.b(dvb::new);

    private dvb(List<dvf> $$0) {
        super($$0);
    }

    public MapCodec<dvb> a() {
        return b;
    }
}

