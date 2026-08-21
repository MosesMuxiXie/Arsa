/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;

public class fvm<Value, Argument>
implements ceb.c<Value> {
    private final cel<Value, Argument> a;
    private final bgd<Argument> b;
    private final LongSupplier c;
    private int d;
    private @Nullable Argument e;

    public fvm(Optional<Integer> $$0, cel<Value, Argument> $$1, bgc<Argument> $$2, cei<Argument> $$3, LongSupplier $$4) {
        this.a = $$1;
        this.c = $$4;
        this.b = $$2.a($$0, $$3);
    }

    @Override
    public Value applyTimeBased(Value $$0, int $$1) {
        if (this.e == null || $$1 != this.d) {
            this.d = $$1;
            this.e = this.b.a(this.c.getAsLong());
        }
        return this.a.apply($$0, this.e);
    }
}

