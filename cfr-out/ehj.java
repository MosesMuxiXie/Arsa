/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehj
extends edm {
    public static final MapCodec<ehj> a = ehj.b(ehj::new);

    public MapCodec<ehj> a() {
        return a;
    }

    public ehj(eog.d $$0) {
        super($$0);
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        if (!$$3.cw()) {
            $$3.a($$4, 0.0f, $$0.as().l());
        }
    }

    @Override
    public void a(dvt $$0, cgk $$1) {
        if ($$1.cw()) {
            super.a($$0, $$1);
        } else {
            this.a($$1);
        }
    }

    private void a(cgk $$0) {
        ftm $$1 = $$0.dN();
        if ($$1.h < 0.0) {
            double $$2 = $$0 instanceof chl ? 1.0 : 0.8;
            $$0.m($$1.g, -$$1.h * $$2, $$1.i);
        }
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
        double $$4 = Math.abs($$3.dN().h);
        if ($$4 < 0.1 && !$$3.cv()) {
            double $$5 = 0.4 + $$4 * 0.2;
            $$3.k($$3.dN().d($$5, 1.0, $$5));
        }
        super.a($$0, $$1, $$2, $$3);
    }
}

