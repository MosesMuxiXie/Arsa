/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.Map;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class hoa
extends Enum<hoa> {
    public static final /* enum */ hoa a = new hoa(new b(hoa$a.a, hoa$a.b, hoa$a.f), new b(hoa$a.a, hoa$a.b, hoa$a.c), new b(hoa$a.d, hoa$a.b, hoa$a.c), new b(hoa$a.d, hoa$a.b, hoa$a.f));
    public static final /* enum */ hoa b = new hoa(new b(hoa$a.a, hoa$a.e, hoa$a.c), new b(hoa$a.a, hoa$a.e, hoa$a.f), new b(hoa$a.d, hoa$a.e, hoa$a.f), new b(hoa$a.d, hoa$a.e, hoa$a.c));
    public static final /* enum */ hoa c = new hoa(new b(hoa$a.d, hoa$a.e, hoa$a.c), new b(hoa$a.d, hoa$a.b, hoa$a.c), new b(hoa$a.a, hoa$a.b, hoa$a.c), new b(hoa$a.a, hoa$a.e, hoa$a.c));
    public static final /* enum */ hoa d = new hoa(new b(hoa$a.a, hoa$a.e, hoa$a.f), new b(hoa$a.a, hoa$a.b, hoa$a.f), new b(hoa$a.d, hoa$a.b, hoa$a.f), new b(hoa$a.d, hoa$a.e, hoa$a.f));
    public static final /* enum */ hoa e = new hoa(new b(hoa$a.a, hoa$a.e, hoa$a.c), new b(hoa$a.a, hoa$a.b, hoa$a.c), new b(hoa$a.a, hoa$a.b, hoa$a.f), new b(hoa$a.a, hoa$a.e, hoa$a.f));
    public static final /* enum */ hoa f = new hoa(new b(hoa$a.d, hoa$a.e, hoa$a.f), new b(hoa$a.d, hoa$a.b, hoa$a.f), new b(hoa$a.d, hoa$a.b, hoa$a.c), new b(hoa$a.d, hoa$a.e, hoa$a.c));
    private static final Map<iz, hoa> g;
    private final b[] h;
    private static final /* synthetic */ hoa[] i;

    public static hoa[] values() {
        return (hoa[])i.clone();
    }

    public static hoa valueOf(String $$0) {
        return Enum.valueOf(hoa.class, $$0);
    }

    public static hoa a(iz $$0) {
        return g.get($$0);
    }

    private hoa(b ... $$0) {
        this.h = $$0;
    }

    public b a(int $$0) {
        return this.h[$$0];
    }

    private static /* synthetic */ hoa[] a() {
        return new hoa[]{a, b, c, d, e, f};
    }

    static {
        i = hoa.a();
        g = bhs.a(new EnumMap(iz.class), $$0 -> {
            $$0.put(iz.a, a);
            $$0.put(iz.b, b);
            $$0.put(iz.c, c);
            $$0.put(iz.d, d);
            $$0.put(iz.e, e);
            $$0.put(iz.f, f);
        });
    }

    public record b(a a, a b, a c) {
        public Vector3f a(Vector3fc $$0, Vector3fc $$1) {
            return new Vector3f(this.a.a($$0, $$1), this.b.a($$0, $$1), this.c.a($$0, $$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "xFace;yFace;zFace", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "xFace;yFace;zFace", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "xFace;yFace;zFace", "a", "b", "c"}, this, $$0);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public float a(Vector3fc $$0, Vector3fc $$1) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.x();
                case 1 -> $$0.y();
                case 2 -> $$0.z();
                case 3 -> $$1.x();
                case 4 -> $$1.y();
                case 5 -> $$1.z();
            };
        }

        public float a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0;
                case 1 -> $$1;
                case 2 -> $$2;
                case 3 -> $$3;
                case 4 -> $$4;
                case 5 -> $$5;
            };
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            g = hoa$a.a();
        }
    }
}

