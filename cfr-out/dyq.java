/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class dyq
extends ecr {
    public static final MapCodec<dyq> a = dyq.b(dyq::new);
    public static final epf<iz> b = edt.f;
    private static final Map<iz.a, fug> c = fud.a(fud.a(dzq.b(12.0, 0.0, 4.0), dzq.a(8.0, 10.0, 4.0, 5.0), dzq.a(4.0, 8.0, 5.0, 10.0), dzq.a(10.0, 16.0, 10.0, 16.0)));
    private static final yh d = yh.c("container.repair");
    private static final float e = 2.0f;
    private static final int f = 40;

    public MapCodec<dyq> a() {
        return a;
    }

    public dyq(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.c));
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.g().h());
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
            $$3.a(bdk.aE);
        }
        return cdc.a;
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$22) {
        return new cdl(($$2, $$3, $$4) -> new dhm($$2, $$3, dhw.a($$1, $$22)), d);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(b).o());
    }

    @Override
    protected void a(czk $$0) {
        $$0.b(2.0f, 40);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, eoh $$3, czk $$4) {
        if (!$$4.bq()) {
            $$0.c(1031, $$1, 0);
        }
    }

    @Override
    public void a(dwo $$0, is $$1, czk $$2) {
        if (!$$2.bq()) {
            $$0.c(1029, $$1, 0);
        }
    }

    @Override
    public cex a(cgk $$0) {
        return $$0.en().b($$0);
    }

    public static @Nullable eoh e(eoh $$0) {
        if ($$0.a(dzs.hJ)) {
            return (eoh)dzs.hK.m().b(b, $$0.c(b));
        }
        if ($$0.a(dzs.hK)) {
            return (eoh)dzs.hL.m().b(b, $$0.c(b));
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    public int b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a((dvt)$$1, (is)$$2).ak;
    }
}

