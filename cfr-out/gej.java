/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gej
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.create.world.wait");
    private final String d;
    private final String e;
    private final long f;

    public gej(long $$0, String $$1, String $$2) {
        this.f = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public void run() {
        fzz $$0 = fzz.a();
        try {
            $$0.a(this.f, this.d, this.e);
        }
        catch (gce $$1) {
            b.error("Couldn't create world", (Throwable)$$1);
            this.a($$1);
        }
        catch (Exception $$2) {
            b.error("Could not create world", (Throwable)$$2);
            this.a($$2);
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

