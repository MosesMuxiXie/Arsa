/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;

public class csh
extends crx {
    private static final ImmutableMap<cgu<?>, Float> a = ImmutableMap.builder().put(cgu.O, (Object)Float.valueOf(8.0f)).put(cgu.W, (Object)Float.valueOf(12.0f)).put(cgu.ar, (Object)Float.valueOf(8.0f)).put(cgu.as, (Object)Float.valueOf(12.0f)).put(cgu.bb, (Object)Float.valueOf(15.0f)).put(cgu.bh, (Object)Float.valueOf(12.0f)).put(cgu.bK, (Object)Float.valueOf(8.0f)).put(cgu.bM, (Object)Float.valueOf(10.0f)).put(cgu.bV, (Object)Float.valueOf(10.0f)).put(cgu.bW, (Object)Float.valueOf(8.0f)).put(cgu.bZ, (Object)Float.valueOf(8.0f)).build();

    @Override
    protected boolean a(axf $$0, chl $$1, chl $$2) {
        return this.b($$2) && this.a($$1, $$2);
    }

    private boolean a(chl $$0, chl $$1) {
        float $$2 = ((Float)a.get($$1.ay())).floatValue();
        return $$1.g($$0) <= (double)($$2 * $$2);
    }

    @Override
    protected cqw<chl> b() {
        return cqw.B;
    }

    private boolean b(chl $$0) {
        return a.containsKey($$0.ay());
    }
}

