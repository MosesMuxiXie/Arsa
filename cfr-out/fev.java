/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class fev {
    public static final Codec<fev> b = mi.S.q().dispatch(fev::b, few::codec);

    public abstract Stream<is> a_(fet var1, bgr var2, is var3);

    public abstract few<?> b();
}

