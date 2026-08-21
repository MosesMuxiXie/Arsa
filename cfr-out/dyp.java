/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class dyp
extends dyo
implements ehg {
    public static final MapCodec<dyp> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("height").forGetter($$0 -> Float.valueOf($$0.e)), (App)Codec.FLOAT.fieldOf("width").forGetter($$0 -> Float.valueOf($$0.f)), dyp.x()).apply((Applicative)$$02, dyp::new));
    public static final eoy c = eox.I;
    public static final epf<iz> d = eox.R;
    private final float e;
    private final float f;
    private final Map<iz, fug> g;

    public MapCodec<dyp> a() {
        return b;
    }

    public dyp(float $$0, float $$1, eog.d $$2) {
        super($$2);
        this.l((eoh)((eoh)this.m().b(c, false)).b(d, iz.b));
        this.g = fud.d(dzq.c($$1, 16.0f - $$0, 16.0));
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.g.get($$0.c(d));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = $$0.c(d);
        is $$4 = $$2.a($$3.g());
        return $$1.a_($$4).c((dvt)$$1, $$4, $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == $$0.c(d).g() && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        return (eoh)((eoh)this.m().b(c, $$1.b_($$2).a() == flc.c)).b(d, $$0.k());
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(d, $$1.a($$0.c(d)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(d)));
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d);
    }
}

