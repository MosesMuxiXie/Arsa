/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class aoj {
    private static final Logger b = LogUtils.getLogger();
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.clone.overlap"));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.clone.toobig", $$0, $$1));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.clone.failed"));
    public static final Predicate<eol> a = $$0 -> !$$0.a().l();

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("clone").requires(ee.a(ee.d))).then(aoj.a($$1, (CommandContext<ed> $$0) -> ((ed)$$0.getSource()).f()))).then(ee.b("from").then(ee.a("sourceDimension", eo.a()).then(aoj.a($$1, (CommandContext<ed> $$0) -> eo.a((CommandContext<ed>)$$0, "sourceDimension"))))));
    }

    private static ArgumentBuilder<ed, ?> a(dz $$02, api<CommandContext<ed>, axf> $$1) {
        return ee.a("begin", gc.a()).then(((RequiredArgumentBuilder)ee.a("end", gc.a()).then(aoj.a($$02, $$1, (CommandContext<ed> $$0) -> ((ed)$$0.getSource()).f()))).then(ee.b("to").then(ee.a("targetDimension", eo.a()).then(aoj.a($$02, $$1, (CommandContext<ed> $$0) -> eo.a((CommandContext<ed>)$$0, "targetDimension"))))));
    }

    private static c a(CommandContext<ed> $$0, axf $$1, String $$2) throws CommandSyntaxException {
        is $$3 = gc.a($$0, $$1, $$2);
        return new c($$1, $$3);
    }

    private static ArgumentBuilder<ed, ?> a(dz $$0, api<CommandContext<ed>, axf> $$12, api<CommandContext<ed>, axf> $$2) {
        api<CommandContext<ed>, c> $$3 = $$1 -> aoj.a((CommandContext<ed>)$$1, (axf)$$12.apply((CommandContext<ed>)$$1), "begin");
        api<CommandContext<ed>, c> $$4 = $$1 -> aoj.a((CommandContext<ed>)$$1, (axf)$$12.apply((CommandContext<ed>)$$1), "end");
        api<CommandContext<ed>, c> $$5 = $$1 -> aoj.a((CommandContext<ed>)$$1, (axf)$$2.apply((CommandContext<ed>)$$1), "destination");
        return aoj.a($$0, $$3, $$4, $$5, false, ee.a("destination", gc.a())).then(aoj.a($$0, $$3, $$4, $$5, true, ee.b("strict")));
    }

    private static ArgumentBuilder<ed, ?> a(dz $$03, api<CommandContext<ed>, c> $$1, api<CommandContext<ed>, c> $$2, api<CommandContext<ed>, c> $$3, boolean $$42, ArgumentBuilder<ed, ?> $$5) {
        return $$5.executes($$4 -> aoj.a((ed)$$4.getSource(), (c)$$1.apply($$4), (c)$$2.apply($$4), (c)$$3.apply($$4), $$0 -> true, aoj$d.c, $$42)).then(aoj.a($$1, $$2, $$3, (CommandContext<ed> $$02) -> $$0 -> true, $$42, ee.b("replace"))).then(aoj.a($$1, $$2, $$3, (CommandContext<ed> $$0) -> a, $$42, ee.b("masked"))).then(ee.b("filtered").then(aoj.a($$1, $$2, $$3, (CommandContext<ed> $$0) -> fy.a((CommandContext<ed>)$$0, "filter"), $$42, ee.a("filter", fy.a($$03)))));
    }

    private static ArgumentBuilder<ed, ?> a(api<CommandContext<ed>, c> $$0, api<CommandContext<ed>, c> $$1, api<CommandContext<ed>, c> $$2, api<CommandContext<ed>, Predicate<eol>> $$3, boolean $$4, ArgumentBuilder<ed, ?> $$52) {
        return $$52.executes($$5 -> aoj.a((ed)$$5.getSource(), (c)$$0.apply($$5), (c)$$1.apply($$5), (c)$$2.apply($$5), (Predicate)$$3.apply($$5), aoj$d.c, $$4)).then(ee.b("force").executes($$5 -> aoj.a((ed)$$5.getSource(), (c)$$0.apply($$5), (c)$$1.apply($$5), (c)$$2.apply($$5), (Predicate)$$3.apply($$5), aoj$d.a, $$4))).then(ee.b("move").executes($$5 -> aoj.a((ed)$$5.getSource(), (c)$$0.apply($$5), (c)$$1.apply($$5), (c)$$2.apply($$5), (Predicate)$$3.apply($$5), aoj$d.b, $$4))).then(ee.b("normal").executes($$5 -> aoj.a((ed)$$5.getSource(), (c)$$0.apply($$5), (c)$$1.apply($$5), (c)$$2.apply($$5), (Predicate)$$3.apply($$5), aoj$d.c, $$4)));
    }

    private static int a(ed $$0, c $$1, c $$2, c $$3, Predicate<eol> $$4, d $$5, boolean $$6) throws CommandSyntaxException {
        int $$16;
        is $$7 = $$1.b();
        is $$8 = $$2.b();
        ffg $$9 = ffg.a((jy)$$7, (jy)$$8);
        is $$10 = $$3.b();
        is $$11 = $$10.a($$9.c());
        ffg $$12 = ffg.a((jy)$$10, (jy)$$11);
        axf $$13 = $$1.a();
        axf $$14 = $$3.a();
        if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
            throw c.create();
        }
        int $$15 = $$9.d() * $$9.e() * $$9.f();
        if ($$15 > ($$16 = $$0.f().U().a(eua.x).intValue())) {
            throw d.create((Object)$$16, (Object)$$15);
        }
        if (!$$13.a($$7, $$8) || !$$14.a($$10, $$11)) {
            throw gc.a.create();
        }
        if ($$14.ar()) {
            throw e.create();
        }
        ArrayList $$17 = Lists.newArrayList();
        ArrayList $$18 = Lists.newArrayList();
        ArrayList $$19 = Lists.newArrayList();
        LinkedList $$20 = Lists.newLinkedList();
        int $$21 = 0;
        try (bgp.j $$22 = new bgp.j(b);){
            is $$23 = new is($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());
            for (int $$24 = $$9.j(); $$24 <= $$9.m(); ++$$24) {
                for (int $$25 = $$9.i(); $$25 <= $$9.l(); ++$$25) {
                    for (int $$26 = $$9.h(); $$26 <= $$9.k(); ++$$26) {
                        is $$27 = new is($$26, $$25, $$24);
                        is $$28 = $$27.a($$23);
                        eol $$29 = new eol($$13, $$27, false);
                        eoh $$30 = $$29.a();
                        if (!$$4.test($$29)) continue;
                        elb $$31 = $$13.c_($$27);
                        if ($$31 != null) {
                            fnp $$32 = fnp.a($$22.a($$31.v()), $$0.v());
                            $$31.f($$32);
                            a $$33 = new a($$32.b(), $$31.u());
                            $$18.add(new b($$28, $$30, $$33, $$14.a_($$28)));
                            $$20.addLast($$27);
                            continue;
                        }
                        if ($$30.s() || $$30.m($$13, $$27)) {
                            $$17.add(new b($$28, $$30, null, $$14.a_($$28)));
                            $$20.addLast($$27);
                            continue;
                        }
                        $$19.add(new b($$28, $$30, null, $$14.a_($$28)));
                        $$20.addFirst($$27);
                    }
                }
            }
            int $$34 = 2 | ($$6 ? 816 : 0);
            if ($$5 == aoj$d.b) {
                for (is $$35 : $$20) {
                    $$13.a($$35, dzs.iO.m(), $$34 | 0x330);
                }
                int $$36 = $$6 ? $$34 : 3;
                for (is $$37 : $$20) {
                    $$13.a($$37, dzs.a.m(), $$36);
                }
            }
            ArrayList $$38 = Lists.newArrayList();
            $$38.addAll($$17);
            $$38.addAll($$18);
            $$38.addAll($$19);
            List $$39 = Lists.reverse((List)$$38);
            for (b $$40 : $$39) {
                $$14.a($$40.a, dzs.iO.m(), $$34 | 0x330);
            }
            for (b $$41 : $$38) {
                if (!$$14.a($$41.a, $$41.b, $$34)) continue;
                ++$$21;
            }
            for (b $$42 : $$18) {
                elb $$43 = $$14.c_($$42.a);
                if ($$42.c != null && $$43 != null) {
                    $$43.c(fno.a($$22.a($$43.v()), (jf.a)$$14.J_(), $$42.c.a));
                    $$43.a($$42.c.b);
                    $$43.e();
                }
                $$14.a($$42.a, $$42.b, $$34);
            }
            if (!$$6) {
                for (b $$44 : $$39) {
                    $$14.a($$44.a, $$44.d);
                }
            }
            $$14.q().a($$13.q(), $$9, $$23);
        }
        if ($$21 == 0) {
            throw e.create();
        }
        int $$45 = $$21;
        $$0.a(() -> yh.a("commands.clone.success", $$45), true);
        return $$21;
    }

    record c(axf a, is b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "dimension;position", "a", "b"}, this, $$0);
        }
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(true);
        public static final /* enum */ d b = new d(true);
        public static final /* enum */ d c = new d(false);
        private final boolean d;
        private static final /* synthetic */ d[] e;

        public static d[] values() {
            return (d[])e.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(boolean $$0) {
            this.d = $$0;
        }

        public boolean a() {
            return this.d;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c};
        }

        static {
            e = aoj$d.b();
        }
    }

    static final class a
    extends Record {
        final uz a;
        final kf b;

        a(uz $$0, kf $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "tag;components", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "tag;components", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "tag;components", "a", "b"}, this, $$0);
        }

        public uz a() {
            return this.a;
        }

        public kf b() {
            return this.b;
        }
    }

    static final class b
    extends Record {
        final is a;
        final eoh b;
        final @Nullable a c;
        final eoh d;

        b(is $$0, eoh $$1, @Nullable a $$2, eoh $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "pos;state;blockEntityInfo;previousStateAtDestination", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "pos;state;blockEntityInfo;previousStateAtDestination", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "pos;state;blockEntityInfo;previousStateAtDestination", "a", "b", "c", "d"}, this, $$0);
        }

        public is a() {
            return this.a;
        }

        public eoh b() {
            return this.b;
        }

        public @Nullable a c() {
            return this.c;
        }

        public eoh d() {
            return this.d;
        }
    }
}

