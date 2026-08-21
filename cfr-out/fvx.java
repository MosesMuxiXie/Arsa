/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface fvx
extends fvt {
    public static final int a_ = 332;

    public boolean gx();

    public Optional<c> f(axg var1);

    public fvt.a gy();

    public static boolean a(chl $$0, axg $$1) {
        if ($$1.au()) {
            return false;
        }
        if ($$0.au() || $$0.B($$1)) {
            return true;
        }
        double $$2 = Math.min($$0.i(cis.I), $$1.i(cis.J));
        return (double)$$0.f((cgk)$$1) >= $$2;
    }

    public static boolean a(dvu $$0, axg $$1) {
        return $$1.X().b($$0.h, $$0.i);
    }

    public static boolean b(chl $$0, axg $$1) {
        return $$0.f((cgk)$$1) > 332.0f;
    }

    public static class d
    implements c {
        private final chl a;
        private final fvt.a b;
        private final axg c;
        private float d;

        public d(chl $$0, fvt.a $$1, axg $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            ftm $$3 = $$2.dI().d($$0.dI()).k();
            this.d = (float)bgj.d($$3.c(), $$3.a());
        }

        @Override
        public boolean b() {
            return fvx.a(this.a, this.c) || fvx.a(this.a.dM(), this.c) || !fvx.b(this.a, this.c);
        }

        @Override
        public void c() {
            this.c.g.b(ahs.a(this.a.cY(), this.b, this.d));
        }

        @Override
        public void d() {
            this.c.g.b(ahs.a(this.a.cY()));
        }

        @Override
        public void e() {
            ftm $$0 = this.c.dI().d(this.a.dI()).k();
            float $$1 = (float)bgj.d($$0.c(), $$0.a());
            if (bgj.c($$1 - this.d) > (float)Math.PI / 360) {
                this.c.g.b(ahs.b(this.a.cY(), this.b, $$1));
                this.d = $$1;
            }
        }
    }

    public static class f
    implements b {
        private final chl a;
        private final fvt.a b;
        private final axg c;
        private dvu d;

        public f(chl $$0, fvt.a $$1, axg $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$0.dM();
        }

        @Override
        public int a() {
            return this.d.a(this.a.dM());
        }

        @Override
        public void c() {
            this.c.g.b(ahs.a(this.a.cY(), this.b, this.d));
        }

        @Override
        public void d() {
            this.c.g.b(ahs.a(this.a.cY()));
        }

        @Override
        public void e() {
            dvu $$0 = this.a.dM();
            if ($$0.a(this.d) > 0) {
                this.c.g.b(ahs.b(this.a.cY(), this.b, $$0));
                this.d = $$0;
            }
        }

        @Override
        public boolean b() {
            if (b.super.b() || fvx.a(this.a, this.c)) {
                return true;
            }
            return fvx.a(this.d, this.c);
        }
    }

    public static interface b
    extends c {
        public int a();

        @Override
        default public boolean b() {
            return this.a() > 1;
        }
    }

    public static class e
    implements a {
        private final chl a;
        private final fvt.a b;
        private final axg c;
        private is d;

        public e(chl $$0, fvt.a $$1, axg $$2) {
            this.a = $$0;
            this.c = $$2;
            this.b = $$1;
            this.d = $$0.dK();
        }

        @Override
        public void c() {
            this.c.g.b(ahs.a(this.a.cY(), this.b, this.d));
        }

        @Override
        public void d() {
            this.c.g.b(ahs.a(this.a.cY()));
        }

        @Override
        public void e() {
            is $$0 = this.a.dK();
            if ($$0.k(this.d) > 0) {
                this.c.g.b(ahs.b(this.a.cY(), this.b, $$0));
                this.d = $$0;
            }
        }

        @Override
        public int a() {
            return this.d.k(this.a.dK());
        }

        @Override
        public boolean b() {
            return a.super.b() || fvx.a(this.a, this.c);
        }
    }

    public static interface a
    extends c {
        public int a();

        @Override
        default public boolean b() {
            return this.a() > 1;
        }
    }

    public static interface c {
        public void c();

        public void d();

        public void e();

        public boolean b();
    }
}

