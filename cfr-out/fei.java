/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class fei
extends Enum<fei>
implements bhh {
    public static final /* enum */ fei a = new fei(iz.b, 1, "ceiling");
    public static final /* enum */ fei b = new fei(iz.a, -1, "floor");
    public static final Codec<fei> c;
    private final iz d;
    private final int e;
    private final String f;
    private static final /* synthetic */ fei[] g;

    public static fei[] values() {
        return (fei[])g.clone();
    }

    public static fei valueOf(String $$0) {
        return Enum.valueOf(fei.class, $$0);
    }

    private fei(iz $$0, int $$1, String $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public iz a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ fei[] d() {
        return new fei[]{a, b};
    }

    static {
        g = fei.d();
        c = bhh.a(fei::values);
    }
}

