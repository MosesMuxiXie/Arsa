/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edz
extends dzq
implements ecn,
ede {
    public static final MapCodec<edz> a = edz.b(edz::new);
    public static final epf<jb> b = eox.W;

    public MapCodec<edz> a() {
        return a;
    }

    protected edz(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, jb.k));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a().a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(b, $$1.a().a($$0.c(b)));
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$3;
        iz $$1 = $$0.k();
        if ($$1.o() == iz.a.b) {
            iz $$2 = $$0.g().g();
        } else {
            $$3 = iz.b;
        }
        return (eoh)this.m().b(b, jb.a($$1, $$3));
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emg($$0, $$1);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb $$5 = $$1.c_($$2);
        if ($$5 instanceof emg && $$3.hi()) {
            $$3.a((emg)$$5);
            return cdc.a;
        }
        return cdc.e;
    }

    public static boolean a(fjq.a $$0, fjq.a $$1) {
        iz $$2 = edz.p($$0.a().b());
        iz $$3 = edz.p($$1.a().b());
        iz $$4 = edz.q($$0.a().b());
        iz $$5 = edz.q($$1.a().b());
        emg.a $$6 = $$0.b();
        boolean $$7 = $$6 == emg.a.a;
        return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
    }

    public static iz p(eoh $$0) {
        return $$0.c(b).a();
    }

    public static iz q(eoh $$0) {
        return $$0.c(b).b();
    }
}

