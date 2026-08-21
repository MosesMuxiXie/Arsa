/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class hmd
extends hmg {
    private final hmo a;

    hmd(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7.a());
        this.C = 0.96f;
        this.a = $$7;
        this.d(1.0f);
        this.u = false;
        this.a($$7);
    }

    @Override
    public int a(float $$0) {
        return 240;
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
    }

    public record a(hmo a) implements hlu<md>
    {
        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmd $$9 = new hmd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.e(1.0f);
            $$9.b($$5, $$6, $$7);
            $$9.a($$8.a(4) + 6);
            return $$9;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sprite", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sprite", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sprite", "a"}, this, $$0);
        }
    }
}

