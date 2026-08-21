/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ie<A extends ArgumentType<?>>
implements ib<A, a> {
    private final a a;

    private ie(Function<dz, A> $$0) {
        this.a = new a($$0);
    }

    public static <T extends ArgumentType<?>> ie<T> a(Supplier<T> $$0) {
        return new ie<ArgumentType>($$1 -> (ArgumentType)$$0.get());
    }

    public static <T extends ArgumentType<?>> ie<T> a(Function<dz, T> $$0) {
        return new ie<T>($$0);
    }

    @Override
    public void a(a $$0, wx $$1) {
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
    }

    @Override
    public a a(wx $$0) {
        return this.a;
    }

    public a b(A $$0) {
        return this.a;
    }

    @Override
    public /* synthetic */ ib.a a(ArgumentType argumentType) {
        return this.b(argumentType);
    }

    @Override
    public /* synthetic */ ib.a b(wx wx2) {
        return this.a(wx2);
    }

    public final class a
    implements ib.a<A> {
        private final Function<dz, A> b;

        public a(Function<dz, A> $$1) {
            this.b = $$1;
        }

        @Override
        public A b(dz $$0) {
            return (ArgumentType)this.b.apply($$0);
        }

        @Override
        public ib<A, ?> a() {
            return ie.this;
        }
    }
}

