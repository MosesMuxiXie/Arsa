/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

@fwa
public record VertexFormatElement(int id, int index, Type type, Usage usage, int count) {
    public static final int MAX_COUNT = 32;
    private static final @Nullable VertexFormatElement[] BY_ID = new VertexFormatElement[32];
    private static final List<VertexFormatElement> ELEMENTS = new ArrayList<VertexFormatElement>(32);
    public static final VertexFormatElement POSITION = VertexFormatElement.register(0, 0, Type.FLOAT, Usage.POSITION, 3);
    public static final VertexFormatElement COLOR = VertexFormatElement.register(1, 0, Type.UBYTE, Usage.COLOR, 4);
    public static final VertexFormatElement UV0;
    public static final VertexFormatElement UV;
    public static final VertexFormatElement UV1;
    public static final VertexFormatElement UV2;
    public static final VertexFormatElement NORMAL;
    public static final VertexFormatElement LINE_WIDTH;

    public VertexFormatElement(int $$0, int $$1, Type $$2, Usage $$3, int $$4) {
        if ($$0 < 0 || $$0 >= BY_ID.length) {
            throw new IllegalArgumentException("Element ID must be in range [0; " + BY_ID.length + ")");
        }
        if (!this.supportsUsage($$1, $$3)) {
            throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
        }
        this.id = $$0;
        this.index = $$1;
        this.type = $$2;
        this.usage = $$3;
        this.count = $$4;
    }

    public static VertexFormatElement register(int $$0, int $$1, Type $$2, Usage $$3, int $$4) {
        VertexFormatElement $$5 = new VertexFormatElement($$0, $$1, $$2, $$3, $$4);
        if (BY_ID[$$0] != null) {
            throw new IllegalArgumentException("Duplicate element registration for: " + $$0);
        }
        VertexFormatElement.BY_ID[$$0] = $$5;
        ELEMENTS.add($$5);
        return $$5;
    }

    private boolean supportsUsage(int $$0, Usage $$1) {
        return $$0 == 0 || $$1 == Usage.UV;
    }

    @Override
    public String toString() {
        return this.count + "," + String.valueOf((Object)this.usage) + "," + String.valueOf((Object)this.type) + " (" + this.id + ")";
    }

    public int mask() {
        return 1 << this.id;
    }

    public int byteSize() {
        return this.type.size() * this.count;
    }

    public static @Nullable VertexFormatElement byId(int $$0) {
        return BY_ID[$$0];
    }

    public static Stream<VertexFormatElement> elementsFromMask(int $$0) {
        return ELEMENTS.stream().filter($$1 -> ($$0 & $$1.mask()) != 0);
    }

    static {
        UV = UV0 = VertexFormatElement.register(2, 0, Type.FLOAT, Usage.UV, 2);
        UV1 = VertexFormatElement.register(3, 1, Type.SHORT, Usage.UV, 2);
        UV2 = VertexFormatElement.register(4, 2, Type.SHORT, Usage.UV, 2);
        NORMAL = VertexFormatElement.register(5, 0, Type.BYTE, Usage.NORMAL, 3);
        LINE_WIDTH = VertexFormatElement.register(6, 0, Type.FLOAT, Usage.GENERIC, 1);
    }

    @fwa
    public static enum Type {
        FLOAT(4, "Float"),
        UBYTE(1, "Unsigned Byte"),
        BYTE(1, "Byte"),
        USHORT(2, "Unsigned Short"),
        SHORT(2, "Short"),
        UINT(4, "Unsigned Int"),
        INT(4, "Int");

        private final int size;
        private final String name;

        private Type(int $$0, String $$1) {
            this.size = $$0;
            this.name = $$1;
        }

        public int size() {
            return this.size;
        }

        public String toString() {
            return this.name;
        }
    }

    @fwa
    public static enum Usage {
        POSITION("Position"),
        NORMAL("Normal"),
        COLOR("Vertex Color"),
        UV("UV"),
        GENERIC("Generic");

        private final String name;

        private Usage(String $$0) {
            this.name = $$0;
        }

        public String toString() {
            return this.name;
        }
    }
}

