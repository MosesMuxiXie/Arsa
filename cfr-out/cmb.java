/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cmb<T extends chn>
extends cjd<T> {
    private final float c;

    public cmb(float $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of());
        this.c = $$0;
    }

    public static <T extends chn> boolean a(T $$0) {
        return $$0.by() && $$0.b(bdv.a) > $$0.dE() || $$0.bN();
    }

    @Override
    protected boolean a(axf $$0, chn $$1) {
        return cmb.a($$1);
    }

    @Override
    protected boolean a(axf $$0, chn $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(axf $$0, chn $$1, long $$2) {
        if ($$1.ep().i() < this.c) {
            $$1.L().a();
        }
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.b(axf2, (chn)chl2, l2);
    }
}

