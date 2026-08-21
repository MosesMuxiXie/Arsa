/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class gib {
    private final Map<gic, amo> a = Maps.newHashMap();
    private final Set<gic> b = Sets.newHashSet();

    public gib a(gic $$0, amo $$1) {
        this.a.put($$0, $$1);
        return this;
    }

    public gib b(gic $$0, amo $$1) {
        this.a.put($$0, $$1);
        this.b.add($$0);
        return this;
    }

    public Stream<gic> a() {
        return this.b.stream();
    }

    public gib a(gic $$0, gic $$1) {
        this.a.put($$1, this.a.get($$0));
        return this;
    }

    public gib b(gic $$0, gic $$1) {
        this.a.put($$1, this.a.get($$0));
        this.b.add($$1);
        return this;
    }

    public amo a(gic $$0) {
        for (gic $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
            amo $$2 = this.a.get($$1);
            if ($$2 == null) continue;
            return $$2;
        }
        throw new IllegalStateException("Can't find texture for slot " + String.valueOf($$0));
    }

    public gib c(gic $$0, amo $$1) {
        gib $$2 = new gib();
        $$2.a.putAll(this.a);
        $$2.b.addAll(this.b);
        $$2.a($$0, $$1);
        return $$2;
    }

    public static gib a(dzq $$0) {
        amo $$1 = gib.K($$0);
        return gib.b($$1);
    }

    public static gib b(dzq $$0) {
        amo $$1 = gib.K($$0);
        return gib.a($$1);
    }

    public static gib a(amo $$0) {
        return new gib().a(gic.b, $$0);
    }

    public static gib b(amo $$0) {
        return new gib().a(gic.a, $$0);
    }

    public static gib c(dzq $$0) {
        return gib.d(gic.p, gib.K($$0));
    }

    public static gib d(dzq $$0) {
        return gib.d(gic.i, gib.K($$0));
    }

    public static gib e(dzq $$0) {
        return new gib().a(gic.p, gib.K($$0)).a(gic.q, gib.a($$0, "_emissive"));
    }

    public static gib c(amo $$0) {
        return gib.d(gic.p, $$0);
    }

    public static gib f(dzq $$0) {
        return gib.d(gic.r, gib.K($$0));
    }

    public static gib g(dzq $$0) {
        return new gib().a(gic.r, gib.K($$0)).a(gic.q, gib.a($$0, "_emissive"));
    }

    public static gib d(amo $$0) {
        return gib.d(gic.r, $$0);
    }

    public static gib h(dzq $$0) {
        return gib.d(gic.t, gib.K($$0));
    }

    public static gib e(amo $$0) {
        return gib.d(gic.t, $$0);
    }

    public static gib i(dzq $$0) {
        return gib.d(gic.u, gib.K($$0));
    }

    public static gib j(dzq $$0) {
        return new gib().a(gic.Q, gib.K($$0)).a(gic.z, gib.a($$0, "_stem"));
    }

    public static gib f(amo $$0) {
        return gib.d(gic.u, $$0);
    }

    public static gib k(dzq $$0) {
        return gib.d(gic.z, gib.K($$0));
    }

    public static gib a(dzq $$0, dzq $$1) {
        return new gib().a(gic.z, gib.K($$0)).a(gic.A, gib.K($$1));
    }

    public static gib l(dzq $$0) {
        return gib.d(gic.v, gib.K($$0));
    }

    public static gib m(dzq $$0) {
        return gib.d(gic.y, gib.K($$0));
    }

    public static gib g(amo $$0) {
        return gib.d(gic.B, $$0);
    }

    public static gib b(dzq $$0, dzq $$1) {
        return new gib().a(gic.w, gib.K($$0)).a(gic.x, gib.a($$1, "_top"));
    }

    public static gib d(gic $$0, amo $$1) {
        return new gib().a($$0, $$1);
    }

    public static gib n(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.d, gib.a($$0, "_top"));
    }

    public static gib o(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.f, gib.a($$0, "_top"));
    }

    public static gib p(dzq $$0) {
        return new gib().a(gic.r, gib.a($$0, "_plant")).a(gic.i, gib.a($$0, "_side")).a(gic.f, gib.a($$0, "_top"));
    }

    public static gib q(dzq $$0) {
        return new gib().a(gic.i, gib.K($$0)).a(gic.d, gib.a($$0, "_top")).a(gic.c, gib.K($$0));
    }

    public static gib a(amo $$0, amo $$1) {
        return new gib().a(gic.i, $$0).a(gic.d, $$1);
    }

    public static gib r(dzq $$0) {
        return new gib().a(gic.b, gib.K($$0)).a(gic.i, gib.a($$0, "_side")).a(gic.f, gib.a($$0, "_top"));
    }

    public static gib s(dzq $$0) {
        return new gib().a(gic.b, gib.K($$0)).a(gic.c, gib.a($$0, "_particle"));
    }

    public static gib t(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.f, gib.a($$0, "_top")).a(gic.e, gib.a($$0, "_bottom"));
    }

    public static gib u(dzq $$0) {
        amo $$1 = gib.K($$0);
        return new gib().a(gic.s, $$1).a(gic.i, $$1).a(gic.f, gib.a($$0, "_top")).a(gic.e, gib.a($$0, "_bottom"));
    }

    public static gib v(dzq $$0) {
        amo $$1 = gib.K($$0);
        return new gib().a(gic.b, $$1).a(gic.s, $$1).a(gic.i, $$1).a(gic.d, gib.a($$0, "_top"));
    }

    public static gib b(amo $$0, amo $$1) {
        return new gib().a(gic.f, $$0).a(gic.e, $$1);
    }

    public static gib w(dzq $$0) {
        return new gib().a(gic.f, gib.a($$0, "_top")).a(gic.e, gib.a($$0, "_bottom"));
    }

    public static gib x(dzq $$0) {
        return new gib().a(gic.c, gib.K($$0));
    }

    public static gib h(amo $$0) {
        return new gib().a(gic.c, $$0);
    }

    public static gib y(dzq $$0) {
        return new gib().a(gic.D, gib.a($$0, "_0"));
    }

    public static gib z(dzq $$0) {
        return new gib().a(gic.D, gib.a($$0, "_1"));
    }

    public static gib A(dzq $$0) {
        return new gib().a(gic.E, gib.K($$0));
    }

    public static gib B(dzq $$0) {
        return new gib().a(gic.H, gib.K($$0));
    }

    public static gib i(amo $$0) {
        return new gib().a(gic.H, $$0);
    }

    public static gib a(dzq $$0, String $$1, String $$2) {
        return new gib().a(gic.i, gib.a($$0, $$1)).a(gic.f, gib.a($$0, $$2)).a(gic.e, gib.a($$0, "_bottom"));
    }

    public static gib a(dzq $$0, String $$1, String $$2, String $$3, String $$4) {
        return new gib().a(gic.g, gib.a($$0, $$1)).a(gic.i, gib.a($$0, $$2)).a(gic.f, gib.a($$0, $$3)).a(gic.e, gib.a($$0, $$4));
    }

    public static gib a(dlp $$0) {
        return new gib().a(gic.c, gib.c($$0));
    }

    public static gib C(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.g, gib.a($$0, "_front")).a(gic.h, gib.a($$0, "_back"));
    }

    public static gib D(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.g, gib.a($$0, "_front")).a(gic.f, gib.a($$0, "_top")).a(gic.e, gib.a($$0, "_bottom"));
    }

    public static gib E(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.g, gib.a($$0, "_front")).a(gic.f, gib.a($$0, "_top"));
    }

    public static gib F(dzq $$0) {
        return new gib().a(gic.i, gib.a($$0, "_side")).a(gic.g, gib.a($$0, "_front")).a(gic.d, gib.a($$0, "_end"));
    }

    public static gib G(dzq $$0) {
        return new gib().a(gic.f, gib.a($$0, "_top"));
    }

    public static gib c(dzq $$0, dzq $$1) {
        return new gib().a(gic.c, gib.a($$0, "_front")).a(gic.o, gib.K($$1)).a(gic.n, gib.a($$0, "_top")).a(gic.j, gib.a($$0, "_front")).a(gic.l, gib.a($$0, "_side")).a(gic.k, gib.a($$0, "_side")).a(gic.m, gib.a($$0, "_front"));
    }

    public static gib d(dzq $$0, dzq $$1) {
        return new gib().a(gic.c, gib.a($$0, "_front")).a(gic.o, gib.K($$1)).a(gic.n, gib.a($$0, "_top")).a(gic.j, gib.a($$0, "_front")).a(gic.k, gib.a($$0, "_front")).a(gic.l, gib.a($$0, "_side")).a(gic.m, gib.a($$0, "_side"));
    }

    public static gib a(String $$0) {
        return new gib().a(gic.c, gib.a(dzs.nc, $$0 + "_north")).a(gic.e, gib.a(dzs.nc, $$0 + "_bottom")).a(gic.f, gib.a(dzs.nc, $$0 + "_top")).a(gic.j, gib.a(dzs.nc, $$0 + "_north")).a(gic.k, gib.a(dzs.nc, $$0 + "_south")).a(gic.l, gib.a(dzs.nc, $$0 + "_east")).a(gic.m, gib.a(dzs.nc, $$0 + "_west"));
    }

    public static gib b(String $$0) {
        return new gib().a(gic.c, gib.a(dzs.nd, $$0 + "_north")).a(gic.e, gib.a(dzs.nd, $$0 + "_bottom")).a(gic.f, gib.a(dzs.nd, $$0 + "_top")).a(gic.j, gib.a(dzs.nd, $$0 + "_north")).a(gic.k, gib.a(dzs.nd, $$0 + "_south")).a(gic.l, gib.a(dzs.nd, $$0 + "_east")).a(gic.m, gib.a(dzs.nd, $$0 + "_west")).a(gic.R, gib.a(dzs.nd, $$0 + "_tentacles"));
    }

    public static gib H(dzq $$0) {
        return new gib().a(gic.L, gib.a($$0, "_log_lit")).a(gic.D, gib.a($$0, "_fire"));
    }

    public static gib a(dzq $$0, boolean $$1) {
        return new gib().a(gic.c, gib.a(dzs.eL, "_side")).a(gic.e, gib.a(dzs.eL, "_bottom")).a(gic.f, gib.a(dzs.eL, "_top")).a(gic.i, gib.a(dzs.eL, "_side")).a(gic.M, gib.a($$0, $$1 ? "_lit" : ""));
    }

    public static gib j(amo $$0) {
        return new gib().a(gic.c, gib.a(dzs.gi, "_side")).a(gic.i, gib.a(dzs.gi, "_side")).a(gic.f, gib.a(dzs.gi, "_top")).a(gic.e, gib.a(dzs.gi, "_bottom")).a(gic.N, gib.a(dzs.gi, "_inner")).a(gic.O, $$0);
    }

    public static gib a(boolean $$0) {
        String $$1 = $$0 ? "_can_summon" : "";
        return new gib().a(gic.c, gib.a(dzs.rV, "_bottom")).a(gic.i, gib.a(dzs.rV, "_side")).a(gic.f, gib.a(dzs.rV, "_top")).a(gic.P, gib.a(dzs.rV, $$1 + "_inner_top")).a(gic.e, gib.a(dzs.rV, "_bottom"));
    }

    public static gib I(dzq $$0) {
        return new gib().a(gic.S, gib.K($$0)).a(gic.x, gib.K($$0));
    }

    public static gib b(dlp $$0) {
        return new gib().a(gic.I, gib.c($$0));
    }

    public static gib J(dzq $$0) {
        return new gib().a(gic.I, gib.K($$0));
    }

    public static gib k(amo $$0) {
        return new gib().a(gic.I, $$0);
    }

    public static gib c(amo $$0, amo $$1) {
        return new gib().a(gic.I, $$0).a(gic.J, $$1);
    }

    public static gib a(amo $$0, amo $$1, amo $$2) {
        return new gib().a(gic.I, $$0).a(gic.J, $$1).a(gic.K, $$2);
    }

    public static amo K(dzq $$0) {
        amo $$1 = mi.e.b($$0);
        return $$1.f("block/");
    }

    public static amo a(dzq $$0, String $$12) {
        amo $$2 = mi.e.b($$0);
        return $$2.a($$1 -> "block/" + $$1 + $$12);
    }

    public static amo c(dlp $$0) {
        amo $$1 = mi.h.b($$0);
        return $$1.f("item/");
    }

    public static amo a(dlp $$0, String $$12) {
        amo $$2 = mi.h.b($$0);
        return $$2.a($$1 -> "item/" + $$1 + $$12);
    }
}

