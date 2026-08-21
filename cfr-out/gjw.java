/*
 * Decompiled with CFR 0.152.
 */
public class gjw {
    public static final amo a = amo.b("textures/gui/title/minecraft.png");
    public static final amo b = amo.b("textures/gui/title/minceraft.png");
    public static final amo c = amo.b("textures/gui/title/edition.png");
    public static final int d = 256;
    public static final int e = 44;
    private static final int g = 256;
    private static final int h = 64;
    private static final int i = 128;
    private static final int j = 14;
    private static final int k = 128;
    private static final int l = 16;
    public static final int f = 30;
    private static final int m = 7;
    private final boolean n = (double)bgr.a().i() < 1.0E-4;
    private final boolean o;

    public gjw(boolean $$0) {
        this.o = $$0;
    }

    public void a(gir $$0, int $$1, float $$2) {
        this.a($$0, $$1, $$2, 30);
    }

    public void a(gir $$0, int $$1, float $$2, int $$3) {
        int $$4 = $$1 / 2 - 128;
        float $$5 = this.o ? 1.0f : $$2;
        int $$6 = bel.b($$5);
        $$0.a(hpa.at, this.n ? b : a, $$4, $$3, 0.0f, 0.0f, 256, 44, 256, 64, $$6);
        int $$7 = $$1 / 2 - 64;
        int $$8 = $$3 + 44 - 7;
        $$0.a(hpa.at, c, $$7, $$8, 0.0f, 0.0f, 128, 14, 128, 16, $$6);
    }

    public boolean a() {
        return this.o;
    }
}

