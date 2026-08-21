/*
 * Decompiled with CFR 0.152.
 */
public class crl
extends crx {
    public static final float a = 8.0f;

    @Override
    protected boolean a(axf $$0, chl $$1, chl $$2) {
        return this.b($$1, $$2) && $$2.by() && (this.b($$2) || this.a($$1, $$2)) && csd.c($$0, $$1, $$2);
    }

    private boolean a(chl $$0, chl $$1) {
        return !$$0.ev().a(cqw.V) && $$1.ay().a(bdt.k);
    }

    private boolean b(chl $$0) {
        return $$0.ay().a(bdt.j);
    }

    private boolean b(chl $$0, chl $$1) {
        return $$1.g($$0) <= 64.0;
    }

    @Override
    protected cqw<chl> b() {
        return cqw.C;
    }
}

