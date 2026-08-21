/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class aai {
    public static final MapCodec<aag> a = mi.al.q().dispatchMap(aag::a, aah::a);
    public static final Codec<aag> b = a.codec();
    public static final aao<xq, aag> c = aam.a(mj.af).b(aag::a, aah::b);
    public static final aao<xq, Optional<aag>> d = c.a(aam::a);

    public static aah<?> a(jq<aah<?>> $$0) {
        jq.a($$0, "blank", aae.b);
        jq.a($$0, "styled", aaj.a);
        return jq.a($$0, "fixed", aaf.a);
    }
}

