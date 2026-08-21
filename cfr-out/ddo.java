/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class ddo
extends Enum<ddo>
implements bhh {
    public static final /* enum */ ddo a = new ddo(0, "cape");
    public static final /* enum */ ddo b = new ddo(1, "jacket");
    public static final /* enum */ ddo c = new ddo(2, "left_sleeve");
    public static final /* enum */ ddo d = new ddo(3, "right_sleeve");
    public static final /* enum */ ddo e = new ddo(4, "left_pants_leg");
    public static final /* enum */ ddo f = new ddo(5, "right_pants_leg");
    public static final /* enum */ ddo g = new ddo(6, "hat");
    public static final Codec<ddo> h;
    private final int i;
    private final int j;
    private final String k;
    private final yh l;
    private static final /* synthetic */ ddo[] m;

    public static ddo[] values() {
        return (ddo[])m.clone();
    }

    public static ddo valueOf(String $$0) {
        return Enum.valueOf(ddo.class, $$0);
    }

    private ddo(int $$0, String $$1) {
        this.i = $$0;
        this.j = 1 << $$0;
        this.k = $$1;
        this.l = yh.c("options.modelPart." + $$1);
    }

    public int a() {
        return this.j;
    }

    public int b() {
        return this.i;
    }

    public String d() {
        return this.k;
    }

    public yh e() {
        return this.l;
    }

    @Override
    public String c() {
        return this.k;
    }

    private static /* synthetic */ ddo[] f() {
        return new ddo[]{a, b, c, d, e, f, g};
    }

    static {
        m = ddo.f();
        h = bhh.a(ddo::values);
    }
}

