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
package net.minecraft.client.data;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
    @DontObfuscate
    @x(a="System.out needed before bootstrap")
    public static void main(String[] $$0) throws IOException {
        w.a();
        OptionParser $$1 = new OptionParser();
        AbstractOptionSpec $$2 = $$1.accepts("help", "Show the help menu").forHelp();
        OptionSpecBuilder $$3 = $$1.accepts("client", "Include client generators");
        OptionSpecBuilder $$4 = $$1.accepts("all", "Include all generators");
        ArgumentAcceptingOptionSpec $$5 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        OptionSet $$6 = $$1.parse($$0);
        if ($$6.has((OptionSpec)$$2) || !$$6.hasOptions()) {
            $$1.printHelpOn((OutputStream)System.out);
            return;
        }
        Path $$7 = Paths.get((String)$$5.value($$6), new String[0]);
        boolean $$8 = $$6.has((OptionSpec)$$4);
        boolean $$9 = $$8 || $$6.has((OptionSpec)$$3);
        amv.a();
        get.a();
        mp $$10 = new mp($$7, w.b(), true);
        Main.a($$10, $$9);
        $$10.a();
        bhs.k();
    }

    public static void a(mp $$0, boolean $$1) {
        mp.a $$2 = $$0.a($$1);
        $$2.a(ghl::new);
        $$2.a(ghi::new);
        $$2.a(ghn::new);
        $$2.a(ghg::new);
    }
}

