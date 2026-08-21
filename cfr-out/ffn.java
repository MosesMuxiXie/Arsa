/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public abstract class ffn
extends ffo {
    private final a d;
    private final int e;
    private final int f;

    protected ffn(a $$0, int $$1, int $$2, ffo.c $$3) {
        super($$3);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        if (ffn.a($$0, this.e, this.f) < $$0.b().f()) {
            return Optional.empty();
        }
        return ffn.a($$0, euq.a.a, $$1 -> this.a((fgg)$$1, $$0));
    }

    private void a(fgg $$0, ffo.a $$1) {
        dvu $$2 = $$1.h();
        $$0.a(this.d.construct($$1.f(), $$2.e(), $$2.f()));
    }

    @FunctionalInterface
    protected static interface a {
        public ffs construct(evp var1, int var2, int var3);
    }
}

