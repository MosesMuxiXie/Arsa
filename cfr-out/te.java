/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class te {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "gametestserver";
    private static final String c = "gametestworld";
    private static final OptionParser d = new OptionParser();
    private static final OptionSpec<String> e = d.accepts("universe", "The path to where the test server world will be created. Any existing folder will be replaced.").withRequiredArg().defaultsTo((Object)"gametestserver", (Object[])new String[0]);
    private static final OptionSpec<File> f = d.accepts("report", "Exports results in a junit-like XML report at the given path.").withRequiredArg().ofType(File.class);
    private static final OptionSpec<String> g = d.accepts("tests", "Which test(s) to run (namespaced ID selector using wildcards). Empty means run all.").withRequiredArg();
    private static final OptionSpec<Boolean> h = d.accepts("verify", "Runs the tests specified with `test` or `testNamespace` 100 times for each 90 degree rotation step").withRequiredArg().ofType(Boolean.class).defaultsTo((Object)false, (Object[])new Boolean[0]);
    private static final OptionSpec<String> i = d.accepts("packs", "A folder of datapacks to include in the world").withRequiredArg();
    private static final OptionSpec<Void> j = d.accepts("help").forHelp();

    @x(a="Using System.err due to no bootstrap")
    public static void a(String[] $$0, Consumer<String> $$1) throws Exception {
        d.allowsUnrecognizedOptions();
        OptionSet $$2 = d.parse($$0);
        if ($$2.has(j)) {
            d.printHelpOn((OutputStream)System.err);
            return;
        }
        if (((Boolean)$$2.valueOf(h)).booleanValue() && !$$2.has(g)) {
            a.error("Please specify a test selection to run the verify option. For example: --verify --tests example:test_something_*");
            System.exit(-1);
        }
        a.info("Running GameTestMain with cwd '{}', universe path '{}'", (Object)System.getProperty("user.dir"), $$2.valueOf(e));
        if ($$2.has(f)) {
            tl.a(new tm((File)f.value($$2)));
        }
        amv.a();
        bhs.p();
        String $$32 = (String)$$2.valueOf(e);
        te.a($$32);
        $$1.accept($$32);
        if ($$2.has(i)) {
            String $$4 = (String)$$2.valueOf(i);
            te.a($$32, $$4);
        }
        fni.c $$5 = fni.b(Paths.get($$32, new String[0])).e(c);
        bak $$6 = ban.a($$5);
        MinecraftServer.a((Thread $$3) -> th.a($$3, $$5, $$6, te.a($$2, g), $$2.has(h)));
    }

    private static Optional<String> a(OptionSet $$0, OptionSpec<String> $$1) {
        return $$0.has($$1) ? Optional.of((String)$$0.valueOf($$1)) : Optional.empty();
    }

    private static void a(String $$0) throws IOException {
        Path $$1 = Paths.get($$0, new String[0]);
        if (Files.exists($$1, new LinkOption[0])) {
            FileUtils.deleteDirectory((File)$$1.toFile());
        }
        Files.createDirectories($$1, new FileAttribute[0]);
    }

    private static void a(String $$0, String $$1) throws IOException {
        Path $$3;
        Path $$2 = Paths.get($$0, new String[0]).resolve(c).resolve("datapacks");
        if (!Files.exists($$2, new LinkOption[0])) {
            Files.createDirectories($$2, new FileAttribute[0]);
        }
        if (Files.exists($$3 = Paths.get($$1, new String[0]), new LinkOption[0])) {
            try (Stream<Path> $$4 = Files.list($$3);){
                for (Path $$5 : $$4.toList()) {
                    Path $$6 = $$2.resolve($$5.getFileName());
                    if (Files.isDirectory($$5, new LinkOption[0])) {
                        if (!Files.isRegularFile($$5.resolve("pack.mcmeta"), new LinkOption[0])) continue;
                        FileUtils.copyDirectory((File)$$5.toFile(), (File)$$6.toFile());
                        a.info("Included folder pack {}", (Object)$$5.getFileName());
                        continue;
                    }
                    if (!$$5.toString().endsWith(".zip")) continue;
                    Files.copy($$5, $$6, new CopyOption[0]);
                    a.info("Included zip pack {}", (Object)$$5.getFileName());
                }
            }
        }
    }
}

