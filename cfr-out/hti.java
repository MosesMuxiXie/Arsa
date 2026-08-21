/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class hti
extends Enum<hti> {
    public static final /* enum */ hti a = new hti(hth.a, hth.b);
    public static final /* enum */ hti b = new hti(hth.c);
    public static final /* enum */ hti c = new hti(hth.d);
    private final String d;
    private final hth[] e;
    private static final /* synthetic */ hti[] f;

    public static hti[] values() {
        return (hti[])f.clone();
    }

    public static hti valueOf(String $$0) {
        return Enum.valueOf(hti.class, $$0);
    }

    private hti(hth ... $$0) {
        this.e = $$0;
        this.d = this.toString().toLowerCase(Locale.ROOT);
    }

    public String a() {
        return this.d;
    }

    public hth[] b() {
        return this.e;
    }

    public fxt c() {
        gfj $$0 = gfj.V();
        fxt $$1 = switch (this.ordinal()) {
            case 2 -> $$0.e.u();
            case 1 -> $$0.e.r();
            default -> $$0.l();
        };
        return $$1 != null ? $$1 : $$0.l();
    }

    private static /* synthetic */ hti[] d() {
        return new hti[]{a, b, c};
    }

    static {
        f = hti.d();
    }
}

