/*
 * Decompiled with CFR 0.152.
 */
public final class eoz
extends Enum<eoz>
implements bhh {
    public static final /* enum */ eoz a = new eoz("single");
    public static final /* enum */ eoz b = new eoz("left");
    public static final /* enum */ eoz c = new eoz("right");
    private final String d;
    private static final /* synthetic */ eoz[] e;

    public static eoz[] values() {
        return (eoz[])e.clone();
    }

    public static eoz valueOf(String $$0) {
        return Enum.valueOf(eoz.class, $$0);
    }

    private eoz(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    public eoz a() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> a;
            case 1 -> c;
            case 2 -> b;
        };
    }

    private static /* synthetic */ eoz[] b() {
        return new eoz[]{a, b, c};
    }

    static {
        e = eoz.b();
    }
}

