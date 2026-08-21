/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ee {
    public static final String a = "/";
    private static final ThreadLocal<@Nullable hg<ed>> g = new ThreadLocal();
    private static final Logger h = LogUtils.getLogger();
    public static final bbj b = bbj.a.b;
    public static final bbj c = new bbj.b(bbr.a);
    public static final bbj d = new bbj.b(bbr.b);
    public static final bbj e = new bbj.b(bbr.c);
    public static final bbj f = new bbj.b(bbr.d);
    private static final adt.e<ed> i = new adt.e<ed>(){
        private final ed a = ee.a(bbn.g);

        @Override
        public @Nullable amo a(ArgumentCommandNode<ed, ?> $$0) {
            SuggestionProvider $$1 = $$0.getCustomSuggestions();
            return $$1 != null ? ig.b($$1) : null;
        }

        @Override
        public boolean a(CommandNode<ed> $$0) {
            return $$0.getCommand() != null;
        }

        @Override
        public boolean b(CommandNode<ed> $$0) {
            Predicate $$1 = $$0.getRequirement();
            return !$$1.test(this.a);
        }
    };
    private final CommandDispatcher<ed> j = new CommandDispatcher();

    public ee(a $$0, dz $$1) {
        aob.a(this.j);
        aoc.a(this.j, $$1);
        aox.a(this.j, $$1);
        aog.a(this.j, $$1);
        aoi.a(this.j, $$1);
        aoj.a(this.j, $$1);
        aok.a(this.j, $$1);
        ars.a(this.j);
        aol.a(this.j, $$1);
        aon.a(this.j);
        aor.a(this.j);
        aos.a(this.j, $$1);
        aot.a(this.j);
        aou.a(this.j, $$1);
        aov.a(this.j);
        aow.a(this.j, $$1);
        aoy.a(this.j);
        apb.a(this.j, $$1);
        apa.a(this.j, $$1);
        apc.a(this.j);
        apd.a(this.j);
        ape.a(this.j);
        apf.a(this.j, $$1);
        apg.a(this.j, $$1);
        aph.a(this.j);
        apj.a(this.j, $$1);
        apl.a(this.j);
        apm.a(this.j);
        apn.a(this.j);
        apo.a(this.j, $$1);
        apq.a(this.j, $$1);
        apr.a(this.j);
        apv.a(this.j, $$1);
        apx.a(this.j);
        apy.a(this.j);
        aqb.a(this.j);
        aqd.a(this.j);
        aqc.a(this.j);
        aoz.a(this.j);
        aqe.a(this.j);
        aqf.a(this.j);
        aqg.a(this.j);
        aqk.a(this.j);
        aql.a(this.j);
        aqm.a(this.j, $$1);
        aqn.a(this.j, $$0 != ee$a.c);
        ark.a(this.j, $$0 != ee$a.c);
        aqp.a(this.j, $$1);
        aqr.a(this.j);
        aqs.a(this.j);
        aqu.a(this.j);
        aqv.a(this.j);
        aqx.a(this.j);
        aqy.a(this.j);
        aqz.a(this.j, $$1);
        ara.a(this.j);
        arb.a(this.j, $$1);
        arc.a(this.j);
        ard.a(this.j);
        are.a(this.j, $$1);
        tt.a(this.j, $$1);
        arf.a(this.j);
        arg.a(this.j);
        arh.a(this.j, $$1);
        arj.a(this.j);
        arm.a(this.j, $$1);
        arn.a(this.j);
        arp.a(this.j);
        if (bzu.f.d()) {
            apk.a(this.j);
        }
        if (w.an) {
            aoh.a(this.j);
        }
        if (w.ap || w.aX) {
            aqa.a(this.j, $$1);
            aoq.a(this.j);
            aop.a(this.j);
            arl.a(this.j);
            aqt.a(this.j);
            aqo.a(this.j);
            if ($$0.e) {
                aoo.a(this.j, $$1);
            }
        }
        if ($$0.e) {
            aod.a(this.j);
            aoe.a(this.j);
            aof.a(this.j);
            aom.a(this.j);
            aps.a(this.j);
            apt.a(this.j);
            apu.a(this.j);
            apw.a(this.j);
            aqh.a(this.j);
            aqi.a(this.j);
            aqj.a(this.j);
            aqq.a(this.j);
            aqw.a(this.j);
            ari.a(this.j);
            aro.a(this.j);
        }
        if ($$0.d) {
            apz.a(this.j);
        }
        this.j.setConsumer(ef.b_());
    }

    public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
        CommandContextBuilder $$2 = $$0.getContext();
        CommandContextBuilder $$3 = $$2.withSource($$1.apply($$2.getSource()));
        return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
    }

    public void a(ed $$0, String $$1) {
        $$1 = ee.a($$1);
        this.a((ParseResults<ed>)this.j.parse($$1, (Object)$$0), $$1);
    }

    public static String a(String $$0) {
        return $$0.startsWith(a) ? $$0.substring(1) : $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ParseResults<ed> $$0, String $$12) {
        ed $$2 = (ed)$$0.getContext().getSource();
        bzl.a().a(() -> a + $$12);
        ContextChain<ed> $$32 = ee.a($$0, $$12, $$2);
        try {
            if ($$32 != null) {
                ee.a($$2, (hg<ed> $$3) -> hg.a($$3, $$12, $$32, $$2, ea.a));
            }
        }
        catch (Exception $$4) {
            yw $$5 = yh.b($$4.getMessage() == null ? $$4.getClass().getName() : $$4.getMessage());
            if (h.isDebugEnabled()) {
                h.error("Command exception: /{}", (Object)$$12, (Object)$$4);
                StackTraceElement[] $$6 = $$4.getStackTrace();
                for (int $$7 = 0; $$7 < Math.min($$6.length, 3); ++$$7) {
                    $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
                }
            }
            $$2.b(yh.c("command.failed").a($$1 -> $$1.a(new yo.e($$5))));
            if (w.ao || w.aX) {
                $$2.b(yh.b(bhs.c($$4)));
                h.error("'/{}' threw an exception", (Object)$$12, (Object)$$4);
            }
        }
        finally {
            bzl.a().c();
        }
    }

    private static @Nullable ContextChain<ed> a(ParseResults<ed> $$0, String $$12, ed $$2) {
        try {
            ee.a($$0);
            return (ContextChain)ContextChain.tryFlatten((CommandContext)$$0.getContext().build($$12)).orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
        }
        catch (CommandSyntaxException $$3) {
            $$2.b(yk.a($$3.getRawMessage()));
            if ($$3.getInput() != null && $$3.getCursor() >= 0) {
                int $$4 = Math.min($$3.getInput().length(), $$3.getCursor());
                yw $$5 = yh.i().a(l.h).a($$1 -> $$1.a(new yf.i(a + $$12)));
                if ($$4 > 10) {
                    $$5.b(yg.w);
                }
                $$5.f($$3.getInput().substring(Math.max(0, $$4 - 10), $$4));
                if ($$4 < $$3.getInput().length()) {
                    yw $$6 = yh.b($$3.getInput().substring($$4)).a(l.m, l.t);
                    $$5.b($$6);
                }
                $$5.b(yh.c("command.context.here").a(l.m, l.u));
                $$2.b($$5);
            }
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ed $$0, Consumer<hg<ed>> $$1) {
        block9: {
            boolean $$3;
            hg<ed> $$2 = g.get();
            boolean bl2 = $$3 = $$2 == null;
            if ($$3) {
                eua $$4 = $$0.f().U();
                int $$5 = Math.max(1, $$4.a(eua.z));
                int $$6 = $$4.a(eua.y);
                try (hg $$7 = new hg($$5, $$6, bzl.a());){
                    g.set($$7);
                    $$1.accept($$7);
                    $$7.a();
                    break block9;
                }
                finally {
                    g.set(null);
                }
            }
            $$1.accept($$2);
        }
    }

    public void a(axg $$0) {
        HashMap $$1 = new HashMap();
        RootCommandNode $$2 = new RootCommandNode();
        $$1.put((CommandNode)this.j.getRoot(), (CommandNode)$$2);
        ee.a(this.j.getRoot(), $$2, $$0.C(), $$1);
        $$0.g.b(new adt($$2, i));
    }

    private static <S> void a(CommandNode<S> $$0, CommandNode<S> $$1, S $$2, Map<CommandNode<S>, CommandNode<S>> $$3) {
        for (CommandNode $$4 : $$0.getChildren()) {
            if (!$$4.canUse($$2)) continue;
            ArgumentBuilder $$5 = $$4.createBuilder();
            if ($$5.getRedirect() != null) {
                $$5.redirect($$3.get($$5.getRedirect()));
            }
            CommandNode $$6 = $$5.build();
            $$3.put($$4, $$6);
            $$1.addChild($$6);
            if ($$4.getChildren().isEmpty()) continue;
            ee.a($$4, $$6, $$2, $$3);
        }
    }

    public static LiteralArgumentBuilder<ed> b(String $$0) {
        return LiteralArgumentBuilder.literal((String)$$0);
    }

    public static <T> RequiredArgumentBuilder<ed, T> a(String $$0, ArgumentType<T> $$1) {
        return RequiredArgumentBuilder.argument((String)$$0, $$1);
    }

    public static Predicate<String> a(b $$0) {
        return $$1 -> {
            try {
                $$0.parse(new StringReader($$1));
                return true;
            }
            catch (CommandSyntaxException $$2) {
                return false;
            }
        };
    }

    public CommandDispatcher<ed> a() {
        return this.j;
    }

    public static <S> void a(ParseResults<S> $$0) throws CommandSyntaxException {
        CommandSyntaxException $$1 = ee.b($$0);
        if ($$1 != null) {
            throw $$1;
        }
    }

    public static <S> @Nullable CommandSyntaxException b(ParseResults<S> $$0) {
        if (!$$0.getReader().canRead()) {
            return null;
        }
        if ($$0.getExceptions().size() == 1) {
            return (CommandSyntaxException)((Object)$$0.getExceptions().values().iterator().next());
        }
        if ($$0.getContext().getRange().isEmpty()) {
            return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader());
        }
        return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext($$0.getReader());
    }

    public static dz a(final jf.a $$0) {
        return new dz(){

            @Override
            public dgz a() {
                return dhb.e.a();
            }

            @Override
            public Stream<amt<? extends jq<?>>> b() {
                return $$0.b();
            }

            public <T> Optional<jf.b<T>> a(amt<? extends jq<? extends T>> $$02) {
                return $$0.a($$02).map(this::a);
            }

            private <T> jf.b.a<T> a(final jf.b<T> $$02) {
                return new jf.b.a<T>(this){

                    @Override
                    public jf.b<T> a() {
                        return $$02;
                    }

                    @Override
                    public Optional<jh.c<T>> a(bef<T> $$0) {
                        return Optional.of(this.b($$0));
                    }

                    @Override
                    public jh.c<T> b(bef<T> $$0) {
                        Optional<jh.c<jh.c>> $$1 = this.a().a($$0);
                        return $$1.orElseGet(() -> jh.a(this.a(), $$0));
                    }
                };
            }
        };
    }

    public static void b() {
        dz $$02 = ee.a(pc.a());
        CommandDispatcher<ed> $$12 = new ee(ee$a.a, $$02).a();
        RootCommandNode $$22 = $$12.getRoot();
        $$12.findAmbiguities(($$1, $$2, $$3, $$4) -> h.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$12.getPath($$2), $$12.getPath($$3), $$4}));
        Set<ArgumentType<?>> $$32 = id.a($$22);
        Set $$42 = $$32.stream().filter($$0 -> !ic.a($$0.getClass())).collect(Collectors.toSet());
        if (!$$42.isEmpty()) {
            h.warn("Missing type registration for following arguments:\n {}", (Object)$$42.stream().map($$0 -> "\t" + String.valueOf($$0)).collect(Collectors.joining(",\n")));
            throw new IllegalStateException("Unregistered argument types");
        }
    }

    public static <T extends bbo> bbm<T> a(bbj $$0) {
        return new bbm($$0);
    }

    public static ed a(bbn $$0) {
        return new ed(ec.a, ftm.c, ftl.a, null, $$0, "", yg.a, null, null);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(true, true);
        public static final /* enum */ a b = new a(false, true);
        public static final /* enum */ a c = new a(true, false);
        final boolean d;
        final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = ee$a.a();
        }
    }

    @FunctionalInterface
    public static interface b {
        public void parse(StringReader var1) throws CommandSyntaxException;
    }
}

