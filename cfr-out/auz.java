/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class auz
implements auy {
    private final atw a;
    private final ary b;

    public auz(ary $$0, atw $$1) {
        this.a = $$1;
        this.b = $$0;
    }

    @Override
    public List<axg> a() {
        return this.b.bA().t();
    }

    @Override
    public @Nullable axg a(UUID $$0) {
        return this.b.bA().b($$0);
    }

    @Override
    public Optional<bbx> a(String $$0) {
        return this.b.ar().f().a($$0);
    }

    @Override
    public Optional<bbx> b(UUID $$02) {
        return Optional.ofNullable(this.b.ar().c().fetchProfile($$02, true)).map($$0 -> new bbx($$0.profile()));
    }

    @Override
    public Optional<bbx> c(UUID $$0) {
        return this.b.ar().f().a($$0);
    }

    @Override
    public Optional<axg> b(Optional<UUID> $$0, Optional<String> $$1) {
        if ($$0.isPresent()) {
            return Optional.ofNullable(this.b.bA().b($$0.get()));
        }
        if ($$1.isPresent()) {
            return Optional.ofNullable(this.b.bA().a($$1.get()));
        }
        return Optional.empty();
    }

    @Override
    public List<axg> b(String $$0) {
        return this.b.bA().b($$0);
    }

    @Override
    public void a(axg $$0, avh $$1) {
        this.b.bA().b($$0);
        this.a.a($$1, "Remove player '{}'", $$0.aq());
    }

    @Override
    public @Nullable axg c(String $$0) {
        return this.b.bA().a($$0);
    }
}

