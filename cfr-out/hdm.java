/*
 * Decompiled with CFR 0.152.
 */
public class hdm {
    private final hdo a;
    private final hdn b;

    private hdm(hdo $$0, hdn $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public hdm a(hdp $$0) {
        return new hdm($$0.apply(this.a), this.b);
    }

    public hdg a() {
        return this.a.a().a(this.b.a, this.b.b);
    }

    public static hdm a(hdo $$0, int $$1, int $$2) {
        return new hdm($$0, new hdn($$1, $$2));
    }
}

