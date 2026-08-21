/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.UUID;

public class hni
implements bca {
    private final gfj a;
    private final bca b;

    public hni(gfj $$0, bca $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public Optional<GameProfile> a(String $$0) {
        hiq $$2;
        hig $$1 = this.a.R();
        if ($$1 != null && ($$2 = $$1.b($$0)) != null) {
            return Optional.of($$2.a());
        }
        return this.b.a($$0);
    }

    @Override
    public Optional<GameProfile> a(UUID $$0) {
        hiq $$2;
        hig $$1 = this.a.R();
        if ($$1 != null && ($$2 = $$1.a($$0)) != null) {
            return Optional.of($$2.a());
        }
        return this.b.a($$0);
    }
}

