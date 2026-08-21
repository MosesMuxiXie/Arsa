/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ijt {
    static final BiFunction<amo, Boolean, ijs> a = bhs.a((T $$0, U $$1) -> ijs.a("outline", ijr.a($$1 != false ? hpa.aF : hpa.aG).a("Sampler0", (amo)$$0).a(ijq.b).a(ijr.a.b).e()));
    public static final Supplier<fzf> b = () -> RenderSystem.getSamplerCache().a(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.NEAREST, true);
    private static final ijs f = ijs.a("solid_moving_block", ijr.a(hpa.b).a().a("Sampler0", ilo.d, b).c().a(ijr.a.c).e());
    private static final ijs g = ijs.a("cutout_moving_block", ijr.a(hpa.e).a().a("Sampler0", ilo.d, b).c().a(ijr.a.c).e());
    private static final ijs h = ijs.a("translucent_moving_block", ijr.a(hpa.j).a().a("Sampler0", ilo.d, b).a(ijq.d).d().a(786432).a(ijr.a.c).e());
    private static final Function<amo, ijs> i = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.k).a("Sampler0", (amo)$$0).a().b().a(ijp.b).c().a(ijr.a.c).e();
        return ijs.a("armor_cutout_no_cull", $$1);
    });
    private static final Function<amo, ijs> j = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.m).a("Sampler0", (amo)$$0).a().b().a(ijp.b).c().d().a(ijr.a.c).e();
        return ijs.a("armor_translucent", $$1);
    });
    private static final Function<amo, ijs> k = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.n).a("Sampler0", (amo)$$0).a().b().c().a(ijr.a.c).e();
        return ijs.a("entity_solid", $$1);
    });
    private static final Function<amo, ijs> l = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.o).a("Sampler0", (amo)$$0).a().b().a(ijp.c).c().a(ijr.a.c).e();
        return ijs.a("entity_solid_z_offset_forward", $$1);
    });
    private static final Function<amo, ijs> m = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.p).a("Sampler0", (amo)$$0).a().b().c().a(ijr.a.c).e();
        return ijs.a("entity_cutout", $$1);
    });
    private static final BiFunction<amo, Boolean, ijs> n = bhs.a((T $$0, U $$1) -> {
        ijr $$2 = ijr.a(hpa.q).a("Sampler0", (amo)$$0).a().b().c().a($$1 != false ? ijr.a.c : ijr.a.a).e();
        return ijs.a("entity_cutout_no_cull", $$2);
    });
    private static final BiFunction<amo, Boolean, ijs> o = bhs.a((T $$0, U $$1) -> {
        ijr $$2 = ijr.a(hpa.r).a("Sampler0", (amo)$$0).a().b().a(ijp.b).c().a($$1 != false ? ijr.a.c : ijr.a.a).e();
        return ijs.a("entity_cutout_no_cull_z_offset", $$2);
    });
    private static final Function<amo, ijs> p = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.B).a("Sampler0", (amo)$$0).a(ijq.d).a().b().c().d().a(ijr.a.c).e();
        return ijs.a("item_entity_translucent_cull", $$1);
    });
    private static final BiFunction<amo, Boolean, ijs> q = bhs.a((T $$0, U $$1) -> {
        ijr $$2 = ijr.a(hpa.s).a("Sampler0", (amo)$$0).a().b().c().d().a($$1 != false ? ijr.a.c : ijr.a.a).e();
        return ijs.a("entity_translucent", $$2);
    });
    private static final BiFunction<amo, Boolean, ijs> r = bhs.a((T $$0, U $$1) -> {
        ijr $$2 = ijr.a(hpa.t).a("Sampler0", (amo)$$0).b().c().d().a($$1 != false ? ijr.a.c : ijr.a.a).e();
        return ijs.a("entity_translucent_emissive", $$2);
    });
    private static final Function<amo, ijs> s = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.u).a("Sampler0", (amo)$$0).a().b().a(ijr.a.c).e();
        return ijs.a("entity_smooth_cutout", $$1);
    });
    private static final BiFunction<amo, Boolean, ijs> t = bhs.a((T $$0, U $$1) -> {
        ijr $$2 = ijr.a($$1 != false ? hpa.D : hpa.C).a("Sampler0", (amo)$$0).d().e();
        return ijs.a("beacon_beam", $$2);
    });
    private static final Function<amo, ijs> u = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.z).a("Sampler0", (amo)$$0).a().b().e();
        return ijs.a("entity_decal", $$1);
    });
    private static final Function<amo, ijs> v = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.v).a("Sampler0", (amo)$$0).a().b().d().e();
        return ijs.a("entity_no_outline", $$1);
    });
    private static final Function<amo, ijs> w = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.A).a("Sampler0", (amo)$$0).a().b().a(ijp.b).e();
        return ijs.a("entity_shadow", $$1);
    });
    private static final Function<amo, ijs> x = bhs.b((T $$0) -> {
        ijr $$1 = ijr.a(hpa.E).a("Sampler0", (amo)$$0).a(ijr.a.c).e();
        return ijs.a("entity_alpha", $$1);
    });
    private static final Function<amo, ijs> y = bhs.b((T $$0) -> ijs.a("eyes", ijr.a(hpa.y).a("Sampler0", (amo)$$0).d().e()));
    private static final ijs z = ijs.a("leash", ijr.a(hpa.F).a().e());
    private static final ijs A = ijs.a("water_mask", ijr.a(hpa.G).e());
    private static final ijs B = ijs.a("armor_entity_glint", ijr.a(hpa.H).a("Sampler0", hxp.a).a(iju.e).a(ijp.b).e());
    private static final ijs C = ijs.a("glint_translucent", ijr.a(hpa.H).a("Sampler0", hxp.b).a(iju.c).a(ijq.d).e());
    private static final ijs D = ijs.a("glint", ijr.a(hpa.H).a("Sampler0", hxp.b).a(iju.c).e());
    private static final ijs E = ijs.a("entity_glint", ijr.a(hpa.H).a("Sampler0", hxp.b).a(iju.d).e());
    private static final Function<amo, ijs> F = bhs.b((T $$0) -> ijs.a("crumbling", ijr.a(hpa.I).a("Sampler0", (amo)$$0).d().e()));
    private static final Function<amo, ijs> G = bhs.b((T $$0) -> ijs.a("text", ijr.a(hpa.J).a("Sampler0", (amo)$$0).a().a(786432).e()));
    private static final ijs H = ijs.a("text_background", ijr.a(hpa.L).a().d().e());
    private static final Function<amo, ijs> I = bhs.b((T $$0) -> ijs.a("text_intensity", ijr.a(hpa.M).a("Sampler0", (amo)$$0).a().a(786432).e()));
    private static final Function<amo, ijs> J = bhs.b((T $$0) -> ijs.a("text_polygon_offset", ijr.a(hpa.O).a("Sampler0", (amo)$$0).a().d().e()));
    private static final Function<amo, ijs> K = bhs.b((T $$0) -> ijs.a("text_intensity_polygon_offset", ijr.a(hpa.M).a("Sampler0", (amo)$$0).a().d().e()));
    private static final Function<amo, ijs> L = bhs.b((T $$0) -> ijs.a("text_see_through", ijr.a(hpa.P).a("Sampler0", (amo)$$0).a().e()));
    private static final ijs M = ijs.a("text_background_see_through", ijr.a(hpa.Q).a().d().e());
    private static final Function<amo, ijs> N = bhs.b((T $$0) -> ijs.a("text_intensity_see_through", ijr.a(hpa.R).a("Sampler0", (amo)$$0).a().d().e()));
    private static final ijs O = ijs.a("lightning", ijr.a(hpa.S).a(ijq.c).d().e());
    private static final ijs P = ijs.a("dragon_rays", ijr.a(hpa.T).e());
    private static final ijs Q = ijs.a("dragon_rays_depth", ijr.a(hpa.U).e());
    private static final ijs R = ijs.a("tripwire_moving_block", ijr.a(hpa.h).a().a("Sampler0", ilo.d, b).a(ijq.c).c().d().a(ijr.a.c).e());
    private static final ijs S = ijs.a("end_portal", ijr.a(hpa.V).a("Sampler0", hrb.a).a("Sampler1", hrb.b).e());
    private static final ijs T = ijs.a("end_gateway", ijr.a(hpa.W).a("Sampler0", hrb.a).a("Sampler1", hrb.b).e());
    public static final ijs c = ijs.a("lines", ijr.a(hpa.Z).a(ijp.b).a(ijq.d).e());
    public static final ijs d = ijs.a("lines_translucent", ijr.a(hpa.aa).a(ijp.b).a(ijq.d).e());
    public static final ijs e = ijs.a("secondary_block_outline", ijr.a(hpa.ab).a(ijp.b).a(ijq.d).e());
    private static final ijs U = ijs.a("debug_filled_box", ijr.a(hpa.ad).d().a(ijp.b).e());
    private static final ijs V = ijs.a("debug_point", ijr.a(hpa.ac).e());
    private static final ijs W = ijs.a("debug_quads", ijr.a(hpa.ae).d().e());
    private static final ijs X = ijs.a("debug_triangle_fan", ijr.a(hpa.af).d().e());
    private static final Function<amo, ijs> Y = ijt.a(hpa.aj);
    private static final Function<amo, ijs> Z = ijt.a(hpa.ak);
    private static final Function<amo, ijs> aa = bhs.b((T $$0) -> ijs.a("block_screen_effect", ijr.a(hpa.av).a("Sampler0", (amo)$$0).e()));
    private static final Function<amo, ijs> ab = bhs.b((T $$0) -> ijs.a("fire_screen_effect", ijr.a(hpa.aw).a("Sampler0", (amo)$$0).e()));

    public static ijs a() {
        return f;
    }

    public static ijs b() {
        return g;
    }

    public static ijs c() {
        return h;
    }

    public static ijs a(amo $$0) {
        return i.apply($$0);
    }

    public static ijs b(amo $$0) {
        ijr $$1 = ijr.a(hpa.l).a("Sampler0", $$0).a().b().a(ijp.b).c().a(ijr.a.c).e();
        return ijs.a("armor_decal_cutout_no_cull", $$1);
    }

    public static ijs c(amo $$0) {
        return j.apply($$0);
    }

    public static ijs d(amo $$0) {
        return k.apply($$0);
    }

    public static ijs e(amo $$0) {
        return l.apply($$0);
    }

    public static ijs f(amo $$0) {
        return m.apply($$0);
    }

    public static ijs a(amo $$0, boolean $$1) {
        return n.apply($$0, $$1);
    }

    public static ijs g(amo $$0) {
        return ijt.a($$0, true);
    }

    public static ijs b(amo $$0, boolean $$1) {
        return o.apply($$0, $$1);
    }

    public static ijs h(amo $$0) {
        return ijt.b($$0, true);
    }

    public static ijs i(amo $$0) {
        return p.apply($$0);
    }

    public static ijs c(amo $$0, boolean $$1) {
        return q.apply($$0, $$1);
    }

    public static ijs j(amo $$0) {
        return ijt.c($$0, true);
    }

    public static ijs d(amo $$0, boolean $$1) {
        return r.apply($$0, $$1);
    }

    public static ijs k(amo $$0) {
        return ijt.d($$0, true);
    }

    public static ijs l(amo $$0) {
        return s.apply($$0);
    }

    public static ijs e(amo $$0, boolean $$1) {
        return t.apply($$0, $$1);
    }

    public static ijs m(amo $$0) {
        return u.apply($$0);
    }

    public static ijs n(amo $$0) {
        return v.apply($$0);
    }

    public static ijs o(amo $$0) {
        return w.apply($$0);
    }

    public static ijs p(amo $$0) {
        return x.apply($$0);
    }

    public static ijs q(amo $$0) {
        return y.apply($$0);
    }

    public static ijs r(amo $$0) {
        return r.apply($$0, false);
    }

    public static ijs a(amo $$0, float $$1, float $$2) {
        return ijs.a("breeze_wind", ijr.a(hpa.w).a("Sampler0", $$0).a(new iju.a($$1, $$2)).a().d().e());
    }

    public static ijs b(amo $$0, float $$1, float $$2) {
        return ijs.a("energy_swirl", ijr.a(hpa.x).a("Sampler0", $$0).a(new iju.a($$1, $$2)).a().b().d().e());
    }

    public static ijs d() {
        return z;
    }

    public static ijs e() {
        return A;
    }

    public static ijs s(amo $$0) {
        return a.apply($$0, false);
    }

    public static ijs f() {
        return B;
    }

    public static ijs g() {
        return C;
    }

    public static ijs h() {
        return D;
    }

    public static ijs i() {
        return E;
    }

    public static ijs t(amo $$0) {
        return F.apply($$0);
    }

    public static ijs u(amo $$0) {
        return G.apply($$0);
    }

    public static ijs j() {
        return H;
    }

    public static ijs v(amo $$0) {
        return I.apply($$0);
    }

    public static ijs w(amo $$0) {
        return J.apply($$0);
    }

    public static ijs x(amo $$0) {
        return K.apply($$0);
    }

    public static ijs y(amo $$0) {
        return L.apply($$0);
    }

    public static ijs k() {
        return M;
    }

    public static ijs z(amo $$0) {
        return N.apply($$0);
    }

    public static ijs l() {
        return O;
    }

    public static ijs m() {
        return P;
    }

    public static ijs n() {
        return Q;
    }

    public static ijs o() {
        return R;
    }

    public static ijs p() {
        return S;
    }

    public static ijs q() {
        return T;
    }

    public static ijs r() {
        return c;
    }

    public static ijs s() {
        return d;
    }

    public static ijs t() {
        return e;
    }

    public static ijs u() {
        return U;
    }

    public static ijs v() {
        return V;
    }

    public static ijs w() {
        return W;
    }

    public static ijs x() {
        return X;
    }

    private static Function<amo, ijs> a(RenderPipeline $$0) {
        return bhs.b((T $$1) -> ijs.a("weather", ijr.a($$0).a("Sampler0", (amo)$$1).a(ijq.c).a().e()));
    }

    public static ijs f(amo $$0, boolean $$1) {
        return ($$1 ? Y : Z).apply($$0);
    }

    public static ijs A(amo $$0) {
        return aa.apply($$0);
    }

    public static ijs B(amo $$0) {
        return ab.apply($$0);
    }
}

