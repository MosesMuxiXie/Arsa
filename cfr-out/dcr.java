/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dcr
implements dwb {
    private static final int a = 1200;
    private int b;

    @Override
    public void a(axf $$0, boolean $$1) {
        --this.b;
        if (this.b > 0) {
            return;
        }
        this.b = 1200;
        axg $$2 = $$0.n();
        if ($$2 == null) {
            return;
        }
        bgr $$3 = $$0.y;
        int $$4 = (8 + $$3.a(24)) * ($$3.h() ? -1 : 1);
        int $$5 = (8 + $$3.a(24)) * ($$3.h() ? -1 : 1);
        is $$6 = $$2.dK().b($$4, 0, $$5);
        int $$7 = 10;
        if (!$$0.b($$6.u() - 10, $$6.w() - 10, $$6.u() + 10, $$6.w() + 10)) {
            return;
        }
        if (cih.a(cgu.x, $$0, $$6)) {
            if ($$0.a($$6, 2)) {
                this.a($$0, $$6);
            } else if ($$0.b().a($$6, beb.n).b()) {
                this.b($$0, $$6);
            }
        }
    }

    private void a(axf $$02, is $$1) {
        List<cvb> $$3;
        int $$2 = 48;
        if ($$02.F().a($$0 -> $$0.a(ctb.n), $$1, 48, csx.b.b) > 4L && ($$3 = $$02.a(cvb.class, new fth($$1).c(48.0, 8.0, 48.0))).size() < 5) {
            this.a($$1, $$02, false);
        }
    }

    private void b(axf $$0, is $$1) {
        int $$2 = 16;
        List<cvb> $$3 = $$0.a(cvb.class, new fth($$1).c(16.0, 8.0, 16.0));
        if ($$3.isEmpty()) {
            this.a($$1, $$0, true);
        }
    }

    private void a(is $$0, axf $$1, boolean $$2) {
        cvb $$3 = cgu.x.a($$1, cgt.a);
        if ($$3 == null) {
            return;
        }
        $$3.a((dxf)$$1, $$1.c($$0), cgt.a, null);
        if ($$2) {
            $$3.gz();
        }
        $$3.a($$0, 0.0f, 0.0f);
        $$1.a_($$3);
    }
}

