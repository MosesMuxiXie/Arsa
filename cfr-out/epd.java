/*
 * Decompiled with CFR 0.152.
 */
public final class epd
extends Enum<epd>
implements bhh {
    public static final /* enum */ epd a = new epd(iz.a);
    public static final /* enum */ epd b = new epd(iz.b);
    private final iz c;
    private static final /* synthetic */ epd[] d;

    public static epd[] values() {
        return (epd[])d.clone();
    }

    public static epd valueOf(String $$0) {
        return Enum.valueOf(epd.class, $$0);
    }

    private epd(iz $$0) {
        this.c = $$0;
    }

    public iz a() {
        return this.c;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this == a ? "upper" : "lower";
    }

    public epd b() {
        return this == a ? b : a;
    }

    private static /* synthetic */ epd[] d() {
        return new epd[]{a, b};
    }

    static {
        d = epd.d();
    }
}

