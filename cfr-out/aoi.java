/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class aoi {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("clear.failed.single", $$0));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("clear.failed.multiple", $$0));

    public static void a(CommandDispatcher<ed> $$03, dz $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("clear").requires(ee.a(ee.d))).executes($$02 -> aoi.a((ed)$$02.getSource(), Collections.singleton(((ed)$$02.getSource()).i()), $$0 -> true))).then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).executes($$02 -> aoi.a((ed)$$02.getSource(), eq.f((CommandContext<ed>)$$02, "targets"), $$0 -> true))).then(((RequiredArgumentBuilder)ee.a("item", gs.a($$1)).executes($$0 -> aoi.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), gs.a((CommandContext<ed>)$$0, "item")))).then(ee.a("maxCount", IntegerArgumentType.integer((int)0)).executes($$0 -> aoi.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), gs.a((CommandContext<ed>)$$0, "item"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"maxCount")))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, Predicate<dlt> $$2) throws CommandSyntaxException {
        return aoi.a($$0, $$1, $$2, -1);
    }

    private static int a(ed $$0, Collection<axg> $$1, Predicate<dlt> $$2, int $$3) throws CommandSyntaxException {
        int $$4 = 0;
        for (axg $$5 : $$1) {
            $$4 += $$5.gK().a($$2, $$3, $$5.cm.r());
            $$5.cn.d();
            $$5.cm.a($$5.gK());
        }
        if ($$4 == 0) {
            if ($$1.size() == 1) {
                throw a.create((Object)$$1.iterator().next().ap());
            }
            throw b.create((Object)$$1.size());
        }
        int $$6 = $$4;
        if ($$3 == 0) {
            if ($$1.size() == 1) {
                $$0.a(() -> yh.a("commands.clear.test.single", $$6, ((axg)$$1.iterator().next()).R_()), true);
            } else {
                $$0.a(() -> yh.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
        } else if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.clear.success.single", $$6, ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.clear.success.multiple", $$6, $$1.size()), true);
        }
        return $$4;
    }
}

