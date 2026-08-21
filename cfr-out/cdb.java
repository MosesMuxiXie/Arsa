/*
 * Decompiled with CFR 0.152.
 */
public final class cdb
extends Enum<cdb> {
    public static final /* enum */ cdb a = new cdb();
    public static final /* enum */ cdb b = new cdb();
    private static final /* synthetic */ cdb[] c;

    public static cdb[] values() {
        return (cdb[])c.clone();
    }

    public static cdb valueOf(String $$0) {
        return Enum.valueOf(cdb.class, $$0);
    }

    public cgv a() {
        return this == a ? cgv.a : cgv.b;
    }

    private static /* synthetic */ cdb[] b() {
        return new cdb[]{a, b};
    }

    static {
        c = cdb.b();
    }
}

