/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

public class gkm {
    public static final gkm a = new gkm(imp.a);
    public static final gkm b = new gkm(imp.b);
    public static final gkm c = new gkm(imp.c);
    private static final int d = 123;
    private static final int e = 69;
    private static final float f = -0.34906584f;
    private final yh g;

    public gkm(yh $$0) {
        this.g = $$0;
    }

    public void a(gir $$0, int $$1, gio $$2, float $$3) {
        int $$4 = $$2.a(this.g);
        gil $$5 = $$0.h();
        float $$6 = 1.8f - bgj.c(bgj.a((double)((float)(bhs.c() % 1000L) / 1000.0f * ((float)Math.PI * 2))) * 0.1f);
        float $$7 = $$6 * 100.0f / (float)($$4 + 32);
        Matrix3x2f $$8 = new Matrix3x2f($$5.a().a()).translate((float)$$1 / 2.0f + 123.0f, 69.0f).rotate(-0.34906584f).scale($$7);
        gil.b $$9 = $$5.a().b($$3).a((Matrix3x2fc)$$8);
        $$5.a(git.a, -$$4 / 2, -8, $$9, this.g);
    }
}

