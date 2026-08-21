/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekk
extends ecy {
    public static final MapCodec<ekk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)b.forGetter(ecy::c), ekk.x()).apply((Applicative)$$0, ekk::new));

    public MapCodec<ekk> a() {
        return a;
    }

    public ekk(jd<cfk> $$0, float $$1, eog.d $$2) {
        this(ekk.a($$0, $$1), $$2);
    }

    public ekk(dpa $$0, eog.d $$1) {
        super($$0, $$1);
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return super.b($$0, $$1, $$2) || $$0.a(dzs.ey) || $$0.a(dzs.ez) || $$0.a(dzs.eA);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        fug $$4 = this.a($$0, (dvt)$$1, $$2, ftr.a());
        ftm $$5 = $$4.a().f();
        double $$6 = (double)$$2.u() + $$5.g;
        double $$7 = (double)$$2.w() + $$5.i;
        for (int $$8 = 0; $$8 < 3; ++$$8) {
            if (!$$3.h()) continue;
            $$1.a(ly.ai, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1 instanceof axf) {
            chl $$7;
            axf $$6 = (axf)$$1;
            if ($$1.av() != ccz.a && $$3 instanceof chl && !($$7 = (chl)$$3).a($$6, $$1.as().r())) {
                $$7.a(this.b());
            }
        }
    }

    @Override
    public cfm b() {
        return new cfm(cfo.t, 40);
    }
}

