/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class iaa
extends hxx<cwq, ien, hby> {
    private final Map<cws.a, hby> a;

    public iaa(hwq.a $$02) {
        super($$02, new hby($$02.a(hdf.eP)), 0.7f);
        this.a(new ibn<ien, hby, Object>(this, $$02.h(), inr.d.r, $$0 -> $$0.b, new hbx($$02.a(hdf.ce)), null));
        this.a(new ibn<ien, hby, Object>(this, $$02.h(), inr.d.q, $$0 -> $$0.a, new hbz($$02.a(hdf.cd)), null));
        this.a = iaa.a($$02);
    }

    private static Map<cws.a, hby> a(hwq.a $$0) {
        return Maps.newEnumMap(Map.of(cws.a.a, new hby($$0.a(hdf.eP)), cws.a.b, new her($$0.a(hdf.as))));
    }

    @Override
    public void a(ien $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.c == null) {
            return;
        }
        this.f = this.a.get($$0.c.b().a());
        super.a($$0, $$1, $$2, $$3);
    }

    public amo a(ien $$0) {
        return $$0.c == null ? ilf.c() : $$0.c.b().b().b();
    }

    public ien b() {
        return new ien();
    }

    @Override
    public void a(cwq $$0, ien $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a(cgv.h).v();
        $$1.b = $$0.ak().v();
        $$1.c = $$0.ho().a();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ien)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

