/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ibw<S extends idy, M extends gzm<S>>
extends ibj<S, M> {
    private final hgz a;
    private final hgz b;
    private final iau c;

    public ibw(hyq<S, M> $$0, hdc $$1, iau $$2) {
        super($$0);
        this.a = new hgz($$1.a(hdf.aU));
        this.b = new hgz($$1.a(hdf.aV));
        this.c = $$2;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        dlt $$6 = ((idy)$$3).aq;
        dun $$7 = $$6.a(ki.H);
        if ($$7 == null || $$7.d().isEmpty()) {
            return;
        }
        amo $$8 = ibw.a($$3);
        hgz $$9 = ((idy)$$3).aE ? this.b : this.a;
        $$0.a();
        $$0.a(0.0f, 0.0f, 0.125f);
        this.c.a(inr.d.c, $$7.d().get(), $$9, $$3, $$6, $$0, $$1, $$2, $$8, ((idy)$$3).U, 0);
        $$0.b();
    }

    private static @Nullable amo a(idy $$0) {
        if ($$0 instanceof ick) {
            ick $$1 = (ick)$$0;
            ddq $$2 = $$1.a;
            if ($$2.c() != null) {
                return $$2.c().b();
            }
            if ($$2.b() != null && $$1.w) {
                return $$2.b().b();
            }
        }
        return null;
    }
}

