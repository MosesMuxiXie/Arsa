/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import org.jspecify.annotations.Nullable;

public class igl
implements AutoCloseable {
    private final Queue<a> a = new ArrayDeque<a>();
    private final List<a> b = new ArrayList<a>();

    public void a(hpn $$0) {
        if ($$0.k().isEmpty()) {
            return;
        }
        GpuDevice $$1 = RenderSystem.getDevice();
        gfj $$2 = gfj.V();
        ilr $$3 = $$2.af();
        fxt $$4 = $$2.l();
        fxt $$5 = $$2.e.t();
        for (hpo.b $$6 : $$0.k()) {
            a $$7 = this.a.poll();
            if ($$7 == null) {
                $$7 = new a();
            }
            this.b.add($$7);
            iku.b $$8 = $$6.a($$7);
            if ($$8 == null) continue;
            try (RenderPass $$9 = $$1.createCommandEncoder().createRenderPass(() -> "Particles - Main", $$4.d(), OptionalInt.empty(), $$4.f(), OptionalDouble.empty());){
                this.a($$9);
                $$6.a($$8, $$7, $$9, $$3, false);
                if ($$5 == null) {
                    $$6.a($$8, $$7, $$9, $$3, true);
                }
            }
            if ($$5 == null) continue;
            RenderPass $$10 = $$1.createCommandEncoder().createRenderPass(() -> "Particles - Transparent", $$5.d(), OptionalInt.empty(), $$5.f(), OptionalDouble.empty());
            try {
                this.a($$10);
                $$6.a($$8, $$7, $$10, $$3, true);
            }
            finally {
                if ($$10 == null) continue;
                $$10.close();
            }
        }
    }

    public void a() {
        for (a $$0 : this.b) {
            $$0.b();
        }
        this.a.addAll(this.b);
        this.b.clear();
    }

    private void a(RenderPass $$0) {
        $$0.setUniform("Projection", RenderSystem.getProjectionMatrixBuffer());
        $$0.setUniform("Fog", RenderSystem.getShaderFog());
        $$0.bindTexture("Sampler2", gfj.V().i.q().a(), RenderSystem.getSamplerCache().a(FilterMode.LINEAR));
    }

    @Override
    public void close() {
        this.a.forEach(a::close);
    }

    public static class a
    implements AutoCloseable {
        private @Nullable hol a;

        public void a(ByteBuffer $$0) {
            if (this.a == null || this.a.a() < $$0.remaining()) {
                if (this.a != null) {
                    this.a.close();
                }
                this.a = new hol(() -> "Particle Vertices", 34, $$0.remaining());
            }
            try (GpuBuffer.MappedView $$1 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.a.b().slice(), false, true);){
                $$1.data().put($$0);
            }
        }

        public GpuBuffer a() {
            if (this.a == null) {
                throw new IllegalStateException("Can't get buffer before it's made");
            }
            return this.a.b();
        }

        void b() {
            if (this.a != null) {
                this.a.c();
            }
        }

        @Override
        public void close() {
            if (this.a != null) {
                this.a.close();
            }
        }
    }
}

