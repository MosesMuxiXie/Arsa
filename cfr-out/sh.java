/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class sh {
    public static final fev a = feo.a(euq.a.e);
    public static final fev b = feo.a(euq.a.f);
    public static final fev c = feo.a(euq.a.c);
    public static final fev d = feo.a(euq.a.a);
    public static final fev e = feo.a(euq.a.d);
    public static final fev f = fen.a(evk.a(), evk.b());
    public static final fev g = fen.a(evk.b(10), evk.c(10));
    public static final fev h = fen.a(evk.b(8), evk.c(8));
    public static final fev i = fen.a(evk.b(4), evk.c(4));
    public static final fev j = fen.a(evk.a(), evk.a(256));

    public static void a(qr<fes> $$0) {
        sb.a($$0);
        sc.a($$0);
        sd.a($$0);
        se.a($$0);
        sf.a($$0);
        sg.a($$0);
        si.a($$0);
        sj.a($$0);
        sk.a($$0);
    }

    public static amt<fes> a(String $$0) {
        return amt.a(mj.bp, amo.b($$0));
    }

    public static void a(qr<fes> $$0, amt<fes> $$1, jd<exi<?, ?>> $$2, List<fev> $$3) {
        $$0.a($$1, new fes($$2, List.copyOf($$3)));
    }

    public static void a(qr<fes> $$0, amt<fes> $$1, jd<exi<?, ?>> $$2, fev ... $$3) {
        sh.a($$0, $$1, $$2, List.of($$3));
    }

    public static fev a(int $$0, float $$1, int $$2) {
        float $$3 = 1.0f / $$1;
        if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5f) {
            throw new IllegalStateException("Chance data cannot be represented as list weight");
        }
        cbn<cch> $$4 = cbn.b().a(cce.a($$0), (int)$$3 - 1).a(cce.a($$0 + $$2), 1).a();
        return fek.a(new cco($$4));
    }

    public static feu a() {
        return feh.a(evx.c);
    }

    public static feh a(dzq $$0) {
        return feh.a(evx.a($$0.m(), is.c));
    }

    public static jd<fes> a(jd<exi<?, ?>> $$0, fev ... $$1) {
        return jd.a(new fes($$0, List.of($$1)));
    }

    public static <FC extends fac, F extends exx<FC>> jd<fes> a(F $$0, FC $$1, fev ... $$2) {
        return sh.a(jd.a(new exi<FC, F>($$0, $$1)), $$2);
    }

    public static <FC extends fac, F extends exx<FC>> jd<fes> a(F $$0, FC $$1) {
        return sh.a($$0, $$1, evx.c);
    }

    public static <FC extends fac, F extends exx<FC>> jd<fes> a(F $$0, FC $$1, evx $$2) {
        return sh.a($$0, $$1, feh.a($$2));
    }
}

