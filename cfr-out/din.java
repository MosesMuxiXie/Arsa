/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class din
extends dhi {
    private static final int m = 9;
    private static final int n = 3;
    private static final int o = 0;
    protected final dhw q;
    protected final ddm r;
    protected final ccv s;
    protected final djd t = new djd(){

        @Override
        public void e() {
            din.this.a(this);
        }
    };
    private final int p;

    protected boolean a(ddm $$0, boolean $$1) {
        return true;
    }

    protected abstract void a(ddm var1, dlt var2);

    protected abstract boolean a(eoh var1);

    public din(@Nullable dis<?> $$0, int $$1, ddl $$2, dhw $$3, dio $$4) {
        super($$0, $$1);
        this.q = $$3;
        this.r = $$2.j;
        this.s = this.e($$4.d());
        this.p = $$4.e();
        this.a($$4);
        this.b($$4);
        this.c($$2, 8, 84);
    }

    private void a(dio $$0) {
        for (final dio.b $$1 : $$0.c()) {
            this.a(new dji(this, this.s, $$1.a(), $$1.b(), $$1.c()){

                @Override
                public boolean a(dlt $$0) {
                    return $$1.d().test($$0);
                }
            });
        }
    }

    private void b(dio $$0) {
        this.a(new dji(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()){

            @Override
            public boolean a(dlt $$0) {
                return false;
            }

            @Override
            public boolean a(ddm $$0) {
                return din.this.a($$0, this.h());
            }

            @Override
            public void a(ddm $$0, dlt $$1) {
                din.this.a($$0, $$1);
            }
        });
    }

    public abstract void l();

    private cdk e(int $$0) {
        return new cdk($$0){

            @Override
            public void e() {
                super.e();
                din.this.a(this);
            }
        };
    }

    @Override
    public void a(ccv $$0) {
        super.a($$0);
        if ($$0 == this.s) {
            this.l();
        }
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.q.a((dwo $$1, is $$2) -> this.a($$0, this.s));
    }

    @Override
    public boolean b(ddm $$0) {
        return this.q.a((dwo $$1, is $$2) -> {
            if (!this.a($$1.a_((is)$$2))) {
                return false;
            }
            return $$0.a((is)$$2, 4.0);
        }, true);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            int $$5 = this.m();
            int $$6 = this.q();
            if ($$1 == this.n()) {
                if (!this.a($$4, $$5, $$6, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 >= 0 && $$1 < this.n() ? !this.a($$4, $$5, $$6, false) : (this.b($$4) && $$1 >= this.m() && $$1 < this.q() ? !this.a($$4, 0, this.n(), false) : ($$1 >= this.m() && $$1 < this.o() ? !this.a($$4, this.p(), this.q(), false) : $$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)))) {
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
        return true;
    }

    public int n() {
        return this.p;
    }

    private int m() {
        return this.n() + 1;
    }

    private int o() {
        return this.m() + 27;
    }

    private int p() {
        return this.o();
    }

    private int q() {
        return this.p() + 9;
    }
}

