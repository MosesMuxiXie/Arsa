/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class gri
extends gsb {
    private static final yh a = yh.c("manageServer.enterIp");
    private gje b;
    private final hit c;
    private gjn d;
    private final BooleanConsumer e;
    private final gsb f;

    public gri(gsb $$0, BooleanConsumer $$1, hit $$2) {
        super(yh.c("selectServer.direct"));
        this.f = $$0;
        this.c = $$2;
        this.e = $$1;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.b.k && this.aO_() == this.d && $$0.d()) {
            this.o();
            return true;
        }
        return super.a($$0);
    }

    @Override
    protected void bg_() {
        this.d = new gjn(this.q, this.o / 2 - 100, 116, 200, 20, a);
        this.d.k(128);
        this.d.a(this.n.k.av);
        this.d.b((String $$0) -> this.p());
        this.d(this.d);
        this.b = this.c(gje.a(yh.c("selectServer.select"), (gje $$0) -> this.o()).a(this.o / 2 - 100, this.p / 4 + 96 + 12, 200, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.e.accept(false)).a(this.o / 2 - 100, this.p / 4 + 120 + 12, 200, 20).a());
        this.p();
    }

    @Override
    protected void aI_() {
        this.b(this.d);
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.d.a();
        this.b($$0, $$1);
        this.d.a($$2);
    }

    private void o() {
        this.c.b = this.d.a();
        this.e.accept(true);
    }

    @Override
    public void aX_() {
        this.n.a(this.f);
    }

    @Override
    public void aZ_() {
        this.n.k.av = this.d.a();
        this.n.k.aQ();
    }

    private void p() {
        this.b.k = hjw.b(this.d.a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 20, -1);
        $$0.b(this.q, a, this.o / 2 - 100 + 1, 100, -6250336);
        this.d.a($$0, $$1, $$2, $$3);
    }
}

