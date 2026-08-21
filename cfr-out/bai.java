/*
 * Decompiled with CFR 0.152.
 */
public final class bai
extends Enum<bai> {
    public static final /* enum */ bai a = new bai("old");
    public static final /* enum */ bai b = new bai("new");
    public static final /* enum */ bai c = new bai("unknown");
    public static final /* enum */ bai d = new bai("compatible");
    public static final int e = Integer.MAX_VALUE;
    private final yh f;
    private final yh g;
    private static final /* synthetic */ bai[] h;

    public static bai[] values() {
        return (bai[])h.clone();
    }

    public static bai valueOf(String $$0) {
        return Enum.valueOf(bai.class, $$0);
    }

    private bai(String $$0) {
        this.f = yh.c("pack.incompatible." + $$0).a(l.h);
        this.g = yh.c("pack.incompatible.confirm." + $$0);
    }

    public boolean a() {
        return this == d;
    }

    public static bai a(bfz<azz> $$0, azz $$1) {
        if ($$0.a().b() == Integer.MAX_VALUE) {
            return c;
        }
        if ($$0.b().a($$1) < 0) {
            return a;
        }
        if ($$1.a($$0.a()) < 0) {
            return b;
        }
        return d;
    }

    public yh b() {
        return this.f;
    }

    public yh c() {
        return this.g;
    }

    private static /* synthetic */ bai[] d() {
        return new bai[]{a, b, c, d};
    }

    static {
        h = bai.d();
    }
}

