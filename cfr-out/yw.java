/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public final class yw
implements yh {
    private final yi c;
    private final List<yh> d;
    private zf e;
    private bfr f = bfr.a;
    private @Nullable uu g;

    yw(yi $$0, List<yh> $$1, zf $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static yw a(yi $$0) {
        return new yw($$0, Lists.newArrayList(), zf.a);
    }

    @Override
    public yi b() {
        return this.c;
    }

    @Override
    public List<yh> c() {
        return this.d;
    }

    public yw b(zf $$0) {
        this.e = $$0;
        return this;
    }

    @Override
    public zf a() {
        return this.e;
    }

    public yw f(String $$0) {
        if ($$0.isEmpty()) {
            return this;
        }
        return this.b(yh.b($$0));
    }

    public yw b(yh $$0) {
        this.d.add($$0);
        return this;
    }

    public yw a(UnaryOperator<zf> $$0) {
        this.b((zf)$$0.apply(this.a()));
        return this;
    }

    public yw c(zf $$0) {
        this.b($$0.a(this.a()));
        return this;
    }

    public yw a(l ... $$0) {
        this.b(this.a().a($$0));
        return this;
    }

    public yw a(l $$0) {
        this.b(this.a().b($$0));
        return this;
    }

    public yw b(int $$0) {
        this.b(this.a().a($$0));
        return this;
    }

    public yw j() {
        this.b(this.a().m());
        return this;
    }

    @Override
    public bfr g() {
        uu $$0 = uu.a();
        if (this.g != $$0) {
            this.f = $$0.a(this);
            this.g = $$0;
        }
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof yw)) return false;
        yw $$1 = (yw)$$0;
        if (!this.c.equals($$1.c)) return false;
        if (!this.e.equals($$1.e)) return false;
        if (!this.d.equals($$1.d)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = 1;
        $$0 = 31 * $$0 + this.c.hashCode();
        $$0 = 31 * $$0 + this.e.hashCode();
        $$0 = 31 * $$0 + this.d.hashCode();
        return $$0;
    }

    public String toString() {
        boolean $$2;
        StringBuilder $$0 = new StringBuilder(this.c.toString());
        boolean $$1 = !this.e.h();
        boolean bl2 = $$2 = !this.d.isEmpty();
        if ($$1 || $$2) {
            $$0.append('[');
            if ($$1) {
                $$0.append("style=");
                $$0.append(this.e);
            }
            if ($$1 && $$2) {
                $$0.append(", ");
            }
            if ($$2) {
                $$0.append("siblings=");
                $$0.append(this.d);
            }
            $$0.append(']');
        }
        return $$0.toString();
    }
}

