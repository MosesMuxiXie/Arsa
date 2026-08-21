/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Function;

public class hwa
extends hxx<cwc, icv, hbq> {
    public hwa(hwq.a $$02) {
        super($$02, new hbq($$02.a(hdf.an)), 0.5f);
        this.a(new ibc<icv, hbq>(this, hwa.b(), ($$0, $$1) -> 1.0f, new hbq($$02.a(hdf.an)), ijt::q, false));
        this.a(new ibb<icv, hbq>(this));
        this.a(new iag<icv, hbq>(this, $$0 -> $$0.q, ((hbq)this.f)::b));
        this.a(new iao<icv, hbq>(this, $$02.f(), $$02.k()));
    }

    public amo a(icv $$0) {
        return cwf.a($$0.a).e();
    }

    private static Function<icv, amo> b() {
        return $$0 -> cwf.a($$0.a).f();
    }

    public icv a() {
        return new icv();
    }

    @Override
    public void a(cwc $$02, icv $$1, float $$2) {
        super.a($$02, $$1, $$2);
        ich.a($$02, $$1, this.g, $$2);
        $$1.a = $$02.gP();
        $$1.b = $$02.p();
        $$1.c.a($$02.gR());
        $$1.d.a($$02.gS());
        $$1.n.a($$02.gT());
        $$1.o.a($$02.gU());
        $$1.p.a($$02.gV());
        $$1.q = Optional.of($$02.a(cwc.a)).flatMap($$0 -> {
            void $$3;
            dlp $$1 = $$0.h();
            if (!($$1 instanceof dkb)) {
                return Optional.empty();
            }
            dkb $$2 = (dkb)$$1;
            dnw $$4 = $$0.a(ki.ax, dnw.a);
            return Optional.of($$4.a($$3.c().m()));
        });
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icv)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

