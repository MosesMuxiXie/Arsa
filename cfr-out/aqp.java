/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class aqp {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.setblock.failed"));

    public static void a(CommandDispatcher<ed> $$02, dz $$12) {
        Predicate<eol> $$2 = $$0 -> $$0.c().A($$0.d());
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("setblock").requires(ee.a(ee.d))).then(ee.a("pos", gc.a()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("block", fz.a($$12)).executes($$0 -> aqp.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fz.a((CommandContext<ed>)$$0, "block"), aqp$a.a, null, false))).then(ee.b("destroy").executes($$0 -> aqp.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fz.a((CommandContext<ed>)$$0, "block"), aqp$a.b, null, false)))).then(ee.b("keep").executes($$1 -> aqp.a((ed)$$1.getSource(), gc.a((CommandContext<ed>)$$1, "pos"), fz.a((CommandContext<ed>)$$1, "block"), aqp$a.a, $$2, false)))).then(ee.b("replace").executes($$0 -> aqp.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fz.a((CommandContext<ed>)$$0, "block"), aqp$a.a, null, false)))).then(ee.b("strict").executes($$0 -> aqp.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fz.a((CommandContext<ed>)$$0, "block"), aqp$a.a, null, true))))));
    }

    private static int a(ed $$0, is $$1, fx $$2, a $$3, @Nullable Predicate<eol> $$4, boolean $$5) throws CommandSyntaxException {
        boolean $$8;
        axf $$6 = $$0.f();
        if ($$6.ar()) {
            throw a.create();
        }
        if ($$4 != null && !$$4.test(new eol($$6, $$1, true))) {
            throw a.create();
        }
        if ($$3 == aqp$a.b) {
            $$6.b($$1, true);
            boolean $$7 = !$$2.a().l() || !$$6.a_($$1).l();
        } else {
            $$8 = true;
        }
        eoh $$9 = $$6.a_($$1);
        if ($$8 && !$$2.a($$6, $$1, 2 | ($$5 ? 816 : 256))) {
            throw a.create();
        }
        if (!$$5) {
            $$6.a($$1, $$9);
        }
        $$0.a(() -> yh.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
        return 1;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = aqp$a.a();
        }
    }
}

