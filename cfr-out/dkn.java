/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class dkn
extends dlp {
    public dkn(dlp.a $$0) {
        super($$0);
    }

    @Override
    public boolean a(dlt $$0, eoh $$1, dwo $$2, is $$3, chl $$4) {
        if (!$$2.B_() && $$4 instanceof ddm) {
            ddm $$5 = (ddm)$$4;
            this.a($$5, $$1, $$2, $$3, false, $$0);
        }
        return false;
    }

    @Override
    public cdc a(dpw $$0) {
        is $$3;
        ddm $$1 = $$0.o();
        dwo $$2 = $$0.q();
        if (!$$2.B_() && $$1 != null && !this.a($$1, $$2.a_($$3 = $$0.a()), $$2, $$3, true, $$0.n())) {
            return cdc.d;
        }
        return cdc.a;
    }

    private boolean a(ddm $$0, eoh $$1, dwp $$2, is $$3, boolean $$4, dlt $$5) {
        if (!$$0.hi()) {
            return false;
        }
        jd<dzq> $$6 = $$1.c();
        eoi<dzq, eoh> $$7 = $$6.a().l();
        Collection<epk<?>> $$8 = $$7.d();
        if ($$8.isEmpty()) {
            dkn.a($$0, yh.a(this.n + ".empty", new Object[]{$$6.g()}));
            return false;
        }
        doi $$9 = $$5.a(ki.ae);
        if ($$9 == null) {
            return false;
        }
        epk<?> $$10 = $$9.a().get($$6);
        if ($$4) {
            if ($$10 == null) {
                $$10 = $$8.iterator().next();
            }
            eoh $$11 = dkn.a($$1, $$10, $$0.gA());
            $$2.a($$3, $$11, 18);
            dkn.a($$0, yh.a(this.n + ".update", new Object[]{$$10.f(), dkn.a($$11, $$10)}));
        } else {
            $$10 = dkn.a($$8, $$10, $$0.gA());
            $$5.b(ki.ae, $$9.a($$6, $$10));
            dkn.a($$0, yh.a(this.n + ".select", new Object[]{$$10.f(), dkn.a($$1, $$10)}));
        }
        return true;
    }

    private static <T extends Comparable<T>> eoh a(eoh $$0, epk<T> $$1, boolean $$2) {
        return (eoh)$$0.b($$1, (Comparable)dkn.a($$1.a(), $$0.c($$1), $$2));
    }

    private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
        return $$2 ? bhs.b($$0, $$1) : bhs.a($$0, $$1);
    }

    private static void a(ddm $$0, yh $$1) {
        ((axg)$$0).b($$1, true);
    }

    private static <T extends Comparable<T>> String a(eoh $$0, epk<T> $$1) {
        return $$1.b($$0.c($$1));
    }
}

