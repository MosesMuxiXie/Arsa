/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import org.jspecify.annotations.Nullable;

public abstract class cfy
extends cht {
    private static final alw<Boolean> cv = ama.a(cfy.class, aly.k);
    public static final int a = -24000;
    private static final int cw = 40;
    protected static final int b = 0;
    protected static final int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f;

    protected cfy(cgu<? extends cfy> $$0, dwo $$1) {
        super((cgu<? extends cht>)$$0, $$1);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        a $$4;
        if ($$3 == null) {
            $$3 = new a(true);
        }
        if (($$4 = (a)$$3).c() && $$4.a() > 0 && $$0.G_().i() <= $$4.d()) {
            this.d_(-24000);
        }
        $$4.b();
        return super.a($$0, $$1, $$2, $$3);
    }

    public abstract @Nullable cfy a(axf var1, cfy var2);

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, false);
    }

    public boolean Y_() {
        return false;
    }

    public int Z_() {
        if (this.ao().B_()) {
            return this.az.a(cv) != false ? -1 : 1;
        }
        return this.d;
    }

    public void a(int $$0, boolean $$1) {
        int $$2;
        int $$3 = $$2 = this.Z_();
        if (($$2 += $$0 * 20) > 0) {
            $$2 = 0;
        }
        int $$4 = $$2 - $$3;
        this.d_($$2);
        if ($$1) {
            this.e += $$4;
            if (this.f == 0) {
                this.f = 40;
            }
        }
        if (this.Z_() == 0) {
            this.d_(this.e);
        }
    }

    public void c_(int $$0) {
        this.a($$0, false);
    }

    public void d_(int $$0) {
        int $$1 = this.Z_();
        this.d = $$0;
        if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
            this.az.a(cv, $$0 < 0);
            this.h();
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Age", this.Z_());
        $$0.a("ForcedAge", this.e);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d_($$0.a("Age", 0));
        this.e = $$0.a("ForcedAge", 0);
    }

    @Override
    public void a(alw<?> $$0) {
        if (cv.equals($$0)) {
            this.j_();
        }
        super.a($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.ao().B_()) {
            if (this.f > 0) {
                if (this.f % 4 == 0) {
                    this.ao().a(ly.R, this.e(1.0), this.dS() + 0.5, this.h(1.0), 0.0, 0.0, 0.0);
                }
                --this.f;
            }
        } else if (this.cb()) {
            int $$0 = this.Z_();
            if ($$0 < 0) {
                this.d_(++$$0);
            } else if ($$0 > 0) {
                this.d_(--$$0);
            }
        }
    }

    protected void h() {
        dgb $$0;
        cgk cgk2;
        if (!this.e_() && this.cq() && (cgk2 = this.dz()) instanceof dgb && !($$0 = (dgb)cgk2).C(this)) {
            this.cf();
        }
    }

    @Override
    public boolean e_() {
        return this.Z_() < 0;
    }

    @Override
    public void a_(boolean $$0) {
        this.d_($$0 ? -24000 : 0);
    }

    public static int d(int $$0) {
        return (int)((float)($$0 / 20) * 0.1f);
    }

    @VisibleForTesting
    public int j() {
        return this.e;
    }

    @VisibleForTesting
    public int k() {
        return this.f;
    }

    public static class a
    implements cie {
        private int a;
        private final boolean b;
        private final float c;

        public a(boolean $$0, float $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public a(boolean $$0) {
            this($$0, 0.05f);
        }

        public a(float $$0) {
            this(true, $$0);
        }

        public int a() {
            return this.a;
        }

        public void b() {
            ++this.a;
        }

        public boolean c() {
            return this.b;
        }

        public float d() {
            return this.c;
        }
    }
}

