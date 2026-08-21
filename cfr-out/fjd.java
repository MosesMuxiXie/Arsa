/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public abstract class fjd {
    public static final Codec<fjd> c = mi.p.q().dispatch("predicate_type", fjd::a, fje::codec);

    public abstract boolean a(is var1, is var2, is var3, bgr var4);

    protected abstract fje<?> a();
}

