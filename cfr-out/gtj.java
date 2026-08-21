/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class gtj<T extends dhk>
extends gtl<T> {
    private final amo D;
    private final amo E;
    private final amo F;

    public gtj(T $$0, ddl $$1, yh $$2, yh $$3, amo $$4, amo $$5, amo $$6, List<gwv.a> $$7) {
        super($$0, new gws((dhk)$$0, $$3, $$7), $$1, $$2);
        this.D = $$4;
        this.E = $$5;
        this.F = $$6;
    }

    @Override
    public void bg_() {
        super.bg_();
        this.f = (this.d - this.q.a(this.m)) / 2;
    }

    @Override
    protected gpl I() {
        return new gpl(this.z + 20, this.p / 2 - 49);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.z;
        int $$5 = this.A;
        $$0.a(hpa.at, this.D, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        if (((dhk)this.w).o()) {
            int $$6 = 14;
            int $$7 = bgj.d(((dhk)this.w).n() * 13.0f) + 1;
            $$0.a(hpa.at, this.E, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
        }
        int $$8 = 24;
        int $$9 = bgj.d(((dhk)this.w).m() * 24.0f);
        $$0.a(hpa.at, this.F, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
    }
}

