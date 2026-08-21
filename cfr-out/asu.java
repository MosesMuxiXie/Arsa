/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class asu {
    public static MapCodec<? extends ast> a(jq<MapCodec<? extends ast>> $$0) {
        asy.b.forEach(($$1, $$2) -> jq.a($$0, amo.b($$1.c()), $$2));
        jq.a($$0, amo.b("dynamic/run_command"), asv.b);
        return jq.a($$0, amo.b("dynamic/custom"), asw.b);
    }
}

