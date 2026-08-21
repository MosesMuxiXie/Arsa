/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 */
import java.util.Arrays;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3f;
import org.joml.Vector3i;

public final class h
extends Enum<h> {
    public static final /* enum */ h a = new h(0, 1, 2);
    public static final /* enum */ h b = new h(1, 0, 2);
    public static final /* enum */ h c = new h(0, 2, 1);
    public static final /* enum */ h d = new h(2, 0, 1);
    public static final /* enum */ h e = new h(1, 2, 0);
    public static final /* enum */ h f = new h(2, 1, 0);
    private final int g;
    private final int h;
    private final int i;
    private final Matrix3fc j;
    private static final h[][] k;
    private static final h[] l;
    private static final /* synthetic */ h[] m;

    public static h[] values() {
        return (h[])m.clone();
    }

    public static h valueOf(String $$0) {
        return Enum.valueOf(h.class, $$0);
    }

    private h(int $$0, int $$1, int $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = new Matrix3f().zero().set(this.a(0), 0, 1.0f).set(this.a(1), 1, 1.0f).set(this.a(2), 2, 1.0f);
    }

    public h a(h $$0) {
        return k[this.ordinal()][$$0.ordinal()];
    }

    public h a() {
        return l[this.ordinal()];
    }

    public int a(int $$0) {
        return switch ($$0) {
            case 0 -> this.g;
            case 1 -> this.h;
            case 2 -> this.i;
            default -> throw new IllegalArgumentException("Must be 0, 1 or 2, but got " + $$0);
        };
    }

    public iz.a a(iz.a $$0) {
        return iz.a.d[this.a($$0.ordinal())];
    }

    public Vector3f a(Vector3f $$0) {
        float $$1 = $$0.get(this.g);
        float $$2 = $$0.get(this.h);
        float $$3 = $$0.get(this.i);
        return $$0.set($$1, $$2, $$3);
    }

    public Vector3i a(Vector3i $$0) {
        int $$1 = $$0.get(this.g);
        int $$2 = $$0.get(this.h);
        int $$3 = $$0.get(this.i);
        return $$0.set($$1, $$2, $$3);
    }

    public Matrix3fc b() {
        return this.j;
    }

    private static /* synthetic */ h[] e() {
        return new h[]{a, b, c, d, e, f};
    }

    static {
        m = h.e();
        k = bhs.a(() -> {
            h[] $$0 = h.values();
            h[][] $$1 = new h[$$0.length][$$0.length];
            for (h $$2 : $$0) {
                for (h $$32 : $$0) {
                    h $$7;
                    int $$4 = $$2.a($$32.g);
                    int $$5 = $$2.a($$32.h);
                    int $$6 = $$2.a($$32.i);
                    $$1[$$2.ordinal()][$$32.ordinal()] = $$7 = Arrays.stream($$0).filter($$3 -> $$3.g == $$4 && $$3.h == $$5 && $$3.i == $$6).findFirst().get();
                }
            }
            return $$1;
        });
        l = bhs.a(() -> {
            h[] $$02 = h.values();
            return (h[])Arrays.stream($$02).map($$0 -> Arrays.stream(h.values()).filter($$1 -> $$0.a((h)((Object)((Object)((Object)$$1)))) == a).findAny().get()).toArray(h[]::new);
        });
    }
}

