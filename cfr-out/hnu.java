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

public class hnu
implements AutoCloseable {
    private final GpuBuffer a;
    private final GpuBufferSlice b;
    private final float c;
    private final float d;
    private int e;
    private int f;
    private float g;

    public hnu(String $$0, float $$1, float $$2) {
        this.c = $$1;
        this.d = $$2;
        GpuDevice $$3 = RenderSystem.getDevice();
        this.a = $$3.createBuffer(() -> "Projection matrix UBO " + $$0, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.b = this.a.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    public GpuBufferSlice a(int $$0, int $$1, float $$2) {
        if (this.e != $$0 || this.f != $$1 || this.g != $$2) {
            Matrix4f $$3 = this.b($$0, $$1, $$2);
            try (MemoryStack $$4 = MemoryStack.stackPush();){
                ByteBuffer $$5 = Std140Builder.onStack($$4, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)$$3).get();
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.a.slice(), $$5);
            }
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }
        return this.b;
    }

    private Matrix4f b(int $$0, int $$1, float $$2) {
        return new Matrix4f().perspective($$2 * ((float)Math.PI / 180), (float)$$0 / (float)$$1, this.c, this.d);
    }

    @Override
    public void close() {
        this.a.close();
    }
}

