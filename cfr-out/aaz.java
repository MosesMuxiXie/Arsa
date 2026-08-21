/*
 * Decompiled with CFR 0.152.
 */
public final class aaz
extends Enum<aaz> {
    public static final /* enum */ aaz a = new aaz("serverbound");
    public static final /* enum */ aaz b = new aaz("clientbound");
    private final String c;
    private static final /* synthetic */ aaz[] d;

    public static aaz[] values() {
        return (aaz[])d.clone();
    }

    public static aaz valueOf(String $$0) {
        return Enum.valueOf(aaz.class, $$0);
    }

    private aaz(String $$0) {
        this.c = $$0;
    }

    public aaz a() {
        return this == b ? a : b;
    }

    public String b() {
        return this.c;
    }

    private static /* synthetic */ aaz[] c() {
        return new aaz[]{a, b};
    }

    static {
        d = aaz.c();
    }
}

