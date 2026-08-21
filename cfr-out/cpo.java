/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpo
extends cop {
    private final chn a;
    private final dac b;
    private @Nullable chl c;
    private int d = -1;
    private final double e;
    private int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public cpo(dac $$0, double $$1, int $$2, float $$3) {
        this($$0, $$1, $$2, $$2, $$3);
    }

    public cpo(dac $$0, double $$1, int $$2, int $$3, float $$4) {
        if (!($$0 instanceof chl)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = $$0;
        this.a = (chn)((Object)$$0);
        this.e = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$4 * $$4;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        chl $$0 = this.a.ag_();
        if ($$0 == null || !$$0.cb()) {
            return false;
        }
        this.c = $$0;
        return true;
    }

    @Override
    public boolean c() {
        return this.b() || this.c.cb() && !this.a.N().l();
    }

    @Override
    public void e() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        double $$0 = this.a.h(this.c.dP(), this.c.dR(), this.c.dV());
        boolean $$1 = this.a.P().a(this.c);
        this.f = $$1 ? ++this.f : 0;
        if ($$0 > (double)this.j || this.f < 5) {
            this.a.N().a((cgk)this.c, this.e);
        } else {
            this.a.N().n();
        }
        this.a.J().a(this.c, 30.0f, 30.0f);
        if (--this.d == 0) {
            if (!$$1) {
                return;
            }
            float $$2 = (float)Math.sqrt($$0) / this.i;
            float $$3 = bgj.a($$2, 0.1f, 1.0f);
            this.b.a(this.c, $$3);
            this.d = bgj.b($$2 * (float)(this.h - this.g) + (float)this.g);
        } else if (this.d < 0) {
            this.d = bgj.c(bgj.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
        }
    }
}

