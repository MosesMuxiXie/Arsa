/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public interface cvd {
    public static final amt<cvc> a = cvd.a("tabby");
    public static final amt<cvc> b = cvd.a("black");
    public static final amt<cvc> c = cvd.a("red");
    public static final amt<cvc> d = cvd.a("siamese");
    public static final amt<cvc> e = cvd.a("british_shorthair");
    public static final amt<cvc> f = cvd.a("calico");
    public static final amt<cvc> g = cvd.a("persian");
    public static final amt<cvc> h = cvd.a("ragdoll");
    public static final amt<cvc> i = cvd.a("white");
    public static final amt<cvc> j = cvd.a("jellie");
    public static final amt<cvc> k = cvd.a("all_black");

    private static amt<cvc> a(String $$0) {
        return amt.a(mj.aT, amo.b($$0));
    }

    public static void a(qr<cvc> $$0) {
        je<ffo> $$1 = $$0.a(mj.bs);
        cvd.a($$0, a, "entity/cat/tabby");
        cvd.a($$0, b, "entity/cat/black");
        cvd.a($$0, c, "entity/cat/red");
        cvd.a($$0, d, "entity/cat/siamese");
        cvd.a($$0, e, "entity/cat/british_shorthair");
        cvd.a($$0, f, "entity/cat/calico");
        cvd.a($$0, g, "entity/cat/persian");
        cvd.a($$0, h, "entity/cat/ragdoll");
        cvd.a($$0, i, "entity/cat/white");
        cvd.a($$0, j, "entity/cat/jellie");
        cvd.a($$0, k, "entity/cat/all_black", new dfu(List.of(new dfq.a(new dfv($$1.b(beb.o)), 1), new dfq.a(new dfp(cq.b.b(0.9)), 0))));
    }

    private static void a(qr<cvc> $$0, amt<cvc> $$1, String $$2) {
        cvd.a($$0, $$1, $$2, dfu.a(0));
    }

    private static void a(qr<cvc> $$0, amt<cvc> $$1, String $$2, dfu $$3) {
        $$0.a($$1, new cvc(new iu.b(amo.b($$2)), $$3));
    }
}

