/*
 * Decompiled with CFR 0.152.
 */
public final class eot
extends Enum<eot>
implements bhh {
    public static final /* enum */ eot a = new eot("none");
    public static final /* enum */ eot b = new eot("small");
    public static final /* enum */ eot c = new eot("large");
    private final String d;
    private static final /* synthetic */ eot[] e;

    public static eot[] values() {
        return (eot[])e.clone();
    }

    public static eot valueOf(String $$0) {
        return Enum.valueOf(eot.class, $$0);
    }

    private eot(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ eot[] a() {
        return new eot[]{a, b, c};
    }

    static {
        e = eot.a();
    }
}

