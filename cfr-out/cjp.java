/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cjp
implements cks {
    private final cgk a;
    private final boolean b;
    private final boolean c;

    public cjp(cgk $$0, boolean $$1) {
        this($$0, $$1, false);
    }

    public cjp(cgk $$0, boolean $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public ftm a() {
        return this.b ? this.a.dI().b(0.0, this.a.dk(), 0.0) : this.a.dI();
    }

    @Override
    public is b() {
        return this.c ? is.a(this.a.bV()) : this.a.dK();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(chl $$0) {
        void $$2;
        cgk cgk2 = this.a;
        if (!(cgk2 instanceof chl)) {
            return true;
        }
        chl $$1 = (chl)cgk2;
        if (!$$2.cb()) {
            return false;
        }
        Optional<cqy> $$3 = $$0.ev().c(cqw.h);
        return $$3.isPresent() && $$3.get().a((chl)$$2);
    }

    public cgk c() {
        return this.a;
    }

    public String toString() {
        return "EntityTracker for " + String.valueOf(this.a);
    }
}

