/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gto
extends gti<dho> {
    private static final amo D = amo.b("textures/gui/container/beacon.png");
    static final amo E = amo.b("container/beacon/button_disabled");
    static final amo F = amo.b("container/beacon/button_selected");
    static final amo G = amo.b("container/beacon/button_highlighted");
    static final amo H = amo.b("container/beacon/button");
    static final amo I = amo.b("container/beacon/confirm");
    static final amo J = amo.b("container/beacon/cancel");
    private static final yh K = yh.c("block.minecraft.beacon.primary");
    private static final yh L = yh.c("block.minecraft.beacon.secondary");
    private final List<a> M = Lists.newArrayList();
    @Nullable jd<cfk> N;
    @Nullable jd<cfk> O;

    public gto(final dho $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        this.d = 230;
        this.e = 219;
        $$0.a(new dhx(){

            @Override
            public void a(dhi $$02, int $$1, dlt $$2) {
            }

            @Override
            public void a(dhi $$02, int $$1, int $$2) {
                gto.this.N = $$0.m();
                gto.this.O = $$0.n();
            }
        });
    }

    private <T extends gjc> void a(T $$0) {
        this.c($$0);
        this.M.add((a)((Object)$$0));
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.M.clear();
        for (int $$0 = 0; $$0 <= 2; ++$$0) {
            int $$1 = ekw.a.get($$0).size();
            int $$2 = $$1 * 22 + ($$1 - 1) * 2;
            for (int $$3 = 0; $$3 < $$1; ++$$3) {
                jd<cfk> $$4 = ekw.a.get($$0).get($$3);
                d $$5 = new d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
                $$5.k = false;
                this.a((gjc)$$5);
            }
        }
        int $$6 = 3;
        int $$7 = ekw.a.get(3).size() + 1;
        int $$8 = $$7 * 22 + ($$7 - 1) * 2;
        for (int $$9 = 0; $$9 < $$7 - 1; ++$$9) {
            jd<cfk> $$10 = ekw.a.get(3).get($$9);
            d $$11 = new d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
            $$11.k = false;
            this.a((gjc)$$11);
        }
        jd<cfk> $$12 = ekw.a.get(0).get(0);
        g $$13 = new g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
        $$13.l = false;
        this.a((gjc)$$13);
        this.a((gjc)new c(this.z + 164, this.A + 107));
        this.a((gjc)new b(this.z + 190, this.A + 107));
    }

    @Override
    public void p() {
        super.p();
        this.I();
    }

    void I() {
        int $$0 = ((dho)this.w).l();
        this.M.forEach($$1 -> $$1.a($$0));
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2) {
        $$0.a(this.q, K, 62, 10, -2039584);
        $$0.a(this.q, L, 169, 10, -2039584);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, D, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        $$0.a(new dlt(dlx.ql), $$4 + 20, $$5 + 109);
        $$0.a(new dlt(dlx.qb), $$4 + 41, $$5 + 109);
        $$0.a(new dlt(dlx.qa), $$4 + 41 + 22, $$5 + 109);
        $$0.a(new dlt(dlx.qk), $$4 + 42 + 44, $$5 + 109);
        $$0.a(new dlt(dlx.qg), $$4 + 42 + 66, $$5 + 109);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    static interface a {
        public void a(int var1);
    }

    class d
    extends e {
        private final boolean c;
        protected final int a;
        private jd<cfk> d;
        private amo f;

        public d(int $$0, int $$1, jd<cfk> $$2, boolean $$3, int $$4) {
            super($$0, $$1);
            this.c = $$3;
            this.a = $$4;
            this.a($$2);
        }

        protected void a(jd<cfk> $$0) {
            this.d = $$0;
            this.f = giq.a($$0);
            this.a(gks.a(this.b($$0), null));
        }

        protected yw b(jd<cfk> $$0) {
            return yh.c($$0.a().f());
        }

        @Override
        public void a(gza $$0) {
            if (this.a()) {
                return;
            }
            if (this.c) {
                gto.this.N = this.d;
            } else {
                gto.this.O = this.d;
            }
            gto.this.I();
        }

        @Override
        protected void b(gir $$0) {
            $$0.a(hpa.at, this.f, this.aT_() + 2, this.aU_() + 2, 18, 18);
        }

        @Override
        public void a(int $$0) {
            this.k = this.a < $$0;
            this.a(this.d.equals(this.c ? gto.this.N : gto.this.O));
        }

        @Override
        protected yw f() {
            return this.b(this.d);
        }
    }

    class g
    extends d {
        public g(int $$0, int $$1, jd<cfk> $$2) {
            super($$0, $$1, $$2, false, 3);
        }

        @Override
        protected yw b(jd<cfk> $$0) {
            return yh.c($$0.a().f()).f(" II");
        }

        @Override
        public void a(int $$0) {
            if (gto.this.N != null) {
                this.l = true;
                this.a(gto.this.N);
                super.a($$0);
            } else {
                this.l = false;
            }
        }
    }

    class c
    extends f {
        public c(int $$0, int $$1) {
            super($$0, $$1, I, yg.d);
        }

        @Override
        public void a(gza $$0) {
            gto.this.n.R().b(new ajs(Optional.ofNullable(gto.this.N), Optional.ofNullable(gto.this.O)));
            ((gto)gto.this).n.s.r();
        }

        @Override
        public void a(int $$0) {
            this.k = ((dho)gto.this.w).o() && gto.this.N != null;
        }
    }

    class b
    extends f {
        public b(int $$0, int $$1) {
            super($$0, $$1, J, yg.e);
        }

        @Override
        public void a(gza $$0) {
            ((gto)gto.this).n.s.r();
        }

        @Override
        public void a(int $$0) {
        }
    }

    static abstract class f
    extends e {
        private final amo a;

        protected f(int $$0, int $$1, amo $$2, yh $$3) {
            super($$0, $$1, $$3);
            this.a(gks.a($$3));
            this.a = $$2;
        }

        @Override
        protected void b(gir $$0) {
            $$0.a(hpa.at, this.a, this.aT_() + 2, this.aU_() + 2, 18, 18);
        }
    }

    static abstract class e
    extends giu
    implements a {
        private boolean a;

        protected e(int $$0, int $$1) {
            super($$0, $$1, 22, 22, yg.a);
        }

        protected e(int $$0, int $$1, yh $$2) {
            super($$0, $$1, 22, 22, $$2);
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            amo $$7;
            if (!this.k) {
                amo $$4 = E;
            } else if (this.a) {
                amo $$5 = F;
            } else if (this.D()) {
                amo $$6 = G;
            } else {
                $$7 = H;
            }
            $$0.a(hpa.at, $$7, this.aT_(), this.aU_(), this.g, this.h);
            this.b($$0);
        }

        protected abstract void b(gir var1);

        public boolean a() {
            return this.a;
        }

        public void a(boolean $$0) {
            this.a = $$0;
        }

        @Override
        public void a(gpd $$0) {
            this.c($$0);
        }
    }
}

