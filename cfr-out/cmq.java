/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cmq
extends cjd<dcx> {
    public cmq() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of());
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return cmq.c($$1) || cmq.b($$1);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        if (cmq.c($$1) || cmq.b($$1)) {
            cim<dcx> $$3 = $$1.ev();
            if (!$$3.c(dfl.g)) {
                $$3.b(cqw.u);
                $$3.b(cqw.n);
                $$3.b(cqw.o);
                $$3.b(cqw.s);
                $$3.b(cqw.r);
            }
            $$3.a(dfl.g);
        }
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        if ($$2 % 100L == 0L) {
            $$1.a($$0, $$2, 3);
        }
    }

    public static boolean b(chl $$0) {
        return $$0.ev().a(cqw.B);
    }

    public static boolean c(chl $$0) {
        return $$0.ev().a(cqw.y);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

