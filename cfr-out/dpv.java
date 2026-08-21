/*
 * Decompiled with CFR 0.152.
 */
public class dpv
extends dpu {
    private final iz b;

    public dpv(dwo $$0, is $$1, iz $$2, dlt $$3, iz $$4) {
        super($$0, null, cdb.a, $$3, new fti(ftm.c($$1), $$4, $$1, false));
        this.b = $$2;
    }

    @Override
    public is a() {
        return this.j().b();
    }

    @Override
    public boolean b() {
        return this.q().a_(this.j().b()).a(this);
    }

    @Override
    public boolean c() {
        return this.b();
    }

    @Override
    public iz d() {
        return iz.a;
    }

    @Override
    public iz[] f() {
        switch (this.b) {
            default: {
                return new iz[]{iz.a, iz.c, iz.f, iz.d, iz.e, iz.b};
            }
            case b: {
                return new iz[]{iz.a, iz.b, iz.c, iz.f, iz.d, iz.e};
            }
            case c: {
                return new iz[]{iz.a, iz.c, iz.f, iz.e, iz.b, iz.d};
            }
            case d: {
                return new iz[]{iz.a, iz.d, iz.f, iz.e, iz.b, iz.c};
            }
            case e: {
                return new iz[]{iz.a, iz.e, iz.d, iz.b, iz.c, iz.f};
            }
            case f: 
        }
        return new iz[]{iz.a, iz.f, iz.d, iz.b, iz.c, iz.e};
    }

    @Override
    public iz g() {
        return this.b.o() == iz.a.b ? iz.c : this.b;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public float i() {
        return this.b.e() * 90;
    }
}

