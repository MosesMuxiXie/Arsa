/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface euj {
    public static final Codec<euj> c = euk.b;
    public static final Codec<jd<euj>> d = amq.a(mj.bb, c);
    public static final Codec<euj> e = d.xmap(euk.k::new, $$0 -> {
        if ($$0 instanceof euk.k) {
            euk.k $$1 = (euk.k)$$0;
            return $$1.k();
        }
        return new jd.a<euj>((euj)$$0);
    });

    public double a(b var1);

    public void a(double[] var1, a var2);

    public euj a(f var1);

    public double a();

    public double b();

    public bga<? extends euj> c();

    default public euj a(double $$0, double $$1) {
        return new euk.g(this, $$0, $$1);
    }

    default public euj d() {
        return euk.a(this, euk.l.a.a);
    }

    default public euj e() {
        return euk.a(this, euk.l.a.b);
    }

    default public euj f() {
        return euk.a(this, euk.l.a.c);
    }

    default public euj g() {
        return euk.a(this, euk.l.a.d);
    }

    default public euj h() {
        return euk.a(this, euk.l.a.e);
    }

    default public euj i() {
        return euk.a(this, euk.l.a.f);
    }

    default public euj j() {
        return euk.a(this, euk.l.a.g);
    }

    public record e(int a, int b, int c) implements b
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this, $$0);
        }
    }

    public static interface b {
        public int a();

        public int b();

        public int c();

        default public evs d() {
            return evs.a();
        }
    }

    public static interface d
    extends euj {
        @Override
        default public void a(double[] $$0, a $$1) {
            $$1.a($$0, this);
        }

        @Override
        default public euj a(f $$0) {
            return $$0.apply(this);
        }
    }

    public static interface f {
        public euj apply(euj var1);

        default public c a(c $$0) {
            return $$0;
        }
    }

    public record c(jd<fke.a> b, @Nullable fke c) {
        public static final Codec<c> a = fke.a.b.xmap($$0 -> new c((jd<fke.a>)$$0, null), c::b);

        public c(jd<fke.a> $$0) {
            this($$0, null);
        }

        public double a(double $$0, double $$1, double $$2) {
            return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
        }

        public double a() {
            return this.c == null ? 2.0 : this.c.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this, $$0);
        }
    }

    public static interface a {
        public b a(int var1);

        public void a(double[] var1, euj var2);
    }
}

