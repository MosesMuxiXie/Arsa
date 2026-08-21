/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class fvi
extends Enum<fvi> {
    public static final /* enum */ fvi a = new fvi(-3);
    public static final /* enum */ fvi b = new fvi(-2);
    public static final /* enum */ fvi c = new fvi(-1);
    public static final /* enum */ fvi d = new fvi(0);
    public static final /* enum */ fvi e = new fvi(1);
    public static final /* enum */ fvi f = new fvi(2);
    public static final /* enum */ fvi g = new fvi(3);
    public static final Codec<fvi> h;
    private final int i;
    private static final /* synthetic */ fvi[] j;

    public static fvi[] values() {
        return (fvi[])j.clone();
    }

    public static fvi valueOf(String $$0) {
        return Enum.valueOf(fvi.class, $$0);
    }

    private fvi(int $$0) {
        this.i = $$0;
    }

    public static fvi a(int $$0) {
        for (fvi $$1 : fvi.values()) {
            if ($$1.i != $$0) continue;
            return $$1;
        }
        if ($$0 < fvi.a.i) {
            return a;
        }
        return g;
    }

    public int a() {
        return this.i;
    }

    private static /* synthetic */ fvi[] b() {
        return new fvi[]{a, b, c, d, e, f, g};
    }

    static {
        j = fvi.b();
        h = Codec.INT.xmap(fvi::a, fvi::a);
    }
}

