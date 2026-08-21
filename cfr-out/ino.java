/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ino {
    private static final Logger a = LogUtils.getLogger();
    private static final amm b = amm.a("blockstates");

    public static CompletableFuture<b> a(baz $$0, Executor $$1) {
        Function<amo, @Nullable eoi<dzq, eoh>> $$22 = inn.a();
        return CompletableFuture.supplyAsync(() -> b.b($$0), $$1).thenCompose($$2 -> {
            ArrayList<CompletableFuture<@Nullable b>> $$3 = new ArrayList<CompletableFuture<b>>($$2.size());
            for (Map.Entry $$4 : $$2.entrySet()) {
                $$3.add(CompletableFuture.supplyAsync(() -> {
                    Object $$2 = b.b((amo)$$4.getKey());
                    @Nullable eoi $$3 = (eoi)$$22.apply((amo)$$2);
                    if ($$3 == null) {
                        a.debug("Discovered unknown block state definition {}, ignoring", $$2);
                        return null;
                    }
                    List $$4 = (List)$$4.getValue();
                    ArrayList<a> $$5 = new ArrayList<a>($$4.size());
                    for (bax $$6 : $$4) {
                        try {
                            BufferedReader $$7 = $$6.e();
                            try {
                                JsonElement $$8 = bhf.a($$7);
                                hqf $$9 = (hqf)hqf.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$8).getOrThrow(JsonParseException::new);
                                $$5.add(new a($$6.b(), $$9));
                            }
                            finally {
                                if ($$7 == null) continue;
                                ((Reader)$$7).close();
                            }
                        }
                        catch (Exception $$10) {
                            a.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$2, $$6.b(), $$10});
                        }
                    }
                    try {
                        return ino.a($$2, $$3, $$5);
                    }
                    catch (Exception $$11) {
                        a.error("Failed to load blockstate definition {}", $$2, (Object)$$11);
                        return null;
                    }
                }, $$1));
            }
            return bhs.c($$3).thenApply($$0 -> {
                Executor $$1 = new IdentityHashMap<eoh, hqh.c>();
                for (b $$2 : $$0) {
                    if ($$2 == null) continue;
                    $$1.putAll($$2.a());
                }
                return new b((Map<eoh, hqh.c>)((Object)$$1));
            });
        });
    }

    private static b a(amo $$0, eoi<dzq, eoh> $$1, List<a> $$2) {
        IdentityHashMap<eoh, hqh.c> $$3 = new IdentityHashMap<eoh, hqh.c>();
        for (a $$4 : $$2) {
            $$3.putAll($$4.b.a($$1, () -> String.valueOf($$0) + "/" + $$1.a));
        }
        return new b($$3);
    }

    static final class a
    extends Record {
        final String a;
        final hqf b;

        a(String $$0, hqf $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "source;contents", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "source;contents", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "source;contents", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public hqf b() {
            return this.b;
        }
    }

    public record b(Map<eoh, hqh.c> a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "models", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "models", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "models", "a"}, this, $$0);
        }
    }
}

