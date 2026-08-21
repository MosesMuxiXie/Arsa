/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gmx
implements gnb {
    private static final amo e = amo.b("toast/advancement");
    public static final int a = 5000;
    private final ac f;
    private gnb.a g = gnb.a.b;

    public gmx(ac $$0) {
        this.f = $$0;
    }

    @Override
    public gnb.a a() {
        return this.g;
    }

    @Override
    public void a(gnc $$0, long $$1) {
        ao $$2 = this.f.b().c().orElse(null);
        if ($$2 == null) {
            this.g = gnb.a.b;
            return;
        }
        this.g = (double)$$1 >= 5000.0 * $$0.f() ? gnb.a.b : gnb.a.a;
    }

    @Override
    public @Nullable bcz b() {
        return this.c() ? bda.DP : null;
    }

    private boolean c() {
        Optional<ao> $$0 = this.f.b().c();
        return $$0.isPresent() && $$0.get().e().equals(ai.b);
    }

    @Override
    public void a(gir $$0, gio $$1, long $$2) {
        int $$5;
        ao $$3 = this.f.b().c().orElse(null);
        $$0.a(hpa.at, e, 0, 0, this.e(), this.f());
        if ($$3 == null) {
            return;
        }
        List<bfr> $$4 = $$1.c($$3.a(), 125);
        int n2 = $$5 = $$3.e() == ai.b ? -30465 : -256;
        if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
        } else {
            int $$6 = 1500;
            float $$7 = 300.0f;
            if ($$2 < 1500L) {
                int $$8 = bgj.b(bgj.a((float)(1500L - $$2) / 300.0f, 0.0f, 1.0f) * 255.0f);
                $$0.a($$1, $$3.e().b(), 30, 11, bel.f($$8, $$5), false);
            } else {
                int $$9 = bgj.b(bgj.a((float)($$2 - 1500L) / 300.0f, 0.0f, 1.0f) * 252.0f);
                int $$10 = this.f() / 2 - $$4.size() * $$1.b / 2;
                for (bfr $$11 : $$4) {
                    $$0.a($$1, $$11, 30, $$10, bel.i($$9), false);
                    $$10 += $$1.b;
                }
            }
        }
        $$0.b($$3.c(), 8, 8);
    }
}

