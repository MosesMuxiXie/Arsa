/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Consumer;

public class dlh
extends dlp {
    private static final yh a = yh.c("painting.random").a(l.h);
    private final cgu<? extends czb> b;

    public dlh(cgu<? extends czb> $$0, dlp.a $$1) {
        super($$1);
        this.b = $$0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public cdc a(dpw $$0) {
        void $$11;
        is $$1 = $$0.a();
        iz $$2 = $$0.k();
        is $$3 = $$1.a($$2);
        ddm $$4 = $$0.o();
        dlt $$5 = $$0.n();
        if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
            return cdc.d;
        }
        dwo $$6 = $$0.q();
        if (this.b == cgu.aR) {
            Optional<czg> $$7 = czg.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
                return cdc.c;
            }
            czb $$8 = $$7.get();
        } else if (this.b == cgu.ax) {
            czc $$9 = new czc($$6, $$3, $$2);
        } else if (this.b == cgu.ak) {
            cza $$10 = new cza($$6, $$3, $$2);
        } else {
            return cdc.a;
        }
        cgu.a($$6, $$5, $$4).accept($$11);
        if ($$11.f()) {
            if (!$$6.B_()) {
                $$11.v();
                $$6.a((cgk)$$4, etk.t, $$11.dI());
                $$6.b((cgk)$$11);
            }
            $$5.h(1);
            return cdc.a;
        }
        return cdc.c;
    }

    protected boolean a(ddm $$0, iz $$1, dlt $$2, is $$3) {
        return !$$1.o().b() && $$0.a($$3, $$1, $$2);
    }

    @Override
    public void a(dlt $$0, dlp.b $$1, dpd $$2, Consumer<yh> $$3, dnj $$4) {
        if (this.b == cgu.aR && $$2.a(ki.aU)) {
            jd<czh> $$5 = $$0.a(ki.aU);
            if ($$5 != null) {
                $$5.a().e().ifPresent($$3);
                $$5.a().f().ifPresent($$3);
                $$3.accept(yh.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
            } else if ($$4.b()) {
                $$3.accept(a);
            }
        }
    }
}

