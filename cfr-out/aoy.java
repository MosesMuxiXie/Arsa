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
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class aoy {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.experience.set.points.invalid"));

    public static void a(CommandDispatcher<ed> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("experience").requires(ee.a(ee.d))).then(ee.b("add").then(ee.a("target", eq.d()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("amount", IntegerArgumentType.integer()).executes($$0 -> aoy.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.a))).then(ee.b("points").executes($$0 -> aoy.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.a)))).then(ee.b("levels").executes($$0 -> aoy.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.b))))))).then(ee.b("set").then(ee.a("target", eq.d()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("amount", IntegerArgumentType.integer((int)0)).executes($$0 -> aoy.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.a))).then(ee.b("points").executes($$0 -> aoy.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.a)))).then(ee.b("levels").executes($$0 -> aoy.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount"), aoy$a.b))))))).then(ee.b("query").then(((RequiredArgumentBuilder)ee.a("target", eq.c()).then(ee.b("points").executes($$0 -> aoy.a((ed)$$0.getSource(), eq.e((CommandContext<ed>)$$0, "target"), aoy$a.a)))).then(ee.b("levels").executes($$0 -> aoy.a((ed)$$0.getSource(), eq.e((CommandContext<ed>)$$0, "target"), aoy$a.b))))));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("xp").requires(ee.a(ee.d))).redirect((CommandNode)$$1));
    }

    private static int a(ed $$0, axg $$1, a $$2) {
        int $$3 = $$2.f.applyAsInt($$1);
        $$0.a(() -> yh.a("commands.experience.query." + $$0.e, $$1.R_(), $$3), false);
        return $$3;
    }

    private static int a(ed $$0, Collection<? extends axg> $$1, int $$2, a $$3) {
        for (axg axg2 : $$1) {
            $$3.c.accept(axg2, $$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.experience.add." + $$0.e + ".success.single", $$1, ((axg)$$2.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.experience.add." + $$0.e + ".success.multiple", $$1, $$2.size()), true);
        }
        return $$1.size();
    }

    private static int b(ed $$0, Collection<? extends axg> $$1, int $$2, a $$3) throws CommandSyntaxException {
        int $$4 = 0;
        for (axg axg2 : $$1) {
            if (!$$3.d.test(axg2, $$2)) continue;
            ++$$4;
        }
        if ($$4 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.experience.set." + $$0.e + ".success.single", $$1, ((axg)$$2.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.experience.set." + $$0.e + ".success.multiple", $$1, $$2.size()), true);
        }
        return $$1.size();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("points", ddm::d, ($$0, $$1) -> {
            if ($$1 >= $$0.gU()) {
                return false;
            }
            $$0.a((int)$$1);
            return true;
        }, $$0 -> bgj.b($$0.cu * (float)$$0.gU()));
        public static final /* enum */ a b = new a("levels", axg::c, ($$0, $$1) -> {
            $$0.b((int)$$1);
            return true;
        }, $$0 -> $$0.cs);
        public final BiConsumer<axg, Integer> c;
        public final BiPredicate<axg, Integer> d;
        public final String e;
        final ToIntFunction<axg> f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, BiConsumer<axg, Integer> $$1, BiPredicate<axg, Integer> $$2, ToIntFunction<axg> $$3) {
            this.c = $$1;
            this.e = $$0;
            this.d = $$2;
            this.f = $$3;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            g = aoy$a.a();
        }
    }
}

