/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class hjy {
    public static final hjy a = new hjy(hjx.b, hjz.createDnsSrvRedirectHandler(), hju.a());
    private final hjx b;
    private final hjz c;
    private final hju d;

    @VisibleForTesting
    hjy(hjx $$0, hjz $$1, hju $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public Optional<hjv> a(hjw $$0) {
        Optional<hjv> $$1 = this.b.resolve($$0);
        if ($$1.isPresent() && !this.d.a($$1.get()) || !this.d.a($$0)) {
            return Optional.empty();
        }
        Optional<hjw> $$2 = this.c.lookupRedirect($$0);
        if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
        }
        return $$1;
    }
}

