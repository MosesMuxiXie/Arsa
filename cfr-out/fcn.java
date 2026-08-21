/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class fcn
extends fcd {
    public static final MapCodec<fcn> b = cbn.b(eoh.a).comapFlatMap(fcn::a, $$0 -> $$0.c).fieldOf("entries");
    private final cbn<eoh> c;

    private static DataResult<fcn> a(cbn<eoh> $$0) {
        if ($$0.c()) {
            return DataResult.error(() -> "WeightedStateProvider with no states");
        }
        return DataResult.success((Object)new fcn($$0));
    }

    public fcn(cbn<eoh> $$0) {
        this.c = $$0;
    }

    public fcn(cbn.a<eoh> $$0) {
        this($$0.a());
    }

    @Override
    protected fce<?> a() {
        return fce.b;
    }

    @Override
    public eoh a(bgr $$0, is $$1) {
        return this.c.b($$0);
    }
}

