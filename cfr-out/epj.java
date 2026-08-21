/*
 * Decompiled with CFR 0.152.
 */
public final class epj
extends Enum<epj>
implements bhh {
    public static final /* enum */ epj a = new epj("normal");
    public static final /* enum */ epj b = new epj("sticky");
    private final String c;
    private static final /* synthetic */ epj[] d;

    public static epj[] values() {
        return (epj[])d.clone();
    }

    public static epj valueOf(String $$0) {
        return Enum.valueOf(epj.class, $$0);
    }

    private epj(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ epj[] a() {
        return new epj[]{a, b};
    }

    static {
        d = epj.a();
    }
}

