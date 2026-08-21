/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;

public class elr
extends emm
implements dib {
    public static final int d = 3;
    public static final int e = 3;
    public static final int f = 9;
    public static final int g = 1;
    public static final int h = 0;
    public static final int i = 9;
    public static final int j = 10;
    private static final int q = 0;
    private static final int r = 0;
    private static final yh s = yh.c("container.crafter");
    private jm<dlt> t = jm.a(9, dlt.l);
    private int u = 0;
    protected final dhv k = new dhv(this){
        private final int[] a = new int[9];
        private int b = 0;

        @Override
        public int a(int $$0) {
            return $$0 == 9 ? this.b : this.a[$$0];
        }

        @Override
        public void a(int $$0, int $$1) {
            if ($$0 == 9) {
                this.b = $$1;
            } else {
                this.a[$$0] = $$1;
            }
        }

        @Override
        public int a() {
            return 10;
        }
    };

    public elr(is $$0, eoh $$1) {
        super(eld.R, $$0, $$1);
    }

    @Override
    protected yh k() {
        return s;
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return new dhz($$0, $$1, this, this.k);
    }

    public void a(int $$0, boolean $$1) {
        if (!this.f($$0)) {
            return;
        }
        this.k.a($$0, $$1 ? 0 : 1);
        this.e();
    }

    public boolean d(int $$0) {
        if ($$0 >= 0 && $$0 < 9) {
            return this.k.a($$0) == 1;
        }
        return false;
    }

    @Override
    public boolean b(int $$0, dlt $$1) {
        if (this.k.a($$0) == 1) {
            return false;
        }
        dlt $$2 = this.t.get($$0);
        int $$3 = $$2.N();
        if ($$3 >= $$2.k()) {
            return false;
        }
        if ($$2.f()) {
            return true;
        }
        return !this.a($$3, $$2, $$0);
    }

    private boolean a(int $$0, dlt $$1, int $$2) {
        for (int $$3 = $$2 + 1; $$3 < 9; ++$$3) {
            dlt $$4;
            if (this.d($$3) || !($$4 = this.a($$3)).f() && ($$4.N() >= $$0 || !dlt.c($$4, $$1))) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.u = $$02.a("crafting_ticks_remaining", 0);
        this.t = jm.a(this.b(), dlt.l);
        if (!this.c_($$02)) {
            ccw.a($$02, this.t);
        }
        for (int $$1 = 0; $$1 < 9; ++$$1) {
            this.k.a($$1, 0);
        }
        $$02.h("disabled_slots").ifPresent($$0 -> {
            for (int $$1 : $$0) {
                if (!this.f($$1)) continue;
                this.k.a($$1, 1);
            }
        });
        this.k.a(9, $$02.a("triggered", 0));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("crafting_ticks_remaining", this.u);
        if (!this.d_($$0)) {
            ccw.a($$0, this.t);
        }
        this.g($$0);
        this.h($$0);
    }

    @Override
    public int b() {
        return 9;
    }

    @Override
    public boolean c() {
        for (dlt $$0 : this.t) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        return this.t.get($$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        if (this.d($$0)) {
            this.a($$0, true);
        }
        super.a($$0, $$1);
    }

    @Override
    public boolean a(ddm $$0) {
        return ccv.a(this, $$0);
    }

    @Override
    public jm<dlt> g() {
        return this.t;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.t = $$0;
    }

    @Override
    public int aB_() {
        return 3;
    }

    @Override
    public int h() {
        return 3;
    }

    @Override
    public void fillStackedContents(ddu $$0) {
        for (dlt $$1 : this.t) {
            $$0.a($$1);
        }
    }

    private void g(fns $$0) {
        IntArrayList $$1 = new IntArrayList();
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            if (!this.d($$2)) continue;
            $$1.add($$2);
        }
        $$0.a("disabled_slots", $$1.toIntArray());
    }

    private void h(fns $$0) {
        $$0.a("triggered", this.k.a(9));
    }

    public void a(boolean $$0) {
        this.k.a(9, $$0 ? 1 : 0);
    }

    @VisibleForTesting
    public boolean l() {
        return this.k.a(9) == 1;
    }

    public static void a(dwo $$0, is $$1, eoh $$2, elr $$3) {
        int $$4 = $$3.u - 1;
        if ($$4 < 0) {
            return;
        }
        $$3.u = $$4;
        if ($$4 == 0) {
            $$0.a($$1, (eoh)$$2.b(ebm.b, false), 3);
        }
    }

    public void e(int $$0) {
        this.u = $$0;
    }

    public int w() {
        int $$0 = 0;
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            dlt $$2 = this.a($$1);
            if ($$2.f() && !this.d($$1)) continue;
            ++$$0;
        }
        return $$0;
    }

    private boolean f(int $$0) {
        return $$0 > -1 && $$0 < 9 && this.t.get($$0).f();
    }

    public /* synthetic */ List i() {
        return this.g();
    }
}

