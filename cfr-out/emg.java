/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class emg
extends elb {
    public static final Codec<amt<fgy>> a = amt.a(mj.bt);
    public static final amo b = amo.b("empty");
    private static final int k = 0;
    private static final int l = 0;
    public static final String c = "target";
    public static final String d = "pool";
    public static final String e = "joint";
    public static final String f = "placement_priority";
    public static final String g = "selection_priority";
    public static final String h = "name";
    public static final String i = "final_state";
    public static final String j = "minecraft:air";
    private amo m = b;
    private amo q = b;
    private amt<fgy> r = qy.a;
    private a s = emg$a.a;
    private String t = "minecraft:air";
    private int u = 0;
    private int v = 0;

    public emg(is $$0, eoh $$1) {
        super(eld.G, $$0, $$1);
    }

    public amo a() {
        return this.m;
    }

    public amo c() {
        return this.q;
    }

    public amt<fgy> d() {
        return this.r;
    }

    public String f() {
        return this.t;
    }

    public a h() {
        return this.s;
    }

    public int k() {
        return this.u;
    }

    public int l() {
        return this.v;
    }

    public void a(amo $$0) {
        this.m = $$0;
    }

    public void b(amo $$0) {
        this.q = $$0;
    }

    public void a(amt<fgy> $$0) {
        this.r = $$0;
    }

    public void a(String $$0) {
        this.t = $$0;
    }

    public void a(a $$0) {
        this.s = $$0;
    }

    public void a(int $$0) {
        this.u = $$0;
    }

    public void b(int $$0) {
        this.v = $$0;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(h, amo.a, this.m);
        $$0.a(c, amo.a, this.q);
        $$0.a(d, a, this.r);
        $$0.a(i, this.t);
        $$0.a(e, emg$a.c, this.s);
        $$0.a(f, this.u);
        $$0.a(g, this.v);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.m = $$0.a(h, amo.a).orElse(b);
        this.q = $$0.a(c, amo.a).orElse(b);
        this.r = $$0.a(d, a).orElse(qy.a);
        this.t = $$0.a(i, j);
        this.s = $$0.a(e, emg$a.c).orElseGet(() -> fjq.a(this.o()));
        this.u = $$0.a(f, 0);
        this.v = $$0.a(g, 0);
    }

    public adh m() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public void a(axf $$0, int $$1, boolean $$2) {
        is $$3 = this.aD_().a(this.o().c(edz.b).a());
        jq<fgy> $$4 = $$0.J_().f(mj.bt);
        jd.c $$5 = $$4.b(this.r);
        fgs.a($$0, $$5, this.q, $$1, $$3, $$2);
    }

    public /* synthetic */ aay ax_() {
        return this.m();
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("rollable");
        public static final /* enum */ a b = new a("aligned");
        public static final bhh.a<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        public yh a() {
            return yh.c("jigsaw_block.joint." + this.d);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            e = emg$a.b();
            c = bhh.a(a::values);
        }
    }
}

