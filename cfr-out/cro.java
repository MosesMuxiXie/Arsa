/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class cro
extends crx {
    public static final float a = 10.0f;

    @Override
    protected boolean a(axf $$0, chl $$1, chl $$2) {
        if (!$$1.ev().a(cqw.V) && csd.c($$0, $$1, $$2) && cvq.i($$2) && !this.a($$1, $$2)) {
            return $$2.a((cgk)$$1, 10.0);
        }
        return false;
    }

    private boolean a(chl $$0, chl $$1) {
        List $$2 = $$0.ev().c(cqw.ab).orElseGet(ArrayList::new);
        return $$2.contains($$1.cY());
    }

    @Override
    protected cqw<chl> b() {
        return cqw.C;
    }
}

