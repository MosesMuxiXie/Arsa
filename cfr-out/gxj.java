/*
 * Decompiled with CFR 0.152.
 */
public class gxj
extends gsb {
    private static final yh a = yh.c("gui.abuseReport.title");
    private static final yh b = yh.c("gui.abuseReport.message");
    private static final yh c = yh.c("gui.abuseReport.type.chat");
    private static final yh d = yh.c("gui.abuseReport.type.skin");
    private static final yh e = yh.c("gui.abuseReport.type.name");
    private static final int f = 6;
    private final gsb t;
    private final hjn u;
    private final gxn v;
    private final goy w = goy.d().a(6);

    public gxj(gsb $$0, hjn $$1, gxn $$2) {
        super(a);
        this.t = $$0;
        this.u = $$1;
        this.v = $$2;
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), b});
    }

    @Override
    protected void bg_() {
        this.w.c().b();
        this.w.a(new gko(this.m, this.q), this.w.b().e(6));
        this.w.a(new gjz(b, this.q).a(true), this.w.b().e(6));
        gje $$02 = this.w.a(gje.a(c, (gje $$0) -> this.n.a(new gxf(this.t, this.u, this.v.t()))).a());
        if (!this.v.x()) {
            $$02.k = false;
            $$02.a(gks.a(yh.c("gui.socialInteractions.tooltip.report.not_reportable")));
        } else if (!this.v.w()) {
            $$02.k = false;
            $$02.a(gks.a(yh.a("gui.socialInteractions.tooltip.report.no_messages", new Object[]{this.v.c()})));
        }
        this.w.a(gje.a(d, (gje $$0) -> this.n.a(new gxl(this.t, this.u, this.v.t(), this.v.u()))).a());
        this.w.a(gje.a(e, (gje $$0) -> this.n.a(new gxi(this.t, this.u, this.v.t(), this.v.c()))).a());
        this.w.a(goz.b(20));
        this.w.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a());
        this.w.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.w.a();
        gos.a(this.w, this.aV_());
    }

    @Override
    public void aX_() {
        this.n.a(this.t);
    }
}

