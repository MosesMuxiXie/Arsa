/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class cut
extends Enum<cut> {
    public static final /* enum */ cut a = new cut(0);
    public static final /* enum */ cut b = new cut(1);
    public static final /* enum */ cut c = new cut(2);
    public static final /* enum */ cut d = new cut(3);
    public static final /* enum */ cut e = new cut(4);
    private static final IntFunction<cut> f;
    private final int g;
    private static final /* synthetic */ cut[] h;

    public static cut[] values() {
        return (cut[])h.clone();
    }

    public static cut valueOf(String $$0) {
        return Enum.valueOf(cut.class, $$0);
    }

    private cut(int $$0) {
        this.g = $$0;
    }

    public int a() {
        return this.g;
    }

    public static cut a(int $$0) {
        return f.apply($$0);
    }

    private static /* synthetic */ cut[] b() {
        return new cut[]{a, b, c, d, e};
    }

    static {
        h = cut.b();
        f = beu.a(cut::a, cut.values(), beu.a.b);
    }
}

