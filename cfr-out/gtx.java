/*
 * Decompiled with CFR 0.152.
 */
public class gtx
extends gti<dhz> {
    private static final amo D = amo.b("container/crafter/disabled_slot");
    private static final amo E = amo.b("container/crafter/powered_redstone");
    private static final amo F = amo.b("container/crafter/unpowered_redstone");
    private static final amo G = amo.b("textures/gui/container/crafter.png");
    private static final yh H = yh.c("gui.togglable_slot");
    private final ddm I;

    public gtx(dhz $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        this.I = $$1.j;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f = (this.d - this.q.a(this.m)) / 2;
    }

    @Override
    protected void a(dji $$0, int $$1, int $$2, dhu $$3) {
        if ($$0 instanceof dia && !$$0.h() && !this.I.au()) {
            switch ($$3) {
                case a: {
                    if (((dhz)this.w).e($$1)) {
                        this.a($$1);
                        break;
                    }
                    if (!((dhz)this.w).g().f()) break;
                    this.b($$1);
                    break;
                }
                case c: {
                    dlt $$4 = this.I.gK().a($$2);
                    if (!((dhz)this.w).e($$1) || $$4.f()) break;
                    this.a($$1);
                }
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private void a(int $$0) {
        this.a($$0, true);
    }

    private void b(int $$0) {
        this.a($$0, false);
    }

    private void a(int $$0, boolean $$1) {
        ((dhz)this.w).a($$0, $$1);
        super.a($$0, ((dhz)this.w).l, $$1);
        float $$2 = $$1 ? 1.0f : 0.75f;
        this.I.a(bda.DJ.a(), 0.4f, $$2);
    }

    @Override
    public void a(gir $$0, dji $$1, int $$2, int $$3) {
        if ($$1 instanceof dia) {
            dia $$4 = (dia)$$1;
            if (((dhz)this.w).e($$1.d)) {
                this.a($$0, $$4);
            } else {
                super.a($$0, $$1, $$2, $$3);
            }
            int $$5 = this.z + $$4.e - 2;
            int $$6 = this.A + $$4.f - 2;
            if ($$2 > $$5 && $$3 > $$6 && $$2 < $$5 + 19 && $$3 < $$6 + 19) {
                $$0.a(fyn.d);
            }
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    private void a(gir $$0, dia $$1) {
        $$0.a(hpa.at, D, $$1.e - 1, $$1.f - 1, 18, 18);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.e($$0);
        this.c($$0, $$1, $$2);
        if (this.y instanceof dia && !((dhz)this.w).e(this.y.d) && ((dhz)this.w).g().f() && !this.y.h() && !this.I.au()) {
            $$0.a(this.q, H, $$1, $$2);
        }
    }

    private void e(gir $$0) {
        amo $$4;
        int $$1 = this.o / 2 + 9;
        int $$2 = this.p / 2 - 48;
        if (((dhz)this.w).l()) {
            amo $$3 = E;
        } else {
            $$4 = F;
        }
        $$0.a(hpa.at, $$4, $$1, $$2, 16, 16);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, G, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
    }
}

