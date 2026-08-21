/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class dar
extends cjd<dal> {
    public dar() {
        super(Map.of(cqw.p, cqx.a, cqw.n, cqx.b, cqw.bf, cqx.b, cqw.bg, cqx.b));
    }

    @Override
    protected boolean a(axf $$0, dal $$1) {
        return $$1.aV() && !$$1.by() && $$1.aF() == chx.a;
    }

    protected void a(axf $$0, dal $$1, long $$2) {
        ftm $$6;
        chl $$3 = $$1.ev().c(cqw.p).orElse(null);
        if ($$3 == null) {
            return;
        }
        boolean $$4 = $$1.o($$3.dI());
        ftm $$5 = null;
        if ($$4 && ($$6 = cso.a((cht)$$1, 5, 5, $$3.dI())) != null && dan.a($$1, $$6) && $$3.h($$6.g, $$6.h, $$6.i) > $$3.g($$1)) {
            $$5 = $$6;
        }
        if ($$5 == null) {
            $$5 = $$1.ep().h() ? dan.a($$3, $$1.ep()) : dar.a($$1, $$3);
        }
        $$1.ev().a(cqw.n, new cqz(is.a($$5), 0.6f, 1));
    }

    private static ftm a(dal $$0, chl $$1) {
        ftm $$2 = $$1.dI().d($$0.dI());
        double $$3 = $$2.g() - bgj.d($$0.ep().j(), 8.0, 4.0);
        ftm $$4 = $$2.d().d($$3, $$3, $$3);
        return $$0.dI().e($$4);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (dal)chl2, l2);
    }
}

