/*
 * Decompiled with CFR 0.152.
 */
public class gkq
extends gjc.a {
    private static final gku a = new gku(amo.b("widget/tab_selected"), amo.b("widget/tab"), amo.b("widget/tab_selected_highlighted"), amo.b("widget/tab_highlighted"));
    private static final int b = 3;
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 4;
    private static final int f = 2;
    private final gmu n;
    private final gmt o;

    public gkq(gmu $$0, gmt $$1, int $$2, int $$3) {
        super(0, 0, $$2, $$3, $$1.b());
        this.n = $$0;
        this.o = $$1;
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        int $$5;
        $$0.a(hpa.at, a.a(this.d(), this.D()), this.aT_(), this.aU_(), this.g, this.h);
        gio $$4 = gfj.V().g;
        int n2 = $$5 = this.k ? -1 : -6250336;
        if (this.d()) {
            this.a($$0, this.aT_() + 2, this.aU_() + 2, this.E() - 2, this.F());
            this.a($$0, $$4, $$5);
        }
        this.a($$0.a(this, gir.a.a));
        this.d($$0);
    }

    protected void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        gsb.a($$0, gsb.g, $$1, $$2, 0.0f, 0.0f, $$3 - $$1, $$4 - $$2);
    }

    private void a(gil $$0) {
        int $$1 = this.aT_() + 1;
        int $$2 = this.aU_() + (this.d() ? 0 : 3);
        int $$3 = this.aT_() + this.aS_() - 1;
        int $$4 = this.aU_() + this.aR_();
        $$0.a(this.B(), $$1, $$3, $$2, $$4);
    }

    private void a(gir $$0, gio $$1, int $$2) {
        int $$3 = Math.min($$1.a(this.B()), this.aS_() - 4);
        int $$4 = this.aT_() + (this.aS_() - $$3) / 2;
        int $$5 = this.aU_() + this.aR_() - 2;
        $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, (yh)yh.a("gui.narrate.tab", this.o.b()));
        $$0.a(gpc.c, this.o.bd_());
    }

    @Override
    public void a(iqr $$0) {
    }

    public gmt a() {
        return this.o;
    }

    public boolean d() {
        return this.n.a() == this.o;
    }
}

