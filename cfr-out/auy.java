/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public interface auy {
    public List<axg> a();

    public @Nullable axg a(UUID var1);

    default public CompletableFuture<Optional<bbx>> a(Optional<UUID> $$0, Optional<String> $$1) {
        if ($$0.isPresent()) {
            Optional<bbx> $$2 = this.c($$0.get());
            if ($$2.isPresent()) {
                return CompletableFuture.completedFuture($$2);
            }
            return CompletableFuture.supplyAsync(() -> this.b((UUID)$$0.get()), bhs.j());
        }
        if ($$1.isPresent()) {
            return CompletableFuture.supplyAsync(() -> this.a((String)$$1.get()), bhs.j());
        }
        return CompletableFuture.completedFuture(Optional.empty());
    }

    public Optional<bbx> a(String var1);

    public Optional<bbx> b(UUID var1);

    public Optional<bbx> c(UUID var1);

    public Optional<axg> b(Optional<UUID> var1, Optional<String> var2);

    public List<axg> b(String var1);

    public @Nullable axg c(String var1);

    public void a(axg var1, avh var2);
}

