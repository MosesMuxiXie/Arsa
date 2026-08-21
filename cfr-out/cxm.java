/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class cxm
extends cth {
    private static final int cB = 1700;
    private static final int cC = 6000;
    private static final int cD = 30;
    private static final int cE = 120;
    private static final int cF = 48000;
    private static final float cG = 0.4f;
    private static final cgn cH = cgn.b(cgu.br.l(), cgu.br.m() - 0.4f).b(0.81f);
    private static final alw<a> cI = ama.a(cxm.class, aly.G);
    private static final alw<Integer> cJ = ama.a(cxm.class, aly.b);
    public final cfz cv = new cfz();
    public final cfz cw = new cfz();
    public final cfz cx = new cfz();
    public final cfz cz = new cfz();
    public final cfz cA = new cfz();

    public static cir.a p() {
        return cth.gW().a(cis.x, 0.1f).a(cis.u, 14.0);
    }

    public cxm(cgu<? extends cth> $$0, dwo $$1) {
        super($$0, $$1);
        this.N().a(true);
        this.a(fls.j, -1.0f);
        this.a(fls.g, -1.0f);
        this.a(fls.y, -1.0f);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cI, cxm$a.a);
        $$0.a(cJ, 0);
    }

    @Override
    public void G() {
        super.G();
        if (this.cp() || this.by()) {
            this.a(fls.j, 0.0f);
        }
    }

    @Override
    public void H() {
        this.a(fls.j, -1.0f);
    }

    @Override
    public cgn b(chx $$0) {
        if (this.he() == cxm$a.f) {
            return cH.a(this.eE());
        }
        return super.b($$0);
    }

    public boolean gP() {
        return this.he() == cxm$a.e;
    }

    public boolean gQ() {
        return this.ca.c(cqw.S).orElse(false);
    }

    public boolean gR() {
        return !this.gQ() && !this.gM() && !this.by() && !this.hb() && this.aV() && !this.cq() && !this.S_();
    }

    public boolean gS() {
        return this.he() == cxm$a.f || this.he() == cxm$a.e;
    }

    private is gV() {
        ftm $$0 = this.hd();
        return is.a($$0.a(), this.dR() + (double)0.2f, $$0.c());
    }

    private ftm hd() {
        return this.dI().e(this.cm().c(2.25));
    }

    @Override
    public boolean z() {
        return true;
    }

    @Override
    public ftm[] A() {
        return chj.a(this, -0.01, 0.63, 0.38, 1.15);
    }

    private a he() {
        return this.az.a(cI);
    }

    private cxm b(a $$0) {
        this.az.a(cI, $$0);
        return this;
    }

    @Override
    public void a(alw<?> $$0) {
        if (cI.equals($$0)) {
            a $$1 = this.he();
            this.hf();
            switch ($$1.ordinal()) {
                case 2: {
                    this.cw.b(this.at);
                    break;
                }
                case 3: {
                    this.cx.b(this.at);
                    break;
                }
                case 5: {
                    this.cz.b(this.at);
                    break;
                }
                case 6: {
                    this.cA.b(this.at);
                    break;
                }
                case 1: {
                    this.cv.b(this.at);
                }
            }
            this.j_();
        }
        super.a($$0);
    }

    private void hf() {
        this.cz.a();
        this.cx.a();
        this.cA.a();
        this.cv.a();
        this.cw.a();
    }

    public cxm a(a $$0) {
        switch ($$0.ordinal()) {
            case 0: {
                this.b(cxm$a.a);
                break;
            }
            case 2: {
                this.b(cxm$a.c).hg();
                break;
            }
            case 3: {
                this.a(bda.BK, 1.0f, 1.0f);
                this.b(cxm$a.d);
                break;
            }
            case 4: {
                this.b(cxm$a.e);
                break;
            }
            case 5: {
                this.b(cxm$a.f).hh();
                break;
            }
            case 6: {
                this.a(bda.BN, 1.0f, 1.0f);
                this.b(cxm$a.g);
                break;
            }
            case 1: {
                this.a(bda.BO, 1.0f, 1.0f);
                this.b(cxm$a.b);
            }
        }
        return this;
    }

    private cxm hg() {
        this.a(bda.BJ, 1.0f, this.e_() ? 1.3f : 1.0f);
        return this;
    }

    private cxm hh() {
        this.az.a(cJ, this.at + 120);
        this.ao().a((cgk)this, (byte)63);
        return this;
    }

    public cxm x(boolean $$0) {
        if ($$0) {
            this.i(this.bg());
        }
        return this;
    }

    Optional<is> gT() {
        return IntStream.range(0, 5).mapToObj($$0 -> csr.a(this, 10 + 2 * $$0, 3)).filter(Objects::nonNull).map(is::a).filter($$0 -> this.ao().w().a((is)$$0)).map(is::e).filter(this::h).findFirst();
    }

    boolean gU() {
        return !this.gM() && !this.gQ() && !this.e_() && !this.by() && this.aV() && !this.cq() && this.h(this.gV().e());
    }

    private boolean h(is $$0) {
        return this.ao().a_($$0).a(bdp.cJ) && this.hj().noneMatch($$1 -> jc.a(this.ao().aq(), $$0).equals($$1)) && Optional.ofNullable(this.N().a($$0, 1)).map(flp::j).orElse(false) != false;
    }

    /*
     * WARNING - void declaration
     */
    private void hi() {
        void $$12;
        block3: {
            block2: {
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) break block2;
                axf $$0 = (axf)dwo2;
                if (this.az.a(cJ) == this.at) break block3;
            }
            return;
        }
        is $$22 = this.gV();
        this.a((axf)$$12, fnv.aG, (axf $$1, dlt $$2) -> {
            czl $$3 = new czl(this.ao(), $$22.u(), $$22.v(), $$22.w(), (dlt)$$2);
            $$3.i();
            $$1.b($$3);
        });
        this.a(bda.BI, 1.0f, 1.0f);
    }

    private cxm a(cfz $$0) {
        boolean $$1;
        boolean bl2 = $$1 = $$0.a((float)this.at) > 1700L && $$0.a((float)this.at) < 6000L;
        if ($$1) {
            is $$2 = this.gV();
            eoh $$3 = this.ao().a_($$2.e());
            if ($$3.o() != egf.a) {
                for (int $$4 = 0; $$4 < 30; ++$$4) {
                    ftm $$5 = ftm.b($$2).b(0.0, -0.65f, 0.0);
                    this.ao().a(new lp(ly.b, $$3), $$5.g, $$5.h, $$5.i, 0.0, 0.0, 0.0);
                }
                if (this.at % 10 == 0) {
                    this.ao().a(this.dP(), this.dR(), this.dV(), $$3.A().f(), this.dB(), 0.5f, 0.5f, false);
                }
            }
        }
        if (this.at % 10 == 0) {
            this.ao().a(etk.u, this.gV(), etk.a.a(this));
        }
        return this;
    }

    private cxm i(is $$0) {
        List $$1 = this.hj().limit(20L).collect(Collectors.toList());
        $$1.add(0, jc.a(this.ao().aq(), $$0));
        this.ev().a(cqw.bb, $$1);
        return this;
    }

    private Stream<jc> hj() {
        return this.ev().c(cqw.bb).stream().flatMap(Collection::stream);
    }

    @Override
    public void u() {
        double $$1;
        super.u();
        double $$0 = this.cp.c();
        if ($$0 > 0.0 && ($$1 = this.dN().j()) < 0.01) {
            this.a(0.1f, new ftm(0.0, 0.0, 1.0));
        }
    }

    @Override
    public void a(axf $$0, cth $$1) {
        dlt $$2 = new dlt(dlx.lj);
        czl $$3 = new czl($$0, this.dI().a(), this.dI().b(), this.dI().c(), $$2);
        $$3.i();
        this.a($$0, $$1, null);
        this.a(bda.BP, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 0.5f);
        $$0.b($$3);
    }

    @Override
    public void a(cex $$0) {
        this.a(cxm$a.a);
        super.a($$0);
    }

    @Override
    public void g() {
        switch (this.he().ordinal()) {
            case 5: {
                this.a(this.cz).hi();
                break;
            }
            case 4: {
                this.hk();
            }
        }
        super.g();
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        boolean $$3 = this.j($$2);
        cdc $$4 = super.b($$0, $$1);
        if ($$4.a() && $$3) {
            this.gX();
        }
        return $$4;
    }

    @Override
    protected void gX() {
        this.ao().a(null, this, bda.BE, bdb.g, 1.0f, bgj.b(this.ao().y, 0.8f, 1.2f));
    }

    private void hk() {
        if (this.ao().B_() && this.at % 20 == 0) {
            this.ao().a(this.dP(), this.dR(), this.dV(), bda.BL, this.dB(), 1.0f, 1.0f, false);
        }
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.BD, 0.15f, 1.0f);
    }

    @Override
    protected bcz W() {
        return Set.of(cxm$a.f, cxm$a.e).contains((Object)this.he()) ? null : bda.BF;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.BG;
    }

    @Override
    protected bcz fd() {
        return bda.BH;
    }

    @Override
    public int ae() {
        return 50;
    }

    @Override
    public void a_(boolean $$0) {
        this.d_($$0 ? -48000 : 0);
    }

    @Override
    public cfy a(axf $$0, cfy $$1) {
        return cgu.br.a($$0, cgt.e);
    }

    @Override
    public boolean a(cth $$0) {
        if ($$0 instanceof cxm) {
            cxm $$1 = (cxm)$$0;
            Set<a> $$2 = Set.of(cxm$a.a, cxm$a.c, cxm$a.b);
            return $$2.contains((Object)this.he()) && $$2.contains((Object)$$1.he()) && super.a($$0);
        }
        return false;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aB);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cxn.a(this.ew().a($$0));
    }

    public cim<cxm> ev() {
        return super.ev();
    }

    protected cim.b<cxm> ew() {
        return cim.a(cxn.b, cxn.a);
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("snifferBrain");
        this.ev().a($$0, this);
        $$1.b("snifferActivityUpdate");
        cxn.a(this);
        $$1.c();
        super.a($$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(1);
        public static final /* enum */ a c = new a(2);
        public static final /* enum */ a d = new a(3);
        public static final /* enum */ a e = new a(4);
        public static final /* enum */ a f = new a(5);
        public static final /* enum */ a g = new a(6);
        public static final IntFunction<a> h;
        public static final aao<ByteBuf, a> i;
        private final int j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.j = $$0;
        }

        public int a() {
            return this.j;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            k = cxm$a.b();
            h = beu.a(a::a, cxm$a.values(), beu.a.a);
            i = aam.a(h, a::a);
        }
    }
}

