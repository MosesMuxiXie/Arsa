/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public class bzb
implements byl<StringReader, String> {
    private final int a;
    private final byf<CommandSyntaxException> b;

    public bzb(int $$0, byf<CommandSyntaxException> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public @Nullable String b(byk<StringReader> $$0) {
        $$0.f().skipWhitespace();
        int $$1 = $$0.g();
        String $$2 = $$0.f().readUnquotedString();
        if ($$2.length() < this.a) {
            $$0.b().a($$1, this.b);
            return null;
        }
        return $$2;
    }

    @Override
    public /* synthetic */ @Nullable Object a(byk byk2) {
        return this.b(byk2);
    }
}

