/*
 * Decompiled with CFR 0.152.
 */
public final class epe
extends Enum<epe>
implements bhh {
    public static final /* enum */ epe a = new epe("tip_merge");
    public static final /* enum */ epe b = new epe("tip");
    public static final /* enum */ epe c = new epe("frustum");
    public static final /* enum */ epe d = new epe("middle");
    public static final /* enum */ epe e = new epe("base");
    private final String f;
    private static final /* synthetic */ epe[] g;

    public static epe[] values() {
        return (epe[])g.clone();
    }

    public static epe valueOf(String $$0) {
        return Enum.valueOf(epe.class, $$0);
    }

    private epe(String $$0) {
        this.f = $$0;
    }

    public String toString() {
        return this.f;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ epe[] a() {
        return new epe[]{a, b, c, d, e};
    }

    static {
        g = epe.a();
    }
}

