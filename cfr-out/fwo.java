/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.textures.GpuTexture;

public interface fwo {
    public int a();

    public int b();

    public void a(int var1, int var2, GpuTexture var3);

    public boolean c();

    public float d();

    default public float e() {
        return this.i();
    }

    default public float f() {
        return this.e() + (float)this.a() / this.d();
    }

    default public float g() {
        return 7.0f - this.j();
    }

    default public float h() {
        return this.g() + (float)this.b() / this.d();
    }

    default public float i() {
        return 0.0f;
    }

    default public float j() {
        return 7.0f;
    }
}

