/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class arc {
    private static final zf a = zf.a.a(new yo.e(yh.c("chat.type.team.hover"))).a(new yf.i("/teammsg "));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.teammsg.failed.noteam"));

    public static void a(CommandDispatcher<ed> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)ee.b("teammsg").then(ee.a("message", ew.a()).executes($$0 -> {
            ed $$1 = (ed)$$0.getSource();
            cgk $$22 = $$1.h();
            fum $$3 = $$22.cI();
            if ($$3 == null) {
                throw b.create();
            }
            List<axg> $$42 = $$1.m().aj().t().stream().filter($$2 -> $$2 == $$22 || $$2.cI() == $$3).toList();
            if (!$$42.isEmpty()) {
                ew.a((CommandContext<ed>)$$0, "message", (yy $$4) -> arc.a($$1, $$22, $$3, $$42, $$4));
            }
            return $$42.size();
        })));
        $$02.register((LiteralArgumentBuilder)ee.b("tm").redirect((CommandNode)$$1));
    }

    private static void a(ed $$0, cgk $$1, fum $$2, List<axg> $$3, yy $$4) {
        yw $$5 = $$2.e().c(a);
        yd.a $$6 = yd.a(yd.i, $$0).c($$5);
        yd.a $$7 = yd.a(yd.j, $$0).c($$5);
        yx $$8 = yx.a($$4);
        boolean $$9 = false;
        for (axg $$10 : $$3) {
            yd.a $$11 = $$10 == $$1 ? $$7 : $$6;
            boolean $$12 = $$0.a($$10);
            $$10.a($$8, $$12, $$11);
            $$9 |= $$12 && $$4.j();
        }
        if ($$9) {
            $$0.a(bbz.e);
        }
    }
}

