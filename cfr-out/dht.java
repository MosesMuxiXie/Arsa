/*
 * Decompiled with CFR 0.152.
 */
public final class dht
extends Enum<dht> {
    public static final /* enum */ dht a = new dht();
    public static final /* enum */ dht b = new dht();
    private static final /* synthetic */ dht[] c;

    public static dht[] values() {
        return (dht[])c.clone();
    }

    public static dht valueOf(String $$0) {
        return Enum.valueOf(dht.class, $$0);
    }

    private static /* synthetic */ dht[] a() {
        return new dht[]{a, b};
    }

    static {
        c = dht.a();
    }
}

