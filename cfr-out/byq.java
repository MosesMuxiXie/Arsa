/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public record byq<T>(byg<StringReader> a, byj<StringReader, T> b) implements byp<T>
{
    public byq {
        $$0.a();
    }

    public Optional<T> a(byk<StringReader> $$0) {
        return $$0.b(this.b);
    }

    @Override
    public T a(StringReader $$0) throws CommandSyntaxException {
        Object r2;
        byh.a<StringReader> $$12 = new byh.a<StringReader>();
        byy $$22 = new byy($$12, $$0);
        Optional<T> $$3 = this.a($$22);
        if ($$3.isPresent()) {
            return $$3.get();
        }
        List<byi<StringReader>> $$4 = $$12.a();
        List $$5 = $$4.stream().mapMulti(($$1, $$2) -> {
            Object $$3 = $$1.c();
            if ($$3 instanceof byf) {
                byf $$4 = (byf)$$3;
                $$2.accept($$4.create($$0.getString(), $$1.a()));
            } else {
                Object $$5 = $$1.c();
                if ($$5 instanceof Exception) {
                    Exception $$6 = (Exception)$$5;
                    $$2.accept($$6);
                }
            }
        }).toList();
        for (Exception $$6 : $$5) {
            if (!($$6 instanceof CommandSyntaxException)) continue;
            CommandSyntaxException $$7 = (CommandSyntaxException)((Object)$$6);
            throw $$7;
        }
        if ($$5.size() == 1 && (r2 = $$5.get(0)) instanceof RuntimeException) {
            RuntimeException $$8 = (RuntimeException)r2;
            throw $$8;
        }
        throw new IllegalStateException("Failed to parse: " + $$4.stream().map(byi::toString).collect(Collectors.joining(", ")));
    }

    @Override
    public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
        StringReader $$1 = new StringReader($$0.getInput());
        $$1.setCursor($$0.getStart());
        byh.a<StringReader> $$2 = new byh.a<StringReader>();
        byy $$3 = new byy($$2, $$1);
        this.a($$3);
        List<byi<StringReader>> $$4 = $$2.a();
        if ($$4.isEmpty()) {
            return $$0.buildFuture();
        }
        SuggestionsBuilder $$5 = $$0.createOffset($$2.b());
        for (byi<StringReader> $$6 : $$4) {
            byn<StringReader> byn2 = $$6.b();
            if (byn2 instanceof byx) {
                byx $$7 = (byx)byn2;
                ei.a($$7.a(), $$5);
                continue;
            }
            ei.b($$6.b().possibleValues($$3), $$5);
        }
        return $$5.buildFuture();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{byq.class, "rules;top", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{byq.class, "rules;top", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{byq.class, "rules;top", "a", "b"}, this, $$0);
    }
}

