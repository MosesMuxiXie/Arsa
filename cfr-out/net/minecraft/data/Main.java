/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 */
package net.minecraft.data;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
    @x(a="System.out needed before bootstrap")
    @DontObfuscate
    public static void main(String[] $$02) throws IOException {
        w.a();
        OptionParser $$1 = new OptionParser();
        AbstractOptionSpec $$2 = $$1.accepts("help", "Show the help menu").forHelp();
        OptionSpecBuilder $$3 = $$1.accepts("server", "Include server generators");
        OptionSpecBuilder $$4 = $$1.accepts("dev", "Include development tools");
        OptionSpecBuilder $$5 = $$1.accepts("reports", "Include data reports");
        $$1.accepts("validate", "Validate inputs");
        OptionSpecBuilder $$6 = $$1.accepts("all", "Include all generators");
        ArgumentAcceptingOptionSpec $$7 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$8 = $$1.accepts("input", "Input folder").withRequiredArg();
        OptionSet $$9 = $$1.parse($$02);
        if ($$9.has((OptionSpec)$$2) || !$$9.hasOptions()) {
            $$1.printHelpOn((OutputStream)System.out);
            return;
        }
        Path $$10 = Paths.get((String)$$7.value($$9), new String[0]);
        boolean $$11 = $$9.has((OptionSpec)$$6);
        boolean $$12 = $$11 || $$9.has((OptionSpec)$$3);
        boolean $$13 = $$11 || $$9.has((OptionSpec)$$4);
        boolean $$14 = $$11 || $$9.has((OptionSpec)$$5);
        List<Path> $$15 = $$9.valuesOf((OptionSpec)$$8).stream().map($$0 -> Paths.get($$0, new String[0])).toList();
        mp $$16 = new mp($$10, w.b(), true);
        Main.a($$16, $$15, $$12, $$13, $$14);
        $$16.a();
        bhs.k();
    }

    private static <T extends mq> mq.a<T> a(BiFunction<ms, CompletableFuture<jf.a>, T> $$0, CompletableFuture<jf.a> $$1) {
        return $$2 -> (mq)$$0.apply($$2, $$1);
    }

    public static void a(mp $$02, Collection<Path> $$12, boolean $$2, boolean $$3, boolean $$4) {
        mp.a $$5 = $$02.a($$2);
        $$5.a($$1 -> new pg($$1, $$12).a(new ph()));
        CompletableFuture<jf.a> $$6 = CompletableFuture.supplyAsync(pc::a, bhs.h());
        mp.a $$7 = $$02.a($$2);
        $$7.a(Main.a(oz::new, $$6));
        $$7.a(Main.a(mw::a, $$6));
        $$7.a(Main.a(od::a, $$6));
        $$7.a(Main.a(ox.a::new, $$6));
        qa $$8 = $$7.a(Main.a(qd::new, $$6));
        qa $$9 = $$7.a(Main.a(qf::new, $$6));
        qa $$10 = $$7.a(Main.a(pk::new, $$6));
        qa $$11 = $$7.a(Main.a(pj::new, $$6));
        qa $$122 = $$7.a(Main.a(py::new, $$6));
        $$7.a(Main.a(pm::new, $$6));
        $$7.a(Main.a(pn::new, $$6));
        $$7.a(Main.a(pp::new, $$6));
        $$7.a(Main.a(pq::new, $$6));
        $$7.a(Main.a(pr::new, $$6));
        $$7.a(Main.a(ps::new, $$6));
        $$7.a(Main.a(pt::new, $$6));
        $$7.a(Main.a(pw::new, $$6));
        $$7.a(Main.a(px::new, $$6));
        $$7.a(Main.a(qg::new, $$6));
        $$7.a(Main.a(qe::new, $$6));
        $$7.a(Main.a(qb::new, $$6));
        mp.a $$13 = $$02.a($$3);
        $$13.a($$1 -> new pe($$1, $$12));
        mp.a $$14 = $$02.a($$4);
        $$14.a(Main.a(nd::new, $$6));
        $$14.a(Main.a(nh::new, $$6));
        $$14.a(Main.a(ne::new, $$6));
        $$14.a(Main.a(nf::new, $$6));
        $$14.a(nj::new);
        $$14.a(ni::new);
        $$14.a(ng::new);
        $$14.a(auk::new);
        CompletableFuture<jt.g> $$15 = pb.a($$6);
        CompletionStage $$16 = $$15.thenApply(jt.g::b);
        mp.a $$17 = $$02.a($$2, "trade_rebalance");
        $$17.a(Main.a(oz::new, (CompletableFuture<jf.a>)$$16));
        $$17.a($$0 -> oh.a($$0, yh.c("dataPack.trade_rebalance.description"), dgz.a(dhb.b)));
        $$17.a(Main.a(ns::a, $$6));
        $$17.a(Main.a(qc::new, $$6));
        mp.a $$18 = $$02.a($$2, "redstone_experiments");
        $$18.a($$0 -> oh.a($$0, yh.c("dataPack.redstone_experiments.description"), dgz.a(dhb.c)));
        mp.a $$19 = $$02.a($$2, "minecart_improvements");
        $$19.a($$0 -> oh.a($$0, yh.c("dataPack.minecart_improvements.description"), dgz.a(dhb.d)));
    }
}

