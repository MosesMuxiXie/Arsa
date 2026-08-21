/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dit
implements ccv {
    private final dvk b;
    private final jm<dlt> c = jm.a(3, dlt.l);
    private @Nullable dvl d;
    private int e;
    private int f;

    public dit(dvk $$0) {
        this.b = $$0;
    }

    @Override
    public int b() {
        return this.c.size();
    }

    @Override
    public boolean c() {
        for (dlt $$0 : this.c) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        return this.c.get($$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$2 = this.c.get($$0);
        if ($$0 == 2 && !$$2.f()) {
            return ccw.a(this.c, $$0, $$2.N());
        }
        dlt $$3 = ccw.a(this.c, $$0, $$1);
        if (!$$3.f() && this.e($$0)) {
            this.g();
        }
        return $$3;
    }

    private boolean e(int $$0) {
        return $$0 == 0 || $$0 == 1;
    }

    @Override
    public dlt b(int $$0) {
        return ccw.a(this.c, $$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.c.set($$0, $$1);
        $$1.f(this.f_($$1));
        if (this.e($$0)) {
            this.g();
        }
    }

    @Override
    public boolean a(ddm $$0) {
        return this.b.a() == $$0;
    }

    @Override
    public void e() {
        this.g();
    }

    public void g() {
        dlt $$3;
        dlt $$2;
        this.d = null;
        if (this.c.get(0).f()) {
            dlt $$0 = this.c.get(1);
            dlt $$1 = dlt.l;
        } else {
            $$2 = this.c.get(0);
            $$3 = this.c.get(1);
        }
        if ($$2.f()) {
            this.a(2, dlt.l);
            this.f = 0;
            return;
        }
        dvm $$4 = this.b.b();
        if (!$$4.isEmpty()) {
            dvl $$5 = $$4.a($$2, $$3, this.e);
            if ($$5 == null || $$5.r()) {
                this.d = $$5;
                $$5 = $$4.a($$3, $$2, this.e);
            }
            if ($$5 != null && !$$5.r()) {
                this.d = $$5;
                this.a(2, $$5.h());
                this.f = $$5.q();
            } else {
                this.a(2, dlt.l);
                this.f = 0;
            }
        }
        this.b.a(this.a(2));
    }

    public @Nullable dvl h() {
        return this.d;
    }

    public void d(int $$0) {
        this.e = $$0;
        this.g();
    }

    @Override
    public void a() {
        this.c.clear();
    }

    public int i() {
        return this.f;
    }
}

