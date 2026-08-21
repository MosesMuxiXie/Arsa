/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hpz
implements dvq {
    public is a = is.c;
    public is b = is.c;
    public eoh c = dzs.a.m();
    public @Nullable jd<dxo> d;
    public dvq e = dwe.a;

    @Override
    public float a(iz $$0, boolean $$1) {
        return this.e.a($$0, $$1);
    }

    @Override
    public fkq C_() {
        return this.e.C_();
    }

    @Override
    public int a(is $$0, dvz $$1) {
        if (this.d == null) {
            return -1;
        }
        return $$1.getColor(this.d.a(), $$0.u(), $$0.w());
    }

    @Override
    public @Nullable elb c_(is $$0) {
        return null;
    }

    @Override
    public eoh a_(is $$0) {
        if ($$0.equals(this.b)) {
            return this.c;
        }
        return dzs.a.m();
    }

    @Override
    public flb b_(is $$0) {
        return this.a_($$0).y();
    }

    @Override
    public int L_() {
        return 1;
    }

    @Override
    public int K_() {
        return this.b.v();
    }
}

