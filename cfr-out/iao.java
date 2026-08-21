/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import org.joml.Quaternionfc;

public class iao<S extends ieh, M extends gzm<S>>
extends ibj<S, M> {
    private static final float a = 0.625f;
    private static final float b = 1.1875f;
    private final a c;
    private final Function<ehh.a, hhm> d;
    private final hou e;

    public iao(hyq<S, M> $$0, hdc $$1, hou $$2) {
        this($$0, $$1, $$2, iao$a.a);
    }

    public iao(hyq<S, M> $$0, hdc $$12, hou $$2, a $$3) {
        super($$0);
        this.c = $$3;
        this.d = bhs.b($$1 -> hsa.a($$12, $$1));
        this.e = $$2;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        if (((ieh)$$3).aL.e() && ((ieh)$$3).aN == null) {
            return;
        }
        $$0.a();
        $$0.b(this.c.c(), 1.0f, this.c.c());
        Object $$6 = this.d();
        ((gzp)$$6).b().a($$0);
        ((gzn)$$6).a($$0);
        if (((ieh)$$3).aN != null) {
            $$0.a(0.0f, this.c.b(), 0.0f);
            $$0.b(1.1875f, -1.1875f, -1.1875f);
            $$0.a(-0.5, 0.0, -0.5);
            ehh.a $$7 = ((ieh)$$3).aN;
            hhm $$8 = this.d.apply($$7);
            ijs $$9 = this.a((ieh)$$3, $$7);
            hsa.a(null, 180.0f, ((ieh)$$3).aM, $$0, $$1, $$2, $$8, $$9, ((ieh)$$3).U, null);
        } else {
            iao.a($$0, this.c);
            ((ieh)$$3).aL.a($$0, $$1, $$2, ilg.d, ((ieh)$$3).U);
        }
        $$0.b();
    }

    private ijs a(ieh $$0, ehh.a $$1) {
        doy $$2;
        if ($$1 == ehh.b.e && ($$2 = $$0.aO) != null) {
            return this.e.a($$2).c();
        }
        return hsa.a($$1, null);
    }

    public static void a(fzm $$0, a $$1) {
        $$0.a(0.0f, -0.25f + $$1.a(), 0.0f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        $$0.b(0.625f, -0.625f, -0.625f);
    }

    public static final class a
    extends Record {
        private final float b;
        private final float c;
        private final float d;
        public static final a a = new a(0.0f, 0.0f, 1.0f);

        public a(float $$0, float $$1, float $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "yOffset;skullYOffset;horizontalScale", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "yOffset;skullYOffset;horizontalScale", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "yOffset;skullYOffset;horizontalScale", "b", "c", "d"}, this, $$0);
        }

        public float a() {
            return this.b;
        }

        public float b() {
            return this.c;
        }

        public float c() {
            return this.d;
        }
    }
}

