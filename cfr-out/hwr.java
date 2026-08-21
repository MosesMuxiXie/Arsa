/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class hwr {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<cgu<?>, hwq<?>> b = new Object2ObjectOpenHashMap();

    private static <T extends cgk> void a(cgu<? extends T> $$0, hwq<T> $$1) {
        b.put($$0, $$1);
    }

    public static Map<cgu<?>, hwp<?, ?>> a(hwq.a $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        b.forEach(($$2, $$3) -> {
            try {
                $$1.put($$2, $$3.create($$0));
            }
            catch (Exception $$4) {
                throw new IllegalArgumentException("Failed to create model for " + String.valueOf(mi.g.b((cgu<?>)$$2)), $$4);
            }
        });
        return $$1.build();
    }

    public static <T extends cgc> Map<ddp, icd<T>> b(hwq.a $$0) {
        try {
            return Map.of(ddp.b, new icd($$0, false), ddp.a, new icd($$0, true));
        }
        catch (Exception $$1) {
            throw new IllegalArgumentException("Failed to create avatar models", $$1);
        }
    }

    public static boolean a() {
        boolean $$0 = true;
        for (cgu cgu2 : mi.g) {
            if (cgu2 == cgu.cb || cgu2 == cgu.aH || b.containsKey(cgu2)) continue;
            a.warn("No renderer registered for {}", (Object)mi.g.b(cgu2));
            $$0 = false;
        }
        return !$$0;
    }

    static {
        hwr.a(cgu.c, $$0 -> new hvr($$0, hdf.a));
        hwr.a(cgu.d, $$0 -> new hvr($$0, hdf.b));
        hwr.a(cgu.e, hvi::new);
        hwr.a(cgu.f, hya::new);
        hwr.a(cgu.g, hvj::new);
        hwr.a(cgu.h, hvl::new);
        hwr.a(cgu.i, hzi::new);
        hwr.a(cgu.j, hvn::new);
        hwr.a(cgu.k, $$0 -> new hyo($$0, hdf.m));
        hwr.a(cgu.l, $$0 -> new hyo($$0, hdf.n));
        hwr.a(cgu.m, hvo::new);
        hwr.a(cgu.n, hvp::new);
        hwr.a(cgu.o, $$0 -> new hvr($$0, hdf.z));
        hwr.a(cgu.p, $$0 -> new hvr($$0, hdf.A));
        hwr.a(cgu.q, hvq::new);
        hwr.a(cgu.r, hwe.a::new);
        hwr.a(cgu.s, hvs::new);
        hwr.a(cgu.t, hvt::new);
        hwr.a(cgu.u, hzt::new);
        hwr.a(cgu.v, hvv::new);
        hwr.a(cgu.w, hvu::new);
        hwr.a(cgu.x, hvw::new);
        hwr.a(cgu.y, hvx::new);
        hwr.a(cgu.z, $$0 -> new hvr($$0, hdf.V));
        hwr.a(cgu.A, $$0 -> new hvr($$0, hdf.W));
        hwr.a(cgu.B, $$0 -> new hxw($$0, hdf.Y));
        hwr.a(cgu.C, hvy::new);
        hwr.a(cgu.D, hvz::new);
        hwr.a(cgu.F, $$0 -> new hxw($$0, hdf.ai));
        hwr.a(cgu.E, hwa::new);
        hwr.a(cgu.G, hwb::new);
        hwr.a(cgu.H, hwc::new);
        hwr.a(cgu.I, hwd::new);
        hwr.a(cgu.J, $$0 -> new hvr($$0, hdf.aA));
        hwr.a(cgu.K, $$0 -> new hvr($$0, hdf.aB));
        hwr.a(cgu.L, hwf::new);
        hwr.a(cgu.M, $$0 -> new hwg($$0, hwg.a.a));
        hwr.a(cgu.N, hwh::new);
        hwr.a(cgu.O, hwi::new);
        hwr.a(cgu.P, hzg::new);
        hwr.a(cgu.Q, hwj::new);
        hwr.a(cgu.R, hwm::new);
        hwr.a(cgu.S, hwn::new);
        hwr.a(cgu.T, hwl::new);
        hwr.a(cgu.U, hzg::new);
        hwr.a(cgu.V, hwk::new);
        hwr.a(cgu.W, hwt::new);
        hwr.a(cgu.X, hws::new);
        hwr.a(cgu.Y, hzg::new);
        hwr.a(cgu.Z, hwu::new);
        hwr.a(cgu.aa, $$0 -> new hzg($$0, 1.0f, true));
        hwr.a(cgu.ab, hwv::new);
        hwr.a(cgu.ac, $$0 -> new hzg($$0, 3.0f, true));
        hwr.a(cgu.ad, hww::new);
        hwr.a(cgu.cc, hwx::new);
        hwr.a(cgu.ae, hwy::new);
        hwr.a(cgu.af, hwz::new);
        hwr.a(cgu.ag, $$0 -> new hxw($$0, hdf.bf));
        hwr.a(cgu.ah, hxa::new);
        hwr.a(cgu.ai, hxf::new);
        hwr.a(cgu.aj, $$0 -> new hxb($$0, 6.0f));
        hwr.a(cgu.ak, hxo::new);
        hwr.a(cgu.al, $$0 -> new hxc($$0, new hcs($$0.a(hdf.bj)), new hcs($$0.a(hdf.bk))));
        hwr.a(cgu.am, hxd::new);
        hwr.a(cgu.an, hxe::new);
        hwr.a(cgu.ao, hxg::new);
        hwr.a(cgu.ap, $$0 -> new hxw($$0, hdf.bw));
        hwr.a(cgu.aq, hxh::new);
        hwr.a(cgu.ar, hxj::new);
        hwr.a(cgu.as, hxl::new);
        hwr.a(cgu.at, hya::new);
        hwr.a(cgu.au, hxm::new);
        hwr.a(cgu.av, hxn::new);
        hwr.a(cgu.aw, hwe.b::new);
        hwr.a(cgu.ax, hxo::new);
        hwr.a(cgu.ay, $$0 -> new hvr($$0, hdf.bJ));
        hwr.a(cgu.az, $$0 -> new hvr($$0, hdf.bK));
        hwr.a(cgu.aA, hxq::new);
        hwr.a(cgu.aB, hxr::new);
        hwr.a(cgu.be, hzg::new);
        hwr.a(cgu.aC, $$0 -> new hxt($$0, hdf.bM, hdf.bN));
        hwr.a(cgu.aD, hxu::new);
        hwr.a(cgu.aE, hxv::new);
        hwr.a(cgu.aF, $$0 -> new hvr($$0, hdf.bS));
        hwr.a(cgu.aG, $$0 -> new hvr($$0, hdf.bT));
        hwr.a(cgu.aI, hya::new);
        hwr.a(cgu.aJ, $$0 -> new hxw($$0, hdf.bU));
        hwr.a(cgu.aK, hxy::new);
        hwr.a(cgu.aL, $$0 -> new hwg($$0, hwg.a.b));
        hwr.a(cgu.aM, hxz::new);
        hwr.a(cgu.aN, $$0 -> new hvr($$0, hdf.cf));
        hwr.a(cgu.aO, $$0 -> new hvr($$0, hdf.cg));
        hwr.a(cgu.aP, hyb::new);
        hwr.a(cgu.aQ, hyc::new);
        hwr.a(cgu.aR, hyd::new);
        hwr.a(cgu.aS, $$0 -> new hvr($$0, hdf.cj));
        hwr.a(cgu.aT, $$0 -> new hvr($$0, hdf.ck));
        hwr.a(cgu.aU, hye::new);
        hwr.a(cgu.aV, hyf::new);
        hwr.a(cgu.aW, hyg::new);
        hwr.a(cgu.aX, hyh::new);
        hwr.a(cgu.aY, hyi::new);
        hwr.a(cgu.aZ, $$0 -> new hyj($$0, hdf.ct, hdf.cu, hdf.cz, hdf.cv));
        hwr.a(cgu.ba, $$0 -> new hyj($$0, hdf.cw, hdf.cw, hdf.cx, hdf.cx));
        hwr.a(cgu.bb, hyk::new);
        hwr.a(cgu.bc, hyl::new);
        hwr.a(cgu.bf, hym::new);
        hwr.a(cgu.bg, hyn::new);
        hwr.a(cgu.bh, hyp::new);
        hwr.a(cgu.bi, hyr::new);
        hwr.a(cgu.bj, hys::new);
        hwr.a(cgu.bk, hyu::new);
        hwr.a(cgu.bl, hyt::new);
        hwr.a(cgu.bm, hyv::new);
        hwr.a(cgu.bn, hyw::new);
        hwr.a(cgu.bo, $$0 -> new hzn($$0, hzn.a.a));
        hwr.a(cgu.bp, hyx::new);
        hwr.a(cgu.bq, $$0 -> new hzg($$0, 0.75f, true));
        hwr.a(cgu.br, hyy::new);
        hwr.a(cgu.bs, hzg::new);
        hwr.a(cgu.bt, hyz::new);
        hwr.a(cgu.bu, $$0 -> new hxw($$0, hdf.du));
        hwr.a(cgu.bv, hza::new);
        hwr.a(cgu.bw, hzb::new);
        hwr.a(cgu.bd, hzg::new);
        hwr.a(cgu.bx, $$0 -> new hvr($$0, hdf.dw));
        hwr.a(cgu.by, $$0 -> new hvr($$0, hdf.dx));
        hwr.a(cgu.bz, $$0 -> new hzc($$0, new hcs($$0.a(hdf.dy)), new hcs($$0.a(hdf.dz))));
        hwr.a(cgu.bA, hzd::new);
        hwr.a(cgu.bB, hze::new);
        hwr.a(cgu.bC, hzf::new);
        hwr.a(cgu.bD, hwe.c::new);
        hwr.a(cgu.bE, hzk::new);
        hwr.a(cgu.bF, hzj::new);
        hwr.a(cgu.bG, $$0 -> new hxt($$0, hdf.dJ, hdf.dK));
        hwr.a(cgu.bH, hzh::new);
        hwr.a(cgu.bI, hzl::new);
        hwr.a(cgu.bJ, hzm::new);
        hwr.a(cgu.bK, hzo::new);
        hwr.a(cgu.bL, hzp::new);
        hwr.a(cgu.bM, hzq::new);
        hwr.a(cgu.bN, hzr::new);
        hwr.a(cgu.bO, hzs::new);
        hwr.a(cgu.bP, hzt::new);
        hwr.a(cgu.bQ, hzu::new);
        hwr.a(cgu.bR, hzv::new);
        hwr.a(cgu.bS, hzw::new);
        hwr.a(cgu.bT, hzx::new);
        hwr.a(cgu.bU, hzy::new);
        hwr.a(cgu.bV, hzz::new);
        hwr.a(cgu.bW, iab::new);
        hwr.a(cgu.bX, $$0 -> new hzn($$0, hzn.a.b));
        hwr.a(cgu.bY, iaa::new);
        hwr.a(cgu.bZ, iac::new);
        hwr.a(cgu.ca, $$0 -> new iad($$0, hdf.eL, hdf.eM, hdf.eO, hdf.eN));
    }
}

