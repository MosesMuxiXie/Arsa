/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

class gyg {
    private static final int a = 44;
    private final List<c> b;
    private final gov c;

    gyg(List<c> $$0, gov $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public gov a() {
        return this.c;
    }

    public void b() {
        this.b.forEach(c::a);
    }

    public static a a(int $$0) {
        return new a($$0);
    }

    public static class a {
        final int a;
        private final List<d> b = new ArrayList<d>();
        int c;
        int d = 4;
        int e;
        Optional<b> f = Optional.empty();

        public a(int $$0) {
            this.a = $$0;
        }

        void b() {
            ++this.e;
        }

        public d a(yh $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
            d $$3 = new d($$0, $$1, $$2, 44);
            this.b.add($$3);
            return $$3;
        }

        public a a(int $$0) {
            this.c = $$0;
            return this;
        }

        public a b(int $$0) {
            this.d = $$0;
            return this;
        }

        public gyg a() {
            got $$0 = new got().b(this.d);
            $$0.a(goz.a(this.a - 44), 0, 0);
            $$0.a(goz.a(44), 0, 1);
            ArrayList<c> $$1 = new ArrayList<c>();
            this.e = 0;
            for (d $$2 : this.b) {
                $$1.add($$2.a(this, $$0, 0));
            }
            $$0.a();
            gyg $$3 = new gyg($$1, $$0);
            $$3.b();
            return $$3;
        }

        public a a(int $$0, boolean $$1) {
            this.f = Optional.of(new b($$0, $$1));
            return this;
        }
    }

    static final class b
    extends Record {
        final int a;
        final boolean b;

        b(int $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    record c(gjl<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
        private final gjl<Boolean> a;
        private final BooleanSupplier b;
        private final @Nullable BooleanSupplier c;

        public void a() {
            this.a.a(this.b.getAsBoolean());
            if (this.c != null) {
                this.a.k = this.c.getAsBoolean();
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this, $$0);
        }

        public gjl<Boolean> b() {
            return this.a;
        }

        public BooleanSupplier c() {
            return this.b;
        }

        public @Nullable BooleanSupplier d() {
            return this.c;
        }
    }

    public static class d {
        private final yh a;
        private final BooleanSupplier b;
        private final Consumer<Boolean> c;
        private @Nullable yh d;
        private @Nullable BooleanSupplier e;
        private final int f;

        d(yh $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.f = $$3;
        }

        public d a(BooleanSupplier $$0) {
            this.e = $$0;
            return this;
        }

        public d a(yh $$0) {
            this.d = $$0;
            return this;
        }

        c a(a $$02, got $$12, int $$2) {
            boolean $$6;
            $$02.b();
            gko $$32 = new gko(this.a, gfj.V().g);
            $$12.a($$32, $$02.e, $$2, $$12.b().a(0.0f, 0.5f).b($$02.c));
            Optional<b> $$4 = $$02.f;
            gjl.a<Boolean> $$5 = gjl.a(this.b.getAsBoolean());
            $$5.a();
            boolean bl2 = $$6 = this.d != null && $$4.isEmpty();
            if ($$6) {
                gks $$7 = gks.a(this.d);
                $$5.a((T $$1) -> $$7);
            }
            if (this.d != null && !$$6) {
                $$5.a((gjl<T> $$0) -> yg.a(this.a, $$0.c(), this.d));
            } else {
                $$5.a((gjl<T> $$0) -> yg.a(new yh[]{this.a, $$0.c()}));
            }
            gjl<Boolean> $$8 = $$5.a(0, 0, this.f, 20, yh.i(), ($$0, $$1) -> this.c.accept((Boolean)$$1));
            if (this.e != null) {
                $$8.k = this.e.getAsBoolean();
            }
            $$12.a($$8, $$02.e, $$2 + 1, $$12.b().c());
            if (this.d != null) {
                $$4.ifPresent($$3 -> {
                    yw $$4 = this.d.f().a(l.h);
                    gio $$5 = gfj.V().g;
                    gjz $$6 = new gjz($$4, $$5);
                    $$6.a($$0.a - $$0.c - this.f);
                    $$6.b($$3.a());
                    $$02.b();
                    int $$7 = $$3.b ? $$5.b * $$3.a - $$6.aR_() : 0;
                    $$12.a($$6, $$0.e, $$2, $$12.b().c(-$$0.d).e($$7));
                });
            }
            return new c($$8, this.b, this.e);
        }
    }
}

