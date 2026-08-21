/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Splitter;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class azv
extends FileSystem {
    private static final Set<String> b = Set.of("basic");
    public static final String a = "/";
    private static final Splitter c = Splitter.on((char)'/');
    private final FileStore d;
    private final FileSystemProvider e = new azu();
    private final azt f;

    azv(String $$0, b $$1) {
        this.d = new azs($$0);
        this.f = azv.a($$1, this, "", null);
    }

    private static azt a(b $$0, azv $$1, String $$2, @Nullable azt $$32) {
        Object2ObjectOpenHashMap $$42 = new Object2ObjectOpenHashMap();
        azt $$5 = new azt($$1, $$2, $$32, new azw.a((Map<String, azt>)$$42));
        $$0.b.forEach(($$3, $$4) -> $$42.put($$3, (Object)new azt($$1, (String)$$3, $$5, new azw.b((Path)$$4))));
        $$0.a.forEach(($$3, $$4) -> $$42.put($$3, (Object)azv.a($$4, $$1, $$3, $$5)));
        $$42.trim();
        return $$5;
    }

    @Override
    public FileSystemProvider provider() {
        return this.e;
    }

    @Override
    public void close() {
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Override
    public String getSeparator() {
        return a;
    }

    @Override
    public Iterable<Path> getRootDirectories() {
        return List.of(this.f);
    }

    @Override
    public Iterable<FileStore> getFileStores() {
        return List.of(this.d);
    }

    @Override
    public Set<String> supportedFileAttributeViews() {
        return b;
    }

    @Override
    public Path getPath(String $$0, String ... $$1) {
        String $$3;
        Stream<String> $$2 = Stream.of($$0);
        if ($$1.length > 0) {
            $$2 = Stream.concat($$2, Stream.of($$1));
        }
        if (($$3 = $$2.collect(Collectors.joining(a))).equals(a)) {
            return this.f;
        }
        if ($$3.startsWith(a)) {
            azt $$4 = this.f;
            for (String $$5 : c.split((CharSequence)$$3.substring(1))) {
                if ($$5.isEmpty()) {
                    throw new IllegalArgumentException("Empty paths not allowed");
                }
                $$4 = $$4.a($$5);
            }
            return $$4;
        }
        azt $$6 = null;
        for (String $$7 : c.split((CharSequence)$$3)) {
            if ($$7.isEmpty()) {
                throw new IllegalArgumentException("Empty paths not allowed");
            }
            $$6 = new azt(this, $$7, $$6, azw.b);
        }
        if ($$6 == null) {
            throw new IllegalArgumentException("Empty paths not allowed");
        }
        return $$6;
    }

    @Override
    public PathMatcher getPathMatcher(String $$0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UserPrincipalLookupService getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override
    public WatchService newWatchService() {
        throw new UnsupportedOperationException();
    }

    public FileStore a() {
        return this.d;
    }

    public azt b() {
        return this.f;
    }

    public static a c() {
        return new a();
    }

    static final class b
    extends Record {
        final Map<String, b> a;
        final Map<String, Path> b;

        public b() {
            this(new HashMap<String, b>(), new HashMap<String, Path>());
        }

        private b(Map<String, b> $$0, Map<String, Path> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "children;files", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "children;files", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "children;files", "a", "b"}, this, $$0);
        }

        public Map<String, b> a() {
            return this.a;
        }

        public Map<String, Path> b() {
            return this.b;
        }
    }

    public static class a {
        private final b a = new b();

        public a a(List<String> $$02, String $$1, Path $$2) {
            b $$3 = this.a;
            for (String $$4 : $$02) {
                $$3 = $$3.a.computeIfAbsent($$4, $$0 -> new b());
            }
            $$3.b.put($$1, $$2);
            return this;
        }

        public a a(List<String> $$0, Path $$1) {
            if ($$0.isEmpty()) {
                throw new IllegalArgumentException("Path can't be empty");
            }
            int $$2 = $$0.size() - 1;
            return this.a($$0.subList(0, $$2), $$0.get($$2), $$1);
        }

        public FileSystem a(String $$0) {
            return new azv($$0, this.a);
        }
    }
}

