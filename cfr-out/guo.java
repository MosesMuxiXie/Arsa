/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class guo
extends gts
implements guq<dip> {
    private static final int w = 4;
    private static final int x = 98;
    private static final yh y = yh.c("lectern.take_book");
    private final dip z;
    private final dhx A = new dhx(){

        @Override
        public void a(dhi $$0, int $$1, dlt $$2) {
            guo.this.N();
        }

        @Override
        public void a(dhi $$0, int $$1, int $$2) {
            if ($$1 == 0) {
                guo.this.O();
            }
        }
    };

    public guo(dip $$0, ddl $$1, yh $$2) {
        this.z = $$0;
    }

    public dip M() {
        return this.z;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.z.a(this.A);
    }

    @Override
    public void aX_() {
        this.n.s.r();
        super.aX_();
    }

    @Override
    public void aZ_() {
        super.aZ_();
        this.z.b(this.A);
    }

    @Override
    protected void o() {
        if (this.n.s.gY()) {
            int $$02 = this.K();
            int $$1 = this.o / 2;
            this.c(gje.a(yg.d, (gje $$0) -> this.aX_()).a($$1 - 98 - 2, $$02).a(98).a());
            this.c(gje.a(y, (gje $$0) -> this.c(3)).a($$1 + 2, $$02).a(98).a());
        } else {
            super.o();
        }
    }

    @Override
    protected void I() {
        this.c(1);
    }

    @Override
    protected void J() {
        this.c(2);
    }

    @Override
    protected boolean b(int $$0) {
        if ($$0 != this.z.m()) {
            this.c(100 + $$0);
            return true;
        }
        return false;
    }

    private void c(int $$0) {
        this.n.q.a(this.z.l, $$0);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    void N() {
        dlt $$0 = this.z.l();
        this.a(Objects.requireNonNullElse(gts.a.a($$0), gts.d));
    }

    void O() {
        this.a(this.z.m());
    }

    @Override
    protected void L() {
        this.n.s.r();
    }

    @Override
    public /* synthetic */ dhi F() {
        return this.M();
    }
}

