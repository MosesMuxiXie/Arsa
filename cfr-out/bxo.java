/*
 * Decompiled with CFR 0.152.
 */
public final class bxo
extends Enum<bxo> {
    public static final /* enum */ bxo a = new bxo(bxf.a);
    private final bxe<?> b;
    private static final /* synthetic */ bxo[] c;

    public static bxo[] values() {
        return (bxo[])c.clone();
    }

    public static bxo valueOf(String $$0) {
        return Enum.valueOf(bxo.class, $$0);
    }

    private bxo(bxe<?> $$0) {
        this.b = $$0;
    }

    public bxe<?> a() {
        return this.b;
    }

    private static /* synthetic */ bxo[] b() {
        return new bxo[]{a};
    }

    static {
        c = bxo.b();
    }
}

