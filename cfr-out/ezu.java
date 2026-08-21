/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezu
implements fac {
    public static final Codec<ezu> a = eoh.a.fieldOf("state").xmap(ezu::new, $$0 -> $$0.b).codec();
    public final eoh b;

    public ezu(eoh $$0) {
        this.b = $$0;
    }
}

