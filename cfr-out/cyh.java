/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cyh
extends cyf {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 10;
    private @Nullable ftm d;
    private int e;

    public cyh(cyc $$0) {
        super($$0);
    }

    @Override
    public void a(axf $$0) {
        if (this.d == null) {
            b.warn("Aborting charge player as no target was set.");
            this.a.gN().a(cyt.a);
            return;
        }
        if (this.e > 0 && this.e++ >= 10) {
            this.a.gN().a(cyt.a);
            return;
        }
        double $$1 = this.d.c(this.a.dP(), this.a.dR(), this.a.dV());
        if ($$1 < 100.0 || $$1 > 22500.0 || this.a.ad || this.a.ae) {
            ++this.e;
        }
    }

    @Override
    public void c() {
        this.d = null;
        this.e = 0;
    }

    public void a(ftm $$0) {
        this.d = $$0;
    }

    @Override
    public float e() {
        return 3.0f;
    }

    @Override
    public @Nullable ftm f() {
        return this.d;
    }

    public cyt<cyh> h() {
        return cyt.i;
    }
}

