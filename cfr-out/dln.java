/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dln
extends dlp {
    public dln(dlp.a $$0) {
        super($$0);
    }

    public static dlt a(dlp $$0, jd<dlm> $$1) {
        dlt $$2 = new dlt($$0);
        $$2.b(ki.ai, new dom($$1));
        return $$2;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        Optional<jd<dlm>> $$4 = this.a($$3, $$1.eo());
        if ($$4.isPresent()) {
            dlm $$5 = $$4.get().a();
            $$1.c($$2);
            dln.a($$0, $$1, $$5);
            $$1.hh().a($$3, bgj.b($$5.b() * 20.0f));
            $$1.b(bdk.c.b(this));
            return cdc.c;
        }
        return cdc.d;
    }

    @Override
    public int a(dlt $$02, chl $$1) {
        Optional<jd<dlm>> $$2 = this.a($$02, $$1.eo());
        return $$2.map($$0 -> bgj.b(((dlm)$$0.a()).b() * 20.0f)).orElse(0);
    }

    private Optional<jd<dlm>> a(dlt $$0, jf.a $$1) {
        dom $$2 = $$0.a(ki.ai);
        return $$2 != null ? $$2.a($$1) : Optional.empty();
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.i;
    }

    private static void a(dwo $$0, ddm $$1, dlm $$2) {
        bcz $$3 = $$2.a().a();
        float $$4 = $$2.c() / 16.0f;
        $$0.a((cgk)$$1, $$1, $$3, bdb.c, $$4, 1.0f);
        $$0.a(etk.B, $$1.dI(), etk.a.a($$1));
    }
}

