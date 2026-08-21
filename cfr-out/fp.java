/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonPrimitive
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class fp<T extends Enum<T>>
implements ArgumentType<T> {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.enum.invalid", $$0));
    private final Codec<T> b;
    private final Supplier<T[]> c;

    protected fp(Codec<T> $$0, Supplier<T[]> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public T a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        return (T)((Enum)this.b.parse((DynamicOps)JsonOps.INSTANCE, (Object)new JsonPrimitive($$1)).result().orElseThrow(() -> a.createWithContext((ImmutableStringReader)$$0, (Object)$$1)));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$02, SuggestionsBuilder $$1) {
        return ei.b(Arrays.stream((Enum[])this.c.get()).map($$0 -> ((bhh)$$0).c()).map(this::a).collect(Collectors.toList()), $$1);
    }

    public Collection<String> getExamples() {
        return Arrays.stream((Enum[])this.c.get()).map($$0 -> ((bhh)$$0).c()).map(this::a).limit(2L).collect(Collectors.toList());
    }

    protected String a(String $$0) {
        return $$0;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

