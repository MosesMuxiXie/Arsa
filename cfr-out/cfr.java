/*
 * Decompiled with CFR 0.152.
 */
class cfr
extends cfk {
    protected cfr(cfl $$0, int $$1, lw $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 == 1;
    }

    @Override
    public boolean a(axf $$0, chl $$1, int $$2) {
        if ($$1 instanceof axg) {
            is $$4;
            axg $$3 = (axg)$$1;
            if (!$$1.au() && ($$4 = $$3.af()) != null) {
                $$0.G().a($$3, $$4);
                $$3.ae();
                return false;
            }
        }
        return true;
    }
}

