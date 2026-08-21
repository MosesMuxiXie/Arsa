/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egy
extends ejg
implements dzt,
eep {
    public static final MapCodec<egy> a = egy.b(egy::new);
    private static final fug b = dzq.b(12.0, 0.0, 12.0);

    public MapCodec<egy> a() {
        return a;
    }

    protected egy(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.c($$1, $$2, iz.b) && !$$0.a(dzs.lF);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        if ($$1.a(bdv.a) && $$1.e() == 8) {
            return super.a($$0);
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        eoh $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        if (!$$8.l()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return $$8;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.d()).a(dzs.J);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    protected flb b_(eoh $$0) {
        return flc.c.a(false);
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        eoh $$4 = dzs.bH.m();
        eoh $$5 = (eoh)$$4.b(eim.d, epd.a);
        is $$6 = $$2.d();
        $$0.a($$2, $$4, 2);
        $$0.a($$6, $$5, 2);
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        return false;
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        return false;
    }
}

