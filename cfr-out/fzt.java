/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fzt {
    private static final Logger a = LogUtils.getLogger();
    private static @Nullable CompletableFuture<a> b;

    public static CompletableFuture<a> a() {
        if (b == null || fzt.a(b)) {
            b = fzt.b();
        }
        return b;
    }

    private static boolean a(CompletableFuture<a> $$0) {
        a $$1 = $$0.getNow(null);
        return $$1 != null && $$1.b() != null;
    }

    private static CompletableFuture<a> b() {
        if (gfj.V().h()) {
            return CompletableFuture.completedFuture(new a(fzt$b.d));
        }
        if (w.ac) {
            return CompletableFuture.completedFuture(new a(fzt$b.a));
        }
        return CompletableFuture.supplyAsync(() -> {
            fzz $$0 = fzz.a();
            try {
                if ($$0.i() != fzz.a.a) {
                    return new a(fzt$b.b);
                }
                if (!$$0.h()) {
                    return new a(fzt$b.c);
                }
                return new a(fzt$b.a);
            }
            catch (gce $$1) {
                a.error("Couldn't connect to realms", (Throwable)$$1);
                if ($$1.a.a() == 401) {
                    return new a(fzt$b.d);
                }
                return new a($$1);
            }
        }, bhs.i());
    }

    public record a(b a, @Nullable gce b) {
        public a(b $$0) {
            this($$0, null);
        }

        public a(gce $$0) {
            this(fzt$b.e, $$0);
        }

        public @Nullable gsb a(gsb $$0) {
            return switch (this.a.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> null;
                case 1 -> new gco($$0);
                case 2 -> new gcw($$0);
                case 3 -> new gcs(yh.c("mco.error.invalid.session.title"), yh.c("mco.error.invalid.session.message"), $$0);
                case 4 -> new gcs(Objects.requireNonNull(this.b), $$0);
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;exception", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;exception", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;exception", "a", "b"}, this, $$0);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        public static final /* enum */ b e = new b();
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            f = fzt$b.a();
        }
    }
}

