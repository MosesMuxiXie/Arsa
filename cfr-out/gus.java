/*
 * Decompiled with CFR 0.152.
 */
public class gus
extends gth {
    private final dgn f;

    public gus(dgn $$0) {
        this.f = $$0;
    }

    @Override
    public dvo o() {
        return this.f.e();
    }

    @Override
    int p() {
        return 150;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.a.a(this.o().d());
    }

    @Override
    protected void J() {
        this.n.R().b(new ajv(this.f.aA(), this.a.a(), this.f.e().g()));
    }
}

