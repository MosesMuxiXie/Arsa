/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

@fwa
public interface RenderPass
extends AutoCloseable {
    public void pushDebugGroup(Supplier<String> var1);

    public void popDebugGroup();

    public void setPipeline(RenderPipeline var1);

    public void bindTexture(String var1, @Nullable GpuTextureView var2, @Nullable fzf var3);

    public void setUniform(String var1, GpuBuffer var2);

    public void setUniform(String var1, GpuBufferSlice var2);

    public void enableScissor(int var1, int var2, int var3, int var4);

    public void disableScissor();

    public void setVertexBuffer(int var1, GpuBuffer var2);

    public void setIndexBuffer(GpuBuffer var1, VertexFormat.a var2);

    public void drawIndexed(int var1, int var2, int var3, int var4);

    public <T> void drawMultipleIndexed(Collection<a<T>> var1, @Nullable GpuBuffer var2,  @Nullable VertexFormat.a var3, Collection<String> var4, T var5);

    public void draw(int var1, int var2);

    @Override
    public void close();

    public static interface b {
        public void upload(String var1, GpuBufferSlice var2);
    }

    public record a<T>(int a, GpuBuffer b, @Nullable GpuBuffer c,  @Nullable VertexFormat.a d, int e, int f, @Nullable BiConsumer<T, b> g) {
        public a(int $$0, GpuBuffer $$1, GpuBuffer $$2, VertexFormat.a $$3, int $$4, int $$5) {
            this($$0, $$1, $$2, $$3, $$4, $$5, null);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }
    }
}

