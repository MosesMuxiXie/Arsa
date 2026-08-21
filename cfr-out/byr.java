/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class byr
implements byl<StringReader, String> {
    private final Pattern a;
    private final byf<CommandSyntaxException> b;

    public byr(Pattern $$0, byf<CommandSyntaxException> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public String b(byk<StringReader> $$0) {
        StringReader $$1 = $$0.f();
        String $$2 = $$1.getString();
        Matcher $$3 = this.a.matcher($$2).region($$1.getCursor(), $$2.length());
        if (!$$3.lookingAt()) {
            $$0.b().a($$0.g(), this.b);
            return null;
        }
        $$1.setCursor($$3.end());
        return $$3.group(0);
    }

    @Override
    public /* synthetic */ Object a(byk byk2) {
        return this.b(byk2);
    }
}

