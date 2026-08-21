/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class htn
implements dvq {
    public static final int a = 1;
    public static final int b = 3;
    private final int c;
    private final int d;
    private final int e;
    private final htq[] f;
    private final dwo g;

    htn(dwo $$0, int $$1, int $$2, int $$3, htq[] $$4) {
        this.g = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public eoh a_(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w())).b($$0);
    }

    @Override
    public flb b_(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w())).b($$0).y();
    }

    @Override
    public float a(iz $$0, boolean $$1) {
        return this.g.a($$0, $$1);
    }

    @Override
    public fkq C_() {
        return this.g.C_();
    }

    @Override
    public @Nullable elb c_(is $$0) {
        return this.a(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w())).a($$0);
    }

    private htq a(int $$0, int $$1, int $$2) {
        return this.f[htn.a(this.c, this.d, this.e, $$0, $$1, $$2)];
    }

    @Override
    public int a(is $$0, dvz $$1) {
        return this.g.a($$0, $$1);
    }

    @Override
    public int K_() {
        return this.g.K_();
    }

    @Override
    public int L_() {
        return this.g.L_();
    }

    public static int a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        return $$3 - $$0 + ($$4 - $$1) * 3 + ($$5 - $$2) * 3 * 3;
    }
}

