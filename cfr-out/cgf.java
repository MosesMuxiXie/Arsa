/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.UUID;

public abstract sealed class cgf
extends Enum<cgf> {
    public static final /* enum */ cgf a = new cgf(true){

        @Override
        void a(chn $$0, chn $$1, cge $$2) {
            cgk $$5;
            cgk $$3 = $$0.do();
            $$1.x($$0);
            $$1.k($$0.dN());
            if ($$3 != null) {
                $$3.cf();
                $$3.X = 0;
                for (cgk cgk2 : $$1.dn()) {
                    cgk2.cf();
                    cgk2.a(cgk.e.b);
                }
                $$3.o($$1);
            }
            if (($$5 = $$0.dz()) != null) {
                $$0.cf();
                $$1.a($$5, false, false);
            }
            if ($$2.b()) {
                for (cgv $$6 : cgv.j) {
                    dlt $$7 = $$0.a($$6);
                    if ($$7.f()) continue;
                    $$1.a($$6, $$7.g());
                    $$1.a($$6, $$0.an().b($$6));
                }
            }
            $$1.an = $$0.an;
            $$1.b(7, $$0.gj());
            $$1.bI = $$0.bI;
            $$1.bu = $$0.bu;
            $$1.bC = $$0.bC;
            $$1.e($$0.aV());
            $$0.gp().ifPresent($$1::g);
            cgk cgk3 = $$0.C();
            if (cgk3 != null) {
                $$1.a_(cgk3, true);
            }
            this.b($$0, $$1, $$2);
        }
    };
    public static final /* enum */ cgf b = new cgf(false){

        @Override
        void a(chn $$0, chn $$1, cge $$2) {
            cgk $$4;
            cgk $$3 = $$0.do();
            if ($$3 != null) {
                $$3.cf();
            }
            if (($$4 = $$0.C()) != null) {
                $$0.o();
            }
            this.b($$0, $$1, $$2);
        }
    };
    private static final Set<kh<?>> c;
    private final boolean d;
    private static final /* synthetic */ cgf[] e;

    public static cgf[] values() {
        return (cgf[])e.clone();
    }

    public static cgf valueOf(String $$0) {
        return Enum.valueOf(cgf.class, $$0);
    }

    cgf(boolean $$0) {
        this.d = $$0;
    }

    public boolean a() {
        return this.d;
    }

    abstract void a(chn var1, chn var2, cge var3);

    void b(chn $$0, chn $$1, cge $$2) {
        dcn $$10;
        $$1.F($$0.fX());
        for (cfm $$3 : $$0.eW()) {
            $$1.a(new cfm($$3));
        }
        if ($$0.e_()) {
            $$1.a_(true);
        }
        if ($$0 instanceof cfy) {
            cfy $$4 = (cfy)$$0;
            if ($$1 instanceof cfy) {
                cfy $$5 = (cfy)$$1;
                $$5.d_($$4.Z_());
                $$5.e = $$4.e;
                $$5.f = $$4.f;
            }
        }
        cim<UUID> $$6 = $$0.ev();
        cim<?> $$7 = $$1.ev();
        if ($$6.a(cqw.am, cqx.c) && $$6.a(cqw.am)) {
            $$7.a(cqw.am, $$6.c(cqw.am));
        }
        if ($$2.c()) {
            $$1.b_($$0.gn());
        }
        $$1.v($$0.gH());
        $$1.u($$0.gG());
        if ($$0.gA()) {
            $$1.gz();
        }
        $$1.p($$0.dd());
        $$1.d($$0.cp());
        $$1.n($$0.cU());
        $$1.g($$0.br());
        $$1.f($$0.aN());
        $$1.f($$0.bq());
        $$0.aB().forEach($$1::a);
        for (kh<?> $$8 : c) {
            cgf.a($$0, $$1, $$8);
        }
        if ($$2.d() != null) {
            fur $$9 = $$1.ao().ab();
            $$9.a($$1.cZ(), $$2.d());
            if ($$0.cI() != null && $$0.cI() == $$2.d()) {
                $$9.b($$0.cZ(), $$0.cI());
            }
        }
        if ($$0 instanceof dcn && ($$10 = (dcn)$$0).gX() && $$1 instanceof dcn) {
            dcn $$11 = (dcn)$$1;
            $$11.y(true);
        }
    }

    private static <T> void a(chn $$0, chn $$1, kh<T> $$2) {
        T $$3 = $$0.a($$2);
        if ($$3 != null) {
            $$1.d($$2, $$3);
        }
    }

    private static /* synthetic */ cgf[] b() {
        return new cgf[]{a, b};
    }

    static {
        e = cgf.b();
        c = Set.of(ki.h, ki.b);
    }
}

