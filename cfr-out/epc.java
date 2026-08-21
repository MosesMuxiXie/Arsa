/*
 * Decompiled with CFR 0.152.
 */
public final class epc
extends Enum<epc>
implements bhh {
    public static final /* enum */ epc a = new epc();
    public static final /* enum */ epc b = new epc();
    private static final /* synthetic */ epc[] c;

    public static epc[] values() {
        return (epc[])c.clone();
    }

    public static epc valueOf(String $$0) {
        return Enum.valueOf(epc.class, $$0);
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this == a ? "left" : "right";
    }

    private static /* synthetic */ epc[] a() {
        return new epc[]{a, b};
    }

    static {
        c = epc.a();
    }
}

