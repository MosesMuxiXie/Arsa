/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class flr {
    private static final float a = 1.5f;
    private final fln[] b = new fln[32];
    private int c;
    private final flo d;
    private final fll e = new fll();
    private BooleanSupplier f = () -> false;

    public flr(flo $$0, int $$1) {
        this.d = $$0;
        this.c = $$1;
    }

    public void a(BooleanSupplier $$0) {
        this.f = $$0;
    }

    public void a(int $$0) {
        this.c = $$0;
    }

    public @Nullable flp a(dxb $$02, chn $$1, Set<is> $$2, float $$3, int $$4, float $$5) {
        this.e.a();
        this.d.a($$02, $$1);
        fln $$6 = this.d.a();
        if ($$6 == null) {
            return null;
        }
        Map<flw, is> $$7 = $$2.stream().collect(Collectors.toMap($$0 -> this.d.a($$0.u(), $$0.v(), $$0.w()), Function.identity()));
        flp $$8 = this.a($$6, $$7, $$3, $$4, $$5);
        this.d.b();
        return $$8;
    }

    private @Nullable flp a(fln $$0, Map<flw, is> $$12, float $$2, int $$3, float $$4) {
        bzm $$5 = bzl.a();
        $$5.a("find_path");
        $$5.a(caw.a);
        Set<flw> $$6 = $$12.keySet();
        $$0.e = 0.0f;
        $$0.g = $$0.f = this.a($$0, $$6);
        this.e.a();
        this.e.a($$0);
        boolean $$7 = this.f.getAsBoolean();
        HashSet<fln> $$8 = $$7 ? new HashSet<fln>() : Set.of();
        int $$9 = 0;
        HashSet $$10 = Sets.newHashSetWithExpectedSize((int)$$6.size());
        int $$11 = (int)((float)this.c * $$4);
        while (!this.e.e() && ++$$9 < $$11) {
            fln $$122 = this.e.c();
            $$122.i = true;
            for (flw $$13 : $$6) {
                if (!($$122.d($$13) <= (float)$$3)) continue;
                $$13.e();
                $$10.add($$13);
            }
            if (!$$10.isEmpty()) break;
            if ($$7) {
                $$8.add($$122);
            }
            if ($$122.a($$0) >= $$2) continue;
            int $$14 = this.d.a(this.b, $$122);
            for (int $$15 = 0; $$15 < $$14; ++$$15) {
                fln $$16 = this.b[$$15];
                float $$17 = this.a($$122, $$16);
                $$16.j = $$122.j + $$17;
                float $$18 = $$122.e + $$17 + $$16.k;
                if (!($$16.j < $$2) || $$16.c() && !($$18 < $$16.e)) continue;
                $$16.h = $$122;
                $$16.e = $$18;
                $$16.f = this.a($$16, $$6) * 1.5f;
                if ($$16.c()) {
                    this.e.a($$16, $$16.e + $$16.f);
                    continue;
                }
                $$16.g = $$16.e + $$16.f;
                this.e.a($$16);
            }
        }
        Optional<flp> $$19 = !$$10.isEmpty() ? $$10.stream().map($$1 -> this.a($$1.d(), (is)$$12.get($$1), true)).min(Comparator.comparingInt(flp::e)) : $$6.stream().map($$1 -> this.a($$1.d(), (is)$$12.get($$1), false)).min(Comparator.comparingDouble(flp::m).thenComparingInt(flp::e));
        $$5.c();
        if ($$19.isEmpty()) {
            return null;
        }
        flp $$20 = $$19.get();
        if ($$7) {
            $$20.a(this.e.f(), (fln[])$$8.toArray(fln[]::new), $$6);
        }
        return $$20;
    }

    protected float a(fln $$0, fln $$1) {
        return $$0.a($$1);
    }

    private float a(fln $$0, Set<flw> $$1) {
        float $$2 = Float.MAX_VALUE;
        for (flw $$3 : $$1) {
            float $$4 = $$0.a($$3);
            $$3.a($$4, $$0);
            $$2 = Math.min($$4, $$2);
        }
        return $$2;
    }

    private flp a(fln $$0, is $$1, boolean $$2) {
        ArrayList $$3 = Lists.newArrayList();
        fln $$4 = $$0;
        $$3.add(0, $$4);
        while ($$4.h != null) {
            $$4 = $$4.h;
            $$3.add(0, $$4);
        }
        return new flp($$3, $$1, $$2);
    }
}

