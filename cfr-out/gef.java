/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class gef
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.download.preparing");
    private final long d;
    private final int e;
    private final gsb f;
    private final String g;

    public gef(long $$0, int $$1, String $$2, gsb $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$3;
        this.g = $$2;
    }

    @Override
    public void run() {
        fzz $$02 = fzz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.d()) {
                    return;
                }
                gby $$2 = $$02.b(this.d, this.e);
                gef.a(1L);
                if (this.d()) {
                    return;
                }
                gef.a(new gcr(this.f, $$2, this.g, $$0 -> {}));
                return;
            }
            catch (gcf $$3) {
                if (this.d()) {
                    return;
                }
                gef.a($$3.c);
                continue;
            }
            catch (gce $$4) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't download world data", (Throwable)$$4);
                gef.a(new gcs($$4, this.f));
                return;
            }
            catch (Exception $$5) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't download world data", (Throwable)$$5);
                this.a($$5);
                return;
            }
        }
    }

    @Override
    public yh a() {
        return c;
    }
}

