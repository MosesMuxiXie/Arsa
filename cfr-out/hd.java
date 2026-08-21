/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public interface hd<T> {
    public void a(T var1, ContextChain<T> var2, hb var3, hh<T> var4);

    public static abstract class b<T extends ef<T>>
    implements hd<T> {
        @Override
        public final void a(T $$0, ContextChain<T> $$1, hb $$2, hh<T> $$3) {
            try {
                this.b($$0, $$1, $$2, $$3);
            }
            catch (CommandSyntaxException $$4) {
                this.a($$4, $$0, $$2, $$3.a());
                $$0.q().onFailure();
            }
        }

        protected void a(CommandSyntaxException $$0, T $$1, hb $$2, @Nullable hj $$3) {
            $$1.a($$0, $$2.a(), $$3);
        }

        protected abstract void b(T var1, ContextChain<T> var2, hb var3, hh<T> var4) throws CommandSyntaxException;
    }

    public static interface a<T>
    extends Command<T>,
    hd<T> {
        default public int run(CommandContext<T> $$0) throws CommandSyntaxException {
            throw new UnsupportedOperationException("This function should not run");
        }
    }
}

