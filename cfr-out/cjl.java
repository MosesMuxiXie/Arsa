/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cjl
extends cjd<cvq> {
    private static final int c = 60;
    private static final int d = 100;
    private int e;

    public cjl() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), 100);
    }

    @Override
    protected boolean a(axf $$0, cvq $$1) {
        return $$1.aF() == chx.a;
    }

    @Override
    protected boolean a(axf $$0, cvq $$1, long $$2) {
        return this.e < 60;
    }

    @Override
    protected void b(axf $$0, cvq $$1, long $$2) {
        if ($$1.bB()) {
            return;
        }
        $$1.c(chx.i);
        this.e = 0;
    }

    @Override
    protected void c(axf $$0, cvq $$1, long $$2) {
        $$1.c(chx.a);
    }

    @Override
    protected void d(axf $$0, cvq $$1, long $$2) {
        ++this.e;
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (cvq)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cvq)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (cvq)chl2, l2);
    }
}

