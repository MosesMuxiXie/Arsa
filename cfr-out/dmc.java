/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class dmc
extends dlp {
    private static final Logger a = LogUtils.getLogger();

    public dmc(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        List $$4 = $$3.a(ki.an, List.of());
        $$3.a(1, (chl)$$1);
        if ($$4.isEmpty()) {
            return cdc.d;
        }
        if (!$$0.B_()) {
            dqz $$5 = $$0.s().aJ();
            ArrayList $$6 = new ArrayList($$4.size());
            for (amt $$7 : $$4) {
                Optional<dqx<?>> $$8 = $$5.b($$7);
                if ($$8.isPresent()) {
                    $$6.add($$8.get());
                    continue;
                }
                a.error("Invalid recipe: {}", (Object)$$7);
                return cdc.d;
            }
            $$1.a($$6);
            $$1.b(bdk.c.b(this));
        }
        return cdc.a;
    }
}

