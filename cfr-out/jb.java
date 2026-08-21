/*
 * Decompiled with CFR 0.152.
 */
public final class jb
extends Enum<jb>
implements bhh {
    public static final /* enum */ jb a = new jb("down_east", iz.a, iz.f);
    public static final /* enum */ jb b = new jb("down_north", iz.a, iz.c);
    public static final /* enum */ jb c = new jb("down_south", iz.a, iz.d);
    public static final /* enum */ jb d = new jb("down_west", iz.a, iz.e);
    public static final /* enum */ jb e = new jb("up_east", iz.b, iz.f);
    public static final /* enum */ jb f = new jb("up_north", iz.b, iz.c);
    public static final /* enum */ jb g = new jb("up_south", iz.b, iz.d);
    public static final /* enum */ jb h = new jb("up_west", iz.b, iz.e);
    public static final /* enum */ jb i = new jb("west_up", iz.e, iz.b);
    public static final /* enum */ jb j = new jb("east_up", iz.f, iz.b);
    public static final /* enum */ jb k = new jb("north_up", iz.c, iz.b);
    public static final /* enum */ jb l = new jb("south_up", iz.d, iz.b);
    private static final int m;
    private static final jb[] n;
    private final String o;
    private final iz p;
    private final iz q;
    private static final /* synthetic */ jb[] r;

    public static jb[] values() {
        return (jb[])r.clone();
    }

    public static jb valueOf(String $$0) {
        return Enum.valueOf(jb.class, $$0);
    }

    private static int b(iz $$0, iz $$1) {
        return $$0.ordinal() * m + $$1.ordinal();
    }

    private jb(String $$0, iz $$1, iz $$2) {
        this.o = $$0;
        this.q = $$1;
        this.p = $$2;
    }

    @Override
    public String c() {
        return this.o;
    }

    public static jb a(iz $$0, iz $$1) {
        return n[jb.b($$0, $$1)];
    }

    public iz a() {
        return this.q;
    }

    public iz b() {
        return this.p;
    }

    private static /* synthetic */ jb[] d() {
        return new jb[]{a, b, c, d, e, f, g, h, i, j, k, l};
    }

    static {
        r = jb.d();
        m = iz.values().length;
        n = bhs.a(new jb[m * m], (? super T $$0) -> {
            jb[] jbArray = jb.values();
            int n2 = jbArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                jb $$1;
                $$0[jb.b((iz)$$1.q, (iz)$$1.p)] = $$1 = jbArray[i2];
            }
        });
    }
}

