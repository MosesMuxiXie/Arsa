/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class eoh
extends eog.a {
    public static final Codec<eoh> a = eoh.a(mi.e.q(), dzq::m).stable();

    public eoh(dzq $$0, Reference2ObjectArrayMap<epk<?>, Comparable<?>> $$1, MapCodec<eoh> $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected eoh B() {
        return this;
    }
}

