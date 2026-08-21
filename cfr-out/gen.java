/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gen
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.minigame.world.starting.screen.title");
    private final long d;
    private final gbz e;
    private final gdi f;

    public gen(long $$0, gbz $$1, gdi $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void run() {
        fzz $$0 = fzz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.d()) {
                    return;
                }
                if (!$$0.c(this.d, this.e.a()).booleanValue()) continue;
                gen.a(this.f);
                break;
            }
            catch (gcf $$2) {
                if (this.d()) {
                    return;
                }
                gen.a($$2.c);
                continue;
            }
            catch (Exception $$3) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't start mini game!");
                this.a($$3);
            }
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

