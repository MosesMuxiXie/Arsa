/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public abstract class eko
extends eku
implements cdp,
djb,
djn {
    protected static final int b = 0;
    protected static final int c = 1;
    protected static final int d = 2;
    public static final int e = 0;
    private static final int[] q = new int[]{0};
    private static final int[] r = new int[]{2, 1};
    private static final int[] s = new int[]{1};
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 200;
    public static final int k = 2;
    private static final Codec<Map<amt<dqs<?>>, Integer>> t = Codec.unboundedMap(dqs.b, (Codec)Codec.INT);
    private static final short u = 0;
    private static final short v = 0;
    private static final short w = 0;
    private static final short x = 0;
    protected jm<dlt> l = jm.a(3, dlt.l);
    int y;
    int z;
    int A;
    int B;
    protected final dhv m = new dhv(){

        @Override
        public int a(int $$0) {
            switch ($$0) {
                case 0: {
                    return eko.this.y;
                }
                case 1: {
                    return eko.this.z;
                }
                case 2: {
                    return eko.this.A;
                }
                case 3: {
                    return eko.this.B;
                }
            }
            return 0;
        }

        @Override
        public void a(int $$0, int $$1) {
            switch ($$0) {
                case 0: {
                    eko.this.y = $$1;
                    break;
                }
                case 1: {
                    eko.this.z = $$1;
                    break;
                }
                case 2: {
                    eko.this.A = $$1;
                    break;
                }
                case 3: {
                    eko.this.B = $$1;
                    break;
                }
            }
        }

        @Override
        public int a() {
            return 4;
        }
    };
    private final Reference2IntOpenHashMap<amt<dqs<?>>> C = new Reference2IntOpenHashMap();
    private final dqz.a<drl, ? extends dpy> D;

    protected eko(eld<?> $$0, is $$1, eoh $$2, drd<? extends dpy> $$3) {
        super($$0, $$1, $$2);
        this.D = dqz.a($$3);
    }

    private boolean h() {
        return this.y > 0;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.l = jm.a(this.b(), dlt.l);
        ccw.a($$0, this.l);
        this.A = $$0.a("cooking_time_spent", (short)0);
        this.B = $$0.a("cooking_total_time", (short)0);
        this.y = $$0.a("lit_time_remaining", (short)0);
        this.z = $$0.a("lit_total_time", (short)0);
        this.C.clear();
        this.C.putAll($$0.a("RecipesUsed", t).orElse(Map.of()));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("cooking_time_spent", (short)this.A);
        $$0.a("cooking_total_time", (short)this.B);
        $$0.a("lit_time_remaining", (short)this.y);
        $$0.a("lit_total_time", (short)this.z);
        ccw.a($$0, this.l);
        $$0.a("RecipesUsed", t, this.C);
    }

    public static void a(axf $$0, is $$1, eoh $$2, eko $$3) {
        boolean $$9;
        boolean $$4 = $$3.h();
        boolean $$5 = false;
        if ($$3.h()) {
            --$$3.y;
        }
        dlt $$6 = $$3.l.get(1);
        dlt $$7 = $$3.l.get(0);
        boolean $$8 = !$$7.f();
        boolean bl2 = $$9 = !$$6.f();
        if ($$3.h() || $$9 && $$8) {
            dqx<? extends dpy> $$12;
            drl $$10 = new drl($$7);
            if ($$8) {
                dqx $$11 = $$3.D.a($$10, $$0).orElse(null);
            } else {
                $$12 = null;
            }
            int $$13 = $$3.ap_();
            if (!$$3.h() && eko.a($$0.J_(), $$12, $$10, $$3.l, $$13)) {
                $$3.z = $$3.y = $$3.a($$0.S(), $$6);
                if ($$3.h()) {
                    $$5 = true;
                    if ($$9) {
                        dlp $$14 = $$6.h();
                        $$6.h(1);
                        if ($$6.f()) {
                            $$3.l.set(1, $$14.i());
                        }
                    }
                }
            }
            if ($$3.h() && eko.a($$0.J_(), $$12, $$10, $$3.l, $$13)) {
                ++$$3.A;
                if ($$3.A == $$3.B) {
                    $$3.A = 0;
                    $$3.B = eko.a($$0, $$3);
                    if (eko.b($$0.J_(), $$12, $$10, $$3.l, $$13)) {
                        $$3.a($$12);
                    }
                    $$5 = true;
                }
            } else {
                $$3.A = 0;
            }
        } else if (!$$3.h() && $$3.A > 0) {
            $$3.A = bgj.a($$3.A - 2, 0, $$3.B);
        }
        if ($$4 != $$3.h()) {
            $$5 = true;
            $$2 = (eoh)$$2.b(dyl.b, $$3.h());
            $$0.a($$1, $$2, 3);
        }
        if ($$5) {
            eko.a($$0, $$1, $$2);
        }
    }

    private static boolean a(jr $$0, @Nullable dqx<? extends dpy> $$1, drl $$2, jm<dlt> $$3, int $$4) {
        if ($$3.get(0).f() || $$1 == null) {
            return false;
        }
        dlt $$5 = $$1.b().a($$2, (jf.a)$$0);
        if ($$5.f()) {
            return false;
        }
        dlt $$6 = $$3.get(2);
        if ($$6.f()) {
            return true;
        }
        if (!dlt.c($$6, $$5)) {
            return false;
        }
        if ($$6.N() < $$4 && $$6.N() < $$6.k()) {
            return true;
        }
        return $$6.N() < $$5.k();
    }

    private static boolean b(jr $$0, @Nullable dqx<? extends dpy> $$1, drl $$2, jm<dlt> $$3, int $$4) {
        if ($$1 == null || !eko.a($$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        dlt $$5 = $$3.get(0);
        dlt $$6 = $$1.b().a($$2, (jf.a)$$0);
        dlt $$7 = $$3.get(2);
        if ($$7.f()) {
            $$3.set(2, $$6.v());
        } else if (dlt.c($$7, $$6)) {
            $$7.g(1);
        }
        if ($$5.a(dzs.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(dlx.sk)) {
            $$3.set(1, new dlt(dlx.sl));
        }
        $$5.h(1);
        return true;
    }

    protected int a(emb $$0, dlt $$1) {
        return $$0.b($$1);
    }

    private static int a(axf $$02, eko $$1) {
        drl $$2 = new drl($$1.a(0));
        return $$1.D.a($$2, $$02).map($$0 -> ((dpy)$$0.b()).d()).orElse(200);
    }

    @Override
    public int[] a(iz $$0) {
        if ($$0 == iz.a) {
            return r;
        }
        if ($$0 == iz.b) {
            return q;
        }
        return s;
    }

    @Override
    public boolean a(int $$0, dlt $$1, @Nullable iz $$2) {
        return this.b($$0, $$1);
    }

    @Override
    public boolean b(int $$0, dlt $$1, iz $$2) {
        if ($$2 == iz.a && $$0 == 1) {
            return $$1.a(dlx.sl) || $$1.a(dlx.sk);
        }
        return true;
    }

    @Override
    public int b() {
        return this.l.size();
    }

    @Override
    protected jm<dlt> g() {
        return this.l;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.l = $$0;
    }

    @Override
    public void a(int $$0, dlt $$1) {
        dwo dwo2;
        dlt $$2 = this.l.get($$0);
        boolean $$3 = !$$1.f() && dlt.c($$2, $$1);
        this.l.set($$0, $$1);
        $$1.f(this.f_($$1));
        if ($$0 == 0 && !$$3 && (dwo2 = this.n) instanceof axf) {
            axf $$4 = (axf)dwo2;
            this.B = eko.a($$4, this);
            this.A = 0;
            this.e();
        }
    }

    @Override
    public boolean b(int $$0, dlt $$1) {
        if ($$0 == 2) {
            return false;
        }
        if ($$0 == 1) {
            dlt $$2 = this.l.get(1);
            return this.n.S().a($$1) || $$1.a(dlx.sk) && !$$2.a(dlx.sk);
        }
        return true;
    }

    @Override
    public void a(@Nullable dqx<?> $$0) {
        if ($$0 != null) {
            amt<dqs<?>> $$1 = $$0.a();
            this.C.addTo($$1, 1);
        }
    }

    @Override
    public @Nullable dqx<?> d() {
        return null;
    }

    @Override
    public void a(ddm $$0, List<dlt> $$1) {
    }

    public void a(axg $$0) {
        List<dqx<?>> $$1 = this.a($$0.A(), $$0.dI());
        $$0.a((Collection<dqx<?>>)$$1);
        for (dqx<?> $$2 : $$1) {
            $$0.a($$2, this.l);
        }
        this.C.clear();
    }

    public List<dqx<?>> a(axf $$0, ftm $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (Reference2IntMap.Entry $$3 : this.C.reference2IntEntrySet()) {
            $$0.x().b((amt)$$3.getKey()).ifPresent($$4 -> {
                $$2.add($$4);
                eko.a($$0, $$1, $$3.getIntValue(), ((dpy)$$4.b()).c());
            });
        }
        return $$2;
    }

    private static void a(axf $$0, ftm $$1, int $$2, float $$3) {
        int $$4 = bgj.b((float)$$2 * $$3);
        float $$5 = bgj.g((float)$$2 * $$3);
        if ($$5 != 0.0f && $$0.y.i() < $$5) {
            ++$$4;
        }
        cgz.a($$0, $$1, $$4);
    }

    @Override
    public void fillStackedContents(ddu $$0) {
        for (dlt $$1 : this.l) {
            $$0.b($$1);
        }
    }

    @Override
    public void a(is $$0, eoh $$1) {
        super.a($$0, $$1);
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.a($$2, ftm.b($$0));
        }
    }
}

