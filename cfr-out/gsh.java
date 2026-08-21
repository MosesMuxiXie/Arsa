/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gsh {
    private final gfj a;
    private final gsl b;
    private final gsi c;
    private final int d;
    private final ad e;
    private final ao f;
    private final dlt g;
    private final yh h;
    private final gsj i;
    private final Map<ac, gsj> j = Maps.newLinkedHashMap();
    private double k;
    private double l;
    private int m = Integer.MAX_VALUE;
    private int n = Integer.MAX_VALUE;
    private int o = Integer.MIN_VALUE;
    private int p = Integer.MIN_VALUE;
    private float q;
    private boolean r;

    public gsh(gfj $$0, gsl $$1, gsi $$2, int $$3, ad $$4, ao $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$5.c();
        this.h = $$5.a();
        this.i = new gsj(this, $$0, $$4, $$5);
        this.a(this.i, $$4.b());
    }

    public gsi a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public ad c() {
        return this.e;
    }

    public yh d() {
        return this.h;
    }

    public ao e() {
        return this.f;
    }

    public void a(gir $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        int $$6 = $$1 + this.c.a(this.d);
        int $$7 = $$2 + this.c.b(this.d);
        this.c.a($$0, $$6, $$7, $$5, this.d);
        if (!$$5 && $$3 > $$6 && $$4 > $$7 && $$3 < $$6 + this.c.a() && $$4 < $$7 + this.c.b()) {
            $$0.a(fyn.d);
        }
    }

    public void a(gir $$0, int $$1, int $$2) {
        this.c.a($$0, $$1, $$2, this.d, this.g);
    }

    public void b(gir $$0, int $$1, int $$2) {
        if (!this.r) {
            this.k = 117 - (this.o + this.m) / 2;
            this.l = 56 - (this.p + this.n) / 2;
            this.r = true;
        }
        $$0.c($$1, $$2, $$1 + 234, $$2 + 113);
        $$0.e().pushMatrix();
        $$0.e().translate((float)$$1, (float)$$2);
        amo $$3 = this.f.d().map(iu.b::b).orElse(ilr.a);
        int $$4 = bgj.c(this.k);
        int $$5 = bgj.c(this.l);
        int $$6 = $$4 % 16;
        int $$7 = $$5 % 16;
        for (int $$8 = -1; $$8 <= 15; ++$$8) {
            for (int $$9 = -1; $$9 <= 8; ++$$9) {
                $$0.a(hpa.at, $$3, $$6 + 16 * $$8, $$7 + 16 * $$9, 0.0f, 0.0f, 16, 16, 16, 16);
            }
        }
        this.i.a($$0, $$4, $$5, true);
        this.i.a($$0, $$4, $$5, false);
        this.i.a($$0, $$4, $$5);
        $$0.e().popMatrix();
        $$0.f();
    }

    public void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(0, 0, 234, 113, bgj.b(this.q * 255.0f) << 24);
        boolean $$5 = false;
        int $$6 = bgj.c(this.k);
        int $$7 = bgj.c(this.l);
        if ($$1 > 0 && $$1 < 234 && $$2 > 0 && $$2 < 113) {
            for (gsj $$8 : this.j.values()) {
                if (!$$8.a($$6, $$7, $$1, $$2)) continue;
                $$5 = true;
                $$8.a($$0, $$6, $$7, this.q, $$3, $$4);
                break;
            }
        }
        this.q = $$5 ? bgj.a(this.q + 0.02f, 0.0f, 0.3f) : bgj.a(this.q - 0.04f, 0.0f, 1.0f);
    }

    public boolean a(int $$0, int $$1, double $$2, double $$3) {
        return this.c.a($$0, $$1, this.d, $$2, $$3);
    }

    public static @Nullable gsh a(gfj $$0, gsl $$1, int $$2, ad $$3) {
        Optional<ao> $$4 = $$3.a().c();
        if ($$4.isEmpty()) {
            return null;
        }
        for (gsi $$5 : gsi.values()) {
            if ($$2 >= $$5.c()) {
                $$2 -= $$5.c();
                continue;
            }
            return new gsh($$0, $$1, $$5, $$2, $$3, $$4.get());
        }
        return null;
    }

    public void a(double $$0, double $$1) {
        if (this.f()) {
            this.k = bgj.a(this.k + $$0, (double)(-(this.o - 234)), 0.0);
        }
        if (this.g()) {
            this.l = bgj.a(this.l + $$1, (double)(-(this.p - 113)), 0.0);
        }
    }

    public boolean f() {
        return this.o - this.m > 234;
    }

    public boolean g() {
        return this.p - this.n > 113;
    }

    public void a(ad $$0) {
        Optional<ao> $$1 = $$0.a().c();
        if ($$1.isEmpty()) {
            return;
        }
        gsj $$2 = new gsj(this, this.a, $$0, $$1.get());
        this.a($$2, $$0.b());
    }

    private void a(gsj $$0, ac $$1) {
        this.j.put($$1, $$0);
        int $$2 = $$0.d();
        int $$3 = $$2 + 28;
        int $$4 = $$0.c();
        int $$5 = $$4 + 27;
        this.m = Math.min(this.m, $$2);
        this.o = Math.max(this.o, $$3);
        this.n = Math.min(this.n, $$4);
        this.p = Math.max(this.p, $$5);
        for (gsj $$6 : this.j.values()) {
            $$6.b();
        }
    }

    public @Nullable gsj a(ac $$0) {
        return this.j.get($$0);
    }

    public gsl h() {
        return this.b;
    }
}

