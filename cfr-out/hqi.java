/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.joml.GeometryUtils
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import org.joml.GeometryUtils;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hqi {
    private static final Vector3fc a = new Vector3f(0.5f, 0.5f, 0.5f);

    @VisibleForTesting
    static hqc.b a(Vector3fc $$0, Vector3fc $$1, iz $$2) {
        return switch ($$2) {
            default -> throw new MatchException(null, null);
            case iz.a -> new hqc.b($$0.x(), 16.0f - $$1.z(), $$1.x(), 16.0f - $$0.z());
            case iz.b -> new hqc.b($$0.x(), $$0.z(), $$1.x(), $$1.z());
            case iz.c -> new hqc.b(16.0f - $$1.x(), 16.0f - $$1.y(), 16.0f - $$0.x(), 16.0f - $$0.y());
            case iz.d -> new hqc.b($$0.x(), 16.0f - $$1.y(), $$1.x(), 16.0f - $$0.y());
            case iz.e -> new hqc.b($$0.z(), 16.0f - $$1.y(), $$1.z(), 16.0f - $$0.y());
            case iz.f -> new hqc.b(16.0f - $$1.z(), 16.0f - $$1.y(), 16.0f - $$0.z(), 16.0f - $$0.y());
        };
    }

    public static hqa a(inw.a $$0, Vector3fc $$1, Vector3fc $$2, hqc $$3, ilp $$4, iz $$5, ioc $$6, @Nullable hqd $$7, boolean $$8, int $$9) {
        hqc.b $$10 = $$3.d();
        if ($$10 == null) {
            $$10 = hqi.a($$1, $$2, $$5);
        }
        Matrix4fc $$11 = $$6.b($$5);
        Vector3fc[] $$12 = new Vector3fc[4];
        long[] $$13 = new long[4];
        hoa $$14 = hoa.a($$5);
        for (int $$15 = 0; $$15 < 4; ++$$15) {
            hqi.a($$15, $$14, $$10, $$3.e(), $$11, $$1, $$2, $$4, $$6.a(), $$7, $$12, $$13, $$0);
        }
        iz $$16 = hqi.a($$12);
        if ($$7 == null && $$16 != null) {
            hqi.a($$12, $$13, $$16);
        }
        return new hqa($$12[0], $$12[1], $$12[2], $$12[3], $$13[0], $$13[1], $$13[2], $$13[3], $$3.b(), Objects.requireNonNullElse($$16, iz.b), $$4, $$8, $$9);
    }

    private static void a(int $$0, hoa $$1, hqc.b $$2, g $$3, Matrix4fc $$4, Vector3fc $$5, Vector3fc $$6, ilp $$7, i $$8, @Nullable hqd $$9, Vector3fc[] $$10, long[] $$11, inw.a $$12) {
        float $$21;
        float $$20;
        hoa.b $$13 = $$1.a($$0);
        Vector3f $$14 = $$13.a($$5, $$6).div(16.0f);
        if ($$9 != null) {
            hqi.a($$14, $$9.a(), $$9.d());
        }
        if ($$8 != i.a()) {
            hqi.a($$14, a, $$8.c());
        }
        float $$15 = hqc.a($$2, $$3, $$0);
        float $$16 = hqc.b($$2, $$3, $$0);
        if (e.a($$4)) {
            float $$17 = $$15;
            float $$18 = $$16;
        } else {
            Vector3f $$19 = $$4.transformPosition(new Vector3f(hqi.a($$15), hqi.a($$16), 0.0f));
            $$20 = hqi.b($$19.x);
            $$21 = hqi.b($$19.y);
        }
        $$10[$$0] = $$12.a((Vector3fc)$$14);
        $$11[$$0] = hdr.a($$7.a($$20), $$7.b($$21));
    }

    private static float a(float $$0) {
        return $$0 - 0.5f;
    }

    private static float b(float $$0) {
        return $$0 + 0.5f;
    }

    private static void a(Vector3f $$0, Vector3fc $$1, Matrix4fc $$2) {
        $$0.sub($$1);
        $$2.transformPosition($$0);
        $$0.add($$1);
    }

    private static @Nullable iz a(Vector3fc[] $$0) {
        Vector3f $$1 = new Vector3f();
        GeometryUtils.normal((Vector3fc)$$0[0], (Vector3fc)$$0[1], (Vector3fc)$$0[2], (Vector3f)$$1);
        return hqi.a($$1);
    }

    private static @Nullable iz a(Vector3f $$0) {
        if (!$$0.isFinite()) {
            return null;
        }
        iz $$1 = null;
        float $$2 = 0.0f;
        for (iz $$3 : iz.values()) {
            float $$4 = $$0.dot($$3.s());
            if (!($$4 >= 0.0f) || !($$4 > $$2)) continue;
            $$2 = $$4;
            $$1 = $$3;
        }
        return $$1;
    }

    private static void a(Vector3fc[] $$0, long[] $$1, iz $$2) {
        float $$3 = 999.0f;
        float $$4 = 999.0f;
        float $$5 = 999.0f;
        float $$6 = -999.0f;
        float $$7 = -999.0f;
        float $$8 = -999.0f;
        for (int $$9 = 0; $$9 < 4; ++$$9) {
            Vector3fc $$10 = $$0[$$9];
            float $$11 = $$10.x();
            float $$12 = $$10.y();
            float $$13 = $$10.z();
            if ($$11 < $$3) {
                $$3 = $$11;
            }
            if ($$12 < $$4) {
                $$4 = $$12;
            }
            if ($$13 < $$5) {
                $$5 = $$13;
            }
            if ($$11 > $$6) {
                $$6 = $$11;
            }
            if ($$12 > $$7) {
                $$7 = $$12;
            }
            if (!($$13 > $$8)) continue;
            $$8 = $$13;
        }
        hoa $$14 = hoa.a($$2);
        for (int $$15 = 0; $$15 < 4; ++$$15) {
            float $$19;
            float $$18;
            hoa.b $$16 = $$14.a($$15);
            float $$17 = $$16.a().a($$3, $$4, $$5, $$6, $$7, $$8);
            int $$20 = hqi.a($$0, $$15, $$17, $$18 = $$16.b().a($$3, $$4, $$5, $$6, $$7, $$8), $$19 = $$16.c().a($$3, $$4, $$5, $$6, $$7, $$8));
            if ($$20 == -1) {
                throw new IllegalStateException("Can't find vertex to swap");
            }
            if ($$20 == $$15) continue;
            hqi.a($$0, $$20, $$15);
            hqi.a($$1, $$20, $$15);
        }
    }

    private static int a(Vector3fc[] $$0, int $$1, float $$2, float $$3, float $$4) {
        for (int $$5 = $$1; $$5 < 4; ++$$5) {
            Vector3fc $$6 = $$0[$$5];
            if ($$2 != $$6.x() || $$3 != $$6.y() || $$4 != $$6.z()) continue;
            return $$5;
        }
        return -1;
    }

    private static void a(Vector3fc[] $$0, int $$1, int $$2) {
        Vector3fc $$3 = $$0[$$1];
        $$0[$$1] = $$0[$$2];
        $$0[$$2] = $$3;
    }

    private static void a(long[] $$0, int $$1, int $$2) {
        long $$3 = $$0[$$1];
        $$0[$$1] = $$0[$$2];
        $$0[$$2] = $$3;
    }
}

