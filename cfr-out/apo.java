/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import org.slf4j.Logger;

public class apo {
    private static final Logger a = LogUtils.getLogger();
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.locate.structure.not_found", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.locate.structure.invalid", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.locate.biome.not_found", $$0));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("commands.locate.poi.not_found", $$0));
    private static final int f = 100;
    private static final int g = 6400;
    private static final int h = 32;
    private static final int i = 64;
    private static final int j = 256;

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("locate").requires(ee.a(ee.d))).then(ee.b("structure").then(ee.a("structure", fi.a(mj.bs)).executes($$0 -> apo.a((ed)$$0.getSource(), fi.a((CommandContext<ed>)$$0, "structure", mj.bs, c)))))).then(ee.b("biome").then(ee.a("biome", fh.a($$1, mj.aS)).executes($$0 -> apo.a((ed)$$0.getSource(), fh.a((CommandContext<ed>)$$0, "biome", mj.aS)))))).then(ee.b("poi").then(ee.a("poi", fh.a($$1, mj.ai)).executes($$0 -> apo.b((ed)$$0.getSource(), fh.a((CommandContext<ed>)$$0, "poi", mj.ai))))));
    }

    private static Optional<? extends jh.b<ffo>> a(fi.c<ffo> $$0, jq<ffo> $$12) {
        return (Optional)$$0.a().map($$1 -> $$12.a((amt)$$1).map($$0 -> jh.a($$0)), $$12::a);
    }

    private static int a(ed $$0, fi.c<ffo> $$1) throws CommandSyntaxException {
        jq<ffo> $$2 = $$0.f().J_().f(mj.bs);
        jh $$3 = apo.a($$1, $$2).orElseThrow(() -> c.create((Object)$$1.b()));
        is $$4 = is.a($$0.e());
        axf $$5 = $$0.f();
        Stopwatch $$6 = Stopwatch.createStarted((Ticker)bhs.d);
        Pair<is, jd<ffo>> $$7 = $$5.p().g().a($$5, $$3, $$4, 100, false);
        $$6.stop();
        if ($$7 == null) {
            throw b.create((Object)$$1.b());
        }
        return apo.a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
    }

    private static int a(ed $$0, fh.c<dxo> $$1) throws CommandSyntaxException {
        is $$2 = is.a($$0.e());
        Stopwatch $$3 = Stopwatch.createStarted((Ticker)bhs.d);
        Pair<is, jd<dxo>> $$4 = $$0.f().a($$1, $$2, 6400, 32, 64);
        $$3.stop();
        if ($$4 == null) {
            throw d.create((Object)$$1.b());
        }
        return apo.a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
    }

    private static int b(ed $$0, fh.c<cta> $$1) throws CommandSyntaxException {
        is $$2 = is.a($$0.e());
        axf $$3 = $$0.f();
        Stopwatch $$4 = Stopwatch.createStarted((Ticker)bhs.d);
        Optional<Pair<jd<cta>, is>> $$5 = $$3.F().e($$1, $$2, 256, csx.b.c);
        $$4.stop();
        if ($$5.isEmpty()) {
            throw e.create((Object)$$1.b());
        }
        return apo.a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
    }

    public static int a(ed $$0, fh.c<?> $$12, is $$22, Pair<is, ? extends jd<?>> $$3, String $$4, boolean $$5, Duration $$6) {
        String $$7 = (String)$$12.a().map($$1 -> $$12.b(), $$2 -> $$12.b() + " (" + ((jd)$$3.getSecond()).g() + ")");
        return apo.a($$0, $$22, $$3, $$4, $$5, $$7, $$6);
    }

    public static int a(ed $$02, fi.c<?> $$12, is $$2, Pair<is, ? extends jd<?>> $$3, String $$4, boolean $$5, Duration $$6) {
        String $$7 = (String)$$12.a().map($$0 -> $$0.a().toString(), $$1 -> "#" + String.valueOf($$1.b()) + " (" + ((jd)$$3.getSecond()).g() + ")");
        return apo.a($$02, $$2, $$3, $$4, $$5, $$7, $$6);
    }

    private static int a(ed $$0, is $$1, Pair<is, ? extends jd<?>> $$22, String $$3, boolean $$4, String $$5, Duration $$6) {
        is $$7 = (is)$$22.getFirst();
        int $$8 = $$4 ? bgj.b(bgj.a((float)$$1.j($$7))) : bgj.b(apo.a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
        String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
        yw $$10 = yk.a(yh.a("chat.coordinates", $$7.u(), $$9, $$7.w())).a($$2 -> $$2.a(l.k).a(new yf.i("/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new yo.e(yh.c("chat.coordinates.tooltip"))));
        $$0.a(() -> yh.a($$3, new Object[]{$$5, $$10, $$8}), false);
        a.info("Locating element {} took {} ms", (Object)$$5, (Object)$$6.toMillis());
        return $$8;
    }

    private static float a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$2 - $$0;
        int $$5 = $$3 - $$1;
        return bgj.a((float)($$4 * $$4 + $$5 * $$5));
    }
}

