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

public abstract class byu
implements byl<StringReader, String> {
    private final byf<CommandSyntaxException> a;
    private final byf<CommandSyntaxException> b;

    public byu(byf<CommandSyntaxException> $$0, byf<CommandSyntaxException> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public @Nullable String b(byk<StringReader> $$0) {
        int $$3;
        int $$4;
        StringReader $$1 = $$0.f();
        $$1.skipWhitespace();
        String $$2 = $$1.getString();
        for ($$4 = $$3 = $$1.getCursor(); $$4 < $$2.length() && this.a($$2.charAt($$4)); ++$$4) {
        }
        int $$5 = $$4 - $$3;
        if ($$5 == 0) {
            $$0.b().a($$0.g(), this.a);
            return null;
        }
        if ($$2.charAt($$3) == '_' || $$2.charAt($$4 - 1) == '_') {
            $$0.b().a($$0.g(), this.b);
            return null;
        }
        $$1.setCursor($$4);
        return $$2.substring($$3, $$4);
    }

    protected abstract boolean a(char var1);

    @Override
    public /* synthetic */ @Nullable Object a(byk byk2) {
        return this.b(byk2);
    }
}

