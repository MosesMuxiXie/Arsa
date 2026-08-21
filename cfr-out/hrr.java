/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class hrr
implements hri<elq, hss> {
    private final Map<ebh.a, hho> a = new HashMap<ebh.a, hho>();

    public hrr(hrj.a $$0) {
        hdc $$1 = $$0.f();
        this.a.put(ebh.a.a, new hho($$1.a(hdf.an)));
        this.a.put(ebh.a.c, new hho($$1.a(hdf.ap)));
        this.a.put(ebh.a.b, new hho($$1.a(hdf.aq)));
        this.a.put(ebh.a.d, new hho($$1.a(hdf.ar)));
    }

    public hss a() {
        return new hss();
    }

    @Override
    public void a(elq $$0, hss $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.b = $$0.o().c(ebh.b);
        $$1.a = $$0.o().c(eox.bJ);
    }

    @Override
    public void a(hss $$0, fzm $$1, hpo $$2, ikp $$3) {
        dzq dzq2 = $$0.g.b();
        if (dzq2 instanceof ebh) {
            ebh $$4 = (ebh)dzq2;
            $$1.a();
            $$1.a(0.5f, 0.0f, 0.5f);
            hho $$5 = this.a.get($$0.a);
            iz $$6 = $$0.b;
            ijs $$7 = ijt.g(cwf.a($$4.d()).e());
            $$2.a($$5, $$6, $$1, $$7, $$0.i, ilg.d, 0, $$0.j);
            $$1.b();
        }
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

