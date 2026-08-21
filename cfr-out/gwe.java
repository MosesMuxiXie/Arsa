/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class gwe
extends gwc {
    private static final yh a = yh.c("options.sounds.title");

    public gwe(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void o() {
        this.d.a((gfn<?>)this.c.c(bdb.a));
        this.d.a(this.J());
        this.d.a((gfn<?>)this.c.aL());
        this.d.a(this.c.ak(), this.c.al());
        this.d.a(this.c.aN(), this.c.aO());
    }

    private gfn<?>[] J() {
        return (gfn[])Arrays.stream(bdb.values()).filter($$0 -> $$0 != bdb.a).map(this.c::c).toArray(gfn[]::new);
    }
}

