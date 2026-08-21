/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class ecf
extends eby {
    private static final Logger f = LogUtils.getLogger();
    public static final MapCodec<ecf> e = ecf.b(ecf::new);
    private static final lg g = new lf();

    public MapCodec<ecf> a() {
        return e;
    }

    public ecf(eog.d $$0) {
        super($$0);
    }

    @Override
    protected lg a(dwo $$0, dlt $$1) {
        return g;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ely($$0, $$1);
    }

    @Override
    protected void a(axf $$0, eoh $$1, is $$2) {
        dlt $$10;
        elx $$3 = $$0.a($$2, eld.g).orElse(null);
        if ($$3 == null) {
            f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", (Object)$$2);
            return;
        }
        ld $$4 = new ld($$0, $$2, $$1, $$3);
        int $$5 = $$3.a($$0.y);
        if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            return;
        }
        dlt $$6 = $$3.a($$5);
        if ($$6.f()) {
            return;
        }
        iz $$7 = (iz)$$0.a_($$2).c(b);
        ccv $$8 = emf.a((dwo)$$0, $$2.a($$7));
        if ($$8 == null) {
            dlt $$9 = g.dispense($$4, $$6);
        } else {
            $$10 = emf.a((ccv)$$3, $$8, $$6.c(1), $$7.g());
            if ($$10.f()) {
                $$10 = $$6.v();
                $$10.h(1);
            } else {
                $$10 = $$6.v();
            }
        }
        $$3.a($$5, $$10);
    }
}

