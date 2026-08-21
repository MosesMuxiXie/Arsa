/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class gpp
implements AutoCloseable {
    private static final Logger f = LogUtils.getLogger();
    private static final float g = 10000.0f;
    public static final float a = 0.0f;
    private static final float h = 1000.0f;
    public static final int b = 1000;
    public static final int c = -1000;
    public static final int d = 16;
    private static final int i = 512;
    private static final int j = RenderSystem.getDevice().getMaxTextureSize();
    public static final int e = 0;
    private static final Comparator<gpm> k = Comparator.nullsFirst(Comparator.comparing(gpm::b).thenComparing(gpm::c).thenComparing(gpm::d).thenComparing(gpm::e));
    private static final Comparator<gpq> l = Comparator.nullsFirst(Comparator.comparing(gpq::b));
    private static final Comparator<gqe> m = Comparator.comparing(gqe::m, k).thenComparing(gqe::a, Comparator.comparing(RenderPipeline::getSortKey)).thenComparing(gqe::b, l);
    private final Map<Object, a> n = new Object2ObjectOpenHashMap();
    private final Map<Object, gpy> o = new Object2ObjectOpenHashMap();
    final gqg p;
    private final List<b> q = new ArrayList<b>();
    private final List<c> r = new ArrayList<c>();
    private final fzi s = new fzi(786432);
    private final Map<VertexFormat, hol> t = new Object2ObjectOpenHashMap();
    private int u = Integer.MAX_VALUE;
    private final hnt v = new hnt("gui", 1000.0f, 11000.0f, true);
    private final hnt w = new hnt("items", -1000.0f, 1000.0f, true);
    private final hon.a x;
    private final hpo y;
    private final ige z;
    private final Map<Class<? extends gqs>, gpz<?>> A;
    private @Nullable GpuTexture B;
    private @Nullable GpuTextureView C;
    private @Nullable GpuTexture D;
    private @Nullable GpuTextureView E;
    private int F;
    private int G;
    private int H;
    private int I;
    private @Nullable gpm J = null;
    private @Nullable RenderPipeline K = null;
    private @Nullable gpq L = null;
    private @Nullable fzh M = null;

    public gpp(gqg $$0, hon.a $$1, hpo $$2, ige $$3, List<gpz<?>> $$4) {
        this.p = $$0;
        this.x = $$1;
        this.y = $$2;
        this.z = $$3;
        ImmutableMap.Builder $$5 = ImmutableMap.builder();
        for (gpz<?> $$6 : $$4) {
            $$5.put($$6.a(), $$6);
        }
        this.A = $$5.buildOrThrow();
    }

    public void a() {
        ++this.I;
    }

    public void a(GpuBufferSlice $$0) {
        this.c();
        this.b($$0);
        for (hol $$1 : this.t.values()) {
            $$1.c();
        }
        this.q.clear();
        this.r.clear();
        this.p.e();
        this.u = Integer.MAX_VALUE;
        this.b();
        if (w.x) {
            RenderPipeline.updateSortKeySeed();
            gpq.c();
        }
    }

    private void b() {
        Iterator<Map.Entry<Object, gpy>> $$0 = this.o.entrySet().iterator();
        while ($$0.hasNext()) {
            Map.Entry<Object, gpy> $$1 = $$0.next();
            gpy $$2 = $$1.getValue();
            if (!$$2.c()) {
                $$2.close();
                $$0.remove();
                continue;
            }
            $$2.d();
        }
    }

    private void c() {
        this.x.b();
        this.f();
        this.e();
        this.d();
        this.p.a(m);
        this.a(gqg.b.b);
        this.u = this.r.size();
        this.a(gqg.b.c);
        this.i();
    }

    private void a(gqg.b $$0) {
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.p.a(this::a, $$0);
        if (this.M != null) {
            this.a(this.M, this.K, this.L, this.J);
        }
    }

    private void b(GpuBufferSlice $$0) {
        if (this.q.isEmpty()) {
            return;
        }
        gfj $$1 = gfj.V();
        fyk $$2 = $$1.aR();
        RenderSystem.setProjectionMatrix(this.v.a((float)$$2.k() / (float)$$2.s(), (float)$$2.l() / (float)$$2.s()), fwd.b);
        fxt $$3 = $$1.l();
        int $$4 = 0;
        for (b $$5 : this.q) {
            if ($$5.d <= $$4) continue;
            $$4 = $$5.d;
        }
        RenderSystem.a $$6 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        GpuBuffer $$7 = $$6.b($$4);
        VertexFormat.a $$8 = $$6.a();
        GpuBufferSlice $$9 = RenderSystem.getDynamicUniforms().a((Matrix4fc)new Matrix4f().setTranslation(0.0f, 0.0f, -11000.0f), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        if (this.u > 0) {
            this.a(() -> "GUI before blur", $$3, $$0, $$9, $$7, $$8, 0, Math.min(this.u, this.q.size()));
        }
        if (this.q.size() <= this.u) {
            return;
        }
        RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$3.e(), 1.0);
        $$1.i.i();
        this.a(() -> "GUI after blur", $$3, $$0, $$9, $$7, $$8, this.u, this.q.size());
    }

    private void a(Supplier<String> $$0, fxt $$1, GpuBufferSlice $$2, GpuBufferSlice $$3, GpuBuffer $$4, VertexFormat.a $$5, int $$6, int $$7) {
        try (RenderPass $$8 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$0, $$1.d(), OptionalInt.empty(), $$1.f ? $$1.f() : null, OptionalDouble.empty());){
            RenderSystem.bindDefaultUniforms($$8);
            $$8.setUniform("Fog", $$2);
            $$8.setUniform("DynamicTransforms", $$3);
            for (int $$9 = $$6; $$9 < $$7; ++$$9) {
                b $$10 = this.q.get($$9);
                this.a($$10, $$8, $$4, $$5);
            }
        }
    }

    private void a(gqe $$0) {
        RenderPipeline $$1 = $$0.a();
        gpq $$2 = $$0.b();
        gpm $$3 = $$0.m();
        if ($$1 != this.K || this.a($$3, this.J) || !$$2.equals(this.L)) {
            if (this.M != null) {
                this.a(this.M, this.K, this.L, this.J);
            }
            this.M = this.a($$1);
            this.K = $$1;
            this.L = $$2;
            this.J = $$3;
        }
        $$0.a(this.M);
    }

    private void d() {
        this.p.b((gqh $$0) -> {
            final Matrix3x2fc $$1 = $$0.c;
            final gpm $$2 = $$0.j;
            $$0.a().a(new gio.b(){

                @Override
                public void a(gnz.a $$0) {
                    this.b($$0);
                }

                @Override
                public void a(gnz $$0) {
                    this.b($$0);
                }

                private void b(gnz $$0) {
                    gpp.this.p.b(new gqd($$1, $$0, $$2));
                }
            });
        });
    }

    private void e() {
        if (this.p.d().isEmpty()) {
            return;
        }
        int $$0 = this.g();
        int $$12 = 16 * $$0;
        int $$2 = this.b($$12);
        if (this.B == null) {
            this.a($$2);
        }
        RenderSystem.outputColorTextureOverride = this.C;
        RenderSystem.outputDepthTextureOverride = this.E;
        RenderSystem.setProjectionMatrix(this.w.a($$2, $$2), fwd.b);
        gfj.V().i.t().a(fyd.a.c);
        fzm $$3 = new fzm();
        MutableBoolean $$4 = new MutableBoolean(false);
        MutableBoolean $$52 = new MutableBoolean(false);
        this.p.a((gqf $$5) -> {
            int $$10;
            boolean $$8;
            if ($$5.g() != null) {
                $$52.setTrue();
                return;
            }
            ihs $$6 = $$5.c();
            a $$7 = this.n.get($$6.i());
            if (!($$7 == null || $$6.d() && $$7.e != this.I)) {
                this.a((gqf)$$5, $$7.c, $$7.d, $$12, $$2);
                return;
            }
            if (this.F + $$12 > $$2) {
                this.F = 0;
                this.G += $$12;
            }
            boolean bl2 = $$8 = $$6.d() && $$7 != null;
            if (!$$8 && this.G + $$12 > $$2) {
                if ($$4.isFalse()) {
                    f.warn("Trying to render too many items in GUI at the same time. Skipping some of them.");
                    $$4.setTrue();
                }
                return;
            }
            int $$9 = $$8 ? $$7.a : this.F;
            int n2 = $$10 = $$8 ? $$7.b : this.G;
            if ($$8) {
                RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(this.B, 0, this.D, 1.0, $$9, $$2 - $$10 - $$12, $$12, $$12);
            }
            this.a($$6, $$3, $$9, $$10, $$12);
            float $$11 = (float)$$9 / (float)$$2;
            float $$12 = (float)($$2 - $$10) / (float)$$2;
            this.a((gqf)$$5, $$11, $$12, $$12, $$2);
            if ($$8) {
                $$7.e = this.I;
            } else {
                this.n.put($$5.c().i(), new a(this.F, this.G, $$11, $$12, this.I));
                this.F += $$12;
            }
        });
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
        if ($$52.booleanValue()) {
            this.p.a((gqf $$1) -> {
                if ($$1.g() != null) {
                    ihs $$2 = $$1.c();
                    gpy $$3 = this.o.computeIfAbsent($$2.i(), $$0 -> new gpy(this.x));
                    gpm $$4 = $$1.g();
                    gqr $$5 = new gqr((gqf)$$1, $$4.d(), $$4.b(), $$4.e(), $$4.c());
                    $$3.a($$5, this.p, $$0);
                }
            });
        }
    }

    private void f() {
        int $$0 = gfj.V().aR().s();
        this.p.c($$1 -> this.a($$1, $$0));
    }

    private <T extends gqs> void a(T $$0, int $$1) {
        gpz<?> $$2 = this.A.get($$0.getClass());
        if ($$2 != null) {
            $$2.a($$0, this.p, $$1);
        }
    }

    private void a(ihs $$0, fzm $$1, int $$2, int $$3, int $$4) {
        boolean $$5;
        $$1.a();
        $$1.a((float)$$2 + (float)$$4 / 2.0f, (float)$$3 + (float)$$4 / 2.0f, 0.0f);
        $$1.b($$4, -$$4, $$4);
        boolean bl2 = $$5 = !$$0.f();
        if ($$5) {
            gfj.V().i.t().a(fyd.a.b);
        } else {
            gfj.V().i.t().a(fyd.a.c);
        }
        RenderSystem.enableScissorForRenderTypeDraws($$2, this.B.getHeight(0) - $$3 - $$4, $$4, $$4);
        $$0.a($$1, this.y, 0xF000F0, ilg.d, 0);
        this.z.a();
        this.x.b();
        RenderSystem.disableScissorForRenderTypeDraws();
        $$1.b();
    }

    private void a(gqf $$0, float $$1, float $$2, int $$3, int $$4) {
        float $$5 = $$1 + (float)$$3 / (float)$$4;
        float $$6 = $$2 + (float)(-$$3) / (float)$$4;
        this.p.a(new gqb(hpa.au, gpq.a(this.C, RenderSystem.getSamplerCache().b(FilterMode.NEAREST)), $$0.b(), $$0.d(), $$0.e(), $$0.d() + 16, $$0.e() + 16, $$1, $$5, $$2, $$6, -1, $$0.f(), null));
    }

    private void a(int $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        this.B = $$1.createTexture("UI items atlas", 12, TextureFormat.RGBA8, $$0, $$0, 1, 1);
        this.C = $$1.createTextureView(this.B);
        this.D = $$1.createTexture("UI items atlas depth", 8, TextureFormat.DEPTH32, $$0, $$0, 1, 1);
        this.E = $$1.createTextureView(this.D);
        $$1.createCommandEncoder().clearColorAndDepthTextures(this.B, 0, this.D, 1.0);
    }

    private int b(int $$0) {
        int $$3;
        Set<Object> $$1 = this.p.d();
        if (this.n.isEmpty()) {
            int $$2 = $$1.size();
        } else {
            $$3 = this.n.size();
            for (Object $$4 : $$1) {
                if (this.n.containsKey($$4)) continue;
                ++$$3;
            }
        }
        if (this.B != null) {
            int $$5 = this.B.getWidth(0) / $$0;
            int $$6 = $$5 * $$5;
            if ($$3 < $$6) {
                return this.B.getWidth(0);
            }
            this.h();
        }
        int $$7 = $$1.size();
        int $$8 = bgj.d($$7 + $$7 / 2);
        return Math.clamp((long)bgj.c($$8 * $$0), 512, j);
    }

    private int g() {
        int $$0 = gfj.V().aR().s();
        if ($$0 != this.H) {
            this.h();
            for (gpy $$1 : this.o.values()) {
                $$1.e();
            }
            this.H = $$0;
        }
        return $$0;
    }

    private void h() {
        this.F = 0;
        this.G = 0;
        this.n.clear();
        if (this.B != null) {
            this.B.close();
            this.B = null;
        }
        if (this.C != null) {
            this.C.close();
            this.C = null;
        }
        if (this.D != null) {
            this.D.close();
            this.D = null;
        }
        if (this.E != null) {
            this.E.close();
            this.E = null;
        }
    }

    private void a(fzh $$0, RenderPipeline $$1, gpq $$2, @Nullable gpm $$3) {
        fzl $$4 = $$0.a();
        if ($$4 != null) {
            this.r.add(new c($$4, $$1, $$2, $$3));
        }
    }

    private void i() {
        this.j();
        CommandEncoder $$0 = RenderSystem.getDevice().createCommandEncoder();
        Object2IntOpenHashMap $$1 = new Object2IntOpenHashMap();
        for (c $$2 : this.r) {
            fzl $$3 = $$2.a;
            fzl.a $$4 = $$3.c();
            VertexFormat $$5 = $$4.a();
            hol $$6 = this.t.get($$5);
            if (!$$1.containsKey((Object)$$5)) {
                $$1.put((Object)$$5, 0);
            }
            ByteBuffer $$7 = $$3.a();
            int $$8 = $$7.remaining();
            int $$9 = $$1.getInt((Object)$$5);
            try (GpuBuffer.MappedView $$10 = $$0.mapBuffer($$6.b().slice($$9, $$8), false, true);){
                MemoryUtil.memCopy((ByteBuffer)$$7, (ByteBuffer)$$10.data());
            }
            $$1.put((Object)$$5, $$9 + $$8);
            this.q.add(new b($$6.b(), $$9 / $$5.getVertexSize(), $$4.d(), $$4.c(), $$2.b, $$2.c, $$2.d));
            $$2.close();
        }
    }

    private void j() {
        Object2IntMap<VertexFormat> $$0 = this.k();
        for (Object2IntMap.Entry $$1 : $$0.object2IntEntrySet()) {
            VertexFormat $$2 = (VertexFormat)$$1.getKey();
            int $$3 = $$1.getIntValue();
            hol $$4 = this.t.get($$2);
            if ($$4 != null && $$4.a() >= $$3) continue;
            if ($$4 != null) {
                $$4.close();
            }
            this.t.put($$2, new hol(() -> "GUI vertex buffer for " + String.valueOf($$2), 34, $$3));
        }
    }

    private Object2IntMap<VertexFormat> k() {
        Object2IntOpenHashMap $$0 = new Object2IntOpenHashMap();
        for (c $$1 : this.r) {
            fzl.a $$2 = $$1.a.c();
            VertexFormat $$3 = $$2.a();
            if (!$$0.containsKey((Object)$$3)) {
                $$0.put((Object)$$3, 0);
            }
            $$0.put((Object)$$3, $$0.getInt((Object)$$3) + $$2.b() * $$3.getVertexSize());
        }
        return $$0;
    }

    private void a(b $$0, RenderPass $$1, GpuBuffer $$2, VertexFormat.a $$3) {
        RenderPipeline $$4 = $$0.e();
        $$1.setPipeline($$4);
        $$1.setVertexBuffer(0, $$0.a);
        gpm $$5 = $$0.g();
        if ($$5 != null) {
            this.a($$5, $$1);
        } else {
            $$1.disableScissor();
        }
        if ($$0.f.d() != null) {
            $$1.bindTexture("Sampler0", $$0.f.d(), $$0.f.g());
        }
        if ($$0.f.e() != null) {
            $$1.bindTexture("Sampler1", $$0.f.e(), $$0.f.h());
        }
        if ($$0.f.f() != null) {
            $$1.bindTexture("Sampler2", $$0.f.f(), $$0.f.i());
        }
        $$1.setIndexBuffer($$2, $$3);
        $$1.drawIndexed($$0.b, 0, $$0.d, 1);
    }

    private fzh a(RenderPipeline $$0) {
        return new fzh(this.s, $$0.getVertexFormatMode(), $$0.getVertexFormat());
    }

    private boolean a(@Nullable gpm $$0, @Nullable gpm $$1) {
        if ($$0 == $$1) {
            return false;
        }
        if ($$0 != null) {
            return !$$0.equals($$1);
        }
        return true;
    }

    private void a(gpm $$0, RenderPass $$1) {
        fyk $$2 = gfj.V().aR();
        int $$3 = $$2.l();
        int $$4 = $$2.s();
        double $$5 = $$0.d() * $$4;
        double $$6 = $$3 - $$0.c() * $$4;
        double $$7 = $$0.g() * $$4;
        double $$8 = $$0.h() * $$4;
        $$1.enableScissor((int)$$5, (int)$$6, Math.max(0, (int)$$7), Math.max(0, (int)$$8));
    }

    @Override
    public void close() {
        this.s.close();
        if (this.B != null) {
            this.B.close();
        }
        if (this.C != null) {
            this.C.close();
        }
        if (this.D != null) {
            this.D.close();
        }
        if (this.E != null) {
            this.E.close();
        }
        this.A.values().forEach(gpz::close);
        this.v.close();
        this.w.close();
        for (hol $$0 : this.t.values()) {
            $$0.close();
        }
        this.o.values().forEach(gpz::close);
    }

    static final class b
    extends Record {
        final GpuBuffer a;
        final int b;
        private final VertexFormat.b c;
        final int d;
        private final RenderPipeline e;
        final gpq f;
        private final @Nullable gpm g;

        b(GpuBuffer $$0, int $$1, VertexFormat.b $$2, int $$3, RenderPipeline $$4, gpq $$5, @Nullable gpm $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "vertexBuffer;baseVertex;mode;indexCount;pipeline;textureSetup;scissorArea", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public GpuBuffer a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public VertexFormat.b c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public RenderPipeline e() {
            return this.e;
        }

        public gpq f() {
            return this.f;
        }

        public @Nullable gpm g() {
            return this.g;
        }
    }

    static final class c
    extends Record
    implements AutoCloseable {
        final fzl a;
        final RenderPipeline b;
        final gpq c;
        final @Nullable gpm d;

        c(fzl $$0, RenderPipeline $$1, gpq $$2, @Nullable gpm $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "mesh;pipeline;textureSetup;scissorArea", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "mesh;pipeline;textureSetup;scissorArea", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "mesh;pipeline;textureSetup;scissorArea", "a", "b", "c", "d"}, this, $$0);
        }

        public fzl a() {
            return this.a;
        }

        public RenderPipeline b() {
            return this.b;
        }

        public gpq c() {
            return this.c;
        }

        public @Nullable gpm d() {
            return this.d;
        }
    }

    static final class a {
        final int a;
        final int b;
        final float c;
        final float d;
        int e;

        a(int $$0, int $$1, float $$2, float $$3, int $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }
    }
}

