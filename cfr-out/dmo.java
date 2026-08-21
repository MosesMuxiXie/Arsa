/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class dmo
extends dlp {
    public static final Predicate<dlt> c = $$0 -> $$0.a(bdy.br);
    public static final Predicate<dlt> d = c.or($$0 -> $$0.a(dlx.wG));

    public dmo(dlp.a $$0) {
        super($$0);
    }

    public Predicate<dlt> c() {
        return this.a();
    }

    public abstract Predicate<dlt> a();

    public static dlt a(chl $$0, Predicate<dlt> $$1) {
        if ($$1.test($$0.b(cdb.b))) {
            return $$0.b(cdb.b);
        }
        if ($$1.test($$0.b(cdb.a))) {
            return $$0.b(cdb.a);
        }
        return dlt.l;
    }

    public abstract int b();

    protected void a(axf $$0, chl $$1, cdb $$2, dlt $$3, List<dlt> $$4, float $$5, float $$62, boolean $$7, @Nullable chl $$8) {
        float $$9 = dsq.a($$0, $$3, (cgk)$$1, 0.0f);
        float $$10 = $$4.size() == 1 ? 0.0f : 2.0f * $$9 / (float)($$4.size() - 1);
        float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0f;
        float $$12 = 1.0f;
        for (int $$13 = 0; $$13 < $$4.size(); ++$$13) {
            dlt $$14 = $$4.get($$13);
            if ($$14.f()) continue;
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            dec.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6 -> this.a($$1, (dec)$$6, $$16, $$5, $$62, $$15, $$8));
            $$3.a(this.h($$14), $$1, $$2.a());
            if ($$3.f()) break;
        }
    }

    protected int h(dlt $$0) {
        return 1;
    }

    protected abstract void a(chl var1, dec var2, int var3, float var4, float var5, float var6, @Nullable chl var7);

    protected dec a(dwo $$0, chl $$1, dlt $$2, dlt $$3, boolean $$4) {
        djx $$5;
        dlp dlp2 = $$3.h();
        djx $$6 = dlp2 instanceof djx ? ($$5 = (djx)dlp2) : (djx)dlx.pX;
        deh $$7 = $$6.a($$0, $$3, $$1, $$2);
        if ($$4) {
            $$7.r(true);
        }
        return $$7;
    }

    protected static List<dlt> a(dlt $$0, dlt $$1, chl $$2) {
        int n2;
        if ($$1.f()) {
            return List.of();
        }
        dwo dwo2 = $$2.ao();
        if (dwo2 instanceof axf) {
            axf $$3 = (axf)dwo2;
            n2 = dsq.a($$3, $$0, (cgk)$$2, 1);
        } else {
            n2 = 1;
        }
        int $$4 = n2;
        ArrayList<dlt> $$5 = new ArrayList<dlt>($$4);
        dlt $$6 = $$1.v();
        for (int $$7 = 0; $$7 < $$4; ++$$7) {
            dlt $$8 = dmo.a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if ($$8.f()) continue;
            $$5.add($$8);
        }
        return $$5;
    }

    protected static dlt a(dlt $$0, dlt $$1, chl $$2, boolean $$3) {
        int $$5;
        dwo dwo2;
        if (!$$3 && !$$2.gv() && (dwo2 = $$2.ao()) instanceof axf) {
            axf $$4 = (axf)dwo2;
            v0 = dsq.a($$4, $$0, $$1, 1);
        } else {
            v0 = $$5 = 0;
        }
        if ($$5 > $$1.N()) {
            return dlt.l;
        }
        if ($$5 == 0) {
            dlt $$6 = $$1.c(1);
            $$6.b(ki.x, bhr.a);
            return $$6;
        }
        dlt $$7 = $$1.a($$5);
        if ($$1.f() && $$2 instanceof ddm) {
            ddm $$8 = (ddm)$$2;
            $$8.gK().i($$1);
        }
        return $$7;
    }
}

