/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import org.jspecify.annotations.Nullable;

public class grp
extends gsb {
    private static final yh a = yh.c("multiplayer.downloadingTerrain");
    private static final yh b = yh.c("narrator.ready_to_play");
    private static final long c = 2000L;
    private static final int d = 200;
    private hin e;
    private float f;
    private long t = -1L;
    private a u;
    private @Nullable ilp v;
    private static final Object2IntMap<erj> w = (Object2IntMap)bhs.a(new Object2IntOpenHashMap(), (? super T $$0) -> {
        $$0.defaultReturnValue(0);
        $$0.put((Object)erj.c, 0x545454);
        $$0.put((Object)erj.d, 0x999999);
        $$0.put((Object)erj.e, 6250897);
        $$0.put((Object)erj.f, 8434258);
        $$0.put((Object)erj.g, 0xD1D1D1);
        $$0.put((Object)erj.h, 7497737);
        $$0.put((Object)erj.i, 3159410);
        $$0.put((Object)erj.j, 2213376);
        $$0.put((Object)erj.k, 0xCCCCCC);
        $$0.put((Object)erj.l, 16769184);
        $$0.put((Object)erj.m, 15884384);
        $$0.put((Object)erj.n, 0xFFFFFF);
    });

    public grp(hin $$0, a $$1) {
        super(gfa.a);
        this.e = $$0;
        this.u = $$1;
    }

    public void a(hin $$0, a $$1) {
        this.e = $$0;
        this.u = $$1;
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    protected boolean bc_() {
        return false;
    }

    @Override
    protected void b(gpd $$0) {
        if (this.e.f()) {
            $$0.a(gpc.a, (yh)yh.a("loading.progress", bgj.b(this.e.e() * 100.0f)));
        }
    }

    @Override
    public void e() {
        super.e();
        this.f += (this.e.e() - this.f) * 0.2f;
        if (this.e.b()) {
            this.aX_();
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        int $$10;
        super.a($$0, $$1, $$2, $$3);
        long $$4 = bhs.c();
        if ($$4 - this.t > 2000L) {
            this.t = $$4;
            this.d(true);
        }
        int $$5 = this.o / 2;
        int $$6 = this.p / 2;
        axp $$7 = this.e.d();
        if ($$7 != null) {
            int $$8 = 2;
            grp.a($$0, $$5, $$6, 2, 0, $$7);
            int $$9 = $$6 - $$7.a() * 2 - this.q.b * 3;
        } else {
            $$10 = $$6 - 50;
        }
        $$0.a(this.q, a, $$5, $$10, -1);
        if (this.e.f()) {
            this.a($$0, $$5 - 100, $$10 + this.q.b + 3, 200, 2, this.f);
        }
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
        $$0.a($$1, $$2, $$1 + $$3, $$2 + $$4, -16777216);
        $$0.a($$1, $$2, $$1 + Math.round($$5 * (float)$$3), $$2 + $$4, -16711936);
    }

    public static void a(gir $$0, int $$1, int $$2, int $$3, int $$4, axp $$5) {
        int $$6 = $$3 + $$4;
        int $$7 = $$5.a() * 2 + 1;
        int $$8 = $$7 * $$6 - $$4;
        int $$9 = $$1 - $$8 / 2;
        int $$10 = $$2 - $$8 / 2;
        if (gfj.V().m.b(glx.K)) {
            int $$11 = $$6 / 2 + 1;
            $$0.a($$1 - $$11, $$2 - $$11, $$1 + $$11, $$2 + $$11, -65536);
        }
        for (int $$12 = 0; $$12 < $$7; ++$$12) {
            for (int $$13 = 0; $$13 < $$7; ++$$13) {
                erj $$14 = $$5.a($$12, $$13);
                int $$15 = $$9 + $$12 * $$6;
                int $$16 = $$10 + $$13 * $$6;
                $$0.a($$15, $$16, $$15 + $$3, $$16 + $$3, bel.g(w.getInt((Object)$$14)));
            }
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        switch (this.u.ordinal()) {
            case 2: {
                this.a($$0, $$3);
                this.b($$0);
                this.a($$0);
                break;
            }
            case 0: {
                $$0.a(hpa.ax, this.o(), 0, 0, $$0.a(), $$0.b());
                break;
            }
            case 1: {
                ilr $$4 = gfj.V().af();
                ikz $$5 = $$4.b(hrb.a);
                ikz $$6 = $$4.b(hrb.b);
                gpq $$7 = gpq.a($$5.b(), $$5.c(), $$6.b(), $$6.c());
                $$0.a(hpa.V, $$7, 0, 0, this.o, this.p);
            }
        }
    }

    private ilp o() {
        if (this.v != null) {
            return this.v;
        }
        this.v = this.n.ax().a().a(dzs.eI.m());
        return this.v;
    }

    @Override
    public void aX_() {
        this.n.aZ().d(b);
        super.aX_();
    }

    @Override
    public boolean ba_() {
        return false;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = grp$a.a();
        }
    }
}

