/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezw
implements fac {
    public static final Codec<ezw> a = cch.b(0, 256).fieldOf("count").xmap(ezw::new, ezw::a).codec();
    private final cch b;

    public ezw(int $$0) {
        this.b = cce.a($$0);
    }

    public ezw(cch $$0) {
        this.b = $$0;
    }

    public cch a() {
        return this.b;
    }
}

