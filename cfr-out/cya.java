/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;

public class cya {
    public static final int a = 64;
    private static final int b = 63;
    private final a[] c = new a[64];
    private int d = -1;

    public cya() {
        Arrays.fill(this.c, new a(0.0, 0.0f));
    }

    public void a(cya $$0) {
        System.arraycopy($$0.c, 0, this.c, 0, 64);
        this.d = $$0.d;
    }

    public void a(double $$0, float $$1) {
        a $$2 = new a($$0, $$1);
        if (this.d < 0) {
            Arrays.fill(this.c, $$2);
        }
        if (++this.d == 64) {
            this.d = 0;
        }
        this.c[this.d] = $$2;
    }

    public a a(int $$0) {
        return this.c[this.d - $$0 & 0x3F];
    }

    public a a(int $$0, float $$1) {
        a $$2 = this.a($$0);
        a $$3 = this.a($$0 + 1);
        return new a(bgj.d((double)$$1, $$3.a, $$2.a), bgj.i($$1, $$3.b, $$2.b));
    }

    public static final class a
    extends Record {
        final double a;
        final float b;

        public a(double $$0, float $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "y;yRot", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "y;yRot", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "y;yRot", "a", "b"}, this, $$0);
        }

        public double a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }
    }
}

