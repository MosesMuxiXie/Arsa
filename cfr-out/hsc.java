/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hsc
implements hri<emz, hte> {
    private static final float a = 0.02f;
    private final hre<emz> b = new hre();
    private final hrl<emz> c = new hrl();

    public hte a() {
        return new hte();
    }

    @Override
    public void a(emz $$0, hte $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a = new hsj();
        hsm.a($$0, $$1.a, $$4);
        hre.a($$0, $$1.a, $$2, $$3);
        $$1.b = new hsn();
        hsm.a($$0, $$1.b, $$4);
        hrl.a($$0, $$1.b);
        $$1.c.clear();
        for (emz.b $$5 : $$0.H()) {
            $$1.c.add(new emz.b($$5.a(), $$5.b()));
        }
    }

    @Override
    public void a(hte $$0, fzm $$1, hpo $$2, ikp $$3) {
        this.b.a($$0.a, $$1, $$2, $$3);
        this.c.a($$0.b, $$1, $$2, $$3);
        for (emz.b $$4 : $$0.c) {
            this.a($$4);
        }
    }

    private void a(emz.b $$0) {
        is $$1 = $$0.a();
        um.a(new fth($$1).g(0.02f), ul.b(bel.a(0.375f, 1.0f, 0.0f, 0.0f)));
        String $$2 = $$0.b().getString();
        float $$3 = 0.16f;
        um.a($$2, ftm.a($$1, 0.5, 1.2, 0.5), ur.a.a().a(0.16f)).a();
    }

    @Override
    public boolean bk_() {
        return this.b.bk_() || this.c.bk_();
    }

    @Override
    public int bl_() {
        return Math.max(this.b.bl_(), this.c.bl_());
    }

    @Override
    public boolean a(emz $$0, ftm $$1) {
        return this.b.a($$0, $$1) || this.c.a($$0, $$1);
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

