/*
 * Decompiled with CFR 0.152.
 */
public final class epu
extends Enum<epu>
implements bhh {
    public static final /* enum */ epu a = new epu("none", true);
    public static final /* enum */ epu b = new epu("unstable", false);
    public static final /* enum */ epu c = new epu("partial", true);
    public static final /* enum */ epu d = new epu("full", true);
    private final String e;
    private final boolean f;
    private static final /* synthetic */ epu[] g;

    public static epu[] values() {
        return (epu[])g.clone();
    }

    public static epu valueOf(String $$0) {
        return Enum.valueOf(epu.class, $$0);
    }

    private epu(String $$0, boolean $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public String c() {
        return this.e;
    }

    public boolean a() {
        return this.f;
    }

    private static /* synthetic */ epu[] b() {
        return new epu[]{a, b, c, d};
    }

    static {
        g = epu.b();
    }
}

