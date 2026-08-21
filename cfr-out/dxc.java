/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class dxc {
    private final List<a> a = Lists.newArrayList();

    public void a(is $$0, double $$1) {
        if ($$1 != 0.0) {
            this.a.add(new a($$0, $$1));
        }
    }

    public double b(is $$0, double $$1) {
        if ($$1 == 0.0) {
            return 0.0;
        }
        double $$2 = 0.0;
        for (a $$3 : this.a) {
            $$2 += $$3.a($$0);
        }
        return $$2 * $$1;
    }

    static class a {
        private final is a;
        private final double b;

        public a(is $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public double a(is $$0) {
            double $$1 = this.a.j($$0);
            if ($$1 == 0.0) {
                return Double.POSITIVE_INFINITY;
            }
            return this.b / Math.sqrt($$1);
        }
    }
}

