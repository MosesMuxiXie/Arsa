/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class axs
implements axq {
    private static final Logger a = LogUtils.getLogger();
    private final boolean b;
    private final axr c;
    private boolean d;
    private long e = Long.MAX_VALUE;
    private long f = Long.MAX_VALUE;

    public axs(boolean $$0) {
        this.b = $$0;
        this.c = new axr($$0);
    }

    public static axs a() {
        return new axs(false);
    }

    public static axs b() {
        return new axs(true);
    }

    @Override
    public void a(axq.a $$0, int $$1) {
        if (this.d) {
            return;
        }
        if (this.e == Long.MAX_VALUE) {
            long $$2;
            this.e = $$2 = bhs.c();
            this.f = $$2;
        }
        this.c.a($$0, $$1);
        switch ($$0) {
            case b: {
                a.info("Selecting global world spawn...");
                break;
            }
            case c: {
                a.info("Loading {} persistent chunks...", (Object)$$1);
                break;
            }
            case d: {
                a.info("Loading {} chunks for player spawn...", (Object)$$1);
            }
        }
    }

    @Override
    public void a(axq.a $$0, int $$1, int $$2) {
        if (this.d) {
            return;
        }
        this.c.a($$0, $$1, $$2);
        if (bhs.c() > this.f) {
            this.f += 500L;
            int $$3 = bgj.b(this.c.a() * 100.0f);
            a.info(yh.a("menu.preparingSpawn", $$3).getString());
        }
    }

    @Override
    public void a(axq.a $$0) {
        axq.a $$1;
        if (this.d) {
            return;
        }
        this.c.a($$0);
        axq.a a2 = $$1 = this.b ? axq.a.d : axq.a.c;
        if ($$0 == $$1) {
            a.info("Time elapsed: {} ms", (Object)(bhs.c() - this.e));
            this.f = Long.MAX_VALUE;
            this.d = true;
        }
    }

    @Override
    public void a(amt<dwo> $$0, dvu $$1) {
    }
}

