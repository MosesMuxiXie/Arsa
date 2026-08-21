/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mt
implements mq {
    private final ms.a d;
    private final List<mu> e;
    private final CompletableFuture<jf.a> f;

    public mt(ms $$0, CompletableFuture<jf.a> $$1, List<mu> $$2) {
        this.d = $$0.a(mj.bJ);
        this.e = $$2;
        this.f = $$1;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        return this.f.thenCompose($$1 -> {
            HashSet $$2 = new HashSet();
            ArrayList $$3 = new ArrayList();
            Consumer<ac> $$42 = $$4 -> {
                if (!$$2.add($$4.a())) {
                    throw new IllegalStateException("Duplicate advancement " + String.valueOf($$4.a()));
                }
                Path $$5 = this.d.a($$4.a());
                $$3.add(mq.a($$0, $$1, ab.a, $$4.b(), $$5));
            };
            for (mu $$5 : this.e) {
                $$5.a((jf.a)$$1, $$42);
            }
            return CompletableFuture.allOf((CompletableFuture[])$$3.toArray(CompletableFuture[]::new));
        });
    }

    @Override
    public final String a() {
        return "Advancements";
    }
}

