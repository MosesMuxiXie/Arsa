/*
 * Decompiled with CFR 0.152.
 */
public class gvr
extends gsb {
    private static final int a = 600;
    private final wu b;
    private gje c;
    private int d;
    private final goy e = goy.d();

    public gvr(yh $$0, wu $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    protected void bg_() {
        this.e.c().b().a(10);
        this.e.a(new gko(this.m, this.q));
        this.c = this.e.a(gje.a(yg.q, (gje $$0) -> this.b.a(grb.a)).a());
        this.c.k = false;
        this.e.a();
        this.e.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        gos.a(this.e, this.aV_());
    }

    @Override
    public void e() {
        super.e();
        ++this.d;
        if (this.d == 600) {
            this.c.k = true;
        }
        if (this.b.i()) {
            this.b.b();
        } else {
            this.b.n();
        }
    }
}

