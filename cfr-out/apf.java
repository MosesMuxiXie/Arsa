/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class apf {
    public static void a(CommandDispatcher<ed> $$0, dz $$1) {
        final LiteralArgumentBuilder $$2 = (LiteralArgumentBuilder)ee.b("gamerule").requires(ee.a(ee.d));
        new eua($$1.a()).a(new etz(){

            @Override
            public <T> void a(etv<T> $$0) {
                LiteralArgumentBuilder<ed> $$1 = ee.b($$0.a());
                LiteralArgumentBuilder<ed> $$22 = ee.b($$0.b().toString());
                ((LiteralArgumentBuilder)$$2.then(apf.a($$0, $$1))).then(apf.a($$0, $$22));
            }
        });
        $$0.register($$2);
    }

    static <T> LiteralArgumentBuilder<ed> a(etv<T> $$0, LiteralArgumentBuilder<ed> $$12) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)$$12.executes($$1 -> apf.a((ed)$$1.getSource(), $$0))).then(ee.a("value", $$0.g()).executes($$1 -> apf.a((CommandContext<ed>)$$1, $$0)));
    }

    private static <T> int a(CommandContext<ed> $$0, etv<T> $$1) {
        ed $$2 = (ed)$$0.getSource();
        Object $$3 = $$0.getArgument("value", $$1.d());
        $$2.f().U().a($$1, $$3, ((ed)$$0.getSource()).m());
        $$2.a(() -> yh.a("commands.gamerule.set", new Object[]{$$1.a(), $$1.a($$3)}), true);
        return $$1.b($$3);
    }

    private static <T> int a(ed $$0, etv<T> $$1) {
        Object $$2 = $$0.f().U().a($$1);
        $$0.a(() -> yh.a("commands.gamerule.query", new Object[]{$$1.a(), $$1.a($$2)}), false);
        return $$1.b($$2);
    }
}

