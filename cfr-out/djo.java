/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class djo
extends dhi {
    public static final int m = 0;
    public static final int n = 1;
    private static final int r = 2;
    private static final int s = 29;
    private static final int t = 29;
    private static final int u = 38;
    private final dhw v;
    final did w = did.a();
    private final dwo x;
    private drf.b<drs> y = drf.b.a();
    private dlt z = dlt.l;
    long A;
    final dji o;
    final dji p;
    Runnable B = () -> {};
    public final ccv q = new cdk(1){

        @Override
        public void e() {
            super.e();
            djo.this.a(this);
            djo.this.B.run();
        }
    };
    final djd C = new djd();

    public djo(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public djo(int $$0, ddl $$1, final dhw $$2) {
        super(dis.y, $$0);
        this.v = $$2;
        this.x = $$1.j.ao();
        this.o = this.a(new dji(this.q, 0, 20, 33));
        this.p = this.a(new dji(this.C, 1, 143, 33){

            @Override
            public boolean a(dlt $$0) {
                return false;
            }

            @Override
            public void a(ddm $$02, dlt $$12) {
                $$12.a($$02, $$12.N());
                djo.this.C.a($$02, this.j());
                dlt $$22 = djo.this.o.a(1);
                if (!$$22.f()) {
                    djo.this.f(djo.this.w.b());
                }
                $$2.a((dwo $$0, is $$1) -> {
                    long $$22 = $$0.au();
                    if (djo.this.A != $$22) {
                        $$0.a(null, (is)$$1, bda.DN, bdb.e, 1.0f, 1.0f);
                        djo.this.A = $$22;
                    }
                });
                super.a($$02, $$12);
            }

            private List<dlt> j() {
                return List.of(djo.this.o.g());
            }
        });
        this.c($$1, 8, 84);
        this.a(this.w);
    }

    public int l() {
        return this.w.b();
    }

    public drf.b<drs> m() {
        return this.y;
    }

    public int n() {
        return this.y.d();
    }

    public boolean o() {
        return this.o.h() && !this.y.c();
    }

    @Override
    public boolean b(ddm $$0) {
        return djo.a(this.v, $$0, dzs.oZ);
    }

    @Override
    public boolean a(ddm $$0, int $$1) {
        if (this.w.b() == $$1) {
            return false;
        }
        if (this.e($$1)) {
            this.w.a($$1);
            this.f($$1);
        }
        return true;
    }

    private boolean e(int $$0) {
        return $$0 >= 0 && $$0 < this.y.d();
    }

    @Override
    public void a(ccv $$0) {
        dlt $$1 = this.o.g();
        if (!$$1.a(this.z.h())) {
            this.z = $$1.v();
            this.b($$1);
        }
    }

    private void b(dlt $$0) {
        this.w.a(-1);
        this.p.f(dlt.l);
        this.y = !$$0.f() ? this.x.aa().a().b($$0) : drf.b.a();
    }

    void f(int $$02) {
        Optional<dqx> $$3;
        if (!this.y.c() && this.e($$02)) {
            drf.a<drs> $$1 = this.y.e().get($$02);
            Optional<dqx<drs>> $$2 = $$1.c().c();
        } else {
            $$3 = Optional.empty();
        }
        $$3.ifPresentOrElse($$0 -> {
            this.C.a((dqx<?>)$$0);
            this.p.f(((drs)$$0.b()).a(new drl(this.q.a(0)), (jf.a)this.x.J_()));
        }, () -> {
            this.p.f(dlt.l);
            this.C.a((dqx<?>)null);
        });
        this.d();
    }

    @Override
    public dis<?> a() {
        return dis.y;
    }

    public void a(Runnable $$0) {
        this.B = $$0;
    }

    @Override
    public boolean a(dlt $$0, dji $$1) {
        return $$1.c != this.C && super.a($$0, $$1);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            dlp $$5 = $$4.h();
            $$2 = $$4.v();
            if ($$1 == 1) {
                $$5.c($$4, $$0);
                if (!this.a($$4, 2, 38, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 == 0 ? !this.a($$4, 2, 38, false) : (this.x.aa().a().a($$4) ? !this.a($$4, 0, 1, false) : ($$1 >= 2 && $$1 < 29 ? !this.a($$4, 29, 38, false) : $$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            }
            $$3.d();
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
            if ($$1 == 1) {
                $$0.a($$4, false);
            }
            this.d();
        }
        return $$2;
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.C.b(1);
        this.v.a((dwo $$1, is $$2) -> this.a($$0, this.q));
    }
}

