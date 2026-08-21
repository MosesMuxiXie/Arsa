/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class hpu {
    public static final amo a = amo.b("textures/misc/forcefield.png");
    private boolean b = true;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private final GpuBuffer i = RenderSystem.getDevice().createBuffer(() -> "World border vertex buffer", 40, 16L * (long)fzk.i.getVertexSize());
    private final RenderSystem.a j = RenderSystem.getSequentialBuffer(VertexFormat.b.h);

    private void a(ikx $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6) {
        try (fzi $$7 = fzi.a(fzk.i.getVertexSize() * 4 * 4);){
            double $$8 = $$0.a;
            double $$9 = $$0.b;
            double $$10 = $$0.c;
            double $$11 = $$0.d;
            double $$12 = Math.max((double)bgj.c($$2 - $$1), $$10);
            double $$13 = Math.min((double)bgj.e($$2 + $$1), $$11);
            float $$14 = (float)(bgj.c($$12) & 1) * 0.5f;
            float $$15 = (float)($$13 - $$12) / 2.0f;
            double $$16 = Math.max((double)bgj.c($$3 - $$1), $$8);
            double $$17 = Math.min((double)bgj.e($$3 + $$1), $$9);
            float $$18 = (float)(bgj.c($$16) & 1) * 0.5f;
            float $$19 = (float)($$17 - $$16) / 2.0f;
            fzh $$20 = new fzh($$7, VertexFormat.b.h, fzk.i);
            $$20.a(0.0f, -$$4, (float)($$11 - $$12)).a($$18, $$5);
            $$20.a((float)($$17 - $$16), -$$4, (float)($$11 - $$12)).a($$19 + $$18, $$5);
            $$20.a((float)($$17 - $$16), $$4, (float)($$11 - $$12)).a($$19 + $$18, $$6);
            $$20.a(0.0f, $$4, (float)($$11 - $$12)).a($$18, $$6);
            $$20.a(0.0f, -$$4, 0.0f).a($$14, $$5);
            $$20.a(0.0f, -$$4, (float)($$13 - $$12)).a($$15 + $$14, $$5);
            $$20.a(0.0f, $$4, (float)($$13 - $$12)).a($$15 + $$14, $$6);
            $$20.a(0.0f, $$4, 0.0f).a($$14, $$6);
            $$20.a((float)($$17 - $$16), -$$4, 0.0f).a($$18, $$5);
            $$20.a(0.0f, -$$4, 0.0f).a($$19 + $$18, $$5);
            $$20.a(0.0f, $$4, 0.0f).a($$19 + $$18, $$6);
            $$20.a((float)($$17 - $$16), $$4, 0.0f).a($$18, $$6);
            $$20.a((float)($$9 - $$16), -$$4, (float)($$13 - $$12)).a($$14, $$5);
            $$20.a((float)($$9 - $$16), -$$4, 0.0f).a($$15 + $$14, $$5);
            $$20.a((float)($$9 - $$16), $$4, 0.0f).a($$15 + $$14, $$6);
            $$20.a((float)($$9 - $$16), $$4, (float)($$13 - $$12)).a($$14, $$6);
            try (fzl $$21 = $$20.b();){
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.i.slice(), $$21.a());
            }
            this.e = $$8;
            this.f = $$9;
            this.g = $$10;
            this.h = $$11;
            this.c = $$16;
            this.d = $$12;
            this.b = false;
        }
    }

    public void a(eqa $$0, float $$1, ftm $$2, double $$3, ikx $$4) {
        $$4.a = $$0.a($$1);
        $$4.b = $$0.c($$1);
        $$4.c = $$0.b($$1);
        $$4.d = $$0.d($$1);
        if ($$2.g < $$4.b - $$3 && $$2.g > $$4.a + $$3 && $$2.i < $$4.d - $$3 && $$2.i > $$4.c + $$3 || $$2.g < $$4.a - $$3 || $$2.g > $$4.b + $$3 || $$2.i < $$4.c - $$3 || $$2.i > $$4.d + $$3) {
            $$4.f = 0.0;
            return;
        }
        $$4.f = 1.0 - $$0.b($$2.g, $$2.i) / $$3;
        $$4.f = Math.pow($$4.f, 4.0);
        $$4.f = bgj.a($$4.f, 0.0, 1.0);
        $$4.e = $$0.c().a();
    }

    public void a(ikx $$0, ftm $$1, double $$2, double $$3) {
        GpuTextureView $$21;
        GpuTextureView $$20;
        if ($$0.f <= 0.0) {
            return;
        }
        double $$4 = $$1.g;
        double $$5 = $$1.i;
        float $$6 = (float)$$3;
        float $$7 = (float)bel.c($$0.e) / 255.0f;
        float $$8 = (float)bel.d($$0.e) / 255.0f;
        float $$9 = (float)bel.e($$0.e) / 255.0f;
        float $$10 = (float)(bhs.c() % 3000L) / 3000.0f;
        float $$11 = (float)(-bgj.h($$1.h * 0.5));
        float $$12 = $$11 + $$6;
        if (this.a($$0)) {
            this.a($$0, $$2, $$5, $$4, $$6, $$12, $$11);
        }
        ilr $$13 = gfj.V().af();
        ikz $$14 = $$13.b(a);
        RenderPipeline $$15 = hpa.ag;
        fxt $$16 = gfj.V().l();
        fxt $$17 = gfj.V().e.u();
        if ($$17 != null) {
            GpuTextureView $$18 = $$17.d();
            GpuTextureView $$19 = $$17.f();
        } else {
            $$20 = $$16.d();
            $$21 = $$16.f();
        }
        GpuBuffer $$22 = this.j.b(6);
        GpuBufferSlice $$23 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f($$7, $$8, $$9, (float)$$0.f), (Vector3fc)new Vector3f((float)(this.c - $$4), (float)(-$$1.h), (float)(this.d - $$5)), (Matrix4fc)new Matrix4f().translation($$10, $$10, 0.0f));
        try (RenderPass $$24 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "World border", $$20, OptionalInt.empty(), $$21, OptionalDouble.empty());){
            $$24.setPipeline($$15);
            RenderSystem.bindDefaultUniforms($$24);
            $$24.setUniform("DynamicTransforms", $$23);
            $$24.setIndexBuffer($$22, this.j.a());
            $$24.bindTexture("Sampler0", $$14.b(), $$14.c());
            $$24.setVertexBuffer(0, this.i);
            ArrayList $$25 = new ArrayList();
            for (ikx.a $$26 : $$0.a($$4, $$5)) {
                if (!($$26.b() < $$2)) continue;
                int $$27 = $$26.a().e();
                $$25.add(new RenderPass.a(0, this.i, $$22, this.j.a(), 6 * $$27, 6));
            }
            $$24.drawMultipleIndexed($$25, null, null, Collections.emptyList(), this);
        }
    }

    public void a() {
        this.b = true;
    }

    private boolean a(ikx $$0) {
        return this.b || $$0.a != this.e || $$0.c != this.g || $$0.b != this.f || $$0.d != this.h;
    }
}

