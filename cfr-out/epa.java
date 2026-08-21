/*
 * Decompiled with CFR 0.152.
 */
public final class epa
extends Enum<epa>
implements bhh {
    public static final /* enum */ epa a = new epa("compare");
    public static final /* enum */ epa b = new epa("subtract");
    private final String c;
    private static final /* synthetic */ epa[] d;

    public static epa[] values() {
        return (epa[])d.clone();
    }

    public static epa valueOf(String $$0) {
        return Enum.valueOf(epa.class, $$0);
    }

    private epa(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ epa[] a() {
        return new epa[]{a, b};
    }

    static {
        d = epa.a();
    }
}

