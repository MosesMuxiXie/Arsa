/*
 * Decompiled with CFR 0.152.
 */
public class gco
extends isc {
    private static final yh a = yh.c("mco.client.incompatible.title").b(-65536);
    private static final yh b = yh.b(w.b().c()).b(-65536);
    private static final yh c = yh.a("mco.client.unsupported.snapshot.version", b);
    private static final yh F = yh.a("mco.client.outdated.stable.version", b);
    private final gsb G;
    private final gou H = new gou(this);

    public gco(gsb $$0) {
        super(a);
        this.G = $$0;
    }

    @Override
    public void bg_() {
        this.H.a(a, this.q);
        this.H.c(new gjz(this.o(), this.q).a(true));
        this.H.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a(200).a());
        this.H.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.H.a();
    }

    @Override
    public void aX_() {
        this.n.a(this.G);
    }

    private yh o() {
        if (w.b().f()) {
            return F;
        }
        return c;
    }
}

