/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class aoz {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("fetchprofile").requires(ee.a(ee.d))).then(ee.b("name").then(ee.a("name", StringArgumentType.greedyString()).executes($$0 -> aoz.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"name")))))).then(ee.b("id").then(ee.a("id", fv.a()).executes($$0 -> aoz.a((ed)$$0.getSource(), fv.a((CommandContext<ed>)$$0, "id"))))));
    }

    private static void a(ed $$0, GameProfile $$12, String $$2, yh $$3) {
        doy $$42 = doy.a($$12);
        doy.a.encodeStart((DynamicOps)vn.a, (Object)$$42).ifSuccess($$4 -> {
            String $$52 = $$4.toString();
            yw $$6 = yh.a(new aab($$42, true));
            yj.a.encodeStart((DynamicOps)vn.a, (Object)$$6).ifSuccess($$5 -> {
                String $$6 = $$5.toString();
                $$0.a(() -> {
                    Object $$5 = yk.a(List.of(yh.c("commands.fetchprofile.copy_component").a($$1 -> $$1.a(new yf.c($$52))), yh.c("commands.fetchprofile.give_item").a($$1 -> $$1.a(new yf.g("give @s minecraft:player_head[profile=" + $$52 + "]"))), yh.c("commands.fetchprofile.summon_mannequin").a($$1 -> $$1.a(new yf.g("summon minecraft:mannequin ~ ~ ~ {profile:" + $$52 + "}"))), yh.a("commands.fetchprofile.copy_text", $$6.a(l.p)).a($$1 -> $$1.a(new yf.c($$6)))), yg.x, (T $$0) -> yk.a($$0.a(l.k)));
                    return yh.a($$2, $$3, $$5);
                }, false);
            }).ifError($$1 -> $$0.b(yh.a("commands.fetchprofile.failed_to_serialize", new Object[]{$$1.message()})));
        }).ifError($$1 -> $$0.b(yh.a("commands.fetchprofile.failed_to_serialize", new Object[]{$$1.message()})));
    }

    private static int a(ed $$0, String $$1) {
        MinecraftServer $$2 = $$0.m();
        bca $$3 = $$2.ar().g();
        bhs.j().execute(() -> {
            yw $$4 = yh.b($$1);
            Optional<GameProfile> $$5 = $$3.a($$1);
            $$2.execute(() -> $$5.ifPresentOrElse($$2 -> aoz.a($$0, $$2, "commands.fetchprofile.name.success", $$4), () -> $$0.b(yh.a("commands.fetchprofile.name.failure", $$4))));
        });
        return 1;
    }

    private static int a(ed $$0, UUID $$1) {
        MinecraftServer $$2 = $$0.m();
        bca $$3 = $$2.ar().g();
        bhs.j().execute(() -> {
            yh $$4 = yh.a($$1);
            Optional<GameProfile> $$5 = $$3.a($$1);
            $$2.execute(() -> $$5.ifPresentOrElse($$2 -> aoz.a($$0, $$2, "commands.fetchprofile.id.success", $$4), () -> $$0.b(yh.a("commands.fetchprofile.id.failure", $$4))));
        });
        return 1;
    }
}

