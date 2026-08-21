/*
 * Decompiled with CFR 0.152.
 */
public final class epm
extends Enum<epm>
implements bhh {
    public static final /* enum */ epm a = new epm("up");
    public static final /* enum */ epm b = new epm("side");
    public static final /* enum */ epm c = new epm("none");
    private final String d;
    private static final /* synthetic */ epm[] e;

    public static epm[] values() {
        return (epm[])e.clone();
    }

    public static epm valueOf(String $$0) {
        return Enum.valueOf(epm.class, $$0);
    }

    private epm(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this.d;
    }

    public boolean a() {
        return this != c;
    }

    private static /* synthetic */ epm[] b() {
        return new epm[]{a, b, c};
    }

    static {
        e = epm.b();
    }
}

