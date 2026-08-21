/*
 * Decompiled with CFR 0.152.
 */
public final class eou
extends Enum<eou>
implements bhh {
    public static final /* enum */ eou a = new eou("head");
    public static final /* enum */ eou b = new eou("foot");
    private final String c;
    private static final /* synthetic */ eou[] d;

    public static eou[] values() {
        return (eou[])d.clone();
    }

    public static eou valueOf(String $$0) {
        return Enum.valueOf(eou.class, $$0);
    }

    private eou(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ eou[] a() {
        return new eou[]{a, b};
    }

    static {
        d = eou.a();
    }
}

