/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public record fxz(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
    public fxz a(int $$0, int $$1) {
        return new fxz($$0, $$1, this.c, this.d, this.e);
    }

    public fxz a(boolean $$0) {
        return new fxz(this.a, this.b, this.c, this.d, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fxz.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fxz.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fxz.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

