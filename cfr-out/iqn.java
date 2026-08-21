/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class iqn {
    private final bbc a;
    private final Map<amo, CompletableFuture<fwl>> b = Maps.newHashMap();

    public iqn(bbc $$0) {
        this.a = $$0;
    }

    public CompletableFuture<fwl> a(amo $$02) {
        return this.b.computeIfAbsent($$02, $$0 -> CompletableFuture.supplyAsync(() -> {
            try (InputStream $$1 = this.a.open((amo)$$0);){
                fwl fwl2;
                try (iqk $$2 = new iqk($$1);){
                    ByteBuffer $$3 = $$2.b();
                    fwl2 = new fwl($$3, $$2.a());
                }
                return fwl2;
            }
            catch (IOException $$4) {
                throw new CompletionException($$4);
            }
        }, bhs.j()));
    }

    public CompletableFuture<iqf> a(amo $$0, boolean $$1) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                InputStream $$2 = this.a.open($$0);
                return $$1 ? new iql(iqk::new, $$2) : new iqk($$2);
            }
            catch (IOException $$3) {
                throw new CompletionException($$3);
            }
        }, bhs.j());
    }

    public void a() {
        this.b.values().forEach($$0 -> $$0.thenAccept(fwl::b));
        this.b.clear();
    }

    public CompletableFuture<?> a(Collection<ipj> $$02) {
        return CompletableFuture.allOf((CompletableFuture[])$$02.stream().map($$0 -> this.a($$0.b())).toArray(CompletableFuture[]::new));
    }
}

