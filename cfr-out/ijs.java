/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class ijs {
    private static final int e = 0x100000;
    public static final int a = 0x400000;
    public static final int b = 786432;
    public static final int c = 1536;
    private final ijr f;
    private final Optional<ijs> g;
    protected final String d;

    private ijs(String $$0, ijr $$12) {
        this.d = $$0;
        this.f = $$12;
        this.g = $$12.e == ijr.a.c ? $$12.b.values().stream().findFirst().map($$1 -> ijt.a.apply($$1.a(), $$0.a.isCull())) : Optional.empty();
    }

    static ijs a(String $$0, ijr $$1) {
        return new ijs($$0, $$1);
    }

    public String toString() {
        return "RenderType[" + this.d + ":" + String.valueOf(this.f) + "]";
    }

    public void a(fzl $$0) {
        Matrix4fStack $$1 = RenderSystem.getModelViewStack();
        Consumer<Matrix4fStack> $$2 = this.f.k.a();
        if ($$2 != null) {
            $$1.pushMatrix();
            $$2.accept($$1);
        }
        GpuBufferSlice $$3 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)this.f.c.a());
        Map<String, ijr.c> $$4 = this.f.a();
        try (fzl fzl2 = $$0;){
            GpuTextureView $$12;
            VertexFormat.a $$10;
            GpuBuffer $$9;
            GpuBuffer $$5 = this.f.a.getVertexFormat().uploadImmediateVertexBuffer($$0.a());
            if ($$0.b() == null) {
                RenderSystem.a $$6 = RenderSystem.getSequentialBuffer($$0.c().d());
                GpuBuffer $$7 = $$6.b($$0.c().c());
                VertexFormat.a $$8 = $$6.a();
            } else {
                $$9 = this.f.a.getVertexFormat().uploadImmediateIndexBuffer($$0.b());
                $$10 = $$0.c().e();
            }
            fxt $$11 = this.f.d.a();
            GpuTextureView gpuTextureView = $$12 = RenderSystem.outputColorTextureOverride != null ? RenderSystem.outputColorTextureOverride : $$11.d();
            GpuTextureView $$13 = $$11.f ? (RenderSystem.outputDepthTextureOverride != null ? RenderSystem.outputDepthTextureOverride : $$11.f()) : null;
            try (RenderPass $$14 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Immediate draw for " + this.d, $$12, OptionalInt.empty(), $$13, OptionalDouble.empty());){
                $$14.setPipeline(this.f.a);
                fzc $$15 = RenderSystem.getScissorStateForRenderTypeDraws();
                if ($$15.b()) {
                    $$14.enableScissor($$15.c(), $$15.d(), $$15.e(), $$15.f());
                }
                RenderSystem.bindDefaultUniforms($$14);
                $$14.setUniform("DynamicTransforms", $$3);
                $$14.setVertexBuffer(0, $$5);
                for (Map.Entry<String, ijr.c> $$16 : $$4.entrySet()) {
                    $$14.bindTexture($$16.getKey(), $$16.getValue().a(), $$16.getValue().b());
                }
                $$14.setIndexBuffer($$9, $$10);
                $$14.drawIndexed(0, 0, $$0.c().c(), 1);
            }
        }
        if ($$2 != null) {
            $$1.popMatrix();
        }
    }

    public int a() {
        return this.f.j;
    }

    public VertexFormat b() {
        return this.f.a.getVertexFormat();
    }

    public VertexFormat.b c() {
        return this.f.a.getVertexFormatMode();
    }

    public Optional<ijs> d() {
        return this.g;
    }

    public boolean e() {
        return this.f.e == ijr.a.b;
    }

    public RenderPipeline f() {
        return this.f.a;
    }

    public boolean g() {
        return this.f.h;
    }

    public boolean h() {
        return !this.c().k;
    }

    public boolean i() {
        return this.f.i;
    }
}

