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

public class byt
implements byl<StringReader, amo> {
    public static final byl<StringReader, amo> a = new byt();

    private byt() {
    }

    public @Nullable amo b(byk<StringReader> $$0) {
        $$0.f().skipWhitespace();
        try {
            return amo.b($$0.f());
        }
        catch (CommandSyntaxException $$1) {
            return null;
        }
    }

    @Override
    public /* synthetic */ @Nullable Object a(byk byk2) {
        return this.b(byk2);
    }
}

