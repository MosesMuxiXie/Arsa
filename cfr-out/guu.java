/*
 * Decompiled with CFR 0.152.
 */
public class guu
extends gje {
    private static final amo a = amo.b("widget/page_forward_highlighted");
    private static final amo b = amo.b("widget/page_forward");
    private static final amo c = amo.b("widget/page_backward_highlighted");
    private static final amo d = amo.b("widget/page_backward");
    private static final yh u = yh.c("book.page_button.next");
    private static final yh v = yh.c("book.page_button.previous");
    private final boolean w;
    private final boolean x;

    public guu(int $$0, int $$1, boolean $$2, gje.c $$3, boolean $$4) {
        super($$0, $$1, 23, 13, $$2 ? u : v, $$3, r);
        this.w = $$2;
        this.x = $$4;
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        amo $$5;
        if (this.w) {
            amo $$4 = this.D() ? a : b;
        } else {
            $$5 = this.D() ? c : d;
        }
        $$0.a(hpa.at, $$5, this.aT_(), this.aU_(), 23, 13);
    }

    @Override
    public void a(iqr $$0) {
        if (this.x) {
            $$0.a(iph.a(bda.cK, 1.0f));
        }
    }

    @Override
    public boolean H() {
        return false;
    }
}

