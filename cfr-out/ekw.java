/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class ekw
extends elb
implements cdf,
cdg,
ekv {
    private static final int f = 4;
    public static final List<List<jd<cfk>>> a = List.of(List.of(cfo.a, cfo.c), List.of(cfo.k, cfo.h), List.of(cfo.e), List.of(cfo.j));
    private static final Set<jd<cfk>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private static final int h = 10;
    private static final yh i = yh.c("container.beacon");
    private static final String j = "primary_effect";
    private static final String k = "secondary_effect";
    List<ekv.a> l = new ArrayList<ekv.a>();
    private List<ekv.a> m = new ArrayList<ekv.a>();
    int q;
    private int r;
    @Nullable jd<cfk> s;
    @Nullable jd<cfk> t;
    private @Nullable yh u;
    private cde v = cde.a;
    private final dhv w = new dhv(){

        @Override
        public int a(int $$0) {
            return switch ($$0) {
                case 0 -> ekw.this.q;
                case 1 -> dho.a(ekw.this.s);
                case 2 -> dho.a(ekw.this.t);
                default -> 0;
            };
        }

        @Override
        public void a(int $$0, int $$1) {
            switch ($$0) {
                case 0: {
                    ekw.this.q = $$1;
                    break;
                }
                case 1: {
                    if (!ekw.this.n.B_() && !ekw.this.l.isEmpty()) {
                        ekw.a(ekw.this.n, ekw.this.o, bda.bZ);
                    }
                    ekw.this.s = ekw.a(dho.e($$1));
                    break;
                }
                case 2: {
                    ekw.this.t = ekw.a(dho.e($$1));
                }
            }
        }

        @Override
        public int a() {
            return 3;
        }
    };

    static @Nullable jd<cfk> a(@Nullable jd<cfk> $$0) {
        return g.contains($$0) ? $$0 : null;
    }

    public ekw(is $$0, eoh $$1) {
        super(eld.p, $$0, $$1);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, ekw $$3) {
        is $$8;
        int $$4 = $$1.u();
        int $$5 = $$1.v();
        int $$6 = $$1.w();
        if ($$3.r < $$5) {
            is $$7 = $$1;
            $$3.m = Lists.newArrayList();
            $$3.r = $$7.v() - 1;
        } else {
            $$8 = new is($$4, $$3.r + 1, $$6);
        }
        ekv.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
        int $$10 = $$0.a(euq.a.b, $$4, $$6);
        for (int $$11 = 0; $$11 < 10 && $$8.v() <= $$10; ++$$11) {
            block18: {
                eoh $$12;
                block16: {
                    int $$15;
                    block17: {
                        $$12 = $$0.a_($$8);
                        dzq $$13 = $$12.b();
                        if (!($$13 instanceof dzh)) break block16;
                        dzh $$14 = (dzh)((Object)$$13);
                        $$15 = $$14.b().d();
                        if ($$3.m.size() > 1) break block17;
                        $$9 = new ekv.a($$15);
                        $$3.m.add($$9);
                        break block18;
                    }
                    if ($$9 == null) break block18;
                    if ($$15 == $$9.b()) {
                        $$9.a();
                    } else {
                        $$9 = new ekv.a(bel.g($$9.b(), $$15));
                        $$3.m.add($$9);
                    }
                    break block18;
                }
                if ($$9 != null && ($$12.g() < 15 || $$12.a(dzs.I))) {
                    $$9.a();
                } else {
                    $$3.m.clear();
                    $$3.r = $$10;
                    break;
                }
            }
            $$8 = $$8.d();
            ++$$3.r;
        }
        int $$16 = $$3.q;
        if ($$0.au() % 80L == 0L) {
            if (!$$3.l.isEmpty()) {
                $$3.q = ekw.a($$0, $$4, $$5, $$6);
            }
            if ($$3.q > 0 && !$$3.l.isEmpty()) {
                ekw.a($$0, $$1, $$3.q, $$3.s, $$3.t);
                ekw.a($$0, $$1, bda.bX);
            }
        }
        if ($$3.r >= $$10) {
            $$3.r = $$0.K_() - 1;
            boolean $$17 = $$16 > 0;
            $$3.l = $$3.m;
            if (!$$0.B_()) {
                boolean $$18;
                boolean bl2 = $$18 = $$3.q > 0;
                if (!$$17 && $$18) {
                    ekw.a($$0, $$1, bda.bW);
                    for (axg $$19 : $$0.a(axg.class, new fth($$4, $$5, $$6, $$4, $$5 - 4, $$6).c(10.0, 5.0, 10.0))) {
                        aj.m.a($$19, $$3.q);
                    }
                } else if ($$17 && !$$18) {
                    ekw.a($$0, $$1, bda.bY);
                }
            }
        }
    }

    private static int a(dwo $$0, int $$1, int $$2, int $$3) {
        int $$6;
        int $$4 = 0;
        int $$5 = 1;
        while ($$5 <= 4 && ($$6 = $$2 - $$5) >= $$0.K_()) {
            boolean $$7 = true;
            block1: for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; ++$$8) {
                for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; ++$$9) {
                    if ($$0.a_(new is($$8, $$6, $$9)).a(bdp.ba)) continue;
                    $$7 = false;
                    continue block1;
                }
            }
            if (!$$7) break;
            $$4 = $$5++;
        }
        return $$4;
    }

    @Override
    public void ay_() {
        ekw.a(this.n, this.o, bda.bY);
        super.ay_();
    }

    private static void a(dwo $$0, is $$1, int $$2, @Nullable jd<cfk> $$3, @Nullable jd<cfk> $$4) {
        if ($$0.B_() || $$3 == null) {
            return;
        }
        double $$5 = $$2 * 10 + 10;
        int $$6 = 0;
        if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
        }
        int $$7 = (9 + $$2 * 2) * 20;
        fth $$8 = new fth($$1).g($$5).b(0.0, $$0.L_(), 0.0);
        List<ddm> $$9 = $$0.a(ddm.class, $$8);
        for (ddm $$10 : $$9) {
            $$10.a(new cfm($$3, $$7, $$6, true, true));
        }
        if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (ddm $$11 : $$9) {
                $$11.a(new cfm($$4, $$7, 0, true, true));
            }
        }
    }

    public static void a(dwo $$0, is $$1, bcz $$2) {
        $$0.a(null, $$1, $$2, bdb.e, 1.0f, 1.0f);
    }

    @Override
    public List<ekv.a> a() {
        return this.q == 0 ? ImmutableList.of() : this.l;
    }

    public adh c() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    private static void a(fns $$0, String $$1, @Nullable jd<cfk> $$22) {
        if ($$22 != null) {
            $$22.e().ifPresent($$2 -> $$0.a($$1, $$2.a().toString()));
        }
    }

    private static @Nullable jd<cfk> b(fnq $$0, String $$1) {
        return $$0.a($$1, mi.d.r()).filter(g::contains).orElse(null);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.s = ekw.b($$0, j);
        this.t = ekw.b($$0, k);
        this.u = ekw.a($$0, "CustomName");
        this.v = cde.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        ekw.a($$0, j, this.s);
        ekw.a($$0, k, this.t);
        $$0.a("Levels", this.q);
        $$0.b("CustomName", yj.a, this.u);
        this.v.a($$0);
    }

    public void a(@Nullable yh $$0) {
        this.u = $$0;
    }

    @Override
    public @Nullable yh as() {
        return this.u;
    }

    @Override
    public @Nullable dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        if (this.v.a($$2)) {
            return new dho($$0, $$1, this.w, dhw.a(this.n, this.aD_()));
        }
        eku.a(this.aD_().b(), $$2, this.R_());
        return null;
    }

    @Override
    public yh R_() {
        return this.ap();
    }

    @Override
    public yh ap() {
        if (this.u != null) {
            return this.u;
        }
        return i;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.u = $$0.a(ki.h);
        this.v = $$0.a(ki.az, cde.a);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.h, this.u);
        if (!this.v.equals(cde.a)) {
            $$0.a(ki.az, this.v);
        }
    }

    @Override
    public void b(fns $$0) {
        $$0.c("CustomName");
        $$0.c("lock");
    }

    @Override
    public void a(dwo $$0) {
        super.a($$0);
        this.r = $$0.K_() - 1;
    }

    public /* synthetic */ aay ax_() {
        return this.c();
    }
}

