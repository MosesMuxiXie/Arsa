/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.slf4j.Logger;

public class azf {
    private static final Logger a = LogUtils.getLogger();

    public static void a(Path $$0, int $$1) {
        try {
            List<b> $$2 = azf.a($$0);
            int $$3 = $$2.size() - $$1;
            if ($$3 <= 0) {
                return;
            }
            $$2.sort(b.a);
            List<a> $$4 = azf.a($$2);
            Collections.reverse($$4);
            $$4.sort(azf$a.a);
            HashSet<Path> $$5 = new HashSet<Path>();
            for (int $$6 = 0; $$6 < $$3; ++$$6) {
                a $$7 = $$4.get($$6);
                Path $$8 = $$7.b;
                try {
                    Files.delete($$8);
                    if ($$7.c != 0) continue;
                    $$5.add($$8.getParent());
                    continue;
                }
                catch (IOException $$9) {
                    a.warn("Failed to delete cache file {}", (Object)$$8, (Object)$$9);
                }
            }
            $$5.remove($$0);
            for (Path $$10 : $$5) {
                try {
                    Files.delete($$10);
                }
                catch (DirectoryNotEmptyException $$8) {
                }
                catch (IOException $$11) {
                    a.warn("Failed to delete empty(?) cache directory {}", (Object)$$10, (Object)$$11);
                }
            }
        }
        catch (IOException | UncheckedIOException $$12) {
            a.error("Failed to vacuum cache dir {}", (Object)$$0, (Object)$$12);
        }
    }

    private static List<b> a(final Path $$0) throws IOException {
        try {
            final ArrayList<b> $$1 = new ArrayList<b>();
            Files.walkFileTree($$0, (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

                public FileVisitResult a(Path $$02, BasicFileAttributes $$12) {
                    if ($$12.isRegularFile() && !$$02.getParent().equals($$0)) {
                        FileTime $$2 = $$12.lastModifiedTime();
                        $$1.add(new b($$02, $$2));
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                    return this.a((Path)object, basicFileAttributes);
                }
            });
            return $$1;
        }
        catch (NoSuchFileException $$2) {
            return List.of();
        }
    }

    private static List<a> a(List<b> $$0) {
        ArrayList<a> $$1 = new ArrayList<a>();
        Object2IntOpenHashMap $$2 = new Object2IntOpenHashMap();
        for (b $$3 : $$0) {
            int $$4 = $$2.addTo((Object)$$3.b.getParent(), 1);
            $$1.add(new a($$3.b, $$4));
        }
        return $$1;
    }

    static final class b
    extends Record {
        final Path b;
        private final FileTime c;
        public static final Comparator<b> a = Comparator.comparing(b::b).reversed();

        b(Path $$0, FileTime $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "path;modifiedTime", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "path;modifiedTime", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "path;modifiedTime", "b", "c"}, this, $$0);
        }

        public Path a() {
            return this.b;
        }

        public FileTime b() {
            return this.c;
        }
    }

    static final class a
    extends Record {
        final Path b;
        final int c;
        public static final Comparator<a> a = Comparator.comparing(a::b).reversed();

        a(Path $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "path;removalPriority", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "path;removalPriority", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "path;removalPriority", "b", "c"}, this, $$0);
        }

        public Path a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }
}

