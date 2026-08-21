/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public abstract class byw<C, V>
implements byl<StringReader, V>,
byx {
    private final byj<StringReader, amo> b;
    protected final C a;
    private final byf<CommandSyntaxException> c;

    protected byw(byj<StringReader, amo> $$0, C $$1) {
        this.b = $$0;
        this.a = $$1;
        this.c = byf.a(amo.c);
    }

    @Override
    public @Nullable V a(byk<StringReader> $$0) {
        $$0.f().skipWhitespace();
        int $$1 = $$0.g();
        amo $$2 = $$0.a(this.b);
        if ($$2 != null) {
            try {
                return this.a((ImmutableStringReader)$$0.f(), $$2);
            }
            catch (Exception $$3) {
                $$0.b().a($$1, this, $$3);
                return null;
            }
        }
        $$0.b().a($$1, this, this.c);
        return null;
    }

    protected abstract V a(ImmutableStringReader var1, amo var2) throws Exception;
}

