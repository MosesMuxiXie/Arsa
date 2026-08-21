/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class aql {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.schedule.same_tick"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.schedule.cleared.failure", $$0));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.b("commands.schedule.macro", new Object[0]));
    private static final SuggestionProvider<ed> d = ($$0, $$1) -> ei.b(((ed)$$0.getSource()).m().bb().H().r().a(), $$1);

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("schedule").requires(ee.a(ee.d))).then(ee.b("function").then(ee.a("function", go.a()).suggests(apd.b).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("time", fu.a()).executes($$0 -> aql.a((ed)$$0.getSource(), go.b((CommandContext<ed>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), true))).then(ee.b("append").executes($$0 -> aql.a((ed)$$0.getSource(), go.b((CommandContext<ed>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), false)))).then(ee.b("replace").executes($$0 -> aql.a((ed)$$0.getSource(), go.b((CommandContext<ed>)$$0, "function"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"), true))))))).then(ee.b("clear").then(ee.a("function", StringArgumentType.greedyString()).suggests(d).executes($$0 -> aql.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"function"))))));
    }

    private static int a(ed $$0, Pair<amo, Either<ht<ed>, Collection<ht<ed>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
        if ($$2 == 0) {
            throw a.create();
        }
        long $$4 = $$0.f().au() + (long)$$2;
        amo $$5 = (amo)$$1.getFirst();
        fsz<MinecraftServer> $$6 = $$0.m().bb().H().r();
        Optional $$7 = ((Either)$$1.getSecond()).left();
        if ($$7.isPresent()) {
            if ($$7.get() instanceof hw) {
                throw c.create();
            }
            String $$8 = $$5.toString();
            if ($$3) {
                $$6.a($$8);
            }
            $$6.a($$8, $$4, new fsv($$5));
            $$0.a(() -> yh.a("commands.schedule.created.function", yh.a($$5), $$2, $$4), true);
        } else {
            String $$9 = "#" + String.valueOf($$5);
            if ($$3) {
                $$6.a($$9);
            }
            $$6.a($$9, $$4, new fsw($$5));
            $$0.a(() -> yh.a("commands.schedule.created.tag", yh.a($$5), $$2, $$4), true);
        }
        return Math.floorMod($$4, Integer.MAX_VALUE);
    }

    private static int a(ed $$0, String $$1) throws CommandSyntaxException {
        int $$2 = $$0.m().bb().H().r().a($$1);
        if ($$2 == 0) {
            throw b.create((Object)$$1);
        }
        $$0.a(() -> yh.a("commands.schedule.cleared.success", $$2, $$1), true);
        return $$2;
    }
}

