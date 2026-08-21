/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ckf
extends cjd<chn> {
    public static final int c = 100;
    private final ccn d;
    private final bcz e;

    public ckf(ccn $$0, bcz $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.c), cqw.U, (Object)((Object)cqx.a)), 100);
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    protected boolean a(axf $$0, chn $$1, long $$2) {
        return !$$1.aV();
    }

    @Override
    protected void b(axf $$0, chn $$1, long $$2) {
        $$1.r(true);
        $$1.c(chx.g);
    }

    @Override
    protected void c(axf $$0, chn $$1, long $$2) {
        if ($$1.aV()) {
            $$1.k($$1.dN().d(0.1f, 1.0, 0.1f));
            $$0.a(null, $$1, this.e, bdb.g, 2.0f, 1.0f);
        }
        $$1.r(false);
        $$1.c(chx.a);
        $$1.ev().b(cqw.U);
        $$1.ev().a(cqw.T, this.d.a($$0.y));
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (chn)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (chn)chl2, l2);
    }
}

