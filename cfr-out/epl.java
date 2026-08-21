/*
 * Decompiled with CFR 0.152.
 */
public final class epl
extends Enum<epl>
implements bhh {
    public static final /* enum */ epl a = new epl("north_south");
    public static final /* enum */ epl b = new epl("east_west");
    public static final /* enum */ epl c = new epl("ascending_east");
    public static final /* enum */ epl d = new epl("ascending_west");
    public static final /* enum */ epl e = new epl("ascending_north");
    public static final /* enum */ epl f = new epl("ascending_south");
    public static final /* enum */ epl g = new epl("south_east");
    public static final /* enum */ epl h = new epl("south_west");
    public static final /* enum */ epl i = new epl("north_west");
    public static final /* enum */ epl j = new epl("north_east");
    private final String k;
    private static final /* synthetic */ epl[] l;

    public static epl[] values() {
        return (epl[])l.clone();
    }

    public static epl valueOf(String $$0) {
        return Enum.valueOf(epl.class, $$0);
    }

    private epl(String $$0) {
        this.k = $$0;
    }

    public String a() {
        return this.k;
    }

    public String toString() {
        return this.k;
    }

    public boolean b() {
        return this == e || this == c || this == f || this == d;
    }

    @Override
    public String c() {
        return this.k;
    }

    private static /* synthetic */ epl[] d() {
        return new epl[]{a, b, c, d, e, f, g, h, i, j};
    }

    static {
        l = epl.d();
    }
}

