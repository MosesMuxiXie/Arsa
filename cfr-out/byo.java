/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public interface byo<S> {
    public boolean a(byk<S> var1, bym var2, bye var3);

    public static <S, T> byo<S> a(byc<T> $$0, T $$1) {
        return new c($$0, $$1);
    }

    @SafeVarargs
    public static <S> byo<S> a(byo<S> ... $$0) {
        return new g<S>($$0);
    }

    @SafeVarargs
    public static <S> byo<S> b(byo<S> ... $$0) {
        return new a<S>($$0);
    }

    public static <S> byo<S> a(byo<S> $$0) {
        return new d<S>($$0);
    }

    public static <S, T> byo<S> a(byj<S, T> $$0, byc<List<T>> $$1) {
        return byo.a($$0, $$1, 0);
    }

    public static <S, T> byo<S> a(byj<S, T> $$0, byc<List<T>> $$1, int $$2) {
        return new e<S, T>($$0, $$1, $$2);
    }

    public static <S, T> byo<S> a(byj<S, T> $$0, byc<List<T>> $$1, byo<S> $$2) {
        return byo.a($$0, $$1, $$2, 0);
    }

    public static <S, T> byo<S> a(byj<S, T> $$0, byc<List<T>> $$1, byo<S> $$2, int $$3) {
        return new f<S, T>($$0, $$1, $$2, $$3, true);
    }

    public static <S, T> byo<S> b(byj<S, T> $$0, byc<List<T>> $$1, byo<S> $$2) {
        return byo.b($$0, $$1, $$2, 0);
    }

    public static <S, T> byo<S> b(byj<S, T> $$0, byc<List<T>> $$1, byo<S> $$2, int $$3) {
        return new f<S, T>($$0, $$1, $$2, $$3, false);
    }

    public static <S> byo<S> b(byo<S> $$0) {
        return new b<S>($$0, true);
    }

    public static <S> byo<S> c(byo<S> $$0) {
        return new b<S>($$0, false);
    }

    public static <S> byo<S> c() {
        return new byo<S>(){

            @Override
            public boolean a(byk<S> $$0, bym $$1, bye $$2) {
                $$2.a();
                return true;
            }

            public String toString() {
                return "\u2191";
            }
        };
    }

    public static <S> byo<S> d() {
        return new byo<S>(){

            @Override
            public boolean a(byk<S> $$0, bym $$1, bye $$2) {
                return true;
            }

            public String toString() {
                return "\u03b5";
            }
        };
    }

    public static <S> byo<S> a(final Object $$0) {
        return new byo<S>(){

            @Override
            public boolean a(byk<S> $$02, bym $$1, bye $$2) {
                $$02.b().a($$02.g(), $$0);
                return false;
            }

            public String toString() {
                return "fail";
            }
        };
    }

    public record c<S, T>(byc<T> a, T b) implements byo<S>
    {
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            $$1.a(this.a, this.b);
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;value", "a", "b"}, this, $$0);
        }
    }

    public record g<S>(byo<S>[] a) implements byo<S>
    {
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            int $$3 = $$0.g();
            for (byo<S> $$4 : this.a) {
                if ($$4.a($$0, $$1, $$2)) continue;
                $$0.a($$3);
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "elements", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "elements", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "elements", "a"}, this, $$0);
        }
    }

    public record a<S>(byo<S>[] a) implements byo<S>
    {
        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            bye $$3 = $$0.c();
            try {
                int $$4 = $$0.g();
                $$1.c();
                for (byo<S> $$5 : this.a) {
                    if ($$5.a($$0, $$1, $$3)) {
                        $$1.e();
                        boolean bl2 = true;
                        return bl2;
                    }
                    $$1.d();
                    $$0.a($$4);
                    if ($$3.b()) break;
                }
                $$1.b();
                boolean bl3 = false;
                return bl3;
            }
            finally {
                $$0.d();
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "elements", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "elements", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "elements", "a"}, this, $$0);
        }
    }

    public record d<S>(byo<S> a) implements byo<S>
    {
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            int $$3 = $$0.g();
            if (!this.a.a($$0, $$1, $$2)) {
                $$0.a($$3);
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "term", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "term", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "term", "a"}, this, $$0);
        }
    }

    public static final class e<S, T>
    extends Record
    implements byo<S> {
        private final byj<S, T> a;
        private final byc<List<T>> b;
        private final int c;

        public e(byj<S, T> $$0, byc<List<T>> $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            int $$5;
            int $$3 = $$0.g();
            ArrayList<T> $$4 = new ArrayList<T>(this.c);
            while (true) {
                $$5 = $$0.g();
                T $$6 = $$0.a(this.a);
                if ($$6 == null) break;
                $$4.add($$6);
            }
            $$0.a($$5);
            if ($$4.size() < this.c) {
                $$0.a($$3);
                return false;
            }
            $$1.a(this.b, $$4);
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "element;listName;minRepetitions", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "element;listName;minRepetitions", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "element;listName;minRepetitions", "a", "b", "c"}, this, $$0);
        }

        public byj<S, T> a() {
            return this.a;
        }

        public byc<List<T>> b() {
            return this.b;
        }

        public int e() {
            return this.c;
        }
    }

    public static final class f<S, T>
    extends Record
    implements byo<S> {
        private final byj<S, T> a;
        private final byc<List<T>> b;
        private final byo<S> c;
        private final int d;
        private final boolean e;

        public f(byj<S, T> $$0, byc<List<T>> $$1, byo<S> $$2, int $$3, boolean $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            int $$3 = $$0.g();
            ArrayList<T> $$4 = new ArrayList<T>(this.d);
            boolean $$5 = true;
            while (true) {
                int $$6 = $$0.g();
                if (!$$5 && !this.c.a($$0, $$1, $$2)) {
                    $$0.a($$6);
                    break;
                }
                int $$7 = $$0.g();
                T $$8 = $$0.a(this.a);
                if ($$8 == null) {
                    if ($$5) {
                        $$0.a($$7);
                        break;
                    }
                    if (this.e) {
                        $$0.a($$7);
                        break;
                    }
                    $$0.a($$3);
                    return false;
                }
                $$4.add($$8);
                $$5 = false;
            }
            if ($$4.size() < this.d) {
                $$0.a($$3);
                return false;
            }
            $$1.a(this.b, $$4);
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "element;listName;separator;minRepetitions;allowTrailingSeparator", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "element;listName;separator;minRepetitions;allowTrailingSeparator", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "element;listName;separator;minRepetitions;allowTrailingSeparator", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public byj<S, T> a() {
            return this.a;
        }

        public byc<List<T>> b() {
            return this.b;
        }

        public byo<S> e() {
            return this.c;
        }

        public int f() {
            return this.d;
        }

        public boolean g() {
            return this.e;
        }
    }

    public record b<S>(byo<S> a, boolean b) implements byo<S>
    {
        @Override
        public boolean a(byk<S> $$0, bym $$1, bye $$2) {
            int $$3 = $$0.g();
            boolean $$4 = this.a.a($$0.e(), $$1, $$2);
            $$0.a($$3);
            return this.b == $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "term;positive", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "term;positive", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "term;positive", "a", "b"}, this, $$0);
        }
    }
}

