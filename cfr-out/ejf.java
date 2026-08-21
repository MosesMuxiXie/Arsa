/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ejf
extends dzc {
    public static final MapCodec<ejf> a = ejf.b(ejf::new);
    public static final epk<ens> b = eox.bE;
    public static final epf<iz> c = edt.f;
    public static final eoy d = eox.bG;

    public MapCodec<ejf> a() {
        return a;
    }

    public ejf(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, iz.c)).b(b, ens.a)).b(d, false));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$0.f() || $$1.c(b) != ens.b) {
            return cdc.f;
        }
        if ($$2 instanceof axf) {
            void $$9;
            axf $$7 = (axf)$$2;
            elb elb2 = $$7.c_($$3);
            if (!(elb2 instanceof enn)) {
                return cdc.f;
            }
            enn $$8 = (enn)elb2;
            enn.b.a($$7, $$3, $$1, $$9.f(), $$9.a(), $$9.c(), $$4, $$0);
        }
        return cdc.b;
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new enn($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, b, d);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$02, eoh $$12, eld<T> $$22) {
        elc<T> elc2;
        if ($$02 instanceof axf) {
            axf $$32 = (axf)$$02;
            elc2 = ejf.a($$22, eld.T, (dwo $$1, is $$2, eoh $$3, ? super E $$4) -> enn.b.a($$32, $$2, $$3, $$4.f(), $$4.a(), $$4.c()));
        } else {
            elc2 = ejf.a($$22, eld.T, (dwo $$0, is $$1, eoh $$2, ? super E $$3) -> enn.a.a($$0, $$1, $$2, $$3.d(), $$3.c()));
        }
        return elc2;
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(c, $$0.g().g());
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }
}

