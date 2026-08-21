/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class xp
extends wu {
    private static final Logger e = LogUtils.getLogger();
    private static final yh f = yh.c("disconnect.exceeded_packet_rate");
    private final int g;

    public xp(int $$0) {
        super(aaz.a);
        this.g = $$0;
    }

    @Override
    protected void c() {
        super.c();
        float $$0 = this.o();
        if ($$0 > (float)this.g) {
            e.warn("Player exceeded rate-limit (sent {} packets per second)", (Object)Float.valueOf($$0));
            this.a(new abk(f), xm.a(() -> this.a(f)));
            this.m();
        }
    }
}

