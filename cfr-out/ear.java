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
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class ear
extends ehf {
    public static final MapCodec<ear> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)epw.a.fieldOf("wood_type").forGetter(ehf::d), ear.x()).apply((Applicative)$$0, ear::new));
    public static final eph b = eox.bf;
    public static final eoy c = eox.a;
    private static final fug e = dzq.b(10.0, 0.0, 16.0);
    private static final Map<Integer, fug> f = fud.c(dzq.a(14.0, 2.0, 0.0, 10.0)).entrySet().stream().collect(Collectors.toMap($$0 -> epn.a((iz)$$0.getKey()), Map.Entry::getValue));

    public MapCodec<ear> a() {
        return a;
    }

    public ear(epw $$0, eog.d $$1) {
        super($$0, $$1.a($$0.e()));
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, 0)).b(c, false)).b(d, false));
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        ems $$7;
        elb elb2 = $$2.c_($$3);
        if (elb2 instanceof ems && this.a($$4, $$6, $$7 = (ems)elb2, $$0)) {
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    private boolean a(ddm $$0, fti $$1, ems $$2, dlt $$3) {
        return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof dli && $$1.c().equals(iz.a);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.d()).a((dvt)$$1, $$2.d(), iz.a, eig.b);
    }

    @Override
    public eoh a(dpu $$0) {
        boolean $$7;
        dwo $$1 = $$0.q();
        flb $$2 = $$1.b_($$0.a());
        is $$3 = $$0.a().d();
        eoh $$4 = $$1.a_($$3);
        boolean $$5 = $$4.a(bdp.aO);
        iz $$6 = iz.a($$0.i());
        boolean bl2 = $$7 = !dzq.a($$4.g($$1, $$3), iz.a) || $$0.h();
        if ($$5 && !$$0.h()) {
            Optional<iz> $$9;
            if ($$4.b(ejk.b)) {
                iz $$8 = $$4.c(ejk.b);
                if ($$8.o().a($$6)) {
                    $$7 = false;
                }
            } else if ($$4.b(b) && ($$9 = epn.a($$4.c(b))).isPresent() && $$9.get().o().a($$6)) {
                $$7 = false;
            }
        }
        int $$10 = !$$7 ? epn.a($$6.g()) : epn.a($$0.i() + 180.0f);
        return (eoh)((eoh)((eoh)this.m().b(c, $$7)).b(b, $$10)).b(d, $$2.a() == flc.c);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f.getOrDefault($$0.c(b), e);
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return this.a($$0, $$1, $$2, ftr.a());
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && !this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public float h(eoh $$0) {
        return epn.b($$0.c(b));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b), 16));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b), 16));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emd($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return ear.a($$2, eld.i, ems::a);
    }
}

