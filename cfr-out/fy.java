/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class fy
implements ArgumentType<b> {
    private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
    private final jf<dzq> b;

    public fy(dz $$0) {
        this.b = $$0.e(mj.i);
    }

    public static fy a(dz $$0) {
        return new fy($$0);
    }

    public b a(StringReader $$0) throws CommandSyntaxException {
        return fy.a(this.b, $$0);
    }

    public static b a(jf<dzq> $$02, StringReader $$1) throws CommandSyntaxException {
        return (b)ga.b($$02, $$1, true).map($$0 -> new a($$0.a(), $$0.b().keySet(), $$0.c()), $$0 -> new c($$0.a(), $$0.b(), $$0.c()));
    }

    public static Predicate<eol> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return (Predicate)$$0.getArgument($$1, b.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ga.a(this.b, $$1, true, true);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface b
    extends Predicate<eol> {
        public boolean a();
    }

    static class c
    implements b {
        private final jh<dzq> a;
        private final @Nullable uz b;
        private final Map<String, String> c;

        c(jh<dzq> $$0, Map<String, String> $$1, @Nullable uz $$2) {
            this.a = $$0;
            this.c = $$1;
            this.b = $$2;
        }

        public boolean a(eol $$0) {
            eoh $$1 = $$0.a();
            if (!$$1.a(this.a)) {
                return false;
            }
            for (Map.Entry<String, String> $$2 : this.c.entrySet()) {
                epk<?> $$3 = $$1.b().l().a($$2.getKey());
                if ($$3 == null) {
                    return false;
                }
                Comparable $$4 = $$3.b($$2.getValue()).orElse(null);
                if ($$4 == null) {
                    return false;
                }
                if ($$1.c($$3) == $$4) continue;
                return false;
            }
            if (this.b != null) {
                elb $$5 = $$0.b();
                return $$5 != null && vo.a((vz)this.b, $$5.b($$0.c().J_()), true);
            }
            return true;
        }

        @Override
        public boolean a() {
            return this.b != null;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((eol)object);
        }
    }

    static class a
    implements b {
        private final eoh a;
        private final Set<epk<?>> b;
        private final @Nullable uz c;

        public a(eoh $$0, Set<epk<?>> $$1, @Nullable uz $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a(eol $$0) {
            eoh $$1 = $$0.a();
            if (!$$1.a(this.a.b())) {
                return false;
            }
            for (epk<?> $$2 : this.b) {
                if ($$1.c($$2) == this.a.c($$2)) continue;
                return false;
            }
            if (this.c != null) {
                elb $$3 = $$0.b();
                return $$3 != null && vo.a((vz)this.c, $$3.b($$0.c().J_()), true);
            }
            return true;
        }

        @Override
        public boolean a() {
            return this.c != null;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((eol)object);
        }
    }
}

