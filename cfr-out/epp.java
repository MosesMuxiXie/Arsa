/*
 * Decompiled with CFR 0.152.
 */
public final class epp
extends Enum<epp>
implements bhh {
    public static final /* enum */ epp a = new epp("unconnected");
    public static final /* enum */ epp b = new epp("right");
    public static final /* enum */ epp c = new epp("center");
    public static final /* enum */ epp d = new epp("left");
    private final String e;
    private static final /* synthetic */ epp[] f;

    public static epp[] values() {
        return (epp[])f.clone();
    }

    public static epp valueOf(String $$0) {
        return Enum.valueOf(epp.class, $$0);
    }

    private epp(String $$0) {
        this.e = $$0;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this.e;
    }

    public boolean a() {
        return this != a;
    }

    public boolean a(epp $$0) {
        return this == c || this == $$0;
    }

    public boolean b() {
        return this != c;
    }

    public epp d() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 3 -> d;
            case 1, 2 -> c;
        };
    }

    public epp e() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> b;
            case 2, 3 -> c;
        };
    }

    public epp f() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 3 -> a;
            case 1, 2 -> b;
        };
    }

    public epp g() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> a;
            case 2, 3 -> d;
        };
    }

    private static /* synthetic */ epp[] h() {
        return new epp[]{a, b, c, d};
    }

    static {
        f = epp.h();
    }
}

