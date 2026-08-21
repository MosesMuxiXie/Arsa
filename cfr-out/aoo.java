/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class aoo {
    public static void a(CommandDispatcher<ed> $$02, dz $$12) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("debugconfig").requires(ee.a(ee.e))).then(ee.b("config").then(ee.a("target", eq.c()).executes($$0 -> aoo.a((ed)$$0.getSource(), eq.e((CommandContext<ed>)$$0, "target")))))).then(ee.b("unconfig").then(ee.a("target", fv.a()).suggests(($$0, $$1) -> ei.b(aoo.a(((ed)$$0.getSource()).m()), $$1)).executes($$0 -> aoo.a((ed)$$0.getSource(), fv.a((CommandContext<ed>)$$0, "target")))))).then(ee.b("dialog").then(ee.a("target", fv.a()).suggests(($$0, $$1) -> ei.b(aoo.a(((ed)$$0.getSource()).m()), $$1)).then(ee.a("dialog", fg.d($$12)).executes($$0 -> aoo.a((ed)$$0.getSource(), fv.a((CommandContext<ed>)$$0, "target"), fg.d((CommandContext<ed>)$$0, "dialog")))))));
    }

    private static Iterable<String> a(MinecraftServer $$0) {
        HashSet<String> $$1 = new HashSet<String>();
        for (wu $$2 : $$0.ak().e()) {
            xk xk2 = $$2.k();
            if (!(xk2 instanceof ayg)) continue;
            ayg $$3 = (ayg)xk2;
            $$1.add($$3.j().id().toString());
        }
        return $$1;
    }

    private static int a(ed $$0, axg $$1) {
        GameProfile $$2 = $$1.gI();
        $$1.g.o();
        $$0.a(() -> yh.b("Switched player " + $$2.name() + "(" + String.valueOf($$2.id()) + ") to config mode"), false);
        return 1;
    }

    private static @Nullable ayg a(MinecraftServer $$0, UUID $$1) {
        for (wu $$2 : $$0.ak().e()) {
            ayg $$3;
            xk xk2 = $$2.k();
            if (!(xk2 instanceof ayg) || !($$3 = (ayg)xk2).j().id().equals($$1)) continue;
            return $$3;
        }
        return null;
    }

    private static int a(ed $$0, UUID $$1) {
        ayg $$2 = aoo.a($$0.m(), $$1);
        if ($$2 != null) {
            $$2.m();
            return 1;
        }
        $$0.b(yh.b("Can't find player to unconfig"));
        return 0;
    }

    private static int a(ed $$0, UUID $$1, jd<asj> $$2) {
        ayg $$3 = aoo.a($$0.m(), $$1);
        if ($$3 != null) {
            $$3.b(new abq($$2));
            return 1;
        }
        $$0.b(yh.b("Can't find player to talk to"));
        return 0;
    }
}

