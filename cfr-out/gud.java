/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class gud {
    private static final amo c = amo.b("container/inventory/effect_background");
    private static final amo d = amo.b("container/inventory/effect_background_ambient");
    private static final int e = 18;
    public static final int a = 7;
    private static final int f = 32;
    public static final int b = 32;
    private final gti<?> g;
    private final gfj h;

    public gud(gti<?> $$0) {
        this.g = $$0;
        this.h = gfj.V();
    }

    public boolean a() {
        int $$0 = this.g.z + this.g.d + 2;
        int $$1 = this.g.o - $$0;
        return $$1 >= 32;
    }

    public void a(gir $$0, int $$1, int $$2) {
        int $$3 = this.g.z + this.g.d + 2;
        int $$4 = this.g.o - $$3;
        Collection<cfm> $$5 = this.h.s.eW();
        if ($$5.isEmpty() || $$4 < 32) {
            return;
        }
        int $$6 = $$4 >= 120 ? $$4 - 7 : 32;
        int $$7 = 33;
        if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
        }
        this.a($$0, $$5, $$3, $$7, $$1, $$2, $$6);
    }

    private void a(gir $$0, Collection<cfm> $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        List $$7 = Ordering.natural().sortedCopy($$1);
        int $$8 = this.g.A;
        gio $$9 = this.g.C();
        for (cfm $$10 : $$7) {
            boolean $$11 = $$10.f();
            yh $$12 = this.a($$10);
            yh $$13 = cfn.a($$10, 1.0f, this.h.r.y().f());
            int $$14 = this.a($$0, $$9, $$12, $$13, $$2, $$8, $$11, $$6);
            this.a($$0, $$12, $$13, $$9, $$2, $$8, $$14, $$3, $$4, $$5);
            $$0.a(hpa.at, giq.a($$10.c()), $$2 + 7, $$8 + 7, 18, 18);
            $$8 += $$3;
        }
    }

    private int a(gir $$0, gio $$1, yh $$2, yh $$3, int $$4, int $$5, boolean $$6, int $$7) {
        int $$8 = 32 + $$1.a($$2) + 7;
        int $$9 = 32 + $$1.a($$3) + 7;
        int $$10 = Math.min($$7, Math.max($$8, $$9));
        $$0.a(hpa.at, $$6 ? d : c, $$4, $$5, $$10, 32);
        return $$10;
    }

    private void a(gir $$0, yh $$1, yh $$2, gio $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
        boolean $$16;
        int $$10 = $$4 + 32;
        int $$11 = $$5 + 7;
        int $$12 = $$6 - 32 - 7;
        if ($$12 > 0) {
            boolean $$13 = $$3.a($$1) > $$12;
            bfr $$14 = $$13 ? gko.a($$1, $$3, $$12) : $$1.g();
            $$0.b($$3, $$14, $$10, $$11, -1);
            $$0.b($$3, $$2, $$10, $$11 + $$3.b, -8355712);
            boolean $$15 = $$13;
        } else {
            $$16 = true;
        }
        if ($$16 && $$8 >= $$4 && $$8 <= $$4 + $$6 && $$9 >= $$5 && $$9 <= $$5 + $$7) {
            $$0.a(this.g.C(), List.of($$1, $$2), Optional.empty(), $$8, $$9);
        }
    }

    private yh a(cfm $$0) {
        yw $$1 = $$0.c().a().g().f();
        if ($$0.e() >= 1 && $$0.e() <= 9) {
            $$1.b(yg.x).b(yh.c("enchantment.level." + ($$0.e() + 1)));
        }
        return $$1;
    }
}

