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
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aqf {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.ride.not_riding", $$0));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.ride.already_riding", $$0, $$1));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.ride.mount.failure.generic", $$0, $$1));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.ride.mount.failure.cant_ride_players"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.ride.mount.failure.loop"));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)yh.c("commands.ride.mount.failure.wrong_dimension"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("ride").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)ee.a("target", eq.a()).then(ee.b("mount").then(ee.a("vehicle", eq.a()).executes($$0 -> aqf.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), eq.a((CommandContext<ed>)$$0, "vehicle")))))).then(ee.b("dismount").executes($$0 -> aqf.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"))))));
    }

    private static int a(ed $$0, cgk $$12, cgk $$2) throws CommandSyntaxException {
        cgk $$3 = $$12.dz();
        if ($$3 != null) {
            throw b.create((Object)$$12.R_(), (Object)$$3.R_());
        }
        if ($$2.ay() == cgu.cb) {
            throw d.create();
        }
        if ($$12.dp().anyMatch($$1 -> $$1 == $$2)) {
            throw e.create();
        }
        if ($$12.ao() != $$2.ao()) {
            throw f.create();
        }
        if (!$$12.a($$2, true, true)) {
            throw c.create((Object)$$12.R_(), (Object)$$2.R_());
        }
        $$0.a(() -> yh.a("commands.ride.mount.success", $$12.R_(), $$2.R_()), true);
        return 1;
    }

    private static int a(ed $$0, cgk $$1) throws CommandSyntaxException {
        cgk $$2 = $$1.dz();
        if ($$2 == null) {
            throw a.create((Object)$$1.R_());
        }
        $$1.cf();
        $$0.a(() -> yh.a("commands.ride.dismount.success", $$1.R_(), $$2.R_()), true);
        return 1;
    }
}

