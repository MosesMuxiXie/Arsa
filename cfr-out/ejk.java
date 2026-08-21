/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class ejk
extends ehf {
    public static final MapCodec<ejk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)epw.a.fieldOf("wood_type").forGetter(ehf::d), ejk.x()).apply((Applicative)$$0, ejk::new));
    public static final epf<iz> b = edt.f;
    private static final Map<iz.a, fug> c = fud.a(dzq.a(16.0, 4.0, 14.0, 16.0));
    private static final Map<iz.a, fug> e = fud.a(fud.a(c.get(iz.a.c), dzq.a(14.0, 2.0, 0.0, 10.0)));

    public MapCodec<ejk> a() {
        return a;
    }

    public ejk(epw $$0, eog.d $$1) {
        super($$0, $$1.a($$0.e()));
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(d, false));
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        ems $$7;
        elb elb2 = $$2.c_($$3);
        if (elb2 instanceof ems && this.a($$1, $$4, $$6, $$7 = (ems)elb2, $$0)) {
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    private boolean a(eoh $$0, ddm $$1, fti $$2, ems $$3, dlt $$4) {
        return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof dli && !this.a($$2, $$0);
    }

    private boolean a(fti $$0, eoh $$1) {
        return $$0.c().o() == $$1.c(b).o();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e.get($$0.c(b).o());
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return this.a($$0, $$1, $$2, ftr.a());
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(b).o());
    }

    public boolean b(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = $$0.c(b).h();
        iz $$4 = $$0.c(b).i();
        return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
    }

    public boolean a(dwr $$0, eoh $$1, is $$2, iz $$3) {
        eoh $$4 = $$0.a_($$2);
        if ($$4.a(bdp.aN)) {
            return $$4.c(b).o().a($$1.c(b));
        }
        return $$4.a((dvt)$$0, $$2, $$3, eig.a);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = this.m();
        flb $$2 = $$0.q().b_($$0.a());
        dwo $$3 = $$0.q();
        is $$4 = $$0.a();
        for (iz $$5 : $$0.f()) {
            iz $$6;
            if (!$$5.o().d() || $$5.o().a($$0.k()) || !($$1 = (eoh)$$1.b(b, $$6 = $$5.g())).a((dwr)$$3, $$4) || !this.b($$1, $$3, $$4)) continue;
            return (eoh)$$1.b(d, $$2.a() == flc.c);
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public float h(eoh $$0) {
        return $$0.c(b).p();
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, d);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emd($$0, $$1);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return ejk.a($$2, eld.i, ems::a);
    }
}

