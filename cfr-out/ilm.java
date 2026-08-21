/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ilm<T extends a> {
    private static final Comparator<b<?>> a = Comparator.comparing($$0 -> -$$0.c).thenComparing($$0 -> -$$0.b).thenComparing($$0 -> $$0.a.d());
    private final int b;
    private final List<b<T>> c = new ArrayList<b<T>>();
    private final List<c<T>> d = new ArrayList<c<T>>();
    private int e;
    private int f;
    private final int g;
    private final int h;
    private final int i;

    public ilm(int $$0, int $$1, int $$2, int $$3) {
        this.b = $$2;
        this.g = $$0;
        this.h = $$1;
        this.i = 1 << $$2 << bgj.a($$3 - 1, 0, 4);
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public void a(T $$0) {
        b<T> $$1 = new b<T>($$0, ilm.a($$0.b() + this.i * 2, this.b), ilm.a($$0.c() + this.i * 2, this.b));
        this.c.add($$1);
    }

    public void c() {
        ArrayList<b<T>> $$02 = new ArrayList<b<T>>(this.c);
        $$02.sort(a);
        for (b b2 : $$02) {
            if (this.a(b2)) continue;
            throw new iln((a)b2.a, (Collection)$$02.stream().map($$0 -> $$0.a).collect(ImmutableList.toImmutableList()));
        }
    }

    public void a(d<T> $$0) {
        for (c<T> $$1 : this.d) {
            $$1.a($$0, this.i);
        }
    }

    private static int a(int $$0, int $$1) {
        return ($$0 >> $$1) + (($$0 & (1 << $$1) - 1) == 0 ? 0 : 1) << $$1;
    }

    private boolean a(b<T> $$0) {
        for (c<T> $$1 : this.d) {
            if (!$$1.a($$0)) continue;
            return true;
        }
        return this.b($$0);
    }

    private boolean b(b<T> $$0) {
        c<T> $$12;
        boolean $$10;
        boolean $$8;
        boolean $$6;
        int $$1 = bgj.c(this.e);
        int $$2 = bgj.c(this.f);
        int $$3 = bgj.c(this.e + $$0.b);
        int $$4 = bgj.c(this.f + $$0.c);
        boolean $$5 = $$3 <= this.g;
        boolean bl2 = $$6 = $$4 <= this.h;
        if (!$$5 && !$$6) {
            return false;
        }
        boolean $$7 = $$5 && $$1 != $$3;
        boolean bl3 = $$8 = $$6 && $$2 != $$4;
        if ($$7 ^ $$8) {
            boolean $$9 = $$7;
        } else {
            boolean bl4 = $$10 = $$5 && $$1 <= $$2;
        }
        if ($$10) {
            if (this.f == 0) {
                this.f = $$4;
            }
            c $$11 = new c(this.e, 0, $$3 - this.e, this.f);
            this.e = $$3;
        } else {
            $$12 = new c<T>(0, this.f, this.e, $$4 - this.f);
            this.f = $$4;
        }
        $$12.a($$0);
        this.d.add($$12);
        return true;
    }

    static final class b<T extends a>
    extends Record {
        final T a;
        final int b;
        final int c;

        b(T $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "entry;width;height", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entry;width;height", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entry;width;height", "a", "b", "c"}, this, $$0);
        }

        public T a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }

    public static interface a {
        public int b();

        public int c();

        public amo d();
    }

    public static class c<T extends a> {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private @Nullable List<c<T>> e;
        private @Nullable b<T> f;

        public c(int $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean a(b<T> $$0) {
            if (this.f != null) {
                return false;
            }
            int $$1 = $$0.b;
            int $$2 = $$0.c;
            if ($$1 > this.c || $$2 > this.d) {
                return false;
            }
            if ($$1 == this.c && $$2 == this.d) {
                this.f = $$0;
                return true;
            }
            if (this.e == null) {
                this.e = new ArrayList<c<T>>(1);
                this.e.add(new c<T>(this.a, this.b, $$1, $$2));
                int $$3 = this.c - $$1;
                int $$4 = this.d - $$2;
                if ($$4 > 0 && $$3 > 0) {
                    int $$6;
                    int $$5 = Math.max(this.d, $$3);
                    if ($$5 >= ($$6 = Math.max(this.c, $$4))) {
                        this.e.add(new c<T>(this.a, this.b + $$2, $$1, $$4));
                        this.e.add(new c<T>(this.a + $$1, this.b, $$3, this.d));
                    } else {
                        this.e.add(new c<T>(this.a + $$1, this.b, $$3, $$2));
                        this.e.add(new c<T>(this.a, this.b + $$2, this.c, $$4));
                    }
                } else if ($$3 == 0) {
                    this.e.add(new c<T>(this.a, this.b + $$2, $$1, $$4));
                } else if ($$4 == 0) {
                    this.e.add(new c<T>(this.a + $$1, this.b, $$3, $$2));
                }
            }
            for (c<T> $$7 : this.e) {
                if (!$$7.a($$0)) continue;
                return true;
            }
            return false;
        }

        public void a(d<T> $$0, int $$1) {
            if (this.f != null) {
                $$0.load(this.f.a, this.a(), this.b(), $$1);
            } else if (this.e != null) {
                for (c $$2 : this.e) {
                    $$2.a($$0, $$1);
                }
            }
        }

        public String toString() {
            return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + String.valueOf(this.f) + ", subSlots=" + String.valueOf(this.e) + "}";
        }
    }

    public static interface d<T extends a> {
        public void load(T var1, int var2, int var3, int var4);
    }
}

