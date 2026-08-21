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

public class emq
extends elb
implements chh,
emk {
    public static final int b = 3;
    private static final Logger c = LogUtils.getLogger();
    private static final String d = "align_items_to_bottom";
    private final jm<dlt> e = jm.a(3, dlt.l);
    private boolean f;

    public emq(is $$0, eoh $$1) {
        super(eld.O, $$0, $$1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e.clear();
        ccw.a($$0, this.e);
        this.f = $$0.a(d, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        ccw.a($$0, this.e, true);
        $$0.a(d, this.f);
    }

    public adh k() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        try (bgp.j $$1 = new bgp.j(this.v(), c);){
            fnp $$2 = fnp.a($$1, $$0);
            ccw.a($$2, this.e, true);
            $$2.a(d, this.f);
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    @Override
    public jm<dlt> h() {
        return this.e;
    }

    @Override
    public boolean a(ddm $$0) {
        return ccv.a(this, $$0);
    }

    public dlt d(int $$0, dlt $$1) {
        dlt $$2 = this.b($$0);
        this.c($$0, $$1);
        return $$2;
    }

    public void a(@Nullable jd.c<etk> $$0) {
        super.e();
        if (this.n != null) {
            if ($$0 != null) {
                this.n.a($$0, this.o, etk.a.a(this.o()));
            }
            this.j().a(this.aD_(), this.o(), this.o(), 3);
        }
    }

    @Override
    public void e() {
        this.a(etk.a);
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

    @Override
    public dwo ao() {
        return this.n;
    }

    @Override
    public ftm dI() {
        return this.aD_().b();
    }

    @Override
    public float ed() {
        return this.o().c(ehb.c).g().p();
    }

    public boolean l() {
        return this.f;
    }

    public /* synthetic */ aay ax_() {
        return this.k();
    }
}

