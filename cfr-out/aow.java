/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aow {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.enchant.failed.entity", $$0));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.enchant.failed.itemless", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.enchant.failed.incompatible", $$0));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.enchant.failed.level", $$0, $$1));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.enchant.failed"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("enchant").requires(ee.a(ee.d))).then(ee.a("targets", eq.b()).then(((RequiredArgumentBuilder)ee.a("enchantment", fe.a($$1, mj.bf)).executes($$0 -> aow.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.g((CommandContext<ed>)$$0, "enchantment"), 1))).then(ee.a("level", IntegerArgumentType.integer((int)0)).executes($$0 -> aow.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.g((CommandContext<ed>)$$0, "enchantment"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"level")))))));
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, jd<dso> $$2, int $$3) throws CommandSyntaxException {
        dso $$4 = $$2.a();
        if ($$3 > $$4.e()) {
            throw d.create((Object)$$3, (Object)$$4.e());
        }
        int $$5 = 0;
        for (cgk cgk2 : $$1) {
            if (cgk2 instanceof chl) {
                chl $$7 = (chl)cgk2;
                dlt $$8 = $$7.fx();
                if (!$$8.f()) {
                    if ($$4.c($$8) && dsq.a(dsq.b($$8).a(), $$2)) {
                        $$8.a($$2, $$3);
                        ++$$5;
                        continue;
                    }
                    if ($$1.size() != 1) continue;
                    throw c.create((Object)$$8.y().getString());
                }
                if ($$1.size() != 1) continue;
                throw b.create((Object)$$7.ap().getString());
            }
            if ($$1.size() != 1) continue;
            throw a.create((Object)cgk2.ap().getString());
        }
        if ($$5 == 0) {
            throw e.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.enchant.success.single", dso.a($$1, $$3), ((cgk)$$3.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.enchant.success.multiple", dso.a($$1, $$3), $$3.size()), true);
        }
        return $$5;
    }
}

