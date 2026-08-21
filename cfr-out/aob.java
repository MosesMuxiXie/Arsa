/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aob {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (yh)$$0);
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.advancement.criterionNotFound", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("advancement").requires(ee.a(ee.d))).then(ee.b("grant").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targets", eq.d()).then(ee.b("only").then(((RequiredArgumentBuilder)ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.a)))).then(ee.a("criterion", StringArgumentType.greedyString()).suggests(($$0, $$1) -> ei.b(ff.e((CommandContext<ed>)$$0, "advancement").b().e().keySet(), $$1)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, ff.e((CommandContext<ed>)$$0, "advancement"), StringArgumentType.getString((CommandContext)$$0, (String)"criterion"))))))).then(ee.b("from").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.c)))))).then(ee.b("until").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.d)))))).then(ee.b("through").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.b)))))).then(ee.b("everything").executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.a, ((ed)$$0.getSource()).m().aB().b(), false)))))).then(ee.b("revoke").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targets", eq.d()).then(ee.b("only").then(((RequiredArgumentBuilder)ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.a)))).then(ee.a("criterion", StringArgumentType.greedyString()).suggests(($$0, $$1) -> ei.b(ff.e((CommandContext<ed>)$$0, "advancement").b().e().keySet(), $$1)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, ff.e((CommandContext<ed>)$$0, "advancement"), StringArgumentType.getString((CommandContext)$$0, (String)"criterion"))))))).then(ee.b("from").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.c)))))).then(ee.b("until").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.d)))))).then(ee.b("through").then(ee.a("advancement", ff.a(mj.bJ)).executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, aob.a((CommandContext<ed>)$$0, ff.e((CommandContext<ed>)$$0, "advancement"), aob$b.b)))))).then(ee.b("everything").executes($$0 -> aob.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), aob$a.b, ((ed)$$0.getSource()).m().aB().b()))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, a $$2, Collection<ac> $$3) throws CommandSyntaxException {
        return aob.a($$0, $$1, $$2, $$3, true);
    }

    private static int a(ed $$0, Collection<axg> $$1, a $$2, Collection<ac> $$3, boolean $$4) throws CommandSyntaxException {
        int $$5 = 0;
        for (axg $$6 : $$1) {
            $$5 += $$2.a($$6, $$3, $$4);
        }
        if ($$5 == 0) {
            if ($$3.size() == 1) {
                if ($$1.size() == 1) {
                    throw a.create((Object)yh.a($$2.a() + ".one.to.one.failure", ab.a($$3.iterator().next()), $$1.iterator().next().R_()));
                }
                throw a.create((Object)yh.a($$2.a() + ".one.to.many.failure", ab.a($$3.iterator().next()), $$1.size()));
            }
            if ($$1.size() == 1) {
                throw a.create((Object)yh.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().R_()));
            }
            throw a.create((Object)yh.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
        }
        if ($$3.size() == 1) {
            if ($$1.size() == 1) {
                $$0.a(() -> yh.a($$2.a() + ".one.to.one.success", ab.a((ac)$$3.iterator().next()), ((axg)$$1.iterator().next()).R_()), true);
            } else {
                $$0.a(() -> yh.a($$2.a() + ".one.to.many.success", ab.a((ac)$$3.iterator().next()), $$1.size()), true);
            }
        } else if ($$1.size() == 1) {
            $$0.a(() -> yh.a($$2.a() + ".many.to.one.success", $$3.size(), ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
        }
        return $$5;
    }

    private static int a(ed $$0, Collection<axg> $$1, a $$2, ac $$3, String $$4) throws CommandSyntaxException {
        int $$5 = 0;
        ab $$6 = $$3.b();
        if (!$$6.e().containsKey($$4)) {
            throw b.create((Object)ab.a($$3), (Object)$$4);
        }
        for (axg $$7 : $$1) {
            if (!$$2.a($$7, $$3, $$4)) continue;
            ++$$5;
        }
        if ($$5 == 0) {
            if ($$1.size() == 1) {
                throw a.create((Object)yh.a($$2.a() + ".criterion.to.one.failure", new Object[]{$$4, ab.a($$3), $$1.iterator().next().R_()}));
            }
            throw a.create((Object)yh.a($$2.a() + ".criterion.to.many.failure", new Object[]{$$4, ab.a($$3), $$1.size()}));
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a($$2.a() + ".criterion.to.one.success", new Object[]{$$4, ab.a($$3), ((axg)$$1.iterator().next()).R_()}), true);
        } else {
            $$0.a(() -> yh.a($$2.a() + ".criterion.to.many.success", new Object[]{$$4, ab.a($$3), $$1.size()}), true);
        }
        return $$5;
    }

    private static List<ac> a(CommandContext<ed> $$0, ac $$1, b $$2) {
        ah $$3 = ((ed)$$0.getSource()).m().aB().a();
        ad $$4 = $$3.a($$1);
        if ($$4 == null) {
            return List.of($$1);
        }
        ArrayList<ac> $$5 = new ArrayList<ac>();
        if ($$2.f) {
            for (ad $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
                $$5.add($$6.b());
            }
        }
        $$5.add($$1);
        if ($$2.g) {
            aob.a($$4, $$5);
        }
        return $$5;
    }

    private static void a(ad $$0, List<ac> $$1) {
        for (ad $$2 : $$0.e()) {
            $$1.add($$2.b());
            aob.a($$2, $$1);
        }
    }

    static abstract sealed class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("grant"){

            @Override
            protected boolean a(axg $$0, ac $$1) {
                ae $$2 = $$0.U().b($$1);
                if ($$2.a()) {
                    return false;
                }
                for (String $$3 : $$2.e()) {
                    $$0.U().a($$1, $$3);
                }
                return true;
            }

            @Override
            protected boolean a(axg $$0, ac $$1, String $$2) {
                return $$0.U().a($$1, $$2);
            }
        };
        public static final /* enum */ a b = new a("revoke"){

            @Override
            protected boolean a(axg $$0, ac $$1) {
                ae $$2 = $$0.U().b($$1);
                if (!$$2.b()) {
                    return false;
                }
                for (String $$3 : $$2.f()) {
                    $$0.U().b($$1, $$3);
                }
                return true;
            }

            @Override
            protected boolean a(axg $$0, ac $$1, String $$2) {
                return $$0.U().b($$1, $$2);
            }
        };
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.c = "commands.advancement." + $$0;
        }

        public int a(axg $$0, Iterable<ac> $$1, boolean $$2) {
            int $$3 = 0;
            if (!$$2) {
                $$0.U().a($$0, true);
            }
            for (ac $$4 : $$1) {
                if (!this.a($$0, $$4)) continue;
                ++$$3;
            }
            if (!$$2) {
                $$0.U().a($$0, false);
            }
            return $$3;
        }

        protected abstract boolean a(axg var1, ac var2);

        protected abstract boolean a(axg var1, ac var2, String var3);

        protected String a() {
            return this.c;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = aob$a.b();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(false, false);
        public static final /* enum */ b b = new b(true, true);
        public static final /* enum */ b c = new b(false, true);
        public static final /* enum */ b d = new b(true, false);
        public static final /* enum */ b e = new b(true, true);
        final boolean f;
        final boolean g;
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(boolean $$0, boolean $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            h = aob$b.a();
        }
    }
}

