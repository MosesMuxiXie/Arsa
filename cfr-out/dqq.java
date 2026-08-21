/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class dqq
extends drg {
    public dqq(dqf $$0) {
        super("", $$0, drh.a(Map.of(Character.valueOf('#'), dqo.a((dwn)dlx.sA), Character.valueOf('x'), dqo.a((dwn)dlx.tY)), "###", "#x#", "###"), new dlt(dlx.wv));
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if (!super.a($$0, $$1)) {
            return false;
        }
        dlt $$2 = dqq.c($$0);
        if ($$2.f()) {
            return false;
        }
        fmw $$3 = dmg.b($$2, $$1);
        if ($$3 == null) {
            return false;
        }
        if ($$3.e()) {
            return false;
        }
        return $$3.g < 4;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        dlt $$2 = dqq.c($$0).c(1);
        $$2.b(ki.V, dou.b);
        return $$2;
    }

    private static dlt c(dqg $$0) {
        for (int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            dlt $$2 = $$0.a($$1);
            if (!$$2.c(ki.T)) continue;
            return $$2;
        }
        return dlt.l;
    }

    @Override
    public boolean ar_() {
        return true;
    }

    @Override
    public drc<dqq> a() {
        return drc.f;
    }
}

