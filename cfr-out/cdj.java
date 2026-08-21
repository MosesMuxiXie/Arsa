/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface cdj
extends ccv {
    public static final String b = "LootTable";
    public static final String c = "LootTableSeed";

    public @Nullable amt<fof> az_();

    public void a(@Nullable amt<fof> var1);

    default public void a(amt<fof> $$0, long $$1) {
        this.a($$0);
        this.a($$1);
    }

    public long aC_();

    public void a(long var1);

    public is aD_();

    public @Nullable dwo j();

    public static void a(dvt $$0, bgr $$1, is $$2, amt<fof> $$3) {
        elb $$4 = $$0.c_($$2);
        if ($$4 instanceof cdj) {
            cdj $$5 = (cdj)((Object)$$4);
            $$5.a($$3, $$1.g());
        }
    }

    default public boolean c_(fnq $$0) {
        amt $$1 = $$0.a(b, fof.a).orElse(null);
        this.a($$1);
        this.a($$0.a(c, 0L));
        return $$1 != null;
    }

    default public boolean d_(fns $$0) {
        amt<fof> $$1 = this.az_();
        if ($$1 == null) {
            return false;
        }
        $$0.a(b, fof.a, $$1);
        long $$2 = this.aC_();
        if ($$2 != 0L) {
            $$0.a(c, $$2);
        }
        return true;
    }

    default public void f_(@Nullable ddm $$0) {
        dwo $$1 = this.j();
        is $$2 = this.aD_();
        amt<fof> $$3 = this.az_();
        if ($$3 != null && $$1 != null && $$1.s() != null) {
            fof $$4 = $$1.s().be().a($$3);
            if ($$0 instanceof axg) {
                aj.R.a((axg)$$0, $$3);
            }
            this.a((amt<fof>)null);
            fod.a $$5 = new fod.a((axf)$$1).a(fqx.h, ftm.b($$2));
            if ($$0 != null) {
                $$5.a($$0.eB()).a(fqx.a, $$0);
            }
            $$4.a(this, $$5.a(fqw.c), this.aC_());
        }
    }
}

