/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class etj
implements etn {
    private final List<etm> b = Lists.newArrayList();
    private final Set<etm> c = Sets.newHashSet();
    private final List<etm> d = Lists.newArrayList();
    private boolean e;
    private final axf f;
    private final int g;
    private final a h;

    public etj(axf $$0, int $$1, a $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    @Override
    public boolean a() {
        return this.b.isEmpty();
    }

    @Override
    public void a(etm $$0) {
        if (this.e) {
            this.d.add($$0);
        } else {
            this.b.add($$0);
        }
        etj.a(this.f, $$0);
    }

    private static void a(axf $$0, etm $$1) {
        eti $$5;
        cgk $$6;
        if (!$$0.W().a(bxf.n)) {
            return;
        }
        bwy $$2 = new bwy($$1.b());
        eto $$3 = $$1.a();
        if ($$3 instanceof etg) {
            etg $$4 = (etg)$$3;
            $$0.W().a($$4.b(), bxf.n, $$2);
        } else if ($$3 instanceof eti && ($$6 = $$0.d(($$5 = (eti)$$3).b())) != null) {
            $$0.W().a($$6, bxf.n, $$2);
        }
    }

    @Override
    public void b(etm $$0) {
        if (this.e) {
            this.c.add($$0);
        } else {
            this.b.remove($$0);
        }
        if (this.b.isEmpty()) {
            this.h.apply(this.g);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(jd<etk> $$0, ftm $$1, etk.a $$2, etn.a $$3) {
        this.e = true;
        boolean $$4 = false;
        try {
            Iterator<etm> $$5 = this.b.iterator();
            while ($$5.hasNext()) {
                etm $$6 = $$5.next();
                if (this.c.remove($$6)) {
                    $$5.remove();
                    continue;
                }
                Optional<ftm> $$7 = etj.a(this.f, $$1, $$6);
                if (!$$7.isPresent()) continue;
                $$3.visit($$6, $$7.get());
                $$4 = true;
            }
        }
        finally {
            this.e = false;
        }
        if (!this.d.isEmpty()) {
            this.b.addAll(this.d);
            this.d.clear();
        }
        if (!this.c.isEmpty()) {
            this.b.removeAll(this.c);
            this.c.clear();
        }
        return $$4;
    }

    private static Optional<ftm> a(axf $$0, ftm $$1, etm $$2) {
        int $$5;
        Optional<ftm> $$3 = $$2.a().a($$0);
        if ($$3.isEmpty()) {
            return Optional.empty();
        }
        double $$4 = is.a($$3.get()).j(is.a($$1));
        if ($$4 > (double)($$5 = $$2.b() * $$2.b())) {
            return Optional.empty();
        }
        return $$3;
    }

    @FunctionalInterface
    public static interface a {
        public void apply(int var1);
    }
}

