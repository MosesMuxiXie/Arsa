/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public interface ef<T extends ef<T>>
extends bbo {
    public T b(ea var1);

    public ea q();

    default public T a_() {
        return this.b(ea.a);
    }

    public CommandDispatcher<T> x();

    public void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable hj var4);

    public boolean y();

    default public void a(CommandSyntaxException $$0, boolean $$1, @Nullable hj $$2) {
        this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
    }

    public static <T extends ef<T>> ResultConsumer<T> b_() {
        return ($$0, $$1, $$2) -> ((ef)$$0.getSource()).q().onResult($$1, $$2);
    }
}

