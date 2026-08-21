/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class guk
extends gtk<dil> {
    private static final amo H = amo.b("container/slot");
    private static final amo I = amo.b("container/horse/chest_slots");
    private static final amo J = amo.b("textures/gui/container/horse.png");

    public guk(dil $$0, ddl $$1, cup $$2, int $$3) {
        super($$0, $$1, $$2.R_(), $$3, $$2);
    }

    @Override
    protected amo I() {
        return J;
    }

    @Override
    protected amo J() {
        return H;
    }

    @Override
    protected @Nullable amo K() {
        return I;
    }

    @Override
    protected boolean L() {
        return this.G.e(cgv.h) && this.G.ay().a(bdt.K);
    }

    @Override
    protected boolean M() {
        return this.G.e(cgv.g) && (this.G.ay().a(bdt.M) || this.G instanceof cus);
    }
}

