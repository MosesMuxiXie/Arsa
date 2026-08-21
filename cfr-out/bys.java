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

public abstract class bys
implements byl<StringReader, String> {
    private final int a;
    private final int b;
    private final byf<CommandSyntaxException> c;

    public bys(int $$0, byf<CommandSyntaxException> $$1) {
        this($$0, Integer.MAX_VALUE, $$1);
    }

    public bys(int $$0, int $$1, byf<CommandSyntaxException> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public @Nullable String b(byk<StringReader> $$0) {
        int $$3;
        int $$4;
        StringReader $$1 = $$0.f();
        String $$2 = $$1.getString();
        for ($$4 = $$3 = $$1.getCursor(); $$4 < $$2.length() && this.a($$2.charAt($$4)) && $$4 - $$3 < this.b; ++$$4) {
        }
        int $$5 = $$4 - $$3;
        if ($$5 < this.a) {
            $$0.b().a($$0.g(), this.c);
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

