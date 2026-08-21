/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class emr
extends emm
implements cdp {
    public static final int d = 9;
    public static final int e = 3;
    public static final int f = 27;
    public static final int g = 1;
    public static final int h = 10;
    public static final float i = 0.5f;
    public static final float j = 270.0f;
    private static final int[] k = IntStream.range(0, 27).toArray();
    private static final yh q = yh.c("container.shulkerBox");
    private jm<dlt> r = jm.a(27, dlt.l);
    private int s;
    private a t = a.a;
    private float u;
    private float v;
    private final @Nullable dkr w;

    public emr(@Nullable dkr $$0, is $$1, eoh $$2) {
        super(eld.y, $$1, $$2);
        this.w = $$0;
    }

    public emr(is $$0, eoh $$1) {
        super(eld.y, $$0, $$1);
        dkr dkr2;
        dzq dzq2 = $$1.b();
        if (dzq2 instanceof ehd) {
            ehd $$2 = (ehd)dzq2;
            dkr2 = $$2.b();
        } else {
            dkr2 = null;
        }
        this.w = dkr2;
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emr $$3) {
        $$3.b($$0, $$1, $$2);
    }

    private void b(dwo $$0, is $$1, eoh $$2) {
        this.v = this.u;
        switch (this.t.ordinal()) {
            case 0: {
                this.u = 0.0f;
                break;
            }
            case 1: {
                this.u += 0.1f;
                if (this.v == 0.0f) {
                    emr.d($$0, $$1, $$2);
                }
                if (this.u >= 1.0f) {
                    this.t = a.c;
                    this.u = 1.0f;
                    emr.d($$0, $$1, $$2);
                }
                this.c($$0, $$1, $$2);
                break;
            }
            case 3: {
                this.u -= 0.1f;
                if (this.v == 1.0f) {
                    emr.d($$0, $$1, $$2);
                }
                if (!(this.u <= 0.0f)) break;
                this.t = a.a;
                this.u = 0.0f;
                emr.d($$0, $$1, $$2);
                break;
            }
            case 2: {
                this.u = 1.0f;
            }
        }
    }

    public a l() {
        return this.t;
    }

    public fth a(eoh $$0) {
        ftm $$1 = new ftm(0.5, 0.0, 0.5);
        return dae.a(1.0f, $$0.c(ehd.c), 0.5f * this.a(1.0f), $$1);
    }

    private void c(dwo $$0, is $$1, eoh $$2) {
        if (!($$2.b() instanceof ehd)) {
            return;
        }
        iz $$3 = $$2.c(ehd.c);
        fth $$4 = dae.a(1.0f, $$3, this.v, this.u, $$1.c());
        List<cgk> $$5 = $$0.a_(null, $$4);
        if ($$5.isEmpty()) {
            return;
        }
        for (cgk $$6 : $$5) {
            if ($$6.n_() == flg.d) continue;
            $$6.a(chp.d, new ftm(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
        }
    }

    @Override
    public int b() {
        return this.r.size();
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.s = $$1;
            if ($$1 == 0) {
                this.t = a.d;
            }
            if ($$1 == 1) {
                this.t = a.b;
            }
            return true;
        }
        return super.a_($$0, $$1);
    }

    private static void d(dwo $$0, is $$1, eoh $$2) {
        $$2.a((dwp)$$0, $$1, 3);
        $$0.a($$1, $$2.b());
    }

    @Override
    public void a(is $$0, eoh $$1) {
    }

    @Override
    public void a(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            if (this.s < 0) {
                this.s = 0;
            }
            ++this.s;
            this.n.a(this.o, this.o().b(), 1, this.s);
            if (this.s == 1) {
                this.n.a((cgk)$$0.k_(), etk.k, this.o);
                this.n.a(null, this.o, bda.zU, bdb.e, 0.5f, this.n.y.i() * 0.1f + 0.9f);
            }
        }
    }

    @Override
    public void b(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            --this.s;
            this.n.a(this.o, this.o().b(), 1, this.s);
            if (this.s <= 0) {
                this.n.a((cgk)$$0.k_(), etk.j, this.o);
                this.n.a(null, this.o, bda.zT, bdb.e, 0.5f, this.n.y.i() * 0.1f + 0.9f);
            }
        }
    }

    @Override
    protected yh k() {
        return q;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.d_($$0)) {
            ccw.a($$0, this.r, false);
        }
    }

    public void d(fnq $$0) {
        this.r = jm.a(this.b(), dlt.l);
        if (!this.c_($$0)) {
            ccw.a($$0, this.r);
        }
    }

    @Override
    protected jm<dlt> g() {
        return this.r;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.r = $$0;
    }

    @Override
    public int[] a(iz $$0) {
        return k;
    }

    @Override
    public boolean a(int $$0, dlt $$1, @Nullable iz $$2) {
        return !(dzq.a($$1.h()) instanceof ehd);
    }

    @Override
    public boolean b(int $$0, dlt $$1, iz $$2) {
        return true;
    }

    public float a(float $$0) {
        return bgj.h($$0, this.v, this.u);
    }

    public @Nullable dkr w() {
        return this.w;
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return new djf($$0, $$1, this);
    }

    public boolean x() {
        return this.t == a.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = emr$a.a();
        }
    }
}

