/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cmp
extends cjd<dcx> {
    private long c;

    public cmp() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.s, (Object)((Object)cqx.a), cqw.h, (Object)((Object)cqx.a)), 350, 350);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        return this.a($$1);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return $$2 <= this.c && this.a($$1);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        cfy $$3 = $$1.ev().c(cqw.s).get();
        cjf.a((chl)$$1, $$3, 0.5f, 2);
        $$0.a((cgk)$$3, (byte)18);
        $$0.a((cgk)$$1, (byte)18);
        int $$4 = 275 + $$1.ep().a(50);
        this.c = $$2 + (long)$$4;
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        dcx $$3 = (dcx)$$1.ev().c(cqw.s).get();
        if ($$1.g((cgk)$$3) > 5.0) {
            return;
        }
        cjf.a((chl)$$1, $$3, 0.5f, 2);
        if ($$2 >= this.c) {
            $$1.ha();
            $$3.ha();
            this.a($$0, $$1, $$3);
        } else if ($$1.ep().a(35) == 0) {
            $$0.a((cgk)$$3, (byte)12);
            $$0.a((cgk)$$1, (byte)12);
        }
    }

    private void a(axf $$0, dcx $$1, dcx $$2) {
        Optional<is> $$3 = this.b($$0, $$1);
        if ($$3.isEmpty()) {
            $$0.a((cgk)$$2, (byte)13);
            $$0.a((cgk)$$1, (byte)13);
        } else {
            Optional<dcx> $$4 = this.b($$0, $$1, $$2);
            if ($$4.isPresent()) {
                this.a($$0, $$4.get(), $$3.get());
            } else {
                $$0.F().b($$3.get());
                $$0.W().b($$3.get());
            }
        }
    }

    @Override
    protected void d(axf $$0, dcx $$1, long $$2) {
        $$1.ev().b(cqw.s);
    }

    @Override
    private boolean a(dcx $$02) {
        cim<dcx> $$1 = $$02.ev();
        Optional<cfy> $$2 = $$1.c(cqw.s).filter($$0 -> $$0.ay() == cgu.bL);
        if ($$2.isEmpty()) {
            return false;
        }
        return cjf.a($$1, cqw.s, cgu.bL) && $$02.Y_() && $$2.get().Y_();
    }

    private Optional<is> b(axf $$02, dcx $$12) {
        return $$02.F().a($$0 -> $$0.a(ctb.n), ($$1, $$2) -> this.a($$12, (is)$$2, (jd<cta>)$$1), $$12.dK(), 48);
    }

    private boolean a(dcx $$0, is $$1, jd<cta> $$2) {
        flp $$3 = $$0.N().a($$1, $$2.a().c());
        return $$3 != null && $$3.j();
    }

    private Optional<dcx> b(axf $$0, dcx $$1, dcx $$2) {
        dcx $$3 = $$1.b($$0, $$2);
        if ($$3 == null) {
            return Optional.empty();
        }
        $$1.d_(6000);
        $$2.d_(6000);
        $$3.d_(-24000);
        $$3.b($$1.dP(), $$1.dR(), $$1.dV(), 0.0f, 0.0f);
        $$0.a_($$3);
        $$0.a((cgk)$$3, (byte)12);
        return Optional.of($$3);
    }

    private void a(axf $$0, dcx $$1, is $$2) {
        jc $$3 = jc.a($$0.aq(), $$2);
        $$1.ev().a(cqw.b, $$3);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

