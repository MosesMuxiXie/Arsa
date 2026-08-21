/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class czm
extends cgk
implements cik {
    private static final alw<Integer> b = ama.a(czm.class, aly.b);
    private static final alw<eoh> c = ama.a(czm.class, aly.i);
    private static final short d = 80;
    private static final float e = 4.0f;
    private static final eoh f = dzs.cu.m();
    private static final String g = "block_state";
    public static final String a = "fuse";
    private static final String h = "explosion_power";
    private static final dwj i = new dwj(){

        @Override
        public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
            if ($$3.a(dzs.eI)) {
                return false;
            }
            return super.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public Optional<Float> a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4) {
            if ($$3.a(dzs.eI)) {
                return Optional.empty();
            }
            return super.a($$0, $$1, $$2, $$3, $$4);
        }
    };
    private @Nullable cgr<chl> j;
    private boolean k;
    private float l = 4.0f;

    public czm(cgu<? extends czm> $$0, dwo $$1) {
        super($$0, $$1);
        this.W = true;
    }

    public czm(dwo $$0, double $$1, double $$2, double $$3, @Nullable chl $$4) {
        this((cgu<? extends czm>)cgu.bE, $$0);
        this.a_($$1, $$2, $$3);
        double $$5 = $$0.y.j() * 6.2831854820251465;
        this.m(-Math.sin($$5) * 0.02, 0.2f, -Math.cos($$5) * 0.02);
        this.a(80);
        this.Y = $$1;
        this.Z = $$2;
        this.aa = $$3;
        this.j = cgr.a($$4);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(b, 80);
        $$0.a(c, f);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    public boolean bX() {
        return !this.eh();
    }

    @Override
    protected double bs() {
        return 0.04;
    }

    @Override
    public void g() {
        this.cn();
        this.bu();
        this.a(chp.a, this.dN());
        this.aW();
        this.k(this.dN().c(0.98));
        if (this.aV()) {
            this.k(this.dN().d(0.7, -0.5, 0.7));
        }
        int $$0 = this.f() - 1;
        this.a($$0);
        if ($$0 <= 0) {
            this.aC();
            if (!this.ao().B_()) {
                this.k();
            }
        } else {
            this.bG();
            if (this.ao().B_()) {
                this.ao().a(ly.ai, this.dP(), this.dR() + 0.5, this.dV(), 0.0, 0.0, 0.0);
            }
        }
    }

    private void k() {
        axf $$0;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && ($$0 = (axf)dwo2).U().a(eua.ad).booleanValue()) {
            this.ao().a((cgk)this, dwi.a(this.ao(), this), this.k ? i : null, this.dP(), this.f(0.0625), this.dV(), this.l, false, dwo.a.d);
        }
    }

    @Override
    protected void a(fns $$0) {
        $$0.a(a, (short)this.f());
        $$0.a(g, eoh.a, this.i());
        if (this.l != 4.0f) {
            $$0.a(h, this.l);
        }
        cgr.a(this.j, $$0, "owner");
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a(a, (short)80));
        this.c($$0.a(g, eoh.a).orElse(f));
        this.l = bgj.a($$0.a(h, 4.0f), 0.0f, 128.0f);
        this.j = cgr.a($$0, "owner");
    }

    public @Nullable chl e() {
        return cgr.b(this.j, this.ao());
    }

    @Override
    public void y(cgk $$0) {
        super.y($$0);
        if ($$0 instanceof czm) {
            czm $$1 = (czm)$$0;
            this.j = $$1.j;
        }
    }

    public void a(int $$0) {
        this.az.a(b, $$0);
    }

    public int f() {
        return this.az.a(b);
    }

    public void c(eoh $$0) {
        this.az.a(c, $$0);
    }

    public eoh i() {
        return this.az.a(c);
    }

    private void a(boolean $$0) {
        this.k = $$0;
    }

    @Override
    public @Nullable cgk b(fmb $$0) {
        cgk $$1 = super.b($$0);
        if ($$1 instanceof czm) {
            czm $$2 = (czm)$$1;
            $$2.a(true);
        }
        return $$1;
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    @Override
    public /* synthetic */ @Nullable cgk p() {
        return this.e();
    }
}

