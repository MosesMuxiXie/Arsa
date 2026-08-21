/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dmq
extends dkb {
    public dmq(dzq $$0, dlp.a $$1) {
        super($$0, $$1);
    }

    @Override
    public @Nullable dpu b(dpu $$0) {
        dzq $$4;
        is $$1 = $$0.a();
        dwo $$2 = $$0.q();
        eoh $$3 = $$2.a_($$1);
        if ($$3.a($$4 = this.c())) {
            iz $$6;
            if ($$0.h()) {
                iz $$5 = $$0.m() ? $$0.k().g() : $$0.k();
            } else {
                $$6 = $$0.k() == iz.b ? $$0.g() : iz.b;
            }
            int $$7 = 0;
            is.a $$8 = $$1.k().c($$6);
            while ($$7 < 7) {
                if (!$$2.B_() && !$$2.n($$8)) {
                    ddm $$9 = $$0.o();
                    int $$10 = $$2.aw();
                    if (!($$9 instanceof axg) || $$8.v() <= $$10) break;
                    ((axg)$$9).b(yh.a("build.tooHigh", $$10).a(l.m), true);
                    break;
                }
                $$3 = $$2.a_($$8);
                if (!$$3.a(this.c())) {
                    if (!$$3.a($$0)) break;
                    return dpu.a($$0, $$8, $$6);
                }
                $$8.c($$6);
                if (!$$6.o().d()) continue;
                ++$$7;
            }
            return null;
        }
        if (egp.a($$2, $$1) == 7) {
            return null;
        }
        return $$0;
    }

    @Override
    protected boolean b() {
        return false;
    }
}

