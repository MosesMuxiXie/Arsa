/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class fiq
extends fjn {
    public static final MapCodec<fiq> a = Codec.FLOAT.fieldOf("mossiness").xmap(fiq::new, $$0 -> Float.valueOf($$0.f));
    private static final float b = 0.5f;
    private static final float c = 0.5f;
    private static final float d = 0.15f;
    private static final eoh[] e = new eoh[]{dzs.kw.m(), dzs.kD.m()};
    private final float f;

    public fiq(float $$0) {
        this.f = $$0;
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        bgr $$6 = $$5.b($$4.a());
        eoh $$7 = $$4.b();
        is $$8 = $$4.a();
        eoh $$9 = null;
        if ($$7.a(dzs.fn) || $$7.a(dzs.b) || $$7.a(dzs.fq)) {
            $$9 = this.a($$6);
        } else if ($$7.a(bdp.J)) {
            $$9 = this.a($$7, $$6);
        } else if ($$7.a(bdp.H)) {
            $$9 = this.b($$7, $$6);
        } else if ($$7.a(bdp.I)) {
            $$9 = this.c($$7, $$6);
        } else if ($$7.a(dzs.cK)) {
            $$9 = this.b($$6);
        }
        if ($$9 != null) {
            return new fjq.d($$8, $$9, $$4.c());
        }
        return $$4;
    }

    private @Nullable eoh a(bgr $$0) {
        if ($$0.i() >= 0.5f) {
            return null;
        }
        eoh[] $$1 = new eoh[]{dzs.fp.m(), fiq.a($$0, dzs.fS)};
        eoh[] $$2 = new eoh[]{dzs.fo.m(), fiq.a($$0, dzs.od)};
        return this.a($$0, $$1, $$2);
    }

    private @Nullable eoh a(eoh $$0, bgr $$1) {
        if ($$1.i() >= 0.5f) {
            return null;
        }
        eoh[] $$2 = new eoh[]{dzs.od.m($$0), dzs.or.m()};
        return this.a($$1, e, $$2);
    }

    private @Nullable eoh b(eoh $$0, bgr $$1) {
        if ($$1.i() < this.f) {
            return dzs.or.m($$0);
        }
        return null;
    }

    private @Nullable eoh c(eoh $$0, bgr $$1) {
        if ($$1.i() < this.f) {
            return dzs.oF.m($$0);
        }
        return null;
    }

    private @Nullable eoh b(bgr $$0) {
        if ($$0.i() < 0.15f) {
            return dzs.qk.m();
        }
        return null;
    }

    private static eoh a(bgr $$0, dzq $$1) {
        return (eoh)((eoh)$$1.m().b(ehz.b, iz.c.a.a($$0))).b(ehz.c, bhs.a(epg.values(), $$0));
    }

    private eoh a(bgr $$0, eoh[] $$1, eoh[] $$2) {
        if ($$0.i() < this.f) {
            return fiq.a($$0, $$2);
        }
        return fiq.a($$0, $$1);
    }

    private static eoh a(bgr $$0, eoh[] $$1) {
        return $$1[$$0.a($$1.length)];
    }

    @Override
    protected fjp<?> a() {
        return fjp.k;
    }
}

