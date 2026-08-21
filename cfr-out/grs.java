/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class grs
extends gsb {
    private static final yh a = yh.c("manageServer.enterName");
    private static final yh b = yh.c("manageServer.enterIp");
    private static final yh c = yh.c("selectServer.defaultName");
    private gje d;
    private final BooleanConsumer e;
    private final hit f;
    private gjn t;
    private gjn u;
    private final gsb v;

    public grs(gsb $$0, yh $$1, BooleanConsumer $$2, hit $$3) {
        super($$1);
        this.v = $$0;
        this.e = $$2;
        this.f = $$3;
    }

    @Override
    protected void bg_() {
        this.u = new gjn(this.q, this.o / 2 - 100, 66, 200, 20, a);
        this.u.a(this.f.a);
        this.u.c(c);
        this.u.b((String $$0) -> this.p());
        this.d(this.u);
        this.t = new gjn(this.q, this.o / 2 - 100, 106, 200, 20, b);
        this.t.k(128);
        this.t.a(this.f.b);
        this.t.b((String $$0) -> this.p());
        this.d(this.t);
        this.c(gjl.a(hit.a::a, this.f.b()).a((hit.a[])hit.a.values()).a(this.o / 2 - 100, this.p / 4 + 72, 200, 20, yh.c("manageServer.resourcePack"), ($$0, $$1) -> this.f.a((hit.a)((Object)$$1))));
        this.d = this.c(gje.a(yg.d, (gje $$0) -> this.o()).a(this.o / 2 - 100, this.p / 4 + 96 + 18, 200, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.e.accept(false)).a(this.o / 2 - 100, this.p / 4 + 120 + 18, 200, 20).a());
        this.p();
    }

    @Override
    protected void aI_() {
        this.b(this.u);
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.t.a();
        String $$3 = this.u.a();
        this.b($$0, $$1);
        this.t.a($$2);
        this.u.a($$3);
    }

    private void o() {
        String $$0 = this.u.a();
        this.f.a = $$0.isEmpty() ? c.getString() : $$0;
        this.f.b = this.t.a();
        this.e.accept(true);
    }

    @Override
    public void aX_() {
        this.n.a(this.v);
    }

    private void p() {
        this.d.k = hjw.b(this.t.a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 17, -1);
        $$0.b(this.q, a, this.o / 2 - 100 + 1, 53, -6250336);
        $$0.b(this.q, b, this.o / 2 - 100 + 1, 94, -6250336);
        this.u.a($$0, $$1, $$2, $$3);
        this.t.a($$0, $$1, $$2, $$3);
    }
}

