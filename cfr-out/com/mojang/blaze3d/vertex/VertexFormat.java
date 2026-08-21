/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.vertex;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

@fwa
public class VertexFormat {
    public static final int UNKNOWN_ELEMENT = -1;
    private final List<VertexFormatElement> elements;
    private final List<String> names;
    private final int vertexSize;
    private final int elementsMask;
    private final int[] offsetsByElement = new int[32];
    private @Nullable GpuBuffer immediateDrawVertexBuffer;
    private @Nullable GpuBuffer immediateDrawIndexBuffer;

    VertexFormat(List<VertexFormatElement> $$02, List<String> $$12, IntList $$2, int $$3) {
        this.elements = $$02;
        this.names = $$12;
        this.vertexSize = $$3;
        this.elementsMask = $$02.stream().mapToInt(VertexFormatElement::mask).reduce(0, ($$0, $$1) -> $$0 | $$1);
        for (int $$4 = 0; $$4 < this.offsetsByElement.length; ++$$4) {
            VertexFormatElement $$5 = VertexFormatElement.byId($$4);
            int $$6 = $$5 != null ? $$02.indexOf($$5) : -1;
            this.offsetsByElement[$$4] = $$6 != -1 ? $$2.getInt($$6) : -1;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String toString() {
        return "VertexFormat" + String.valueOf(this.names);
    }

    public int getVertexSize() {
        return this.vertexSize;
    }

    public List<VertexFormatElement> getElements() {
        return this.elements;
    }

    public List<String> getElementAttributeNames() {
        return this.names;
    }

    public int[] getOffsetsByElement() {
        return this.offsetsByElement;
    }

    public int getOffset(VertexFormatElement $$0) {
        return this.offsetsByElement[$$0.id()];
    }

    public boolean contains(VertexFormatElement $$0) {
        return (this.elementsMask & $$0.mask()) != 0;
    }

    public int getElementsMask() {
        return this.elementsMask;
    }

    public String getElementName(VertexFormatElement $$0) {
        int $$1 = this.elements.indexOf($$0);
        if ($$1 == -1) {
            throw new IllegalArgumentException(String.valueOf($$0) + " is not contained in format");
        }
        return this.names.get($$1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof VertexFormat)) return false;
        VertexFormat $$1 = (VertexFormat)$$0;
        if (this.elementsMask != $$1.elementsMask) return false;
        if (this.vertexSize != $$1.vertexSize) return false;
        if (!this.names.equals($$1.names)) return false;
        if (!Arrays.equals(this.offsetsByElement, $$1.offsetsByElement)) return false;
        return true;
    }

    public int hashCode() {
        return this.elementsMask * 31 + Arrays.hashCode(this.offsetsByElement);
    }

    private static GpuBuffer uploadToBuffer(@Nullable GpuBuffer $$0, ByteBuffer $$1, @GpuBuffer.a int $$2, Supplier<String> $$3) {
        GpuDevice $$4 = RenderSystem.getDevice();
        if (fwc.a($$4).a()) {
            if ($$0 != null) {
                $$0.close();
            }
            return $$4.createBuffer($$3, $$2, $$1);
        }
        if ($$0 == null) {
            $$0 = $$4.createBuffer($$3, $$2, $$1);
        } else {
            CommandEncoder $$5 = $$4.createCommandEncoder();
            if ($$0.size() < (long)$$1.remaining()) {
                $$0.close();
                $$0 = $$4.createBuffer($$3, $$2, $$1);
            } else {
                $$5.writeToBuffer($$0.slice(), $$1);
            }
        }
        return $$0;
    }

    public GpuBuffer uploadImmediateVertexBuffer(ByteBuffer $$0) {
        this.immediateDrawVertexBuffer = VertexFormat.uploadToBuffer(this.immediateDrawVertexBuffer, $$0, 40, () -> "Immediate vertex buffer for " + String.valueOf(this));
        return this.immediateDrawVertexBuffer;
    }

    public GpuBuffer uploadImmediateIndexBuffer(ByteBuffer $$0) {
        this.immediateDrawIndexBuffer = VertexFormat.uploadToBuffer(this.immediateDrawIndexBuffer, $$0, 72, () -> "Immediate index buffer for " + String.valueOf(this));
        return this.immediateDrawIndexBuffer;
    }

    @fwa
    public static class Builder {
        private final ImmutableMap.Builder<String, VertexFormatElement> elements = ImmutableMap.builder();
        private final IntList offsets = new IntArrayList();
        private int offset;

        Builder() {
        }

        public Builder add(String $$0, VertexFormatElement $$1) {
            this.elements.put((Object)$$0, (Object)$$1);
            this.offsets.add(this.offset);
            this.offset += $$1.byteSize();
            return this;
        }

        public Builder padding(int $$0) {
            this.offset += $$0;
            return this;
        }

        public VertexFormat build() {
            ImmutableMap $$0 = this.elements.buildOrThrow();
            ImmutableList $$1 = $$0.values().asList();
            ImmutableList $$2 = $$0.keySet().asList();
            return new VertexFormat((List<VertexFormatElement>)$$1, (List<String>)$$2, this.offsets, this.offset);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(2, 2, false);
        public static final /* enum */ b b = new b(2, 2, false);
        public static final /* enum */ b c = new b(2, 1, true);
        public static final /* enum */ b d = new b(1, 1, false);
        public static final /* enum */ b e = new b(3, 3, false);
        public static final /* enum */ b f = new b(3, 1, true);
        public static final /* enum */ b g = new b(3, 1, true);
        public static final /* enum */ b h = new b(4, 4, false);
        public final int i;
        public final int j;
        public final boolean k;
        private static final /* synthetic */ b[] l;

        public static b[] values() {
            return (b[])l.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, int $$1, boolean $$2) {
            this.i = $$0;
            this.j = $$1;
            this.k = $$2;
        }

        public int a(int $$0) {
            int $$3;
            switch (this.ordinal()) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    int $$1 = $$0;
                    break;
                }
                case 0: 
                case 7: {
                    int $$2 = $$0 / 4 * 6;
                    break;
                }
                default: {
                    $$3 = 0;
                }
            }
            return $$3;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g, h};
        }

        static {
            l = com.mojang.blaze3d.vertex.VertexFormat$b.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(2);
        public static final /* enum */ a b = new a(4);
        public final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.c = $$0;
        }

        public static a a(int $$0) {
            if (($$0 & 0xFFFF0000) != 0) {
                return b;
            }
            return a;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = com.mojang.blaze3d.vertex.VertexFormat$a.a();
        }
    }
}

