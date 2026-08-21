/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.SequencedCollection;

public record htj(GpuTextureView a, EnumMap<hth, List<RenderPass.a<GpuBufferSlice[]>>> b, int c, GpuBufferSlice[] d) {
    public void a(hti $$0, fzf $$1) {
        RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        GpuBuffer $$3 = this.c == 0 ? null : $$2.b(this.c);
        VertexFormat.a $$4 = this.c == 0 ? null : $$2.a();
        hth[] $$5 = $$0.b();
        gfj $$6 = gfj.V();
        boolean $$7 = w.v && $$6.y;
        fxt $$8 = $$0.c();
        try (RenderPass $$9 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Section layers for " + $$0.a(), $$8.d(), OptionalInt.empty(), $$8.f(), OptionalDouble.empty());){
            RenderSystem.bindDefaultUniforms($$9);
            $$9.bindTexture("Sampler2", $$6.i.q().a(), RenderSystem.getSamplerCache().a(FilterMode.LINEAR));
            for (hth $$10 : $$5) {
                SequencedCollection<RenderPass.a<Object>> $$11 = this.b.get((Object)$$10);
                if ($$11.isEmpty()) continue;
                if ($$10 == hth.c) {
                    $$11 = $$11.reversed();
                }
                $$9.setPipeline($$7 ? hpa.d : $$10.a());
                $$9.bindTexture("Sampler0", this.a, $$1);
                $$9.drawMultipleIndexed($$11, $$3, $$4, List.of("ChunkSection"), this.d);
            }
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{htj.class, "textureView;drawsPerLayer;maxIndicesRequired;chunkSectionInfos", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{htj.class, "textureView;drawsPerLayer;maxIndicesRequired;chunkSectionInfos", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{htj.class, "textureView;drawsPerLayer;maxIndicesRequired;chunkSectionInfos", "a", "b", "c", "d"}, this, $$0);
    }
}

