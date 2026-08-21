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

public class efb
extends ejg
implements dzt {
    public static final MapCodec<efb> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amt.a(mj.aY).fieldOf("feature").forGetter($$0 -> $$0.c), efb.x()).apply((Applicative)$$02, efb::new));
    private static final fug b = dzq.b(6.0, 0.0, 6.0);
    private final amt<exi<?, ?>> c;

    public MapCodec<efb> a() {
        return a;
    }

    public efb(amt<exi<?, ?>> $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(25) == 0) {
            int $$4 = 5;
            int $$5 = 4;
            for (is $$6 : is.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
                if (!$$1.a_($$6).a(this) || --$$4 > 0) continue;
                return;
            }
            is $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
            for (int $$8 = 0; $$8 < 4; ++$$8) {
                if ($$1.A($$7) && $$0.a((dwr)$$1, $$7)) {
                    $$2 = $$7;
                }
                $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
            }
            if ($$1.A($$7) && $$0.a((dwr)$$1, $$7)) {
                $$1.a($$7, $$0, 2);
            }
        }
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.s();
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        if ($$4.a(bdp.bl)) {
            return true;
        }
        return $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
    }

    public boolean a(axf $$0, is $$1, eoh $$2, bgr $$3) {
        Optional $$4 = $$0.J_().f(mj.aY).a(this.c);
        if ($$4.isEmpty()) {
            return false;
        }
        $$0.a($$1, false);
        if (((exi)((jd)$$4.get()).a()).a($$0, $$0.p().g(), $$3, $$1)) {
            return true;
        }
        $$0.a($$1, $$2, 3);
        return false;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return (double)$$1.i() < 0.4;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        this.a($$0, $$2, $$3, $$1);
    }
}

