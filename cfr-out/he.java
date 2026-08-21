/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;

public interface he<T> {
    public void a(T var1, List<T> var2, ContextChain<T> var3, hb var4, hh<T> var5);

    public static interface a<T>
    extends RedirectModifier<T>,
    he<T> {
        default public Collection<T> apply(CommandContext<T> $$0) throws CommandSyntaxException {
            throw new UnsupportedOperationException("This function should not run");
        }
    }
}

