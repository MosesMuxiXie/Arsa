/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dbx
extends dbv {
    public dbx(cgu<? extends dbv> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected deh a(dlt $$0, float $$1, @Nullable dlt $$2) {
        deh $$3 = super.a($$0, $$1, $$2);
        if ($$3 instanceof dei) {
            ((dei)$$3).a(new cfm(cfo.r, 600));
        }
        return $$3;
    }

    public static cir.a gT() {
        return dbv.k().a(cis.u, 16.0);
    }

    @Override
    protected bcz W() {
        return bda.vi;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.vk;
    }

    @Override
    protected bcz fd() {
        return bda.vj;
    }

    @Override
    bcz p() {
        return bda.vl;
    }

    @Override
    protected int gQ() {
        return 50;
    }

    @Override
    protected int gR() {
        return 70;
    }

    @Override
    public boolean b(cfm $$0) {
        if ($$0.c() == cfo.r) {
            return false;
        }
        return super.b($$0);
    }
}

