/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class gel
extends geh {
    private static final Logger b = LogUtils.getLogger();
    private final long c;
    private final yh d;
    private final Runnable e;

    public gel(long $$0, yh $$1, Runnable $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    protected abstract void a(fzz var1, long var2) throws gce;

    @Override
    public void run() {
        fzz $$0 = fzz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.d()) {
                    return;
                }
                this.a($$0, this.c);
                if (this.d()) {
                    return;
                }
                this.e.run();
                return;
            }
            catch (gcf $$2) {
                if (this.d()) {
                    return;
                }
                gel.a($$2.c);
                continue;
            }
            catch (Exception $$3) {
                if (this.d()) {
                    return;
                }
                b.error("Couldn't reset world");
                this.a($$3);
                return;
            }
        }
    }

    @Override
    public yh a() {
        return this.d;
    }
}

