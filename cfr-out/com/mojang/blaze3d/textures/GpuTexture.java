/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.textures;

import com.mojang.blaze3d.textures.TextureFormat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@fwa
public abstract class GpuTexture
implements AutoCloseable {
    public static final int USAGE_COPY_DST = 1;
    public static final int USAGE_COPY_SRC = 2;
    public static final int USAGE_TEXTURE_BINDING = 4;
    public static final int USAGE_RENDER_ATTACHMENT = 8;
    public static final int USAGE_CUBEMAP_COMPATIBLE = 16;
    private final TextureFormat format;
    private final int width;
    private final int height;
    private final int depthOrLayers;
    private final int mipLevels;
    @a
    private final int usage;
    private final String label;

    public GpuTexture(@a int $$0, String $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6) {
        this.usage = $$0;
        this.label = $$1;
        this.format = $$2;
        this.width = $$3;
        this.height = $$4;
        this.depthOrLayers = $$5;
        this.mipLevels = $$6;
    }

    public int getWidth(int $$0) {
        return this.width >> $$0;
    }

    public int getHeight(int $$0) {
        return this.height >> $$0;
    }

    public int getDepthOrLayers() {
        return this.depthOrLayers;
    }

    public int getMipLevels() {
        return this.mipLevels;
    }

    public TextureFormat getFormat() {
        return this.format;
    }

    @a
    public int usage() {
        return this.usage;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public abstract void close();

    public abstract boolean isClosed();

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }
}

