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

public class cjz
extends cjd<dcx> {
    private static final int d = 200;
    public static final float c = 0.5f;
    private @Nullable is e;
    private long f;
    private int g;
    private final List<is> h = Lists.newArrayList();

    public cjz() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.b), cqw.f, (Object)((Object)cqx.a)));
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        if (!$$0.U().a(eua.F).booleanValue()) {
            return false;
        }
        if (!$$1.gZ().b().a(dda.g)) {
            return false;
        }
        is.a $$2 = $$1.dK().k();
        this.h.clear();
        for (int $$3 = -1; $$3 <= 1; ++$$3) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                for (int $$5 = -1; $$5 <= 1; ++$$5) {
                    $$2.b($$1.dP() + (double)$$3, $$1.dR() + (double)$$4, $$1.dV() + (double)$$5);
                    if (!this.a($$2, $$0)) continue;
                    this.h.add(new is($$2));
                }
            }
        }
        this.e = this.a($$0);
        return this.e != null;
    }

    private @Nullable is a(axf $$0) {
        return this.h.isEmpty() ? null : this.h.get($$0.G_().a(this.h.size()));
    }

    private boolean a(is $$0, axf $$1) {
        eoh $$2 = $$1.a_($$0);
        dzq $$3 = $$2.b();
        dzq $$4 = $$1.a_($$0.e()).b();
        return $$3 instanceof ebp && ((ebp)$$3).i($$2) || $$2.l() && $$4 instanceof ecs;
    }

    protected void a(axf $$0, dcx $$1, long $$2) {
        if ($$2 > this.f && this.e != null) {
            $$1.ev().a(cqw.o, new cjg(this.e));
            $$1.ev().a(cqw.n, new cqz(new cjg(this.e), 0.5f, 1));
        }
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        $$1.ev().b(cqw.o);
        $$1.ev().b(cqw.n);
        this.g = 0;
        this.f = $$2 + 40L;
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        if (this.e != null && !this.e.a($$1.dI(), 1.0)) {
            return;
        }
        if (this.e != null && $$2 > this.f) {
            eoh $$3 = $$0.a_(this.e);
            dzq $$4 = $$3.b();
            dzq $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof ebp && ((ebp)$$4).i($$3)) {
                $$0.a(this.e, true, (cgk)$$1);
            }
            if ($$3.l() && $$5 instanceof ecs && $$1.hd()) {
                cdk $$6 = $$1.gP();
                for (int $$7 = 0; $$7 < $$6.b(); ++$$7) {
                    dlp dlp2;
                    dlt $$8 = $$6.a($$7);
                    boolean $$9 = false;
                    if (!$$8.f() && $$8.a(bdy.ch) && (dlp2 = $$8.h()) instanceof dkb) {
                        dkb $$10 = (dkb)dlp2;
                        eoh $$11 = $$10.c().m();
                        $$0.c(this.e, $$11);
                        $$0.a(etk.i, this.e, etk.a.a($$1, $$11));
                        $$9 = true;
                    }
                    if (!$$9) continue;
                    $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), bda.hK, bdb.e, 1.0f, 1.0f);
                    $$8.h(1);
                    if (!$$8.f()) break;
                    $$6.a($$7, dlt.l);
                    break;
                }
            }
            if ($$4 instanceof ebp && !((ebp)$$4).i($$3)) {
                this.h.remove(this.e);
                this.e = this.a($$0);
                if (this.e != null) {
                    this.f = $$2 + 20L;
                    $$1.ev().a(cqw.n, new cqz(new cjg(this.e), 0.5f, 1));
                    $$1.ev().a(cqw.o, new cjg(this.e));
                }
            }
        }
        ++this.g;
    }

    protected boolean d(axf $$0, dcx $$1, long $$2) {
        return this.g < 200;
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (dcx)chl2, l2);
    }
}

