/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dus {
    public static final amt<dur> a = dus.a("quartz");
    public static final amt<dur> b = dus.a("iron");
    public static final amt<dur> c = dus.a("netherite");
    public static final amt<dur> d = dus.a("redstone");
    public static final amt<dur> e = dus.a("copper");
    public static final amt<dur> f = dus.a("gold");
    public static final amt<dur> g = dus.a("emerald");
    public static final amt<dur> h = dus.a("diamond");
    public static final amt<dur> i = dus.a("lapis");
    public static final amt<dur> j = dus.a("amethyst");
    public static final amt<dur> k = dus.a("resin");

    public static void a(qr<dur> $$0) {
        dus.a($$0, a, zf.a.a(14931140), duq.d);
        dus.a($$0, b, zf.a.a(0xECECEC), duq.e);
        dus.a($$0, c, zf.a.a(6445145), duq.f);
        dus.a($$0, d, zf.a.a(9901575), duq.g);
        dus.a($$0, e, zf.a.a(11823181), duq.h);
        dus.a($$0, f, zf.a.a(14594349), duq.i);
        dus.a($$0, g, zf.a.a(1155126), duq.j);
        dus.a($$0, h, zf.a.a(7269586), duq.k);
        dus.a($$0, i, zf.a.a(4288151), duq.l);
        dus.a($$0, j, zf.a.a(10116294), duq.m);
        dus.a($$0, k, zf.a.a(16545810), duq.n);
    }

    public static Optional<jd<dur>> a(jf.a $$0, dlt $$1) {
        dox $$2 = $$1.a(ki.aj);
        return $$2 != null ? $$2.a($$0) : Optional.empty();
    }

    private static void a(qr<dur> $$0, amt<dur> $$1, zf $$2, duq $$3) {
        yw $$4 = yh.c(bhs.a("trim_material", $$1.a())).c($$2);
        $$0.a($$1, new dur($$3, $$4));
    }

    private static amt<dur> a(String $$0) {
        return amt.a(mj.bz, amo.b($$0));
    }
}

