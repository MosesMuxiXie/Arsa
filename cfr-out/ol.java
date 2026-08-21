/*
 * Decompiled with CFR 0.152.
 */
public final class ol
extends Enum<ol> {
    public static final /* enum */ ol a = new ol("building_blocks");
    public static final /* enum */ ol b = new ol("decorations");
    public static final /* enum */ ol c = new ol("redstone");
    public static final /* enum */ ol d = new ol("transportation");
    public static final /* enum */ ol e = new ol("tools");
    public static final /* enum */ ol f = new ol("combat");
    public static final /* enum */ ol g = new ol("food");
    public static final /* enum */ ol h = new ol("brewing");
    public static final /* enum */ ol i = new ol("misc");
    private final String j;
    private static final /* synthetic */ ol[] k;

    public static ol[] values() {
        return (ol[])k.clone();
    }

    public static ol valueOf(String $$0) {
        return Enum.valueOf(ol.class, $$0);
    }

    private ol(String $$0) {
        this.j = $$0;
    }

    public String a() {
        return this.j;
    }

    private static /* synthetic */ ol[] b() {
        return new ol[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        k = ol.b();
    }
}

