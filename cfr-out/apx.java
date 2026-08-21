/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Optional;

public class apx {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.place.feature.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.place.jigsaw.failed"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.place.structure.failed"));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.place.template.invalid", $$0));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.place.template.failed"));
    private static final SuggestionProvider<ed> f = ($$0, $$1) -> {
        fjr $$2 = ((ed)$$0.getSource()).f().u();
        return ei.a($$2.a(), $$1);
    };

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("place").requires(ee.a(ee.d))).then(ee.b("feature").then(((RequiredArgumentBuilder)ee.a("feature", ff.a(mj.aY)).executes($$0 -> apx.a((ed)$$0.getSource(), ff.a((CommandContext<ed>)$$0, "feature"), is.a(((ed)$$0.getSource()).e())))).then(ee.a("pos", gc.a()).executes($$0 -> apx.a((ed)$$0.getSource(), ff.a((CommandContext<ed>)$$0, "feature"), gc.a((CommandContext<ed>)$$0, "pos"))))))).then(ee.b("jigsaw").then(ee.a("pool", ff.a(mj.bt)).then(ee.a("target", ev.a()).then(((RequiredArgumentBuilder)ee.a("max_depth", IntegerArgumentType.integer((int)1, (int)20)).executes($$0 -> apx.a((ed)$$0.getSource(), ff.c((CommandContext<ed>)$$0, "pool"), ev.a((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"max_depth"), is.a(((ed)$$0.getSource()).e())))).then(ee.a("position", gc.a()).executes($$0 -> apx.a((ed)$$0.getSource(), ff.c((CommandContext<ed>)$$0, "pool"), ev.a((CommandContext<ed>)$$0, "target"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"max_depth"), gc.a((CommandContext<ed>)$$0, "position"))))))))).then(ee.b("structure").then(((RequiredArgumentBuilder)ee.a("structure", ff.a(mj.bs)).executes($$0 -> apx.b((ed)$$0.getSource(), ff.b((CommandContext<ed>)$$0, "structure"), is.a(((ed)$$0.getSource()).e())))).then(ee.a("pos", gc.a()).executes($$0 -> apx.b((ed)$$0.getSource(), ff.b((CommandContext<ed>)$$0, "structure"), gc.a((CommandContext<ed>)$$0, "pos"))))))).then(ee.b("template").then(((RequiredArgumentBuilder)ee.a("template", ev.a()).suggests(f).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), is.a(((ed)$$0.getSource()).e()), egm.a, eev.a, 1.0f, 0, false))).then(((RequiredArgumentBuilder)ee.a("pos", gc.a()).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), egm.a, eev.a, 1.0f, 0, false))).then(((RequiredArgumentBuilder)ee.a("rotation", ft.a()).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), ft.a((CommandContext<ed>)$$0, "rotation"), eev.a, 1.0f, 0, false))).then(((RequiredArgumentBuilder)ee.a("mirror", fs.a()).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), ft.a((CommandContext<ed>)$$0, "rotation"), fs.a((CommandContext<ed>)$$0, "mirror"), 1.0f, 0, false))).then(((RequiredArgumentBuilder)ee.a("integrity", FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), ft.a((CommandContext<ed>)$$0, "rotation"), fs.a((CommandContext<ed>)$$0, "mirror"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"integrity"), 0, false))).then(((RequiredArgumentBuilder)ee.a("seed", IntegerArgumentType.integer()).executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), ft.a((CommandContext<ed>)$$0, "rotation"), fs.a((CommandContext<ed>)$$0, "mirror"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"integrity"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), false))).then(ee.b("strict").executes($$0 -> apx.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "template"), gc.a((CommandContext<ed>)$$0, "pos"), ft.a((CommandContext<ed>)$$0, "rotation"), fs.a((CommandContext<ed>)$$0, "mirror"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"integrity"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), true)))))))))));
    }

    public static int a(ed $$0, jd.c<exi<?, ?>> $$1, is $$2) throws CommandSyntaxException {
        axf $$3 = $$0.f();
        exi<?, ?> $$4 = $$1.a();
        dvu $$5 = new dvu($$2);
        apx.a($$3, new dvu($$5.h - 1, $$5.i - 1), new dvu($$5.h + 1, $$5.i + 1));
        if (!$$4.a($$3, $$3.p().g(), $$3.G_(), $$2)) {
            throw a.create();
        }
        String $$6 = $$1.h().a().toString();
        $$0.a(() -> yh.a("commands.place.feature.success", new Object[]{$$6, $$2.u(), $$2.v(), $$2.w()}), true);
        return 1;
    }

    public static int a(ed $$0, jd<fgy> $$1, amo $$2, int $$3, is $$4) throws CommandSyntaxException {
        axf $$5 = $$0.f();
        dvu $$6 = new dvu($$4);
        apx.a($$5, $$6, $$6);
        if (!fgs.a($$5, $$1, $$2, $$3, $$4, false)) {
            throw b.create();
        }
        $$0.a(() -> yh.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
        return 1;
    }

    public static int b(ed $$02, jd.c<ffo> $$1, is $$2) throws CommandSyntaxException {
        axf $$32 = $$02.f();
        ffo $$4 = $$1.a();
        eqg $$5 = $$32.p().g();
        ffw $$6 = $$4.a($$1, $$32.aq(), $$02.v(), $$5, $$5.d(), $$32.p().i(), $$32.u(), $$32.J(), new dvu($$2), 0, $$32, $$0 -> true);
        if (!$$6.b()) {
            throw c.create();
        }
        ffg $$7 = $$6.a();
        dvu $$8 = new dvu(jw.a($$7.h()), jw.a($$7.j()));
        dvu $$9 = new dvu(jw.a($$7.k()), jw.a($$7.m()));
        apx.a($$32, $$8, $$9);
        dvu.a($$8, $$9).forEach($$3 -> $$6.a($$32, $$32.b(), $$5, $$32.G_(), new ffg($$3.e(), $$32.K_(), $$3.f(), $$3.g(), $$32.aw() + 1, $$3.h()), (dvu)$$3));
        String $$10 = $$1.h().a().toString();
        $$02.a(() -> yh.a("commands.place.structure.success", new Object[]{$$10, $$2.u(), $$2.v(), $$2.w()}), true);
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public static int a(ed $$0, amo $$1, is $$2, egm $$3, eev $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
        boolean $$15;
        void $$12;
        axf $$8 = $$0.f();
        fjr $$9 = $$8.u();
        try {
            Optional<fjq> $$10 = $$9.b($$1);
        }
        catch (s $$11) {
            throw d.create((Object)$$1);
        }
        if ($$12.isEmpty()) {
            throw d.create((Object)$$1);
        }
        fjq $$13 = (fjq)$$12.get();
        apx.a($$8, new dvu($$2), new dvu($$2.a($$13.a())));
        fjm $$14 = new fjm().a($$4).a($$3).b($$7);
        if ($$5 < 1.0f) {
            $$14.b().a(new fit($$5)).a(emx.b($$6));
        }
        if (!($$15 = $$13.a($$8, $$2, $$2, $$14, emx.b($$6), 2 | ($$7 ? 816 : 0)))) {
            throw e.create();
        }
        $$0.a(() -> yh.a("commands.place.template.success", yh.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
        return 1;
    }

    private static void a(axf $$0, dvu $$12, dvu $$2) throws CommandSyntaxException {
        if (dvu.a($$12, $$2).filter($$1 -> !$$0.t($$1.m())).findAny().isPresent()) {
            throw gc.a.create();
        }
    }
}

