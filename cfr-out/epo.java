/*
 * Decompiled with CFR 0.152.
 */
public final class epo
extends Enum<epo>
implements bhh {
    public static final /* enum */ epo a = new epo("inactive");
    public static final /* enum */ epo b = new epo("active");
    public static final /* enum */ epo c = new epo("cooldown");
    private final String d;
    private static final /* synthetic */ epo[] e;

    public static epo[] values() {
        return (epo[])e.clone();
    }

    public static epo valueOf(String $$0) {
        return Enum.valueOf(epo.class, $$0);
    }

    private epo(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ epo[] a() {
        return new epo[]{a, b, c};
    }

    static {
        e = epo.a();
    }
}

