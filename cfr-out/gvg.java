/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.math.Fraction
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public class gvg
implements gvi {
    private static final amo a = amo.b("container/bundle/bundle_progressbar_border");
    private static final amo b = amo.b("container/bundle/bundle_progressbar_fill");
    private static final amo c = amo.b("container/bundle/bundle_progressbar_full");
    private static final amo d = amo.b("container/bundle/slot_highlight_back");
    private static final amo e = amo.b("container/bundle/slot_highlight_front");
    private static final amo f = amo.b("container/bundle/slot_background");
    private static final int g = 4;
    private static final int h = 24;
    private static final int i = 96;
    private static final int j = 13;
    private static final int k = 96;
    private static final int l = 1;
    private static final int m = 94;
    private static final int n = 4;
    private static final yh o = yh.c("item.minecraft.bundle.full");
    private static final yh p = yh.c("item.minecraft.bundle.empty");
    private static final yh q = yh.c("item.minecraft.bundle.empty.description");
    private final dnz r;

    public gvg(dnz $$0) {
        this.r = $$0;
    }

    @Override
    public int a(gio $$0) {
        return this.r.g() ? gvg.c($$0) : this.b();
    }

    @Override
    public int b(gio $$0) {
        return 96;
    }

    @Override
    public boolean a() {
        return true;
    }

    private static int c(gio $$0) {
        return gvg.d($$0) + 13 + 8;
    }

    private int b() {
        return this.c() + 13 + 8;
    }

    private int c() {
        return this.d() * 24;
    }

    private int a(int $$0) {
        return ($$0 - 96) / 2;
    }

    private int d() {
        return bgj.f(this.e(), 4);
    }

    private int e() {
        return Math.min(12, this.r.e());
    }

    @Override
    public void a(gio $$0, int $$1, int $$2, int $$3, int $$4, gir $$5) {
        if (this.r.g()) {
            this.b($$0, $$1, $$2, $$3, $$4, $$5);
        } else {
            this.c($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    private void b(gio $$0, int $$1, int $$2, int $$3, int $$4, gir $$5) {
        gvg.b($$1 + this.a($$3), $$2, $$0, $$5);
        this.a($$1 + this.a($$3), $$2 + gvg.d($$0) + 4, $$0, $$5);
    }

    private void c(gio $$0, int $$1, int $$2, int $$3, int $$4, gir $$5) {
        boolean $$6 = this.r.e() > 12;
        List<dlt> $$7 = this.b(this.r.a());
        int $$8 = $$1 + this.a($$3) + 96;
        int $$9 = $$2 + this.d() * 24;
        int $$10 = 1;
        for (int $$11 = 1; $$11 <= this.d(); ++$$11) {
            for (int $$12 = 1; $$12 <= 4; ++$$12) {
                int $$13 = $$8 - $$12 * 24;
                int $$14 = $$9 - $$11 * 24;
                if (gvg.a($$6, $$12, $$11)) {
                    gvg.a($$13, $$14, this.a($$7), $$0, $$5);
                    continue;
                }
                if (!gvg.a($$7, $$10)) continue;
                this.a($$10, $$13, $$14, $$7, $$10, $$0, $$5);
                ++$$10;
            }
        }
        this.a($$0, $$5, $$1, $$2, $$3);
        this.a($$1 + this.a($$3), $$2 + this.c() + 4, $$0, $$5);
    }

    private List<dlt> b(int $$0) {
        int $$1 = Math.min(this.r.e(), $$0);
        return this.r.b().toList().subList(0, $$1);
    }

    private static boolean a(boolean $$0, int $$1, int $$2) {
        return $$0 && $$1 * $$2 == 1;
    }

    private static boolean a(List<dlt> $$0, int $$1) {
        return $$0.size() >= $$1;
    }

    private int a(List<dlt> $$0) {
        return this.r.b().skip($$0.size()).mapToInt(dlt::N).sum();
    }

    private void a(int $$0, int $$1, int $$2, List<dlt> $$3, int $$4, gio $$5, gir $$6) {
        int $$7 = $$3.size() - $$0;
        boolean $$8 = $$7 == this.r.h();
        dlt $$9 = $$3.get($$7);
        if ($$8) {
            $$6.a(hpa.at, d, $$1, $$2, 24, 24);
        } else {
            $$6.a(hpa.at, f, $$1, $$2, 24, 24);
        }
        $$6.a($$9, $$1 + 4, $$2 + 4, $$4);
        $$6.a($$5, $$9, $$1 + 4, $$2 + 4);
        if ($$8) {
            $$6.a(hpa.at, e, $$1, $$2, 24, 24);
        }
    }

    private static void a(int $$0, int $$1, int $$2, gio $$3, gir $$4) {
        $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, -1);
    }

    private void a(gio $$0, gir $$1, int $$2, int $$3, int $$4) {
        if (this.r.i()) {
            dlt $$5 = this.r.a(this.r.h());
            yh $$6 = $$5.B();
            int $$7 = $$0.a($$6.g());
            int $$8 = $$2 + $$4 / 2 - 12;
            gvi $$9 = gvi.a($$6.g());
            $$1.a($$0, List.of($$9), $$8 - $$7 / 2, $$3 - 15, gvk.a, $$5.a(ki.K));
        }
    }

    private void a(int $$0, int $$1, gio $$2, gir $$3) {
        $$3.a(hpa.at, this.g(), $$0 + 1, $$1, this.f(), 13);
        $$3.a(hpa.at, a, $$0, $$1, 96, 13);
        yh $$4 = this.h();
        if ($$4 != null) {
            $$3.a($$2, $$4, $$0 + 48, $$1 + 3, -1);
        }
    }

    private static void b(int $$0, int $$1, gio $$2, gir $$3) {
        $$3.a($$2, (yn)q, $$0, $$1, 96, -5592406);
    }

    private static int d(gio $$0) {
        return $$0.c(q, 96).size() * $$0.b;
    }

    private int f() {
        return bgj.a(bgj.a(this.r.f(), 94), 0, 94);
    }

    private amo g() {
        return this.r.f().compareTo(Fraction.ONE) >= 0 ? c : b;
    }

    private @Nullable yh h() {
        if (this.r.g()) {
            return p;
        }
        if (this.r.f().compareTo(Fraction.ONE) >= 0) {
            return o;
        }
        return null;
    }
}

