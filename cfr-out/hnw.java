/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class hnw
implements AutoCloseable {
    private static final int a = 6;
    private final GpuBuffer b;
    private final hnu c;
    private final amo d;

    public hnw(amo $$0) {
        this.d = $$0;
        this.c = new hnu("cubemap", 0.05f, 10.0f);
        this.b = hnw.a();
    }

    public void a(gfj $$0, float $$1, float $$2) {
        RenderSystem.setProjectionMatrix(this.c.a($$0.aR().k(), $$0.aR().l(), 85.0f), fwd.a);
        RenderPipeline $$3 = hpa.aE;
        fxt $$4 = gfj.V().l();
        GpuTextureView $$5 = $$4.d();
        GpuTextureView $$6 = $$4.f();
        RenderSystem.a $$7 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        GpuBuffer $$8 = $$7.b(36);
        Matrix4fStack $$9 = RenderSystem.getModelViewStack();
        $$9.pushMatrix();
        $$9.rotationX((float)Math.PI);
        $$9.rotateX($$1 * ((float)Math.PI / 180));
        $$9.rotateY($$2 * ((float)Math.PI / 180));
        GpuBufferSlice $$10 = RenderSystem.getDynamicUniforms().a((Matrix4fc)new Matrix4f((Matrix4fc)$$9), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        $$9.popMatrix();
        try (RenderPass $$11 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Cubemap", $$5, OptionalInt.empty(), $$6, OptionalDouble.empty());){
            $$11.setPipeline($$3);
            RenderSystem.bindDefaultUniforms($$11);
            $$11.setVertexBuffer(0, this.b);
            $$11.setIndexBuffer($$8, $$7.a());
            $$11.setUniform("DynamicTransforms", $$10);
            ikz $$12 = $$0.af().b(this.d);
            $$11.bindTexture("Sampler0", $$12.b(), $$12.c());
            $$11.drawIndexed(0, 0, 36, 1);
        }
    }

    private static GpuBuffer a() {
        try (fzi $$0 = fzi.a(fzk.e.getVertexSize() * 4 * 6);){
            fzh $$1 = new fzh($$0, VertexFormat.b.h, fzk.e);
            $$1.a(-1.0f, -1.0f, 1.0f);
            $$1.a(-1.0f, 1.0f, 1.0f);
            $$1.a(1.0f, 1.0f, 1.0f);
            $$1.a(1.0f, -1.0f, 1.0f);
            $$1.a(1.0f, -1.0f, 1.0f);
            $$1.a(1.0f, 1.0f, 1.0f);
            $$1.a(1.0f, 1.0f, -1.0f);
            $$1.a(1.0f, -1.0f, -1.0f);
            $$1.a(1.0f, -1.0f, -1.0f);
            $$1.a(1.0f, 1.0f, -1.0f);
            $$1.a(-1.0f, 1.0f, -1.0f);
            $$1.a(-1.0f, -1.0f, -1.0f);
            $$1.a(-1.0f, -1.0f, -1.0f);
            $$1.a(-1.0f, 1.0f, -1.0f);
            $$1.a(-1.0f, 1.0f, 1.0f);
            $$1.a(-1.0f, -1.0f, 1.0f);
            $$1.a(-1.0f, -1.0f, -1.0f);
            $$1.a(-1.0f, -1.0f, 1.0f);
            $$1.a(1.0f, -1.0f, 1.0f);
            $$1.a(1.0f, -1.0f, -1.0f);
            $$1.a(-1.0f, 1.0f, 1.0f);
            $$1.a(-1.0f, 1.0f, -1.0f);
            $$1.a(1.0f, 1.0f, -1.0f);
            $$1.a(1.0f, 1.0f, 1.0f);
            fzl $$2 = $$1.b();
            try {
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Cube map vertex buffer", 32, $$2.a());
                if ($$2 != null) {
                    $$2.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$2 != null) {
                    try {
                        $$2.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    public void a(ilr $$0) {
        $$0.a(this.d, (ikz)new ila(this.d));
    }

    @Override
    public void close() {
        this.b.close();
        this.c.close();
    }
}

