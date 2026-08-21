/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryStack
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.lwjgl.system.MemoryStack;

public class hox
implements AutoCloseable {
    private static final int a = new Std140SizeCalculator().putVec2().get();
    private final String b;
    private final RenderPipeline c;
    private final amo d;
    private final Map<String, GpuBuffer> e = new HashMap<String, GpuBuffer>();
    private final hol f;
    private final List<a> g;

    public hox(RenderPipeline $$0, amo $$1, Map<String, List<hpq>> $$2, List<a> $$3) {
        this.c = $$0;
        this.b = $$0.getLocation().toString();
        this.d = $$1;
        this.g = $$3;
        for (Map.Entry<String, List<hpq>> $$4 : $$2.entrySet()) {
            List<hpq> $$5 = $$4.getValue();
            if ($$5.isEmpty()) continue;
            Std140SizeCalculator $$6 = new Std140SizeCalculator();
            for (hpq $$7 : $$5) {
                $$7.a($$6);
            }
            int $$8 = $$6.get();
            MemoryStack $$9 = MemoryStack.stackPush();
            try {
                Std140Builder $$10 = Std140Builder.onStack($$9, $$8);
                for (hpq $$11 : $$5) {
                    $$11.a($$10);
                }
                this.e.put($$4.getKey(), RenderSystem.getDevice().createBuffer(() -> this.b + " / " + (String)$$4.getKey(), 128, $$10.get()));
            }
            finally {
                if ($$9 == null) continue;
                $$9.close();
            }
        }
        this.f = new hol(() -> this.b + " SamplerInfo", 130, ($$3.size() + 1) * a);
    }

    public void a(fwv $$0, Map<amo, fyw<fxt>> $$12, GpuBufferSlice $$22) {
        fww $$3 = $$0.a(this.b);
        for (a $$4 : this.g) {
            $$4.a($$3, $$12);
        }
        fyw $$5 = $$12.computeIfPresent(this.d, ($$1, $$2) -> $$3.b($$2));
        if ($$5 == null) {
            throw new IllegalStateException("Missing handle for target " + String.valueOf(this.d));
        }
        $$3.a(() -> {
            fxt $$3 = (fxt)$$5.get();
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$22, fwd.b);
            CommandEncoder $$4 = RenderSystem.getDevice().createCommandEncoder();
            fzb $$5 = RenderSystem.getSamplerCache();
            List<b> $$6 = this.g.stream().map($$2 -> new b($$2.a(), $$2.b($$12), $$5.a($$2.b() ? FilterMode.LINEAR : FilterMode.NEAREST))).toList();
            try (GpuBuffer.MappedView $$7 = $$4.mapBuffer(this.f.b(), false, true);){
                Iterator<b> $$8 = Std140Builder.intoBuffer($$7.data());
                ((Std140Builder)((Object)$$8)).putVec2($$3.c, $$3.d);
                for (b $$9 : $$6) {
                    ((Std140Builder)((Object)$$8)).putVec2($$9.b.getWidth(0), $$9.b.getHeight(0));
                }
            }
            try (RenderPass $$10 = $$4.createRenderPass(() -> "Post pass " + this.b, $$3.d(), OptionalInt.empty(), $$3.f ? $$3.f() : null, OptionalDouble.empty());){
                $$10.setPipeline(this.c);
                RenderSystem.bindDefaultUniforms($$10);
                $$10.setUniform("SamplerInfo", this.f.b());
                for (Map.Entry entry : this.e.entrySet()) {
                    $$10.setUniform((String)entry.getKey(), (GpuBuffer)entry.getValue());
                }
                for (b b2 : $$6) {
                    $$10.bindTexture(b2.a() + "Sampler", b2.b(), b2.c());
                }
                $$10.draw(0, 3);
            }
            this.f.c();
            RenderSystem.restoreProjectionMatrix();
            for (a $$13 : this.g) {
                $$13.a($$12);
            }
        });
    }

    @Override
    public void close() {
        for (GpuBuffer $$0 : this.e.values()) {
            $$0.close();
        }
        this.f.close();
    }

    public static interface a {
        public void a(fww var1, Map<amo, fyw<fxt>> var2);

        default public void a(Map<amo, fyw<fxt>> $$0) {
        }

        public GpuTextureView b(Map<amo, fyw<fxt>> var1);

        public String a();

        public boolean b();
    }

    static final class b
    extends Record {
        private final String a;
        final GpuTextureView b;
        private final fzf c;

        b(String $$0, GpuTextureView $$1, fzf $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "samplerName;view;sampler", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "samplerName;view;sampler", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "samplerName;view;sampler", "a", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public GpuTextureView b() {
            return this.b;
        }

        public fzf c() {
            return this.c;
        }
    }

    public record c(String a, amo b, boolean c, boolean d) implements a
    {
        private final amo b;
        private final boolean c;
        private final boolean d;

        private fyw<fxt> c(Map<amo, fyw<fxt>> $$0) {
            fyw<fxt> $$1 = $$0.get(this.b);
            if ($$1 == null) {
                throw new IllegalStateException("Missing handle for target " + String.valueOf(this.b));
            }
            return $$1;
        }

        @Override
        public void a(fww $$0, Map<amo, fyw<fxt>> $$1) {
            $$0.a(this.c($$1));
        }

        @Override
        public GpuTextureView b(Map<amo, fyw<fxt>> $$0) {
            GpuTextureView $$3;
            fyw<fxt> $$1 = this.c($$0);
            fxt $$2 = $$1.get();
            GpuTextureView gpuTextureView = $$3 = this.c ? $$2.f() : $$2.d();
            if ($$3 == null) {
                throw new IllegalStateException("Missing " + (this.c ? "depth" : "color") + "texture for target " + String.valueOf(this.b));
            }
            return $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "samplerName;targetId;depthBuffer;bilinear", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "samplerName;targetId;depthBuffer;bilinear", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "samplerName;targetId;depthBuffer;bilinear", "a", "b", "c", "d"}, this, $$0);
        }

        public amo c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }

        @Override
        public boolean b() {
            return this.d;
        }
    }

    public record d(String a, ikz b, int c, int d, boolean e) implements a
    {
        private final ikz b;
        private final int c;
        private final int d;
        private final boolean e;

        @Override
        public void a(fww $$0, Map<amo, fyw<fxt>> $$1) {
        }

        @Override
        public GpuTextureView b(Map<amo, fyw<fxt>> $$0) {
            return this.b.b();
        }

        @Override
        public boolean b() {
            return this.e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "samplerName;texture;width;height;bilinear", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "samplerName;texture;width;height;bilinear", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "samplerName;texture;width;height;bilinear", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public ikz c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public int e() {
            return this.d;
        }
    }
}

