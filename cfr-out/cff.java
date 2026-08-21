/*
 * Decompiled with CFR 0.152.
 */
class cff
extends cfk {
    protected cff(cfl $$0, int $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return true;
    }

    @Override
    public boolean a(axf $$0, chl $$1, int $$2) {
        dfh $$4;
        axg $$3;
        if ($$1 instanceof axg && !($$3 = (axg)$$1).au() && $$0.av() != ccz.a && $$0.e($$3.dK()) && (($$4 = $$0.f($$3.dK())) == null || $$4.l() < $$4.k())) {
            $$3.a(new cfm(cfo.I, 600, $$2));
            $$3.c($$3.dK());
            return false;
        }
        return true;
    }
}

