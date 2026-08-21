/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class dif
extends dhi {
    static final amo p = amo.b("container/slot/lapis_lazuli");
    private final ccv q = new cdk(2){

        @Override
        public void e() {
            super.e();
            dif.this.a(this);
        }
    };
    private final dhw r;
    private final bgr s = bgr.a();
    private final did t = did.a();
    public final int[] m = new int[3];
    public final int[] n = new int[]{-1, -1, -1};
    public final int[] o = new int[]{-1, -1, -1};

    public dif(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public dif(int $$0, ddl $$1, dhw $$2) {
        super(dis.n, $$0);
        this.r = $$2;
        this.a(new dji(this, this.q, 0, 15, 47){

            @Override
            public int a() {
                return 1;
            }
        });
        this.a(new dji(this, this.q, 1, 35, 47){

            @Override
            public boolean a(dlt $$0) {
                return $$0.a(dlx.qc);
            }

            @Override
            public amo c() {
                return p;
            }
        });
        this.c($$1, 8, 84);
        this.a(did.a(this.m, 0));
        this.a(did.a(this.m, 1));
        this.a(did.a(this.m, 2));
        this.a(this.t).a($$1.j.gT());
        this.a(did.a(this.n, 0));
        this.a(did.a(this.n, 1));
        this.a(did.a(this.n, 2));
        this.a(did.a(this.o, 0));
        this.a(did.a(this.o, 1));
        this.a(did.a(this.o, 2));
    }

    @Override
    public void a(ccv $$0) {
        if ($$0 == this.q) {
            dlt $$12 = $$0.a(0);
            if ($$12.f() || !$$12.E()) {
                for (int $$22 = 0; $$22 < 3; ++$$22) {
                    this.m[$$22] = 0;
                    this.n[$$22] = -1;
                    this.o[$$22] = -1;
                }
            } else {
                this.r.a((dwo $$1, is $$2) -> {
                    ji<jd<dso>> $$3 = $$1.J_().f(mj.bf).t();
                    int $$4 = 0;
                    for (is $$5 : ech.b) {
                        if (!ech.a($$1, $$2, $$5)) continue;
                        ++$$4;
                    }
                    this.s.b((long)this.t.b());
                    for (int $$6 = 0; $$6 < 3; ++$$6) {
                        this.m[$$6] = dsq.a(this.s, $$6, $$4, $$12);
                        this.n[$$6] = -1;
                        this.o[$$6] = -1;
                        if (this.m[$$6] >= $$6 + 1) continue;
                        this.m[$$6] = 0;
                    }
                    for (int $$7 = 0; $$7 < 3; ++$$7) {
                        List<dsr> $$8;
                        if (this.m[$$7] <= 0 || ($$8 = this.a($$1.J_(), $$12, $$7, this.m[$$7])).isEmpty()) continue;
                        dsr $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.b());
                        this.o[$$7] = $$9.c();
                    }
                    this.d();
                });
            }
        }
    }

    @Override
    public boolean a(ddm $$0, int $$1) {
        if ($$1 < 0 || $$1 >= this.m.length) {
            bhs.b($$0.aq() + " pressed invalid button id: " + $$1);
            return false;
        }
        dlt $$2 = this.q.a(0);
        dlt $$3 = this.q.a(1);
        int $$4 = $$1 + 1;
        if (($$3.f() || $$3.N() < $$4) && !$$0.gv()) {
            return false;
        }
        if (this.m[$$1] > 0 && !$$2.f() && ($$0.cs >= $$4 && $$0.cs >= this.m[$$1] || $$0.gv())) {
            this.r.a((dwo $$5, is $$6) -> {
                dlt $$7 = $$2;
                List<dsr> $$8 = this.a($$5.J_(), $$7, $$1, this.m[$$1]);
                if (!$$8.isEmpty()) {
                    $$0.a($$7, $$4);
                    if ($$7.a(dlx.sB)) {
                        $$7 = $$2.a((dwn)dlx.wI);
                        this.q.a(0, $$7);
                    }
                    for (dsr $$9 : $$8) {
                        $$7.a($$9.b(), $$9.c());
                    }
                    $$3.a($$4, (chl)$$0);
                    if ($$3.f()) {
                        this.q.a(1, dlt.l);
                    }
                    $$0.a(bdk.am);
                    if ($$0 instanceof axg) {
                        aj.j.a((axg)$$0, $$7, $$4);
                    }
                    this.q.e();
                    this.t.a($$0.gT());
                    this.a(this.q);
                    $$5.a(null, (is)$$6, bda.jF, bdb.e, 1.0f, $$5.y.i() * 0.1f + 0.9f);
                }
            });
            return true;
        }
        return false;
    }

    private List<dsr> a(jr $$0, dlt $$1, int $$2, int $$3) {
        this.s.b((long)(this.t.b() + $$2));
        Optional $$4 = $$0.f(mj.bf).a(bds.k);
        if ($$4.isEmpty()) {
            return List.of();
        }
        List<dsr> $$5 = dsq.b(this.s, $$1, $$3, ((jh.c)$$4.get()).a());
        if ($$1.a(dlx.sB) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
        }
        return $$5;
    }

    public int l() {
        dlt $$0 = this.q.a(1);
        if ($$0.f()) {
            return 0;
        }
        return $$0.N();
    }

    public int m() {
        return this.t.b();
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.r.a((dwo $$1, is $$2) -> this.a($$0, this.q));
    }

    @Override
    public boolean b(ddm $$0) {
        return dif.a(this.r, $$0, dzs.gg);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 0) {
                if (!this.a($$4, 2, 38, true)) {
                    return dlt.l;
                }
            } else if ($$1 == 1) {
                if (!this.a($$4, 2, 38, true)) {
                    return dlt.l;
                }
            } else if ($$4.a(dlx.qc)) {
                if (!this.a($$4, 1, 2, true)) {
                    return dlt.l;
                }
            } else if (!((dji)this.k.get(0)).h() && ((dji)this.k.get(0)).a($$4)) {
                dlt $$5 = $$4.c(1);
                $$4.h(1);
                ((dji)this.k.get(0)).e($$5);
            } else {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            } else {
                $$3.d();
            }
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }
}

