/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class apj {
    static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("commands.item.target.not_a_container", $$0, $$1, $$2));
    static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("commands.item.source.not_a_container", $$0, $$1, $$2));
    static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.item.target.no_such_slot", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.item.source.no_such_slot", $$0));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("commands.item.target.no_changes", $$0));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.item.target.no_changed.known_item", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("item").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)ee.b("replace").then(ee.b("block").then(ee.a("pos", gc.a()).then(((RequiredArgumentBuilder)ee.a("slot", fn.a()).then(ee.b("with").then(((RequiredArgumentBuilder)ee.a("item", gp.a($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot"), gp.a($$0, "item").a(1, false)))).then(ee.a("count", IntegerArgumentType.integer((int)1, (int)99)).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot"), gp.a($$0, "item").a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true))))))).then(((LiteralArgumentBuilder)ee.b("from").then(ee.b("block").then(ee.a("source", gc.a()).then(((RequiredArgumentBuilder)ee.a("sourceSlot", fn.a()).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot")))).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier")))))))).then(ee.b("entity").then(ee.a("source", eq.a()).then(((RequiredArgumentBuilder)ee.a("sourceSlot", fn.a()).executes($$0 -> apj.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot")))).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier")))))))))))).then(ee.b("entity").then(ee.a("targets", eq.b()).then(((RequiredArgumentBuilder)ee.a("slot", fn.a()).then(ee.b("with").then(((RequiredArgumentBuilder)ee.a("item", gp.a($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot"), gp.a($$0, "item").a(1, false)))).then(ee.a("count", IntegerArgumentType.integer((int)1, (int)99)).executes($$0 -> apj.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot"), gp.a($$0, "item").a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true))))))).then(((LiteralArgumentBuilder)ee.b("from").then(ee.b("block").then(ee.a("source", gc.a()).then(((RequiredArgumentBuilder)ee.a("sourceSlot", fn.a()).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot")))).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier")))))))).then(ee.b("entity").then(ee.a("source", eq.a()).then(((RequiredArgumentBuilder)ee.a("sourceSlot", fn.a()).executes($$0 -> apj.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot")))).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "source"), fn.a((CommandContext<ed>)$$0, "sourceSlot"), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier"))))))))))))).then(((LiteralArgumentBuilder)ee.b("modify").then(ee.b("block").then(ee.a("pos", gc.a()).then(ee.a("slot", fn.a()).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier")))))))).then(ee.b("entity").then(ee.a("targets", eq.b()).then(ee.a("slot", fn.a()).then(ee.a("modifier", fg.b($$1)).executes($$0 -> apj.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fn.a((CommandContext<ed>)$$0, "slot"), fg.b((CommandContext<ed>)$$0, "modifier")))))))));
    }

    private static int a(ed $$0, is $$1, int $$2, jd<fpr> $$3) throws CommandSyntaxException {
        ccv $$4 = apj.a($$0, $$1, a);
        if ($$2 < 0 || $$2 >= $$4.b()) {
            throw c.create((Object)$$2);
        }
        dlt $$5 = apj.a($$0, $$3, $$4.a($$2));
        $$4.a($$2, $$5);
        $$0.a(() -> yh.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
        return 1;
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, int $$2, jd<fpr> $$3) throws CommandSyntaxException {
        HashMap $$4 = Maps.newHashMapWithExpectedSize((int)$$1.size());
        for (cgk cgk2 : $$1) {
            dlt $$7;
            cic $$6 = cgk2.a_($$2);
            if ($$6 == null || !$$6.a($$7 = apj.a($$0, $$3, $$6.a().v()))) continue;
            $$4.put(cgk2, $$7);
            if (!(cgk2 instanceof axg)) continue;
            axg $$8 = (axg)cgk2;
            $$8.cn.d();
        }
        if ($$4.isEmpty()) {
            throw e.create((Object)$$2);
        }
        if ($$4.size() == 1) {
            Map.Entry $$9 = $$4.entrySet().iterator().next();
            $$0.a(() -> yh.a("commands.item.entity.set.success.single", ((cgk)$$9.getKey()).R_(), ((dlt)$$9.getValue()).K()), true);
        } else {
            $$0.a(() -> yh.a("commands.item.entity.set.success.multiple", $$4.size()), true);
        }
        return $$4.size();
    }

    private static int a(ed $$0, is $$1, int $$2, dlt $$3) throws CommandSyntaxException {
        ccv $$4 = apj.a($$0, $$1, a);
        if ($$2 < 0 || $$2 >= $$4.b()) {
            throw c.create((Object)$$2);
        }
        $$4.a($$2, $$3);
        $$0.a(() -> yh.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
        return 1;
    }

    static ccv a(ed $$0, is $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
        elb $$3 = $$0.f().c_($$1);
        if ($$3 instanceof ccv) {
            ccv $$4 = (ccv)((Object)$$3);
            return $$4;
        }
        throw $$2.create((Object)$$1.u(), (Object)$$1.v(), (Object)$$1.w());
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, int $$2, dlt $$3) throws CommandSyntaxException {
        ArrayList $$4 = Lists.newArrayListWithCapacity((int)$$1.size());
        for (cgk cgk2 : $$1) {
            cic $$6 = cgk2.a_($$2);
            if ($$6 == null || !$$6.a($$3.v())) continue;
            $$4.add(cgk2);
            if (!(cgk2 instanceof axg)) continue;
            axg $$7 = (axg)cgk2;
            $$7.cn.d();
        }
        if ($$4.isEmpty()) {
            throw f.create((Object)$$3.K(), (Object)$$2);
        }
        if ($$4.size() == 1) {
            $$0.a(() -> yh.a("commands.item.entity.set.success.single", ((cgk)$$4.getFirst()).R_(), $$3.K()), true);
        } else {
            $$0.a(() -> yh.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
        }
        return $$4.size();
    }

    private static int a(ed $$0, is $$1, int $$2, Collection<? extends cgk> $$3, int $$4) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$1, $$2));
    }

    private static int a(ed $$0, is $$1, int $$2, Collection<? extends cgk> $$3, int $$4, jd<fpr> $$5) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$5, apj.a($$0, $$1, $$2)));
    }

    private static int a(ed $$0, is $$1, int $$2, is $$3, int $$4) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$1, $$2));
    }

    private static int a(ed $$0, is $$1, int $$2, is $$3, int $$4, jd<fpr> $$5) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$5, apj.a($$0, $$1, $$2)));
    }

    private static int a(ed $$0, cgk $$1, int $$2, is $$3, int $$4) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$1, $$2));
    }

    private static int a(ed $$0, cgk $$1, int $$2, is $$3, int $$4, jd<fpr> $$5) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$5, apj.a($$1, $$2)));
    }

    private static int a(ed $$0, cgk $$1, int $$2, Collection<? extends cgk> $$3, int $$4) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$1, $$2));
    }

    private static int a(ed $$0, cgk $$1, int $$2, Collection<? extends cgk> $$3, int $$4, jd<fpr> $$5) throws CommandSyntaxException {
        return apj.a($$0, $$3, $$4, apj.a($$0, $$5, apj.a($$1, $$2)));
    }

    private static dlt a(ed $$0, jd<fpr> $$1, dlt $$2) {
        axf $$3 = $$0.f();
        fod $$4 = new fod.a($$3).a(fqx.h, $$0.e()).b(fqx.a, $$0.g()).a(fqw.d);
        fnz $$5 = new fnz.b($$4).a(Optional.empty());
        $$5.b(fnz.a($$1.a()));
        dlt $$6 = (dlt)$$1.a().apply($$2, $$5);
        $$6.f($$6.k());
        return $$6;
    }

    private static dlt a(cid $$0, int $$1) throws CommandSyntaxException {
        cic $$2 = $$0.a_($$1);
        if ($$2 == null) {
            throw d.create((Object)$$1);
        }
        return $$2.a().v();
    }

    private static dlt a(ed $$0, is $$1, int $$2) throws CommandSyntaxException {
        ccv $$3 = apj.a($$0, $$1, b);
        return apj.a($$3, $$2);
    }
}

