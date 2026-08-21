/*
 * Decompiled with CFR 0.152.
 */
public final class eov
extends Enum<eov>
implements bhh {
    public static final /* enum */ eov a = new eov("floor");
    public static final /* enum */ eov b = new eov("ceiling");
    public static final /* enum */ eov c = new eov("single_wall");
    public static final /* enum */ eov d = new eov("double_wall");
    private final String e;
    private static final /* synthetic */ eov[] f;

    public static eov[] values() {
        return (eov[])f.clone();
    }

    public static eov valueOf(String $$0) {
        return Enum.valueOf(eov.class, $$0);
    }

    private eov(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ eov[] a() {
        return new eov[]{a, b, c, d};
    }

    static {
        f = eov.a();
    }
}

