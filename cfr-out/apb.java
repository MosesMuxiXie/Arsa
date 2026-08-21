/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class apb {
    private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.fill.toobig", $$0, $$1));
    static final fx b = new fx(dzs.a.m(), Collections.emptySet(), null);
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.fill.failed"));

    public static void a(CommandDispatcher<ed> $$03, dz $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("fill").requires(ee.a(ee.d))).then(ee.a("from", gc.a()).then(ee.a("to", gc.a()).then(apb.a($$1, ee.a("block", fz.a($$1)), (CommandContext<ed> $$0) -> gc.a((CommandContext<ed>)$$0, "from"), (CommandContext<ed> $$0) -> gc.a((CommandContext<ed>)$$0, "to"), (CommandContext<ed> $$0) -> fz.a((CommandContext<ed>)$$0, "block"), $$0 -> null).then(((LiteralArgumentBuilder)ee.b("replace").executes($$0 -> apb.a((ed)$$0.getSource(), ffg.a((jy)gc.a((CommandContext<ed>)$$0, "from"), (jy)gc.a((CommandContext<ed>)$$0, "to")), fz.a((CommandContext<ed>)$$0, "block"), d.a, null, false))).then(apb.a($$1, ee.a("filter", fy.a($$1)), (CommandContext<ed> $$0) -> gc.a((CommandContext<ed>)$$0, "from"), (CommandContext<ed> $$0) -> gc.a((CommandContext<ed>)$$0, "to"), (CommandContext<ed> $$0) -> fz.a((CommandContext<ed>)$$0, "block"), $$0 -> fy.a((CommandContext<ed>)$$0, "filter")))).then(ee.b("keep").executes($$02 -> apb.a((ed)$$02.getSource(), ffg.a((jy)gc.a((CommandContext<ed>)$$02, "from"), (jy)gc.a((CommandContext<ed>)$$02, "to")), fz.a((CommandContext<ed>)$$02, "block"), d.a, (eol $$0) -> $$0.c().A($$0.d()), false)))))));
    }

    private static ArgumentBuilder<ed, ?> a(dz $$0, ArgumentBuilder<ed, ?> $$1, api<CommandContext<ed>, is> $$2, api<CommandContext<ed>, is> $$3, api<CommandContext<ed>, fx> $$42, e<CommandContext<ed>, Predicate<eol>> $$5) {
        return $$1.executes($$4 -> apb.a((ed)$$4.getSource(), ffg.a((jy)$$2.apply($$4), (jy)$$3.apply($$4)), (fx)$$42.apply($$4), d.a, (Predicate)$$5.apply($$4), false)).then(ee.b("outline").executes($$4 -> apb.a((ed)$$4.getSource(), ffg.a((jy)$$2.apply($$4), (jy)$$3.apply($$4)), (fx)$$42.apply($$4), d.b, (Predicate)$$5.apply($$4), false))).then(ee.b("hollow").executes($$4 -> apb.a((ed)$$4.getSource(), ffg.a((jy)$$2.apply($$4), (jy)$$3.apply($$4)), (fx)$$42.apply($$4), d.c, (Predicate)$$5.apply($$4), false))).then(ee.b("destroy").executes($$4 -> apb.a((ed)$$4.getSource(), ffg.a((jy)$$2.apply($$4), (jy)$$3.apply($$4)), (fx)$$42.apply($$4), d.d, (Predicate)$$5.apply($$4), false))).then(ee.b("strict").executes($$4 -> apb.a((ed)$$4.getSource(), ffg.a((jy)$$2.apply($$4), (jy)$$3.apply($$4)), (fx)$$42.apply($$4), d.a, (Predicate)$$5.apply($$4), true)));
    }

    private static int a(ed $$0, ffg $$1, fx $$2, d $$3, @Nullable Predicate<eol> $$4, boolean $$5) throws CommandSyntaxException {
        final class A
        extends Record {
            final is a;
            final eoh b;

            A(is $$0, eoh $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "pos;oldState", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "pos;oldState", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "pos;oldState", "a", "b"}, this, $$0);
            }

            public is a() {
                return this.a;
            }

            public eoh b() {
                return this.b;
            }
        }
        int $$7;
        int $$6 = $$1.d() * $$1.e() * $$1.f();
        if ($$6 > ($$7 = $$0.f().U().a(eua.x).intValue())) {
            throw a.create((Object)$$7, (Object)$$6);
        }
        ArrayList $$8 = Lists.newArrayList();
        axf $$9 = $$0.f();
        if ($$9.ar()) {
            throw c.create();
        }
        int $$10 = 0;
        for (is $$11 : is.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            fx $$14;
            if ($$4 != null && !$$4.test(new eol($$9, $$11, true))) continue;
            eoh $$12 = $$9.a_($$11);
            boolean $$13 = false;
            if ($$3.f.affect($$9, $$11)) {
                $$13 = true;
            }
            if (($$14 = $$3.e.filter($$1, $$11, $$2, $$9)) == null) {
                if (!$$13) continue;
                ++$$10;
                continue;
            }
            if (!$$14.a($$9, $$11, 2 | ($$5 ? 816 : 256))) {
                if (!$$13) continue;
                ++$$10;
                continue;
            }
            if (!$$5) {
                $$8.add(new A($$11.j(), $$12));
            }
            ++$$10;
        }
        for (A $$15 : $$8) {
            $$9.a($$15.a, $$15.b);
        }
        if ($$10 == 0) {
            throw c.create();
        }
        int $$16 = $$10;
        $$0.a(() -> yh.a("commands.fill.success", $$16), true);
        return $$10;
    }

    @FunctionalInterface
    static interface e<T, R> {
        public @Nullable R apply(T var1) throws CommandSyntaxException;
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(apb$b.a, apb$c.a);
        public static final /* enum */ d b = new d(apb$b.a, ($$0, $$1, $$2, $$3) -> {
            if ($$1.u() == $$0.h() || $$1.u() == $$0.k() || $$1.v() == $$0.i() || $$1.v() == $$0.l() || $$1.w() == $$0.j() || $$1.w() == $$0.m()) {
                return $$2;
            }
            return null;
        });
        public static final /* enum */ d c = new d(apb$b.a, ($$0, $$1, $$2, $$3) -> {
            if ($$1.u() == $$0.h() || $$1.u() == $$0.k() || $$1.v() == $$0.i() || $$1.v() == $$0.l() || $$1.w() == $$0.j() || $$1.w() == $$0.m()) {
                return $$2;
            }
            return b;
        });
        public static final /* enum */ d d = new d(($$0, $$1) -> $$0.b($$1, true), apb$c.a);
        public final c e;
        public final b f;
        private static final /* synthetic */ d[] g;

        public static d[] values() {
            return (d[])g.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(b $$0, c $$1) {
            this.f = $$0;
            this.e = $$1;
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c, d};
        }

        static {
            g = apb$d.a();
        }
    }

    @FunctionalInterface
    public static interface b {
        public static final b a = ($$0, $$1) -> false;

        public boolean affect(axf var1, is var2);
    }

    @FunctionalInterface
    public static interface c {
        public static final c a = ($$0, $$1, $$2, $$3) -> $$2;

        public @Nullable fx filter(ffg var1, is var2, fx var3, axf var4);
    }
}

