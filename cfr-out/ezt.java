/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezt
implements fac {
    public static final Codec<ezt> a = fcd.a.fieldOf("state_provider").xmap(ezt::new, $$0 -> $$0.b).codec();
    public final fcd b;

    public ezt(fcd $$0) {
        this.b = $$0;
    }
}

