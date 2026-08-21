/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class djp
implements dib {
    private final jm<dlt> b;
    private final int c;
    private final int d;
    private final dhi e;

    public djp(dhi $$0, int $$1, int $$2) {
        this($$0, $$1, $$2, jm.a($$1 * $$2, dlt.l));
    }

    private djp(dhi $$0, int $$1, int $$2, jm<dlt> $$3) {
        this.b = $$3;
        this.e = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public int b() {
        return this.b.size();
    }

    @Override
    public boolean c() {
        for (dlt $$0 : this.b) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        if ($$0 >= this.b()) {
            return dlt.l;
        }
        return this.b.get($$0);
    }

    @Override
    public dlt b(int $$0) {
        return ccw.a(this.b, $$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$2 = ccw.a(this.b, $$0, $$1);
        if (!$$2.f()) {
            this.e.a(this);
        }
        return $$2;
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.b.set($$0, $$1);
        this.e.a(this);
    }

    @Override
    public void e() {
    }

    @Override
    public boolean a(ddm $$0) {
        return true;
    }

    @Override
    public void a() {
        this.b.clear();
    }

    @Override
    public int h() {
        return this.d;
    }

    @Override
    public int aB_() {
        return this.c;
    }

    @Override
    public List<dlt> i() {
        return List.copyOf(this.b);
    }

    @Override
    public void fillStackedContents(ddu $$0) {
        for (dlt $$1 : this.b) {
            $$0.a($$1);
        }
    }
}

