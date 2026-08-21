/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class hvy
extends hxx<cuc, icu, hag> {
    private final Map<cud.a, gzi<hag>> a;

    public hvy(hwq.a $$0) {
        super($$0, new hag($$0.a(hdf.Z)), 0.3f);
        this.a = hvy.a($$0);
    }

    private static Map<cud.a, gzi<hag>> a(hwq.a $$0) {
        return Maps.newEnumMap(Map.of(cud.a.a, new gzi<hag>(new hag($$0.a(hdf.Z)), new hag($$0.a(hdf.aa))), cud.a.b, new gzi<hah>(new hah($$0.a(hdf.ac)), new hah($$0.a(hdf.ad)))));
    }

    @Override
    public void a(icu $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.c == null) {
            return;
        }
        this.f = this.a.get($$0.c.b().a()).a($$0.aE);
        super.a($$0, $$1, $$2, $$3);
    }

    public amo a(icu $$0) {
        return $$0.c == null ? ilf.c() : $$0.c.b().b().b();
    }

    public icu a() {
        return new icu();
    }

    @Override
    public void a(cuc $$0, icu $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = bgj.h($$2, $$0.cz, $$0.cv);
        $$1.b = bgj.h($$2, $$0.cx, $$0.cw);
        $$1.c = $$0.gP().a();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icu)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

