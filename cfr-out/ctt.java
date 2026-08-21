/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ctt
extends cjd<ctr> {
    public ctt() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.O, (Object)((Object)cqx.a), cqw.z, (Object)((Object)cqx.a)), 200);
    }

    @Override
    protected boolean a(axf $$0, ctr $$1) {
        return $$1.by();
    }

    @Override
    protected boolean a(axf $$0, ctr $$1, long $$2) {
        return $$1.by() && $$1.ev().a(cqw.O);
    }

    @Override
    protected void b(axf $$0, ctr $$1, long $$2) {
        cim<ctr> $$3 = $$1.ev();
        $$3.b(cqw.n);
        $$3.b(cqw.o);
        $$1.a(new cfm(cfo.j, 200, 0));
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (ctr)chl2, l2);
    }
}

