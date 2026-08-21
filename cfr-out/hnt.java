/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryStack
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;

public class hnt
implements AutoCloseable {
    private final GpuBuffer a;
    private final GpuBufferSlice b;
    private final float c;
    private final float d;
    private final boolean e;
    private float f;
    private float g;

    public hnt(String $$0, float $$1, float $$2, boolean $$3) {
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        GpuDevice $$4 = RenderSystem.getDevice();
        this.a = $$4.createBuffer(() -> "Projection matrix UBO " + $$0, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.b = this.a.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    public GpuBufferSlice a(float $$0, float $$1) {
        if (this.f != $$0 || this.g != $$1) {
            Matrix4f $$2 = this.b($$0, $$1);
            try (MemoryStack $$3 = MemoryStack.stackPush();){
                ByteBuffer $$4 = Std140Builder.onStack($$3, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)$$2).get();
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.a.slice(), $$4);
            }
            this.f = $$0;
            this.g = $$1;
        }
        return this.b;
    }

    private Matrix4f b(float $$0, float $$1) {
        return new Matrix4f().setOrtho(0.0f, $$0, this.e ? $$1 : 0.0f, this.e ? 0.0f : $$1, this.c, this.d);
    }

    @Override
    public void close() {
        this.a.close();
    }
}

