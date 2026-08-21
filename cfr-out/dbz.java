/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dbz
extends dbv {
    public dbz(cgu<? extends dbz> $$0, dwo $$1) {
        super((cgu<? extends dbv>)$$0, $$1);
    }

    public static boolean c(cgu<dbz> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        is $$5 = $$3;
        while ($$1.a_($$5 = $$5.d()).a(dzs.rP)) {
        }
        return czz.a($$0, $$1, $$2, $$3, $$4) && (cgt.a($$2) || $$1.k($$5.e()));
    }

    @Override
    protected bcz W() {
        return bda.CE;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.CG;
    }

    @Override
    protected bcz fd() {
        return bda.CF;
    }

    @Override
    bcz p() {
        return bda.CH;
    }

    @Override
    protected deh a(dlt $$0, float $$1, @Nullable dlt $$2) {
        deh $$3 = super.a($$0, $$1, $$2);
        if ($$3 instanceof dei) {
            ((dei)$$3).a(new cfm(cfo.b, 600));
        }
        return $$3;
    }
}

