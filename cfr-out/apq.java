/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class apq {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.drop.no_held_items", $$0));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.drop.no_loot_table.entity", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.drop.no_loot_table.block", $$0));

    public static void a(CommandDispatcher<ed> $$0, dz $$1) {
        $$0.register(apq.a((LiteralArgumentBuilder)ee.b("loot").requires(ee.a(ee.d)), (ArgumentBuilder<ed, ?> $$12, b $$2) -> $$12.then(ee.b("fish").then(ee.a("loot_table", fg.a($$1)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("pos", gc.a()).executes($$1 -> apq.a((CommandContext<ed>)$$1, fg.a((CommandContext<ed>)$$1, "loot_table"), gc.a((CommandContext<ed>)$$1, "pos"), dlt.l, $$2))).then(ee.a("tool", gp.a($$1)).executes($$1 -> apq.a((CommandContext<ed>)$$1, fg.a((CommandContext<ed>)$$1, "loot_table"), gc.a((CommandContext<ed>)$$1, "pos"), gp.a($$1, "tool").a(1, false), $$2)))).then(ee.b("mainhand").executes($$1 -> apq.a((CommandContext<ed>)$$1, fg.a((CommandContext<ed>)$$1, "loot_table"), gc.a((CommandContext<ed>)$$1, "pos"), apq.a((ed)$$1.getSource(), cgv.a), $$2)))).then(ee.b("offhand").executes($$1 -> apq.a((CommandContext<ed>)$$1, fg.a((CommandContext<ed>)$$1, "loot_table"), gc.a((CommandContext<ed>)$$1, "pos"), apq.a((ed)$$1.getSource(), cgv.b), $$2)))))).then(ee.b("loot").then(ee.a("loot_table", fg.a($$1)).executes($$1 -> apq.a((CommandContext<ed>)$$1, fg.a((CommandContext<ed>)$$1, "loot_table"), $$2)))).then(ee.b("kill").then(ee.a("target", eq.a()).executes($$1 -> apq.a((CommandContext<ed>)$$1, eq.a((CommandContext<ed>)$$1, "target"), $$2)))).then(ee.b("mine").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("pos", gc.a()).executes($$1 -> apq.a((CommandContext<ed>)$$1, gc.a((CommandContext<ed>)$$1, "pos"), dlt.l, $$2))).then(ee.a("tool", gp.a($$1)).executes($$1 -> apq.a((CommandContext<ed>)$$1, gc.a((CommandContext<ed>)$$1, "pos"), gp.a($$1, "tool").a(1, false), $$2)))).then(ee.b("mainhand").executes($$1 -> apq.a((CommandContext<ed>)$$1, gc.a((CommandContext<ed>)$$1, "pos"), apq.a((ed)$$1.getSource(), cgv.a), $$2)))).then(ee.b("offhand").executes($$1 -> apq.a((CommandContext<ed>)$$1, gc.a((CommandContext<ed>)$$1, "pos"), apq.a((ed)$$1.getSource(), cgv.b), $$2)))))));
    }

    private static <T extends ArgumentBuilder<ed, T>> T a(T $$02, c $$12) {
        return (T)$$02.then(((LiteralArgumentBuilder)ee.b("replace").then(ee.b("entity").then(ee.a("entities", eq.b()).then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("slot", fn.a()), ($$0, $$1, $$2) -> apq.a(eq.b((CommandContext<ed>)$$0, "entities"), fn.a((CommandContext<ed>)$$0, "slot"), $$1.size(), $$1, $$2)).then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("count", IntegerArgumentType.integer((int)0)), ($$0, $$1, $$2) -> apq.a(eq.b((CommandContext<ed>)$$0, "entities"), fn.a((CommandContext<ed>)$$0, "slot"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), $$1, $$2))))))).then(ee.b("block").then(ee.a("targetPos", gc.a()).then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("slot", fn.a()), ($$0, $$1, $$2) -> apq.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "targetPos"), fn.a((CommandContext<ed>)$$0, "slot"), $$1.size(), $$1, $$2)).then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("count", IntegerArgumentType.integer((int)0)), ($$0, $$1, $$2) -> apq.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "targetPos"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"slot"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), $$1, $$2))))))).then(ee.b("insert").then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("targetPos", gc.a()), ($$0, $$1, $$2) -> apq.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "targetPos"), (List<dlt>)$$1, $$2)))).then(ee.b("give").then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("players", eq.d()), ($$0, $$1, $$2) -> apq.a(eq.f((CommandContext<ed>)$$0, "players"), (List<dlt>)$$1, $$2)))).then(ee.b("spawn").then($$12.construct((ArgumentBuilder<ed, ?>)ee.a("targetPos", gj.a()), ($$0, $$1, $$2) -> apq.a((ed)$$0.getSource(), gj.a((CommandContext<ed>)$$0, "targetPos"), (List<dlt>)$$1, $$2))));
    }

    private static ccv a(ed $$0, is $$1) throws CommandSyntaxException {
        elb $$2 = $$0.f().c_($$1);
        if (!($$2 instanceof ccv)) {
            throw apj.a.create((Object)$$1.u(), (Object)$$1.v(), (Object)$$1.w());
        }
        return (ccv)((Object)$$2);
    }

    private static int a(ed $$0, is $$1, List<dlt> $$2, a $$3) throws CommandSyntaxException {
        ccv $$4 = apq.a($$0, $$1);
        ArrayList $$5 = Lists.newArrayListWithCapacity((int)$$2.size());
        for (dlt $$6 : $$2) {
            if (!apq.a($$4, $$6.v())) continue;
            $$4.e();
            $$5.add($$6);
        }
        $$3.accept($$5);
        return $$5.size();
    }

    private static boolean a(ccv $$0, dlt $$1) {
        boolean $$2 = false;
        for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); ++$$3) {
            dlt $$4 = $$0.a($$3);
            if (!$$0.b($$3, $$1)) continue;
            if ($$4.f()) {
                $$0.a($$3, $$1);
                $$2 = true;
                break;
            }
            if (!apq.a($$4, $$1)) continue;
            int $$5 = $$1.k() - $$4.N();
            int $$6 = Math.min($$1.N(), $$5);
            $$1.h($$6);
            $$4.g($$6);
            $$2 = true;
        }
        return $$2;
    }

    private static int a(ed $$0, is $$1, int $$2, int $$3, List<dlt> $$4, a $$5) throws CommandSyntaxException {
        ccv $$6 = apq.a($$0, $$1);
        int $$7 = $$6.b();
        if ($$2 < 0 || $$2 >= $$7) {
            throw apj.c.create((Object)$$2);
        }
        ArrayList $$8 = Lists.newArrayListWithCapacity((int)$$4.size());
        for (int $$9 = 0; $$9 < $$3; ++$$9) {
            dlt $$11;
            int $$10 = $$2 + $$9;
            dlt dlt2 = $$11 = $$9 < $$4.size() ? $$4.get($$9) : dlt.l;
            if (!$$6.b($$10, $$11)) continue;
            $$6.a($$10, $$11);
            $$8.add($$11);
        }
        $$5.accept($$8);
        return $$8.size();
    }

    private static boolean a(dlt $$0, dlt $$1) {
        return $$0.N() <= $$0.k() && dlt.c($$0, $$1);
    }

    private static int a(Collection<axg> $$0, List<dlt> $$1, a $$2) throws CommandSyntaxException {
        ArrayList $$3 = Lists.newArrayListWithCapacity((int)$$1.size());
        for (dlt $$4 : $$1) {
            for (axg $$5 : $$0) {
                if (!$$5.gK().g($$4.v())) continue;
                $$3.add($$4);
            }
        }
        $$2.accept($$3);
        return $$3.size();
    }

    private static void a(cgk $$0, List<dlt> $$1, int $$2, int $$3, List<dlt> $$4) {
        for (int $$5 = 0; $$5 < $$3; ++$$5) {
            dlt $$6 = $$5 < $$1.size() ? $$1.get($$5) : dlt.l;
            cic $$7 = $$0.a_($$2 + $$5);
            if ($$7 == null || !$$7.a($$6.v())) continue;
            $$4.add($$6);
        }
    }

    private static int a(Collection<? extends cgk> $$0, int $$1, int $$2, List<dlt> $$3, a $$4) throws CommandSyntaxException {
        ArrayList $$5 = Lists.newArrayListWithCapacity((int)$$3.size());
        for (cgk cgk2 : $$0) {
            if (cgk2 instanceof axg) {
                axg $$7 = (axg)cgk2;
                apq.a(cgk2, $$3, $$1, $$2, $$5);
                $$7.cn.d();
                continue;
            }
            apq.a(cgk2, $$3, $$1, $$2, $$5);
        }
        $$4.accept($$5);
        return $$5.size();
    }

    private static int a(ed $$0, ftm $$1, List<dlt> $$22, a $$3) throws CommandSyntaxException {
        axf $$4 = $$0.f();
        $$22.forEach($$2 -> {
            czl $$3 = new czl($$4, $$1.g, $$1.h, $$1.i, $$2.v());
            $$3.i();
            $$4.b($$3);
        });
        $$3.accept($$22);
        return $$22.size();
    }

    private static void a(ed $$0, List<dlt> $$1) {
        if ($$1.size() == 1) {
            dlt $$2 = $$1.get(0);
            $$0.a(() -> yh.a("commands.drop.success.single", $$2.N(), $$2.K()), false);
        } else {
            $$0.a(() -> yh.a("commands.drop.success.multiple", $$1.size()), false);
        }
    }

    private static void a(ed $$0, List<dlt> $$1, amt<fof> $$2) {
        if ($$1.size() == 1) {
            dlt $$3 = $$1.get(0);
            $$0.a(() -> yh.a("commands.drop.success.single_with_table", $$3.N(), $$3.K(), yh.a($$2.a())), false);
        } else {
            $$0.a(() -> yh.a("commands.drop.success.multiple_with_table", $$1.size(), yh.a($$2.a())), false);
        }
    }

    private static dlt a(ed $$0, cgv $$1) throws CommandSyntaxException {
        cgk $$2 = $$0.h();
        if ($$2 instanceof chl) {
            return ((chl)$$2).a($$1);
        }
        throw a.create((Object)$$2.R_());
    }

    private static int a(CommandContext<ed> $$0, is $$1, dlt $$22, b $$3) throws CommandSyntaxException {
        ed $$4 = (ed)$$0.getSource();
        axf $$5 = $$4.f();
        eoh $$6 = $$5.a_($$1);
        elb $$7 = $$5.c_($$1);
        Optional<amt<fof>> $$8 = $$6.b().y();
        if ($$8.isEmpty()) {
            throw c.create((Object)$$6.b().f());
        }
        fod.a $$9 = new fod.a($$5).a(fqx.h, ftm.b($$1)).a(fqx.i, $$6).b(fqx.j, $$7).b(fqx.a, $$4.g()).a(fqx.k, $$22);
        List<dlt> $$10 = $$6.a($$9);
        return $$3.accept($$0, $$10, $$2 -> apq.a($$4, (List<dlt>)$$2, (amt)$$8.get()));
    }

    private static int a(CommandContext<ed> $$0, cgk $$1, b $$22) throws CommandSyntaxException {
        Optional<amt<fof>> $$3 = $$1.er();
        if ($$3.isEmpty()) {
            throw b.create((Object)$$1.R_());
        }
        ed $$4 = (ed)$$0.getSource();
        fod.a $$5 = new fod.a($$4.f());
        cgk $$6 = $$4.g();
        if ($$6 instanceof ddm) {
            ddm $$7 = (ddm)$$6;
            $$5.a(fqx.d, $$7);
        }
        $$5.a(fqx.e, $$1.en().q());
        $$5.b(fqx.g, $$6);
        $$5.b(fqx.f, $$6);
        $$5.a(fqx.a, $$1);
        $$5.a(fqx.h, $$4.e());
        fod $$8 = $$5.a(fqw.g);
        fof $$9 = $$4.m().be().a($$3.get());
        ObjectArrayList<dlt> $$10 = $$9.a($$8);
        return $$22.accept($$0, (List<dlt>)$$10, $$2 -> apq.a($$4, (List<dlt>)$$2, (amt)$$3.get()));
    }

    private static int a(CommandContext<ed> $$0, jd<fof> $$1, b $$2) throws CommandSyntaxException {
        ed $$3 = (ed)$$0.getSource();
        fod $$4 = new fod.a($$3.f()).b(fqx.a, $$3.g()).a(fqx.h, $$3.e()).a(fqw.c);
        return apq.a($$0, $$1, $$4, $$2);
    }

    private static int a(CommandContext<ed> $$0, jd<fof> $$1, is $$2, dlt $$3, b $$4) throws CommandSyntaxException {
        ed $$5 = (ed)$$0.getSource();
        fod $$6 = new fod.a($$5.f()).a(fqx.h, ftm.b($$2)).a(fqx.k, $$3).b(fqx.a, $$5.g()).a(fqw.f);
        return apq.a($$0, $$1, $$6, $$4);
    }

    private static int a(CommandContext<ed> $$0, jd<fof> $$12, fod $$2, b $$3) throws CommandSyntaxException {
        ed $$4 = (ed)$$0.getSource();
        ObjectArrayList<dlt> $$5 = $$12.a().a($$2);
        return $$3.accept($$0, (List<dlt>)$$5, $$1 -> apq.a($$4, $$1));
    }

    @FunctionalInterface
    static interface c {
        public ArgumentBuilder<ed, ?> construct(ArgumentBuilder<ed, ?> var1, b var2);
    }

    @FunctionalInterface
    static interface b {
        public int accept(CommandContext<ed> var1, List<dlt> var2, a var3) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public void accept(List<dlt> var1) throws CommandSyntaxException;
    }
}

