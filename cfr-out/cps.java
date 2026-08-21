/*
 * Decompiled with CFR 0.152.
 */
public class cps
extends cop {
    private final cht a;

    public cps(cht $$0) {
        this.a = $$0;
    }

    @Override
    public boolean b() {
        return this.a.ao().ag() && this.a.a(cgv.f).f() && csp.a(this.a);
    }

    @Override
    public void d() {
        cre cre2 = this.a.N();
        if (cre2 instanceof crd) {
            crd $$0 = (crd)cre2;
            $$0.b(true);
        }
    }

    @Override
    public void e() {
        cre cre2;
        if (csp.a(this.a) && (cre2 = this.a.N()) instanceof crd) {
            crd $$0 = (crd)cre2;
            $$0.b(false);
        }
    }
}

