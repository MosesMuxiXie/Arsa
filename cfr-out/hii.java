/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class hii
extends Enum<hii> {
    public static final /* enum */ hii a = new hii();
    public static final /* enum */ hii b = new hii();
    private static final List<hii> c;
    private static final jr.b d;
    private static final /* synthetic */ hii[] e;

    public static hii[] values() {
        return (hii[])e.clone();
    }

    public static hii valueOf(String $$0) {
        return Enum.valueOf(hii.class, $$0);
    }

    public static jk<hii> a() {
        return new jk<hii>(c).a(a, d);
    }

    private static /* synthetic */ hii[] b() {
        return new hii[]{a, b};
    }

    static {
        e = hii.b();
        c = List.of(hii.values());
        d = jr.a(mi.aR);
    }
}

