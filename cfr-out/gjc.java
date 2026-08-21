/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class gjc
implements gki,
gmm,
gow,
gpb {
    protected int g;
    protected int h;
    private int a;
    private int b;
    protected yh i;
    protected boolean j;
    public boolean k = true;
    public boolean l = true;
    protected float m = 1.0f;
    private int c;
    private boolean d;
    private final gkv e = new gkv();

    public gjc(int $$0, int $$1, int $$2, int $$3, yh $$4) {
        this.a = $$0;
        this.b = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    @Override
    public int aR_() {
        return this.h;
    }

    @Override
    public final void a(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.l) {
            return;
        }
        this.j = $$0.a($$1, $$2) && this.b((double)$$1, (double)$$2);
        this.a_($$0, $$1, $$2, $$3);
        this.e.a($$0, $$1, $$2, this.C(), this.aP_(), this.aV_());
    }

    protected void d(gir $$0) {
        if (this.C()) {
            $$0.a(this.b() ? fyn.d : fyn.h);
        }
    }

    public void a(@Nullable gks $$0) {
        this.e.a($$0);
    }

    public void a(Duration $$0) {
        this.e.a($$0);
    }

    protected yw f() {
        return gjc.b(this.B());
    }

    public static yw b(yh $$0) {
        return yh.a("gui.narrate.button", $$0);
    }

    protected abstract void a_(gir var1, int var2, int var3, float var4);

    protected void a(gil $$0, yh $$1, int $$2) {
        int $$3 = this.aT_() + $$2;
        int $$4 = this.aT_() + this.aS_() - $$2;
        int $$5 = this.aU_();
        int $$6 = this.aU_() + this.aR_();
        $$0.a($$1, $$3, $$4, $$5, $$6);
    }

    public void b(gzc $$0, boolean $$1) {
    }

    public void a(gzc $$0) {
    }

    protected void b(gzc $$0, double $$1, double $$2) {
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        boolean $$2;
        if (!this.b()) {
            return false;
        }
        if (this.a($$0.w()) && ($$2 = this.a_($$0.u(), $$0.v()))) {
            this.a(gfj.V().ap());
            this.b($$0, $$1);
            return true;
        }
        return false;
    }

    @Override
    public boolean b(gzc $$0) {
        if (this.a($$0.w())) {
            this.a($$0);
            return true;
        }
        return false;
    }

    protected boolean a(gzd $$0) {
        return $$0.t() == 0;
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.a($$0.w())) {
            this.b($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    @Override
    public @Nullable gin a(gpi $$0) {
        if (!this.b()) {
            return null;
        }
        if (!this.aP_()) {
            return gin.a(this);
        }
        return null;
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return this.b() && this.b($$0, $$1);
    }

    public void a(iqr $$0) {
        gjc.b($$0);
    }

    public static void b(iqr $$0) {
        $$0.a(iph.a(bda.DJ, 1.0f));
    }

    @Override
    public int aS_() {
        return this.g;
    }

    public void c(int $$0) {
        this.g = $$0;
    }

    public void d(int $$0) {
        this.h = $$0;
    }

    public void a(float $$0) {
        this.m = $$0;
    }

    public float A() {
        return this.m;
    }

    public void a_(yh $$0) {
        this.i = $$0;
    }

    public yh B() {
        return this.i;
    }

    @Override
    public boolean aP_() {
        return this.d;
    }

    public boolean C() {
        return this.j;
    }

    public boolean D() {
        return this.C() || this.aP_();
    }

    @Override
    public boolean b() {
        return this.l && this.k;
    }

    @Override
    public void b(boolean $$0) {
        this.d = $$0;
    }

    @Override
    public gpb.a y() {
        if (this.aP_()) {
            return gpb.a.c;
        }
        if (this.j) {
            return gpb.a.b;
        }
        return gpb.a.a;
    }

    @Override
    public final void b(gpd $$0) {
        this.a($$0);
        this.e.a($$0);
    }

    protected abstract void a(gpd var1);

    protected void c(gpd $$0) {
        $$0.a(gpc.a, (yh)this.f());
        if (this.k) {
            if (this.aP_()) {
                $$0.a(gpc.d, (yh)yh.c("narration.button.usage.focused"));
            } else {
                $$0.a(gpc.d, (yh)yh.c("narration.button.usage.hovered"));
            }
        }
    }

    @Override
    public int aT_() {
        return this.a;
    }

    @Override
    public void f(int $$0) {
        this.a = $$0;
    }

    @Override
    public int aU_() {
        return this.b;
    }

    @Override
    public void g(int $$0) {
        this.b = $$0;
    }

    public int E() {
        return this.aT_() + this.aS_();
    }

    public int F() {
        return this.aU_() + this.aR_();
    }

    @Override
    public void a(Consumer<gjc> $$0) {
        $$0.accept(this);
    }

    public void b(int $$0, int $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public gpm aV_() {
        return gow.super.aV_();
    }

    private boolean b(double $$0, double $$1) {
        return $$0 >= (double)this.aT_() && $$1 >= (double)this.aU_() && $$0 < (double)this.E() && $$1 < (double)this.F();
    }

    public void b(int $$0, int $$1, int $$2, int $$3) {
        this.b($$0, $$1);
        this.c($$2, $$3);
    }

    @Override
    public int G() {
        return this.c;
    }

    public void e(int $$0) {
        this.c = $$0;
    }

    public static abstract class a
    extends gjc {
        private yh a;

        public static yh c(yh $$0) {
            return yk.a($$0, zf.a.a(-6250336));
        }

        public a(int $$0, int $$1, int $$2, int $$3, yh $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.a = gjc$a.c($$4);
        }

        @Override
        public yh B() {
            return this.k ? super.B() : this.a;
        }

        @Override
        public void a_(yh $$0) {
            super.a_($$0);
            this.a = gjc$a.c($$0);
        }
    }
}

