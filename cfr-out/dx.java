/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class dx
implements BuiltInExceptionProvider {
    private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.double.low", $$1, $$0));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.double.big", $$1, $$0));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.float.low", $$1, $$0));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.float.big", $$1, $$0));
    private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.integer.low", $$1, $$0));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.integer.big", $$1, $$0));
    private static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.long.low", $$1, $$0));
    private static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.long.big", $$1, $$0));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> yh.b("argument.literal.incorrect", $$0));
    private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType((Message)yh.c("parsing.quote.expected.start"));
    private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType((Message)yh.c("parsing.quote.expected.end"));
    private static final DynamicCommandExceptionType l = new DynamicCommandExceptionType($$0 -> yh.b("parsing.quote.escape", $$0));
    private static final DynamicCommandExceptionType m = new DynamicCommandExceptionType($$0 -> yh.b("parsing.bool.invalid", $$0));
    private static final DynamicCommandExceptionType n = new DynamicCommandExceptionType($$0 -> yh.b("parsing.int.invalid", $$0));
    private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType((Message)yh.c("parsing.int.expected"));
    private static final DynamicCommandExceptionType p = new DynamicCommandExceptionType($$0 -> yh.b("parsing.long.invalid", $$0));
    private static final SimpleCommandExceptionType q = new SimpleCommandExceptionType((Message)yh.c("parsing.long.expected"));
    private static final DynamicCommandExceptionType r = new DynamicCommandExceptionType($$0 -> yh.b("parsing.double.invalid", $$0));
    private static final SimpleCommandExceptionType s = new SimpleCommandExceptionType((Message)yh.c("parsing.double.expected"));
    private static final DynamicCommandExceptionType t = new DynamicCommandExceptionType($$0 -> yh.b("parsing.float.invalid", $$0));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)yh.c("parsing.float.expected"));
    private static final SimpleCommandExceptionType v = new SimpleCommandExceptionType((Message)yh.c("parsing.bool.expected"));
    private static final DynamicCommandExceptionType w = new DynamicCommandExceptionType($$0 -> yh.b("parsing.expected", $$0));
    private static final SimpleCommandExceptionType x = new SimpleCommandExceptionType((Message)yh.c("command.unknown.command"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)yh.c("command.unknown.argument"));
    private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType((Message)yh.c("command.expected.separator"));
    private static final DynamicCommandExceptionType A = new DynamicCommandExceptionType($$0 -> yh.b("command.exception", $$0));

    public Dynamic2CommandExceptionType doubleTooLow() {
        return a;
    }

    public Dynamic2CommandExceptionType doubleTooHigh() {
        return b;
    }

    public Dynamic2CommandExceptionType floatTooLow() {
        return c;
    }

    public Dynamic2CommandExceptionType floatTooHigh() {
        return d;
    }

    public Dynamic2CommandExceptionType integerTooLow() {
        return e;
    }

    public Dynamic2CommandExceptionType integerTooHigh() {
        return f;
    }

    public Dynamic2CommandExceptionType longTooLow() {
        return g;
    }

    public Dynamic2CommandExceptionType longTooHigh() {
        return h;
    }

    public DynamicCommandExceptionType literalIncorrect() {
        return i;
    }

    public SimpleCommandExceptionType readerExpectedStartOfQuote() {
        return j;
    }

    public SimpleCommandExceptionType readerExpectedEndOfQuote() {
        return k;
    }

    public DynamicCommandExceptionType readerInvalidEscape() {
        return l;
    }

    public DynamicCommandExceptionType readerInvalidBool() {
        return m;
    }

    public DynamicCommandExceptionType readerInvalidInt() {
        return n;
    }

    public SimpleCommandExceptionType readerExpectedInt() {
        return o;
    }

    public DynamicCommandExceptionType readerInvalidLong() {
        return p;
    }

    public SimpleCommandExceptionType readerExpectedLong() {
        return q;
    }

    public DynamicCommandExceptionType readerInvalidDouble() {
        return r;
    }

    public SimpleCommandExceptionType readerExpectedDouble() {
        return s;
    }

    public DynamicCommandExceptionType readerInvalidFloat() {
        return t;
    }

    public SimpleCommandExceptionType readerExpectedFloat() {
        return u;
    }

    public SimpleCommandExceptionType readerExpectedBool() {
        return v;
    }

    public DynamicCommandExceptionType readerExpectedSymbol() {
        return w;
    }

    public SimpleCommandExceptionType dispatcherUnknownCommand() {
        return x;
    }

    public SimpleCommandExceptionType dispatcherUnknownArgument() {
        return y;
    }

    public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
        return z;
    }

    public DynamicCommandExceptionType dispatcherParseException() {
        return A;
    }
}

