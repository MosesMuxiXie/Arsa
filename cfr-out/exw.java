/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class exw
extends exx<fab> {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 5;
    private static final int d = 2;
    private static final int ap = 2;

    public exw(Codec<fab> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fab> $$0) {
        this.a($$0.f(), $$0.e(), $$0.b(), $$0.d());
        return true;
    }

    private void a(fab $$0, is $$1, dxn $$2, bgr $$3) {
        this.a($$0, $$2, $$3, $$1.k());
        iz $$4 = iz.c.a.a($$3);
        int $$5 = $$0.c.a($$3) - 2;
        is.a $$6 = $$1.a($$4, 2 + $$3.a(2)).k();
        this.a($$2, $$6);
        if (this.a($$2, $$5, $$6, $$4)) {
            this.a($$0, $$2, $$3, $$5, $$6, $$4);
        }
    }

    private void a(dxn $$0, is.a $$1) {
        $$1.c(iz.b, 1);
        for (int $$2 = 0; $$2 < 6; ++$$2) {
            if (this.a((dwp)$$0, (is)$$1)) {
                return;
            }
            $$1.c(iz.a);
        }
    }

    private void a(fab $$0, dxn $$1, bgr $$2, is.a $$3) {
        is $$4 = this.a($$0, $$1, $$2, $$3, Function.identity());
        this.a($$1, $$2, Set.of($$4), $$0.d);
    }

    private boolean a(dxn $$0, int $$1, is.a $$2, iz $$3) {
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$1; ++$$5) {
            if (!ezj.d($$0, $$2)) {
                return false;
            }
            if (!this.b($$0, $$2)) {
                if (++$$4 > 2) {
                    return false;
                }
            } else {
                $$4 = 0;
            }
            $$2.c($$3);
        }
        $$2.c($$3.g(), $$1);
        return true;
    }

    private void a(fab $$0, dxn $$1, bgr $$2, int $$3, is.a $$4, iz $$5) {
        HashSet<is> $$6 = new HashSet<is>();
        for (int $$7 = 0; $$7 < $$3; ++$$7) {
            $$6.add(this.a($$0, $$1, $$2, $$4, exw.a($$5)));
            $$4.c($$5);
        }
        this.a($$1, $$2, $$6, $$0.e);
    }

    private boolean a(dwp $$0, is $$1) {
        return ezj.d($$0, $$1) && this.b($$0, $$1);
    }

    private boolean b(dwp $$0, is $$1) {
        return $$0.a_($$1.e()).c((dvt)$$0, $$1, iz.b);
    }

    private is a(fab $$0, dxn $$1, bgr $$2, is.a $$3, Function<eoh, eoh> $$4) {
        $$1.a((is)$$3, $$4.apply($$0.b.a($$2, $$3)), 3);
        this.a($$1, (is)$$3);
        return $$3.j();
    }

    private void a(dxn $$0, bgr $$12, Set<is> $$2, List<fcy> $$3) {
        if (!$$3.isEmpty()) {
            fcy.a $$4 = new fcy.a($$0, this.a($$0), $$12, $$2, Set.of(), Set.of());
            $$3.forEach($$1 -> $$1.a($$4));
        }
    }

    private BiConsumer<is, eoh> a(dxn $$0) {
        return ($$1, $$2) -> $$0.a((is)$$1, (eoh)$$2, 19);
    }

    private static Function<eoh, eoh> a(iz $$0) {
        return $$1 -> (eoh)$$1.c(egl.d, $$0.o());
    }
}

