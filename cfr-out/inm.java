/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class inm
implements ioc {
    private static final Map<f, inm> c = bhs.a(f.class, inm::new);
    public static final inm a = inm.a(f.a);
    final f d;
    final i e;
    final Map<iz, Matrix4fc> f = new EnumMap<iz, Matrix4fc>(iz.class);
    final Map<iz, Matrix4fc> g = new EnumMap<iz, Matrix4fc>(iz.class);
    private final a h = new a(this);

    private inm(f $$0) {
        this.d = $$0;
        this.e = $$0 != f.a ? new i((Matrix4fc)new Matrix4f($$0.b())) : i.a();
        for (iz $$1 : iz.values()) {
            Matrix4fc $$2 = ir.a(this.e, $$1).c();
            this.f.put($$1, $$2);
            this.g.put($$1, (Matrix4fc)$$2.invertAffine(new Matrix4f()));
        }
    }

    @Override
    public i a() {
        return this.e;
    }

    public static inm a(f $$0) {
        return c.get($$0);
    }

    public ioc b() {
        return this.h;
    }

    public String toString() {
        return "simple[" + this.d.c() + "]";
    }

    record a(inm a) implements ioc
    {
        private final inm a;

        @Override
        public i a() {
            return this.a.e;
        }

        @Override
        public Matrix4fc a(iz $$0) {
            return this.a.f.getOrDefault($$0, b);
        }

        @Override
        public Matrix4fc b(iz $$0) {
            return this.a.g.getOrDefault($$0, b);
        }

        @Override
        public String toString() {
            return "uvLocked[" + this.a.d.c() + "]";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "parent", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "parent", "a"}, this, $$0);
        }

        public inm b() {
            return this.a;
        }
    }
}

