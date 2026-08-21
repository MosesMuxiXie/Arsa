/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.apache.commons.io.FilenameUtils
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class fj<T>
implements ArgumentType<Collection<jd.c<T>>> {
    private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
    public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.resource_selector.not_found", $$0, $$1));
    final amt<? extends jq<T>> c;
    private final jf<T> d;

    fj(dz $$0, amt<? extends jq<T>> $$1) {
        this.c = $$1;
        this.d = $$0.e($$1);
    }

    public Collection<jd.c<T>> a(StringReader $$0) throws CommandSyntaxException {
        String $$12 = fj.a(fj.b($$0));
        List<jd.c<T>> $$2 = this.d.c().filter($$1 -> fj.a($$12, $$1.h().a())).toList();
        if ($$2.isEmpty()) {
            throw a.createWithContext((ImmutableStringReader)$$0, (Object)$$12, (Object)this.c.a());
        }
        return $$2;
    }

    public static <T> Collection<jd.c<T>> a(StringReader $$0, jf<T> $$12) {
        String $$2 = fj.a(fj.b($$0));
        return $$12.c().filter($$1 -> fj.a($$2, $$1.h().a())).toList();
    }

    private static String b(StringReader $$0) {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && fj.a($$0.peek())) {
            $$0.skip();
        }
        return $$0.getString().substring($$1, $$0.getCursor());
    }

    private static boolean a(char $$0) {
        return amo.a($$0) || $$0 == '*' || $$0 == '?';
    }

    private static String a(String $$0) {
        if (!$$0.contains(":")) {
            return "minecraft:" + $$0;
        }
        return $$0;
    }

    private static boolean a(String $$0, amo $$1) {
        return FilenameUtils.wildcardMatch((String)$$1.toString(), (String)$$0);
    }

    public static <T> fj<T> a(dz $$0, amt<? extends jq<T>> $$1) {
        return new fj<T>($$0, $$1);
    }

    public static <T> Collection<jd.c<T>> a(CommandContext<ed> $$0, String $$1) {
        return (Collection)$$0.getArgument($$1, Collection.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.c, ei.a.b);
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class fj$a<T>
    implements ib<fj<T>, a> {
        @Override
        public void a(a $$0, wx $$1) {
            $$1.b($$0.b);
        }

        @Override
        public a a(wx $$0) {
            return new a($$0.r());
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("registry", $$0.b.a().toString());
        }

        @Override
        public a a(fj<T> $$0) {
            return new a($$0.c);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fj<T>> {
            final amt<? extends jq<T>> b;

            a(amt<? extends jq<T>> $$1) {
                this.b = $$1;
            }

            public fj<T> a(dz $$0) {
                return new fj($$0, this.b);
            }

            @Override
            public ib<fj<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

