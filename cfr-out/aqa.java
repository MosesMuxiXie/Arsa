/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class aqa {
    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("raid").requires(ee.a(ee.e))).then(ee.b("start").then(ee.a("omenlvl", IntegerArgumentType.integer((int)0)).executes($$0 -> aqa.b((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"omenlvl")))))).then(ee.b("stop").executes($$0 -> aqa.c((ed)$$0.getSource())))).then(ee.b("check").executes($$0 -> aqa.d((ed)$$0.getSource())))).then(ee.b("sound").then(ee.a("type", em.a($$1)).executes($$0 -> aqa.a((ed)$$0.getSource(), em.b((CommandContext<ed>)$$0, "type")))))).then(ee.b("spawnleader").executes($$0 -> aqa.b((ed)$$0.getSource())))).then(ee.b("setomen").then(ee.a("level", IntegerArgumentType.integer((int)0)).executes($$0 -> aqa.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"level")))))).then(ee.b("glow").executes($$0 -> aqa.a((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) throws CommandSyntaxException {
        dfh $$1 = aqa.a($$0.i());
        if ($$1 != null) {
            Set<dfi> $$2 = $$1.h();
            for (dfi $$3 : $$2) {
                $$3.a(new cfm(cfo.x, 1000, 1));
            }
        }
        return 1;
    }

    private static int a(ed $$0, int $$1) throws CommandSyntaxException {
        dfh $$2 = aqa.a($$0.i());
        if ($$2 != null) {
            int $$3 = $$2.k();
            if ($$1 > $$3) {
                $$0.b(yh.b("Sorry, the max raid omen level you can set is " + $$3));
            } else {
                int $$4 = $$2.l();
                $$2.a($$1);
                $$0.a(() -> yh.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
            }
        } else {
            $$0.b(yh.b("No raid found here"));
        }
        return 1;
    }

    private static int b(ed $$0) {
        $$0.a(() -> yh.b("Spawned a raid captain"), false);
        dfi $$1 = cgu.bb.a($$0.f(), cgt.n);
        if ($$1 == null) {
            $$0.b(yh.b("Pillager failed to spawn"));
            return 0;
        }
        $$1.x(true);
        $$1.a(cgv.f, dfh.a($$0.v().f(mj.aR)));
        $$1.a_($$0.e().g, $$0.e().h, $$0.e().i);
        $$1.a((dxf)$$0.f(), $$0.f().c(is.a($$0.e())), cgt.n, null);
        $$0.f().a_($$1);
        return 1;
    }

    private static int a(ed $$0, @Nullable yh $$1) {
        if ($$1 != null && $$1.getString().equals("local")) {
            axf $$2 = $$0.f();
            ftm $$3 = $$0.e().b(5.0, 0.0, 0.0);
            $$2.a(null, $$3.g, $$3.h, $$3.i, bda.xN, bdb.g, 2.0f, 1.0f, $$2.y.g());
        }
        return 1;
    }

    private static int b(ed $$0, int $$1) throws CommandSyntaxException {
        axg $$2 = $$0.i();
        is $$3 = $$2.dK();
        if ($$2.A().g($$3)) {
            $$0.b(yh.b("Raid already started close by"));
            return -1;
        }
        dfj $$4 = $$2.A().G();
        dfh $$5 = $$4.a($$2, $$2.dK());
        if ($$5 != null) {
            $$5.a($$1);
            $$4.u();
            $$0.a(() -> yh.b("Created a raid in your local village"), false);
        } else {
            $$0.b(yh.b("Failed to create a raid in your local village"));
        }
        return 1;
    }

    private static int c(ed $$0) throws CommandSyntaxException {
        axg $$1 = $$0.i();
        is $$2 = $$1.dK();
        dfh $$3 = $$1.A().f($$2);
        if ($$3 != null) {
            $$3.m();
            $$0.a(() -> yh.b("Stopped raid"), false);
            return 1;
        }
        $$0.b(yh.b("No raid here"));
        return -1;
    }

    private static int d(ed $$0) throws CommandSyntaxException {
        dfh $$1 = aqa.a($$0.i());
        if ($$1 != null) {
            StringBuilder $$2 = new StringBuilder();
            $$2.append("Found a started raid! ");
            $$0.a(() -> yh.b($$2.toString()), false);
            StringBuilder $$3 = new StringBuilder();
            $$3.append("Num groups spawned: ");
            $$3.append($$1.j());
            $$3.append(" Raid omen level: ");
            $$3.append($$1.l());
            $$3.append(" Num mobs: ");
            $$3.append($$1.p());
            $$3.append(" Raid health: ");
            $$3.append($$1.o());
            $$3.append(" / ");
            $$3.append($$1.g());
            $$0.a(() -> yh.b($$3.toString()), false);
            return 1;
        }
        $$0.b(yh.b("Found no started raids"));
        return 0;
    }

    private static @Nullable dfh a(axg $$0) {
        return $$0.A().f($$0.dK());
    }
}

