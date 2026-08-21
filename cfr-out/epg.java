/*
 * Decompiled with CFR 0.152.
 */
public final class epg
extends Enum<epg>
implements bhh {
    public static final /* enum */ epg a = new epg("top");
    public static final /* enum */ epg b = new epg("bottom");
    private final String c;
    private static final /* synthetic */ epg[] d;

    public static epg[] values() {
        return (epg[])d.clone();
    }

    public static epg valueOf(String $$0) {
        return Enum.valueOf(epg.class, $$0);
    }

    private epg(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ epg[] a() {
        return new epg[]{a, b};
    }

    static {
        d = epg.a();
    }
}

