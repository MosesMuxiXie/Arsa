/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class inp {
    private static final Logger a = LogUtils.getLogger();
    private static final amm b = amm.a("items");

    public static CompletableFuture<a> a(baz $$0, Executor $$1) {
        jr.b $$22 = hii.a().a();
        return CompletableFuture.supplyAsync(() -> b.a($$0), $$1).thenCompose($$2 -> {
            ArrayList $$32 = new ArrayList($$2.size());
            $$2.forEach(($$3, $$4) -> $$32.add(CompletableFuture.supplyAsync(() -> {
                b b2;
                block8: {
                    Object $$3 = b.b((amo)$$3);
                    Object $$4 = $$4.e();
                    try {
                        bgn $$5 = new bgn($$22);
                        ams $$6 = $$5.a(JsonOps.INSTANCE);
                        ihf $$7 = ihf.a.parse($$6, (Object)bhf.a($$4)).ifError($$2 -> a.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$3, $$4.b(), $$2.message()})).result().map($$1 -> {
                            if ($$5.b()) {
                                return $$1.a($$5.a());
                            }
                            return $$1;
                        }).orElse(null);
                        b2 = new b((amo)$$3, $$7);
                        if ($$4 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ($$4 != null) {
                                try {
                                    ((Reader)$$4).close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (Exception $$8) {
                            a.error("Failed to open item model {} from pack '{}'", new Object[]{$$3, $$4.b(), $$8});
                            return new b((amo)$$3, null);
                        }
                    }
                    ((Reader)$$4).close();
                }
                return b2;
            }, $$1)));
            return bhs.c($$32).thenApply($$0 -> {
                Executor $$1 = new HashMap<amo, ihf>();
                for (b $$2 : $$0) {
                    if ($$2.b == null) continue;
                    $$1.put($$2.a, $$2.b);
                }
                return new a((Map<amo, ihf>)((Object)$$1));
            });
        });
    }

    static final class b
    extends Record {
        final amo a;
        final @Nullable ihf b;

        b(amo $$0, @Nullable ihf $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;clientItemInfo", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;clientItemInfo", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;clientItemInfo", "a", "b"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public @Nullable ihf b() {
            return this.b;
        }
    }

    public record a(Map<amo, ihf> a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contents", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contents", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contents", "a"}, this, $$0);
        }
    }
}

