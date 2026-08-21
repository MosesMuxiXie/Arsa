/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class gtr
extends gsb {
    private static final yh a = yh.c("book.editTitle");
    private static final yh b = yh.c("book.finalizeWarning");
    private static final yh c = yh.c("book.sign.title");
    private static final yh d = yh.c("book.sign.titlebox");
    private final gtq e;
    private final ddm f;
    private final List<String> t;
    private final cdb u;
    private final yh v;
    private gjn w;
    private String x = "";

    public gtr(gtq $$0, ddm $$1, cdb $$2, List<String> $$3) {
        super(c);
        this.e = $$0;
        this.f = $$1;
        this.u = $$2;
        this.t = $$3;
        this.v = yh.a("book.byAuthor", $$1.ap()).a(l.i);
    }

    @Override
    protected void bg_() {
        gje $$02 = gje.a(yh.c("book.finalizeButton"), (gje $$0) -> {
            this.o();
            this.n.a((gsb)null);
        }).a(this.o / 2 - 100, 196, 98, 20).a();
        $$02.k = false;
        this.w = this.c(new gjn(this.n.g, (this.o - 114) / 2 - 3, 50, 114, 20, d));
        this.w.k(15);
        this.w.d(false);
        this.w.f(true);
        this.w.l(-16777216);
        this.w.g(false);
        this.w.b((String $$1) -> {
            $$0.k = !bhi.h($$1);
        });
        this.w.a(this.x);
        this.c($$02);
        this.c(gje.a(yg.e, (gje $$0) -> {
            this.x = this.w.a();
            this.n.a(this.e);
        }).a(this.o / 2 + 2, 196, 98, 20).a());
    }

    @Override
    protected void aI_() {
        this.b(this.w);
    }

    private void o() {
        int $$0 = this.u == cdb.a ? this.f.gK().g() : 40;
        this.n.R().b(new aiw($$0, this.t, Optional.of(this.w.a().trim())));
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.w.aP_() && !this.w.a().isEmpty() && $$0.d()) {
            this.o();
            this.n.a((gsb)null);
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        int $$4 = (this.o - 192) / 2;
        int $$5 = 2;
        int $$6 = this.q.a(a);
        $$0.a(this.q, a, $$4 + 36 + (114 - $$6) / 2, 34, -16777216, false);
        int $$7 = this.q.a(this.v);
        $$0.a(this.q, this.v, $$4 + 36 + (114 - $$7) / 2, 60, -16777216, false);
        $$0.a(this.q, b, $$4 + 36, 82, 114, -16777216, false);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, gts.e, (this.o - 192) / 2, 2, 0.0f, 0.0f, 192, 192, 256, 256);
    }
}

