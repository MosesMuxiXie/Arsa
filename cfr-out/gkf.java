/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gkf
extends gjc {
    private static final float a = 2.125f;
    private static final float b = 0.97f;
    private static final float c = 2.5f;
    private static final float d = -5.0f;
    private static final float e = 30.0f;
    private static final float f = 50.0f;
    private final hht n;
    private final hht o;
    private final Supplier<ddq> p;
    private float q = -5.0f;
    private float r = 30.0f;

    public gkf(int $$0, int $$1, hdc $$2, Supplier<ddq> $$3) {
        super(0, 0, $$0, $$1, yg.a);
        this.n = new hht($$2.a(hdf.cE), false);
        this.o = new hht($$2.a(hdf.cJ), true);
        this.p = $$3;
    }

    @Override
    protected void a_(gir $$0, int $$1, int $$2, float $$3) {
        float $$4 = 0.97f * (float)this.aR_() / 2.125f;
        float $$5 = -1.0625f;
        ddq $$6 = this.p.get();
        hht $$7 = $$6.d() == ddp.a ? this.o : this.n;
        $$0.a($$7, $$6.a().b(), $$4, this.q, this.r, -1.0625f, this.aT_(), this.aU_(), this.E(), this.F());
    }

    @Override
    protected void b(gzc $$0, double $$1, double $$2) {
        this.q = bgj.a(this.q - (float)$$2 * 2.5f, -50.0f, 50.0f);
        this.r += (float)$$1 * 2.5f;
    }

    @Override
    public void a(iqr $$0) {
    }

    @Override
    protected void a(gpd $$0) {
    }

    @Override
    public @Nullable gin a(gpi $$0) {
        return null;
    }
}

