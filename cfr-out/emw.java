/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class emw
extends elb
implements dxj {
    private final dvp a = new dvp(this){

        @Override
        public void a(dwo $$0, is $$1, int $$2) {
            $$0.a($$1, dzs.cP, $$2, 0);
        }

        @Override
        public void a(@Nullable dwo $$0, is $$1, dxi $$2) {
            super.a($$0, $$1, $$2);
            if ($$0 != null) {
                eoh $$3 = $$0.a_($$1);
                $$0.a($$1, $$3, $$3, 260);
            }
        }
    };

    public emw(is $$0, eoh $$1) {
        super(eld.j, $$0, $$1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a.a(this.n, this.o, $$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.a.a($$0);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emw $$3) {
        $$3.a.a($$0, $$1);
    }

    public static void b(dwo $$0, is $$1, eoh $$2, emw $$3) {
        $$3.a.a((axf)$$0, $$1);
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        uz $$1 = this.d($$0);
        $$1.r("SpawnPotentials");
        return $$1;
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if (this.a.a(this.n, $$0)) {
            return true;
        }
        return super.a_($$0, $$1);
    }

    @Override
    public void a(cgu<?> $$0, bgr $$1) {
        this.a.a($$0, this.n, $$1, this.o);
        this.e();
    }

    public dvp c() {
        return this.a;
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }
}

