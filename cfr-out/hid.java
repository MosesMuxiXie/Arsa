/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public class hid {
    private static final int a = 512;
    private final List<a> b = new ArrayList<a>();

    public void a(ftm $$0, float $$1, int $$2, cbn<lt> $$3) {
        if (!$$3.c()) {
            this.b.add(new a($$0, $$1, $$2, $$3));
        }
    }

    public void a(hif $$0) {
        if (gfj.V().k.aJ().b() != awx.a) {
            this.b.clear();
            return;
        }
        int $$12 = cbo.a(this.b, a::c);
        int $$2 = Math.min($$12, 512);
        for (int $$3 = 0; $$3 < $$2; ++$$3) {
            cbo.a($$0.G_(), this.b, $$12, a::c).ifPresent($$1 -> this.a($$0, (a)$$1));
        }
        this.b.clear();
    }

    private void a(hif $$0, a $$1) {
        float $$5;
        ftm $$4;
        ftm $$6;
        bgr $$2 = $$0.G_();
        ftm $$3 = $$1.a();
        ftm $$7 = $$3.e($$6 = ($$4 = new ftm($$2.i() * 2.0f - 1.0f, $$2.i() * 2.0f - 1.0f, $$2.i() * 2.0f - 1.0f).d()).c((double)($$5 = (float)Math.cbrt($$2.i()) * $$1.b())));
        if (!$$0.a_(is.a($$7)).l()) {
            return;
        }
        float $$8 = 0.5f / ($$5 / $$1.b() + 0.1f) * $$2.i() * $$2.i() + 0.3f;
        lt $$9 = $$1.d.b($$2);
        ftm $$10 = $$3.e($$6.c((double)$$9.b()));
        ftm $$11 = $$4.c((double)($$8 * $$9.c()));
        $$0.a($$9.a(), $$10.a(), $$10.b(), $$10.c(), $$11.a(), $$11.b(), $$11.c());
    }

    static final class a
    extends Record {
        private final ftm a;
        private final float b;
        private final int c;
        final cbn<lt> d;

        a(ftm $$0, float $$1, int $$2, cbn<lt> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "center;radius;blockCount;blockParticles", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "center;radius;blockCount;blockParticles", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "center;radius;blockCount;blockParticles", "a", "b", "c", "d"}, this, $$0);
        }

        public ftm a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public cbn<lt> d() {
            return this.d;
        }
    }
}

