/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class daq
extends cjd<dal> {
    public daq() {
        super(Map.of(cqw.p, cqx.a, cqw.bk, cqx.b, cqw.bl, cqx.b, cqw.n, cqx.b, cqw.bg, cqx.b));
    }

    @Override
    protected boolean a(axf $$0, dal $$1) {
        return $$1.cq() || $$1.by() || $$1.e(cfo.y) != null;
    }

    @Override
    protected boolean a(axf $$0, dal $$1, long $$2) {
        return false;
    }

    @Override
    protected void b(axf $$0, dal $$1, long $$2) {
        $$1.ev().a(cqw.bg, bhr.a, 60L);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dal)chl2, l2);
    }
}

