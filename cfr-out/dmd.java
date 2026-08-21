/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dmd
extends dlp {
    public dmd(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        is $$2;
        dwo $$1 = $$0.q();
        eoh $$3 = $$1.a_($$2 = $$0.a());
        if ($$3.a(bdp.S)) {
            ddm $$4 = $$0.o();
            if (!$$1.B_() && $$4 != null) {
                return dmd.a($$4, $$1, $$2);
            }
        }
        return cdc.e;
    }

    public static cdc a(ddm $$0, dwo $$12, is $$2) {
        czd $$3 = null;
        List<chj> $$4 = chj.a($$12, ftm.b($$2), (chj $$1) -> $$1.C() == $$0);
        boolean $$5 = false;
        for (chj $$6 : $$4) {
            if ($$3 == null) {
                $$3 = czd.b($$12, $$2);
                $$3.k();
            }
            if (!$$6.b_($$3)) continue;
            $$6.a_($$3, true);
            $$5 = true;
        }
        if ($$5) {
            $$12.a(etk.b, $$2, etk.a.a($$0));
            return cdc.b;
        }
        return cdc.e;
    }
}

