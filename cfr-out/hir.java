/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 */
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface hir {
    public static final hir a = new hir(){

        @Override
        public CompletableFuture<Optional<ddr>> a() {
            return CompletableFuture.completedFuture(Optional.empty());
        }

        @Override
        public boolean b() {
            return false;
        }
    };

    public static hir a(UserApiService $$0, gfx $$1, Path $$2) {
        return new hhv($$0, $$1.b(), $$2);
    }

    public CompletableFuture<Optional<ddr>> a();

    public boolean b();
}

