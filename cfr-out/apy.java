/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class apy {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.playsound.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        RequiredArgumentBuilder $$1 = (RequiredArgumentBuilder)ee.a("sound", ev.a()).suggests(ig.a(ig.b)).executes($$0 -> apy.a((ed)$$0.getSource(), apy.a(((ed)$$0.getSource()).j()), ev.a((CommandContext<ed>)$$0, "sound"), bdb.a, ((ed)$$0.getSource()).e(), 1.0f, 1.0f, 0.0f));
        for (bdb $$2 : bdb.values()) {
            $$1.then(apy.a($$2));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("playsound").requires(ee.a(ee.d))).then((ArgumentBuilder)$$1));
    }

    private static LiteralArgumentBuilder<ed> a(bdb $$0) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b($$0.a()).executes($$1 -> apy.a((ed)$$1.getSource(), apy.a(((ed)$$1.getSource()).j()), ev.a((CommandContext<ed>)$$1, "sound"), $$0, ((ed)$$1.getSource()).e(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).executes($$1 -> apy.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), ev.a((CommandContext<ed>)$$1, "sound"), $$0, ((ed)$$1.getSource()).e(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)ee.a("pos", gj.a()).executes($$1 -> apy.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), ev.a((CommandContext<ed>)$$1, "sound"), $$0, gj.a((CommandContext<ed>)$$1, "pos"), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)ee.a("volume", FloatArgumentType.floatArg((float)0.0f)).executes($$1 -> apy.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), ev.a((CommandContext<ed>)$$1, "sound"), $$0, gj.a((CommandContext<ed>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), 1.0f, 0.0f))).then(((RequiredArgumentBuilder)ee.a("pitch", FloatArgumentType.floatArg((float)0.0f, (float)2.0f)).executes($$1 -> apy.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), ev.a((CommandContext<ed>)$$1, "sound"), $$0, gj.a((CommandContext<ed>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), ((Float)$$1.getArgument("pitch", Float.class)).floatValue(), 0.0f))).then(ee.a("minVolume", FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes($$1 -> apy.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), ev.a((CommandContext<ed>)$$1, "sound"), $$0, gj.a((CommandContext<ed>)$$1, "pos"), ((Float)$$1.getArgument("volume", Float.class)).floatValue(), ((Float)$$1.getArgument("pitch", Float.class)).floatValue(), ((Float)$$1.getArgument("minVolume", Float.class)).floatValue())))))));
    }

    private static Collection<axg> a(@Nullable axg $$0) {
        return $$0 != null ? List.of($$0) : List.of();
    }

    private static int a(ed $$0, Collection<axg> $$1, amo $$2, bdb $$3, ftm $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
        jd<bcz> $$8 = jd.a(bcz.a($$2));
        double $$9 = bgj.j($$8.a().a($$5));
        axf $$10 = $$0.f();
        long $$11 = $$10.G_().g();
        ArrayList<axg> $$12 = new ArrayList<axg>();
        for (axg $$13 : $$1) {
            if ($$13.A() != $$10) continue;
            double $$14 = $$4.g - $$13.dP();
            double $$15 = $$4.h - $$13.dR();
            double $$16 = $$4.i - $$13.dV();
            double $$17 = $$14 * $$14 + $$15 * $$15 + $$16 * $$16;
            ftm $$18 = $$4;
            float $$19 = $$5;
            if ($$17 > $$9) {
                if ($$7 <= 0.0f) continue;
                double $$20 = Math.sqrt($$17);
                $$18 = new ftm($$13.dP() + $$14 / $$20 * 2.0, $$13.dR() + $$15 / $$20 * 2.0, $$13.dV() + $$16 / $$20 * 2.0);
                $$19 = $$7;
            }
            $$13.g.b(new ahh($$8, $$3, $$18.a(), $$18.b(), $$18.c(), $$19, $$6, $$11));
            $$12.add($$13);
        }
        int $$21 = $$12.size();
        if ($$21 == 0) {
            throw a.create();
        }
        if ($$21 == 1) {
            $$0.a(() -> yh.a("commands.playsound.success.single", yh.a($$2), ((axg)$$12.getFirst()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.playsound.success.multiple", yh.a($$2), $$21), true);
        }
        return $$21;
    }
}

