/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record dtf() {
    public static final dtf a = new dtf();
    public static final Codec<dtf> b = MapCodec.unitCodec((Object)a);
}

