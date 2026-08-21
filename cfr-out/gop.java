/*
 * Decompiled with CFR 0.152.
 */
public abstract class gop
implements gov {
    private int c;
    private int d;
    protected int a;
    protected int b;

    public gop(int $$0, int $$1, int $$2, int $$3) {
        this.c = $$0;
        this.d = $$1;
        this.a = $$2;
        this.b = $$3;
    }

    @Override
    public void f(int $$0) {
        this.b($$1 -> {
            int $$2 = $$1.aT_() + ($$0 - this.aT_());
            $$1.f($$2);
        });
        this.c = $$0;
    }

    @Override
    public void g(int $$0) {
        this.b($$1 -> {
            int $$2 = $$1.aU_() + ($$0 - this.aU_());
            $$1.g($$2);
        });
        this.d = $$0;
    }

    @Override
    public int aT_() {
        return this.c;
    }

    @Override
    public int aU_() {
        return this.d;
    }

    @Override
    public int aS_() {
        return this.a;
    }

    @Override
    public int aR_() {
        return this.b;
    }

    protected static abstract class a {
        public final gow a;
        public final gox.a b;

        protected a(gow $$0, gox $$1) {
            this.a = $$0;
            this.b = $$1.h();
        }

        public int a() {
            return this.a.aR_() + this.b.b + this.b.d;
        }

        public int b() {
            return this.a.aS_() + this.b.a + this.b.c;
        }

        public void a(int $$0, int $$1) {
            float $$2 = this.b.a;
            float $$3 = $$1 - this.a.aS_() - this.b.c;
            int $$4 = (int)bgj.h(this.b.e, $$2, $$3);
            this.a.f($$4 + $$0);
        }

        public void b(int $$0, int $$1) {
            float $$2 = this.b.b;
            float $$3 = $$1 - this.a.aR_() - this.b.d;
            int $$4 = Math.round(bgj.h(this.b.f, $$2, $$3));
            this.a.g($$4 + $$0);
        }
    }
}

