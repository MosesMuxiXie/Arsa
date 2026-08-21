/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hoo {
    private final b a;
    final is b;

    public hoo(jw $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$1 * 2 + 1;
        int $$5 = bgj.c($$4);
        int $$6 = $$1 * 16;
        is $$7 = $$0.j();
        this.b = $$0.k();
        int $$8 = $$7.u() - $$6;
        int $$9 = $$8 + $$5 * 16 - 1;
        int $$10 = $$5 >= $$2 ? $$3 : $$7.v() - $$6;
        int $$11 = $$10 + $$5 * 16 - 1;
        int $$12 = $$7.w() - $$6;
        int $$13 = $$12 + $$5 * 16 - 1;
        this.a = new b(new ffg($$8, $$10, $$12, $$9, $$11, $$13));
    }

    public boolean a(hts.a $$0) {
        return this.a.a($$0);
    }

    public void a(e $$0, htx $$1, int $$2) {
        this.a.a($$0, false, $$1, 0, $$2, true);
    }

    boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int $$6) {
        int $$7 = this.b.u();
        int $$8 = this.b.v();
        int $$9 = this.b.w();
        return (double)$$7 > $$0 - (double)$$6 && (double)$$7 < $$3 + (double)$$6 && (double)$$8 > $$1 - (double)$$6 && (double)$$8 < $$4 + (double)$$6 && (double)$$9 > $$2 - (double)$$6 && (double)$$9 < $$5 + (double)$$6;
    }

    class b
    implements d {
        private final @Nullable d[] b = new d[8];
        private final ffg c;
        private final int d;
        private final int e;
        private final int f;
        private final a g;
        private final boolean h;
        private final boolean i;
        private final boolean j;

        public b(ffg $$0) {
            this.c = $$0;
            this.d = this.c.h() + this.c.d() / 2;
            this.e = this.c.i() + this.c.e() / 2;
            this.f = this.c.j() + this.c.f() / 2;
            int $$1 = hoo.this.b.u() - this.d;
            int $$2 = hoo.this.b.v() - this.e;
            int $$3 = hoo.this.b.w() - this.f;
            this.g = hoo$a.a(Math.abs($$1), Math.abs($$2), Math.abs($$3));
            this.h = $$1 < 0;
            this.i = $$2 < 0;
            this.j = $$3 < 0;
        }

        public boolean a(hts.a $$0) {
            long $$1 = $$0.g();
            boolean $$2 = jw.c(jw.b($$1)) - this.d < 0;
            boolean $$3 = jw.c(jw.c($$1)) - this.e < 0;
            boolean $$4 = jw.c(jw.d($$1)) - this.f < 0;
            boolean $$5 = $$2 != this.h;
            boolean $$6 = $$3 != this.i;
            boolean $$7 = $$4 != this.j;
            int $$8 = hoo$b.a(this.g, $$5, $$6, $$7);
            if (this.c()) {
                boolean $$9 = this.b[$$8] != null;
                this.b[$$8] = new c($$0);
                return !$$9;
            }
            if (this.b[$$8] != null) {
                b $$10 = (b)this.b[$$8];
                return $$10.a($$0);
            }
            ffg $$11 = this.a($$2, $$3, $$4);
            b $$12 = new b($$11);
            this.b[$$8] = $$12;
            return $$12.a($$0);
        }

        private static int a(a $$0, boolean $$1, boolean $$2, boolean $$3) {
            int $$4 = 0;
            if ($$1) {
                $$4 += $$0.g;
            }
            if ($$2) {
                $$4 += $$0.h;
            }
            if ($$3) {
                $$4 += $$0.i;
            }
            return $$4;
        }

        private boolean c() {
            return this.c.d() == 32;
        }

        private ffg a(boolean $$0, boolean $$1, boolean $$2) {
            int $$14;
            int $$13;
            int $$10;
            int $$9;
            int $$6;
            int $$5;
            if ($$0) {
                int $$3 = this.c.h();
                int $$4 = this.d - 1;
            } else {
                $$5 = this.d;
                $$6 = this.c.k();
            }
            if ($$1) {
                int $$7 = this.c.i();
                int $$8 = this.e - 1;
            } else {
                $$9 = this.e;
                $$10 = this.c.l();
            }
            if ($$2) {
                int $$11 = this.c.j();
                int $$12 = this.f - 1;
            } else {
                $$13 = this.f;
                $$14 = this.c.m();
            }
            return new ffg($$5, $$9, $$13, $$6, $$10, $$14);
        }

        @Override
        public void a(e $$0, boolean $$1, htx $$2, int $$3, int $$4, boolean $$5) {
            boolean $$6 = $$1;
            if (!$$1) {
                int $$7 = $$2.a(this.c);
                $$1 = $$7 == -2;
                boolean bl2 = $$6 = $$7 == -2 || $$7 == -1;
            }
            if ($$6) {
                $$5 = $$5 && hoo.this.a(this.c.h(), this.c.i(), this.c.j(), this.c.k(), this.c.l(), this.c.m(), $$4);
                $$0.visit(this, $$1, $$3, $$5);
                for (d $$8 : this.b) {
                    if ($$8 == null) continue;
                    $$8.a($$0, $$1, $$2, $$3 + 1, $$4, $$5);
                }
            }
        }

        @Override
        public @Nullable hts.a a() {
            return null;
        }

        @Override
        public fth b() {
            return new fth(this.c.h(), this.c.i(), this.c.j(), this.c.k() + 1, this.c.l() + 1, this.c.m() + 1);
        }
    }

    @FunctionalInterface
    public static interface e {
        public void visit(d var1, boolean var2, int var3, boolean var4);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(4, 2, 1);
        public static final /* enum */ a b = new a(4, 1, 2);
        public static final /* enum */ a c = new a(2, 4, 1);
        public static final /* enum */ a d = new a(1, 4, 2);
        public static final /* enum */ a e = new a(2, 1, 4);
        public static final /* enum */ a f = new a(1, 2, 4);
        final int g;
        final int h;
        final int i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1, int $$2) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
        }

        public static a a(int $$0, int $$1, int $$2) {
            if ($$0 > $$1 && $$0 > $$2) {
                if ($$1 > $$2) {
                    return a;
                }
                return b;
            }
            if ($$1 > $$0 && $$1 > $$2) {
                if ($$0 > $$2) {
                    return c;
                }
                return d;
            }
            if ($$0 > $$1) {
                return e;
            }
            return f;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            j = hoo$a.a();
        }
    }

    public static interface d {
        public void a(e var1, boolean var2, htx var3, int var4, int var5, boolean var6);

        public @Nullable hts.a a();

        public fth b();
    }

    final class c
    implements d {
        private final hts.a b;

        c(hts.a $$0) {
            this.b = $$0;
        }

        @Override
        public void a(e $$0, boolean $$1, htx $$2, int $$3, int $$4, boolean $$5) {
            fth $$6 = this.b.c();
            if ($$1 || $$2.a(this.a().c())) {
                $$5 = $$5 && hoo.this.a($$6.a, $$6.b, $$6.c, $$6.d, $$6.e, $$6.f, $$4);
                $$0.visit(this, $$1, $$3, $$5);
            }
        }

        @Override
        public hts.a a() {
            return this.b;
        }

        @Override
        public fth b() {
            return this.b.c();
        }
    }
}

