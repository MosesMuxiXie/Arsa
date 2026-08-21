/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public class hoq
implements hon {
    private final hon.a a = hon.a(new fzi(1536));
    private int b = -1;

    @Override
    public fzp a(ijs $$0) {
        if ($$0.e()) {
            fzp $$1 = this.a.a($$0);
            return new a($$1, this.b);
        }
        Optional<ijs> $$2 = $$0.d();
        if ($$2.isPresent()) {
            fzp $$3 = this.a.a($$2.get());
            return new a($$3, this.b);
        }
        throw new IllegalStateException("Can't render an outline for this rendertype!");
    }

    public void a(int $$0) {
        this.b = $$0;
    }

    public void a() {
        this.a.b();
    }

    record a(fzp a, int b) implements fzp
    {
        @Override
        public fzp a(float $$0, float $$1, float $$2) {
            this.a.a($$0, $$1, $$2).a(this.b);
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1, int $$2, int $$3) {
            return this;
        }

        @Override
        public fzp a(int $$0) {
            return this;
        }

        @Override
        public fzp a(float $$0, float $$1) {
            this.a.a($$0, $$1);
            return this;
        }

        @Override
        public fzp a(int $$0, int $$1) {
            return this;
        }

        @Override
        public fzp b(int $$0, int $$1) {
            return this;
        }

        @Override
        public fzp b(float $$0, float $$1, float $$2) {
            return this;
        }

        @Override
        public fzp a(float $$0) {
            return this;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "delegate;color", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "delegate;color", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "delegate;color", "a", "b"}, this, $$0);
        }
    }
}

