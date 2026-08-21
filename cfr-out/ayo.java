/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ayo {
    public static final ayo e = new ayo(){

        @Override
        public CompletableFuture<axy> a(String $$0) {
            return CompletableFuture.completedFuture(axy.a($$0));
        }

        @Override
        public CompletableFuture<List<axy>> a(List<String> $$0) {
            return CompletableFuture.completedFuture((List)$$0.stream().map(axy::a).collect(ImmutableList.toImmutableList()));
        }
    };

    default public void a() {
    }

    default public void b() {
    }

    public CompletableFuture<axy> a(String var1);

    public CompletableFuture<List<axy>> a(List<String> var1);
}

