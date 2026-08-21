/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class dhk
extends diz {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    private static final int s = 3;
    private static final int t = 30;
    private static final int u = 30;
    private static final int v = 39;
    final ccv w;
    private final dhv x;
    protected final dwo r;
    private final drd<? extends dpy> y;
    private final drb z;
    private final dja A;

    protected dhk(dis<?> $$0, drd<? extends dpy> $$1, amt<drb> $$2, dja $$3, int $$4, ddl $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, new cdk(3), new djh(4));
    }

    protected dhk(dis<?> $$0, drd<? extends dpy> $$1, amt<drb> $$2, dja $$3, int $$4, ddl $$5, ccv $$6, dhv $$7) {
        super($$0, $$4);
        this.y = $$1;
        this.A = $$3;
        dhk.a($$6, 3);
        dhk.a($$7, 4);
        this.w = $$6;
        this.x = $$7;
        this.r = $$5.j.ao();
        this.z = this.r.aa().a($$2);
        this.a(new dji($$6, 0, 56, 17));
        this.a(new dig(this, $$6, 1, 56, 53));
        this.a(new dii($$5.j, $$6, 2, 116, 35));
        this.c($$5, 8, 84);
        this.a($$7);
    }

    @Override
    public void a(ddu $$0) {
        if (this.w instanceof djn) {
            ((djn)((Object)this.w)).fillStackedContents($$0);
        }
    }

    public dji l() {
        return (dji)this.k.get(2);
    }

    @Override
    public boolean b(ddm $$0) {
        return this.w.a($$0);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 2) {
                if (!this.a($$4, 3, 39, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 == 1 || $$1 == 0 ? !this.a($$4, 3, 39, false) : (this.b($$4) ? !this.a($$4, 0, 1, false) : (this.c($$4) ? !this.a($$4, 1, 2, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false))))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            } else {
                $$3.d();
            }
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }

    protected boolean b(dlt $$0) {
        return this.z.a($$0);
    }

    protected boolean c(dlt $$0) {
        return this.r.S().a($$0);
    }

    public float m() {
        int $$0 = this.x.a(2);
        int $$1 = this.x.a(3);
        if ($$1 == 0 || $$0 == 0) {
            return 0.0f;
        }
        return bgj.a((float)$$0 / (float)$$1, 0.0f, 1.0f);
    }

    public float n() {
        int $$0 = this.x.a(1);
        if ($$0 == 0) {
            $$0 = 200;
        }
        return bgj.a((float)this.x.a(0) / (float)$$0, 0.0f, 1.0f);
    }

    public boolean o() {
        return this.x.a(0) > 0;
    }

    @Override
    public dja ao_() {
        return this.A;
    }

    @Override
    public diz.a a(boolean $$0, boolean $$1, dqx<?> $$2, final axf $$3, ddl $$4) {
        final List<dji> $$5 = List.of(this.b(0), this.b(2));
        dqx<?> $$6 = $$2;
        return amf.a(new amf.a<dpy>(){

            @Override
            public void a(ddu $$0) {
                dhk.this.a($$0);
            }

            @Override
            public void a() {
                $$5.forEach($$0 -> $$0.f(dlt.l));
            }

            @Override
            public boolean a(dqx<dpy> $$0) {
                return $$0.b().a(new drl(dhk.this.w.a(0)), (dwo)$$3);
            }
        }, 1, 1, List.of(this.b(0)), $$5, $$4, $$6, $$0, $$1);
    }
}

