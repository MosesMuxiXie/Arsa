/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface cbx<R extends Runnable>
extends AutoCloseable {
    public String z_();

    public void a_(R var1);

    @Override
    default public void close() {
    }

    public R f(Runnable var1);

    default public <Source> CompletableFuture<Source> a(Consumer<CompletableFuture<Source>> $$0) {
        CompletableFuture $$1 = new CompletableFuture();
        this.a_(this.f(() -> $$0.accept($$1)));
        return $$1;
    }

    public static cbx<Runnable> a(final String $$0, final Executor $$1) {
        return new cbx<Runnable>(){

            @Override
            public String z_() {
                return $$0;
            }

            @Override
            public void a_(Runnable $$02) {
                $$1.execute($$02);
            }

            @Override
            public Runnable f(Runnable $$02) {
                return $$02;
            }

            public String toString() {
                return $$0;
            }
        };
    }
}

