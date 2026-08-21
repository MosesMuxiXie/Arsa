/*
 * Decompiled with CFR 0.152.
 */
public class guh
extends gti<dij> {
    private static final amo D = amo.b("container/grindstone/error");
    private static final amo E = amo.b("textures/gui/container/grindstone.png");

    public guh(dij $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
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
        $$0.a(hpa.at, E, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        if ((((dij)this.w).b(0).h() || ((dij)this.w).b(1).h()) && !((dij)this.w).b(2).h()) {
            $$0.a(hpa.at, D, $$4 + 92, $$5 + 31, 28, 21);
        }
    }
}

