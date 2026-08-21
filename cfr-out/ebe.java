/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ebe
extends dzc
implements ehg {
    public static final MapCodec<ebe> a = ebe.b(ebe::new);
    public static final eoy b = eox.I;
    private static final fug c = dzq.a(6.0);

    public MapCodec<ebe> a() {
        return a;
    }

    public ebe(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, true));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elo($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return ebe.a($$2, eld.A, $$0.B_() ? elo::a : elo::b);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)this.m().b(b, $$1.a(bdv.a) && $$1.e() == 8);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

