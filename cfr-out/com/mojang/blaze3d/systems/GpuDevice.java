/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

@fwa
public interface GpuDevice {
    public CommandEncoder createCommandEncoder();

    public fzf createSampler(AddressMode var1, AddressMode var2, FilterMode var3, FilterMode var4, int var5, OptionalDouble var6);

    public GpuTexture createTexture(@Nullable Supplier<String> var1, @GpuTexture.a int var2, TextureFormat var3, int var4, int var5, int var6, int var7);

    public GpuTexture createTexture(@Nullable String var1, @GpuTexture.a int var2, TextureFormat var3, int var4, int var5, int var6, int var7);

    public GpuTextureView createTextureView(GpuTexture var1);

    public GpuTextureView createTextureView(GpuTexture var1, int var2, int var3);

    public GpuBuffer createBuffer(@Nullable Supplier<String> var1, @GpuBuffer.a int var2, long var3);

    public GpuBuffer createBuffer(@Nullable Supplier<String> var1, @GpuBuffer.a int var2, ByteBuffer var3);

    public String getImplementationInformation();

    public List<String> getLastDebugMessages();

    public boolean isDebuggingEnabled();

    public String getVendor();

    public String getBackendName();

    public String getVersion();

    public String getRenderer();

    public int getMaxTextureSize();

    public int getUniformOffsetAlignment();

    default public CompiledRenderPipeline precompilePipeline(RenderPipeline $$0) {
        return this.precompilePipeline($$0, null);
    }

    public CompiledRenderPipeline precompilePipeline(RenderPipeline var1, @Nullable fyy var2);

    public void clearPipelineCache();

    public List<String> getEnabledExtensions();

    public int getMaxSupportedAnisotropy();

    public void close();
}

