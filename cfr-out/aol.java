/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aol {
    private static final Logger a = LogUtils.getLogger();
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.unknown", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.enable.failed", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.disable.failed", $$0));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.disable.failed.feature", $$0));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.datapack.enable.failed.no_flags", $$0, $$1));
    private static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.create.invalid_name", $$0));
    private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.create.invalid_full_name", $$0));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.create.already_exists", $$0));
    private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.datapack.create.metadata_encode_failure", $$0, $$1));
    private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> yh.b("commands.datapack.create.io_failure", $$0));
    private static final SuggestionProvider<ed> l = ($$0, $$1) -> ei.b(((ed)$$0.getSource()).m().aE().e().stream().map(StringArgumentType::escapeIfRequired), $$1);
    private static final SuggestionProvider<ed> m = ($$0, $$12) -> {
        bak $$2 = ((ed)$$0.getSource()).m().aE();
        Collection<String> $$3 = $$2.e();
        dgz $$4 = ((ed)$$0.getSource()).w();
        return ei.b($$2.d().stream().filter($$1 -> $$1.e().a($$4)).map(bah::g).filter($$1 -> !$$3.contains($$1)).map(StringArgumentType::escapeIfRequired), $$12);
    };

    public static void a(CommandDispatcher<ed> $$03, dz $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("datapack").requires(ee.a(ee.d))).then(ee.b("enable").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("name", StringArgumentType.string()).suggests(m).executes($$02 -> aol.a((ed)$$02.getSource(), aol.a((CommandContext<ed>)$$02, "name", true), (List<bah> $$0, bah $$1) -> $$1.k().a($$0, $$1, bah::h, false)))).then(ee.b("after").then(ee.a("existing", StringArgumentType.string()).suggests(l).executes($$0 -> aol.a((ed)$$0.getSource(), aol.a((CommandContext<ed>)$$0, "name", true), (List<bah> $$1, bah $$2) -> $$1.add($$1.indexOf(aol.a((CommandContext<ed>)$$0, "existing", false)) + 1, $$2)))))).then(ee.b("before").then(ee.a("existing", StringArgumentType.string()).suggests(l).executes($$0 -> aol.a((ed)$$0.getSource(), aol.a((CommandContext<ed>)$$0, "name", true), (List<bah> $$1, bah $$2) -> $$1.add($$1.indexOf(aol.a((CommandContext<ed>)$$0, "existing", false)), $$2)))))).then(ee.b("last").executes($$0 -> aol.a((ed)$$0.getSource(), aol.a((CommandContext<ed>)$$0, "name", true), List::add)))).then(ee.b("first").executes($$02 -> aol.a((ed)$$02.getSource(), aol.a((CommandContext<ed>)$$02, "name", true), (List<bah> $$0, bah $$1) -> $$0.add(0, $$1))))))).then(ee.b("disable").then(ee.a("name", StringArgumentType.string()).suggests(l).executes($$0 -> aol.a((ed)$$0.getSource(), aol.a((CommandContext<ed>)$$0, "name", false)))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("list").executes($$0 -> aol.a((ed)$$0.getSource()))).then(ee.b("available").executes($$0 -> aol.b((ed)$$0.getSource())))).then(ee.b("enabled").executes($$0 -> aol.c((ed)$$0.getSource()))))).then(((LiteralArgumentBuilder)ee.b("create").requires(ee.a(ee.f))).then(ee.a("id", StringArgumentType.string()).then(ee.a("description", em.a($$1)).executes($$0 -> aol.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"id"), em.b((CommandContext<ed>)$$0, "description")))))));
    }

    private static int a(ed $$0, String $$1, yh $$2) throws CommandSyntaxException {
        Path $$3 = $$0.m().a(fng.j);
        if (!bfp.f($$1)) {
            throw g.create((Object)$$1);
        }
        if (!bfp.b($$1)) {
            throw h.create((Object)$$1);
        }
        Path $$4 = $$3.resolve($$1);
        if (Files.exists($$4, new LinkOption[0])) {
            throw i.create((Object)$$1);
        }
        baa $$5 = new baa($$2, w.b().a(azn.b).a());
        DataResult $$6 = baa.b.b().encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$5);
        Optional $$7 = $$6.error();
        if ($$7.isPresent()) {
            throw j.create((Object)$$1, (Object)((DataResult.Error)$$7.get()).message());
        }
        JsonObject $$8 = new JsonObject();
        $$8.add(baa.b.a(), (JsonElement)$$6.getOrThrow());
        try {
            Files.createDirectory($$4, new FileAttribute[0]);
            Files.createDirectory($$4.resolve(azn.b.a()), new FileAttribute[0]);
            try (BufferedWriter $$9 = Files.newBufferedWriter($$4.resolve("pack.mcmeta"), StandardCharsets.UTF_8, new OpenOption[0]);
                 JsonWriter $$10 = new JsonWriter((Writer)$$9);){
                $$10.setSerializeNulls(false);
                $$10.setIndent("  ");
                bfv.a($$10, (JsonElement)$$8, null);
            }
        }
        catch (IOException $$11) {
            a.warn("Failed to create pack at {}", (Object)$$3.toAbsolutePath(), (Object)$$11);
            throw k.create((Object)$$1);
        }
        $$0.a(() -> yh.a("commands.datapack.create.success", new Object[]{$$1}), true);
        return 1;
    }

    private static int a(ed $$0, bah $$1, a $$2) throws CommandSyntaxException {
        bak $$3 = $$0.m().aE();
        ArrayList $$4 = Lists.newArrayList($$3.g());
        $$2.apply($$4, $$1);
        $$0.a(() -> yh.a("commands.datapack.modify.enable", $$1.a(true)), true);
        aqd.a($$4.stream().map(bah::g).collect(Collectors.toList()), $$0);
        return $$4.size();
    }

    private static int a(ed $$0, bah $$1) {
        bak $$2 = $$0.m().aE();
        ArrayList $$3 = Lists.newArrayList($$2.g());
        $$3.remove($$1);
        $$0.a(() -> yh.a("commands.datapack.modify.disable", $$1.a(true)), true);
        aqd.a($$3.stream().map(bah::g).collect(Collectors.toList()), $$0);
        return $$3.size();
    }

    private static int a(ed $$0) {
        return aol.c($$0) + aol.b($$0);
    }

    private static int b(ed $$0) {
        bak $$1 = $$0.m().aE();
        $$1.a();
        Collection<bah> $$22 = $$1.g();
        Collection<bah> $$3 = $$1.d();
        dgz $$4 = $$0.w();
        List<bah> $$5 = $$3.stream().filter($$2 -> !$$22.contains($$2) && $$2.e().a($$4)).toList();
        if ($$5.isEmpty()) {
            $$0.a(() -> yh.c("commands.datapack.list.available.none"), false);
        } else {
            $$0.a(() -> yh.a("commands.datapack.list.available.success", $$5.size(), yk.b($$5, (T $$0) -> $$0.a(false))), false);
        }
        return $$5.size();
    }

    private static int c(ed $$0) {
        bak $$1 = $$0.m().aE();
        $$1.a();
        Collection<bah> $$2 = $$1.g();
        if ($$2.isEmpty()) {
            $$0.a(() -> yh.c("commands.datapack.list.enabled.none"), false);
        } else {
            $$0.a(() -> yh.a("commands.datapack.list.enabled.success", $$2.size(), yk.b($$2, (T $$0) -> $$0.a(true))), false);
        }
        return $$2.size();
    }

    private static bah a(CommandContext<ed> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
        String $$3 = StringArgumentType.getString($$0, (String)$$1);
        bak $$4 = ((ed)$$0.getSource()).m().aE();
        bah $$5 = $$4.c($$3);
        if ($$5 == null) {
            throw b.create((Object)$$3);
        }
        boolean $$6 = $$4.g().contains($$5);
        if ($$2 && $$6) {
            throw c.create((Object)$$3);
        }
        if (!$$2 && !$$6) {
            throw d.create((Object)$$3);
        }
        dgz $$7 = ((ed)$$0.getSource()).w();
        dgz $$8 = $$5.e();
        if (!$$2 && !$$8.b() && $$5.l() == bal.d) {
            throw e.create((Object)$$3);
        }
        if (!$$8.a($$7)) {
            throw f.create((Object)$$3, (Object)dhb.a($$7, $$8));
        }
        return $$5;
    }

    static interface a {
        public void apply(List<bah> var1, bah var2) throws CommandSyntaxException;
    }
}

