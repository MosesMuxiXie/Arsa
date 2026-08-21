/*
 * Decompiled with CFR 0.152.
 */
public class gci {
    private final gdx a;
    private boolean b;
    private String c;

    public gci(gdx $$0) {
        this.a = $$0;
        gdx.a $$1 = $$0.a();
        this.b = $$1.b;
        this.c = $$1.a;
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void a(gbd $$0) {
        gdx.a $$1 = this.b($$0);
        this.b = $$1.b;
        this.c = $$1.a;
    }

    private gdx.a b(gbd $$0) {
        gdx.a $$1 = this.a.a();
        if ($$0.a() == null || $$0.a().equals($$1.a)) {
            return $$1;
        }
        gdx.a $$2 = new gdx.a();
        $$2.a = $$0.a();
        $$2.b = true;
        this.a.a($$2);
        return $$2;
    }
}

