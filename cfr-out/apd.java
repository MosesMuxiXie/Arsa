/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class apd {
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.function.error.argument_not_compound", $$0));
    static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.function.scheduled.no_functions", $$0));
    @VisibleForTesting
    public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.function.instantiationFailure", $$0, $$1));
    public static final SuggestionProvider<ed> b = ($$0, $$1) -> {
        ani $$2 = ((ed)$$0.getSource()).m().aC();
        ei.a($$2.e(), $$1, "#");
        return ei.a($$2.d(), $$1);
    };
    static final b<ed> e = new b<ed>(){

        @Override
        public void a(ed $$0, amo $$1, int $$2) {
            $$0.a(() -> yh.a("commands.function.result", yh.a($$1), $$2), true);
        }
    };

    public static void a(CommandDispatcher<ed> $$0) {
        LiteralArgumentBuilder<ed> $$12 = ee.b("with");
        for (final ars.c $$2 : ars.c) {
            $$2.a((ArgumentBuilder<ed, ?>)$$12, $$1 -> $$1.executes((Command)new c(){

                @Override
                protected uz a(CommandContext<ed> $$0) throws CommandSyntaxException {
                    return $$2.a($$0).a();
                }
            }).then(ee.a("path", ex.a()).executes((Command)new c(){

                @Override
                protected uz a(CommandContext<ed> $$0) throws CommandSyntaxException {
                    return apd.a(ex.a($$0, "path"), $$2.a($$0));
                }
            })));
        }
        $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("function").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("name", go.a()).suggests(b).executes((Command)new c(){

            @Override
            protected @Nullable uz a(CommandContext<ed> $$0) {
                return null;
            }
        })).then(ee.a("arguments", en.a()).executes((Command)new c(){

            @Override
            protected uz a(CommandContext<ed> $$0) {
                return en.a($$0, "arguments");
            }
        }))).then($$12)));
    }

    static uz a(ex.g $$0, arr $$1) throws CommandSyntaxException {
        vz $$2 = ars.a($$0, $$1);
        if ($$2 instanceof uz) {
            uz $$3 = (uz)$$2;
            return $$3;
        }
        throw c.create((Object)$$2.c().a());
    }

    public static ed a(ed $$0) {
        return $$0.a().b(bbh.c);
    }

    public static <T extends ef<T>> void a(Collection<ht<T>> $$0, @Nullable uz $$1, T $$2, T $$3, hh<T> $$4, b<T> $$5, hb $$6) throws CommandSyntaxException {
        if ($$6.c()) {
            apd.a($$0, $$1, $$2, $$3, $$4, $$5);
        } else {
            apd.b($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    private static <T extends ef<T>> void a(@Nullable uz $$0, hh<T> $$1, CommandDispatcher<T> $$2, T $$3, ht<T> $$4, amo $$5, ea $$6, boolean $$7) throws CommandSyntaxException {
        try {
            hv<T> $$8 = $$4.a($$0, $$2);
            $$1.a(new hn<T>($$8, $$6, $$7).bind($$3));
        }
        catch (eg $$9) {
            throw a.create((Object)$$5, (Object)$$9.a());
        }
    }

    private static <T extends ef<T>> ea a(T $$0, b<T> $$1, amo $$2, ea $$3) {
        if ($$0.y()) {
            return $$3;
        }
        return ($$4, $$5) -> {
            $$1.a($$0, $$2, $$5);
            $$3.onResult($$4, $$5);
        };
    }

    private static <T extends ef<T>> void a(Collection<ht<T>> $$0, @Nullable uz $$1, T $$2, T $$3, hh<T> $$4, b<T> $$5) throws CommandSyntaxException {
        CommandDispatcher<T> $$6 = $$2.x();
        T $$7 = $$3.a_();
        ea $$8 = ea.chain($$2.q(), $$4.b().d());
        for (ht<T> $$9 : $$0) {
            amo $$10 = $$9.a();
            ea $$11 = apd.a($$2, $$5, $$10, $$8);
            apd.a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
        }
        $$4.a(hq.a());
    }

    private static <T extends ef<T>> void b(Collection<ht<T>> $$0, @Nullable uz $$12, T $$22, T $$32, hh<T> $$4, b<T> $$5) throws CommandSyntaxException {
        CommandDispatcher<T> $$6 = $$22.x();
        T $$7 = $$32.a_();
        ea $$8 = $$22.q();
        if ($$0.isEmpty()) {
            return;
        }
        if ($$0.size() == 1) {
            ht<T> $$9 = $$0.iterator().next();
            amo $$10 = $$9.a();
            ea $$11 = apd.a($$22, $$5, $$10, $$8);
            apd.a($$12, $$4, $$6, $$7, $$9, $$10, $$11, false);
        } else if ($$8 == ea.a) {
            for (ht<T> $$122 : $$0) {
                amo $$13 = $$122.a();
                ea $$14 = apd.a($$22, $$5, $$13, $$8);
                apd.a($$12, $$4, $$6, $$7, $$122, $$13, $$14, false);
            }
        } else {
            class A {
                boolean a;
                int b;

                A() {
                }

                public void a(int $$0) {
                    this.a = true;
                    this.b += $$0;
                }
            }
            A $$15 = new A();
            ea $$16 = ($$1, $$2) -> $$15.a($$2);
            for (ht<T> $$17 : $$0) {
                amo $$18 = $$17.a();
                ea $$19 = apd.a($$22, $$5, $$18, $$16);
                apd.a($$12, $$4, $$6, $$7, $$17, $$18, $$19, false);
            }
            $$4.a(($$2, $$3) -> {
                if ($$0.a) {
                    $$8.onSuccess($$0.b);
                }
            });
        }
    }

    public static interface b<T> {
        public void a(T var1, amo var2, int var3);
    }

    static abstract class c
    extends hd.b<ed>
    implements hd.a<ed> {
        c() {
        }

        protected abstract @Nullable uz a(CommandContext<ed> var1) throws CommandSyntaxException;

        @Override
        public void a(ed $$0, ContextChain<ed> $$1, hb $$2, hh<ed> $$3) throws CommandSyntaxException {
            CommandContext $$4 = $$1.getTopContext().copyFor((Object)$$0);
            Pair<amo, Collection<ht<ed>>> $$5 = go.c((CommandContext<ed>)$$4, "name");
            Collection $$6 = (Collection)$$5.getSecond();
            if ($$6.isEmpty()) {
                throw d.create((Object)yh.a((amo)$$5.getFirst()));
            }
            uz $$7 = this.a((CommandContext<ed>)$$4);
            ed $$8 = apd.a($$0);
            if ($$6.size() == 1) {
                $$0.a(() -> yh.a("commands.function.scheduled.single", yh.a(((ht)$$6.iterator().next()).a())), true);
            } else {
                $$0.a(() -> yh.a("commands.function.scheduled.multiple", yk.b($$6.stream().map(ht::a).toList(), yh::a)), true);
            }
            apd.a($$6, $$7, $$0, $$8, $$3, e, $$2);
        }

        @Override
        public /* synthetic */ void b(ef ef2, ContextChain contextChain, hb hb2, hh hh2) throws CommandSyntaxException {
            this.a((ed)ef2, (ContextChain<ed>)contextChain, hb2, (hh<ed>)hh2);
        }
    }
}

