/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.textures;

import com.mojang.blaze3d.textures.GpuTexture;

@fwa
public abstract class GpuTextureView
implements AutoCloseable {
    private final GpuTexture texture;
    private final int baseMipLevel;
    private final int mipLevels;

    public GpuTextureView(GpuTexture $$0, int $$1, int $$2) {
        this.texture = $$0;
        this.baseMipLevel = $$1;
        this.mipLevels = $$2;
    }

    @Override
    public abstract void close();

    public GpuTexture texture() {
        return this.texture;
    }

    public int baseMipLevel() {
        return this.baseMipLevel;
    }

    public int mipLevels() {
        return this.mipLevels;
    }

    public int getWidth(int $$0) {
        return this.texture.getWidth($$0 + this.baseMipLevel);
    }

    public int getHeight(int $$0) {
        return this.texture.getHeight($$0 + this.baseMipLevel);
    }

    public abstract boolean isClosed();
}

