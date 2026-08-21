/*
 * Decompiled with CFR 0.152.
 */
public final class ete
extends Enum<ete> {
    public static final /* enum */ ete a = new ete(false, false);
    public static final /* enum */ ete b = new ete(true, false);
    public static final /* enum */ ete c = new ete(true, true);
    private final boolean d;
    private final boolean e;
    private static final /* synthetic */ ete[] f;

    public static ete[] values() {
        return (ete[])f.clone();
    }

    public static ete valueOf(String $$0) {
        return Enum.valueOf(ete.class, $$0);
    }

    private ete(boolean $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.d;
    }

    public static ete a(awt $$0) {
        if ($$0.a(awt.d)) {
            return c;
        }
        if ($$0.a(awt.b)) {
            return b;
        }
        return a;
    }

    private static /* synthetic */ ete[] c() {
        return new ete[]{a, b, c};
    }

    static {
        f = ete.c();
    }
}

