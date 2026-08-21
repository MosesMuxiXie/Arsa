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
import java.util.List;

public class fgq
extends fgw {
    public static final MapCodec<fgq> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fes.b.fieldOf("feature").forGetter($$0 -> $$0.c), fgq.f()).apply((Applicative)$$02, fgq::new));
    private static final amo b = amo.b("bottom");
    private final jd<fes> c;
    private final uz d;

    protected fgq(jd<fes> $$0, fgy.a $$1) {
        super($$1);
        this.c = $$0;
        this.d = this.b();
    }

    private uz b() {
        uz $$0 = new uz();
        $$0.a("name", amo.a, b);
        $$0.a("final_state", "minecraft:air");
        $$0.a("pool", emg.a, qy.a);
        $$0.a("target", amo.a, emg.b);
        $$0.a("joint", emg.a.c, emg.a.a);
        return $$0;
    }

    @Override
    public jy a(fjr $$0, egm $$1) {
        return jy.i;
    }

    @Override
    public List<fjq.a> a(fjr $$0, is $$1, egm $$2, bgr $$3) {
        return List.of(fjq.a.a(new fjq.d($$1, (eoh)dzs.pZ.m().b(edz.b, jb.a(iz.a, iz.d)), this.d)));
    }

    @Override
    public ffg a(fjr $$0, is $$1, egm $$2) {
        jy $$3 = this.a($$0, $$2);
        return new ffg($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
    }

    @Override
    public boolean a(fjr $$0, dxn $$1, dxk $$2, eqg $$3, is $$4, is $$5, egm $$6, ffg $$7, bgr $$8, fja $$9, boolean $$10) {
        return this.c.a().a($$1, $$3, $$8, $$4);
    }

    @Override
    public fgx<?> a() {
        return fgx.c;
    }

    public String toString() {
        return "Feature[" + String.valueOf(this.c) + "]";
    }
}

