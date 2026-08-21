/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class ioj
implements hqh {
    private final cbn<hqh> a;
    private final ilp b;

    public ioj(cbn<hqh> $$0) {
        this.a = $$0;
        hqh $$1 = $$0.d().getFirst().a();
        this.b = $$1.a();
    }

    @Override
    public ilp a() {
        return this.b;
    }

    @Override
    public void a(bgr $$0, List<hqg> $$1) {
        this.a.b($$0).a($$0, $$1);
    }

    public static final class a
    extends Record
    implements hqh.b {
        private final cbn<hqh.b> d;

        public a(cbn<hqh.b> $$0) {
            this.d = $$0;
        }

        @Override
        public hqh a(inw $$0) {
            return new ioj(this.d.a((E $$1) -> $$1.a($$0)));
        }

        @Override
        public void a(ioe.a $$0) {
            this.d.d().forEach($$1 -> ((hqh.b)$$1.a()).a($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entries", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entries", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entries", "d"}, this, $$0);
        }

        public cbn<hqh.b> b() {
            return this.d;
        }
    }
}

