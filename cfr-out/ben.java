/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.ListBuilder
 */
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

abstract class ben<T, B>
implements ListBuilder<T> {
    private final DynamicOps<T> b;
    protected DataResult<B> a = DataResult.success(this.a(), (Lifecycle)Lifecycle.stable());

    protected ben(DynamicOps<T> $$0) {
        this.b = $$0;
    }

    public DynamicOps<T> ops() {
        return this.b;
    }

    protected abstract B a();

    protected abstract B a(B var1, T var2);

    protected abstract DataResult<T> b(B var1, T var2);

    public ListBuilder<T> add(T $$0) {
        this.a = this.a.map($$1 -> this.a($$1, $$0));
        return this;
    }

    public ListBuilder<T> add(DataResult<T> $$0) {
        this.a = this.a.apply2stable(this::a, $$0);
        return this;
    }

    public ListBuilder<T> withErrorsFrom(DataResult<?> $$0) {
        this.a = this.a.flatMap($$12 -> $$0.map($$1 -> $$12));
        return this;
    }

    public ListBuilder<T> mapError(UnaryOperator<String> $$0) {
        this.a = this.a.mapError($$0);
        return this;
    }

    public DataResult<T> build(T $$0) {
        DataResult $$12 = this.a.flatMap($$1 -> this.b($$1, $$0));
        this.a = DataResult.success(this.a(), (Lifecycle)Lifecycle.stable());
        return $$12;
    }
}

