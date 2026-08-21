/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dzv
extends dzc {
    public static final MapCodec<dzv> a = dzv.b(dzv::new);
    public static final eoy[] b = new eoy[]{eox.n, eox.o, eox.p};
    private static final fug c = fud.a(dzq.b(2.0, 2.0, 14.0), dzq.b(14.0, 0.0, 2.0));

    public MapCodec<dzv> a() {
        return a;
    }

    public dzv(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b[0], false)).b(b[1], false)).b(b[2], false));
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elf($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? null : dzv.a($$2, eld.m, elf::a);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if (!$$1.B_() && (elb2 = $$1.c_($$2)) instanceof elf) {
            elf $$5 = (elf)elb2;
            $$3.a($$5);
            $$3.a(bdk.ac);
        }
        return cdc.a;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
        double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
        double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
        $$1.a(ly.ai, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.a($$1.c_($$2));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b[0], b[1], b[2]);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

