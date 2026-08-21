/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.joml.Vector2f
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

public interface gil {
    public static final double a = 0.5;
    public static final double b = 3.0;

    public b a();

    public void a(b var1);

    default public void a(int $$0, int $$1, bfr $$2) {
        this.a(git.a, $$0, $$1, this.a(), $$2);
    }

    default public void a(int $$0, int $$1, yh $$2) {
        this.a(git.a, $$0, $$1, this.a(), $$2.g());
    }

    default public void a(git $$0, int $$1, int $$2, b $$3, yh $$4) {
        this.a($$0, $$1, $$2, $$3, $$4.g());
    }

    public void a(git var1, int var2, int var3, b var4, bfr var5);

    default public void a(git $$0, int $$1, int $$2, yh $$3) {
        this.a($$0, $$1, $$2, $$3.g());
    }

    default public void a(git $$0, int $$1, int $$2, bfr $$3) {
        this.a($$0, $$1, $$2, this.a(), $$3);
    }

    public void a(yh var1, int var2, int var3, int var4, int var5, int var6, b var7);

    default public void a(yh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, this.a());
    }

    default public void a(yh $$0, int $$1, int $$2, int $$3, int $$4) {
        this.a($$0, ($$1 + $$2) / 2, $$1, $$2, $$3, $$4);
    }

    default public void a(yh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, b $$8) {
        int $$9 = ($$4 + $$5 - $$7) / 2 + 1;
        int $$10 = $$3 - $$2;
        if ($$6 > $$10) {
            int $$11 = $$6 - $$10;
            double $$12 = (double)bhs.c() / 1000.0;
            double $$13 = Math.max((double)$$11 * 0.5, 3.0);
            double $$14 = Math.sin(1.5707963267948966 * Math.cos(Math.PI * 2 * $$12 / $$13)) / 2.0 + 0.5;
            double $$15 = bgj.d($$14, 0.0, (double)$$11);
            b $$16 = $$8.a($$2, $$3, $$4, $$5);
            this.a(git.a, $$2 - (int)$$15, $$9, $$16, $$0.g());
        } else {
            int $$17 = bgj.a($$1, $$2 + $$6 / 2, $$3 - $$6 / 2);
            this.a(git.b, $$17, $$9, $$0);
        }
    }

    public static void a(gqh $$0, float $$1, float $$2, final Consumer<zf> $$3) {
        gpm $$4 = $$0.n();
        if ($$4 == null || !$$4.a((int)$$1, (int)$$2)) {
            return;
        }
        Vector2f $$5 = $$0.c.invert(new Matrix3x2f()).transformPosition(new Vector2f($$1, $$2));
        final float $$6 = $$5.x();
        final float $$7 = $$5.y();
        $$0.a().a(new gio.b(){

            @Override
            public void a(gnz.a $$0) {
                this.a((gnk)$$0);
            }

            @Override
            public void a(gno $$0) {
                this.a((gnk)$$0);
            }

            private void a(gnk $$0) {
                if (gil.a($$6, $$7, $$0.b(), $$0.c(), $$0.d(), $$0.e())) {
                    $$3.accept($$0.a());
                }
            }
        });
    }

    public static boolean a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        return $$0 >= $$2 && $$0 < $$4 && $$1 >= $$3 && $$1 < $$5;
    }

    public record b(Matrix3x2fc a, float b, @Nullable gpm c) {
        public b(Matrix3x2fc $$0) {
            this($$0, 1.0f, null);
        }

        public b a(Matrix3x2fc $$0) {
            return new b($$0, this.b, this.c);
        }

        public b a(float $$0) {
            return this.a((Matrix3x2fc)this.a.scale($$0, $$0, new Matrix3x2f()));
        }

        public b b(float $$0) {
            if (this.b == $$0) {
                return this;
            }
            return new b(this.a, $$0, this.c);
        }

        public b a(gpm $$0) {
            if ($$0.equals(this.c)) {
                return this;
            }
            return new b(this.a, this.b, $$0);
        }

        public b a(int $$0, int $$1, int $$2, int $$3) {
            gpm $$4 = new gpm($$0, $$2, $$1 - $$0, $$3 - $$2).a(this.a);
            if (this.c != null) {
                $$4 = Objects.requireNonNullElse(this.c.b($$4), gpm.a());
            }
            return this.a($$4);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "pose;opacity;scissor", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "pose;opacity;scissor", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "pose;opacity;scissor", "a", "b", "c"}, this, $$0);
        }
    }

    public static class a
    implements gil {
        private static final b c = new b((Matrix3x2fc)new Matrix3x2f());
        private final gio d;
        private final int e;
        private final int f;
        private b g = c;
        private boolean h;
        private @Nullable zf i;
        private final Consumer<zf> j = $$0 -> {
            if ($$0.i() != null || this.h && $$0.k() != null) {
                this.i = $$0;
            }
        };

        public a(gio $$02, int $$1, int $$2) {
            this.d = $$02;
            this.e = $$1;
            this.f = $$2;
        }

        @Override
        public b a() {
            return this.g;
        }

        @Override
        public void a(b $$0) {
            this.g = $$0;
        }

        @Override
        public void a(git $$0, int $$1, int $$2, b $$3, bfr $$4) {
            int $$5 = $$0.a($$1, this.d, $$4);
            gqh $$6 = new gqh(this.d, $$4, $$3.a(), $$5, $$2, bel.b($$3.b()), 0, true, true, $$3.c());
            gil.a($$6, this.e, this.f, this.j);
        }

        @Override
        public void a(yh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, b $$6) {
            int $$7 = this.d.a($$0);
            int $$8 = this.d.b;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$6);
        }

        public a a(boolean $$0) {
            this.h = $$0;
            return this;
        }

        public @Nullable zf b() {
            return this.i;
        }
    }
}

