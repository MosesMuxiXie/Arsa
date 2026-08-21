/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class cdk
implements ccv,
djn {
    private final int b;
    private final jm<dlt> c;
    private @Nullable List<ccx> d;

    public cdk(int $$0) {
        this.b = $$0;
        this.c = jm.a($$0, dlt.l);
    }

    public cdk(dlt ... $$0) {
        this.b = $$0.length;
        this.c = jm.a(dlt.l, $$0);
    }

    public void a(ccx $$0) {
        if (this.d == null) {
            this.d = Lists.newArrayList();
        }
        this.d.add($$0);
    }

    public void b(ccx $$0) {
        if (this.d != null) {
            this.d.remove($$0);
        }
    }

    @Override
    public dlt a(int $$0) {
        if ($$0 < 0 || $$0 >= this.c.size()) {
            return dlt.l;
        }
        return this.c.get($$0);
    }

    public List<dlt> g() {
        List<dlt> $$02 = this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList());
        this.a();
        return $$02;
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$2 = ccw.a(this.c, $$0, $$1);
        if (!$$2.f()) {
            this.e();
        }
        return $$2;
    }

    public dlt a(dlp $$0, int $$1) {
        dlt $$2 = new dlt($$0, 0);
        for (int $$3 = this.b - 1; $$3 >= 0; --$$3) {
            dlt $$4 = this.a($$3);
            if (!$$4.h().equals($$0)) continue;
            int $$5 = $$1 - $$2.N();
            dlt $$6 = $$4.a($$5);
            $$2.g($$6.N());
            if ($$2.N() == $$1) break;
        }
        if (!$$2.f()) {
            this.e();
        }
        return $$2;
    }

    public dlt b(dlt $$0) {
        if ($$0.f()) {
            return dlt.l;
        }
        dlt $$1 = $$0.v();
        this.e($$1);
        if ($$1.f()) {
            return dlt.l;
        }
        this.d($$1);
        if ($$1.f()) {
            return dlt.l;
        }
        return $$1;
    }

    public boolean c(dlt $$0) {
        boolean $$1 = false;
        for (dlt $$2 : this.c) {
            if (!$$2.f() && (!dlt.c($$2, $$0) || $$2.N() >= $$2.k())) continue;
            $$1 = true;
            break;
        }
        return $$1;
    }

    @Override
    public dlt b(int $$0) {
        dlt $$1 = this.c.get($$0);
        if ($$1.f()) {
            return dlt.l;
        }
        this.c.set($$0, dlt.l);
        return $$1;
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.c.set($$0, $$1);
        $$1.f(this.f_($$1));
        this.e();
    }

    @Override
    public int b() {
        return this.b;
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
    public void e() {
        if (this.d != null) {
            for (ccx $$0 : this.d) {
                $$0.a(this);
            }
        }
    }

    @Override
    public boolean a(ddm $$0) {
        return true;
    }

    @Override
    public void a() {
        this.c.clear();
        this.e();
    }

    @Override
    public void fillStackedContents(ddu $$0) {
        for (dlt $$1 : this.c) {
            $$0.b($$1);
        }
    }

    public String toString() {
        return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
    }

    private void d(dlt $$0) {
        for (int $$1 = 0; $$1 < this.b; ++$$1) {
            dlt $$2 = this.a($$1);
            if (!$$2.f()) continue;
            this.a($$1, $$0.g());
            return;
        }
    }

    private void e(dlt $$0) {
        for (int $$1 = 0; $$1 < this.b; ++$$1) {
            dlt $$2 = this.a($$1);
            if (!dlt.c($$2, $$0)) continue;
            this.a($$0, $$2);
            if (!$$0.f()) continue;
            return;
        }
    }

    private void a(dlt $$0, dlt $$1) {
        int $$2 = this.f_($$1);
        int $$3 = Math.min($$0.N(), $$2 - $$1.N());
        if ($$3 > 0) {
            $$1.g($$3);
            $$0.h($$3);
            this.e();
        }
    }

    public void a(fnq.a<dlt> $$0) {
        this.a();
        for (dlt $$1 : $$0) {
            this.b($$1);
        }
    }

    public void a(fns.a<dlt> $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            dlt $$2 = this.a($$1);
            if ($$2.f()) continue;
            $$0.a($$2);
        }
    }

    public jm<dlt> h() {
        return this.c;
    }
}

