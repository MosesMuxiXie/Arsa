/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class cbi {
    public static final Path a = Paths.get("debug/profiling", new String[0]);
    public static final String b = "metrics";
    public static final String c = "deviations";
    public static final String d = "profiling.txt";
    private static final Logger e = LogUtils.getLogger();
    private final String f;

    public cbi(String $$0) {
        this.f = $$0;
    }

    public Path a(Set<cax> $$0, Map<cax, List<cbj>> $$1, bzk $$2) {
        try {
            Files.createDirectories(a, new FileAttribute[0]);
        }
        catch (IOException $$3) {
            throw new UncheckedIOException($$3);
        }
        try {
            Path $$4 = Files.createTempDirectory("minecraft-profiling", new FileAttribute[0]);
            $$4.toFile().deleteOnExit();
            Files.createDirectories(a, new FileAttribute[0]);
            Path $$5 = $$4.resolve(this.f);
            Path $$6 = $$5.resolve(b);
            this.a($$0, $$6);
            if (!$$1.isEmpty()) {
                this.a($$1, $$5.resolve(c));
            }
            this.a($$2, $$5);
            return $$4;
        }
        catch (IOException $$7) {
            throw new UncheckedIOException($$7);
        }
    }

    private void a(Set<cax> $$0, Path $$12) {
        if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one sampler to persist");
        }
        Map<caw, List<cax>> $$22 = $$0.stream().collect(Collectors.groupingBy(cax::e));
        $$22.forEach(($$1, $$2) -> this.a((caw)((Object)$$1), (List<cax>)$$2, $$12));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(caw $$0, List<cax> $$12, Path $$2) {
        Path $$3 = $$2.resolve(bhs.a($$0.a(), amo::b) + ".csv");
        BufferedWriter $$4 = null;
        try {
            Files.createDirectories($$3.getParent(), new FileAttribute[0]);
            $$4 = Files.newBufferedWriter($$3, StandardCharsets.UTF_8, new OpenOption[0]);
            bfd.a $$5 = bfd.a();
            $$5.a("@tick");
            for (cax $$6 : $$12) {
                $$5.a($$6.d());
            }
            bfd $$7 = $$5.a($$4);
            List $$8 = $$12.stream().map(cax::f).collect(Collectors.toList());
            int $$9 = $$8.stream().mapToInt(cax.b::a).summaryStatistics().getMin();
            int $$10 = $$8.stream().mapToInt(cax.b::b).summaryStatistics().getMax();
            for (int $$11 = $$9; $$11 <= $$10; ++$$11) {
                int $$122 = $$11;
                Stream<String> $$13 = $$8.stream().map($$1 -> String.valueOf($$1.a($$122)));
                Object[] $$14 = Stream.concat(Stream.of(String.valueOf($$11)), $$13).toArray(String[]::new);
                $$7.a($$14);
            }
            e.info("Flushed metrics to {}", (Object)$$3);
            IOUtils.closeQuietly((Writer)$$4);
        }
        catch (Exception $$15) {
            e.error("Could not save profiler results to {}", (Object)$$3, (Object)$$15);
        }
        finally {
            IOUtils.closeQuietly($$4);
        }
    }

    private void a(Map<cax, List<cbj>> $$0, Path $$1) {
        DateTimeFormatter $$22 = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss.SSS", Locale.UK).withZone(ZoneId.systemDefault());
        $$0.forEach(($$2, $$32) -> $$32.forEach($$3 -> {
            String $$4 = $$22.format($$3.a);
            Path $$5 = $$1.resolve(bhs.a($$2.d(), amo::b)).resolve(String.format(Locale.ROOT, "%d@%s.txt", $$3.b, $$4));
            $$3.c.a($$5);
        }));
    }

    private void a(bzk $$0, Path $$1) {
        $$0.a($$1.resolve(d));
    }
}

