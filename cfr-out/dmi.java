/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dmi
extends dkh {
    private final cgu<? extends chn> a;
    private final bcz b;

    public dmi(cgu<? extends chn> $$0, fla $$1, bcz $$2, dlp.a $$3) {
        super($$1, $$3);
        this.a = $$0;
        this.b = $$2;
    }

    @Override
    public void a(@Nullable chl $$0, dwo $$1, dlt $$2, is $$3) {
        if ($$1 instanceof axf) {
            this.a((axf)$$1, $$2, $$3);
            $$1.a((cgk)$$0, etk.t, $$3);
        }
    }

    @Override
    protected void a(@Nullable chl $$0, dwp $$1, is $$2) {
        $$1.a((cgk)$$0, $$2, this.b, bdb.g, 1.0f, 1.0f);
    }

    private void a(axf $$0, dlt $$1, is $$2) {
        chn $$3 = this.a.b($$0, cgu.a((dwo)$$0, $$1, null), $$2, cgt.l, true, false);
        if ($$3 instanceof cti) {
            cti $$4 = (cti)((Object)$$3);
            doe $$5 = $$1.a(ki.ag, doe.a);
            $$4.a($$5.b());
            $$4.a(true);
        }
        if ($$3 != null) {
            $$0.a_($$3);
            $$3.T();
        }
    }
}

