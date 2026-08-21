/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class cor
extends cpm {
    private static final int i = 2;
    private static final int j = 32;
    private static final int k = 10;
    private static final int l = 7;

    public cor(cht $$0, double $$1) {
        super($$0, $$1, 240, false);
    }

    @Override
    protected @Nullable ftm h() {
        ftm $$2;
        float $$0 = this.b.ao().y.i();
        if (this.b.ao().y.i() < 0.3f) {
            return this.k();
        }
        if ($$0 < 0.7f) {
            ftm $$1 = this.l();
            if ($$1 == null) {
                $$1 = this.m();
            }
        } else {
            $$2 = this.m();
            if ($$2 == null) {
                $$2 = this.l();
            }
        }
        return $$2 == null ? this.k() : $$2;
    }

    private @Nullable ftm k() {
        return csr.a(this.b, 10, 7);
    }

    private @Nullable ftm l() {
        axf $$0 = (axf)this.b.ao();
        List<dcx> $$1 = $$0.a(cgu.bL, this.b.dj().g(32.0), this::a);
        if ($$1.isEmpty()) {
            return null;
        }
        dcx $$2 = $$1.get(this.b.ao().y.a($$1.size()));
        ftm $$3 = $$2.dI();
        return csr.a(this.b, 10, 7, $$3);
    }

    private @Nullable ftm m() {
        jw $$0 = this.n();
        if ($$0 == null) {
            return null;
        }
        is $$1 = this.a($$0);
        if ($$1 == null) {
            return null;
        }
        return csr.a(this.b, 10, 7, ftm.c($$1));
    }

    private @Nullable jw n() {
        axf $$0 = (axf)this.b.ao();
        List $$12 = jw.a(jw.a(this.b), 2).filter($$1 -> $$0.b((jw)$$1) == 0).collect(Collectors.toList());
        if ($$12.isEmpty()) {
            return null;
        }
        return (jw)$$12.get($$0.y.a($$12.size()));
    }

    private @Nullable is a(jw $$02) {
        axf $$1 = (axf)this.b.ao();
        csx $$2 = $$1.F();
        List $$3 = $$2.c($$0 -> true, $$02.k(), 8, csx.b.b).map(csy::g).collect(Collectors.toList());
        if ($$3.isEmpty()) {
            return null;
        }
        return (is)$$3.get($$1.y.a($$3.size()));
    }

    private boolean a(dcx $$0) {
        return $$0.a(this.b.ao().au());
    }
}

