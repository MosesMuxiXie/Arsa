/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aot {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.difficulty.failure", $$0));

    public static void a(CommandDispatcher<ed> $$02) {
        LiteralArgumentBuilder<ed> $$12 = ee.b("difficulty");
        for (ccz $$2 : ccz.values()) {
            $$12.then(ee.b($$2.e()).executes($$1 -> aot.a((ed)$$1.getSource(), $$2)));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$12.requires(ee.a(ee.d))).executes($$0 -> {
            ccz $$1 = ((ed)$$0.getSource()).f().av();
            ((ed)$$0.getSource()).a(() -> yh.a("commands.difficulty.query", $$1.b()), false);
            return $$1.a();
        }));
    }

    public static int a(ed $$0, ccz $$1) throws CommandSyntaxException {
        MinecraftServer $$2 = $$0.m();
        if ($$2.bb().p() == $$1) {
            throw a.create((Object)$$1.e());
        }
        $$2.a($$1, true);
        $$0.a(() -> yh.a("commands.difficulty.success", $$1.b()), true);
        return 0;
    }
}

