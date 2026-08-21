/*
 * Decompiled with CFR 0.152.
 */
public class gwh
extends gwc {
    private static final yh a = yh.c("controls.title");

    private static gfn<?>[] a(gfo $$0) {
        return new gfn[]{$$0.aq(), $$0.ar(), $$0.as(), $$0.at(), $$0.T(), $$0.au(), $$0.V()};
    }

    public gwh(gsb $$0, gfo $$1) {
        super($$0, $$1, a);
    }

    @Override
    protected void o() {
        this.d.a(gje.a(yh.c("options.mouse_settings"), (gje $$0) -> this.n.a(new gvz(this, this.c))).a(), gje.a(yh.c("controls.keybinds"), (gje $$0) -> this.n.a(new gwj(this, this.c))).a());
        this.d.a(gwh.a(this.c));
    }
}

