/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class mi {
    private static final Logger aS = LogUtils.getLogger();
    private static final Map<amo, Supplier<?>> aT = Maps.newLinkedHashMap();
    private static final jz<jz<?>> aU = new jl(amt.a(mj.a), Lifecycle.stable());
    public static final iy<etk> a = mi.a(mj.N, "step", etk::a);
    public static final jq<bcz> b = mi.a(mj.aw, (jq<T> $$0) -> bda.pG);
    public static final iy<fla> c = mi.b(mj.L, "empty", $$0 -> flc.a);
    public static final jq<cfk> d = mi.a(mj.ae, cfo::a);
    public static final iy<dzq> e = mi.b(mj.i, "air", $$0 -> dzs.a);
    public static final jq<bxe<?>> f = mi.a(mj.t, bxf::a);
    public static final iy<cgu<?>> g = mi.b(mj.F, "pig", $$0 -> cgu.aY);
    public static final iy<dlp> h = mi.b(mj.R, "air", $$0 -> dlx.a);
    public static final jq<dnp> i = mi.a(mj.am, dns::a);
    public static final jq<lx<?>> j = mi.a(mj.ag, (jq<T> $$0) -> ly.b);
    public static final jq<eld<?>> k = mi.b(mj.e, $$0 -> eld.a);
    public static final jq<amo> l = mi.a(mj.p, (jq<T> $$0) -> bdk.G);
    public static final iy<erj> m = mi.a(mj.l, "empty", (jq<T> $$0) -> erj.c);
    public static final jq<fjl<?>> n = mi.a(mj.at, (jq<T> $$0) -> fjl.a);
    public static final jq<fjz<?>> o = mi.a(mj.as, (jq<T> $$0) -> fjz.b);
    public static final jq<fje<?>> p = mi.a(mj.al, (jq<T> $$0) -> fje.a);
    public static final jq<dis<?>> q = mi.a(mj.ad, (jq<T> $$0) -> dis.i);
    public static final jq<drd<?>> r = mi.a(mj.aq, (jq<T> $$0) -> drd.a);
    public static final jq<drc<?>> s = mi.a(mj.ap, (jq<T> $$0) -> drc.b);
    public static final jq<cin> t = mi.a(mj.c, cis::a);
    public static final jq<etp<?>> u = mi.a(mj.ak, (jq<T> $$0) -> etp.a);
    public static final jq<ib<?, ?>> v = mi.a(mj.m, ic::a);
    public static final jq<bdj<?>> w = mi.a(mj.ay, (jq<T> $$0) -> bdk.c);
    public static final iy<ddc> x = mi.a(mj.aM, "plains", ddc::a);
    public static final iy<dda> y = mi.a(mj.aL, "none", dda::a);
    public static final jq<cta> z = mi.a(mj.ai, ctb::a);
    public static final iy<cqw<?>> A = mi.a(mj.ac, "dummy", (jq<T> $$0) -> cqw.a);
    public static final iy<cse<?>> B = mi.a(mj.au, "dummy", (jq<T> $$0) -> cse.a);
    public static final jq<dfl> C = mi.a(mj.b, (jq<T> $$0) -> dfl.b);
    public static final jq<fos> D = mi.a(mj.X, (jq<T> $$0) -> foo.b);
    public static final jq<fps<?>> E = mi.a(mj.U, (jq<T> $$0) -> fpt.e);
    public static final jq<frn> F = mi.a(mj.T, (jq<T> $$0) -> fro.a);
    public static final jq<fsh> G = mi.a(mj.W, (jq<T> $$0) -> fsj.b);
    public static final jq<frz> H = mi.a(mj.V, (jq<T> $$0) -> fsb.c);
    public static final jq<fsq> I = mi.a(mj.Y, (jq<T> $$0) -> fss.c);
    public static final jq<ccg<?>> J = mi.a(mj.K, (jq<T> $$0) -> ccg.a);
    public static final jq<cci<?>> K = mi.a(mj.Q, (jq<T> $$0) -> cci.a);
    public static final jq<fdw<?>> L = mi.a(mj.O, (jq<T> $$0) -> fdw.a);
    public static final jq<evy<?>> M = mi.a(mj.f, (jq<T> $$0) -> evy.k);
    public static final jq<eww<?>> N = mi.a(mj.j, (jq<T> $$0) -> eww.a);
    public static final jq<exx<?>> O = mi.a(mj.J, (jq<T> $$0) -> exx.J);
    public static final jq<fgm<?>> P = mi.a(mj.aA, (jq<T> $$0) -> fgm.a);
    public static final jq<fgf> Q = mi.a(mj.az, (jq<T> $$0) -> fgf.c);
    public static final jq<ffx<?>> R = mi.a(mj.aD, (jq<T> $$0) -> ffx.f);
    public static final jq<few<?>> S = mi.a(mj.ah, (jq<T> $$0) -> few.f);
    public static final jq<fce<?>> T = mi.a(mj.g, (jq<T> $$0) -> fce.a);
    public static final jq<fbp<?>> U = mi.a(mj.M, (jq<T> $$0) -> fbp.a);
    public static final jq<fdl<?>> V = mi.a(mj.aK, (jq<T> $$0) -> fdl.a);
    public static final jq<fcb<?>> W = mi.a(mj.ar, (jq<T> $$0) -> fcb.a);
    public static final jq<fcz<?>> X = mi.a(mj.aJ, (jq<T> $$0) -> fcz.b);
    public static final jq<fbe<?>> Y = mi.a(mj.I, (jq<T> $$0) -> fbe.a);
    public static final jq<MapCodec<? extends dxs>> Z = mi.a(mj.d, dxt::a);
    public static final jq<MapCodec<? extends eqg>> aa = mi.a(mj.k, eqi::a);
    public static final jq<MapCodec<? extends evh.f>> ab = mi.a(mj.aa, evh.f::a);
    public static final jq<MapCodec<? extends evh.o>> ac = mi.a(mj.ab, evh.o::a);
    public static final jq<MapCodec<? extends euj>> ad = mi.a(mj.v, euk::a);
    public static final jq<MapCodec<? extends dzq>> ae = mi.a(mj.h, dzr::a);
    public static final jq<fjp<?>> af = mi.a(mj.aC, (jq<T> $$0) -> fjp.e);
    public static final jq<fgx<?>> ag = mi.a(mj.aB, (jq<T> $$0) -> fgx.d);
    public static final jq<MapCodec<? extends fha>> ah = mi.a(mj.aj, fhb::a);
    public static final jq<elv> ai = mi.a(mj.u, elw::a);
    public static final jq<dkk> aj = mi.a(mj.o, dkl::a);
    public static final jq<am<?>> ak = mi.a(mj.by, aj::a);
    public static final jq<aah<?>> al = mi.a(mj.af, aai::a);
    public static final jq<kh<?>> am = mi.a(mj.r, ki::a);
    public static final jq<etv<?>> an = mi.a(mj.s, eua::a);
    public static final jq<MapCodec<? extends bt>> ao = mi.a(mj.E, bu::a);
    public static final jq<ks.d<?>> ap = mi.a(mj.q, kt::a);
    public static final jq<fmr> aq = mi.a(mj.Z, fms::a);
    public static final jq<kh<?>> ar = mi.a(mj.y, dsp::a);
    public static final jq<MapCodec<? extends dsv>> as = mi.a(mj.A, dsv::a);
    public static final jq<MapCodec<? extends dth>> at = mi.a(mj.z, dth::a);
    public static final jq<MapCodec<? extends dti>> au = mi.a(mj.B, dti::b);
    public static final jq<MapCodec<? extends dtj>> av = mi.a(mj.D, dtj::a);
    public static final jq<MapCodec<? extends dtz>> aw = mi.a(mj.C, dua::a);
    public static final jq<dpp.a<?>> ax = mi.a(mj.n, (jq<T> $$0) -> dpp.a.a);
    public static final jq<dry.a<?>> ay = mi.a(mj.ao, dsb::a);
    public static final jq<dse.i<?>> az = mi.a(mj.av, dsg::a);
    public static final jq<dqv> aA = mi.a(mj.an, dqu::a);
    public static final jq<axm> aB = mi.a(mj.aI, (jq<T> $$0) -> axm.o);
    public static final jq<ats<?, ?>> aC = mi.a(mj.aN, att::a);
    public static final jq<atz<?, ?>> aD = mi.a(mj.aO, (jq<T> $$0) -> aua.a);
    public static final jq<MapCodec<? extends tv>> aE = mi.a(mj.aF, tv::a);
    public static final jq<MapCodec<? extends tb>> aF = mi.a(mj.aH, tb::a);
    public static final jq<MapCodec<? extends dfr>> aG = mi.a(mj.ax, dfs::a);
    public static final jq<MapCodec<? extends asj>> aH = mi.a(mj.x, asm::a);
    public static final jq<MapCodec<? extends ast>> aI = mi.a(mj.aE, asu::a);
    public static final jq<MapCodec<? extends atg>> aJ = mi.a(mj.P, ath::a);
    public static final jq<MapCodec<? extends ata>> aK = mi.a(mj.w, atb::a);
    public static final jq<MapCodec<? extends bbi>> aL = mi.a(mj.aP, bbq::a);
    public static final jq<MapCodec<? extends bbj>> aM = mi.a(mj.aQ, bbk::a);
    public static final jq<cea<?>> aN = mi.a(mj.G, ceg::a);
    public static final jq<cdw<?>> aO = mi.a(mj.H, cdx::a);
    public static final jq<MapCodec<? extends dvf>> aP = mi.a(mj.S, dvg::a);
    public static final jq<Consumer<sz>> aQ = mi.a(mj.aG, sn::a);
    public static final jq<? extends jq<?>> aR = aU;

    private static <T> jq<T> a(amt<? extends jq<T>> $$0, a<T> $$1) {
        return mi.a($$0, new jl($$0, Lifecycle.stable(), false), $$1);
    }

    private static <T> jq<T> b(amt<? extends jq<T>> $$0, a<T> $$1) {
        return mi.a($$0, new jl($$0, Lifecycle.stable(), true), $$1);
    }

    private static <T> iy<T> a(amt<? extends jq<T>> $$0, String $$1, a<T> $$2) {
        return mi.a($$0, new ix($$1, $$0, Lifecycle.stable(), false), $$2);
    }

    private static <T> iy<T> b(amt<? extends jq<T>> $$0, String $$1, a<T> $$2) {
        return mi.a($$0, new ix($$1, $$0, Lifecycle.stable(), true), $$2);
    }

    private static <T, R extends jz<T>> R a(amt<? extends jq<T>> $$0, R $$1, a<T> $$2) {
        amv.a(() -> "registry " + String.valueOf($$0.a()));
        amo $$3 = $$0.a();
        aT.put($$3, () -> $$2.run($$1));
        aU.a($$0, $$1, jp.a);
        return $$1;
    }

    public static void a() {
        mi.b();
        mi.c();
        mi.b(aR);
    }

    private static void b() {
        aT.forEach(($$0, $$1) -> {
            if ($$1.get() == null) {
                aS.error("Unable to bootstrap registry '{}'", $$0);
            }
        });
    }

    private static void c() {
        aR.n();
        for (jq jq2 : aR) {
            mi.c(jq2);
            jq2.n();
        }
    }

    private static <T extends jq<?>> void b(jq<T> $$0) {
        $$0.forEach($$1 -> {
            if ($$1.i().isEmpty()) {
                bhs.b("Registry '" + String.valueOf($$0.b($$1)) + "' was empty after loading");
            }
            if ($$1 instanceof iy) {
                amo $$2 = ((iy)$$1).b();
                Objects.requireNonNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + String.valueOf($$2));
            }
        });
    }

    public static <T> je<T> a(jq<T> $$0) {
        return ((jz)$$0).p();
    }

    private static void c(jq<?> $$0) {
        ((jl)$$0).o();
    }

    @FunctionalInterface
    static interface a<T> {
        public Object run(jq<T> var1);
    }
}

