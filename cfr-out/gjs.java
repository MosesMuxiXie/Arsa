/*
 * Decompiled with CFR 0.152.
 */
public class gjs
extends gjc {
    private final gfj a;
    private final int b;
    private final int c;
    private final dlt d;
    private final boolean e;
    private final boolean f;

    public gjs(gfj $$0, int $$1, int $$2, int $$3, int $$4, yh $$5, dlt $$6, boolean $$7, boolean $$8) {
        super(0, 0, $$3, $$4, $$5);
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$6;
        this.e = $$7;
        this.f = $$8;
    }

    @Override
    protected void a_(gir $$0, int $$1, int $$2, float $$3) {
        $$0.a(this.d, this.aT_() + this.b, this.aU_() + this.c, 0);
        if (this.e) {
            $$0.a(this.a.g, this.d, this.aT_() + this.b, this.aU_() + this.c, null);
        }
        if (this.aP_()) {
            $$0.b(this.aT_(), this.aU_(), this.aS_(), this.aR_(), -1);
        }
        if (this.f && this.D()) {
            this.a($$0, $$1, $$2);
        }
    }

    protected void a(gir $$0, int $$1, int $$2) {
        $$0.b(this.a.g, this.d, $$1, $$2);
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, (yh)yh.a("narration.item", this.d.y()));
    }
}

