/*
 * Decompiled with CFR 0.152.
 */
public final class epb
extends Enum<epb>
implements bhh {
    public static final /* enum */ epb a = new epb("uprooted");
    public static final /* enum */ epb b = new epb("dormant");
    public static final /* enum */ epb c = new epb("awake");
    private final String d;
    private static final /* synthetic */ epb[] e;

    public static epb[] values() {
        return (epb[])e.clone();
    }

    public static epb valueOf(String $$0) {
        return Enum.valueOf(epb.class, $$0);
    }

    private epb(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ epb[] a() {
        return new epb[]{a, b, c};
    }

    static {
        e = epb.a();
    }
}

