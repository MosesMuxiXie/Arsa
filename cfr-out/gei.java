/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gei
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.configure.world.opening");
    private final gbg d;
    private final gsb e;
    private final boolean f;
    private final gfj g;

    public gei(gbg $$0, gsb $$1, boolean $$2, gfj $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public void run() {
        fzz $$0 = fzz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            if (this.d()) {
                return;
            }
            try {
                boolean $$2 = $$0.e(this.d.b);
                if (!$$2) continue;
                this.g.execute(() -> {
                    gsb $$0 = this.e;
                    if ($$0 instanceof gdi) {
                        gdi $$1 = (gdi)$$0;
                        $$1.n();
                    }
                    this.d.f = gbg.c.b;
                    if (this.f) {
                        fzu.a(this.d, this.e);
                    } else {
                        this.g.a(this.e);
                    }
                });
                break;
            }
            catch (gcf $$3) {
                if (this.d()) {
                    return;
                }
                gei.a($$3.c);
                continue;
            }
            catch (Exception $$4) {
                if (this.d()) {
                    return;
                }
                b.error("Failed to open server", (Throwable)$$4);
                this.a($$4);
            }
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

