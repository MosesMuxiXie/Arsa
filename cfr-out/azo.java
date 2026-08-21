/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class azo
extends azc {
    private static final Logger c = LogUtils.getLogger();
    private static final Joiner d = Joiner.on((String)"/");
    private final Path e;

    public azo(azk $$0, Path $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public @Nullable bar<InputStream> a(String ... $$0) {
        bfp.a($$0);
        Path $$1 = bfp.a(this.e, List.of($$0));
        if (Files.exists($$1, new LinkOption[0])) {
            return bar.create($$1);
        }
        return null;
    }

    public static boolean a(Path $$0) {
        if (!w.ae) {
            return true;
        }
        if ($$0.getFileSystem() != FileSystems.getDefault()) {
            return true;
        }
        try {
            return $$0.toRealPath(new LinkOption[0]).endsWith($$0);
        }
        catch (IOException $$1) {
            c.warn("Failed to resolve real path for {}", (Object)$$0, (Object)$$1);
            return false;
        }
    }

    @Override
    public @Nullable bar<InputStream> a(azn $$0, amo $$1) {
        Path $$2 = this.e.resolve($$0.a()).resolve($$1.b());
        return azo.a($$1, $$2);
    }

    public static @Nullable bar<InputStream> a(amo $$0, Path $$12) {
        return (bar)bfp.e($$0.a()).mapOrElse($$1 -> {
            Path $$2 = bfp.a($$12, $$1);
            return azo.b($$2);
        }, $$1 -> {
            c.error("Invalid path {}: {}", (Object)$$0, (Object)$$1.message());
            return null;
        });
    }

    private static @Nullable bar<InputStream> b(Path $$0) {
        if (Files.exists($$0, new LinkOption[0]) && azo.a($$0)) {
            return bar.create($$0);
        }
        return null;
    }

    @Override
    public void a(azn $$0, String $$12, String $$2, azl.a $$32) {
        bfp.e($$2).ifSuccess($$3 -> {
            Path $$4 = this.e.resolve($$0.a()).resolve($$12);
            azo.a($$12, $$4, $$3, $$32);
        }).ifError($$1 -> c.error("Invalid path {}: {}", (Object)$$2, (Object)$$1.message()));
    }

    public static void a(String $$0, Path $$1, List<String> $$2, azl.a $$32) {
        Path $$4 = bfp.a($$1, $$2);
        try (Stream<Path> $$52 = Files.find($$4, Integer.MAX_VALUE, azo::a, new FileVisitOption[0]);){
            $$52.forEach($$3 -> {
                String $$4 = d.join((Iterable)$$1.relativize((Path)$$3));
                amo $$5 = amo.b($$0, $$4);
                if ($$5 == null) {
                    bhs.b(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", $$0, $$4));
                } else {
                    $$32.accept($$5, bar.create($$3));
                }
            });
        }
        catch (NoSuchFileException | NotDirectoryException $$52) {
        }
        catch (IOException $$6) {
            c.error("Failed to list path {}", (Object)$$4, (Object)$$6);
        }
    }

    private static boolean a(Path $$0, BasicFileAttributes $$1) {
        if (w.aX) {
            return $$1.isRegularFile() && !StringUtils.equalsIgnoreCase((CharSequence)$$0.getFileName().toString(), (CharSequence)".ds_store");
        }
        return $$1.isRegularFile();
    }

    @Override
    public Set<String> a(azn $$0) {
        HashSet $$1 = Sets.newHashSet();
        Path $$2 = this.e.resolve($$0.a());
        try (DirectoryStream<Path> $$32 = Files.newDirectoryStream($$2);){
            for (Path $$4 : $$32) {
                String $$5 = $$4.getFileName().toString();
                if (amo.j($$5)) {
                    $$1.add($$5);
                    continue;
                }
                c.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", (Object)$$5, (Object)this.e);
            }
        }
        catch (NoSuchFileException | NotDirectoryException $$32) {
        }
        catch (IOException $$6) {
            c.error("Failed to list path {}", (Object)$$2, (Object)$$6);
        }
        return $$1;
    }

    @Override
    public void close() {
    }

    public static class a
    implements bah.c {
        private final Path a;

        public a(Path $$0) {
            this.a = $$0;
        }

        @Override
        public azl a(azk $$0) {
            return new azo($$0, this.a);
        }

        @Override
        public azl a(azk $$0, bah.a $$1) {
            azl $$2 = this.a($$0);
            List<String> $$3 = $$1.d();
            if ($$3.isEmpty()) {
                return $$2;
            }
            ArrayList<azl> $$4 = new ArrayList<azl>($$3.size());
            for (String $$5 : $$3) {
                Path $$6 = this.a.resolve($$5);
                $$4.add(new azo($$0, $$6));
            }
            return new aze($$2, $$4);
        }
    }
}

