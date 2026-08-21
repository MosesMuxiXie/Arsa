/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class clo
extends cjd<chl> {
    public static final int c = 100;
    private long d;

    public clo() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.b, (Object)((Object)cqx.a), cqw.J, (Object)((Object)cqx.c)));
    }

    @Override
    protected boolean a(axf $$0, chl $$1) {
        long $$5;
        if ($$1.cq()) {
            return false;
        }
        cim<?> $$2 = $$1.ev();
        jc $$3 = $$2.c(cqw.b).get();
        if ($$0.aq() != $$3.a()) {
            return false;
        }
        Optional<Long> $$4 = $$2.c(cqw.J);
        if ($$4.isPresent() && ($$5 = $$0.au() - $$4.get()) > 0L && $$5 < 100L) {
            return false;
        }
        eoh $$6 = $$0.a_($$3.b());
        return $$3.b().a($$1.dI(), 2.0) && $$6.a(bdp.R) && $$6.c(dzj.c) == false;
    }

    @Override
    protected boolean a(axf $$0, chl $$1, long $$2) {
        Optional<jc> $$3 = $$1.ev().c(cqw.b);
        if ($$3.isEmpty()) {
            return false;
        }
        is $$4 = $$3.get().b();
        return $$1.ev().c(dfl.e) && $$1.dR() > (double)$$4.v() + 0.4 && $$4.a($$1.dI(), 1.14);
    }

    @Override
    protected void d(axf $$0, chl $$1, long $$2) {
        if ($$2 > this.d) {
            cim<Collection<Object>> $$3 = $$1.ev();
            if ($$3.a(cqw.w)) {
                Optional<List<chl>> $$6;
                Set<jc> $$4 = $$3.c(cqw.w).get();
                if ($$3.a(cqw.g)) {
                    Optional<List<chl>> $$5 = $$3.c(cqw.g);
                } else {
                    $$6 = Optional.empty();
                }
                ckc.a($$0, $$1, null, null, $$4, $$6);
            }
            $$1.b($$1.ev().c(cqw.b).get().b());
        }
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected void b(axf $$0, chl $$1, long $$2) {
        if ($$1.gr()) {
            $$1.gs();
            this.d = $$2 + 40L;
        }
    }
}

