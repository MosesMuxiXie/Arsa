/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public interface awo {
    public static final awo a = new awo(){

        @Override
        public boolean a(int $$0, int $$1, boolean $$2) {
            return false;
        }

        @Override
        public void a(Consumer<dvu> $$0) {
        }
    };

    public static awo a(dvu $$0, int $$1) {
        return new a($$0, $$1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(awo $$0, awo $$1, Consumer<dvu> $$2, Consumer<dvu> $$3) {
        a $$5;
        a $$4;
        block8: {
            block7: {
                if ($$0.equals($$1)) {
                    return;
                }
                if (!($$0 instanceof a)) break block7;
                $$4 = (a)$$0;
                if ($$1 instanceof a && $$4.a($$5 = (a)$$1)) break block8;
            }
            $$0.a($$3);
            $$1.a($$2);
            return;
        }
        int $$6 = Math.min($$4.c(), $$5.c());
        int $$7 = Math.min($$4.d(), $$5.d());
        int $$8 = Math.max($$4.e(), $$5.e());
        int $$9 = Math.max($$4.f(), $$5.f());
        int $$10 = $$6;
        while ($$10 <= $$8) {
            for (int $$11 = $$7; $$11 <= $$9; ++$$11) {
                boolean $$13;
                boolean $$12 = $$4.a($$10, $$11);
                if ($$12 == ($$13 = $$5.a($$10, $$11))) continue;
                if ($$13) {
                    $$2.accept(new dvu($$10, $$11));
                    continue;
                }
                $$3.accept(new dvu($$10, $$11));
            }
            ++$$10;
        }
        return;
    }

    default public boolean a(dvu $$0) {
        return this.a($$0.h, $$0.i);
    }

    default public boolean a(int $$0, int $$1) {
        return this.a($$0, $$1, true);
    }

    public boolean a(int var1, int var2, boolean var3);

    public void a(Consumer<dvu> var1);

    default public boolean b(int $$0, int $$1) {
        return this.a($$0, $$1, false);
    }

    public static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        return awo.a($$0, $$1, $$2, $$3, $$4, false);
    }

    public static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        int $$6 = $$5 ? 2 : 1;
        long $$7 = Math.max(0, Math.abs($$3 - $$0) - $$6);
        long $$8 = Math.max(0, Math.abs($$4 - $$1) - $$6);
        long $$9 = $$7 * $$7 + $$8 * $$8;
        int $$10 = $$2 * $$2;
        return $$9 < (long)$$10;
    }

    public static final class a
    extends Record
    implements awo {
        private final dvu b;
        private final int c;

        public a(dvu $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        int c() {
            return this.b.h - this.c - 1;
        }

        int d() {
            return this.b.i - this.c - 1;
        }

        int e() {
            return this.b.h + this.c + 1;
        }

        int f() {
            return this.b.i + this.c + 1;
        }

        @VisibleForTesting
        protected boolean a(a $$0) {
            return this.c() <= $$0.e() && this.e() >= $$0.c() && this.d() <= $$0.f() && this.f() >= $$0.d();
        }

        @Override
        public boolean a(int $$0, int $$1, boolean $$2) {
            return awo.a(this.b.h, this.b.i, this.c, $$0, $$1, $$2);
        }

        @Override
        public void a(Consumer<dvu> $$0) {
            for (int $$1 = this.c(); $$1 <= this.e(); ++$$1) {
                for (int $$2 = this.d(); $$2 <= this.f(); ++$$2) {
                    if (!this.a($$1, $$2)) continue;
                    $$0.accept(new dvu($$1, $$2));
                }
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "center;viewDistance", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "center;viewDistance", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "center;viewDistance", "b", "c"}, this, $$0);
        }

        public dvu a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }
}

