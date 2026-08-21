/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.util.function.ToIntFunction;
import org.joml.Vector3f;
import org.joml.Vector3fc;

class cfi
extends cfk {
    private final float c;
    private final ToIntFunction<bgr> d;

    protected cfi(cfl $$0, int $$1, float $$2, ToIntFunction<bgr> $$3) {
        super($$0, $$1, ly.H);
        this.c = $$2;
        this.d = $$3;
    }

    @Override
    public void a(axf $$0, chl $$1, int $$2, cex $$3, float $$4) {
        if ($$1.ep().i() <= this.c) {
            int $$5 = this.d.applyAsInt($$1.ep());
            for (int $$6 = 0; $$6 < $$5; ++$$6) {
                this.a($$0, $$1, $$1.dP(), $$1.dR() + (double)$$1.dG() / 2.0, $$1.dV());
            }
        }
    }

    private void a(axf $$0, chl $$1, double $$2, double $$3, double $$4) {
        daf $$5 = cgu.bm.a($$0, cgt.k);
        if ($$5 == null) {
            return;
        }
        bgr $$6 = $$1.ep();
        float $$7 = 1.5707964f;
        float $$8 = bgj.b($$6, -1.5707964f, 1.5707964f);
        Vector3f $$9 = $$1.cj().m().mul(0.3f).mul(1.0f, 1.5f, 1.0f).rotateY($$8);
        $$5.b($$2, $$3, $$4, $$0.G_().i() * 360.0f, 0.0f);
        $$5.k(new ftm((Vector3fc)$$9));
        $$0.b($$5);
        $$5.a(bda.Ag);
    }
}

