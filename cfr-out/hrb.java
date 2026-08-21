/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.jspecify.annotations.Nullable;

public abstract class hrb<T extends enb, S extends hsw>
implements hri<T, S> {
    public static final amo a = amo.b("textures/environment/end_sky.png");
    public static final amo b = amo.b("textures/entity/end_portal.png");

    @Override
    public void a(T $$0, S $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        ((hsw)$$1).e.clear();
        for (iz $$5 : iz.values()) {
            if (!((enb)$$0).a($$5)) continue;
            ((hsw)$$1).e.add($$5);
        }
    }

    @Override
    public void a(S $$0, fzm $$12, hpo $$22, ikp $$3) {
        $$22.a($$12, this.c(), (fzm.a $$1, fzp $$2) -> this.a($$0.e, $$1.a(), $$2));
    }

    private void a(EnumSet<iz> $$0, Matrix4f $$1, fzp $$2) {
        float $$3 = this.b();
        float $$4 = this.a();
        this.a($$0, $$1, $$2, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, iz.d);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, iz.c);
        this.a($$0, $$1, $$2, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, iz.f);
        this.a($$0, $$1, $$2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, iz.e);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, $$3, $$3, 0.0f, 0.0f, 1.0f, 1.0f, iz.a);
        this.a($$0, $$1, $$2, 0.0f, 1.0f, $$4, $$4, 1.0f, 1.0f, 0.0f, 0.0f, iz.b);
    }

    private void a(EnumSet<iz> $$0, Matrix4f $$1, fzp $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, iz $$11) {
        if ($$0.contains($$11)) {
            $$2.a((Matrix4fc)$$1, $$3, $$5, $$7);
            $$2.a((Matrix4fc)$$1, $$4, $$5, $$8);
            $$2.a((Matrix4fc)$$1, $$4, $$6, $$9);
            $$2.a((Matrix4fc)$$1, $$3, $$6, $$10);
        }
    }

    protected float a() {
        return 0.75f;
    }

    protected float b() {
        return 0.375f;
    }

    protected ijs c() {
        return ijt.p();
    }
}

