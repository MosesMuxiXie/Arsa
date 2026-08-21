/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class diq
extends dhi {
    private static final int m = -1;
    private static final int n = 4;
    private static final int o = 31;
    private static final int p = 31;
    private static final int q = 40;
    private final dhw r;
    final did s = did.a();
    private List<jd<ekq>> t = List.of();
    Runnable u = () -> {};
    private final je<ekq> v;
    final dji w;
    final dji x;
    private final dji y;
    private final dji z;
    long A;
    private final ccv B = new cdk(3){

        @Override
        public void e() {
            super.e();
            diq.this.a(this);
            diq.this.u.run();
        }
    };
    private final ccv C = new cdk(1){

        @Override
        public void e() {
            super.e();
            diq.this.u.run();
        }
    };

    public diq(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public diq(int $$0, ddl $$1, final dhw $$2) {
        super(dis.s, $$0);
        this.r = $$2;
        this.w = this.a(new dji(this, this.B, 0, 13, 26){

            @Override
            public boolean a(dlt $$0) {
                return $$0.h() instanceof djz;
            }
        });
        this.x = this.a(new dji(this, this.B, 1, 33, 26){

            @Override
            public boolean a(dlt $$0) {
                return $$0.h() instanceof dks;
            }
        });
        this.y = this.a(new dji(this, this.B, 2, 23, 45){

            @Override
            public boolean a(dlt $$0) {
                return $$0.c(ki.am);
            }
        });
        this.z = this.a(new dji(this.C, 0, 143, 57){

            @Override
            public boolean a(dlt $$0) {
                return false;
            }

            @Override
            public void a(ddm $$02, dlt $$12) {
                diq.this.w.a(1);
                diq.this.x.a(1);
                if (!diq.this.w.h() || !diq.this.x.h()) {
                    diq.this.s.a(-1);
                }
                $$2.a((dwo $$0, is $$1) -> {
                    long $$22 = $$0.au();
                    if (diq.this.A != $$22) {
                        $$0.a(null, (is)$$1, bda.DL, bdb.e, 1.0f, 1.0f);
                        diq.this.A = $$22;
                    }
                });
                super.a($$02, $$12);
            }
        });
        this.c($$1, 8, 84);
        this.a(this.s);
        this.v = $$1.j.eo().f(mj.aR);
    }

    @Override
    public boolean b(ddm $$0) {
        return diq.a(this.r, $$0, dzs.oQ);
    }

    @Override
    public boolean a(ddm $$0, int $$1) {
        if ($$1 >= 0 && $$1 < this.t.size()) {
            this.s.a($$1);
            this.a(this.t.get($$1));
            return true;
        }
        return false;
    }

    private List<jd<ekq>> b(dlt $$0) {
        if ($$0.f()) {
            return (List)this.v.a(bdn.a).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        bef<ekq> $$1 = $$0.a(ki.am);
        if ($$1 != null) {
            return (List)this.v.a($$1).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        return List.of();
    }

    private boolean e(int $$0) {
        return $$0 >= 0 && $$0 < this.t.size();
    }

    @Override
    public void a(ccv $$0) {
        jd<ekq> $$12;
        dlt $$1 = this.w.g();
        dlt $$2 = this.x.g();
        dlt $$3 = this.y.g();
        if ($$1.f() || $$2.f()) {
            this.z.f(dlt.l);
            this.t = List.of();
            this.s.a(-1);
            return;
        }
        int $$4 = this.s.b();
        boolean $$5 = this.e($$4);
        List<jd<ekq>> $$6 = this.t;
        this.t = this.b($$3);
        if (this.t.size() == 1) {
            this.s.a(0);
            jd<ekq> $$7 = this.t.get(0);
        } else if (!$$5) {
            this.s.a(-1);
            Object $$8 = null;
        } else {
            jd<ekq> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
                jd<ekq> $$11 = $$9;
                this.s.a($$10);
            } else {
                $$12 = null;
                this.s.a(-1);
            }
        }
        if ($$12 != null) {
            boolean $$14;
            ekr $$13 = $$1.a(ki.at, ekr.a);
            boolean bl2 = $$14 = $$13.b().size() >= 6;
            if ($$14) {
                this.s.a(-1);
                this.z.f(dlt.l);
            } else {
                this.a($$12);
            }
        } else {
            this.z.f(dlt.l);
        }
        this.d();
    }

    public List<jd<ekq>> l() {
        return this.t;
    }

    public int m() {
        return this.s.b();
    }

    public void a(Runnable $$0) {
        this.u = $$0;
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == this.z.d) {
                if (!this.a($$4, 4, 40, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 == this.x.d || $$1 == this.w.d || $$1 == this.y.d ? !this.a($$4, 4, 40, false) : ($$4.h() instanceof djz ? !this.a($$4, this.w.d, this.w.d + 1, false) : ($$4.h() instanceof dks ? !this.a($$4, this.x.d, this.x.d + 1, false) : ($$4.c(ki.am) ? !this.a($$4, this.y.d, this.y.d + 1, false) : ($$1 >= 4 && $$1 < 31 ? !this.a($$4, 31, 40, false) : $$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)))))) {
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

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.r.a((dwo $$1, is $$2) -> this.a($$0, this.B));
    }

    private void a(jd<ekq> $$0) {
        dlt $$1 = this.w.g();
        dlt $$22 = this.x.g();
        dlt $$3 = dlt.l;
        if (!$$1.f() && !$$22.f()) {
            $$3 = $$1.c(1);
            dkr $$4 = ((dks)$$22.h()).a();
            $$3.a(ki.at, ekr.a, $$2 -> new ekr.a().a((ekr)$$2).a($$0, $$4).a());
        }
        if (!dlt.a($$3, this.z.g())) {
            this.z.f($$3);
        }
    }

    public dji n() {
        return this.w;
    }

    public dji o() {
        return this.x;
    }

    public dji p() {
        return this.y;
    }

    public dji q() {
        return this.z;
    }
}

