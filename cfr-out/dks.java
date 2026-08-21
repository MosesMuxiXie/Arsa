/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class dks
extends dlp
implements dmv {
    private static final Map<dkr, dks> a = Maps.newEnumMap(dkr.class);
    private final dkr b;

    public dks(dkr $$0, dlp.a $$1) {
        super($$1);
        this.b = $$0;
        a.put($$0, this);
    }

    @Override
    public cdc a(dlt $$0, ddm $$1, chl $$2, cdb $$3) {
        cxj $$4;
        if ($$2 instanceof cxj && ($$4 = (cxj)$$2).cb() && !$$4.gQ() && $$4.gP() != this.b) {
            $$4.ao().a((cgk)$$1, $$4, bda.ju, bdb.h, 1.0f, 1.0f);
            if (!$$1.ao().B_()) {
                $$4.a(this.b);
                $$0.h(1);
            }
            return cdc.a;
        }
        return cdc.e;
    }

    public dkr a() {
        return this.b;
    }

    public static dks a(dkr $$0) {
        return a.get($$0);
    }

    @Override
    public boolean a(dwo $$02, ems $$1, boolean $$2, ddm $$3) {
        if ($$1.a($$0 -> $$0.a(this.a()), $$2)) {
            $$02.a(null, $$1.aD_(), bda.ju, bdb.e, 1.0f, 1.0f);
            return true;
        }
        return false;
    }
}

