/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 */
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class aph {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.help.failed"));

    public static void a(CommandDispatcher<ed> $$0) {
        $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("help").executes($$1 -> {
            Map $$2 = $$0.getSmartUsage((CommandNode)$$0.getRoot(), (Object)((ed)$$1.getSource()));
            for (String $$3 : $$2.values()) {
                ((ed)$$1.getSource()).a(() -> yh.b("/" + $$3), false);
            }
            return $$2.size();
        })).then(ee.a("command", StringArgumentType.greedyString()).executes($$1 -> {
            ParseResults $$2 = $$0.parse(StringArgumentType.getString((CommandContext)$$1, (String)"command"), (Object)((ed)$$1.getSource()));
            if ($$2.getContext().getNodes().isEmpty()) {
                throw a.create();
            }
            Map $$3 = $$0.getSmartUsage(((ParsedCommandNode)Iterables.getLast((Iterable)$$2.getContext().getNodes())).getNode(), (Object)((ed)$$1.getSource()));
            for (String $$4 : $$3.values()) {
                ((ed)$$1.getSource()).a(() -> yh.b("/" + $$2.getReader().getString() + " " + $$4), false);
            }
            return $$3.size();
        })));
    }
}

