/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lm
extends lj {
    private static final Logger c = LogUtils.getLogger();

    @Override
    protected dlt a(ld $$0, dlt $$1) {
        this.a(false);
        dlp $$2 = $$1.h();
        if ($$2 instanceof dkb) {
            iz $$3 = $$0.d().c(eby.b);
            is $$4 = $$0.c().a($$3);
            iz $$5 = $$0.b().A($$4.e()) ? $$3 : iz.b;
            try {
                this.a(((dkb)$$2).a(new dpv((dwo)$$0.b(), $$4, $$3, $$1, $$5)).a());
            }
            catch (Exception $$6) {
                c.error("Error trying to place shulker box at {}", (Object)$$4, (Object)$$6);
            }
        }
        return $$1;
    }
}

