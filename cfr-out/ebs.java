/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ebs
extends dzc {
    public static final MapCodec<ebs> a = ebs.b(ebs::new);
    public static final eph b = eox.aX;
    public static final eoy c = eox.s;
    private static final fug d = dzq.b(16.0, 0.0, 6.0);

    public MapCodec<ebs> a() {
        return a;
    }

    public ebs(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, 0)).b(c, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(b);
    }

    private static void c(eoh $$0, dwo $$1, is $$2) {
        int $$3 = $$1.a(dww.a, $$2) - $$1.E_();
        float $$4 = $$1.c().a(ceg.m, $$2).floatValue() * ((float)Math.PI / 180);
        boolean $$5 = $$0.c(c);
        if ($$5) {
            $$3 = 15 - $$3;
        } else if ($$3 > 0) {
            float $$6 = $$4 < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
            $$4 += ($$6 - $$4) * 0.2f;
            $$3 = Math.round((float)$$3 * bgj.b((double)$$4));
        }
        $$3 = bgj.a($$3, 0, 15);
        if ($$0.c(b) != $$3) {
            $$1.a($$2, (eoh)$$0.b(b, $$3), 3);
        }
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$3.gY()) {
            return super.a($$0, $$1, $$2, $$3, $$4);
        }
        if (!$$1.B_()) {
            eoh $$5 = (eoh)$$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(etk.c, $$2, etk.a.a($$3, $$5));
            ebs.c($$5, $$1, $$2);
        }
        return cdc.a;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elt($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        if (!$$0.B_() && $$0.F_().e()) {
            return ebs.a($$2, eld.r, ebs::a);
        }
        return null;
    }

    private static void a(dwo $$0, is $$1, eoh $$2, elt $$3) {
        if ($$0.au() % 20L == 0L) {
            ebs.c($$2, $$0, $$1);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }
}

