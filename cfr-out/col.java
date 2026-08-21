/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class col
extends cop {
    private final cii a;
    private @Nullable chl b;
    private final double c;
    private final cre d;
    private int e;
    private final float f;
    private final float g;
    private float h;

    public col(cii $$0, double $$1, float $$2, float $$3) {
        this.a = $$0;
        this.c = $$1;
        this.d = $$0.N();
        this.g = $$2;
        this.f = $$3;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
        if (!($$0.N() instanceof crd) && !($$0.N() instanceof crc)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    @Override
    public boolean b() {
        chl $$0 = this.a.U_();
        if ($$0 == null) {
            return false;
        }
        if (this.a.gU()) {
            return false;
        }
        if (this.a.g((cgk)$$0) < (double)(this.g * this.g)) {
            return false;
        }
        this.b = $$0;
        return true;
    }

    @Override
    public boolean c() {
        if (this.d.l()) {
            return false;
        }
        if (this.a.gU()) {
            return false;
        }
        return !(this.a.g((cgk)this.b) <= (double)(this.f * this.f));
    }

    @Override
    public void d() {
        this.e = 0;
        this.h = this.a.a(fls.j);
        this.a.a(fls.j, 0.0f);
    }

    @Override
    public void e() {
        this.b = null;
        this.d.n();
        this.a.a(fls.j, this.h);
    }

    @Override
    public void a() {
        boolean $$0 = this.a.gT();
        if (!$$0) {
            this.a.J().a(this.b, 10.0f, (float)this.a.ac());
        }
        if (--this.e > 0) {
            return;
        }
        this.e = this.a(10);
        if ($$0) {
            this.a.gS();
        } else {
            this.d.a((cgk)this.b, this.c);
        }
    }
}

