/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public final class fui
extends Enum<fui>
implements bhh {
    public static final /* enum */ fui a = new fui(0, "list");
    public static final /* enum */ fui b = new fui(1, "sidebar");
    public static final /* enum */ fui c = new fui(2, "below_name");
    public static final /* enum */ fui d = new fui(3, "sidebar.team.black");
    public static final /* enum */ fui e = new fui(4, "sidebar.team.dark_blue");
    public static final /* enum */ fui f = new fui(5, "sidebar.team.dark_green");
    public static final /* enum */ fui g = new fui(6, "sidebar.team.dark_aqua");
    public static final /* enum */ fui h = new fui(7, "sidebar.team.dark_red");
    public static final /* enum */ fui i = new fui(8, "sidebar.team.dark_purple");
    public static final /* enum */ fui j = new fui(9, "sidebar.team.gold");
    public static final /* enum */ fui k = new fui(10, "sidebar.team.gray");
    public static final /* enum */ fui l = new fui(11, "sidebar.team.dark_gray");
    public static final /* enum */ fui m = new fui(12, "sidebar.team.blue");
    public static final /* enum */ fui n = new fui(13, "sidebar.team.green");
    public static final /* enum */ fui o = new fui(14, "sidebar.team.aqua");
    public static final /* enum */ fui p = new fui(15, "sidebar.team.red");
    public static final /* enum */ fui q = new fui(16, "sidebar.team.light_purple");
    public static final /* enum */ fui r = new fui(17, "sidebar.team.yellow");
    public static final /* enum */ fui s = new fui(18, "sidebar.team.white");
    public static final bhh.a<fui> t;
    public static final IntFunction<fui> u;
    private final int v;
    private final String w;
    private static final /* synthetic */ fui[] x;

    public static fui[] values() {
        return (fui[])x.clone();
    }

    public static fui valueOf(String $$0) {
        return Enum.valueOf(fui.class, $$0);
    }

    private fui(int $$0, String $$1) {
        this.v = $$0;
        this.w = $$1;
    }

    public int a() {
        return this.v;
    }

    @Override
    public String c() {
        return this.w;
    }

    public static @Nullable fui a(l $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case l.a -> d;
            case l.b -> e;
            case l.c -> f;
            case l.d -> g;
            case l.e -> h;
            case l.f -> i;
            case l.g -> j;
            case l.h -> k;
            case l.i -> l;
            case l.j -> m;
            case l.k -> n;
            case l.l -> o;
            case l.m -> p;
            case l.n -> q;
            case l.o -> r;
            case l.p -> s;
            case l.r, l.u, l.t, l.v, l.q, l.s -> null;
        };
    }

    private static /* synthetic */ fui[] b() {
        return new fui[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s};
    }

    static {
        x = fui.b();
        t = bhh.a(fui::values);
        u = beu.a(fui::a, fui.values(), beu.a.a);
    }
}

