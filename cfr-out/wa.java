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
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public class wa<T> {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.nbt.trailing"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.nbt.expected.compound"));
    public static final char c = ',';
    public static final char d = ':';
    private static final wa<vz> g = wa.a(vn.a);
    public static final Codec<uz> e = Codec.STRING.comapFlatMap($$0 -> {
        try {
            vz $$1 = g.b((String)$$0);
            if ($$1 instanceof uz) {
                uz $$2 = (uz)$$1;
                return DataResult.success((Object)$$2, (Lifecycle)Lifecycle.stable());
            }
            return DataResult.error(() -> "Expected compound tag, got " + String.valueOf($$1));
        }
        catch (CommandSyntaxException $$3) {
            return DataResult.error(() -> ((CommandSyntaxException)$$3).getMessage());
        }
    }, uz::toString);
    public static final Codec<uz> f = Codec.withAlternative(e, uz.a);
    private final DynamicOps<T> h;
    private final byq<T> i;

    private wa(DynamicOps<T> $$0, byq<T> $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public DynamicOps<T> a() {
        return this.h;
    }

    public static <T> wa<T> a(DynamicOps<T> $$0) {
        return new wa<T>($$0, vt.a($$0));
    }

    private static uz a(StringReader $$0, vz $$1) throws CommandSyntaxException {
        if ($$1 instanceof uz) {
            uz $$2 = (uz)$$1;
            return $$2;
        }
        throw b.createWithContext((ImmutableStringReader)$$0);
    }

    public static uz a(String $$0) throws CommandSyntaxException {
        StringReader $$1 = new StringReader($$0);
        return wa.a($$1, g.a($$1));
    }

    public T b(String $$0) throws CommandSyntaxException {
        return this.a(new StringReader($$0));
    }

    public T a(StringReader $$0) throws CommandSyntaxException {
        T $$1 = this.i.a($$0);
        $$0.skipWhitespace();
        if ($$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        return $$1;
    }

    public T b(StringReader $$0) throws CommandSyntaxException {
        return this.i.a($$0);
    }

    public static uz c(StringReader $$0) throws CommandSyntaxException {
        vz $$1 = g.b($$0);
        return wa.a($$0, $$1);
    }
}

