/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Vector3i
 *  org.jspecify.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3i;
import org.jspecify.annotations.Nullable;

public final class f
extends Enum<f>
implements bhh {
    public static final /* enum */ f a = new f("identity", h.a, false, false, false);
    public static final /* enum */ f b = new f("rot_180_face_xy", h.a, true, true, false);
    public static final /* enum */ f c = new f("rot_180_face_xz", h.a, true, false, true);
    public static final /* enum */ f d = new f("rot_180_face_yz", h.a, false, true, true);
    public static final /* enum */ f e = new f("rot_120_nnn", h.e, false, false, false);
    public static final /* enum */ f f = new f("rot_120_nnp", h.d, true, false, true);
    public static final /* enum */ f g = new f("rot_120_npn", h.d, false, true, true);
    public static final /* enum */ f h = new f("rot_120_npp", h.e, true, false, true);
    public static final /* enum */ f i = new f("rot_120_pnn", h.d, true, true, false);
    public static final /* enum */ f j = new f("rot_120_pnp", h.e, true, true, false);
    public static final /* enum */ f k = new f("rot_120_ppn", h.e, false, true, true);
    public static final /* enum */ f l = new f("rot_120_ppp", h.d, false, false, false);
    public static final /* enum */ f m = new f("rot_180_edge_xy_neg", h.b, true, true, true);
    public static final /* enum */ f n = new f("rot_180_edge_xy_pos", h.b, false, false, true);
    public static final /* enum */ f o = new f("rot_180_edge_xz_neg", h.f, true, true, true);
    public static final /* enum */ f p = new f("rot_180_edge_xz_pos", h.f, false, true, false);
    public static final /* enum */ f q = new f("rot_180_edge_yz_neg", h.c, true, true, true);
    public static final /* enum */ f r = new f("rot_180_edge_yz_pos", h.c, true, false, false);
    public static final /* enum */ f s = new f("rot_90_x_neg", h.c, false, false, true);
    public static final /* enum */ f t = new f("rot_90_x_pos", h.c, false, true, false);
    public static final /* enum */ f u = new f("rot_90_y_neg", h.f, true, false, false);
    public static final /* enum */ f v = new f("rot_90_y_pos", h.f, false, false, true);
    public static final /* enum */ f w = new f("rot_90_z_neg", h.b, false, true, false);
    public static final /* enum */ f x = new f("rot_90_z_pos", h.b, true, false, false);
    public static final /* enum */ f y = new f("inversion", h.a, true, true, true);
    public static final /* enum */ f z = new f("invert_x", h.a, true, false, false);
    public static final /* enum */ f A = new f("invert_y", h.a, false, true, false);
    public static final /* enum */ f B = new f("invert_z", h.a, false, false, true);
    public static final /* enum */ f C = new f("rot_60_ref_nnn", h.d, true, true, true);
    public static final /* enum */ f D = new f("rot_60_ref_nnp", h.e, true, false, false);
    public static final /* enum */ f E = new f("rot_60_ref_npn", h.e, false, false, true);
    public static final /* enum */ f F = new f("rot_60_ref_npp", h.d, false, false, true);
    public static final /* enum */ f G = new f("rot_60_ref_pnn", h.e, false, true, false);
    public static final /* enum */ f H = new f("rot_60_ref_pnp", h.d, true, false, false);
    public static final /* enum */ f I = new f("rot_60_ref_ppn", h.d, false, true, false);
    public static final /* enum */ f J = new f("rot_60_ref_ppp", h.e, true, true, true);
    public static final /* enum */ f K = new f("swap_xy", h.b, false, false, false);
    public static final /* enum */ f L = new f("swap_yz", h.c, false, false, false);
    public static final /* enum */ f M = new f("swap_xz", h.f, false, false, false);
    public static final /* enum */ f N = new f("swap_neg_xy", h.b, true, true, false);
    public static final /* enum */ f O = new f("swap_neg_yz", h.c, false, true, true);
    public static final /* enum */ f P = new f("swap_neg_xz", h.f, true, false, true);
    public static final /* enum */ f Q = new f("rot_90_ref_x_neg", h.c, true, false, true);
    public static final /* enum */ f R = new f("rot_90_ref_x_pos", h.c, true, true, false);
    public static final /* enum */ f S = new f("rot_90_ref_y_neg", h.f, true, true, false);
    public static final /* enum */ f T = new f("rot_90_ref_y_pos", h.f, false, true, true);
    public static final /* enum */ f U = new f("rot_90_ref_z_neg", h.b, false, true, true);
    public static final /* enum */ f V = new f("rot_90_ref_z_pos", h.b, true, false, true);
    public static final f W;
    public static final f X;
    public static final f Y;
    public static final f Z;
    public static final f aa;
    public static final f ab;
    public static final f ac;
    public static final f ad;
    public static final f ae;
    private final Matrix3fc ag;
    private final String ah;
    private @Nullable Map<iz, iz> ai;
    private final boolean aj;
    private final boolean ak;
    private final boolean al;
    private final h am;
    private static final f[][] an;
    private static final f[] ao;
    private static final /* synthetic */ f[] ap;

    public static f[] values() {
        return (f[])ap.clone();
    }

    public static f valueOf(String $$0) {
        return Enum.valueOf(f.class, $$0);
    }

    private f(String $$0, h $$1, boolean $$2, boolean $$3, boolean $$4) {
        this.ah = $$0;
        this.aj = $$2;
        this.ak = $$3;
        this.al = $$4;
        this.am = $$1;
        this.ag = new Matrix3f().scaling($$2 ? -1.0f : 1.0f, $$3 ? -1.0f : 1.0f, $$4 ? -1.0f : 1.0f).mul($$1.b());
    }

    private static int a(boolean $$0, boolean $$1, boolean $$2, h $$3) {
        int $$4 = ($$2 ? 4 : 0) + ($$1 ? 2 : 0) + ($$0 ? 1 : 0);
        return $$3.ordinal() << 3 | $$4;
    }

    private int e() {
        return f.a(this.aj, this.ak, this.al, this.am);
    }

    public f a(f $$0) {
        return an[this.ordinal()][$$0.ordinal()];
    }

    public f a() {
        return ao[this.ordinal()];
    }

    public Matrix3fc b() {
        return this.ag;
    }

    public String toString() {
        return this.ah;
    }

    @Override
    public String c() {
        return this.ah;
    }

    public iz a(iz $$02) {
        if (this.ai == null) {
            this.ai = bhs.a(iz.class, (K $$0) -> {
                iz.a $$1 = $$0.o();
                iz.b $$2 = $$0.f();
                iz.a $$3 = this.am.a().a($$1);
                iz.b $$4 = this.a($$3) ? $$2.c() : $$2;
                return iz.a($$3, $$4);
            });
        }
        return this.ai.get($$02);
    }

    public Vector3i a(Vector3i $$0) {
        this.am.a($$0);
        $$0.x = $$0.x * (this.aj ? -1 : 1);
        $$0.y = $$0.y * (this.ak ? -1 : 1);
        $$0.z = $$0.z * (this.al ? -1 : 1);
        return $$0;
    }

    public boolean a(iz.a $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case iz.a.a -> this.aj;
            case iz.a.b -> this.ak;
            case iz.a.c -> this.al;
        };
    }

    public h d() {
        return this.am;
    }

    public jb a(jb $$0) {
        return jb.a(this.a($$0.a()), this.a($$0.b()));
    }

    private static /* synthetic */ f[] g() {
        return new f[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V};
    }

    static {
        ap = f.g();
        W = t;
        X = d;
        Y = s;
        Z = v;
        aa = c;
        ab = u;
        ac = x;
        ad = b;
        ae = w;
        an = bhs.a(() -> {
            f[] $$02 = f.values();
            f[][] $$1 = new f[$$02.length][$$02.length];
            Map<Integer, f> $$2 = Arrays.stream($$02).collect(Collectors.toMap(f::e, $$0 -> $$0));
            for (f $$3 : $$02) {
                for (f $$4 : $$02) {
                    h $$5 = $$4.am.a($$3.am);
                    boolean $$6 = $$3.a(iz.a.a) ^ $$4.a($$3.am.a(iz.a.a));
                    boolean $$7 = $$3.a(iz.a.b) ^ $$4.a($$3.am.a(iz.a.b));
                    boolean $$8 = $$3.a(iz.a.c) ^ $$4.a($$3.am.a(iz.a.c));
                    $$1[$$3.ordinal()][$$4.ordinal()] = $$2.get(f.a($$6, $$7, $$8, $$5));
                }
            }
            return $$1;
        });
        ao = (f[])Arrays.stream(f.values()).map($$0 -> Arrays.stream(f.values()).filter($$1 -> $$0.a((f)$$1) == a).findAny().get()).toArray(f[]::new);
    }
}

