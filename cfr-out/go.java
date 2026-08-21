/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class go
implements ArgumentType<a> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("arguments.function.tag.unknown", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("arguments.function.unknown", $$0));

    public static go a() {
        return new go();
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '#') {
            $$0.skip();
            final amo $$1 = amo.a($$0);
            return new a(){

                @Override
                public Collection<ht<ed>> a(CommandContext<ed> $$0) throws CommandSyntaxException {
                    return go.b($$0, $$1);
                }

                @Override
                public Pair<amo, Either<ht<ed>, Collection<ht<ed>>>> b(CommandContext<ed> $$0) throws CommandSyntaxException {
                    return Pair.of((Object)$$1, (Object)Either.right(go.b($$0, $$1)));
                }

                @Override
                public Pair<amo, Collection<ht<ed>>> c(CommandContext<ed> $$0) throws CommandSyntaxException {
                    return Pair.of((Object)$$1, go.b($$0, $$1));
                }
            };
        }
        final amo $$2 = amo.a($$0);
        return new a(){

            @Override
            public Collection<ht<ed>> a(CommandContext<ed> $$0) throws CommandSyntaxException {
                return Collections.singleton(go.a($$0, $$2));
            }

            @Override
            public Pair<amo, Either<ht<ed>, Collection<ht<ed>>>> b(CommandContext<ed> $$0) throws CommandSyntaxException {
                return Pair.of((Object)$$2, (Object)Either.left(go.a($$0, $$2)));
            }

            @Override
            public Pair<amo, Collection<ht<ed>>> c(CommandContext<ed> $$0) throws CommandSyntaxException {
                return Pair.of((Object)$$2, Collections.singleton(go.a($$0, $$2)));
            }
        };
    }

    static ht<ed> a(CommandContext<ed> $$0, amo $$1) throws CommandSyntaxException {
        return ((ed)$$0.getSource()).m().aC().a($$1).orElseThrow(() -> c.create((Object)$$1.toString()));
    }

    static Collection<ht<ed>> b(CommandContext<ed> $$0, amo $$1) throws CommandSyntaxException {
        List<ht<ed>> $$2 = ((ed)$$0.getSource()).m().aC().b($$1);
        if ($$2 == null) {
            throw b.create((Object)$$1.toString());
        }
        return $$2;
    }

    public static Collection<ht<ed>> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((a)$$0.getArgument($$1, a.class)).a($$0);
    }

    public static Pair<amo, Either<ht<ed>, Collection<ht<ed>>>> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((a)$$0.getArgument($$1, a.class)).b($$0);
    }

    public static Pair<amo, Collection<ht<ed>>> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((a)$$0.getArgument($$1, a.class)).c($$0);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface a {
        public Collection<ht<ed>> a(CommandContext<ed> var1) throws CommandSyntaxException;

        public Pair<amo, Either<ht<ed>, Collection<ht<ed>>>> b(CommandContext<ed> var1) throws CommandSyntaxException;

        public Pair<amo, Collection<ht<ed>>> c(CommandContext<ed> var1) throws CommandSyntaxException;
    }
}

