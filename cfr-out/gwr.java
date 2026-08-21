/*
 * Decompiled with CFR 0.152.
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;

public class gwr
extends gwv<dhj> {
    private static final gku h = new gku(amo.b("recipe_book/filter_enabled"), amo.b("recipe_book/filter_disabled"), amo.b("recipe_book/filter_enabled_highlighted"), amo.b("recipe_book/filter_disabled_highlighted"));
    private static final yh i = yh.c("gui.recipebook.toggleRecipes.craftable");
    private static final List<gwv.a> j = List.of(new gwv.a(gxb.a), new gwv.a(dlx.qK, dlx.qC, dqu.c), new gwv.a(dlx.eS, dqu.a), new gwv.a(dlx.sm, dlx.pV, dqu.d), new gwv.a(dlx.mB, dqu.b));

    public gwr(dhj $$0) {
        super($$0, j);
    }

    @Override
    protected boolean a(dji $$0) {
        return ((dhj)this.f).m() == $$0 || ((dhj)this.f).n().contains($$0);
    }

    private boolean b(dry $$0) {
        int $$1 = ((dhj)this.f).o();
        int $$2 = ((dhj)this.f).p();
        dry dry2 = $$0;
        Objects.requireNonNull(dry2);
        dry dry3 = dry2;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{dsc.class, dsd.class}, (Object)dry3, n2)) {
            case 0 -> {
                dsc $$3 = (dsc)dry3;
                if ($$1 >= $$3.b() && $$2 >= $$3.c()) {
                    yield true;
                }
                yield false;
            }
            case 1 -> {
                dsd $$4 = (dsd)dry3;
                if ($$1 * $$2 >= $$4.b().size()) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    protected void a(gwt $$0, dry $$1, bhx $$2) {
        $$0.b(((dhj)this.f).m(), $$2, $$1.d());
        dry dry2 = $$1;
        Objects.requireNonNull(dry2);
        dry dry3 = dry2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{dsc.class, dsd.class}, (Object)dry3, n2)) {
            case 0: {
                dsc $$32 = (dsc)dry3;
                List<dji> $$42 = ((dhj)this.f).n();
                ame.a(((dhj)this.f).o(), ((dhj)this.f).p(), $$32.b(), $$32.c(), $$32.f(), ($$3, $$4, $$5, $$6) -> {
                    dji $$7 = (dji)$$42.get($$4);
                    $$0.a($$7, $$2, (dse)$$3);
                });
                break;
            }
            case 1: {
                dsd $$52 = (dsd)dry3;
                List<dji> $$62 = ((dhj)this.f).n();
                int $$7 = Math.min($$52.b().size(), $$62.size());
                for (int $$8 = 0; $$8 < $$7; ++$$8) {
                    $$0.a($$62.get($$8), $$2, $$52.b().get($$8));
                }
                break;
            }
        }
    }

    @Override
    protected gku a() {
        return h;
    }

    @Override
    protected yh d() {
        return i;
    }

    @Override
    protected void a(gwz $$0, ddu $$1) {
        $$0.a($$1, this::b);
    }
}

