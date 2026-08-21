/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class gvz
extends gwc {
    private static final yh a = yh.c("options.mouse_settings.title");

    private static gfn<?>[] a(gfo $$0) {
        return new gfn[]{$$0.d(), $$0.an(), $$0.Q(), $$0.ag(), $$0.ae(), $$0.af(), $$0.S()};
    }

    public gvz(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void o() {
        if (fyc.a()) {
            this.d.a((gfn[])Stream.concat(Arrays.stream(gvz.a(this.c)), Stream.of(this.c.R())).toArray(gfn[]::new));
        } else {
            this.d.a(gvz.a(this.c));
        }
    }
}

