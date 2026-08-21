/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cto
extends cth {
    public static final float cv = 0.6f;
    public static final float cw = 32.5f;
    public static final int cx = 80;
    private static final double cC = 7.0;
    private static final double cD = 2.0;
    private static final alw<a> cE = ama.a(cto.class, aly.F);
    private long cF = 0L;
    public final cfz cz = new cfz();
    public final cfz cA = new cfz();
    public final cfz cB = new cfz();
    private int cG;
    private boolean cH = false;

    public cto(cgu<? extends cth> $$0, dwo $$1) {
        super($$0, $$1);
        this.N().a(true);
        this.cG = this.hd();
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.g.a($$0, cgt.e);
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 12.0).a(cis.x, 0.14);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cE, cto$a.a);
    }

    public boolean gP() {
        return this.az.a(cE) != cto$a.a;
    }

    public boolean gQ() {
        return this.gS().a(this.cF);
    }

    public boolean gR() {
        return this.gS() == cto$a.b && this.cF > (long)cto$a.b.b();
    }

    public a gS() {
        return this.az.a(cE);
    }

    public void a(a $$0) {
        this.az.a(cE, $$0);
    }

    @Override
    public void a(alw<?> $$0) {
        if (cE.equals($$0)) {
            this.cF = 0L;
        }
        super.a($$0);
    }

    protected cim.b<cto> ew() {
        return ctp.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return ctp.a(this.ew().a($$0));
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("armadilloBrain");
        this.ca.a($$0, this);
        $$1.c();
        $$1.a("armadilloActivityUpdate");
        ctp.a(this);
        $$1.c();
        if (this.cb() && --this.cG <= 0 && this.e($$0)) {
            if (this.a($$0, fnv.aJ, this::a)) {
                this.a(bda.ak, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
                this.c(etk.t);
            }
            this.cG = this.hd();
        }
        super.a($$0);
    }

    private int hd() {
        return this.as.a(20 * bhn.e * 5) + 20 * bhn.e * 5;
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            this.he();
        }
        if (this.gP()) {
            this.af();
        }
        ++this.cF;
    }

    @Override
    public float eE() {
        return this.e_() ? 0.6f : 1.0f;
    }

    private void he() {
        switch (this.gS().ordinal()) {
            case 0: {
                this.cz.a();
                this.cA.a();
                this.cB.a();
                break;
            }
            case 3: {
                this.cz.b(this.at);
                this.cA.a();
                this.cB.a();
                break;
            }
            case 1: {
                this.cz.a();
                this.cA.b(this.at);
                this.cB.a();
                break;
            }
            case 2: {
                this.cz.a();
                this.cA.a();
                if (this.cH) {
                    this.cB.a();
                    this.cH = false;
                }
                if (this.cF == 0L) {
                    this.cB.a(this.at);
                    this.cB.a(cto$a.c.b(), 1.0f);
                    break;
                }
                this.cB.b(this.at);
            }
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 64 && this.ao().B_()) {
            this.cH = true;
            this.ao().a(this.dP(), this.dR(), this.dV(), bda.am, this.dB(), 1.0f, 1.0f, false);
        } else {
            super.b($$0);
        }
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aR);
    }

    public static boolean c(cgu<cto> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cm) && cto.a($$1, $$3);
    }

    public boolean i(chl $$0) {
        if (!this.dj().c(7.0, 2.0, 7.0).c($$0.dj())) {
            return false;
        }
        if ($$0.ay().a(bdt.d)) {
            return true;
        }
        if (this.eK() == $$0) {
            return true;
        }
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            if ($$1.au()) {
                return false;
            }
            return $$1.cA() || $$1.cq();
        }
        return false;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("state", cto$a.f, this.gS());
        $$0.a("scute_time", this.cG);
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.a($$02.a("state", cto$a.f).orElse(cto$a.a));
        $$02.e("scute_time").ifPresent($$0 -> {
            this.cG = $$0;
        });
    }

    public void gT() {
        if (this.gP()) {
            return;
        }
        this.X();
        this.hc();
        this.c(etk.u);
        this.b(bda.ai);
        this.a(cto$a.b);
    }

    public void gU() {
        if (!this.gP()) {
            return;
        }
        this.c(etk.u);
        this.b(bda.al);
        this.a(cto$a.a);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.gP()) {
            $$2 = ($$2 - 1.0f) / 2.0f;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        super.c($$0, $$1, $$2);
        if (this.gG() || this.fa()) {
            return;
        }
        if ($$1.d() instanceof chl) {
            this.ev().a(cqw.H, true, 80L);
            if (this.gV()) {
                this.gT();
            }
        } else if ($$1.a(bdq.G)) {
            this.gU();
        }
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.Aa) && this.a((cgk)$$0, $$2)) {
            $$2.a(16, (chl)$$0, $$1.a());
            return cdc.a;
        }
        if (this.gP()) {
            return cdc.d;
        }
        return super.b($$0, $$1);
    }

    public boolean a(@Nullable cgk $$0, dlt $$1) {
        if (this.e_()) {
            return false;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.a($$2, fnv.aV, $$0, $$1, this::a);
            this.a(bda.ao);
            this.c(etk.r);
        }
        return true;
    }

    public boolean gV() {
        return !this.gM() && !this.bB() && !this.S_() && !this.cq() && !this.cr();
    }

    @Override
    public boolean gY() {
        return super.gY() && !this.gP();
    }

    @Override
    protected bcz W() {
        if (this.gP()) {
            return null;
        }
        return bda.af;
    }

    @Override
    protected void gX() {
        this.b(bda.ac);
    }

    @Override
    protected bcz fd() {
        return bda.ah;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.gP()) {
            return bda.ae;
        }
        return bda.ad;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.ag, 0.15f, 1.0f);
    }

    @Override
    public int ae() {
        if (this.gP()) {
            return 0;
        }
        return 32;
    }

    @Override
    protected cnl I() {
        return new cnl(this){

            @Override
            public void a() {
                if (!cto.this.gP()) {
                    super.a();
                }
            }
        };
    }

    public static abstract sealed class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("idle", false, 0, 0){

            @Override
            public boolean a(long $$0) {
                return false;
            }
        };
        public static final /* enum */ a b = new a("rolling", true, 10, 1){

            @Override
            public boolean a(long $$0) {
                return $$0 > 5L;
            }
        };
        public static final /* enum */ a c = new a("scared", true, 50, 2){

            @Override
            public boolean a(long $$0) {
                return true;
            }
        };
        public static final /* enum */ a d = new a("unrolling", true, 30, 3){

            @Override
            public boolean a(long $$0) {
                return $$0 < 26L;
            }
        };
        static final Codec<a> f;
        private static final IntFunction<a> g;
        public static final aao<ByteBuf, a> e;
        private final String h;
        private final boolean i;
        private final int j;
        private final int k;
        private static final /* synthetic */ a[] l;

        public static a[] values() {
            return (a[])l.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0, boolean $$1, int $$2, int $$3) {
            this.h = $$0;
            this.i = $$1;
            this.j = $$2;
            this.k = $$3;
        }

        @Override
        public String c() {
            return this.h;
        }

        private int d() {
            return this.k;
        }

        public abstract boolean a(long var1);

        public boolean a() {
            return this.i;
        }

        public int b() {
            return this.j;
        }

        private static /* synthetic */ a[] e() {
            return new a[]{a, b, c, d};
        }

        static {
            l = cto$a.e();
            f = bhh.a(a::values);
            g = beu.a(a::d, cto$a.values(), beu.a.a);
            e = aam.a(g, a::d);
        }
    }
}

