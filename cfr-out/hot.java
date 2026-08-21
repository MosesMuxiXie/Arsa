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

public class hot
implements AutoCloseable {
    private final GpuBuffer a;
    private final GpuBufferSlice b;

    public hot(String $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        this.a = $$1.createBuffer(() -> "Projection matrix UBO " + $$0, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.b = this.a.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    public GpuBufferSlice a(Matrix4f $$0) {
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            ByteBuffer $$2 = Std140Builder.onStack($$1, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)$$0).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.a.slice(), $$2);
        }
        return this.b;
    }

    @Override
    public void close() {
        this.a.close();
    }
}

