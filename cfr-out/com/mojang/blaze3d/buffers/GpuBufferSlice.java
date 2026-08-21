/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.buffers;

import com.mojang.blaze3d.buffers.GpuBuffer;

@fwa
public record GpuBufferSlice(GpuBuffer buffer, long offset, long length) {
    public GpuBufferSlice slice(long $$0, long $$1) {
        if ($$0 < 0L || $$1 < 0L || $$0 + $$1 > this.length) {
            throw new IllegalArgumentException("Offset of " + $$0 + " and length " + $$1 + " would put new slice outside existing slice's range (of " + this.offset + "," + this.length + ")");
        }
        return new GpuBufferSlice(this.buffer, this.offset + $$0, $$1);
    }
}

