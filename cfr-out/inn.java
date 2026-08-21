/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class inn {
    private static final eoi<dzq, eoh> a = inn.b();
    private static final eoi<dzq, eoh> b = inn.b();
    private static final amo c = amo.b("glow_item_frame");
    private static final amo d = amo.b("item_frame");
    private static final Map<amo, eoi<dzq, eoh>> e = Map.of(d, a, c, b);

    private static eoi<dzq, eoh> b() {
        return new eoi.a(dzs.a).a(new epk[]{eox.bI}).a(dzq::m, eoh::new);
    }

    public static eoh a(boolean $$0, boolean $$1) {
        return (eoh)($$0 ? b : a).b().b(eox.bI, $$1);
    }

    static Function<amo, eoi<dzq, eoh>> a() {
        HashMap<amo, eoi<dzq, eoh>> $$0 = new HashMap<amo, eoi<dzq, eoh>>(e);
        for (dzq $$1 : mi.e) {
            $$0.put($$1.p().h().a(), $$1.l());
        }
        return $$0::get;
    }
}

