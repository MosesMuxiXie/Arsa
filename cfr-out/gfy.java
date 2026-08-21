/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record gfy(c a, gga[] b) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gfy.class, "target;keyframes", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gfy.class, "target;keyframes", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gfy.class, "target;keyframes", "a", "b"}, this, $$0);
    }

    public static interface c {
        public void apply(hdg var1, Vector3f var2);
    }

    public static class b {
        public static final a a = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            Vector3fc $$6 = $$2[$$3].c();
            Vector3fc $$7 = $$2[$$4].b();
            return $$6.lerp($$7, $$1, $$0).mul($$5);
        };
        public static final a b = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            Vector3fc $$6 = $$2[Math.max(0, $$3 - 1)].c();
            Vector3fc $$7 = $$2[$$3].c();
            Vector3fc $$8 = $$2[$$4].c();
            Vector3fc $$9 = $$2[Math.min($$2.length - 1, $$4 + 1)].c();
            $$0.set(bgj.a($$1, $$6.x(), $$7.x(), $$8.x(), $$9.x()) * $$5, bgj.a($$1, $$6.y(), $$7.y(), $$8.y(), $$9.y()) * $$5, bgj.a($$1, $$6.z(), $$7.z(), $$8.z(), $$9.z()) * $$5);
            return $$0;
        };
    }

    public static class d {
        public static final c a = hdg::a;
        public static final c b = hdg::b;
        public static final c c = hdg::c;
    }

    public static interface a {
        public Vector3f apply(Vector3f var1, float var2, gga[] var3, int var4, int var5, float var6);
    }
}

