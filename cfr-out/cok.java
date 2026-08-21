/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cok
extends cop {
    private final chn a;
    private final Predicate<chn> b;
    private @Nullable chn c;
    private final double d;
    private final cre e;
    private int f;
    private final float g;
    private float h;
    private final float i;

    public cok(chn $$0, double $$12, float $$2, float $$3) {
        this.a = $$0;
        this.b = $$1 -> $$0.getClass() != $$1.getClass();
        this.d = $$12;
        this.e = $$0.N();
        this.g = $$2;
        this.i = $$3;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
        if (!($$0.N() instanceof crd) && !($$0.N() instanceof crc)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }

    @Override
    public boolean b() {
        List<chn> $$0 = this.a.ao().a(chn.class, this.a.dj().g(this.i), this.b);
        if (!$$0.isEmpty()) {
            for (chn $$1 : $$0) {
                if ($$1.cG()) continue;
                this.c = $$1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean c() {
        return this.c != null && !this.e.l() && this.a.g((cgk)this.c) > (double)(this.g * this.g);
    }

    @Override
    public void d() {
        this.f = 0;
        this.h = this.a.a(fls.j);
        this.a.a(fls.j, 0.0f);
    }

    @Override
    public void e() {
        this.c = null;
        this.e.n();
        this.a.a(fls.j, this.h);
    }

    @Override
    public void a() {
        double $$2;
        double $$1;
        if (this.c == null || this.a.S_()) {
            return;
        }
        this.a.J().a(this.c, 10.0f, (float)this.a.ac());
        if (--this.f > 0) {
            return;
        }
        this.f = this.a(10);
        double $$0 = this.a.dP() - this.c.dP();
        double $$3 = $$0 * $$0 + ($$1 = this.a.dR() - this.c.dR()) * $$1 + ($$2 = this.a.dV() - this.c.dV()) * $$2;
        if ($$3 <= (double)(this.g * this.g)) {
            this.e.n();
            cnp $$4 = this.c.J();
            if ($$3 <= (double)this.g || $$4.e() == this.a.dP() && $$4.f() == this.a.dR() && $$4.g() == this.a.dV()) {
                double $$5 = this.c.dP() - this.a.dP();
                double $$6 = this.c.dV() - this.a.dV();
                this.e.a(this.a.dP() - $$5, this.a.dR(), this.a.dV() - $$6, this.d);
            }
            return;
        }
        this.e.a((cgk)this.c, this.d);
    }
}

