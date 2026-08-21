/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record cgn(float a, float b, float c, cgm d, boolean e) {
    private cgn(float $$0, float $$1, boolean $$2) {
        this($$0, $$1, cgn.c($$1), cgm.a($$0, $$1), $$2);
    }

    private static float c(float $$0) {
        return $$0 * 0.85f;
    }

    public fth a(ftm $$0) {
        return this.a($$0.g, $$0.h, $$0.i);
    }

    public fth a(double $$0, double $$1, double $$2) {
        float $$3 = this.a / 2.0f;
        float $$4 = this.b;
        return new fth($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
    }

    public cgn a(float $$0) {
        return this.a($$0, $$0);
    }

    public cgn a(float $$0, float $$1) {
        if (this.e || $$0 == 1.0f && $$1 == 1.0f) {
            return this;
        }
        return new cgn(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false);
    }

    public static cgn b(float $$0, float $$1) {
        return new cgn($$0, $$1, false);
    }

    public static cgn c(float $$0, float $$1) {
        return new cgn($$0, $$1, true);
    }

    public cgn b(float $$0) {
        return new cgn(this.a, this.b, $$0, this.d, this.e);
    }

    public cgn a(cgm.a $$0) {
        return new cgn(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cgn.class, "width;height;eyeHeight;attachments;fixed", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cgn.class, "width;height;eyeHeight;attachments;fixed", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cgn.class, "width;height;eyeHeight;attachments;fixed", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

