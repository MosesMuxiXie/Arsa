/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class evm
extends Record {
    private final evo b;
    private final evl c;
    public static final Codec<evm> a = RecordCodecBuilder.create($$0 -> $$0.group((App)evo.a.forGetter(evm::a), (App)evl.a.forGetter(evm::b)).apply((Applicative)$$0, $$0.stable(evm::new)));

    public evm(evo $$0, evl $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static <T> DataResult<T> a(DynamicOps<T> $$0, evo $$1, evl $$2) {
        return a.encodeStart($$0, (Object)new evm($$1, $$2));
    }

    public static <T> DataResult<T> a(DynamicOps<T> $$0, evo $$1, jr $$2) {
        return evm.a($$0, $$1, new evl($$2.f(mj.bF)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{evm.class, "options;dimensions", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{evm.class, "options;dimensions", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{evm.class, "options;dimensions", "b", "c"}, this, $$0);
    }

    public evo a() {
        return this.b;
    }

    public evl b() {
        return this.c;
    }
}

