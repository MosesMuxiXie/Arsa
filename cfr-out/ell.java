/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Objects;
import org.slf4j.Logger;

public class ell
extends elb
implements emk {
    public static final int b = 6;
    private static final Logger c = LogUtils.getLogger();
    private static final int d = -1;
    private final jm<dlt> e = jm.a(6, dlt.l);
    private int f = -1;

    public ell(is $$0, eoh $$1) {
        super(eld.N, $$0, $$1);
    }

    private void d(int $$0) {
        if ($$0 < 0 || $$0 >= 6) {
            c.error("Expected slot 0-5, got {}", (Object)$$0);
            return;
        }
        this.f = $$0;
        eoh $$1 = this.o();
        for (int $$2 = 0; $$2 < eav.i.size(); ++$$2) {
            boolean $$3 = !this.a($$2).f();
            eoy $$4 = eav.i.get($$2);
            $$1 = (eoh)$$1.b($$4, $$3);
        }
        Objects.requireNonNull(this.n).a(this.o, $$1, 3);
        this.n.a(etk.c, this.o, etk.a.a($$1));
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e.clear();
        ccw.a($$0, this.e);
        this.f = $$0.a("last_interacted_slot", -1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        ccw.a($$0, this.e, true);
        $$0.a("last_interacted_slot", this.f);
    }

    @Override
    public int ap_() {
        return 1;
    }

    @Override
    public boolean b(dlt $$0) {
        return $$0.a(bdy.bt);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$2 = Objects.requireNonNullElse(this.h().get($$0), dlt.l);
        this.h().set($$0, dlt.l);
        if (!$$2.f()) {
            this.d($$0);
        }
        return $$2;
    }

    @Override
    public void a(int $$0, dlt $$1) {
        if (this.b($$1)) {
            this.h().set($$0, $$1);
            this.d($$0);
        } else if ($$1.f()) {
            this.a($$0, this.ap_());
        }
    }

    @Override
    public boolean a(ccv $$0, int $$1, dlt $$22) {
        return $$0.a_((dlt $$2) -> {
            if ($$2.f()) {
                return true;
            }
            return dlt.c($$22, $$2) && $$2.N() + $$22.N() <= $$0.f_((dlt)$$2);
        });
    }

    @Override
    public jm<dlt> h() {
        return this.e;
    }

    @Override
    public boolean a(ddm $$0) {
        return ccv.a(this, $$0);
    }

    public int k() {
        return this.f;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        $$0.a(ki.aw, doo.a).a(this.e);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.aw, doo.a(this.e));
    }

    @Override
    public void b(fns $$0) {
        $$0.c("Items");
    }
}

