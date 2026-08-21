/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class cwz
extends cii {
    private static final Logger cz = LogUtils.getLogger();
    private static final int cA = 100;
    private int cB;

    protected cwz(cgu<? extends cwz> $$0, dwo $$1) {
        super((cgu<? extends cii>)$$0, $$1);
    }

    public boolean b(axg $$0) {
        try (bgp.j $$1 = new bgp.j(this.es(), cz);){
            fnp $$2 = fnp.a($$1, this.eo());
            this.d($$2);
            $$2.a("id", this.ca());
            if ($$0.a($$2.b())) {
                this.aC();
                boolean bl2 = true;
                return bl2;
            }
        }
        return false;
    }

    @Override
    public void g() {
        ++this.cB;
        super.g();
    }

    public boolean hg() {
        return this.cB > 100;
    }
}

