/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class anc
extends Enum<anc> {
    public static final /* enum */ anc a = new anc();
    public static final /* enum */ anc b = new anc();
    public static final /* enum */ anc c = new anc();
    public static final /* enum */ anc d = new anc();
    private static final List<anc> e;
    private static final jr.b f;
    private static final /* synthetic */ anc[] g;

    public static anc[] values() {
        return (anc[])g.clone();
    }

    public static anc valueOf(String $$0) {
        return Enum.valueOf(anc.class, $$0);
    }

    public static jk<anc> a() {
        return new jk<anc>(e).a(a, f);
    }

    private static /* synthetic */ anc[] b() {
        return new anc[]{a, b, c, d};
    }

    static {
        g = anc.b();
        e = List.of(anc.values());
        f = jr.a(mi.aR);
    }
}

