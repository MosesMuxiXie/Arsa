/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class hyi
extends hxx<cxb, ies, hch> {
    private final Map<cxc.a, gzi<hch>> a;

    public hyi(hwq.a $$02) {
        super($$02, new hch($$02.a(hdf.cs)), 0.7f);
        this.a = hyi.a($$02);
        this.a(new ibn<ies, hch, hch>(this, $$02.h(), inr.d.g, $$0 -> $$0.a, new hch($$02.a(hdf.cC)), new hch($$02.a(hdf.cB))));
    }

    private static Map<cxc.a, gzi<hch>> a(hwq.a $$0) {
        return Maps.newEnumMap(Map.of(cxc.a.a, new gzi<hch>(new hch($$0.a(hdf.cs)), new hch($$0.a(hdf.cA))), cxc.a.b, new gzi<hcg>(new hcg($$0.a(hdf.ag)), new hcg($$0.a(hdf.ah)))));
    }

    @Override
    public void a(ies $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.b == null) {
            return;
        }
        this.f = this.a.get($$0.b.b().a()).a($$0.aE);
        super.a($$0, $$1, $$2, $$3);
    }

    public amo a(ies $$0) {
        return $$0.b == null ? ilf.c() : $$0.b.b().b().b();
    }

    public ies b() {
        return new ies();
    }

    @Override
    public void a(cxb $$0, ies $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a(cgv.h).v();
        $$1.b = $$0.gP().a();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ies)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

