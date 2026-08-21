/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public class hgl
extends gzp<a> {
    private static final String a = "bell_body";
    private final hdg b;

    public hgl(hdg $$0) {
        super($$0, ijt::d);
        this.b = $$0.b(a);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a(a, hdl.c().a(0, 0).a(-3.0f, -6.0f, -3.0f, 6.0f, 7.0f, 6.0f), hdi.a(8.0f, 12.0f, 8.0f));
        $$2.a("bell_base", hdl.c().a(0, 13).a(4.0f, 4.0f, 4.0f, 8.0f, 2.0f, 8.0f), hdi.a(-8.0f, -12.0f, -8.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(a $$0) {
        super.a($$0);
        float $$1 = 0.0f;
        float $$2 = 0.0f;
        if ($$0.b != null) {
            float $$3 = bgj.a((double)($$0.a / (float)Math.PI)) / (4.0f + $$0.a / 3.0f);
            switch ($$0.b) {
                case c: {
                    $$1 = -$$3;
                    break;
                }
                case d: {
                    $$1 = $$3;
                    break;
                }
                case f: {
                    $$2 = -$$3;
                    break;
                }
                case e: {
                    $$2 = $$3;
                }
            }
        }
        this.b.e = $$1;
        this.b.g = $$2;
    }

    public static final class a
    extends Record {
        final float a;
        final @Nullable iz b;

        public a(float $$0, @Nullable iz $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "ticks;shakeDirection", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "ticks;shakeDirection", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "ticks;shakeDirection", "a", "b"}, this, $$0);
        }

        public float a() {
            return this.a;
        }

        public @Nullable iz b() {
            return this.b;
        }
    }
}

