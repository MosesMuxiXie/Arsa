/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.joml.Quaternionfc;

public class hkt
extends hlt<hks> {
    public hkt(hls $$0) {
        super($$0);
    }

    @Override
    public iks a(htx $$0, ger $$1, float $$22) {
        return new b(this.b.stream().map($$2 -> hkt$a.a($$2, $$1, $$22)).toList());
    }

    record b(List<a> a) implements iks
    {
        @Override
        public void submit(hpo $$0, ikp $$1) {
            for (a $$2 : this.a) {
                $$0.a($$2.a, bhr.a, $$2.b, $$2.c, 0xF000F0, ilg.d, $$2.d, null, 0, null);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "states", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "states", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "states", "a"}, this, $$0);
        }
    }

    static final class a
    extends Record {
        final gzp<bhr> a;
        final fzm b;
        final ijs c;
        final int d;

        private a(gzp<bhr> $$0, fzm $$1, ijs $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public static a a(hks $$0, ger $$1, float $$2) {
            float $$3 = ((float)$$0.z + $$2) / (float)$$0.A;
            float $$4 = 0.05f + 0.5f * bgj.a((double)($$3 * (float)Math.PI));
            int $$5 = bel.a($$4, 1.0f, 1.0f, 1.0f);
            fzm $$6 = new fzm();
            $$6.a();
            $$6.a((Quaternionfc)$$1.g());
            $$6.a((Quaternionfc)a.b.rotationDegrees(60.0f - 150.0f * $$3));
            float $$7 = 0.42553192f;
            $$6.b(0.42553192f, -0.42553192f, -0.42553192f);
            $$6.a(0.0f, -0.56f, 3.5f);
            return new a($$0.a, $$6, $$0.b, $$5);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "model;poseStack;renderType;color", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "model;poseStack;renderType;color", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "model;poseStack;renderType;color", "a", "b", "c", "d"}, this, $$0);
        }

        public gzp<bhr> a() {
            return this.a;
        }

        public fzm b() {
            return this.b;
        }

        public ijs c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }
}

