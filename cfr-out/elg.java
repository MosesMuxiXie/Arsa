/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class elg
extends elb {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "LootTable";
    private static final String c = "LootTableSeed";
    private static final String d = "hit_direction";
    private static final String e = "item";
    private static final int f = 10;
    private static final int g = 40;
    private static final int h = 10;
    private int i;
    private long j;
    private long k;
    private dlt l = dlt.l;
    private @Nullable iz m;
    private @Nullable amt<fof> q;
    private long r;

    public elg(is $$0, eoh $$1) {
        super(eld.P, $$0, $$1);
    }

    public boolean a(long $$0, axf $$1, chl $$2, iz $$3, dlt $$4) {
        if (this.m == null) {
            this.m = $$3;
        }
        this.j = $$0 + 40L;
        if ($$0 < this.k) {
            return false;
        }
        this.k = $$0 + 10L;
        this.a($$1, $$2, $$4);
        int $$5 = this.f();
        if (++this.i >= 10) {
            this.b($$1, $$2, $$4);
            return true;
        }
        $$1.a(this.aD_(), this.o().b(), 2);
        int $$6 = this.f();
        if ($$5 != $$6) {
            eoh $$7 = this.o();
            eoh $$8 = (eoh)$$7.b(eox.bA, $$6);
            $$1.a(this.aD_(), $$8, 3);
        }
        return false;
    }

    private void a(axf $$0, chl $$1, dlt $$2) {
        if (this.q == null) {
            return;
        }
        fof $$3 = $$0.s().be().a(this.q);
        if ($$1 instanceof axg) {
            axg $$4 = (axg)$$1;
            aj.R.a($$4, this.q);
        }
        fod $$5 = new fod.a($$0).a(fqx.h, ftm.b(this.o)).a($$1.eB()).a(fqx.a, $$1).a(fqx.k, $$2).a(fqw.i);
        ObjectArrayList<dlt> $$6 = $$3.a($$5, this.r);
        this.l = switch ($$6.size()) {
            case 0 -> dlt.l;
            case 1 -> (dlt)$$6.getFirst();
            default -> {
                a.warn("Expected max 1 loot from loot table {}, but got {}", (Object)this.q.a(), (Object)$$6.size());
                yield (dlt)$$6.getFirst();
            }
        };
        this.q = null;
        this.e();
    }

    private void b(axf $$0, chl $$1, dlt $$2) {
        dzq $$7;
        this.c($$0, $$1, $$2);
        eoh $$3 = this.o();
        $$0.c(3008, this.aD_(), dzq.j($$3));
        dzq $$4 = this.o().b();
        if ($$4 instanceof dzw) {
            dzw $$5 = (dzw)$$4;
            dzq $$6 = $$5.b();
        } else {
            $$7 = dzs.a;
        }
        $$0.a(this.o, $$7.m(), 3);
    }

    private void c(axf $$0, chl $$1, dlt $$2) {
        this.a($$0, $$1, $$2);
        if (!this.l.f()) {
            double $$3 = cgu.av.l();
            double $$4 = 1.0 - $$3;
            double $$5 = $$3 / 2.0;
            iz $$6 = Objects.requireNonNullElse(this.m, iz.b);
            is $$7 = this.o.a($$6, 1);
            double $$8 = (double)$$7.u() + 0.5 * $$4 + $$5;
            double $$9 = (double)$$7.v() + 0.5 + (double)(cgu.av.m() / 2.0f);
            double $$10 = (double)$$7.w() + 0.5 * $$4 + $$5;
            czl $$11 = new czl($$0, $$8, $$9, $$10, this.l.a($$0.y.a(21) + 10));
            $$11.k(ftm.c);
            $$0.b($$11);
            this.l = dlt.l;
        }
    }

    public void a(axf $$0) {
        if (this.i != 0 && $$0.au() >= this.j) {
            int $$1 = this.f();
            this.i = Math.max(0, this.i - 2);
            int $$2 = this.f();
            if ($$1 != $$2) {
                $$0.a(this.aD_(), (eoh)this.o().b(eox.bA, $$2), 3);
            }
            int $$3 = 4;
            this.j = $$0.au() + 4L;
        }
        if (this.i == 0) {
            this.m = null;
            this.j = 0L;
            this.k = 0L;
        } else {
            $$0.a(this.aD_(), this.o().b(), 2);
        }
    }

    private boolean d(fnq $$0) {
        this.q = $$0.a(b, fof.a).orElse(null);
        this.r = $$0.a(c, 0L);
        return this.q != null;
    }

    private boolean g(fns $$0) {
        if (this.q == null) {
            return false;
        }
        $$0.a(b, fof.a, this.q);
        if (this.r != 0L) {
            $$0.a(c, this.r);
        }
        return true;
    }

    @Override
    public uz a(jf.a $$0) {
        uz $$1 = super.a($$0);
        $$1.b(d, iz.k, this.m);
        if (!this.l.f()) {
            ams<vz> $$2 = $$0.a(vn.a);
            $$1.a(e, dlt.b, $$2, this.l);
        }
        return $$1;
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.l = !this.d($$0) ? $$0.a(e, dlt.b).orElse(dlt.l) : dlt.l;
        this.m = $$0.a(d, iz.k).orElse(null);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.g($$0) && !this.l.f()) {
            $$0.a(e, dlt.b, this.l);
        }
    }

    public void a(amt<fof> $$0, long $$1) {
        this.q = $$0;
        this.r = $$1;
    }

    private int f() {
        if (this.i == 0) {
            return 0;
        }
        if (this.i < 3) {
            return 1;
        }
        if (this.i < 6) {
            return 2;
        }
        return 3;
    }

    public @Nullable iz c() {
        return this.m;
    }

    public dlt d() {
        return this.l;
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }
}

