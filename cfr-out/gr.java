/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class gr {
    static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("argument.item.id.invalid", $$0));
    static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.component.unknown", $$0));
    static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("arguments.item.component.malformed", $$0, $$1));
    static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)yh.c("arguments.item.component.expected"));
    static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.component.repeated", $$0));
    private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.malformed", $$0));
    public static final char a = '[';
    public static final char b = ']';
    public static final char c = ',';
    public static final char d = '=';
    public static final char e = '!';
    static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
    final jf.b<dlp> m;
    final ams<vz> n;
    final wa<vz> o;

    public gr(jf.a $$0) {
        this.m = $$0.e(mj.R);
        this.n = $$0.a(vn.a);
        this.o = wa.a(this.n);
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public a a(StringReader $$0) throws CommandSyntaxException {
        final @Nullable MutableObject $$1 = new MutableObject();
        final kg.a $$2 = kg.a();
        this.a($$0, new d(){

            @Override
            public void a(jd<dlp> $$0) {
                $$1.setValue($$0);
            }

            @Override
            public <T> void a(kh<T> $$0, T $$12) {
                $$2.a($$0, $$12);
            }

            @Override
            public <T> void a(kh<T> $$0) {
                $$2.a($$0);
            }
        });
        jd $$3 = Objects.requireNonNull((jd)$$1.get(), "Parser gave no item");
        kg $$4 = $$2.a();
        gr.a($$0, $$3, $$4);
        return new a($$3, $$4);
    }

    private static void a(StringReader $$0, jd<dlp> $$12, kg $$2) throws CommandSyntaxException {
        kj $$3 = kj.a($$12.a().f(), $$2);
        DataResult<bhr> $$4 = dlt.a($$3);
        $$4.getOrThrow($$1 -> k.createWithContext((ImmutableStringReader)$$0, $$1));
    }

    public void a(StringReader $$0, d $$1) throws CommandSyntaxException {
        int $$2 = $$0.getCursor();
        try {
            new b($$0, $$1).a();
        }
        catch (CommandSyntaxException $$3) {
            $$0.setCursor($$2);
            throw $$3;
        }
    }

    public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
        StringReader $$1 = new StringReader($$0.getInput());
        $$1.setCursor($$0.getStart());
        c $$2 = new c();
        b $$3 = new b($$1, $$2);
        try {
            $$3.a();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$2.a($$0, $$1);
    }

    public static interface d {
        default public void a(jd<dlp> $$0) {
        }

        default public <T> void a(kh<T> $$0, T $$1) {
        }

        default public <T> void a(kh<T> $$0) {
        }

        default public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
        }
    }

    public record a(jd<dlp> a, kg b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "item;components", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "item;components", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "item;components", "a", "b"}, this, $$0);
        }
    }

    class b {
        private final StringReader b;
        private final d c;

        b(StringReader $$0, d $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public void a() throws CommandSyntaxException {
            this.c.a(this::d);
            this.b();
            this.c.a(this::a);
            if (this.b.canRead() && this.b.peek() == '[') {
                this.c.a(l);
                this.c();
            }
        }

        private void b() throws CommandSyntaxException {
            int $$0 = this.b.getCursor();
            amo $$1 = amo.a(this.b);
            this.c.a((jd<dlp>)gr.this.m.a(amt.a(mj.R, $$1)).orElseThrow(() -> {
                this.b.setCursor($$0);
                return f.createWithContext((ImmutableStringReader)this.b, (Object)$$1);
            }));
        }

        private void c() throws CommandSyntaxException {
            this.b.expect('[');
            this.c.a(this::e);
            ReferenceArraySet $$0 = new ReferenceArraySet();
            while (this.b.canRead() && this.b.peek() != ']') {
                this.b.skipWhitespace();
                if (this.b.canRead() && this.b.peek() == '!') {
                    this.b.skip();
                    this.c.a(this::f);
                    kh<?> $$1 = gr$b.a(this.b);
                    if (!$$0.add($$1)) {
                        throw j.create($$1);
                    }
                    this.c.a($$1);
                    this.c.a(l);
                    this.b.skipWhitespace();
                } else {
                    kh<?> $$2 = gr$b.a(this.b);
                    if (!$$0.add($$2)) {
                        throw j.create($$2);
                    }
                    this.c.a(this::c);
                    this.b.skipWhitespace();
                    this.b.expect('=');
                    this.c.a(l);
                    this.b.skipWhitespace();
                    this.a(gr.this.o, gr.this.n, $$2);
                    this.b.skipWhitespace();
                }
                this.c.a(this::b);
                if (!this.b.canRead() || this.b.peek() != ',') break;
                this.b.skip();
                this.b.skipWhitespace();
                this.c.a(this::e);
                if (this.b.canRead()) continue;
                throw i.createWithContext((ImmutableStringReader)this.b);
            }
            this.b.expect(']');
            this.c.a(l);
        }

        public static kh<?> a(StringReader $$0) throws CommandSyntaxException {
            if (!$$0.canRead()) {
                throw i.createWithContext((ImmutableStringReader)$$0);
            }
            int $$1 = $$0.getCursor();
            amo $$2 = amo.a($$0);
            kh<?> $$3 = mi.am.a($$2);
            if ($$3 == null || $$3.d()) {
                $$0.setCursor($$1);
                throw g.createWithContext((ImmutableStringReader)$$0, (Object)$$2);
            }
            return $$3;
        }

        private <T, O> void a(wa<O> $$0, ams<O> $$1, kh<T> $$22) throws CommandSyntaxException {
            int $$3 = this.b.getCursor();
            O $$4 = $$0.b(this.b);
            DataResult $$5 = $$22.c().parse($$1, $$4);
            this.c.a($$22, $$5.getOrThrow($$2 -> {
                this.b.setCursor($$3);
                return h.createWithContext((ImmutableStringReader)this.b, (Object)$$22.toString(), $$2);
            }));
        }

        private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
            if ($$0.getRemaining().isEmpty()) {
                $$0.suggest(String.valueOf('['));
            }
            return $$0.buildFuture();
        }

        private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
            if ($$0.getRemaining().isEmpty()) {
                $$0.suggest(String.valueOf(','));
                $$0.suggest(String.valueOf(']'));
            }
            return $$0.buildFuture();
        }

        private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
            if ($$0.getRemaining().isEmpty()) {
                $$0.suggest(String.valueOf('='));
            }
            return $$0.buildFuture();
        }

        private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
            return ei.a(gr.this.m.c_().map(amt::a), $$0);
        }

        private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
            $$0.suggest(String.valueOf('!'));
            return this.a($$0, String.valueOf('='));
        }

        private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
            return this.a($$0, "");
        }

        private CompletableFuture<Suggestions> a(SuggestionsBuilder $$02, String $$1) {
            String $$22 = $$02.getRemaining().toLowerCase(Locale.ROOT);
            ei.a(mi.am.k(), $$22, $$0 -> ((amt)$$0.getKey()).a(), $$2 -> {
                kh $$3 = (kh)$$2.getValue();
                if ($$3.b() != null) {
                    amo $$4 = ((amt)$$2.getKey()).a();
                    $$02.suggest(String.valueOf($$4) + $$1);
                }
            });
            return $$02.buildFuture();
        }
    }

    static class c
    implements d {
        private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = l;

        c() {
        }

        @Override
        public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
            this.a = $$0;
        }

        public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
            return this.a.apply($$0.createOffset($$1.getCursor()));
        }
    }
}

