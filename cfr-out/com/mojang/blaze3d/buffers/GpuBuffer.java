/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.buffers;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@fwa
public abstract class GpuBuffer
implements AutoCloseable {
    public static final int USAGE_MAP_READ = 1;
    public static final int USAGE_MAP_WRITE = 2;
    public static final int USAGE_HINT_CLIENT_STORAGE = 4;
    public static final int USAGE_COPY_DST = 8;
    public static final int USAGE_COPY_SRC = 16;
    public static final int USAGE_VERTEX = 32;
    public static final int USAGE_INDEX = 64;
    public static final int USAGE_UNIFORM = 128;
    public static final int USAGE_UNIFORM_TEXEL_BUFFER = 256;
    @a
    private final int usage;
    private final long size;

    public GpuBuffer(@a int $$0, long $$1) {
        this.size = $$1;
        this.usage = $$0;
    }

    public long size() {
        return this.size;
    }

    @a
    public int usage() {
        return this.usage;
    }

    public abstract boolean isClosed();

    @Override
    public abstract void close();

    public GpuBufferSlice slice(long $$0, long $$1) {
        if ($$0 < 0L || $$1 < 0L || $$0 + $$1 > this.size) {
            throw new IllegalArgumentException("Offset of " + $$0 + " and length " + $$1 + " would put new slice outside buffer's range (of 0," + $$1 + ")");
        }
        return new GpuBufferSlice(this, $$0, $$1);
    }

    public GpuBufferSlice slice() {
        return new GpuBufferSlice(this, 0L, this.size);
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }

    @fwa
    public static interface MappedView
    extends AutoCloseable {
        public ByteBuffer data();

        @Override
        public void close();
    }
}

