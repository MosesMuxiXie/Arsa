/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public interface dfy
extends ccv,
cdf {
    public ftm dI();

    public fth dj();

    public @Nullable amt<fof> h();

    public void a(@Nullable amt<fof> var1);

    public long i();

    public void a(long var1);

    public jm<dlt> j();

    public void k();

    public dwo ao();

    public boolean eh();

    @Override
    default public boolean c() {
        return this.al_();
    }

    default public void c_(fns $$0) {
        if (this.h() != null) {
            $$0.a("LootTable", this.h().a().toString());
            if (this.i() != 0L) {
                $$0.a("LootTableSeed", this.i());
            }
        } else {
            ccw.a($$0, this.j());
        }
    }

    default public void b_(fnq $$0) {
        this.k();
        amt $$1 = $$0.a("LootTable", fof.a).orElse(null);
        this.a($$1);
        this.a($$0.a("LootTableSeed", 0L));
        if ($$1 == null) {
            ccw.a($$0, this.j());
        }
    }

    default public void a(cex $$0, axf $$1, cgk $$2) {
        if (!$$1.U().a(eua.k).booleanValue()) {
            return;
        }
        ccy.a((dwo)$$1, $$2, (ccv)this);
        cgk $$3 = $$0.c();
        if ($$3 != null && $$3.ay() == cgu.cb) {
            dbk.a($$1, (ddm)$$3, true);
        }
    }

    default public cdc c_(ddm $$0) {
        $$0.a(this);
        return cdc.a;
    }

    default public void d_(@Nullable ddm $$0) {
        MinecraftServer $$1 = this.ao().s();
        if (this.h() != null && $$1 != null) {
            fof $$2 = $$1.be().a(this.h());
            if ($$0 != null) {
                aj.R.a((axg)$$0, this.h());
            }
            this.a((amt<fof>)null);
            fod.a $$3 = new fod.a((axf)this.ao()).a(fqx.h, this.dI());
            if ($$0 != null) {
                $$3.a($$0.eB()).a(fqx.a, $$0);
            }
            $$2.a(this, $$3.a(fqw.c), this.i());
        }
    }

    default public void ak_() {
        this.d_(null);
        this.j().clear();
    }

    default public boolean al_() {
        for (dlt $$0 : this.j()) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    default public dlt f_(int $$0) {
        this.d_(null);
        dlt $$1 = this.j().get($$0);
        if ($$1.f()) {
            return dlt.l;
        }
        this.j().set($$0, dlt.l);
        return $$1;
    }

    default public dlt g_(int $$0) {
        this.d_(null);
        return this.j().get($$0);
    }

    default public dlt b(int $$0, int $$1) {
        this.d_(null);
        return ccw.a(this.j(), $$0, $$1);
    }

    default public void c(int $$0, dlt $$1) {
        this.d_(null);
        this.j().set($$0, $$1);
        $$1.f(this.f_($$1));
    }

    default public @Nullable cic h_(final int $$0) {
        if ($$0 >= 0 && $$0 < this.b()) {
            return new cic(){

                @Override
                public dlt a() {
                    return dfy.this.g_($$0);
                }

                @Override
                public boolean a(dlt $$02) {
                    dfy.this.c($$0, $$02);
                    return true;
                }
            };
        }
        return null;
    }

    default public boolean e_(ddm $$0) {
        return !this.eh() && $$0.a(this.dj(), 4.0);
    }
}

