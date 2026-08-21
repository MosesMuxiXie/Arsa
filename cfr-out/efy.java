/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efy
extends dzf {
    public static final MapCodec<efy> b = efy.b(efy::new);
    public static final epf<epl> c = eox.ak;

    public MapCodec<efy> a() {
        return b;
    }

    protected efy(eog.d $$0) {
        super(false, $$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(c, epl.a)).b(a, false));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3) {
        if ($$3.m().p() && new efz($$1, $$2, $$0).b() == 3) {
            this.a($$1, $$2, $$0, false);
        }
    }

    @Override
    public epk<epl> c() {
        return c;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        epl $$2 = $$0.c(c);
        epl $$3 = this.a($$2, $$1);
        return (eoh)$$0.b(c, $$3);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, a);
    }
}

