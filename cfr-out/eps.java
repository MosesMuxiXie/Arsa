/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class eps
extends Enum<eps>
implements bhh {
    public static final /* enum */ eps a = new eps("save");
    public static final /* enum */ eps b = new eps("load");
    public static final /* enum */ eps c = new eps("corner");
    public static final /* enum */ eps d = new eps("data");
    @Deprecated
    public static final Codec<eps> e;
    private final String f;
    private final yh g;
    private static final /* synthetic */ eps[] h;

    public static eps[] values() {
        return (eps[])h.clone();
    }

    public static eps valueOf(String $$0) {
        return Enum.valueOf(eps.class, $$0);
    }

    private eps(String $$0) {
        this.f = $$0;
        this.g = yh.c("structure_block.mode_info." + $$0);
    }

    @Override
    public String c() {
        return this.f;
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ eps[] b() {
        return new eps[]{a, b, c, d};
    }

    static {
        h = eps.b();
        e = bfm.c(eps::valueOf);
    }
}

