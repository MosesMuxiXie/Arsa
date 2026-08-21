/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gem
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.backup.restoring");
    private final gap d;
    private final long e;
    private final gdi f;

    public gem(gap $$0, long $$1, gdi $$2) {
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
                $$0.b(this.e, this.d.a);
                gem.a(1L);
                if (this.d()) {
                    return;
                }
                gem.a(this.f);
                return;
            }
            catch (gcf $$2) {
                if (this.d()) {
                    return;
                }
                gem.a($$2.c);
                continue;
            }
            catch (gce $$3) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't restore backup", (Throwable)$$3);
                gem.a(new gcs($$3, (gsb)this.f));
                return;
            }
            catch (Exception $$4) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't restore backup", (Throwable)$$4);
                this.a($$4);
                return;
            }
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

