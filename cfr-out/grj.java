/*
 * Decompiled with CFR 0.152.
 */
public class grj
extends gsb {
    private static final yh a = yh.c("gui.toMenu");
    private static final yh b = yh.c("gui.toTitle");
    private static final yh c = yh.c("gui.report_to_server");
    private static final yh d = yh.c("gui.open_report_dir");
    private final gsb e;
    private final ww f;
    private final yh t;
    private final goy u = goy.d();

    public grj(gsb $$0, yh $$1, yh $$2) {
        this($$0, $$1, new ww($$2));
    }

    public grj(gsb $$0, yh $$1, yh $$2, yh $$3) {
        this($$0, $$1, new ww($$2), $$3);
    }

    public grj(gsb $$0, yh $$1, ww $$2) {
        this($$0, $$1, $$2, a);
    }

    public grj(gsb $$0, yh $$1, ww $$2, yh $$3) {
        super($$1);
        this.e = $$0;
        this.f = $$2;
        this.t = $$3;
    }

    @Override
    protected void bg_() {
        gje $$1;
        this.u.c().b().a(10);
        this.u.a(new gko(this.m, this.q));
        this.u.a(new gjz(this.f.a(), this.q).a(this.o - 50).a(true));
        this.u.c().a(2);
        this.f.c().ifPresent($$0 -> this.u.a(gje.a(c, gqz.b((gsb)this, $$0, false)).a(200).a()));
        this.f.b().ifPresent($$0 -> this.u.a(gje.a(d, (gje $$1) -> bhs.n().a($$0.getParent())).a(200).a()));
        if (this.n.K()) {
            gje $$02 = gje.a(this.t, (gje $$0) -> this.n.a(this.e)).a(200).a();
        } else {
            $$1 = gje.a(b, (gje $$0) -> this.n.a(new gsd())).a(200).a();
        }
        this.u.a($$1);
        this.u.a();
        this.u.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        gos.a(this.u, this.aV_());
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.m, this.f.a()});
    }

    @Override
    public boolean aY_() {
        return false;
    }
}

