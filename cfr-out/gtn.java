/*
 * Decompiled with CFR 0.152.
 */
public class gtn
extends gum<dhm> {
    private static final amo D = amo.b("container/anvil/text_field");
    private static final amo E = amo.b("container/anvil/text_field_disabled");
    private static final amo F = amo.b("container/anvil/error");
    private static final amo G = amo.b("textures/gui/container/anvil.png");
    private static final yh H = yh.c("container.repair.expensive");
    private gjn I;
    private final ddm J;

    public gtn(dhm $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2, G);
        this.J = $$1.j;
        this.f = 60;
    }

    @Override
    protected void I() {
        int $$0 = (this.o - this.d) / 2;
        int $$1 = (this.p - this.e) / 2;
        this.I = new gjn(this.q, $$0 + 62, $$1 + 24, 103, 12, yh.c("container.repair"));
        this.I.i(false);
        this.I.l(-1);
        this.I.m(-1);
        this.I.h(false);
        this.I.d(false);
        this.I.k(50);
        this.I.b(this::a);
        this.I.a("");
        this.c(this.I);
        this.I.e(((dhm)this.w).b(0).h());
    }

    @Override
    protected void p() {
        super.p();
        this.n.s.f = this.n.s.at;
    }

    @Override
    protected void aI_() {
        this.b(this.I);
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.I.a();
        this.b($$0, $$1);
        this.I.a($$2);
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.e()) {
            this.n.s.r();
            return true;
        }
        if (this.I.a($$0) || this.I.d()) {
            return true;
        }
        return super.a($$0);
    }

    private void a(String $$0) {
        dji $$1 = ((dhm)this.w).b(0);
        if (!$$1.h()) {
            return;
        }
        String $$2 = $$0;
        if (!$$1.g().c(ki.h) && $$2.equals($$1.g().y().getString())) {
            $$2 = "";
        }
        if (((dhm)this.w).a($$2)) {
            this.n.s.b.b(new ajo($$2));
        }
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2) {
        super.d($$0, $$1, $$2);
        int $$3 = ((dhm)this.w).m();
        if ($$3 > 0) {
            yw $$7;
            int $$4 = -8323296;
            if ($$3 >= 40 && !this.n.s.gv()) {
                yh $$5 = H;
                $$4 = -40864;
            } else if (!((dhm)this.w).b(2).h()) {
                Object $$6 = null;
            } else {
                $$7 = yh.a("container.repair.cost", $$3);
                if (!((dhm)this.w).b(2).a(this.J)) {
                    $$4 = -40864;
                }
            }
            if ($$7 != null) {
                int $$8 = this.d - 8 - this.q.a($$7) - 2;
                int $$9 = 69;
                $$0.a($$8 - 2, 67, this.d - 8, 79, 0x4F000000);
                $$0.b(this.q, $$7, $$8, 69, $$4);
            }
        }
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, ((dhm)this.w).b(0).h() ? D : E, this.z + 59, this.A + 20, 110, 16);
    }

    @Override
    protected void e(gir $$0, int $$1, int $$2) {
        if ((((dhm)this.w).b(0).h() || ((dhm)this.w).b(1).h()) && !((dhm)this.w).b(((dhm)this.w).n()).h()) {
            $$0.a(hpa.at, F, $$1 + 99, $$2 + 45, 28, 21);
        }
    }

    @Override
    public void a(dhi $$0, int $$1, dlt $$2) {
        if ($$1 == 0) {
            this.I.a($$2.f() ? "" : $$2.y().getString());
            this.I.e(!$$2.f());
            this.a(this.I);
        }
    }
}

