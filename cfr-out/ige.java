/*
 * Decompiled with CFR 0.152.
 */
public class ige
implements AutoCloseable {
    private final hpp a;
    private final hpw b;
    private final hon.a c;
    private final inl d;
    private final hoq e;
    private final hon.a f;
    private final gio g;
    private final igm h = new igm();
    private final igf i = new igf();
    private final igi j = new igi();
    private final igj k = new igj();
    private final igk l = new igk();
    private final ign m = new ign();
    private final igh n = new igh();
    private final igg o = new igg();
    private final igd p = new igd();
    private final igc q = new igc();
    private final igl r = new igl();

    public ige(hpp $$0, hpw $$1, hon.a $$2, inl $$3, hoq $$4, hon.a $$5, gio $$6) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
    }

    public void a() {
        for (hpn $$0 : this.a.c().values()) {
            this.h.a($$0, this.c);
            this.j.a($$0, this.c, this.e, this.f);
            this.k.a($$0, this.c, this.e, this.f);
            this.i.a($$0, this.c, this.d);
            this.l.a($$0, this.c, this.g);
            this.m.a($$0, this.c);
            this.n.a($$0, this.c);
            this.o.a($$0, this.c, this.e);
            this.q.a($$0, this.c, this.b, this.e);
            this.p.a($$0, this.c);
            this.r.a($$0);
        }
        this.a.a();
    }

    public void b() {
        this.r.a();
    }

    public hpp c() {
        return this.a;
    }

    @Override
    public void close() {
        this.r.close();
    }
}

