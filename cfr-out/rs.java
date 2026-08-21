/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class rs {
    public static void a(qr<exi<?, ?>> $$0) {
        rp.a($$0);
        rq.a($$0);
        rr.a($$0);
        rt.a($$0);
        ru.a($$0);
        rv.a($$0);
        rw.a($$0);
        rx.a($$0);
        ry.a($$0);
    }

    private static evx a(List<dzq> $$0) {
        evx $$2;
        if (!$$0.isEmpty()) {
            evx $$1 = evx.a(evx.c, evx.a(iz.a.q(), $$0));
        } else {
            $$2 = evx.c;
        }
        return $$2;
    }

    public static fap a(int $$0, jd<fes> $$1) {
        return new fap($$0, 7, 3, $$1);
    }

    public static <FC extends fac, F extends exx<FC>> fap a(F $$0, FC $$1, List<dzq> $$2, int $$3) {
        return rs.a($$3, sh.a($$0, $$1, rs.a($$2)));
    }

    public static <FC extends fac, F extends exx<FC>> fap a(F $$0, FC $$1, List<dzq> $$2) {
        return rs.a($$0, $$1, $$2, 96);
    }

    public static <FC extends fac, F extends exx<FC>> fap a(F $$0, FC $$1) {
        return rs.a($$0, $$1, List.of(), 96);
    }

    public static amt<exi<?, ?>> a(String $$0) {
        return amt.a(mj.aY, amo.b($$0));
    }

    public static void a(qr<exi<?, ?>> $$0, amt<exi<?, ?>> $$1, exx<faj> $$2) {
        rs.a($$0, $$1, $$2, fac.m);
    }

    public static <FC extends fac, F extends exx<FC>> void a(qr<exi<?, ?>> $$0, amt<exi<?, ?>> $$1, F $$2, FC $$3) {
        $$0.a($$1, new exi<FC, F>($$2, $$3));
    }
}

