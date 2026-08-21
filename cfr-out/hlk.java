/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class hlk
extends hlt<hlj> {
    public hlk(hls $$0) {
        super($$0);
    }

    @Override
    public iks a(htx $$0, ger $$1, float $$22) {
        return new b(this.b.stream().map($$2 -> hlk$a.a($$2, $$1, $$22)).toList());
    }

    record b(List<a> a) implements iks
    {
        @Override
        public void submit(hpo $$0, ikp $$1) {
            fzm $$2 = new fzm();
            hwo $$3 = gfj.V().ay();
            for (a $$4 : this.a) {
                $$3.a($$4.a, $$1, $$4.b, $$4.c, $$4.d, $$2, $$0);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "instances", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "instances", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "instances", "a"}, this, $$0);
        }
    }

    static final class a
    extends Record {
        final idf a;
        final double b;
        final double c;
        final double d;

        private a(idf $$0, double $$1, double $$2, double $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public static a a(hlj $$0, ger $$1, float $$2) {
            float $$3 = ((float)$$0.b + $$2) / 3.0f;
            $$3 *= $$3;
            double $$4 = bgj.d((double)$$2, $$0.g, $$0.d);
            double $$5 = bgj.d((double)$$2, $$0.h, $$0.e);
            double $$6 = bgj.d((double)$$2, $$0.i, $$0.f);
            double $$7 = bgj.d((double)$$3, $$0.c.I, $$4);
            double $$8 = bgj.d((double)$$3, $$0.c.J, $$5);
            double $$9 = bgj.d((double)$$3, $$0.c.K, $$6);
            ftm $$10 = $$1.b();
            return new a($$0.c, $$7 - $$10.a(), $$8 - $$10.b(), $$9 - $$10.c());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "itemRenderState;xOffset;yOffset;zOffset", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "itemRenderState;xOffset;yOffset;zOffset", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "itemRenderState;xOffset;yOffset;zOffset", "a", "b", "c", "d"}, this, $$0);
        }

        public idf a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }

        public double c() {
            return this.c;
        }

        public double d() {
            return this.d;
        }
    }
}

