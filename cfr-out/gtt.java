/*
 * Decompiled with CFR 0.152.
 */
public class gtt
extends gti<dhq> {
    private static final amo D = amo.b("container/brewing_stand/fuel_length");
    private static final amo E = amo.b("container/brewing_stand/brew_progress");
    private static final amo F = amo.b("container/brewing_stand/bubbles");
    private static final amo G = amo.b("textures/gui/container/brewing_stand.png");
    private static final int[] H = new int[]{29, 24, 20, 16, 11, 6, 0};

    public gtt(dhq $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f = (this.d - this.q.a(this.m)) / 2;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$8;
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, G, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        int $$6 = ((dhq)this.w).l();
        int $$7 = bgj.a((18 * $$6 + 20 - 1) / 20, 0, 18);
        if ($$7 > 0) {
            $$0.a(hpa.at, D, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
        }
        if (($$8 = ((dhq)this.w).m()) > 0) {
            int $$9 = (int)(28.0f * (1.0f - (float)$$8 / 400.0f));
            if ($$9 > 0) {
                $$0.a(hpa.at, E, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
            }
            if (($$9 = H[$$8 / 2 % 7]) > 0) {
                $$0.a(hpa.at, F, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
            }
        }
    }
}

