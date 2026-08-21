/*
 * Decompiled with CFR 0.152.
 */
public class evb
implements dwb {
    private int a;

    @Override
    public void a(axf $$0, boolean $$1) {
        if (!$$1) {
            return;
        }
        if (!$$0.U().a(eua.X).booleanValue()) {
            return;
        }
        bgr $$2 = $$0.y;
        --this.a;
        if (this.a > 0) {
            return;
        }
        this.a += 12000 + $$2.a(1200);
        if (!$$0.ag()) {
            return;
        }
        if ($$2.a(5) != 0) {
            return;
        }
        int $$3 = $$0.E().size();
        if ($$3 < 1) {
            return;
        }
        ddm $$4 = $$0.E().get($$2.a($$3));
        if ($$4.au()) {
            return;
        }
        if ($$0.a($$4.dK(), 2)) {
            return;
        }
        int $$5 = (24 + $$2.a(24)) * ($$2.h() ? -1 : 1);
        int $$6 = (24 + $$2.a(24)) * ($$2.h() ? -1 : 1);
        is.a $$7 = $$4.dK().k().e($$5, 0, $$6);
        int $$8 = 10;
        if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
            return;
        }
        if (!$$0.c().a(ceg.Q, $$7).booleanValue()) {
            return;
        }
        int $$9 = (int)Math.ceil($$0.c($$7).b()) + 1;
        for (int $$10 = 0; $$10 < $$9; ++$$10) {
            $$7.q($$0.a(euq.a.f, (is)$$7).v());
            if ($$10 == 0) {
                if (!this.a($$0, $$7, $$2, true)) {
                    break;
                }
            } else {
                this.a($$0, $$7, $$2, false);
            }
            $$7.p($$7.u() + $$2.a(5) - $$2.a(5));
            $$7.r($$7.w() + $$2.a(5) - $$2.a(5));
        }
    }

    private boolean a(axf $$0, is $$1, bgr $$2, boolean $$3) {
        eoh $$4 = $$0.a_($$1);
        if (!dwz.a($$0, $$1, $$4, $$4.y(), cgu.bb)) {
            return false;
        }
        if (!daa.b(cgu.bb, (dwp)$$0, cgt.p, $$1, $$2)) {
            return false;
        }
        daa $$5 = cgu.bb.a($$0, cgt.p);
        if ($$5 != null) {
            if ($$3) {
                $$5.x(true);
                $$5.gT();
            }
            $$5.a_($$1.u(), $$1.v(), $$1.w());
            $$5.a((dxf)$$0, $$0.c($$1), cgt.p, null);
            $$0.a_($$5);
            return true;
        }
        return false;
    }
}

