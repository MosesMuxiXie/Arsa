/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class clm
extends cjd<dcx> {
    private static final int c = 900;
    private static final int d = 40;
    private @Nullable dlt e;
    private final List<dlt> f = Lists.newArrayList();
    private int g;
    private int h;
    private int i;

    public clm(int $$0, int $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.r, (Object)((Object)cqx.a)), $$0, $$1);
    }

    @Override
    public boolean a(axf $$0, dcx $$1) {
        cim<dcx> $$2 = $$1.ev();
        if ($$2.c(cqw.r).isEmpty()) {
            return false;
        }
        chl $$3 = $$2.c(cqw.r).get();
        return $$3.ay() == cgu.cb && $$1.cb() && $$3.cb() && !$$1.e_() && $$1.g((cgk)$$3) <= 17.0;
    }

    @Override
    public boolean a(axf $$0, dcx $$1, long $$2) {
        return this.a($$0, $$1) && this.i > 0 && $$1.ev().c(cqw.r).isPresent();
    }

    @Override
    public void b(axf $$0, dcx $$1, long $$2) {
        super.d($$0, $$1, $$2);
        this.d($$1);
        this.g = 0;
        this.h = 0;
        this.i = 40;
    }

    @Override
    public void c(axf $$0, dcx $$1, long $$2) {
        chl $$3 = this.d($$1);
        this.a($$3, $$1);
        if (!this.f.isEmpty()) {
            this.e($$1);
        } else {
            clm.c($$1);
            this.i = Math.min(this.i, 40);
        }
        --this.i;
    }

    @Override
    public void d(axf $$0, dcx $$1, long $$2) {
        super.b($$0, $$1, $$2);
        $$1.ev().b(cqw.r);
        clm.c($$1);
        this.e = null;
    }

    private void a(chl $$0, dcx $$1) {
        boolean $$2 = false;
        dlt $$3 = $$0.fx();
        if (this.e == null || !dlt.b(this.e, $$3)) {
            this.e = $$3;
            $$2 = true;
            this.f.clear();
        }
        if ($$2 && !this.e.f()) {
            this.b($$1);
            if (!this.f.isEmpty()) {
                this.i = 900;
                this.a($$1);
            }
        }
    }

    private void a(dcx $$0) {
        clm.a($$0, this.f.get(0));
    }

    private void b(dcx $$0) {
        for (dvl $$1 : $$0.b()) {
            if ($$1.r() || !this.a($$1)) continue;
            this.f.add($$1.h());
        }
    }

    @Override
    private boolean a(dvl $$0) {
        return dlt.b(this.e, $$0.b()) || dlt.b(this.e, $$0.c());
    }

    private static void c(dcx $$0) {
        $$0.a(cgv.a, dlt.l);
        $$0.a(cgv.a, 0.085f);
    }

    private static void a(dcx $$0, dlt $$1) {
        $$0.a(cgv.a, $$1);
        $$0.a(cgv.a, 0.0f);
    }

    private chl d(dcx $$0) {
        cim<dcx> $$1 = $$0.ev();
        chl $$2 = $$1.c(cqw.r).get();
        $$1.a(cqw.o, new cjp($$2, true));
        return $$2;
    }

    private void e(dcx $$0) {
        if (this.f.size() >= 2 && ++this.g >= 40) {
            ++this.h;
            this.g = 0;
            if (this.h > this.f.size() - 1) {
                this.h = 0;
            }
            clm.a($$0, this.f.get(this.h));
        }
    }

    @Override
    public /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    public /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

