/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.TextureFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public sealed interface fxo
extends AutoCloseable {
    @Override
    default public void close() {
    }

    public record a(int a, int b) implements fxo
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "location;samplerIndex", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "location;samplerIndex", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "location;samplerIndex", "a", "b"}, this, $$0);
        }
    }

    public record c(int a, int b, TextureFormat c, int d) implements fxo
    {
        public c(int $$0, int $$1, TextureFormat $$2) {
            this($$0, $$1, $$2, GlStateManager._genTexture());
        }

        @Override
        public void close() {
            GlStateManager._deleteTexture(this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "location;samplerIndex;format;texture", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "location;samplerIndex;format;texture", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "location;samplerIndex;format;texture", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public record b(int a) implements fxo
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "blockBinding", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "blockBinding", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "blockBinding", "a"}, this, $$0);
        }
    }
}

