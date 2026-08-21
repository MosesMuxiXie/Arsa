/*
 * Decompiled with CFR 0.152.
 */
public class guv
extends gti<djf> {
    private static final amo D = amo.b("textures/gui/container/shulker_box.png");

    public guv(djf $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        ++this.e;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, D, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
    }
}

