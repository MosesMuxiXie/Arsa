/*
 * Decompiled with CFR 0.152.
 */
public interface gox {
    public gox a(int var1);

    public gox a(int var1, int var2);

    public gox a(int var1, int var2, int var3, int var4);

    public gox b(int var1);

    public gox c(int var1);

    public gox d(int var1);

    public gox e(int var1);

    public gox f(int var1);

    public gox g(int var1);

    public gox a(float var1, float var2);

    public gox a(float var1);

    public gox b(float var1);

    default public gox a() {
        return this.a(0.0f);
    }

    default public gox b() {
        return this.a(0.5f);
    }

    default public gox c() {
        return this.a(1.0f);
    }

    default public gox d() {
        return this.b(0.0f);
    }

    default public gox e() {
        return this.b(0.5f);
    }

    default public gox f() {
        return this.b(1.0f);
    }

    public gox g();

    public a h();

    public static gox i() {
        return new a();
    }

    public static class a
    implements gox {
        public int a;
        public int b;
        public int c;
        public int d;
        public float e;
        public float f;

        public a() {
        }

        public a(a $$0) {
            this.a = $$0.a;
            this.b = $$0.b;
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            this.f = $$0.f;
        }

        public a h(int $$0) {
            return this.b($$0, $$0);
        }

        public a b(int $$0, int $$1) {
            return this.m($$0).n($$1);
        }

        public a b(int $$0, int $$1, int $$2, int $$3) {
            return this.i($$0).k($$2).j($$1).l($$3);
        }

        public a i(int $$0) {
            this.a = $$0;
            return this;
        }

        public a j(int $$0) {
            this.b = $$0;
            return this;
        }

        public a k(int $$0) {
            this.c = $$0;
            return this;
        }

        public a l(int $$0) {
            this.d = $$0;
            return this;
        }

        public a m(int $$0) {
            return this.i($$0).k($$0);
        }

        public a n(int $$0) {
            return this.j($$0).l($$0);
        }

        public a b(float $$0, float $$1) {
            this.e = $$0;
            this.f = $$1;
            return this;
        }

        public a c(float $$0) {
            this.e = $$0;
            return this;
        }

        public a d(float $$0) {
            this.f = $$0;
            return this;
        }

        public a j() {
            return new a(this);
        }

        @Override
        public a h() {
            return this;
        }

        @Override
        public /* synthetic */ gox g() {
            return this.j();
        }

        @Override
        public /* synthetic */ gox b(float f2) {
            return this.d(f2);
        }

        @Override
        public /* synthetic */ gox a(float f2) {
            return this.c(f2);
        }

        @Override
        public /* synthetic */ gox a(float f2, float f3) {
            return this.b(f2, f3);
        }

        @Override
        public /* synthetic */ gox g(int n2) {
            return this.n(n2);
        }

        @Override
        public /* synthetic */ gox f(int n2) {
            return this.m(n2);
        }

        @Override
        public /* synthetic */ gox e(int n2) {
            return this.l(n2);
        }

        @Override
        public /* synthetic */ gox d(int n2) {
            return this.k(n2);
        }

        @Override
        public /* synthetic */ gox c(int n2) {
            return this.j(n2);
        }

        @Override
        public /* synthetic */ gox b(int n2) {
            return this.i(n2);
        }

        @Override
        public /* synthetic */ gox a(int n2, int n3, int n4, int n5) {
            return this.b(n2, n3, n4, n5);
        }

        @Override
        public /* synthetic */ gox a(int n2, int n3) {
            return this.b(n2, n3);
        }

        @Override
        public /* synthetic */ gox a(int n2) {
            return this.h(n2);
        }
    }
}

