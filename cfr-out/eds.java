/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class eds
extends dzc {
    public static final MapCodec<eds> a = eds.b(eds::new);
    public static final epf<iz> b = eox.S;
    public static final eoy c = eox.i;
    private final Function<eoh, fug> d;
    private final Map<iz, fug> e;

    public MapCodec<eds> a() {
        return a;
    }

    public eds(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.a)).b(c, true));
        fug $$1 = dzq.b(12.0, 11.0, 16.0);
        this.d = this.b($$1);
        this.e = ImmutableMap.builderWithExpectedSize((int)5).putAll(fud.c(fud.a($$1, dzq.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put((Object)iz.a, (Object)$$1).build();
    }

    private Function<eoh, fug> b(fug $$0) {
        fug $$1 = fud.a(dzq.b(16.0, 10.0, 16.0), dzq.b(8.0, 4.0, 10.0));
        fug $$22 = fud.a($$1, $$0, ftq.e);
        Map<iz, fug> $$3 = fud.c(dzq.a(4.0, 4.0, 8.0, 0.0, 8.0), new ftm(8.0, 6.0, 8.0).c(0.0625));
        return this.a((eoh $$2) -> fud.a($$22, fud.a((fug)$$3.get($$2.c(b)), fud.b(), ftq.i)), c);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.d.apply($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2) {
        return this.e.get($$0.c(b));
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$1 = $$0.k().g();
        return (eoh)((eoh)this.m().b(b, $$1.o() == iz.a.b ? iz.a : $$1)).b(c, true);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emf($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? null : eds.a($$2, eld.s, emf::a);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2, $$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if (!$$1.B_() && (elb2 = $$1.c_($$2)) instanceof emf) {
            emf $$5 = (emf)elb2;
            $$3.a($$5);
            $$3.a(bdk.af);
        }
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        this.a($$1, $$2, $$0);
    }

    private void a(dwo $$0, is $$1, eoh $$2) {
        boolean $$3;
        boolean bl2 = $$3 = !$$0.I($$1);
        if ($$3 != $$2.c(c)) {
            $$0.a($$1, (eoh)$$2.b(c, $$3), 2);
        }
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
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        elb $$6 = $$1.c_($$2);
        if ($$6 instanceof emf) {
            emf.a($$1, $$2, $$0, $$3, (emf)$$6);
        }
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

