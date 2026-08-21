/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;

public class fte
implements PathMatcher {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "#";
    private final List<a> c;
    private final Map<String, PathMatcher> d = new ConcurrentHashMap<String, PathMatcher>();

    public fte(List<a> $$0) {
        this.c = $$0;
    }

    public PathMatcher a(FileSystem $$0) {
        return this.d.computeIfAbsent($$0.provider().getScheme(), $$12 -> {
            void $$4;
            try {
                List<PathMatcher> $$2 = this.c.stream().map($$1 -> $$1.a($$0)).toList();
            }
            catch (Exception $$3) {
                a.error("Failed to compile file pattern list", (Throwable)$$3);
                return $$0 -> false;
            }
            return switch ($$4.size()) {
                case 0 -> $$0 -> false;
                case 1 -> (PathMatcher)$$4.get(0);
                default -> arg_0 -> fte.a((List)$$4, arg_0);
            };
        });
    }

    @Override
    public boolean matches(Path $$0) {
        return this.a($$0.getFileSystem()).matches($$0);
    }

    public static fte a(BufferedReader $$02) {
        return new fte($$02.lines().flatMap($$0 -> fte$a.a($$0).stream()).toList());
    }

    private static /* synthetic */ boolean a(List $$0, Path $$1) {
        for (PathMatcher $$2 : $$0) {
            if (!$$2.matches($$1)) continue;
            return true;
        }
        return false;
    }

    public record a(b a, String b) {
        public PathMatcher a(FileSystem $$0) {
            return this.a().compile($$0, this.b);
        }

        static Optional<a> a(String $$0) {
            if ($$0.isBlank() || $$0.startsWith(fte.b)) {
                return Optional.empty();
            }
            if (!$$0.startsWith("[")) {
                return Optional.of(new a(fte$b.b, $$0));
            }
            int $$1 = $$0.indexOf(93, 1);
            if ($$1 == -1) {
                throw new IllegalArgumentException("Unterminated type in line '" + $$0 + "'");
            }
            String $$2 = $$0.substring(1, $$1);
            String $$3 = $$0.substring($$1 + 1);
            return switch ($$2) {
                case "glob", "regex" -> Optional.of(new a(fte$b.a, $$2 + ":" + $$3));
                case "prefix" -> Optional.of(new a(fte$b.b, $$3));
                default -> throw new IllegalArgumentException("Unsupported definition type in line '" + $$0 + "'");
            };
        }

        static a b(String $$0) {
            return new a(fte$b.a, "glob:" + $$0);
        }

        static a c(String $$0) {
            return new a(fte$b.a, "regex:" + $$0);
        }

        static a d(String $$0) {
            return new a(fte$b.b, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;pattern", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;pattern", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;pattern", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface b {
        public static final b a = FileSystem::getPathMatcher;
        public static final b b = ($$0, $$12) -> $$1 -> $$1.toString().startsWith($$12);

        public PathMatcher compile(FileSystem var1, String var2);
    }
}

