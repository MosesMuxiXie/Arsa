/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gkk
implements gov {
    private static final int a = 4;
    private static final int b = 10;
    final gov c;
    private final a d;
    private int e;
    private int f;

    public gkk(gfj $$0, gov $$1, int $$2) {
        this.c = $$1;
        this.d = new a($$0, 0, $$2);
    }

    public void a(int $$0) {
        this.e = $$0;
        this.d.c(Math.max(this.c.aS_(), $$0));
    }

    public void b(int $$0) {
        this.f = $$0;
        this.d.d(Math.min(this.c.aR_(), $$0));
        this.d.i();
    }

    @Override
    public void a() {
        this.c.a();
        int $$0 = this.c.aS_();
        this.d.c(Math.max($$0 + 20, this.e));
        this.d.d(Math.min(this.c.aR_(), this.f));
        this.d.i();
    }

    @Override
    public void b(Consumer<gow> $$0) {
        $$0.accept(this.d);
    }

    @Override
    public void f(int $$0) {
        this.d.f($$0);
    }

    @Override
    public void g(int $$0) {
        this.d.g($$0);
    }

    @Override
    public int aT_() {
        return this.d.aT_();
    }

    @Override
    public int aU_() {
        return this.d.aU_();
    }

    @Override
    public int aS_() {
        return this.d.aS_();
    }

    @Override
    public int aR_() {
        return this.d.aR_();
    }

    class a
    extends giv {
        private final gfj c;
        private final List<gjc> d;

        public a(gfj $$0, int $$1, int $$2) {
            super(0, 0, $$1, $$2, yg.a);
            this.d = new ArrayList<gjc>();
            this.c = $$0;
            gkk.this.c.a(this.d::add);
        }

        @Override
        protected int o() {
            return gkk.this.c.aR_();
        }

        @Override
        protected double p() {
            return 10.0;
        }

        @Override
        protected void a_(gir $$0, int $$1, int $$2, float $$3) {
            $$0.c(this.aT_(), this.aU_(), this.aT_() + this.g, this.aU_() + this.h);
            for (gjc $$4 : this.d) {
                $$4.a($$0, $$1, $$2, $$3);
            }
            $$0.f();
            this.a($$0, $$1, $$2);
        }

        @Override
        protected void a(gpd $$0) {
        }

        @Override
        public gpm a_(gpk $$0) {
            return new gpm(this.aT_(), this.aU_(), this.g, this.o());
        }

        @Override
        public void a(@Nullable gmm $$0) {
            super.a($$0);
            if ($$0 == null || !this.c.aY().b()) {
                return;
            }
            gpm $$1 = this.aV_();
            gpm $$2 = $$0.aV_();
            int $$3 = $$2.b() - $$1.b();
            int $$4 = $$2.c() - $$1.c();
            if ($$3 < 0) {
                this.a(this.h() + (double)$$3 - 14.0);
            } else if ($$4 > 0) {
                this.a(this.h() + (double)$$4 + 14.0);
            }
        }

        @Override
        public void f(int $$0) {
            super.f($$0);
            gkk.this.c.f($$0 + 10);
        }

        @Override
        public void g(int $$0) {
            super.g($$0);
            gkk.this.c.g($$0 - (int)this.h());
        }

        @Override
        public void a(double $$0) {
            super.a($$0);
            gkk.this.c.g(this.aV_().b() - (int)this.h());
        }

        @Override
        public List<? extends gmm> aJ_() {
            return this.d;
        }

        @Override
        public Collection<? extends gpb> aW_() {
            return this.d;
        }
    }
}

