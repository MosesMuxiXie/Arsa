/*
 * Decompiled with CFR 0.152.
 */
public final class epi
extends Enum<epi>
implements bhh {
    public static final /* enum */ epi a = new epi("harp", bda.uA, epi$a.a);
    public static final /* enum */ epi b = new epi("basedrum", bda.uu, epi$a.a);
    public static final /* enum */ epi c = new epi("snare", bda.uD, epi$a.a);
    public static final /* enum */ epi d = new epi("hat", bda.uB, epi$a.a);
    public static final /* enum */ epi e = new epi("bass", bda.uv, epi$a.a);
    public static final /* enum */ epi f = new epi("flute", bda.uy, epi$a.a);
    public static final /* enum */ epi g = new epi("bell", bda.uw, epi$a.a);
    public static final /* enum */ epi h = new epi("guitar", bda.uz, epi$a.a);
    public static final /* enum */ epi i = new epi("chime", bda.ux, epi$a.a);
    public static final /* enum */ epi j = new epi("xylophone", bda.uE, epi$a.a);
    public static final /* enum */ epi k = new epi("iron_xylophone", bda.uF, epi$a.a);
    public static final /* enum */ epi l = new epi("cow_bell", bda.uG, epi$a.a);
    public static final /* enum */ epi m = new epi("didgeridoo", bda.uH, epi$a.a);
    public static final /* enum */ epi n = new epi("bit", bda.uI, epi$a.a);
    public static final /* enum */ epi o = new epi("banjo", bda.uJ, epi$a.a);
    public static final /* enum */ epi p = new epi("pling", bda.uC, epi$a.a);
    public static final /* enum */ epi q = new epi("zombie", bda.uK, epi$a.b);
    public static final /* enum */ epi r = new epi("skeleton", bda.uL, epi$a.b);
    public static final /* enum */ epi s = new epi("creeper", bda.uM, epi$a.b);
    public static final /* enum */ epi t = new epi("dragon", bda.uN, epi$a.b);
    public static final /* enum */ epi u = new epi("wither_skeleton", bda.uO, epi$a.b);
    public static final /* enum */ epi v = new epi("piglin", bda.uP, epi$a.b);
    public static final /* enum */ epi w = new epi("custom_head", bda.DJ, epi$a.c);
    private final String x;
    private final jd<bcz> y;
    private final a z;
    private static final /* synthetic */ epi[] A;

    public static epi[] values() {
        return (epi[])A.clone();
    }

    public static epi valueOf(String $$0) {
        return Enum.valueOf(epi.class, $$0);
    }

    private epi(String $$0, jd<bcz> $$1, a $$2) {
        this.x = $$0;
        this.y = $$1;
        this.z = $$2;
    }

    @Override
    public String c() {
        return this.x;
    }

    public jd<bcz> a() {
        return this.y;
    }

    public boolean b() {
        return this.z == epi$a.a;
    }

    public boolean d() {
        return this.z == epi$a.c;
    }

    public boolean e() {
        return this.z != epi$a.a;
    }

    private static /* synthetic */ epi[] f() {
        return new epi[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w};
    }

    static {
        A = epi.f();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = epi$a.a();
        }
    }
}

