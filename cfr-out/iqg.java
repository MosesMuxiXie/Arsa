/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class iqg {
    private final Set<a> a = Sets.newIdentityHashSet();
    final fwh b;
    final Executor c;

    public iqg(fwh $$0, Executor $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public CompletableFuture<@Nullable a> a(fwh.c $$0) {
        CompletableFuture<@Nullable a> $$1 = new CompletableFuture<a>();
        this.c.execute(() -> {
            fwg $$2 = this.b.a($$0);
            if ($$2 != null) {
                a $$3 = new a($$2);
                this.a.add($$3);
                $$1.complete($$3);
            } else {
                $$1.complete(null);
            }
        });
        return $$1;
    }

    public void a(Consumer<Stream<fwg>> $$0) {
        this.c.execute(() -> $$0.accept(this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull)));
    }

    public void a() {
        this.c.execute(() -> {
            Iterator<a> $$0 = this.a.iterator();
            while ($$0.hasNext()) {
                a $$1 = $$0.next();
                $$1.b.j();
                if (!$$1.b.h()) continue;
                $$1.b();
                $$0.remove();
            }
        });
    }

    public void b() {
        this.a.forEach(a::b);
        this.a.clear();
    }

    public class a {
        @Nullable fwg b;
        private boolean c;

        public boolean a() {
            return this.c;
        }

        public a(fwg $$1) {
            this.b = $$1;
        }

        public void a(Consumer<fwg> $$0) {
            iqg.this.c.execute(() -> {
                if (this.b != null) {
                    $$0.accept(this.b);
                }
            });
        }

        public void b() {
            this.c = true;
            iqg.this.b.a(this.b);
            this.b = null;
        }
    }
}

