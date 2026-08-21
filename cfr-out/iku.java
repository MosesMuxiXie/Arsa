/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public class iku
implements hpo.b,
iks {
    private static final int a = 1024;
    private static final int b = 12;
    private static final int c = 2;
    private final Map<hmg.b, d> d = new HashMap<hmg.b, d>();
    private int e;

    public void a(hmg.b $$02, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, int $$13, int $$14) {
        this.d.computeIfAbsent($$02, $$0 -> new d()).a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13, $$14);
        ++this.e;
    }

    @Override
    public void b() {
        this.d.values().forEach(d::a);
        this.e = 0;
    }

    @Override
    public @Nullable b a(igl.a $$0) {
        int $$15 = this.e * 4;
        try (fzi $$22 = fzi.a($$15 * fzk.d.getVertexSize());){
            fzh $$32 = new fzh($$22, VertexFormat.b.h, fzk.d);
            HashMap<hmg.b, c> $$42 = new HashMap<hmg.b, c>();
            int $$52 = 0;
            for (Map.Entry<hmg.b, d> $$62 : this.d.entrySet()) {
                $$62.getValue().a((float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, int $$13, int $$14) -> this.a((fzp)$$32, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13, $$14));
                if ($$62.getValue().b() > 0) {
                    $$42.put($$62.getKey(), new c($$52, $$62.getValue().b() * 6));
                }
                $$52 += $$62.getValue().b() * 4;
            }
            fzl $$72 = $$32.a();
            if ($$72 != null) {
                $$0.a($$72.a());
                RenderSystem.getSequentialBuffer(VertexFormat.b.h).b($$72.c().c());
                GpuBufferSlice $$82 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
                b b2 = new b($$72.c().c(), $$82, $$42);
                return b2;
            }
            b b3 = null;
            return b3;
        }
    }

    @Override
    public void a(b $$0, igl.a $$1, RenderPass $$2, ilr $$3, boolean $$4) {
        RenderSystem.a $$5 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        $$2.setVertexBuffer(0, $$1.a());
        $$2.setIndexBuffer($$5.b($$0.a), $$5.a());
        $$2.setUniform("DynamicTransforms", $$0.b);
        for (Map.Entry<hmg.b, c> $$6 : $$0.c.entrySet()) {
            if ($$4 != $$6.getKey().a()) continue;
            $$2.setPipeline($$6.getKey().c());
            ikz $$7 = $$3.b($$6.getKey().b());
            $$2.bindTexture("Sampler0", $$7.b(), $$7.c());
            $$2.drawIndexed($$6.getValue().a, 0, $$6.getValue().b, 1);
        }
    }

    protected void a(fzp $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, int $$13, int $$14) {
        Quaternionf $$15 = new Quaternionf($$4, $$5, $$6, $$7);
        this.a($$0, $$15, $$1, $$2, $$3, 1.0f, -1.0f, $$8, $$10, $$12, $$13, $$14);
        this.a($$0, $$15, $$1, $$2, $$3, 1.0f, 1.0f, $$8, $$10, $$11, $$13, $$14);
        this.a($$0, $$15, $$1, $$2, $$3, -1.0f, 1.0f, $$8, $$9, $$11, $$13, $$14);
        this.a($$0, $$15, $$1, $$2, $$3, -1.0f, -1.0f, $$8, $$9, $$12, $$13, $$14);
    }

    private void a(fzp $$0, Quaternionf $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, int $$10, int $$11) {
        Vector3f $$12 = new Vector3f($$5, $$6, 0.0f).rotate((Quaternionfc)$$1).mul($$7).add($$2, $$3, $$4);
        $$0.a($$12.x(), $$12.y(), $$12.z()).a($$8, $$9).a($$10).c($$11);
    }

    @Override
    public void submit(hpo $$0, ikp $$1) {
        if (this.e > 0) {
            $$0.a(this);
        }
    }

    static class d {
        private int a = 1024;
        private float[] b = new float[12288];
        private int[] c = new int[2048];
        private int d;

        d() {
        }

        public void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, int $$12, int $$13) {
            if (this.d >= this.a) {
                this.c();
            }
            int $$14 = this.d * 12;
            this.b[$$14++] = $$0;
            this.b[$$14++] = $$1;
            this.b[$$14++] = $$2;
            this.b[$$14++] = $$3;
            this.b[$$14++] = $$4;
            this.b[$$14++] = $$5;
            this.b[$$14++] = $$6;
            this.b[$$14++] = $$7;
            this.b[$$14++] = $$8;
            this.b[$$14++] = $$9;
            this.b[$$14++] = $$10;
            this.b[$$14] = $$11;
            $$14 = this.d * 2;
            this.c[$$14++] = $$12;
            this.c[$$14] = $$13;
            ++this.d;
        }

        public void a(a $$0) {
            for (int $$1 = 0; $$1 < this.d; ++$$1) {
                int $$2 = $$1 * 12;
                int $$3 = $$1 * 2;
                $$0.consume(this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2++], this.b[$$2], this.c[$$3++], this.c[$$3]);
            }
        }

        public void a() {
            this.d = 0;
        }

        private void c() {
            this.a *= 2;
            this.b = Arrays.copyOf(this.b, this.a * 12);
            this.c = Arrays.copyOf(this.c, this.a * 2);
        }

        public int b() {
            return this.d;
        }
    }

    @FunctionalInterface
    public static interface a {
        public void consume(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14);
    }

    public static final class c
    extends Record {
        final int a;
        final int b;

        public c(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "vertexOffset;indexCount", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "vertexOffset;indexCount", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "vertexOffset;indexCount", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static final class b
    extends Record {
        final int a;
        final GpuBufferSlice b;
        final Map<hmg.b, c> c;

        public b(int $$0, GpuBufferSlice $$1, Map<hmg.b, c> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "indexCount;dynamicTransforms;layers", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "indexCount;dynamicTransforms;layers", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "indexCount;dynamicTransforms;layers", "a", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public GpuBufferSlice b() {
            return this.b;
        }

        public Map<hmg.b, c> c() {
            return this.c;
        }
    }
}

