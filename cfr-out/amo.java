/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public final class amo
implements Comparable<amo> {
    public static final Codec<amo> a = Codec.STRING.comapFlatMap(amo::d, amo::toString).stable();
    public static final aao<ByteBuf, amo> b = aam.p.a(amo::a, amo::toString);
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("argument.id.invalid"));
    public static final char d = ':';
    public static final String e = "minecraft";
    public static final String f = "realms";
    private final String h;
    private final String i;

    private amo(String $$0, String $$1) {
        assert (amo.j($$0));
        assert (amo.i($$1));
        this.h = $$0;
        this.i = $$1;
    }

    private static amo d(String $$0, String $$1) {
        return new amo(amo.e($$0, $$1), amo.f($$0, $$1));
    }

    public static amo a(String $$0, String $$1) {
        return amo.d($$0, $$1);
    }

    public static amo a(String $$0) {
        return amo.a($$0, ':');
    }

    public static amo b(String $$0) {
        return new amo(e, amo.f(e, $$0));
    }

    public static @Nullable amo c(String $$0) {
        return amo.b($$0, ':');
    }

    public static @Nullable amo b(String $$0, String $$1) {
        if (amo.j($$0) && amo.i($$1)) {
            return new amo($$0, $$1);
        }
        return null;
    }

    public static amo a(String $$0, char $$1) {
        int $$2 = $$0.indexOf($$1);
        if ($$2 >= 0) {
            String $$3 = $$0.substring($$2 + 1);
            if ($$2 != 0) {
                String $$4 = $$0.substring(0, $$2);
                return amo.d($$4, $$3);
            }
            return amo.b($$3);
        }
        return amo.b($$0);
    }

    public static @Nullable amo b(String $$0, char $$1) {
        int $$2 = $$0.indexOf($$1);
        if ($$2 >= 0) {
            String $$3 = $$0.substring($$2 + 1);
            if (!amo.i($$3)) {
                return null;
            }
            if ($$2 != 0) {
                String $$4 = $$0.substring(0, $$2);
                return amo.j($$4) ? new amo($$4, $$3) : null;
            }
            return new amo(e, $$3);
        }
        return amo.i($$0) ? new amo(e, $$0) : null;
    }

    public static DataResult<amo> d(String $$0) {
        try {
            return DataResult.success((Object)amo.a($$0));
        }
        catch (s $$1) {
            return DataResult.error(() -> "Not a valid resource location: " + $$0 + " " + $$1.getMessage());
        }
    }

    public String a() {
        return this.i;
    }

    public String b() {
        return this.h;
    }

    public amo e(String $$0) {
        return new amo(this.h, amo.f(this.h, $$0));
    }

    public amo a(UnaryOperator<String> $$0) {
        return this.e((String)$$0.apply(this.i));
    }

    public amo f(String $$0) {
        return this.e($$0 + this.i);
    }

    public amo g(String $$0) {
        return this.e(this.i + $$0);
    }

    public String toString() {
        return this.h + ":" + this.i;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof amo) {
            amo $$1 = (amo)$$0;
            return this.h.equals($$1.h) && this.i.equals($$1.i);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.h.hashCode() + this.i.hashCode();
    }

    public int a(amo $$0) {
        int $$1 = this.i.compareTo($$0.i);
        if ($$1 == 0) {
            $$1 = this.h.compareTo($$0.h);
        }
        return $$1;
    }

    public String c() {
        return this.toString().replace('/', '_').replace(':', '_');
    }

    public String d() {
        return this.h + "." + this.i;
    }

    public String e() {
        return this.h.equals(e) ? this.i : this.d();
    }

    public String f() {
        return this.h.equals(e) ? this.i : this.toString();
    }

    public String h(String $$0) {
        return $$0 + "." + this.d();
    }

    public String c(String $$0, String $$1) {
        return $$0 + "." + this.d() + "." + $$1;
    }

    private static String c(StringReader $$0) {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && amo.a($$0.peek())) {
            $$0.skip();
        }
        return $$0.getString().substring($$1, $$0.getCursor());
    }

    public static amo a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        String $$2 = amo.c($$0);
        try {
            return amo.a($$2);
        }
        catch (s $$3) {
            $$0.setCursor($$1);
            throw c.createWithContext((ImmutableStringReader)$$0);
        }
    }

    public static amo b(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        String $$2 = amo.c($$0);
        if ($$2.isEmpty()) {
            throw c.createWithContext((ImmutableStringReader)$$0);
        }
        try {
            return amo.a($$2);
        }
        catch (s $$3) {
            $$0.setCursor($$1);
            throw c.createWithContext((ImmutableStringReader)$$0);
        }
    }

    public static boolean a(char $$0) {
        return $$0 >= '0' && $$0 <= '9' || $$0 >= 'a' && $$0 <= 'z' || $$0 == '_' || $$0 == ':' || $$0 == '/' || $$0 == '.' || $$0 == '-';
    }

    public static boolean i(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            if (amo.b($$0.charAt($$1))) continue;
            return false;
        }
        return true;
    }

    public static boolean j(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            if (amo.c($$0.charAt($$1))) continue;
            return false;
        }
        return true;
    }

    private static String e(String $$0, String $$1) {
        if (!amo.j($$0)) {
            throw new s("Non [a-z0-9_.-] character in namespace of location: " + $$0 + ":" + $$1);
        }
        return $$0;
    }

    public static boolean b(char $$0) {
        return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '/' || $$0 == '.';
    }

    private static boolean c(char $$0) {
        return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '.';
    }

    private static String f(String $$0, String $$1) {
        if (!amo.i($$1)) {
            throw new s("Non [a-z0-9/._-] character in path of location: " + $$0 + ":" + $$1);
        }
        return $$1;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((amo)object);
    }
}

