/*
 * Decompiled with CFR 0.152.
 */
public final class epq
extends Enum<epq>
implements bhh {
    public static final /* enum */ epq a = new epq("top");
    public static final /* enum */ epq b = new epq("bottom");
    public static final /* enum */ epq c = new epq("double");
    private final String d;
    private static final /* synthetic */ epq[] e;

    public static epq[] values() {
        return (epq[])e.clone();
    }

    public static epq valueOf(String $$0) {
        return Enum.valueOf(epq.class, $$0);
    }

    private epq(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ epq[] a() {
        return new epq[]{a, b, c};
    }

    static {
        e = epq.a();
    }
}

