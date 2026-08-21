/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpq<T extends czz & czq>
extends cop {
    public static final ccn a = bhn.a(1, 2);
    private final T b;
    private a c = cpq$a.a;
    private final double d;
    private final float e;
    private int f;
    private int g;
    private int h;

    public cpq(T $$0, double $$1, float $$2) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2 * $$2;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        return this.i() && this.h();
    }

    private boolean h() {
        return ((chl)this.b).b(dlx.yz);
    }

    @Override
    public boolean c() {
        return this.i() && (this.b() || !((chn)this.b).N().l()) && this.h();
    }

    private boolean i() {
        return ((chn)this.b).ag_() != null && ((chn)this.b).ag_().cb();
    }

    @Override
    public void e() {
        super.e();
        ((chn)this.b).w(false);
        ((chn)this.b).g((chl)null);
        this.f = 0;
        if (((chl)this.b).fZ()) {
            ((chl)this.b).gf();
            ((czq)this.b).b(false);
            ((chl)this.b).gb().b(ki.W, doa.a);
        }
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        boolean $$4;
        boolean $$2;
        chl $$0 = ((chn)this.b).ag_();
        if ($$0 == null) {
            return;
        }
        boolean $$1 = ((chn)this.b).P().a($$0);
        boolean bl2 = $$2 = this.f > 0;
        if ($$1 != $$2) {
            this.f = 0;
        }
        this.f = $$1 ? ++this.f : --this.f;
        double $$3 = ((cgk)this.b).g($$0);
        boolean bl3 = $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
        if ($$4) {
            --this.h;
            if (this.h <= 0) {
                ((chn)this.b).N().a((cgk)$$0, this.k() ? this.d : this.d * 0.5);
                this.h = a.a(((cgk)this.b).ep());
            }
        } else {
            this.h = 0;
            ((chn)this.b).N().n();
        }
        ((chn)this.b).J().a($$0, 30.0f, 30.0f);
        if (this.c == cpq$a.a) {
            if (!$$4) {
                ((chl)this.b).c(dee.a(this.b, dlx.yz));
                this.c = cpq$a.b;
                ((czq)this.b).b(true);
            }
        } else if (this.c == cpq$a.b) {
            dlt $$6;
            int $$5;
            if (!((chl)this.b).fZ()) {
                this.c = cpq$a.a;
            }
            if (($$5 = ((chl)this.b).gd()) >= dkm.b($$6 = ((chl)this.b).gb(), this.b)) {
                ((chl)this.b).ge();
                this.c = cpq$a.c;
                this.g = 20 + ((cgk)this.b).ep().a(20);
                ((czq)this.b).b(false);
            }
        } else if (this.c == cpq$a.c) {
            --this.g;
            if (this.g == 0) {
                this.c = cpq$a.d;
            }
        } else if (this.c == cpq$a.d && $$1) {
            ((dac)this.b).a($$0, 1.0f);
            this.c = cpq$a.a;
        }
    }

    private boolean k() {
        return this.c == cpq$a.a;
    }

    static final class a
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
            e = cpq$a.a();
        }
    }
}

