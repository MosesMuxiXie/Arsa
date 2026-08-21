/*
 * Decompiled with CFR 0.152.
 */
public class gty
extends gtl<dic> {
    private static final amo D = amo.b("textures/gui/container/crafting_table.png");

    public gty(dic $$0, ddl $$1, yh $$2) {
        super($$0, new gwr($$0), $$1, $$2);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f = 29;
    }

    @Override
    protected gpl I() {
        return new gpl(this.z + 5, this.p / 2 - 49);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.z;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, D, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
    }
}

