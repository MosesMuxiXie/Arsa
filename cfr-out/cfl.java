/*
 * Decompiled with CFR 0.152.
 */
public final class cfl
extends Enum<cfl> {
    public static final /* enum */ cfl a = new cfl(l.j);
    public static final /* enum */ cfl b = new cfl(l.m);
    public static final /* enum */ cfl c = new cfl(l.j);
    private final l d;
    private static final /* synthetic */ cfl[] e;

    public static cfl[] values() {
        return (cfl[])e.clone();
    }

    public static cfl valueOf(String $$0) {
        return Enum.valueOf(cfl.class, $$0);
    }

    private cfl(l $$0) {
        this.d = $$0;
    }

    public l a() {
        return this.d;
    }

    private static /* synthetic */ cfl[] b() {
        return new cfl[]{a, b, c};
    }

    static {
        e = cfl.b();
    }
}

