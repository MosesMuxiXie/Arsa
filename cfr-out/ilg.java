/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.textures.GpuTextureView;

public class ilg
implements AutoCloseable {
    private static final int e = 16;
    public static final int a = 0;
    public static final int b = 3;
    public static final int c = 10;
    public static final int d = ilg.a(0, 10);
    private final ilc f = new ilc("Entity Color Overlay", 16, 16, false);

    public ilg() {
        fyh $$0 = this.f.e();
        for (int $$1 = 0; $$1 < 16; ++$$1) {
            for (int $$2 = 0; $$2 < 16; ++$$2) {
                if ($$1 < 8) {
                    $$0.b($$2, $$1, -1291911168);
                    continue;
                }
                int $$3 = (int)((1.0f - (float)$$2 / 15.0f * 0.75f) * 255.0f);
                $$0.b($$2, $$1, bel.i($$3));
            }
        }
        this.f.d();
    }

    @Override
    public void close() {
        this.f.close();
    }

    public static int a(float $$0) {
        return (int)($$0 * 15.0f);
    }

    public static int a(boolean $$0) {
        return $$0 ? 3 : 10;
    }

    public static int a(int $$0, int $$1) {
        return $$0 | $$1 << 16;
    }

    public static int a(float $$0, boolean $$1) {
        return ilg.a(ilg.a($$0), ilg.a($$1));
    }

    public GpuTextureView a() {
        return this.f.b();
    }
}

