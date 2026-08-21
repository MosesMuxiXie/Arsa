/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ckv
extends cjd<chn> {
    private final cch c;
    private final float d;
    private final float e;
    private final float f;

    public ckv(cch $$0, float $$1, float $$2, float $$3) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.b), cqw.R, (Object)((Object)cqx.b)));
        if ($$2 > $$3) {
            throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
        }
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3 - $$2;
    }

    protected void a(axf $$0, chn $$1, long $$2) {
        bgr $$3 = $$1.ep();
        float $$4 = bgj.a($$3.i() * this.f + this.e, -90.0f, 90.0f);
        float $$5 = bgj.f($$1.ec() + 2.0f * $$3.i() * this.d - this.d);
        ftm $$6 = ftm.a($$4, $$5);
        $$1.ev().a(cqw.o, new cjg($$1.bV().e($$6)));
        $$1.ev().a(cqw.R, this.c.a($$3));
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (chn)chl2, l2);
    }
}

