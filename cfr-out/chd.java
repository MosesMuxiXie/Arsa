/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public final class chd
extends Enum<chd> {
    public static final /* enum */ chd a = new chd($$0 -> {
        $$0.q(true);
        if ($$0.ea()) {
            $$0.k(Math.min($$0.cP(), $$0.cM() + 1));
        }
    });
    public static final /* enum */ chd b = new chd(cgk::cL);
    public static final /* enum */ chd c = new chd(dzd::a);
    public static final /* enum */ chd d = new chd(cgk::aP);
    public static final /* enum */ chd e = new chd(cgk::aT);
    private final Consumer<cgk> f;
    private static final /* synthetic */ chd[] g;

    public static chd[] values() {
        return (chd[])g.clone();
    }

    public static chd valueOf(String $$0) {
        return Enum.valueOf(chd.class, $$0);
    }

    private chd(Consumer<cgk> $$0) {
        this.f = $$0;
    }

    public Consumer<cgk> a() {
        return this.f;
    }

    private static /* synthetic */ chd[] b() {
        return new chd[]{a, b, c, d, e};
    }

    static {
        g = chd.b();
    }
}

