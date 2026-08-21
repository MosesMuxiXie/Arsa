/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dkj
extends dlp {
    private static final yh a = yh.c("item.minecraft.lodestone_compass");

    public dkj(dlp.a $$0) {
        super($$0);
    }

    @Override
    public boolean d_(dlt $$0) {
        return $$0.c(ki.ao) || super.d_($$0);
    }

    @Override
    public void a(dlt $$0, axf $$1, cgk $$2, @Nullable cgv $$3) {
        dor $$5;
        dor $$4 = $$0.a(ki.ao);
        if ($$4 != null && ($$5 = $$4.a($$1)) != $$4) {
            $$0.b(ki.ao, $$5);
        }
    }

    @Override
    public cdc a(dpw $$0) {
        is $$1 = $$0.a();
        dwo $$2 = $$0.q();
        if ($$2.a_($$1).a(dzs.qq)) {
            $$2.a(null, $$1, bda.qy, bdb.h, 1.0f, 1.0f);
            ddm $$3 = $$0.o();
            dlt $$4 = $$0.n();
            boolean $$5 = !$$3.gv() && $$4.N() == 1;
            dor $$6 = new dor(Optional.of(jc.a($$2.aq(), $$1)), true);
            if ($$5) {
                $$4.b(ki.ao, $$6);
            } else {
                dlt $$7 = $$4.a(dlx.sG, 1);
                $$4.a(1, (chl)$$3);
                $$7.b(ki.ao, $$6);
                if (!$$3.gK().g($$7)) {
                    $$3.a($$7, false);
                }
            }
            return cdc.a;
        }
        return super.a($$0);
    }

    @Override
    public yh a(dlt $$0) {
        return $$0.c(ki.ao) ? a : super.a($$0);
    }
}

