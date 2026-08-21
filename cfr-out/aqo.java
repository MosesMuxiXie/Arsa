/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aqo {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("serverpack").requires(ee.a(ee.d))).then(ee.b("push").then(((RequiredArgumentBuilder)ee.a("url", StringArgumentType.string()).then(((RequiredArgumentBuilder)ee.a("uuid", fv.a()).then(ee.a("hash", StringArgumentType.word()).executes($$0 -> aqo.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"url"), Optional.of(fv.a((CommandContext<ed>)$$0, "uuid")), Optional.of(StringArgumentType.getString((CommandContext)$$0, (String)"hash")))))).executes($$0 -> aqo.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"url"), Optional.of(fv.a((CommandContext<ed>)$$0, "uuid")), Optional.empty())))).executes($$0 -> aqo.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"url"), Optional.empty(), Optional.empty()))))).then(ee.b("pop").then(ee.a("uuid", fv.a()).executes($$0 -> aqo.a((ed)$$0.getSource(), fv.a((CommandContext<ed>)$$0, "uuid"))))));
    }

    private static void a(ed $$0, aay<?> $$12) {
        $$0.m().ak().e().forEach($$1 -> $$1.a($$12));
    }

    private static int a(ed $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
        UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
        String $$5 = $$3.orElse("");
        abo $$6 = new abo($$4, $$1, $$5, false, null);
        aqo.a($$0, $$6);
        return 0;
    }

    private static int a(ed $$0, UUID $$1) {
        abn $$2 = new abn(Optional.of($$1));
        aqo.a($$0, $$2);
        return 0;
    }
}

