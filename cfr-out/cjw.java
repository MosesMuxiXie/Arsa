/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cjw
extends cjd<dcx> {
    private static final int d = 1200;
    final float c;

    public cjw(float $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.d, (Object)((Object)cqx.a)), 1200);
        this.c = $$0;
    }

    @Override
    protected boolean a(axf $$02, dcx $$1) {
        return $$1.ev().f().map($$0 -> $$0 == dfl.b || $$0 == dfl.c || $$0 == dfl.d).orElse(true);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return $$1.ev().a(cqw.d);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        cjf.a((chl)$$1, $$1.ev().c(cqw.d).get().b(), this.c, 1);
    }

    @Override
    protected void c(axf $$0, dcx $$12, long $$2) {
        Optional<jc> $$3 = $$12.ev().c(cqw.d);
        $$3.ifPresent($$1 -> {
            is $$2 = $$1.b();
            axf $$3 = $$0.s().a($$1.a());
            if ($$3 == null) {
                return;
            }
            csx $$4 = $$3.F();
            if ($$4.a($$2, (jd<cta> $$0) -> true)) {
                $$4.b($$2);
            }
            $$0.W().b($$2);
        });
        $$12.ev().b(cqw.d);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

