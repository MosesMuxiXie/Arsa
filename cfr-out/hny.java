/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class hny
implements AutoCloseable {
    public static final int a = new Std140SizeCalculator().putMat4f().putVec4().putVec3().putMat4f().get();
    public static final int b = new Std140SizeCalculator().putMat4f().putFloat().putIVec2().putIVec3().get();
    private static final int c = 2;
    private final hnx<b> d = new hnx("Dynamic Transforms UBO", a, 2);
    private final hnx<a> e = new hnx("Chunk Sections UBO", b, 2);

    public void a() {
        this.d.a();
        this.e.a();
    }

    @Override
    public void close() {
        this.d.close();
        this.e.close();
    }

    public GpuBufferSlice a(Matrix4fc $$0, Vector4fc $$1, Vector3fc $$2, Matrix4fc $$3) {
        return this.d.a(new b((Matrix4fc)new Matrix4f($$0), (Vector4fc)new Vector4f($$1), (Vector3fc)new Vector3f($$2), (Matrix4fc)new Matrix4f($$3)));
    }

    public GpuBufferSlice[] a(b ... $$0) {
        return this.d.a($$0);
    }

    public GpuBufferSlice[] a(a ... $$0) {
        return this.e.a($$0);
    }

    public record b(Matrix4fc a, Vector4fc b, Vector3fc c, Matrix4fc d) implements hnx.a
    {
        @Override
        public void a(ByteBuffer $$0) {
            Std140Builder.intoBuffer($$0).putMat4f(this.a).putVec4(this.b).putVec3(this.c).putMat4f(this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "modelView;colorModulator;modelOffset;textureMatrix", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "modelView;colorModulator;modelOffset;textureMatrix", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "modelView;colorModulator;modelOffset;textureMatrix", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public record a(Matrix4fc a, int b, int c, int d, float e, int f, int g) implements hnx.a
    {
        @Override
        public void a(ByteBuffer $$0) {
            Std140Builder.intoBuffer($$0).putMat4f(this.a).putFloat(this.e).putIVec2(this.f, this.g).putIVec3(this.b, this.c, this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }
    }
}

