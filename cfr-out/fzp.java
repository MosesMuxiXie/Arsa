/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface fzp {
    public fzp a(float var1, float var2, float var3);

    public fzp a(int var1, int var2, int var3, int var4);

    public fzp a(int var1);

    public fzp a(float var1, float var2);

    public fzp a(int var1, int var2);

    public fzp b(int var1, int var2);

    public fzp b(float var1, float var2, float var3);

    public fzp a(float var1);

    default public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
        this.a($$0, $$1, $$2);
        this.a($$3);
        this.a($$4, $$5);
        this.b($$6);
        this.c($$7);
        this.b($$8, $$9, $$10);
    }

    default public fzp a(float $$0, float $$1, float $$2, float $$3) {
        return this.a((int)($$0 * 255.0f), (int)($$1 * 255.0f), (int)($$2 * 255.0f), (int)($$3 * 255.0f));
    }

    default public fzp c(int $$0) {
        return this.b($$0 & 0xFFFF, $$0 >> 16 & 0xFFFF);
    }

    default public fzp b(int $$0) {
        return this.a($$0 & 0xFFFF, $$0 >> 16 & 0xFFFF);
    }

    default public void a(fzm.a $$0, hqa $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
        this.a($$0, $$1, new float[]{1.0f, 1.0f, 1.0f, 1.0f}, $$2, $$3, $$4, $$5, new int[]{$$6, $$6, $$6, $$6}, $$7);
    }

    default public void a(fzm.a $$0, hqa $$1, float[] $$2, float $$3, float $$4, float $$5, float $$6, int[] $$7, int $$8) {
        Vector3fc $$9 = $$1.k().s();
        Matrix4f $$10 = $$0.a();
        Vector3f $$11 = $$0.a($$9, new Vector3f());
        int $$12 = $$1.n();
        for (int $$13 = 0; $$13 < 4; ++$$13) {
            Vector3fc $$14 = $$1.a($$13);
            long $$15 = $$1.b($$13);
            float $$16 = $$2[$$13];
            int $$17 = bel.a($$6, $$16 * $$3, $$16 * $$4, $$16 * $$5);
            int $$18 = hoj.b($$7[$$13], $$12);
            Vector3f $$19 = $$10.transformPosition($$14, new Vector3f());
            float $$20 = hdr.a($$15);
            float $$21 = hdr.b($$15);
            this.a($$19.x(), $$19.y(), $$19.z(), $$17, $$20, $$21, $$8, $$18, $$11.x(), $$11.y(), $$11.z());
        }
    }

    default public fzp a(Vector3fc $$0) {
        return this.a($$0.x(), $$0.y(), $$0.z());
    }

    default public fzp a(fzm.a $$0, Vector3f $$1) {
        return this.a($$0, $$1.x(), $$1.y(), $$1.z());
    }

    default public fzp a(fzm.a $$0, float $$1, float $$2, float $$3) {
        return this.a((Matrix4fc)$$0.a(), $$1, $$2, $$3);
    }

    default public fzp a(Matrix4fc $$0, float $$1, float $$2, float $$3) {
        Vector3f $$4 = $$0.transformPosition($$1, $$2, $$3, new Vector3f());
        return this.a($$4.x(), $$4.y(), $$4.z());
    }

    default public fzp a(Matrix3x2fc $$0, float $$1, float $$2) {
        Vector2f $$3 = $$0.transformPosition($$1, $$2, new Vector2f());
        return this.a($$3.x(), $$3.y(), 0.0f);
    }

    default public fzp b(fzm.a $$0, float $$1, float $$2, float $$3) {
        Vector3f $$4 = $$0.a($$1, $$2, $$3, new Vector3f());
        return this.b($$4.x(), $$4.y(), $$4.z());
    }

    default public fzp b(fzm.a $$0, Vector3f $$1) {
        return this.b($$0, $$1.x(), $$1.y(), $$1.z());
    }
}

