/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class dhb {
    public static final dgx a;
    public static final dgx b;
    public static final dgx c;
    public static final dgx d;
    public static final dgy e;
    public static final Codec<dgz> f;
    public static final dgz g;
    public static final dgz h;

    public static String a(dgz $$0, dgz $$1) {
        return dhb.a(e, $$0, $$1);
    }

    public static String a(dgy $$0, dgz $$12, dgz $$2) {
        Set<amo> $$3 = $$0.b($$2);
        Set<amo> $$4 = $$0.b($$12);
        return $$3.stream().filter($$1 -> !$$4.contains($$1)).map(amo::toString).collect(Collectors.joining(", "));
    }

    public static boolean a(dgz $$0) {
        return !$$0.a(g);
    }

    static {
        dgy.a $$0 = new dgy.a("main");
        a = $$0.a("vanilla");
        b = $$0.a("trade_rebalance");
        c = $$0.a("redstone_experiments");
        d = $$0.a("minecart_improvements");
        e = $$0.a();
        f = e.b();
        h = g = dgz.a(a);
    }
}

