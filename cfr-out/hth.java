/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Locale;

public final class hth
extends Enum<hth> {
    public static final /* enum */ hth a = new hth(hpa.c, 0x400000, false);
    public static final /* enum */ hth b = new hth(hpa.f, 0x400000, false);
    public static final /* enum */ hth c = new hth(hpa.g, 786432, true);
    public static final /* enum */ hth d = new hth(hpa.i, 1536, true);
    private final RenderPipeline e;
    private final int f;
    private final boolean g;
    private final String h;
    private static final /* synthetic */ hth[] i;

    public static hth[] values() {
        return (hth[])i.clone();
    }

    public static hth valueOf(String $$0) {
        return Enum.valueOf(hth.class, $$0);
    }

    private hth(RenderPipeline $$0, int $$1, boolean $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = this.toString().toLowerCase(Locale.ROOT);
    }

    public RenderPipeline a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public String c() {
        return this.h;
    }

    public boolean d() {
        return this.g;
    }

    private static /* synthetic */ hth[] e() {
        return new hth[]{a, b, c, d};
    }

    static {
        i = hth.e();
    }
}

