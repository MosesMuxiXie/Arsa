/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public class fzq {
    public static fzp a() {
        throw new IllegalArgumentException();
    }

    public static fzp a(fzp $$0) {
        return $$0;
    }

    public static fzp a(fzp $$0, fzp $$1) {
        return new a($$0, $$1);
    }

    public static fzp a(fzp ... $$0) {
        return new b($$0);
    }

    static class a
    implements fzp {
        private final fzp a;
        private final fzp b;

        public a(fzp $$0, fzp $$1) {
            if ($$0 == $$1) {
                throw new IllegalArgumentException("Duplicate delegates");
            }
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public fzp a(float $$0, float $$1, float $$2) {
            this.a.a($$0, $$1, $$2);
            this.b.a($$0, $$1, $$2);
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1, int $$2, int $$3) {
            this.a.a($$0, $$1, $$2, $$3);
            this.b.a($$0, $$1, $$2, $$3);
            return this;
        }

        @Override
        public fzp a(int $$0) {
            this.a.a($$0);
            this.b.a($$0);
            return this;
        }

        @Override
        public fzp a(float $$0, float $$1) {
            this.a.a($$0, $$1);
            this.b.a($$0, $$1);
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1) {
            this.a.a($$0, $$1);
            this.b.a($$0, $$1);
            return this;
        }

        @Override
        public fzp b(int $$0, int $$1) {
            this.a.b($$0, $$1);
            this.b.b($$0, $$1);
            return this;
        }

        @Override
        public fzp b(float $$0, float $$1, float $$2) {
            this.a.b($$0, $$1, $$2);
            this.b.b($$0, $$1, $$2);
            return this;
        }

        @Override
        public fzp a(float $$0) {
            this.a.a($$0);
            this.b.a($$0);
            return this;
        }

        @Override
        public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
            this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
            this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
        }
    }

    record b(fzp[] a) implements fzp
    {
        b {
            for (int $$1 = 0; $$1 < $$0.length; ++$$1) {
                for (int $$2 = $$1 + 1; $$2 < $$0.length; ++$$2) {
                    if ($$0[$$1] != $$0[$$2]) continue;
                    throw new IllegalArgumentException("Duplicate delegates");
                }
            }
        }

        private void a(Consumer<fzp> $$0) {
            for (fzp $$1 : this.a) {
                $$0.accept($$1);
            }
        }

        @Override
        public fzp a(float $$0, float $$1, float $$2) {
            this.a((fzp $$3) -> $$3.a($$0, $$1, $$2));
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1, int $$2, int $$3) {
            this.a((fzp $$4) -> $$4.a($$0, $$1, $$2, $$3));
            return this;
        }

        @Override
        public fzp a(int $$0) {
            this.a((fzp $$1) -> $$1.a($$0));
            return this;
        }

        @Override
        public fzp a(float $$0, float $$1) {
            this.a((fzp $$2) -> $$2.a($$0, $$1));
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1) {
            this.a((fzp $$2) -> $$2.a($$0, $$1));
            return this;
        }

        @Override
        public fzp b(int $$0, int $$1) {
            this.a((fzp $$2) -> $$2.b($$0, $$1));
            return this;
        }

        @Override
        public fzp b(float $$0, float $$1, float $$2) {
            this.a((fzp $$3) -> $$3.b($$0, $$1, $$2));
            return this;
        }

        @Override
        public fzp a(float $$0) {
            this.a((fzp $$1) -> $$1.a($$0));
            return this;
        }

        @Override
        public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
            this.a((fzp $$11) -> $$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "delegates", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "delegates", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "delegates", "a"}, this, $$0);
        }
    }
}

