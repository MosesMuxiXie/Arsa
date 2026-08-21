/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import org.joml.Matrix4f;

public interface gnv
extends gnz.a {
    public static final float a = 8.0f;
    public static final float b = 8.0f;
    public static final float c = 8.0f;

    @Override
    default public void a(Matrix4f $$0, fzp $$1, int $$2, boolean $$3) {
        float $$4 = 0.0f;
        if (this.m() != 0) {
            this.a($$0, $$1, $$2, this.n(), this.n(), 0.0f, this.m());
            if (!$$3) {
                $$4 += 0.03f;
            }
        }
        this.a($$0, $$1, $$2, 0.0f, 0.0f, $$4, this.l());
    }

    public void a(Matrix4f var1, fzp var2, int var3, float var4, float var5, float var6, int var7);

    public float j();

    public float k();

    public int l();

    public int m();

    public float n();

    default public float o() {
        return 8.0f;
    }

    default public float p() {
        return 8.0f;
    }

    default public float q() {
        return 8.0f;
    }

    @Override
    default public float r() {
        return this.j();
    }

    @Override
    default public float s() {
        return this.r() + this.o();
    }

    @Override
    default public float t() {
        return this.k() + 7.0f - this.q();
    }

    @Override
    default public float u() {
        return this.c() + this.p();
    }
}

