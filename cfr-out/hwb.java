/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class hwb
extends hxx<cuh, icw, hak> {
    private final Map<cui.a, gzi<hak>> a;

    public hwb(hwq.a $$0) {
        super($$0, new hak($$0.a(hdf.at)), 0.7f);
        this.a = hwb.a($$0);
    }

    private static Map<cui.a, gzi<hak>> a(hwq.a $$0) {
        return Maps.newEnumMap(Map.of(cui.a.a, new gzi<hak>(new hak($$0.a(hdf.at)), new hak($$0.a(hdf.au))), cui.a.c, new gzi<hak>(new hak($$0.a(hdf.eg)), new hak($$0.a(hdf.eh))), cui.a.b, new gzi<hak>(new hak($$0.a(hdf.ae)), new hak($$0.a(hdf.af)))));
    }

    public amo a(icw $$0) {
        return $$0.a == null ? ilf.c() : $$0.a.b().b().b();
    }

    public icw a() {
        return new icw();
    }

    @Override
    public void a(cuh $$0, icw $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gP().a();
    }

    @Override
    public void a(icw $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a == null) {
            return;
        }
        this.f = this.a.get($$0.a.b().a()).a($$0.aE);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icw)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

