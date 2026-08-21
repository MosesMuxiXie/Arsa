/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4fc
 *  org.joml.Vector2fc
 *  org.joml.Vector2ic
 *  org.joml.Vector3fc
 *  org.joml.Vector3ic
 *  org.joml.Vector4fc
 *  org.joml.Vector4ic
 *  org.lwjgl.system.MemoryStack
 */
package com.mojang.blaze3d.buffers;

import java.nio.ByteBuffer;
import org.joml.Matrix4fc;
import org.joml.Vector2fc;
import org.joml.Vector2ic;
import org.joml.Vector3fc;
import org.joml.Vector3ic;
import org.joml.Vector4fc;
import org.joml.Vector4ic;
import org.lwjgl.system.MemoryStack;

@fwa
public class Std140Builder {
    private final ByteBuffer buffer;
    private final int start;

    private Std140Builder(ByteBuffer $$0) {
        this.buffer = $$0;
        this.start = $$0.position();
    }

    public static Std140Builder intoBuffer(ByteBuffer $$0) {
        return new Std140Builder($$0);
    }

    public static Std140Builder onStack(MemoryStack $$0, int $$1) {
        return new Std140Builder($$0.malloc($$1));
    }

    public ByteBuffer get() {
        return this.buffer.flip();
    }

    public Std140Builder align(int $$0) {
        int $$1 = this.buffer.position();
        this.buffer.position(this.start + bgj.e($$1 - this.start, $$0));
        return this;
    }

    public Std140Builder putFloat(float $$0) {
        this.align(4);
        this.buffer.putFloat($$0);
        return this;
    }

    public Std140Builder putInt(int $$0) {
        this.align(4);
        this.buffer.putInt($$0);
        return this;
    }

    public Std140Builder putVec2(float $$0, float $$1) {
        this.align(8);
        this.buffer.putFloat($$0);
        this.buffer.putFloat($$1);
        return this;
    }

    public Std140Builder putVec2(Vector2fc $$0) {
        this.align(8);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 8);
        return this;
    }

    public Std140Builder putIVec2(int $$0, int $$1) {
        this.align(8);
        this.buffer.putInt($$0);
        this.buffer.putInt($$1);
        return this;
    }

    public Std140Builder putIVec2(Vector2ic $$0) {
        this.align(8);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 8);
        return this;
    }

    public Std140Builder putVec3(float $$0, float $$1, float $$2) {
        this.align(16);
        this.buffer.putFloat($$0);
        this.buffer.putFloat($$1);
        this.buffer.putFloat($$2);
        this.buffer.position(this.buffer.position() + 4);
        return this;
    }

    public Std140Builder putVec3(Vector3fc $$0) {
        this.align(16);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 16);
        return this;
    }

    public Std140Builder putIVec3(int $$0, int $$1, int $$2) {
        this.align(16);
        this.buffer.putInt($$0);
        this.buffer.putInt($$1);
        this.buffer.putInt($$2);
        this.buffer.position(this.buffer.position() + 4);
        return this;
    }

    public Std140Builder putIVec3(Vector3ic $$0) {
        this.align(16);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 16);
        return this;
    }

    public Std140Builder putVec4(float $$0, float $$1, float $$2, float $$3) {
        this.align(16);
        this.buffer.putFloat($$0);
        this.buffer.putFloat($$1);
        this.buffer.putFloat($$2);
        this.buffer.putFloat($$3);
        return this;
    }

    public Std140Builder putVec4(Vector4fc $$0) {
        this.align(16);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 16);
        return this;
    }

    public Std140Builder putIVec4(int $$0, int $$1, int $$2, int $$3) {
        this.align(16);
        this.buffer.putInt($$0);
        this.buffer.putInt($$1);
        this.buffer.putInt($$2);
        this.buffer.putInt($$3);
        return this;
    }

    public Std140Builder putIVec4(Vector4ic $$0) {
        this.align(16);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 16);
        return this;
    }

    public Std140Builder putMat4f(Matrix4fc $$0) {
        this.align(16);
        $$0.get(this.buffer);
        this.buffer.position(this.buffer.position() + 64);
        return this;
    }
}

