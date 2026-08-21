/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.tree.CommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.tree.CommandNode;
import java.util.List;

public class aqe {
    public static <T extends ef<T>> void a(CommandDispatcher<T> $$0) {
        $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal((String)"return").requires(ee.a(ee.d))).then(RequiredArgumentBuilder.argument((String)"value", (ArgumentType)IntegerArgumentType.integer()).executes(new c()))).then(LiteralArgumentBuilder.literal((String)"fail").executes(new a()))).then(LiteralArgumentBuilder.literal((String)"run").forward((CommandNode)$$0.getRoot(), new b(), false)));
    }

    static class c<T extends ef<T>>
    implements hd.a<T> {
        c() {
        }

        @Override
        public void a(T $$0, ContextChain<T> $$1, hb $$2, hh<T> $$3) {
            int $$4 = IntegerArgumentType.getInteger((CommandContext)$$1.getTopContext(), (String)"value");
            $$0.q().onSuccess($$4);
            hi $$5 = $$3.b();
            $$5.a($$4);
            $$5.b();
        }
    }

    static class a<T extends ef<T>>
    implements hd.a<T> {
        a() {
        }

        @Override
        public void a(T $$0, ContextChain<T> $$1, hb $$2, hh<T> $$3) {
            $$0.q().onFailure();
            hi $$4 = $$3.b();
            $$4.a();
            $$4.b();
        }
    }

    static class b<T extends ef<T>>
    implements he.a<T> {
        b() {
        }

        @Override
        public void a(T $$0, List<T> $$1, ContextChain<T> $$2, hb $$3, hh<T> $$4) {
            if ($$1.isEmpty()) {
                if ($$3.c()) {
                    $$4.a(hq.a());
                }
                return;
            }
            $$4.b().b();
            ContextChain $$5 = $$2.nextStage();
            String $$6 = $$5.getTopContext().getInput();
            $$4.a(new hm.a<T>($$6, $$5, $$3.d(), $$0, $$1));
        }
    }
}

