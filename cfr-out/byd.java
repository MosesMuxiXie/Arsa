/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public abstract class byd<S>
implements byk<S> {
    private @Nullable b[] a = new b[256];
    private final byh<S> b;
    private final bym c = new bym();
    private @Nullable d[] d = new d[16];
    private int e;
    private final c f = new c();

    protected byd(byh<S> $$0) {
        this.b = $$0;
    }

    @Override
    public bym a() {
        return this.c;
    }

    @Override
    public byh<S> b() {
        return this.b;
    }

    @Override
    public <T> @Nullable T a(byj<S, T> $$0) {
        a<T> $$8;
        T $$5;
        int $$1 = this.g();
        b $$2 = this.b($$1);
        int $$3 = $$2.a($$0.a());
        if ($$3 != -1) {
            a $$4 = $$2.a($$3);
            if ($$4 != null) {
                if ($$4 == byd$a.a) {
                    return null;
                }
                this.a($$4.c);
                return $$4.b;
            }
        } else {
            $$3 = $$2.b($$0.a());
        }
        if (($$5 = $$0.b().a(this)) == null) {
            a $$6 = byd$a.a();
        } else {
            int $$7 = this.g();
            $$8 = new a<T>($$5, $$7);
        }
        $$2.a($$3, $$8);
        return $$5;
    }

    private b b(int $$0) {
        b $$4;
        int $$1 = this.a.length;
        if ($$0 >= $$1) {
            int $$2 = bhs.a($$1, $$0 + 1);
            b[] $$3 = new b[$$2];
            System.arraycopy(this.a, 0, $$3, 0, $$1);
            this.a = $$3;
        }
        if (($$4 = this.a[$$0]) == null) {
            this.a[$$0] = $$4 = new b();
        }
        return $$4;
    }

    @Override
    public bye c() {
        int $$3;
        d $$4;
        int $$0 = this.d.length;
        if (this.e >= $$0) {
            int $$1 = bhs.a($$0, this.e + 1);
            d[] $$2 = new d[$$1];
            System.arraycopy(this.d, 0, $$2, 0, $$0);
            this.d = $$2;
        }
        if (($$4 = this.d[$$3 = this.e++]) == null) {
            this.d[$$3] = $$4 = new d();
        } else {
            $$4.c();
        }
        return $$4;
    }

    @Override
    public void d() {
        --this.e;
    }

    @Override
    public byk<S> e() {
        return this.f;
    }

    static class b {
        public static final int a = 2;
        private static final int b = -1;
        private Object[] c = new Object[16];
        private int d;

        b() {
        }

        public int a(byc<?> $$0) {
            for (int $$1 = 0; $$1 < this.d; $$1 += 2) {
                if (this.c[$$1] != $$0) continue;
                return $$1;
            }
            return -1;
        }

        public int b(byc<?> $$0) {
            int $$1 = this.d;
            this.d += 2;
            int $$2 = $$1 + 1;
            int $$3 = this.c.length;
            if ($$2 >= $$3) {
                int $$4 = bhs.a($$3, $$2 + 1);
                Object[] $$5 = new Object[$$4];
                System.arraycopy(this.c, 0, $$5, 0, $$3);
                this.c = $$5;
            }
            this.c[$$1] = $$0;
            return $$1;
        }

        public <T> @Nullable a<T> a(int $$0) {
            return (a)this.c[$$0 + 1];
        }

        public void a(int $$0, a<?> $$1) {
            this.c[$$0 + 1] = $$1;
        }
    }

    static class d
    implements bye {
        private boolean b;

        d() {
        }

        @Override
        public void a() {
            this.b = true;
        }

        @Override
        public boolean b() {
            return this.b;
        }

        public void c() {
            this.b = false;
        }
    }

    class c
    implements byk<S> {
        private final byh<S> b = new byh.b();

        c() {
        }

        @Override
        public byh<S> b() {
            return this.b;
        }

        @Override
        public bym a() {
            return byd.this.a();
        }

        @Override
        public <T> @Nullable T a(byj<S, T> $$0) {
            return byd.this.a($$0);
        }

        @Override
        public S f() {
            return byd.this.f();
        }

        @Override
        public int g() {
            return byd.this.g();
        }

        @Override
        public void a(int $$0) {
            byd.this.a($$0);
        }

        @Override
        public bye c() {
            return byd.this.c();
        }

        @Override
        public void d() {
            byd.this.d();
        }

        @Override
        public byk<S> e() {
            return this;
        }
    }

    static final class a<T>
    extends Record {
        final @Nullable T b;
        final int c;
        public static final a<?> a = new a<Object>(null, -1);

        a(@Nullable T $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static <T> a<T> a() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "value;markAfterParse", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value;markAfterParse", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value;markAfterParse", "b", "c"}, this, $$0);
        }

        public @Nullable T b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }
}

