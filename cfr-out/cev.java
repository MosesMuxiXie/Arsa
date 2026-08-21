/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cev
extends Enum<cev>
implements bhh {
    public static final /* enum */ cev a = new cev("hurt", bda.wX);
    public static final /* enum */ cev b = new cev("thorns", bda.wX);
    public static final /* enum */ cev c = new cev("drowning", bda.wY);
    public static final /* enum */ cev d = new cev("burning", bda.xa);
    public static final /* enum */ cev e = new cev("poking", bda.xb);
    public static final /* enum */ cev f = new cev("freezing", bda.wZ);
    public static final Codec<cev> g;
    private final String h;
    private final bcz i;
    private static final /* synthetic */ cev[] j;

    public static cev[] values() {
        return (cev[])j.clone();
    }

    public static cev valueOf(String $$0) {
        return Enum.valueOf(cev.class, $$0);
    }

    private cev(String $$0, bcz $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    @Override
    public String c() {
        return this.h;
    }

    public bcz a() {
        return this.i;
    }

    private static /* synthetic */ cev[] b() {
        return new cev[]{a, b, c, d, e, f};
    }

    static {
        j = cev.b();
        g = bhh.a(cev::values);
    }
}

