/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 */
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

public class ilp
implements AutoCloseable {
    private final amo a;
    private final ilk b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final int i;

    protected ilp(amo $$0, ilk $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        this.a = $$0;
        this.b = $$1;
        this.i = $$6;
        this.c = $$4;
        this.d = $$5;
        this.e = (float)($$4 + $$6) / (float)$$2;
        this.f = (float)($$4 + $$6 + $$1.b()) / (float)$$2;
        this.g = (float)($$5 + $$6) / (float)$$3;
        this.h = (float)($$5 + $$6 + $$1.c()) / (float)$$3;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.f;
    }

    public ilk e() {
        return this.b;
    }

    public @Nullable ilk.b a(GpuBufferSlice $$0, int $$1) {
        return this.b.a($$0, $$1);
    }

    public float a(float $$0) {
        float $$1 = this.f - this.e;
        return this.e + $$1 * $$0;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.h;
    }

    public float b(float $$0) {
        float $$1 = this.h - this.g;
        return this.g + $$1 * $$0;
    }

    public amo h() {
        return this.a;
    }

    public String toString() {
        return "TextureAtlasSprite{contents='" + String.valueOf(this.b) + "', u0=" + this.e + ", u1=" + this.f + ", v0=" + this.g + ", v1=" + this.h + "}";
    }

    public void a(GpuTexture $$0, int $$1) {
        this.b.a($$0, $$1);
    }

    public fzp a(fzp $$0) {
        return new hpm($$0, this);
    }

    boolean i() {
        return this.b.a();
    }

    public void a(ByteBuffer $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = 0; $$6 <= $$2; ++$$6) {
            Std140Builder.intoBuffer(MemoryUtil.memSlice((ByteBuffer)$$0, (int)($$1 + $$6 * $$5), (int)$$5)).putMat4f((Matrix4fc)new Matrix4f().ortho2D(0.0f, (float)($$3 >> $$6), 0.0f, (float)($$4 >> $$6))).putMat4f((Matrix4fc)new Matrix4f().translate((float)(this.c >> $$6), (float)(this.d >> $$6), 0.0f).scale((float)(this.b.b() + this.i * 2 >> $$6), (float)(this.b.c() + this.i * 2 >> $$6), 1.0f)).putFloat((float)this.i / (float)this.b.b()).putFloat((float)this.i / (float)this.b.c()).putInt($$6);
        }
    }

    @Override
    public void close() {
        this.b.close();
    }
}

