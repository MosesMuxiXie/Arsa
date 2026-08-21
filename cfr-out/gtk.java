/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gtk<T extends dhl>
extends gti<T> {
    protected final int D;
    protected float E;
    protected float F;
    protected chl G;

    public gtk(T $$0, ddl $$1, yh $$2, int $$3, chl $$4) {
        super($$0, $$1, $$2);
        this.D = $$3;
        this.G = $$4;
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, this.I(), $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        if (this.D > 0 && this.K() != null) {
            $$0.a(hpa.at, this.K(), 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.D * 18, 54);
        }
        if (this.L()) {
            this.e($$0, $$4 + 7, $$5 + 35 - 18);
        }
        if (this.M()) {
            this.e($$0, $$4 + 7, $$5 + 35);
        }
        gul.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25f, this.E, this.F, this.G);
    }

    protected void e(gir $$0, int $$1, int $$2) {
        $$0.a(hpa.at, this.J(), $$1, $$2, 18, 18);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        this.E = $$1;
        this.F = $$2;
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    protected abstract amo I();

    protected abstract amo J();

    protected abstract @Nullable amo K();

    protected abstract boolean L();

    protected abstract boolean M();
}

