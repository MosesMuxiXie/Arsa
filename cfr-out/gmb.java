/*
 * Decompiled with CFR 0.152.
 */
public final class gmb
extends Enum<gmb>
implements bhh {
    public static final /* enum */ gmb a = new gmb("default", "debug.options.profile.default");
    public static final /* enum */ gmb b = new gmb("performance", "debug.options.profile.performance");
    public static final bhh.a<gmb> c;
    private final String d;
    private final String e;
    private static final /* synthetic */ gmb[] f;

    public static gmb[] values() {
        return (gmb[])f.clone();
    }

    public static gmb valueOf(String $$0) {
        return Enum.valueOf(gmb.class, $$0);
    }

    private gmb(String $$0, String $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public String a() {
        return this.e;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ gmb[] b() {
        return new gmb[]{a, b};
    }

    static {
        f = gmb.b();
        c = bhh.a(gmb::values);
    }
}

