/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class gso
extends gsb {
    static final amo a = amo.b("gamemode_switcher/slot");
    static final amo b = amo.b("gamemode_switcher/selection");
    private static final amo c = amo.b("textures/gui/container/gamemode_switcher.png");
    private static final int d = 128;
    private static final int e = 128;
    private static final int f = 26;
    private static final int t = 5;
    private static final int u = 31;
    private static final int v = 5;
    private static final int w = gso$a.values().length * 31 - 5;
    private final a x;
    private a y;
    private int z;
    private int A;
    private boolean B;
    private final List<b> C = Lists.newArrayList();

    public gso() {
        super(gfa.a);
        this.y = this.x = gso$a.a(this.o());
    }

    private dwl o() {
        hio $$0 = gfj.V().q;
        dwl $$1 = $$0.h();
        if ($$1 != null) {
            return $$1;
        }
        return $$0.i() == dwl.b ? dwl.a : dwl.b;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.C.clear();
        this.y = this.x;
        for (int $$0 = 0; $$0 < gso$a.e.length; ++$$0) {
            a $$1 = gso$a.e[$$0];
            this.C.add(new b($$1, this.o / 2 - w / 2 + $$0 * 31, this.p / 2 - 31));
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        $$0.a(this.q, this.y.h, this.o / 2, this.p / 2 - 31 - 20, -1);
        yw $$4 = yh.a("debug.gamemodes.select_next", this.n.k.ag.n().f().a(l.l));
        $$0.a(this.q, (yh)$$4, this.o / 2, this.p / 2 + 5, -1);
        if (!this.B) {
            this.z = $$1;
            this.A = $$2;
            this.B = true;
        }
        boolean $$5 = this.z == $$1 && this.A == $$2;
        for (b $$6 : this.C) {
            $$6.a($$0, $$1, $$2, $$3);
            $$6.a(this.y == $$6.a);
            if ($$5 || !$$6.D()) continue;
            this.y = $$6.a;
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        int $$4 = this.o / 2 - 62;
        int $$5 = this.p / 2 - 31 - 27;
        $$0.a(hpa.at, c, $$4, $$5, 0.0f, 0.0f, 125, 75, 128, 128);
    }

    private void p() {
        gso.a(this.n, this.y);
    }

    private static void a(gfj $$0, a $$1) {
        if (!$$0.Q()) {
            return;
        }
        a $$2 = gso$a.a($$0.q.i());
        if ($$1 != $$2 && ape.a.a($$0.s.I())) {
            $$0.s.b.b(new aig($$1.i));
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.n.k.ag.a($$0)) {
            this.B = false;
            this.y = this.y.a();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public boolean b(gzb $$0) {
        if (this.n.k.X.a($$0)) {
            this.p();
            this.n.a((gsb)null);
            return true;
        }
        return super.b($$0);
    }

    @Override
    public boolean b(gzc $$0) {
        if (this.n.k.X.a($$0)) {
            this.p();
            this.n.a((gsb)null);
            return true;
        }
        return super.b($$0);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(yh.c("gameMode.creative"), dwl.b, new dlt(dzs.i));
        public static final /* enum */ a b = new a(yh.c("gameMode.survival"), dwl.a, new dlt(dlx.qH));
        public static final /* enum */ a c = new a(yh.c("gameMode.adventure"), dwl.c, new dlt(dlx.wv));
        public static final /* enum */ a d = new a(yh.c("gameMode.spectator"), dwl.d, new dlt(dlx.uw));
        static final a[] e;
        private static final int f = 16;
        private static final int g = 5;
        final yh h;
        final dwl i;
        private final dlt j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(yh $$0, dwl $$1, dlt $$2) {
            this.h = $$0;
            this.i = $$1;
            this.j = $$2;
        }

        void a(gir $$0, int $$1, int $$2) {
            $$0.a(this.j, $$1, $$2);
        }

        a a() {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> b;
                case 1 -> c;
                case 2 -> d;
                case 3 -> a;
            };
        }

        static a a(dwl $$0) {
            return switch ($$0) {
                default -> throw new MatchException(null, null);
                case dwl.d -> d;
                case dwl.a -> b;
                case dwl.b -> a;
                case dwl.c -> c;
            };
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            k = gso$a.b();
            e = gso$a.values();
        }
    }

    public static class b
    extends gjc {
        final a a;
        private boolean b;

        public b(a $$0, int $$1, int $$2) {
            super($$1, $$2, 26, 26, $$0.h);
            this.a = $$0;
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            if (this.b) {
                this.b($$0);
            }
            this.a.a($$0, this.aT_() + 5, this.aU_() + 5);
        }

        @Override
        public void a(gpd $$0) {
            this.c($$0);
        }

        @Override
        public boolean D() {
            return super.D() || this.b;
        }

        public void a(boolean $$0) {
            this.b = $$0;
        }

        private void a(gir $$0) {
            $$0.a(hpa.at, a, this.aT_(), this.aU_(), 26, 26);
        }

        private void b(gir $$0) {
            $$0.a(hpa.at, b, this.aT_(), this.aU_(), 26, 26);
        }
    }
}

