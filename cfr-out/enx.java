/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class enx
extends dzc {
    public static final MapCodec<enx> a = enx.b(enx::new);
    public static final epf<iz> b = enz.a;
    public static final epf<epj> c = enz.c;

    public MapCodec<enx> a() {
        return a;
    }

    public enx(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, epj.a));
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return null;
    }

    public static elb a(is $$0, eoh $$1, eoh $$2, iz $$3, boolean $$4, boolean $$5) {
        return new eob($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return enx.a($$2, eld.l, eob::a);
    }

    @Override
    public void a(dwp $$0, is $$1, eoh $$2) {
        is $$3 = $$1.a($$2.c(b).g());
        eoh $$4 = $$0.a_($$3);
        if ($$4.b() instanceof eny && $$4.c(eny.c).booleanValue()) {
            $$0.a($$3, false);
        }
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_() && $$1.c_($$2) == null) {
            $$1.a($$2, false);
            return cdc.c;
        }
        return cdc.e;
    }

    @Override
    protected List<dlt> a(eoh $$0, fod.a $$1) {
        eob $$2 = this.a((dvt)$$1.a(), is.a($$1.a(fqx.h)));
        if ($$2 == null) {
            return Collections.emptyList();
        }
        return $$2.h().a($$1);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        eob $$4 = this.a($$1, $$2);
        if ($$4 != null) {
            return $$4.a($$1, $$2);
        }
        return fud.a();
    }

    private @Nullable eob a(dvt $$0, is $$1) {
        elb $$2 = $$0.c_($$1);
        if ($$2 instanceof eob) {
            return (eob)$$2;
        }
        return null;
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return dlt.l;
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
        $$0.a(b, c);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

