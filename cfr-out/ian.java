/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class ian<S extends idw, M extends gzm<S>>
extends ibj<S, M> {
    public ian(hyq<S, M> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        ihm $$6 = ((idw)$$3).i;
        if ($$6.e()) {
            return;
        }
        $$0.a();
        this.a($$3, $$0);
        $$6.a($$0, $$1, $$2, ilg.d, ((idw)$$3).U);
        $$0.b();
    }

    protected void a(S $$0, fzm $$1) {
        ((gzr)this.d()).a($$0, $$1);
        $$1.a((Quaternionfc)a.b.rotation(0.75f));
        $$1.b(1.07f, 1.07f, 1.07f);
        $$1.a(0.0f, 0.13f, -0.34f);
        $$1.a((Quaternionfc)a.b.rotation((float)Math.PI));
    }
}

