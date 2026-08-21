/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class gws
extends gwv<dhk> {
    private static final gku h = new gku(amo.b("recipe_book/furnace_filter_enabled"), amo.b("recipe_book/furnace_filter_disabled"), amo.b("recipe_book/furnace_filter_enabled_highlighted"), amo.b("recipe_book/furnace_filter_disabled_highlighted"));
    private final yh i;

    public gws(dhk $$0, yh $$1, List<gwv.a> $$2) {
        super($$0, $$2);
        this.i = $$1;
    }

    @Override
    protected gku a() {
        return h;
    }

    @Override
    protected boolean a(dji $$0) {
        return switch ($$0.d) {
            case 0, 1, 2 -> true;
            default -> false;
        };
    }

    @Override
    protected void a(gwt $$0, dry $$1, bhx $$2) {
        $$0.b(((dhk)this.f).l(), $$2, $$1.d());
        if ($$1 instanceof drx) {
            drx $$3 = (drx)$$1;
            $$0.a((dji)((dhk)this.f).k.get(0), $$2, $$3.b());
            dji $$4 = (dji)((dhk)this.f).k.get(1);
            if ($$4.g().f()) {
                $$0.a($$4, $$2, $$3.c());
            }
        }
    }

    @Override
    protected yh d() {
        return this.i;
    }

    @Override
    protected void a(gwz $$02, ddu $$1) {
        $$02.a($$1, (dry $$0) -> $$0 instanceof drx);
    }
}

