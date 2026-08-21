/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
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
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class hpk
implements AutoCloseable {
    private static final amo a = amo.b("sun");
    private static final amo b = amo.b("end_flash");
    private static final amo c = amo.b("textures/environment/end_sky.png");
    private static final float d = 512.0f;
    private static final int e = 10;
    private static final int f = 1500;
    private static final float g = 30.0f;
    private static final float h = 100.0f;
    private static final float i = 20.0f;
    private static final float j = 100.0f;
    private static final int k = 16;
    private static final int l = 6;
    private static final float m = 100.0f;
    private static final float n = 60.0f;
    private final ilo o;
    private final GpuBuffer p;
    private final GpuBuffer q;
    private final GpuBuffer r;
    private final GpuBuffer s;
    private final GpuBuffer t;
    private final GpuBuffer u;
    private final GpuBuffer v;
    private final GpuBuffer w;
    private final RenderSystem.a x = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
    private final ikz y;
    private int z;

    public hpk(ilr $$0, inl $$1) {
        this.o = $$1.a(ml.o);
        this.p = this.d();
        this.s = hpk.e();
        this.y = this.a($$0, c);
        this.w = hpk.b(this.o);
        this.t = hpk.a(this.o);
        this.u = hpk.c(this.o);
        this.v = this.c();
        try (fzi $$2 = fzi.a(10 * fzk.e.getVertexSize());){
            fzh $$3 = new fzh($$2, VertexFormat.b.g, fzk.e);
            this.a($$3, 16.0f);
            try (fzl $$4 = $$3.b();){
                this.q = RenderSystem.getDevice().createBuffer(() -> "Top sky vertex buffer", 32, $$4.a());
            }
            $$3 = new fzh($$2, VertexFormat.b.g, fzk.e);
            this.a($$3, -16.0f);
            try (fzl $$5 = $$3.b();){
                this.r = RenderSystem.getDevice().createBuffer(() -> "Bottom sky vertex buffer", 32, $$5.a());
            }
        }
    }

    private ikz a(ilr $$0, amo $$1) {
        return $$0.b($$1);
    }

    private GpuBuffer c() {
        int $$0 = 18;
        int $$1 = fzk.f.getVertexSize();
        try (fzi $$2 = fzi.a(18 * $$1);){
            fzh $$3 = new fzh($$2, VertexFormat.b.g, fzk.f);
            int $$4 = bel.b(1.0f);
            int $$5 = bel.b(0.0f);
            $$3.a(0.0f, 100.0f, 0.0f).a($$4);
            for (int $$6 = 0; $$6 <= 16; ++$$6) {
                float $$7 = (float)$$6 * ((float)Math.PI * 2) / 16.0f;
                float $$8 = bgj.a((double)$$7);
                float $$9 = bgj.b((double)$$7);
                $$3.a($$8 * 120.0f, $$9 * 120.0f, -$$9 * 40.0f).a($$5);
            }
            fzl $$10 = $$3.b();
            try {
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Sunrise/Sunset fan", 32, $$10.a());
                if ($$10 != null) {
                    $$10.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$10 != null) {
                    try {
                        $$10.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    private static GpuBuffer a(ilo $$0) {
        return hpk.a("Sun quad", $$0.a(a));
    }

    private static GpuBuffer b(ilo $$0) {
        return hpk.a("End flash quad", $$0.a(b));
    }

    private static GpuBuffer a(String $$0, ilp $$1) {
        VertexFormat $$2 = fzk.i;
        try (fzi $$3 = fzi.a(4 * $$2.getVertexSize());){
            fzh $$4 = new fzh($$3, VertexFormat.b.h, $$2);
            $$4.a(-1.0f, 0.0f, -1.0f).a($$1.c(), $$1.f());
            $$4.a(1.0f, 0.0f, -1.0f).a($$1.d(), $$1.f());
            $$4.a(1.0f, 0.0f, 1.0f).a($$1.d(), $$1.g());
            $$4.a(-1.0f, 0.0f, 1.0f).a($$1.c(), $$1.g());
            fzl $$5 = $$4.b();
            try {
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> $$0, 32, $$5.a());
                if ($$5 != null) {
                    $$5.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$5 != null) {
                    try {
                        $$5.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    private static GpuBuffer c(ilo $$0) {
        dwy[] $$1 = dwy.values();
        VertexFormat $$2 = fzk.i;
        try (fzi $$3 = fzi.a($$1.length * 4 * $$2.getVertexSize());){
            fzh $$4 = new fzh($$3, VertexFormat.b.h, $$2);
            for (dwy $$5 : $$1) {
                ilp $$6 = $$0.a(amo.b("moon/" + $$5.c()));
                $$4.a(-1.0f, 0.0f, -1.0f).a($$6.d(), $$6.g());
                $$4.a(1.0f, 0.0f, -1.0f).a($$6.c(), $$6.g());
                $$4.a(1.0f, 0.0f, 1.0f).a($$6.c(), $$6.f());
                $$4.a(-1.0f, 0.0f, 1.0f).a($$6.d(), $$6.f());
            }
            fzl $$7 = $$4.b();
            try {
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Moon phases", 32, $$7.a());
                if ($$7 != null) {
                    $$7.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$7 != null) {
                    try {
                        $$7.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    private GpuBuffer d() {
        bgr $$0 = bgr.a(10842L);
        float $$1 = 100.0f;
        try (fzi $$2 = fzi.a(fzk.e.getVertexSize() * 1500 * 4);){
            fzh $$3 = new fzh($$2, VertexFormat.b.h, fzk.e);
            for (int $$4 = 0; $$4 < 1500; ++$$4) {
                float $$5 = $$0.i() * 2.0f - 1.0f;
                float $$6 = $$0.i() * 2.0f - 1.0f;
                float $$7 = $$0.i() * 2.0f - 1.0f;
                float $$8 = 0.15f + $$0.i() * 0.1f;
                float $$9 = bgj.k($$5, $$6, $$7);
                if ($$9 <= 0.010000001f || $$9 >= 1.0f) continue;
                Vector3f $$10 = new Vector3f($$5, $$6, $$7).normalize(100.0f);
                float $$11 = (float)($$0.j() * 3.1415927410125732 * 2.0);
                Matrix3f $$12 = new Matrix3f().rotateTowards((Vector3fc)new Vector3f((Vector3fc)$$10).negate(), (Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f)).rotateZ(-$$11);
                $$3.a((Vector3fc)new Vector3f($$8, -$$8, 0.0f).mul((Matrix3fc)$$12).add((Vector3fc)$$10));
                $$3.a((Vector3fc)new Vector3f($$8, $$8, 0.0f).mul((Matrix3fc)$$12).add((Vector3fc)$$10));
                $$3.a((Vector3fc)new Vector3f(-$$8, $$8, 0.0f).mul((Matrix3fc)$$12).add((Vector3fc)$$10));
                $$3.a((Vector3fc)new Vector3f(-$$8, -$$8, 0.0f).mul((Matrix3fc)$$12).add((Vector3fc)$$10));
            }
            fzl $$13 = $$3.b();
            try {
                this.z = $$13.c().c();
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Stars vertex buffer", 40, $$13.a());
                if ($$13 != null) {
                    $$13.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$13 != null) {
                    try {
                        $$13.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    private void a(fzp $$0, float $$1) {
        float $$2 = Math.signum($$1) * 512.0f;
        $$0.a(0.0f, $$1, 0.0f);
        for (int $$3 = -180; $$3 <= 180; $$3 += 45) {
            $$0.a($$2 * bgj.b((double)((float)$$3 * ((float)Math.PI / 180))), $$1, 512.0f * bgj.a((double)((float)$$3 * ((float)Math.PI / 180))));
        }
    }

    private static GpuBuffer e() {
        try (fzi $$0 = fzi.a(24 * fzk.j.getVertexSize());){
            fzh $$1 = new fzh($$0, VertexFormat.b.h, fzk.j);
            for (int $$2 = 0; $$2 < 6; ++$$2) {
                Matrix4f $$3 = new Matrix4f();
                switch ($$2) {
                    case 1: {
                        $$3.rotationX(1.5707964f);
                        break;
                    }
                    case 2: {
                        $$3.rotationX(-1.5707964f);
                        break;
                    }
                    case 3: {
                        $$3.rotationX((float)Math.PI);
                        break;
                    }
                    case 4: {
                        $$3.rotationZ(1.5707964f);
                        break;
                    }
                    case 5: {
                        $$3.rotationZ(-1.5707964f);
                    }
                }
                $$1.a((Matrix4fc)$$3, -100.0f, -100.0f, -100.0f).a(0.0f, 0.0f).a(-14145496);
                $$1.a((Matrix4fc)$$3, -100.0f, -100.0f, 100.0f).a(0.0f, 16.0f).a(-14145496);
                $$1.a((Matrix4fc)$$3, 100.0f, -100.0f, 100.0f).a(16.0f, 16.0f).a(-14145496);
                $$1.a((Matrix4fc)$$3, 100.0f, -100.0f, -100.0f).a(16.0f, 0.0f).a(-14145496);
            }
            fzl $$4 = $$1.b();
            try {
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "End sky vertex buffer", 40, $$4.a());
                if ($$4 != null) {
                    $$4.close();
                }
                return gpuBuffer;
            }
            catch (Throwable throwable) {
                if ($$4 != null) {
                    try {
                        $$4.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }

    public void a(int $$0) {
        GpuBufferSlice $$1 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)bel.l($$0), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$2 = gfj.V().l().d();
        GpuTextureView $$3 = gfj.V().l().f();
        try (RenderPass $$4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky disc", $$2, OptionalInt.empty(), $$3, OptionalDouble.empty());){
            $$4.setPipeline(hpa.al);
            RenderSystem.bindDefaultUniforms($$4);
            $$4.setUniform("DynamicTransforms", $$1);
            $$4.setVertexBuffer(0, this.q);
            $$4.draw(0, 10);
        }
    }

    public void a(hif $$0, float $$1, ger $$2, ikv $$3) {
        $$3.a = $$0.F_().n();
        if ($$3.a == esh.c.a) {
            return;
        }
        if ($$3.a == esh.c.c) {
            hnz $$4 = $$0.e();
            if ($$4 == null) {
                return;
            }
            $$3.k = $$4.a($$1);
            $$3.l = $$4.a();
            $$3.m = $$4.b();
            return;
        }
        ced $$5 = $$2.k();
        $$3.c = $$5.a(ceg.m, $$1).floatValue() * ((float)Math.PI / 180);
        $$3.d = $$5.a(ceg.n, $$1).floatValue() * ((float)Math.PI / 180);
        $$3.e = $$5.a(ceg.o, $$1).floatValue() * ((float)Math.PI / 180);
        $$3.f = 1.0f - $$0.c($$1);
        $$3.g = $$5.a(ceg.q, $$1).floatValue();
        $$3.h = $$2.k().a(ceg.j, $$1);
        $$3.i = $$5.a(ceg.p, $$1);
        $$3.j = $$5.a(ceg.i, $$1);
        $$3.b = this.a($$1, $$0);
    }

    private boolean a(float $$0, hif $$1) {
        return gfj.V().s.n((float)$$0).h - $$1.l().a($$1) < 0.0;
    }

    public void a() {
        Matrix4fStack $$0 = RenderSystem.getModelViewStack();
        $$0.pushMatrix();
        $$0.translate(0.0f, 12.0f, 0.0f);
        GpuBufferSlice $$1 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$0, (Vector4fc)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$2 = gfj.V().l().d();
        GpuTextureView $$3 = gfj.V().l().f();
        try (RenderPass $$4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky dark", $$2, OptionalInt.empty(), $$3, OptionalDouble.empty());){
            $$4.setPipeline(hpa.al);
            RenderSystem.bindDefaultUniforms($$4);
            $$4.setUniform("DynamicTransforms", $$1);
            $$4.setVertexBuffer(0, this.r);
            $$4.draw(0, 10);
        }
        $$0.popMatrix();
    }

    public void a(fzm $$0, float $$1, float $$2, float $$3, dwy $$4, float $$5, float $$6) {
        $$0.a();
        $$0.a((Quaternionfc)a.d.rotationDegrees(-90.0f));
        $$0.a();
        $$0.a((Quaternionfc)a.b.rotation($$1));
        this.a($$5, $$0);
        $$0.b();
        $$0.a();
        $$0.a((Quaternionfc)a.b.rotation($$2));
        this.a($$4, $$5, $$0);
        $$0.b();
        if ($$6 > 0.0f) {
            $$0.a();
            $$0.a((Quaternionfc)a.b.rotation($$3));
            this.b($$6, $$0);
            $$0.b();
        }
        $$0.b();
    }

    private void a(float $$0, fzm $$1) {
        Matrix4fStack $$2 = RenderSystem.getModelViewStack();
        $$2.pushMatrix();
        $$2.mul((Matrix4fc)$$1.c().a());
        $$2.translate(0.0f, 100.0f, 0.0f);
        $$2.scale(30.0f, 1.0f, 30.0f);
        GpuBufferSlice $$3 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$2, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, $$0), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$4 = gfj.V().l().d();
        GpuTextureView $$5 = gfj.V().l().f();
        GpuBuffer $$6 = this.x.b(6);
        try (RenderPass $$7 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky sun", $$4, OptionalInt.empty(), $$5, OptionalDouble.empty());){
            $$7.setPipeline(hpa.ap);
            RenderSystem.bindDefaultUniforms($$7);
            $$7.setUniform("DynamicTransforms", $$3);
            $$7.bindTexture("Sampler0", this.o.b(), this.o.c());
            $$7.setVertexBuffer(0, this.t);
            $$7.setIndexBuffer($$6, this.x.a());
            $$7.drawIndexed(0, 0, 6, 1);
        }
        $$2.popMatrix();
    }

    private void a(dwy $$0, float $$1, fzm $$2) {
        int $$3 = $$0.a() * 4;
        Matrix4fStack $$4 = RenderSystem.getModelViewStack();
        $$4.pushMatrix();
        $$4.mul((Matrix4fc)$$2.c().a());
        $$4.translate(0.0f, 100.0f, 0.0f);
        $$4.scale(20.0f, 1.0f, 20.0f);
        GpuBufferSlice $$5 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$4, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, $$1), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$6 = gfj.V().l().d();
        GpuTextureView $$7 = gfj.V().l().f();
        GpuBuffer $$8 = this.x.b(6);
        try (RenderPass $$9 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky moon", $$6, OptionalInt.empty(), $$7, OptionalDouble.empty());){
            $$9.setPipeline(hpa.ap);
            RenderSystem.bindDefaultUniforms($$9);
            $$9.setUniform("DynamicTransforms", $$5);
            $$9.bindTexture("Sampler0", this.o.b(), this.o.c());
            $$9.setVertexBuffer(0, this.u);
            $$9.setIndexBuffer($$8, this.x.a());
            $$9.drawIndexed($$3, 0, 6, 1);
        }
        $$4.popMatrix();
    }

    private void b(float $$0, fzm $$1) {
        Matrix4fStack $$2 = RenderSystem.getModelViewStack();
        $$2.pushMatrix();
        $$2.mul((Matrix4fc)$$1.c().a());
        RenderPipeline $$3 = hpa.ao;
        GpuTextureView $$4 = gfj.V().l().d();
        GpuTextureView $$5 = gfj.V().l().f();
        GpuBuffer $$6 = this.x.b(this.z);
        GpuBufferSlice $$7 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$2, (Vector4fc)new Vector4f($$0, $$0, $$0, $$0), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass $$8 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Stars", $$4, OptionalInt.empty(), $$5, OptionalDouble.empty());){
            $$8.setPipeline($$3);
            RenderSystem.bindDefaultUniforms($$8);
            $$8.setUniform("DynamicTransforms", $$7);
            $$8.setVertexBuffer(0, this.p);
            $$8.setIndexBuffer($$6, this.x.a());
            $$8.drawIndexed(0, 0, this.z, 1);
        }
        $$2.popMatrix();
    }

    public void a(fzm $$0, float $$1, int $$2) {
        float $$3 = bel.m($$2);
        if ($$3 <= 0.001f) {
            return;
        }
        $$0.a();
        $$0.a((Quaternionfc)a.b.rotationDegrees(90.0f));
        float $$4 = bgj.a((double)$$1) < 0.0f ? 180.0f : 0.0f;
        $$0.a((Quaternionfc)a.f.rotationDegrees($$4 + 90.0f));
        Matrix4fStack $$5 = RenderSystem.getModelViewStack();
        $$5.pushMatrix();
        $$5.mul((Matrix4fc)$$0.c().a());
        $$5.scale(1.0f, 1.0f, $$3);
        GpuBufferSlice $$6 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$5, (Vector4fc)bel.l($$2), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$7 = gfj.V().l().d();
        GpuTextureView $$8 = gfj.V().l().f();
        try (RenderPass $$9 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sunrise sunset", $$7, OptionalInt.empty(), $$8, OptionalDouble.empty());){
            $$9.setPipeline(hpa.an);
            RenderSystem.bindDefaultUniforms($$9);
            $$9.setUniform("DynamicTransforms", $$6);
            $$9.setVertexBuffer(0, this.v);
            $$9.draw(0, 18);
        }
        $$5.popMatrix();
        $$0.b();
    }

    public void b() {
        RenderSystem.a $$0 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        GpuBuffer $$1 = $$0.b(36);
        GpuTextureView $$2 = gfj.V().l().d();
        GpuTextureView $$3 = gfj.V().l().f();
        GpuBufferSlice $$4 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass $$5 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "End sky", $$2, OptionalInt.empty(), $$3, OptionalDouble.empty());){
            $$5.setPipeline(hpa.am);
            RenderSystem.bindDefaultUniforms($$5);
            $$5.setUniform("DynamicTransforms", $$4);
            $$5.bindTexture("Sampler0", this.y.b(), this.y.c());
            $$5.setVertexBuffer(0, this.s);
            $$5.setIndexBuffer($$1, $$0.a());
            $$5.drawIndexed(0, 0, 36, 1);
        }
    }

    public void a(fzm $$0, float $$1, float $$2, float $$3) {
        $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$3));
        $$0.a((Quaternionfc)a.b.rotationDegrees(-90.0f - $$2));
        Matrix4fStack $$4 = RenderSystem.getModelViewStack();
        $$4.pushMatrix();
        $$4.mul((Matrix4fc)$$0.c().a());
        $$4.translate(0.0f, 100.0f, 0.0f);
        $$4.scale(60.0f, 1.0f, 60.0f);
        GpuBufferSlice $$5 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$4, (Vector4fc)new Vector4f($$1, $$1, $$1, $$1), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView $$6 = gfj.V().l().d();
        GpuTextureView $$7 = gfj.V().l().f();
        GpuBuffer $$8 = this.x.b(6);
        try (RenderPass $$9 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "End flash", $$6, OptionalInt.empty(), $$7, OptionalDouble.empty());){
            $$9.setPipeline(hpa.ap);
            RenderSystem.bindDefaultUniforms($$9);
            $$9.setUniform("DynamicTransforms", $$5);
            $$9.bindTexture("Sampler0", this.o.b(), this.o.c());
            $$9.setVertexBuffer(0, this.w);
            $$9.setIndexBuffer($$8, this.x.a());
            $$9.drawIndexed(0, 0, 6, 1);
        }
        $$4.popMatrix();
    }

    @Override
    public void close() {
        this.t.close();
        this.u.close();
        this.p.close();
        this.q.close();
        this.r.close();
        this.s.close();
        this.v.close();
        this.w.close();
    }
}

