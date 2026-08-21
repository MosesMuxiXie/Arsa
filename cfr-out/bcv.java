/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.google.common.collect.Table
 *  com.google.common.collect.Tables
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class bcv
implements fvu<fvx> {
    private final Set<fvx> a = new HashSet<fvx>();
    private final Set<axg> b = new HashSet<axg>();
    private final Table<axg, fvx, fvx.c> c = HashBasedTable.create();

    @Override
    public void a(fvx $$0) {
        this.a.add($$0);
        for (axg $$1 : this.b) {
            this.a($$1, $$0);
        }
    }

    @Override
    public void b(fvx $$0) {
        if (!this.a.contains($$0)) {
            return;
        }
        Map $$1 = Tables.transpose(this.c).row((Object)$$0);
        Sets.SetView $$2 = Sets.difference(this.b, $$1.keySet());
        for (Map.Entry $$3 : ImmutableSet.copyOf($$1.entrySet())) {
            this.a((axg)$$3.getKey(), $$0, (fvx.c)$$3.getValue());
        }
        for (axg $$4 : $$2) {
            this.a($$4, $$0);
        }
    }

    @Override
    public void c(fvx $$02) {
        this.c.column((Object)$$02).forEach(($$0, $$1) -> $$1.d());
        Tables.transpose(this.c).row((Object)$$02).clear();
        this.a.remove($$02);
    }

    @Override
    public void a(axg $$0) {
        this.b.add($$0);
        for (fvx $$1 : this.a) {
            this.a($$0, $$1);
        }
        if ($$0.gx()) {
            this.a((fvx)$$0);
        }
    }

    @Override
    public void b(axg $$0) {
        Map $$1 = this.c.row((Object)$$0);
        Sets.SetView $$2 = Sets.difference(this.a, $$1.keySet());
        for (Map.Entry $$3 : ImmutableSet.copyOf($$1.entrySet())) {
            this.a($$0, (fvx)$$3.getKey(), (fvx.c)$$3.getValue());
        }
        for (fvx $$4 : $$2) {
            this.a($$0, $$4);
        }
    }

    @Override
    public void c(axg $$02) {
        this.c.row((Object)$$02).values().removeIf($$0 -> {
            $$0.d();
            return true;
        });
        this.c((fvx)$$02);
        this.b.remove($$02);
    }

    public void a() {
        this.c.values().forEach(fvx.c::d);
        this.c.clear();
    }

    public void d(fvx $$0) {
        for (axg $$1 : this.b) {
            this.a($$1, $$0);
        }
    }

    public Set<fvx> b() {
        return this.a;
    }

    private static boolean d(axg $$0) {
        return $$0.A().U().a(eua.v);
    }

    private void a(axg $$0, fvx $$1) {
        if ($$0 == $$1) {
            return;
        }
        if (!bcv.d($$0)) {
            return;
        }
        $$1.f($$0).ifPresentOrElse($$2 -> {
            this.c.put((Object)$$0, (Object)$$1, $$2);
            $$2.c();
        }, () -> {
            fvx.c $$2 = (fvx.c)this.c.remove((Object)$$0, (Object)$$1);
            if ($$2 != null) {
                $$2.d();
            }
        });
    }

    private void a(axg $$0, fvx $$1, fvx.c $$22) {
        if ($$0 == $$1) {
            return;
        }
        if (!bcv.d($$0)) {
            return;
        }
        if (!$$22.b()) {
            $$22.e();
            return;
        }
        $$1.f($$0).ifPresentOrElse($$2 -> {
            $$2.c();
            this.c.put((Object)$$0, (Object)$$1, $$2);
        }, () -> {
            $$22.d();
            this.c.remove((Object)$$0, (Object)$$1);
        });
    }

    @Override
    public /* synthetic */ void a(fvt fvt2) {
        this.c((fvx)fvt2);
    }

    @Override
    public /* synthetic */ void c(fvt fvt2) {
        this.a((fvx)fvt2);
    }
}

