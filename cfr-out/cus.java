/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cus
extends cuo
implements dac {
    private static final int cv = 5;
    private static final alw<Integer> cw = ama.a(cus.class, aly.b);
    private static final alw<Integer> cx = ama.a(cus.class, aly.b);
    private static final cgn cz = cgu.aC.n().a(cgm.a().a(cgl.a, 0.0f, cgu.aC.m() - 0.8125f, -0.3f)).a(0.5f);
    boolean cA;
    private @Nullable cus cB;
    private @Nullable cus cC;

    public cus(cgu<? extends cus> $$0, dwo $$1) {
        super((cgu<? extends cuo>)$$0, $$1);
        this.N().a(40.0f);
    }

    public boolean gS() {
        return false;
    }

    private void w(int $$0) {
        this.az.a(cw, Math.max(1, Math.min(5, $$0)));
    }

    private void b(bgr $$0) {
        int $$1 = $$0.i() < 0.04f ? 5 : 3;
        this.w(1 + $$0.a($$1));
    }

    public int gT() {
        return this.az.a(cw);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Variant", cus$d.g, this.he());
        $$0.a("Strength", this.gT());
    }

    @Override
    protected void a(fnq $$0) {
        this.w($$0.a("Strength", 0));
        super.a($$0);
        this.a($$0.a("Variant", cus$d.g).orElse(cus$d.e));
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cpt(this, 1.2));
        this.cs.a(2, new cow(this, 2.1f));
        this.cs.a(3, new cpo(this, 1.25, 40, 20.0f));
        this.cs.a(3, new cpi(this, 1.2));
        this.cs.a(4, new cnz(this, 1.0));
        this.cs.a(5, new cpy(this, 1.25, $$0 -> $$0.a(bdy.aW), false));
        this.cs.a(6, new coo(this, 1.0));
        this.cs.a(7, new cqd(this, 0.7));
        this.cs.a(8, new cox(this, ddm.class, 6.0f));
        this.cs.a(9, new cpk(this));
        this.ct.a(1, new c(this));
        this.ct.a(2, new a(this));
    }

    public static cir.a hd() {
        return cus.p();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cw, 0);
        $$0.a(cx, 0);
    }

    public d he() {
        return cus$d.a(this.az.a(cx));
    }

    private void a(d $$0) {
        this.az.a(cx, $$0.j);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aV) {
            return cus.c($$0, this.he());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aV);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aV) {
            this.a(cus.c(ki.aV, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aV);
    }

    @Override
    protected boolean a(ddm $$0, dlt $$1) {
        bcz $$6;
        int $$2 = 0;
        int $$3 = 0;
        float $$4 = 0.0f;
        boolean $$5 = false;
        if ($$1.a(dlx.rc)) {
            $$2 = 10;
            $$3 = 3;
            $$4 = 2.0f;
        } else if ($$1.a(dzs.jb.h())) {
            $$2 = 90;
            $$3 = 6;
            $$4 = 10.0f;
            if (this.hn() && this.Z_() == 0 && this.gY()) {
                $$5 = true;
                this.h($$0);
            }
        }
        if (this.eZ() < this.fq() && $$4 > 0.0f) {
            this.d($$4);
            $$5 = true;
        }
        if (this.e_() && $$2 > 0) {
            this.ao().a(ly.R, this.e(1.0), this.dS() + 0.5, this.h(1.0), 0.0, 0.0, 0.0);
            if (!this.ao().B_()) {
                this.c_($$2);
                $$5 = true;
            }
        }
        if (!($$3 <= 0 || !$$5 && this.hn() || this.ht() >= this.hy() || this.ao().B_())) {
            this.u($$3);
            $$5 = true;
        }
        if ($$5 && !this.bq() && ($$6 = this.gV()) != null) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), this.gV(), this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
        }
        return $$5;
    }

    @Override
    public boolean fE() {
        return this.fa() || this.hq();
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        d $$6;
        bgr $$4 = $$0.G_();
        this.b($$4);
        if ($$3 instanceof b) {
            d $$5 = ((b)$$3).a;
        } else {
            $$6 = bhs.a(cus$d.values(), $$4);
            $$3 = new b($$6);
        }
        this.a($$6);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean gU() {
        return false;
    }

    @Override
    protected bcz hw() {
        return bda.qj;
    }

    @Override
    protected bcz W() {
        return bda.qi;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.qn;
    }

    @Override
    protected bcz fd() {
        return bda.ql;
    }

    @Override
    protected bcz gV() {
        return bda.qm;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.qp, 0.15f, 1.0f);
    }

    @Override
    protected void gQ() {
        this.a(bda.qk, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
    }

    @Override
    public int ad_() {
        return this.gP() ? this.gT() : 0;
    }

    @Override
    public boolean e(cgv $$0) {
        return true;
    }

    @Override
    public int hy() {
        return 30;
    }

    @Override
    public boolean a(cth $$0) {
        return $$0 != this && $$0 instanceof cus && this.hF() && ((cus)$$0).hF();
    }

    public @Nullable cus b(axf $$0, cfy $$1) {
        cus $$2 = this.hf();
        if ($$2 != null) {
            this.a($$1, $$2);
            cus $$3 = (cus)$$1;
            int $$4 = this.as.a(Math.max(this.gT(), $$3.gT())) + 1;
            if (this.as.i() < 0.03f) {
                ++$$4;
            }
            $$2.w($$4);
            $$2.a(this.as.h() ? this.he() : $$3.he());
        }
        return $$2;
    }

    protected @Nullable cus hf() {
        return cgu.aC.a(this.ao(), cgt.e);
    }

    private void k(chl $$0) {
        deb $$1 = new deb(this.ao(), this);
        double $$2 = $$0.dP() - this.dP();
        double $$3 = $$0.f(0.3333333333333333) - $$1.dR();
        double $$4 = $$0.dV() - this.dV();
        double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * (double)0.2f;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$6 = (axf)dwo2;
            dec.a($$1, $$6, dlt.l, $$2, $$3 + $$5, $$4, 1.5f, 10.0f);
        }
        if (!this.bq()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.qo, this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
        }
        this.cA = true;
    }

    void C(boolean $$0) {
        this.cA = $$0;
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        int $$3 = this.a($$0, $$1);
        if ($$3 <= 0) {
            return false;
        }
        if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            this.b($$0, $$1, $$2);
        }
        this.fm();
        return true;
    }

    public void hg() {
        if (this.cB != null) {
            this.cB.cC = null;
        }
        this.cB = null;
    }

    public void a(cus $$0) {
        this.cB = $$0;
        this.cB.cC = this;
    }

    public boolean hh() {
        return this.cC != null;
    }

    public boolean hi() {
        return this.cB != null;
    }

    public @Nullable cus hj() {
        return this.cB;
    }

    @Override
    protected double gO() {
        return 2.0;
    }

    @Override
    public boolean z() {
        return false;
    }

    @Override
    protected void h(axf $$0) {
        if (!this.hi() && this.e_()) {
            super.h($$0);
        }
    }

    @Override
    public boolean hz() {
        return false;
    }

    @Override
    public void a(chl $$0, float $$1) {
        this.k($$0);
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.75 * (double)this.dk(), (double)this.dF() * 0.5);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cz : super.b($$0);
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        return cus.a((cgk)this, $$0, $$1.d());
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    public static final class d
    extends Enum<d>
    implements bhh {
        public static final /* enum */ d a = new d(0, "creamy");
        public static final /* enum */ d b = new d(1, "white");
        public static final /* enum */ d c = new d(2, "brown");
        public static final /* enum */ d d = new d(3, "gray");
        public static final d e;
        private static final IntFunction<d> i;
        public static final Codec<d> f;
        @Deprecated
        public static final Codec<d> g;
        public static final aao<ByteBuf, d> h;
        final int j;
        private final String k;
        private static final /* synthetic */ d[] l;

        public static d[] values() {
            return (d[])l.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(int $$0, String $$1) {
            this.j = $$0;
            this.k = $$1;
        }

        public int a() {
            return this.j;
        }

        public static d a(int $$0) {
            return i.apply($$0);
        }

        @Override
        public String c() {
            return this.k;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c, d};
        }

        static {
            l = cus$d.b();
            e = a;
            i = beu.a(d::a, cus$d.values(), beu.a.c);
            f = bhh.a(d::values);
            g = Codec.INT.xmap(i::apply, d::a);
            h = aam.a(i, d::a);
        }
    }

    static class c
    extends cqi {
        public c(cus $$0) {
            super($$0, new Class[0]);
        }

        @Override
        public boolean c() {
            chn chn2 = this.e;
            if (chn2 instanceof cus) {
                cus $$0 = (cus)chn2;
                if ($$0.cA) {
                    $$0.C(false);
                    return false;
                }
            }
            return super.c();
        }
    }

    static class a
    extends cqj<cxu> {
        public a(cus $$02) {
            super($$02, cxu.class, 16, false, true, ($$0, $$1) -> !((cxu)$$0).p());
        }

        @Override
        protected double l() {
            return super.l() * 0.25;
        }
    }

    static class b
    extends cfy.a {
        public final d a;

        b(d $$0) {
            super(true);
            this.a = $$0;
        }
    }
}

