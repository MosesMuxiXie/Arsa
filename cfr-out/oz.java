/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class oz
implements mq {
    private final ms d;
    private final CompletableFuture<jf.a> e;

    public oz(ms $$0, CompletableFuture<jf.a> $$1) {
        this.e = $$1;
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        return this.e.thenCompose($$1 -> {
            ams $$2 = $$1.a(JsonOps.INSTANCE);
            return CompletableFuture.allOf((CompletableFuture[])amp.a.stream().flatMap($$3 -> this.a($$0, (jf.a)$$1, $$2, (amp.d)$$3).stream()).toArray(CompletableFuture[]::new));
        });
    }

    private <T> Optional<CompletableFuture<?>> a(mo $$0, jf.a $$1, DynamicOps<JsonElement> $$2, amp.d<T> $$3) {
        amt $$4 = $$3.a();
        return $$1.a($$4).map($$42 -> {
            ms.a $$5 = this.d.a($$4);
            return CompletableFuture.allOf((CompletableFuture[])$$42.c().map($$4 -> oz.a($$5.a($$4.h().a()), $$0, $$2, $$3.b(), $$4.a())).toArray(CompletableFuture[]::new));
        });
    }

    private static <E> CompletableFuture<?> a(Path $$0, mo $$12, DynamicOps<JsonElement> $$22, Encoder<E> $$3, E $$4) {
        return (CompletableFuture)$$3.encodeStart($$22, $$4).mapOrElse($$2 -> mq.a($$12, $$2, $$0), $$1 -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + String.valueOf($$0) + "': " + $$1.message())));
    }

    @Override
    public final String a() {
        return "Registries";
    }
}

