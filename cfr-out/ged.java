/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ged
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.configure.world.closing");
    private final gbg d;
    private final gdi e;

    public ged(gbg $$0, gdi $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public void run() {
        fzz $$0 = fzz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            if (this.d()) {
                return;
            }
            try {
                boolean $$2 = $$0.f(this.d.b);
                if (!$$2) continue;
                this.e.n();
                this.d.f = gbg.c.a;
                ged.a(this.e);
                break;
            }
            catch (gcf $$3) {
                if (this.d()) {
                    return;
                }
                ged.a($$3.c);
                continue;
            }
            catch (Exception $$4) {
                if (this.d()) {
                    return;
                }
                b.error("Failed to close server", (Throwable)$$4);
                this.a($$4);
            }
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

