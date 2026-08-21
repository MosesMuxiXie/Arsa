/*
 * Decompiled with CFR 0.152.
 */
public final class gma
extends Enum<gma>
implements bhh {
    public static final /* enum */ gma a = new gma("alwaysOn");
    public static final /* enum */ gma b = new gma("inOverlay");
    public static final /* enum */ gma c = new gma("never");
    public static final bhh.a<gma> d;
    private final String e;
    private static final /* synthetic */ gma[] f;

    public static gma[] values() {
        return (gma[])f.clone();
    }

    public static gma valueOf(String $$0) {
        return Enum.valueOf(gma.class, $$0);
    }

    private gma(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ gma[] a() {
        return new gma[]{a, b, c};
    }

    static {
        f = gma.a();
        d = bhh.a(gma::values);
    }
}

