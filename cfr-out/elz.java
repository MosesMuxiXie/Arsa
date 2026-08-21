/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class elz
extends elb
implements cdg {
    private static final yh k = yh.c("container.enchant");
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    private static final bgr l = bgr.a();
    private @Nullable yh m;

    public elz(is $$0, eoh $$1) {
        super(eld.n, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b("CustomName", yj.a, this.m);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.m = elz.a($$0, "CustomName");
    }

    public static void a(dwo $$0, is $$1, eoh $$2, elz $$3) {
        float $$8;
        $$3.g = $$3.f;
        $$3.i = $$3.h;
        ddm $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
        if ($$4 != null) {
            double $$5 = $$4.dP() - ((double)$$1.u() + 0.5);
            double $$6 = $$4.dV() - ((double)$$1.w() + 0.5);
            $$3.j = (float)bgj.d($$6, $$5);
            $$3.f += 0.1f;
            if ($$3.f < 0.5f || l.a(40) == 0) {
                float $$7 = $$3.d;
                do {
                    $$3.d += (float)(l.a(4) - l.a(4));
                } while ($$7 == $$3.d);
            }
        } else {
            $$3.j += 0.02f;
            $$3.f -= 0.1f;
        }
        while ($$3.h >= (float)Math.PI) {
            $$3.h -= (float)Math.PI * 2;
        }
        while ($$3.h < (float)(-Math.PI)) {
            $$3.h += (float)Math.PI * 2;
        }
        while ($$3.j >= (float)Math.PI) {
            $$3.j -= (float)Math.PI * 2;
        }
        while ($$3.j < (float)(-Math.PI)) {
            $$3.j += (float)Math.PI * 2;
        }
        for ($$8 = $$3.j - $$3.h; $$8 >= (float)Math.PI; $$8 -= (float)Math.PI * 2) {
        }
        while ($$8 < (float)(-Math.PI)) {
            $$8 += (float)Math.PI * 2;
        }
        $$3.h += $$8 * 0.4f;
        $$3.f = bgj.a($$3.f, 0.0f, 1.0f);
        ++$$3.a;
        $$3.c = $$3.b;
        float $$9 = ($$3.d - $$3.b) * 0.4f;
        float $$10 = 0.2f;
        $$9 = bgj.a($$9, -0.2f, 0.2f);
        $$3.e += ($$9 - $$3.e) * 0.9f;
        $$3.b += $$3.e;
    }

    @Override
    public yh ap() {
        if (this.m != null) {
            return this.m;
        }
        return k;
    }

    public void a(@Nullable yh $$0) {
        this.m = $$0;
    }

    @Override
    public @Nullable yh as() {
        return this.m;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.m = $$0.a(ki.h);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.h, this.m);
    }

    @Override
    public void b(fns $$0) {
        $$0.c("CustomName");
    }
}

