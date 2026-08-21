/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dmz
extends dkb
implements dkp {
    private final bcz a;

    public dmz(dzq $$0, bcz $$1, dlp.a $$2) {
        super($$0, $$2);
        this.a = $$1;
    }

    @Override
    public cdc a(dpw $$0) {
        cdc $$1 = super.a($$0);
        ddm $$2 = $$0.o();
        if ($$1.a() && $$2 != null) {
            $$2.a($$0.p(), dkh.b($$0.n(), $$2));
        }
        return $$1;
    }

    @Override
    protected bcz a(eoh $$0) {
        return this.a;
    }

    @Override
    public boolean a(@Nullable chl $$0, dwo $$1, is $$2, @Nullable fti $$3) {
        if ($$1.n($$2) && $$1.A($$2)) {
            if (!$$1.B_()) {
                $$1.a($$2, this.c().m(), 3);
            }
            $$1.a((cgk)$$0, etk.z, $$2);
            $$1.a((cgk)$$0, $$2, this.a, bdb.e, 1.0f, 1.0f);
            return true;
        }
        return false;
    }
}

