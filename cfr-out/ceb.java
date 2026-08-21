/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public sealed interface ceb<Value> {

    @FunctionalInterface
    public static interface b<Value>
    extends ceb<Value> {
        public Value applyPositional(Value var1, ftm var2, @Nullable cej var3);
    }

    @FunctionalInterface
    public static interface c<Value>
    extends ceb<Value> {
        public Value applyTimeBased(Value var1, int var2);
    }

    @FunctionalInterface
    public static interface a<Value>
    extends ceb<Value> {
        public Value applyConstant(Value var1);
    }
}

