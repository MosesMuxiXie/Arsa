/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

public class ep
implements ArgumentType<a> {
    private static final Collection<String> a = Arrays.asList("eyes", "feet");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("argument.anchor.invalid", $$0));

    public static a a(CommandContext<ed> $$0, String $$1) {
        return (a)((Object)$$0.getArgument($$1, a.class));
    }

    public static ep a() {
        return new ep();
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        String $$2 = $$0.readUnquotedString();
        a $$3 = ep$a.a($$2);
        if ($$3 == null) {
            $$0.setCursor($$1);
            throw b.createWithContext((ImmutableStringReader)$$0, (Object)$$2);
        }
        return $$3;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.b(ep$a.c.keySet(), $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("feet", ($$0, $$1) -> $$0);
        public static final /* enum */ a b = new a("eyes", ($$0, $$1) -> new ftm($$0.g, $$0.h + (double)$$1.dk(), $$0.i));
        static final Map<String, a> c;
        private final String d;
        private final BiFunction<ftm, cgk, ftm> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, BiFunction<ftm, cgk, ftm> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public static @Nullable a a(String $$0) {
            return c.get($$0);
        }

        public ftm a(cgk $$0) {
            return this.e.apply($$0.dI(), $$0);
        }

        public ftm a(ed $$0) {
            cgk $$1 = $$0.g();
            if ($$1 == null) {
                return $$0.e();
            }
            return this.e.apply($$0.e(), $$1);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            f = ep$a.a();
            c = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
                for (a $$1 : ep$a.values()) {
                    $$0.put($$1.d, $$1);
                }
            });
        }
    }
}

