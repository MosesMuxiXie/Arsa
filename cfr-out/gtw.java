/*
 * Decompiled with CFR 0.152.
 */
public class gtw
extends gti<dhs> {
    private static final amo D = amo.b("textures/gui/container/generic_54.png");
    private final int E;

    public gtw(dhs $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        int $$3 = 222;
        int $$4 = 114;
        this.E = $$0.m();
        this.e = 114 + this.E * 18;
        this.v = this.e - 94;
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
        $$0.a(hpa.at, D, $$4, $$5, 0.0f, 0.0f, this.d, this.E * 18 + 17, 256, 256);
        $$0.a(hpa.at, D, $$4, $$5 + this.E * 18 + 17, 0.0f, 126.0f, this.d, 96, 256, 256);
    }
}

