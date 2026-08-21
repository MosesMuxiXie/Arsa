/*
 * Decompiled with CFR 0.152.
 */
public final class ges
extends Enum<ges> {
    public static final /* enum */ ges a = new ges(true, false);
    public static final /* enum */ ges b = new ges(false, false);
    public static final /* enum */ ges c = new ges(false, true);
    private static final ges[] d;
    private final boolean e;
    private final boolean f;
    private static final /* synthetic */ ges[] g;

    public static ges[] values() {
        return (ges[])g.clone();
    }

    public static ges valueOf(String $$0) {
        return Enum.valueOf(ges.class, $$0);
    }

    private ges(boolean $$0, boolean $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    public ges c() {
        return d[(this.ordinal() + 1) % d.length];
    }

    private static /* synthetic */ ges[] d() {
        return new ges[]{a, b, c};
    }

    static {
        g = ges.d();
        d = ges.values();
    }
}

