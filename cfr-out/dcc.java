/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dcc
extends dcd {
    public dcc(cgu<? extends dcc> $$0, dwo $$1) {
        super((cgu<? extends dcd>)$$0, $$1);
    }

    public static cir.a k() {
        return dcd.p().a(cis.u, 12.0);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        if (super.c($$0, $$1)) {
            if ($$1 instanceof chl) {
                int $$2 = 0;
                if (this.ao().av() == ccz.c) {
                    $$2 = 7;
                } else if (this.ao().av() == ccz.d) {
                    $$2 = 15;
                }
                if ($$2 > 0) {
                    ((chl)$$1).b(new cfm(cfo.s, $$2 * 20, 0), (cgk)this);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        return $$3;
    }

    @Override
    public ftm m(cgk $$0) {
        if ($$0.dF() <= this.dF()) {
            return new ftm(0.0, 0.21875 * (double)this.eF(), 0.0);
        }
        return super.m($$0);
    }
}

