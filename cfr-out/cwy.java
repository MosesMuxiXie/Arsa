/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cwy
extends cwz
implements ctj {
    private static final alw<Integer> cD = ama.a(cwy.class, aly.b);
    private static final Predicate<chn> cE = new Predicate<chn>(){

        public boolean a(@Nullable chn $$0) {
            return $$0 != null && cF.containsKey($$0.ay());
        }

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((chn)object);
        }
    };
    static final Map<cgu<?>, bcz> cF = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put(cgu.q, bda.vr);
        $$0.put(cgu.s, bda.vs);
        $$0.put(cgu.t, bda.vt);
        $$0.put(cgu.w, bda.vu);
        $$0.put(cgu.y, bda.vS);
        $$0.put(cgu.H, bda.vv);
        $$0.put(cgu.I, bda.vw);
        $$0.put(cgu.O, bda.vx);
        $$0.put(cgu.Q, bda.vy);
        $$0.put(cgu.T, bda.vz);
        $$0.put(cgu.S, bda.vA);
        $$0.put(cgu.W, bda.vB);
        $$0.put(cgu.ah, bda.vC);
        $$0.put(cgu.ai, bda.tA);
        $$0.put(cgu.an, bda.vD);
        $$0.put(cgu.ao, bda.vE);
        $$0.put(cgu.ar, bda.vF);
        $$0.put(cgu.as, bda.vG);
        $$0.put(cgu.aE, bda.vH);
        $$0.put(cgu.aV, bda.vJ);
        $$0.put(cgu.aX, bda.vI);
        $$0.put(cgu.aZ, bda.vK);
        $$0.put(cgu.ba, bda.vL);
        $$0.put(cgu.bb, bda.vM);
        $$0.put(cgu.bh, bda.vN);
        $$0.put(cgu.bk, bda.vO);
        $$0.put(cgu.bm, bda.vP);
        $$0.put(cgu.bn, bda.vQ);
        $$0.put(cgu.bp, bda.vR);
        $$0.put(cgu.bw, bda.vS);
        $$0.put(cgu.bA, bda.vT);
        $$0.put(cgu.bK, bda.vU);
        $$0.put(cgu.bM, bda.vV);
        $$0.put(cgu.bO, bda.vW);
        $$0.put(cgu.bQ, bda.vX);
        $$0.put(cgu.bR, bda.vY);
        $$0.put(cgu.bS, bda.vZ);
        $$0.put(cgu.bV, bda.wa);
        $$0.put(cgu.bW, bda.wb);
        $$0.put(cgu.bX, bda.wc);
        $$0.put(cgu.bY, bda.wd);
        $$0.put(cgu.bZ, bda.we);
    });
    public float cz;
    public float cA;
    public float cB;
    public float cC;
    private float cG = 1.0f;
    private float cH = 1.0f;
    private boolean cI;
    private @Nullable is cJ;

    public cwy(cgu<? extends cwy> $$0, dwo $$1) {
        super((cgu<? extends cwz>)$$0, $$1);
        this.cp = new cnn(this, 10, false);
        this.a(fls.n, -1.0f);
        this.a(fls.o, -1.0f);
        this.a(fls.x, -1.0f);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.a(bhs.a(cwy$b.values(), $$0.G_()));
        if ($$3 == null) {
            $$3 = new cfy.a(false);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean e_() {
        return false;
    }

    @Override
    protected void D() {
        this.cs.a(0, new cii.a(1.25));
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cox(this, ddm.class, 8.0f));
        this.cs.a(2, new cpu(this));
        this.cs.a(2, new col(this, 1.0, 5.0f, 1.0f));
        this.cs.a(2, new a(this, 1.0));
        this.cs.a(3, new cou(this));
        this.cs.a(3, new cok(this, 1.0, 3.0f, 7.0f));
    }

    public static cir.a hd() {
        return cth.gW().a(cis.u, 6.0).a(cis.n, 0.4f).a(cis.x, 0.2f).a(cis.d, 3.0);
    }

    @Override
    protected cre b(dwo $$0) {
        crc $$1 = new crc(this, $$0);
        $$1.e(false);
        $$1.a(true);
        return $$1;
    }

    @Override
    public void d_() {
        if (this.cJ == null || !this.cJ.a(this.dI(), 3.46) || !this.ao().a_(this.cJ).a(dzs.ew)) {
            this.cI = false;
            this.cJ = null;
        }
        if (this.ao().y.a(400) == 0) {
            cwy.a(this.ao(), this);
        }
        super.d_();
        this.hh();
    }

    @Override
    public void a(is $$0, boolean $$1) {
        this.cJ = $$0;
        this.cI = $$1;
    }

    public boolean he() {
        return this.cI;
    }

    private void hh() {
        this.cC = this.cz;
        this.cB = this.cA;
        this.cA += (float)(this.aV() || this.cq() ? -1 : 4) * 0.3f;
        this.cA = bgj.a(this.cA, 0.0f, 1.0f);
        if (!this.aV() && this.cG < 1.0f) {
            this.cG = 1.0f;
        }
        this.cG *= 0.9f;
        ftm $$0 = this.dN();
        if (!this.aV() && $$0.h < 0.0) {
            this.k($$0.d(1.0, 0.6, 1.0));
        }
        this.cz += this.cG * 2.0f;
    }

    public static boolean a(dwo $$0, cgk $$1) {
        chn $$3;
        if (!$$1.cb() || $$1.bq() || $$0.y.a(2) != 0) {
            return false;
        }
        List<chn> $$2 = $$0.a(chn.class, $$1.dj().g(20.0), cE);
        if (!$$2.isEmpty() && !($$3 = $$2.get($$0.y.a($$2.size()))).bq()) {
            bcz $$4 = cwy.b($$3.ay());
            $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), $$4, $$1.dB(), 0.7f, cwy.a($$0.y));
            return true;
        }
        return false;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (!this.p() && $$2.a(bdy.bf)) {
            this.a($$0, $$1, $$2);
            if (!this.bq()) {
                this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.vo, this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
            }
            if (!this.ao().B_()) {
                if (this.as.a(10) == 0) {
                    this.g($$0);
                    this.ao().a((cgk)this, (byte)7);
                } else {
                    this.ao().a((cgk)this, (byte)6);
                }
            }
            return cdc.a;
        }
        if ($$2.a(bdy.bg)) {
            this.a($$0, $$1, $$2);
            this.a(new cfm(cfo.s, 900));
            if ($$0.ha() || !this.cU()) {
                this.a(this.en().a($$0), Float.MAX_VALUE);
            }
            return cdc.a;
        }
        if (!this.d() && this.p() && this.j($$0)) {
            if (!this.ao().B_()) {
                this.z(!this.gR());
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean j(dlt $$0) {
        return false;
    }

    public static boolean c(cgu<cwy> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cq) && cwy.a($$1, $$3);
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    public boolean a(cth $$0) {
        return false;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return null;
    }

    @Override
    public @Nullable bcz W() {
        return cwy.a(this.ao(), this.ao().y);
    }

    public static bcz a(dwo $$0, bgr $$1) {
        if ($$0.av() != ccz.a && $$1.a(1000) == 0) {
            ArrayList $$2 = Lists.newArrayList(cF.keySet());
            return cwy.b((cgu)$$2.get($$1.a($$2.size())));
        }
        return bda.vm;
    }

    private static bcz b(cgu<?> $$0) {
        return cF.getOrDefault($$0, bda.vm);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.vq;
    }

    @Override
    protected bcz fd() {
        return bda.vn;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.wf, 0.15f, 1.0f);
    }

    @Override
    protected boolean bp() {
        return this.am > this.cH;
    }

    @Override
    protected void bo() {
        this.a(bda.vp, 0.15f, 1.0f);
        this.cH = this.am + this.cA / 2.0f;
    }

    @Override
    public float fD() {
        return cwy.a(this.as);
    }

    public static float a(bgr $$0) {
        return ($$0.i() - $$0.i()) * 0.2f + 1.0f;
    }

    @Override
    public bdb dB() {
        return bdb.g;
    }

    @Override
    public boolean bY() {
        return true;
    }

    @Override
    protected void F(cgk $$0) {
        if ($$0 instanceof ddm) {
            return;
        }
        super.F($$0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        this.z(false);
        return super.a($$0, $$1, $$2);
    }

    public b hf() {
        return cwy$b.a(this.az.a(cD));
    }

    private void a(b $$0) {
        this.az.a(cD, $$0.k);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aI) {
            return cwy.c($$0, this.hf());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aI);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aI) {
            this.a(cwy.c(ki.aI, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cD, cwy$b.f.k);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Variant", cwy$b.h, this.hf());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("Variant", cwy$b.h).orElse(cwy$b.f));
    }

    @Override
    public boolean d() {
        return !this.aV();
    }

    @Override
    protected boolean gV() {
        return true;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.5f * this.dk(), this.dF() * 0.4f);
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b(0, "red_blue");
        public static final /* enum */ b b = new b(1, "blue");
        public static final /* enum */ b c = new b(2, "green");
        public static final /* enum */ b d = new b(3, "yellow_blue");
        public static final /* enum */ b e = new b(4, "gray");
        public static final b f;
        private static final IntFunction<b> j;
        public static final Codec<b> g;
        @Deprecated
        public static final Codec<b> h;
        public static final aao<ByteBuf, b> i;
        final int k;
        private final String l;
        private static final /* synthetic */ b[] m;

        public static b[] values() {
            return (b[])m.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, String $$1) {
            this.k = $$0;
            this.l = $$1;
        }

        public int a() {
            return this.k;
        }

        public static b a(int $$0) {
            return j.apply($$0);
        }

        @Override
        public String c() {
            return this.l;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            m = cwy$b.b();
            f = a;
            j = beu.a(b::a, cwy$b.values(), beu.a.c);
            g = bhh.a(b::values);
            h = Codec.INT.xmap(j::apply, b::a);
            i = aam.a(j, b::a);
        }
    }

    static class a
    extends cqc {
        public a(cht $$0, double $$1) {
            super($$0, $$1);
        }

        @Override
        protected @Nullable ftm h() {
            ftm $$0 = null;
            if (this.b.by()) {
                $$0 = csr.a(this.b, 15, 15);
            }
            if (this.b.ep().i() >= this.j) {
                $$0 = this.k();
            }
            return $$0 == null ? super.h() : $$0;
        }

        private @Nullable ftm k() {
            is $$0 = this.b.dK();
            is.a $$1 = new is.a();
            is.a $$2 = new is.a();
            Iterable<is> $$3 = is.b(bgj.c(this.b.dP() - 3.0), bgj.c(this.b.dR() - 6.0), bgj.c(this.b.dV() - 3.0), bgj.c(this.b.dP() + 3.0), bgj.c(this.b.dR() + 6.0), bgj.c(this.b.dV() + 3.0));
            for (is $$4 : $$3) {
                eoh $$5;
                boolean $$6;
                if ($$0.equals($$4) || !($$6 = ($$5 = this.b.ao().a_($$2.a((jy)$$4, iz.a))).b() instanceof eei || $$5.a(bdp.E)) || !this.b.ao().A($$4) || !this.b.ao().A($$1.a((jy)$$4, iz.b))) continue;
                return ftm.c($$4);
            }
            return null;
        }
    }
}

