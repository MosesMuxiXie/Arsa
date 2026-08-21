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
import java.util.Optional;

public class edc
extends ejg
implements dzt {
    public static final MapCodec<edc> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amt.a(mj.aY).fieldOf("feature").forGetter($$0 -> $$0.e), (App)mi.e.q().fieldOf("grows_on").forGetter($$0 -> $$0.d), edc.x()).apply((Applicative)$$02, edc::new));
    private static final double b = 0.4;
    private static final fug c = dzq.b(8.0, 0.0, 9.0);
    private final dzq d;
    private final amt<exi<?, ?>> e;

    public MapCodec<edc> a() {
        return a;
    }

    protected edc(amt<exi<?, ?>> $$0, dzq $$1, eog.d $$2) {
        super($$2);
        this.e = $$0;
        this.d = $$1;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(bdp.aZ) || $$0.a(dzs.fU) || $$0.a(dzs.eA) || super.b($$0, $$1, $$2);
    }

    private Optional<? extends jd<exi<?, ?>>> a(dwr $$0) {
        return $$0.J_().f(mj.aY).a(this.e);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        eoh $$3 = $$0.a_($$1.e());
        return $$3.a(this.d);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return (double)$$1.i() < 0.4;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$32) {
        this.a($$0).ifPresent($$3 -> ((exi)$$3.a()).a($$0, $$0.p().g(), $$1, $$2));
    }
}

