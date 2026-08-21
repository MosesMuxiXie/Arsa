/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3fc;

public record hqa(Vector3fc b, Vector3fc c, Vector3fc d, Vector3fc e, long f, long g, long h, long i, int j, iz k, ilp l, boolean m, int n) {
    public static final int a = 4;

    public boolean a() {
        return this.j != -1;
    }

    public Vector3fc a(int $$0) {
        return switch ($$0) {
            case 0 -> this.b;
            case 1 -> this.c;
            case 2 -> this.d;
            case 3 -> this.e;
            default -> throw new IndexOutOfBoundsException($$0);
        };
    }

    public long b(int $$0) {
        return switch ($$0) {
            case 0 -> this.f;
            case 1 -> this.g;
            case 2 -> this.h;
            case 3 -> this.i;
            default -> throw new IndexOutOfBoundsException($$0);
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqa.class, "position0;position1;position2;position3;packedUV0;packedUV1;packedUV2;packedUV3;tintIndex;direction;sprite;shade;lightEmission", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqa.class, "position0;position1;position2;position3;packedUV0;packedUV1;packedUV2;packedUV3;tintIndex;direction;sprite;shade;lightEmission", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqa.class, "position0;position1;position2;position3;packedUV0;packedUV1;packedUV2;packedUV3;tintIndex;direction;sprite;shade;lightEmission", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this, $$0);
    }
}

