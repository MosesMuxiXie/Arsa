/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;

public class ara {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.tag.add.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.tag.remove.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("tag").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targets", eq.b()).then(ee.b("add").then(ee.a("name", StringArgumentType.word()).executes($$0 -> ara.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), StringArgumentType.getString((CommandContext)$$0, (String)"name")))))).then(ee.b("remove").then(ee.a("name", StringArgumentType.word()).suggests(($$0, $$1) -> ei.b(ara.a(eq.b((CommandContext<ed>)$$0, "targets")), $$1)).executes($$0 -> ara.b((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), StringArgumentType.getString((CommandContext)$$0, (String)"name")))))).then(ee.b("list").executes($$0 -> ara.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"))))));
    }

    private static Collection<String> a(Collection<? extends cgk> $$0) {
        HashSet $$1 = Sets.newHashSet();
        for (cgk cgk2 : $$0) {
            $$1.addAll(cgk2.aB());
        }
        return $$1;
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, String $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (cgk cgk2 : $$1) {
            if (!cgk2.a($$2)) continue;
            ++$$3;
        }
        if ($$3 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.tag.add.success.single", new Object[]{$$2, ((cgk)$$1.iterator().next()).R_()}), true);
        } else {
            $$0.a(() -> yh.a("commands.tag.add.success.multiple", new Object[]{$$2, $$1.size()}), true);
        }
        return $$3;
    }

    private static int b(ed $$0, Collection<? extends cgk> $$1, String $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (cgk cgk2 : $$1) {
            if (!cgk2.b($$2)) continue;
            ++$$3;
        }
        if ($$3 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.tag.remove.success.single", new Object[]{$$2, ((cgk)$$1.iterator().next()).R_()}), true);
        } else {
            $$0.a(() -> yh.a("commands.tag.remove.success.multiple", new Object[]{$$2, $$1.size()}), true);
        }
        return $$3;
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1) {
        HashSet $$2 = Sets.newHashSet();
        for (cgk cgk2 : $$1) {
            $$2.addAll(cgk2.aB());
        }
        if ($$1.size() == 1) {
            cgk $$4 = $$1.iterator().next();
            if ($$2.isEmpty()) {
                $$0.a(() -> yh.a("commands.tag.list.single.empty", $$4.R_()), false);
            } else {
                $$0.a(() -> yh.a("commands.tag.list.single.success", $$4.R_(), $$2.size(), yk.a($$2)), false);
            }
        } else if ($$2.isEmpty()) {
            $$0.a(() -> yh.a("commands.tag.list.multiple.empty", $$1.size()), false);
        } else {
            $$0.a(() -> yh.a("commands.tag.list.multiple.success", $$2.size(), $$2.size(), yk.a($$2)), false);
        }
        return $$2.size();
    }
}

