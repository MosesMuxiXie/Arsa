/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface yi {
    default public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        return Optional.empty();
    }

    default public <T> Optional<T> a(yn.a<T> $$0) {
        return Optional.empty();
    }

    default public yw a(@Nullable ed $$0, @Nullable cgk $$1, int $$2) throws CommandSyntaxException {
        return yw.a(this);
    }

    public MapCodec<? extends yi> a();
}

