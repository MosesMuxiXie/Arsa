/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public record dsn(dlt a, @Nullable cgv b, @Nullable chl c, Consumer<dlp> d) {
    public dsn(dlt $$0, cgv $$1, chl $$22) {
        this($$0, $$1, $$22, $$2 -> $$22.a((dlp)$$2, $$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsn.class, "itemStack;inSlot;owner;onBreak", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsn.class, "itemStack;inSlot;owner;onBreak", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsn.class, "itemStack;inSlot;owner;onBreak", "a", "b", "c", "d"}, this, $$0);
    }
}

