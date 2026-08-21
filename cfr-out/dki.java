/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.math.Fraction
 */
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class dki
extends dlp {
    public static final int a = 4;
    public static final int b = 3;
    public static final int c = 12;
    public static final int d = 11;
    private static final int o = bel.a(1.0f, 1.0f, 0.33f, 0.33f);
    private static final int p = bel.a(1.0f, 0.44f, 0.53f, 1.0f);
    private static final int q = 10;
    private static final int r = 2;
    private static final int s = 200;

    public dki(dlp.a $$0) {
        super($$0);
    }

    public static float c(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return $$1.f().floatValue();
    }

    @Override
    public boolean a(dlt $$0, dji $$1, dht $$2, ddm $$3) {
        dnz $$4 = $$0.a(ki.X);
        if ($$4 == null) {
            return false;
        }
        dlt $$5 = $$1.g();
        dnz.a $$6 = new dnz.a($$4);
        if ($$2 == dht.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
                dki.b($$3);
            } else {
                dki.c($$3);
            }
            $$0.b(ki.X, $$6.d());
            this.a($$3);
            return true;
        }
        if ($$2 == dht.b && $$5.f()) {
            dlt $$7 = $$6.b();
            if ($$7 != null) {
                dlt $$8 = $$1.d($$7);
                if ($$8.N() > 0) {
                    $$6.a($$8);
                } else {
                    dki.a($$3);
                }
            }
            $$0.b(ki.X, $$6.d());
            this.a($$3);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(dlt $$0, dlt $$1, dji $$2, dht $$3, ddm $$4, cic $$5) {
        if ($$3 == dht.a && $$1.f()) {
            dki.a($$0, -1);
            return false;
        }
        dnz $$6 = $$0.a(ki.X);
        if ($$6 == null) {
            return false;
        }
        dnz.a $$7 = new dnz.a($$6);
        if ($$3 == dht.a && !$$1.f()) {
            if ($$2.b($$4) && $$7.a($$1) > 0) {
                dki.b($$4);
            } else {
                dki.c($$4);
            }
            $$0.b(ki.X, $$7.d());
            this.a($$4);
            return true;
        }
        if ($$3 == dht.b && $$1.f()) {
            dlt $$8;
            if ($$2.b($$4) && ($$8 = $$7.b()) != null) {
                dki.a($$4);
                $$5.a($$8);
            }
            $$0.b(ki.X, $$7.d());
            this.a($$4);
            return true;
        }
        dki.a($$0, -1);
        return false;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        $$1.c($$2);
        return cdc.a;
    }

    private void a(dwo $$0, ddm $$1, dlt $$2) {
        if (this.b($$2, $$1)) {
            dki.a($$0, $$1);
            $$1.b(bdk.c.b(this));
        }
    }

    @Override
    public boolean d(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return $$1.f().compareTo(Fraction.ZERO) > 0;
    }

    @Override
    public int e(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return Math.min(1 + bgj.a($$1.f(), 12), 13);
    }

    @Override
    public int f(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
    }

    public static void a(dlt $$0, int $$1) {
        dnz $$2 = $$0.a(ki.X);
        if ($$2 == null) {
            return;
        }
        dnz.a $$3 = new dnz.a($$2);
        $$3.a($$1);
        $$0.b(ki.X, $$3.d());
    }

    public static boolean g(dlt $$0) {
        dnz $$1 = $$0.a(ki.X);
        return $$1 != null && $$1.h() != -1;
    }

    public static int h(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return $$1.h();
    }

    public static dlt i(dlt $$0) {
        dnz $$1 = $$0.a(ki.X);
        if ($$1 != null && $$1.h() != -1) {
            return $$1.a($$1.h());
        }
        return dlt.l;
    }

    public static int j(dlt $$0) {
        dnz $$1 = $$0.a(ki.X, dnz.a);
        return $$1.a();
    }

    private boolean b(dlt $$0, ddm $$1) {
        dnz $$2 = $$0.a(ki.X);
        if ($$2 == null || $$2.g()) {
            return false;
        }
        Optional<dlt> $$3 = dki.a($$0, $$1, $$2);
        if ($$3.isPresent()) {
            $$1.a($$3.get(), true);
            return true;
        }
        return false;
    }

    private static Optional<dlt> a(dlt $$0, ddm $$1, dnz $$2) {
        dnz.a $$3 = new dnz.a($$2);
        dlt $$4 = $$3.b();
        if ($$4 != null) {
            dki.a($$1);
            $$0.b(ki.X, $$3.d());
            return Optional.of($$4);
        }
        return Optional.empty();
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, int $$3) {
        if ($$1 instanceof ddm) {
            boolean $$6;
            ddm $$4 = (ddm)$$1;
            int $$5 = this.a($$2, $$1);
            boolean bl2 = $$6 = $$3 == $$5;
            if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
                this.a($$0, $$4, $$2);
            }
        }
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 200;
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.k;
    }

    @Override
    public Optional<djs> k(dlt $$0) {
        dpd $$1 = $$0.a(ki.t, dpd.c);
        if (!$$1.a(ki.X)) {
            return Optional.empty();
        }
        return Optional.ofNullable($$0.a(ki.X)).map(djr::new);
    }

    @Override
    public void a(czl $$0) {
        dnz $$1 = $$0.e().a(ki.X);
        if ($$1 == null) {
            return;
        }
        $$0.e().b(ki.X, dnz.a);
        dlw.a($$0, $$1.d());
    }

    public static List<dki> a() {
        return Stream.of(dlx.sI, dlx.sJ, dlx.sK, dlx.sL, dlx.sM, dlx.sN, dlx.sO, dlx.sP, dlx.sQ, dlx.sR, dlx.sS, dlx.sY, dlx.sV, dlx.sW, dlx.sX, dlx.sU, dlx.sT).map($$0 -> (dki)$$0).toList();
    }

    public static dlp a(dkr $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case dkr.a -> dlx.sJ;
            case dkr.b -> dlx.sK;
            case dkr.c -> dlx.sL;
            case dkr.d -> dlx.sM;
            case dkr.e -> dlx.sN;
            case dkr.f -> dlx.sO;
            case dkr.g -> dlx.sP;
            case dkr.h -> dlx.sQ;
            case dkr.i -> dlx.sR;
            case dkr.j -> dlx.sS;
            case dkr.l -> dlx.sU;
            case dkr.m -> dlx.sV;
            case dkr.n -> dlx.sW;
            case dkr.o -> dlx.sX;
            case dkr.p -> dlx.sY;
            case dkr.k -> dlx.sT;
        };
    }

    private static void a(cgk $$0) {
        $$0.a(bda.dE, 0.8f, 0.8f + $$0.ao().G_().i() * 0.4f);
    }

    private static void b(cgk $$0) {
        $$0.a(bda.dC, 0.8f, 0.8f + $$0.ao().G_().i() * 0.4f);
    }

    private static void c(cgk $$0) {
        $$0.a(bda.dD, 1.0f, 1.0f);
    }

    private static void a(dwo $$0, cgk $$1) {
        $$0.a(null, $$1.dK(), bda.dB, bdb.h, 0.8f, 0.8f + $$1.ao().G_().i() * 0.4f);
    }

    private void a(ddm $$0) {
        dhi $$1 = $$0.cn;
        if ($$1 != null) {
            $$1.a($$0.gK());
        }
    }
}

