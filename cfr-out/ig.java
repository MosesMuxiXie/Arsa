/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ig {
    private static final Map<amo, SuggestionProvider<ei>> d = new HashMap<amo, SuggestionProvider<ei>>();
    private static final amo e = amo.b("ask_server");
    public static final SuggestionProvider<ei> a = ig.a(e, (SuggestionProvider<ei>)((SuggestionProvider)($$0, $$1) -> ((ei)$$0.getSource()).a($$0)));
    public static final SuggestionProvider<ei> b = ig.a(amo.b("available_sounds"), (SuggestionProvider<ei>)((SuggestionProvider)($$0, $$1) -> ei.a(((ei)$$0.getSource()).t(), $$1)));
    public static final SuggestionProvider<ei> c = ig.a(amo.b("summonable_entities"), (SuggestionProvider<ei>)((SuggestionProvider)($$0, $$12) -> ei.a(mi.g.s().filter($$1 -> $$1.a(((ei)$$0.getSource()).w()) && $$1.c()), $$12, cgu::a, cgu::h)));

    public static <S extends ei> SuggestionProvider<S> a(amo $$0, SuggestionProvider<ei> $$1) {
        SuggestionProvider<ei> $$2 = d.putIfAbsent($$0, $$1);
        if ($$2 != null) {
            throw new IllegalArgumentException("A command suggestion provider is already registered with the name '" + String.valueOf($$0) + "'");
        }
        return new a($$0, $$1);
    }

    public static <S extends ei> SuggestionProvider<S> a(SuggestionProvider<ei> $$0) {
        return $$0;
    }

    public static <S extends ei> SuggestionProvider<S> a(amo $$0) {
        return ig.a(d.getOrDefault($$0, a));
    }

    public static amo b(SuggestionProvider<?> $$0) {
        amo amo2;
        if ($$0 instanceof a) {
            a $$1 = (a)$$0;
            amo2 = $$1.a;
        } else {
            amo2 = e;
        }
        return amo2;
    }

    static final class a
    extends Record
    implements SuggestionProvider<ei> {
        final amo a;
        private final SuggestionProvider<ei> b;

        a(amo $$0, SuggestionProvider<ei> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public CompletableFuture<Suggestions> getSuggestions(CommandContext<ei> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
            return this.b.getSuggestions($$0, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;delegate", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;delegate", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;delegate", "a", "b"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public SuggestionProvider<ei> b() {
            return this.b;
        }
    }
}

