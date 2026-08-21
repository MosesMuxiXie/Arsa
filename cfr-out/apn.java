/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class apn {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("list").executes($$0 -> apn.a((ed)$$0.getSource()))).then(ee.b("uuids").executes($$0 -> apn.b((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) {
        return apn.a($$0, ddm::R_);
    }

    private static int b(ed $$02) {
        return apn.a($$02, $$0 -> yh.a("commands.list.nameAndId", $$0.ap(), yh.a($$0.gI().id())));
    }

    private static int a(ed $$0, Function<axg, yh> $$1) {
        bbz $$2 = $$0.m().aj();
        List<axg> $$3 = $$2.t();
        yh $$4 = yk.b($$3, $$1);
        $$0.a(() -> yh.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
        return $$3.size();
    }
}

