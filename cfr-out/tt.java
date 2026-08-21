/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;

public class tt {
    public static final int a = 15;
    public static final int b = 250;
    public static final int c = 10;
    public static final int d = 100;
    private static final int e = 250;
    private static final int f = 1024;
    private static final int g = 3;
    private static final int h = 5;
    private static final int i = 5;
    private static final int j = 5;
    private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType((Message)yh.c("commands.test.clear.error.no_tests"));
    private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType((Message)yh.c("commands.test.reset.error.no_tests"));
    private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType((Message)yh.c("commands.test.error.test_instance_not_found"));
    private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType((Message)yh.b("Could not find any structures to export"));
    private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType((Message)yh.c("commands.test.error.no_test_instances"));
    private static final Dynamic3CommandExceptionType p = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2));
    private static final DynamicCommandExceptionType q = new DynamicCommandExceptionType($$0 -> yh.b("commands.test.error.too_large", $$0));

    private static int a(tw $$0) throws CommandSyntaxException {
        tt.a();
        int $$12 = tt.a($$0.b(), tq.a(), $$0).map($$1 -> tt.a($$0.b(), $$1)).toList().size();
        if ($$12 == 0) {
            throw k.create();
        }
        $$0.b().a(() -> yh.a("commands.test.reset.success", $$12), true);
        return $$12;
    }

    private static int b(tw $$0) throws CommandSyntaxException {
        tt.a();
        ed $$12 = $$0.b();
        axf $$2 = $$12.f();
        List $$3 = $$0.findTestPos().flatMap($$1 -> $$2.a((is)$$1, eld.V).stream()).toList();
        for (emz $$4 : $$3) {
            ts.a($$4.d(), $$2);
            $$4.F();
            $$2.b($$4.aD_(), false);
        }
        if ($$3.isEmpty()) {
            throw k.create();
        }
        $$12.a(() -> yh.a("commands.test.clear.success", $$3.size()), true);
        return $$3.size();
    }

    private static int c(tw $$0) throws CommandSyntaxException {
        ed $$1 = $$0.b();
        axf $$2 = $$1.f();
        int $$3 = 0;
        boolean $$4 = true;
        Iterator $$5 = $$0.findTestPos().iterator();
        while ($$5.hasNext()) {
            is $$6 = (is)$$5.next();
            elb elb2 = $$2.c_($$6);
            if (elb2 instanceof emz) {
                emz $$7 = (emz)elb2;
                if (!$$7.c($$1::a)) {
                    $$4 = false;
                }
                ++$$3;
                continue;
            }
            throw m.create();
        }
        if ($$3 == 0) {
            throw n.create();
        }
        String $$8 = "Exported " + $$3 + " structures";
        $$0.b().a(() -> yh.b($$8), true);
        return $$4 ? 0 : 1;
    }

    private static int d(tw $$0) {
        tt.a();
        ed $$1 = $$0.b();
        axf $$2 = $$1.f();
        is $$3 = tt.a($$1);
        List<ta> $$4 = Stream.concat(tt.a($$1, tq.a(), $$0), tt.a($$1, tq.a(), $$0, 0)).toList();
        sp.b();
        ArrayList<st> $$5 = new ArrayList<st>();
        for (ta $$6 : $$4) {
            for (egm $$7 : egm.values()) {
                ArrayList<ta> $$8 = new ArrayList<ta>();
                for (int $$9 = 0; $$9 < 100; ++$$9) {
                    ta $$10 = new ta($$6.w(), $$7, $$2, new tq(1, true));
                    $$10.a($$6.c());
                    $$8.add($$10);
                }
                st $$11 = su.a($$8, $$6.v().d(), $$7.ordinal());
                $$5.add($$11);
            }
        }
        tr $$12 = new tr($$3, 10, true);
        tf $$13 = tf.a.a($$5, $$2).a(su.a(100)).a((tf.c)$$12).a($$12).a().b().c();
        return tt.a($$1, $$13);
    }

    private static int a(tw $$0, tq $$1, int $$2, int $$3) {
        tt.a();
        ed $$4 = $$0.b();
        axf $$5 = $$4.f();
        is $$6 = tt.a($$4);
        List<ta> $$7 = Stream.concat(tt.a($$4, $$1, $$0), tt.a($$4, $$1, $$0, $$2)).toList();
        if ($$7.isEmpty()) {
            $$4.a(() -> yh.c("commands.test.no_tests"), false);
            return 0;
        }
        sp.b();
        $$4.a(() -> yh.a("commands.test.run.running", $$7.size()), false);
        tf $$8 = tf.a.b($$7, $$5).a((tf.c)new tr($$6, $$3, false)).c();
        return tt.a($$4, $$8);
    }

    private static int e(tw $$0) throws CommandSyntaxException {
        $$0.b().a(yh.c("commands.test.locate.started"));
        MutableInt $$1 = new MutableInt(0);
        is $$2 = is.a($$0.b().e());
        $$0.findTestPos().forEach($$3 -> {
            void $$6;
            elb $$4 = $$0.b().f().c_((is)$$3);
            if (!($$4 instanceof emz)) {
                return;
            }
            emz $$5 = (emz)$$4;
            iz $$7 = $$6.w().a(iz.c);
            is $$8 = $$6.aD_().a($$7, 2);
            int $$9 = (int)$$7.g().p();
            String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
            int $$11 = $$2.u() - $$3.u();
            int $$122 = $$2.w() - $$3.w();
            int $$13 = bgj.b(bgj.a((float)($$11 * $$11 + $$122 * $$122)));
            yw $$14 = yk.a(yh.a("chat.coordinates", $$3.u(), $$3.v(), $$3.w())).a($$1 -> $$1.a(l.k).a(new yf.i($$10)).a(new yo.e(yh.c("chat.coordinates.tooltip"))));
            $$0.b().a(() -> yh.a("commands.test.locate.found", $$14, $$13), false);
            $$1.increment();
        });
        int $$32 = $$1.intValue();
        if ($$32 == 0) {
            throw o.create();
        }
        $$0.b().a(() -> yh.a("commands.test.locate.done", $$32), true);
        return $$32;
    }

    private static ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0, api<CommandContext<ed>, tw> $$12, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$2) {
        return $$0.executes($$1 -> tt.a((tw)$$12.apply($$1), tq.a(), 0, 8)).then(((RequiredArgumentBuilder)ee.a("numberOfTimes", IntegerArgumentType.integer((int)0)).executes($$1 -> tt.a((tw)$$12.apply($$1), new tq(IntegerArgumentType.getInteger((CommandContext)$$1, (String)"numberOfTimes"), false), 0, 8))).then($$2.apply(ee.a("untilFailed", BoolArgumentType.bool()).executes($$1 -> tt.a((tw)$$12.apply($$1), new tq(IntegerArgumentType.getInteger((CommandContext)$$1, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)$$1, (String)"untilFailed")), 0, 8)))));
    }

    private static ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$02, api<CommandContext<ed>, tw> $$1) {
        return tt.a($$02, $$1, (ArgumentBuilder<ed, ?> $$0) -> $$0);
    }

    private static ArgumentBuilder<ed, ?> b(ArgumentBuilder<ed, ?> $$0, api<CommandContext<ed>, tw> $$1) {
        return tt.a($$0, $$1, (ArgumentBuilder<ed, ?> $$12) -> $$12.then(((RequiredArgumentBuilder)ee.a("rotationSteps", IntegerArgumentType.integer()).executes($$1 -> tt.a((tw)$$1.apply($$1), new tq(IntegerArgumentType.getInteger((CommandContext)$$1, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)$$1, (String)"untilFailed")), IntegerArgumentType.getInteger((CommandContext)$$1, (String)"rotationSteps"), 8))).then(ee.a("testsPerRow", IntegerArgumentType.integer()).executes($$1 -> tt.a((tw)$$1.apply($$1), new tq(IntegerArgumentType.getInteger((CommandContext)$$1, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)$$1, (String)"untilFailed")), IntegerArgumentType.getInteger((CommandContext)$$1, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)$$1, (String)"testsPerRow"))))));
    }

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        ArgumentBuilder<ed, ?> $$2 = tt.b(ee.a("onlyRequiredTests", BoolArgumentType.bool()), (CommandContext<ed> $$0) -> tw.a().a((CommandContext<ed>)$$0, BoolArgumentType.getBool((CommandContext)$$0, (String)"onlyRequiredTests")));
        LiteralArgumentBuilder $$3 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("test").requires(ee.a(ee.d))).then(ee.b("run").then(tt.b(ee.a("tests", fj.a($$1, mj.bv)), (CommandContext<ed> $$0) -> tw.a().a((CommandContext<ed>)$$0, fj.a((CommandContext<ed>)$$0, "tests")))))).then(ee.b("runmultiple").then(((RequiredArgumentBuilder)ee.a("tests", fj.a($$1, mj.bv)).executes($$0 -> tt.a(tw.a().a((CommandContext<ed>)$$0, fj.a((CommandContext<ed>)$$0, "tests")), tq.a(), 0, 8))).then(ee.a("amount", IntegerArgumentType.integer()).executes($$0 -> tt.a(tw.a().a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amount")).a((CommandContext<ed>)$$0, fj.a((CommandContext<ed>)$$0, "tests")), tq.a(), 0, 8)))))).then(tt.a(ee.b("runthese"), tw.a()::b))).then(tt.a(ee.b("runclosest"), tw.a()::a))).then(tt.a(ee.b("runthat"), tw.a()::c))).then(tt.b(ee.b("runfailed").then($$2), tw.a()::d))).then(ee.b("verify").then(ee.a("tests", fj.a($$1, mj.bv)).executes($$0 -> tt.d(tw.a().a((CommandContext<ed>)$$0, fj.a((CommandContext<ed>)$$0, "tests"))))))).then(ee.b("locate").then(ee.a("tests", fj.a($$1, mj.bv)).executes($$0 -> tt.e(tw.a().a((CommandContext<ed>)$$0, fj.a((CommandContext<ed>)$$0, "tests"))))))).then(ee.b("resetclosest").executes($$0 -> tt.a(tw.a().a((CommandContext<ed>)$$0))))).then(ee.b("resetthese").executes($$0 -> tt.a(tw.a().b((CommandContext<ed>)$$0))))).then(ee.b("resetthat").executes($$0 -> tt.a(tw.a().c((CommandContext<ed>)$$0))))).then(ee.b("clearthat").executes($$0 -> tt.b(tw.a().c((CommandContext<ed>)$$0))))).then(ee.b("clearthese").executes($$0 -> tt.b(tw.a().b((CommandContext<ed>)$$0))))).then(((LiteralArgumentBuilder)ee.b("clearall").executes($$0 -> tt.b(tw.a().a((CommandContext<ed>)$$0, 250)))).then(ee.a("radius", IntegerArgumentType.integer()).executes($$0 -> tt.b(tw.a().a((CommandContext<ed>)$$0, bgj.a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"radius"), 0, 1024))))))).then(ee.b("stop").executes($$0 -> tt.a()))).then(((LiteralArgumentBuilder)ee.b("pos").executes($$0 -> tt.a((ed)$$0.getSource(), "pos"))).then(ee.a("var", StringArgumentType.word()).executes($$0 -> tt.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"var")))))).then(ee.b("create").then(((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(tt::a).executes($$0 -> tt.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), 5, 5, 5))).then(((RequiredArgumentBuilder)ee.a("width", IntegerArgumentType.integer()).executes($$0 -> tt.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width")))).then(ee.a("height", IntegerArgumentType.integer()).then(ee.a("depth", IntegerArgumentType.integer()).executes($$0 -> tt.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"width"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"height"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"depth"))))))));
        if (w.aX) {
            $$3 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(ee.b("export").then(ee.a("test", fe.a($$1, mj.bv)).executes($$0 -> tt.a((ed)$$0.getSource(), fe.a((CommandContext<ed>)$$0, "test", mj.bv)))))).then(ee.b("exportclosest").executes($$0 -> tt.c(tw.a().a((CommandContext<ed>)$$0))))).then(ee.b("exportthese").executes($$0 -> tt.c(tw.a().b((CommandContext<ed>)$$0))))).then(ee.b("exportthat").executes($$0 -> tt.c(tw.a().c((CommandContext<ed>)$$0))));
        }
        $$02.register($$3);
    }

    public static CompletableFuture<Suggestions> a(CommandContext<ed> $$0, SuggestionsBuilder $$1) {
        Stream<String> $$2 = ((ed)$$0.getSource()).v().f(mj.aG).c().map(jd::g);
        return ei.b($$2, $$1);
    }

    private static int a(ed $$0, ta $$1) {
        emz $$2 = $$1.f();
        $$2.a($$0::a);
        return 1;
    }

    private static Stream<ta> a(ed $$0, tq $$1, tz $$22) {
        return $$22.findTestPos().map($$2 -> tt.a($$2, $$0, $$1)).flatMap(Optional::stream);
    }

    private static Stream<ta> a(ed $$0, tq $$12, ty $$2, int $$32) {
        return $$2.findTests().filter($$1 -> tt.a($$0, ((tb)$$1.a()).e())).map($$3 -> new ta((jd.c<tb>)$$3, ts.a($$32), $$0.f(), $$12));
    }

    /*
     * WARNING - void declaration
     */
    private static Optional<ta> a(is $$0, ed $$1, tq $$2) {
        void $$5;
        axf $$3 = $$1.f();
        elb elb2 = $$3.c_($$0);
        if (!(elb2 instanceof emz)) {
            $$1.b(yh.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
            return Optional.empty();
        }
        emz $$4 = (emz)elb2;
        Optional $$6 = $$5.h().flatMap($$1.v().f(mj.bv)::a);
        if ($$6.isEmpty()) {
            $$1.b(yh.a("commands.test.error.non_existant_test", $$5.k()));
            return Optional.empty();
        }
        jd.c $$7 = (jd.c)$$6.get();
        ta $$8 = new ta($$7, $$5.w(), $$3, $$2);
        $$8.a($$0);
        if (!tt.a($$1, $$8.t())) {
            return Optional.empty();
        }
        return Optional.of($$8);
    }

    private static int a(ed $$0, amo $$12, int $$2, int $$3, int $$4) throws CommandSyntaxException {
        if ($$2 > 48 || $$3 > 48 || $$4 > 48) {
            throw q.create((Object)48);
        }
        axf $$5 = $$0.f();
        is $$6 = tt.a($$0);
        emz $$7 = ts.a($$12, $$6, new jy($$2, $$3, $$4), egm.a, $$5);
        is $$8 = $$7.B();
        is $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
        is.d($$8, $$9).forEach($$1 -> $$5.c((is)$$1, dzs.I.m()));
        $$0.a(() -> yh.a("commands.test.create.success", $$7.k()), true);
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(ed $$0, String $$1) throws CommandSyntaxException {
        void $$8;
        axf $$5;
        axg $$2 = $$0.i();
        fti $$3 = (fti)$$2.a(10.0, 1.0f, false);
        is $$4 = $$3.b();
        Optional<is> $$6 = ts.a($$4, 15, $$5 = $$0.f());
        if ($$6.isEmpty()) {
            $$6 = ts.a($$4, 250, $$5);
        }
        if ($$6.isEmpty()) {
            throw p.create((Object)$$4.u(), (Object)$$4.v(), (Object)$$4.w());
        }
        elb elb2 = $$5.c_($$6.get());
        if (!(elb2 instanceof emz)) {
            throw m.create();
        }
        emz $$7 = (emz)elb2;
        is $$9 = $$8.B();
        is $$10 = $$4.b($$9);
        String $$11 = $$10.u() + ", " + $$10.v() + ", " + $$10.w();
        String $$12 = $$8.k().getString();
        yw $$13 = yh.a("commands.test.coordinates", $$10.u(), $$10.v(), $$10.w()).b(zf.a.a(true).a(l.k).a(new yo.e(yh.c("commands.test.coordinates.copy"))).a(new yf.c("final BlockPos " + $$1 + " = new BlockPos(" + $$11 + ");")));
        $$0.a(() -> yh.a("commands.test.relative_position", new Object[]{$$12, $$13}), false);
        $$2.g.b(new aen($$4, $$10));
        return 1;
    }

    private static int a() {
        ti.a.a();
        return 1;
    }

    public static int a(ed $$02, tf $$1) {
        $$1.a(new a($$02));
        to $$2 = new to($$1.a());
        $$2.a(new b($$02, $$2));
        $$2.a($$0 -> sp.a($$0.w()));
        $$1.b();
        return 1;
    }

    private static int a(ed $$0, jd<tb> $$1) {
        if (!emz.a($$0.f(), $$1.a().e(), $$0::a)) {
            return 0;
        }
        return 1;
    }

    private static boolean a(ed $$0, amo $$1) {
        if ($$0.f().u().b($$1).isEmpty()) {
            $$0.b(yh.a("commands.test.error.structure_not_found", yh.a($$1)));
            return false;
        }
        return true;
    }

    private static is a(ed $$0) {
        is $$1 = is.a($$0.e());
        int $$2 = $$0.f().a(euq.a.b, $$1).v();
        return new is($$1.u(), $$2, $$1.w() + 3);
    }

    record a(ed a) implements sv
    {
        @Override
        public void a(st $$0) {
            this.a.a(() -> yh.a("commands.test.batch.starting", new Object[]{$$0.c().g(), $$0.a()}), true);
        }

        @Override
        public void b(st $$0) {
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "source", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "source", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "source", "a"}, this, $$0);
        }
    }

    public record b(ed a, to b) implements td
    {
        @Override
        public void a(ta $$0) {
        }

        @Override
        public void a(ta $$0, tf $$1) {
            this.c();
        }

        @Override
        public void b(ta $$0, tf $$1) {
            this.c();
        }

        @Override
        public void a(ta $$0, ta $$1, tf $$2) {
            this.b.a($$1);
        }

        private void c() {
            if (this.b.i()) {
                this.a.a(() -> yh.a("commands.test.summary", this.b.h()).a(l.p), true);
                if (this.b.d()) {
                    this.a.b(yh.a("commands.test.summary.failed", this.b.a()));
                } else {
                    this.a.a(() -> yh.c("commands.test.summary.all_required_passed").a(l.k), true);
                }
                if (this.b.e()) {
                    this.a.a(yh.a("commands.test.summary.optional_failed", this.b.b()));
                }
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "source;tracker", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "source;tracker", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "source;tracker", "a", "b"}, this, $$0);
        }
    }
}

