/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aqs {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("setworldspawn").requires(ee.a(ee.d))).executes($$0 -> aqs.a((ed)$$0.getSource(), is.a(((ed)$$0.getSource()).e()), gl.a))).then(((RequiredArgumentBuilder)ee.a("pos", gc.a()).executes($$0 -> aqs.a((ed)$$0.getSource(), gc.c((CommandContext<ed>)$$0, "pos"), gl.a))).then(ee.a("rotation", gg.a()).executes($$0 -> aqs.a((ed)$$0.getSource(), gc.c((CommandContext<ed>)$$0, "pos"), gg.a((CommandContext<ed>)$$0, "rotation"))))));
    }

    private static int a(ed $$0, is $$1, ge $$2) {
        axf $$3 = $$0.f();
        ftl $$4 = $$2.b($$0);
        float $$5 = $$4.k;
        float $$6 = $$4.j;
        fne.a $$7 = fne.a.a($$3.aq(), $$1, $$5, $$6);
        $$3.a($$7);
        $$0.a(() -> yh.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), Float.valueOf($$7.d()), Float.valueOf($$7.e()), $$3.aq().a().toString()), true);
        return 1;
    }
}

