/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public abstract class fjk {
    public static final Codec<fjk> c = mi.n.q().dispatch("predicate_type", fjk::a, fjl::codec);

    public abstract boolean a(eoh var1, bgr var2);

    protected abstract fjl<?> a();
}

