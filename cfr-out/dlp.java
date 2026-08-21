/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dlp
implements dgw,
dwn {
    public static final Codec<jd<dlp>> e = mi.h.r().validate($$0 -> $$0.a(dlx.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success((Object)$$0));
    public static final aao<xq, jd<dlp>> f = aam.b(mj.R);
    private static final Logger a = LogUtils.getLogger();
    public static final Map<dzq, dlp> g = Maps.newHashMap();
    public static final amo h = amo.b("base_attack_damage");
    public static final amo i = amo.b("base_attack_speed");
    public static final int j = 64;
    public static final int k = 99;
    public static final int l = 13;
    protected static final int m = 72000;
    private final jd.c<dlp> b = mi.h.f(this);
    private final kf c;
    private final @Nullable dlp d;
    protected final String n;
    private final dgz o;

    public static int a(dlp $$0) {
        return $$0 == null ? 0 : mi.h.a($$0);
    }

    public static dlp b(int $$0) {
        return mi.h.a($$0);
    }

    @Deprecated
    public static dlp a(dzq $$0) {
        return g.getOrDefault($$0, dlx.a);
    }

    public dlp(a $$0) {
        String $$1;
        this.n = $$0.d();
        this.c = $$0.a(yh.c(this.n), $$0.e());
        this.d = $$0.d;
        this.o = $$0.e;
        if (w.aX && !($$1 = this.getClass().getSimpleName()).endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", (Object)$$1);
        }
    }

    @Deprecated
    public jd.c<dlp> e() {
        return this.b;
    }

    public kf f() {
        return this.c;
    }

    public int g() {
        return this.c.a(ki.c, 1);
    }

    public void a(dwo $$0, chl $$1, dlt $$2, int $$3) {
    }

    public void a(czl $$0) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(dlt $$0, eoh $$1, dwo $$2, is $$3, chl $$4) {
        dpc $$5 = $$0.a(ki.D);
        if ($$5 == null) return true;
        if ($$5.d()) return true;
        if (!($$4 instanceof ddm)) return true;
        ddm $$6 = (ddm)$$4;
        if ($$6.gL().d) return false;
        return true;
    }

    @Override
    public dlp h() {
        return this;
    }

    public cdc a(dpw $$0) {
        return cdc.e;
    }

    public float a(dlt $$0, eoh $$1) {
        dpc $$2 = $$0.a(ki.D);
        return $$2 != null ? $$2.a($$1) : 1.0f;
    }

    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        dob $$4 = $$3.a(ki.z);
        if ($$4 != null) {
            return $$4.a($$1, $$3, $$2);
        }
        dun $$5 = $$3.a(ki.H);
        if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
        }
        if ($$3.c(ki.M)) {
            $$1.c($$2);
            return cdc.c;
        }
        doq $$6 = $$3.a(ki.O);
        if ($$6 != null) {
            $$1.c($$2);
            $$6.b($$1);
            return cdc.c;
        }
        return cdc.e;
    }

    public dlt a(dlt $$0, dwo $$1, chl $$2) {
        dob $$3 = $$0.a(ki.z);
        if ($$3 != null) {
            return $$3.a($$1, $$2, $$0);
        }
        return $$0;
    }

    public boolean d(dlt $$0) {
        return $$0.n();
    }

    public int e(dlt $$0) {
        return bgj.a(Math.round(13.0f - (float)$$0.o() * 13.0f / (float)$$0.p()), 0, 13);
    }

    public int f(dlt $$0) {
        int $$1 = $$0.p();
        float $$2 = Math.max(0.0f, ((float)$$1 - (float)$$0.o()) / (float)$$1);
        return bgj.g($$2 / 3.0f, 1.0f, 1.0f);
    }

    public boolean a(dlt $$0, dji $$1, dht $$2, ddm $$3) {
        return false;
    }

    public boolean a(dlt $$0, dlt $$1, dji $$2, dht $$3, ddm $$4, cic $$5) {
        return false;
    }

    public float a(cgk $$0, float $$1, cex $$2) {
        return 0.0f;
    }

    @Deprecated
    public @Nullable cex a(chl $$0) {
        return null;
    }

    public void a(dlt $$0, chl $$1, chl $$2) {
    }

    public void b(dlt $$0, chl $$1, chl $$2) {
    }

    public boolean a(dlt $$0, dwo $$1, eoh $$2, is $$3, chl $$4) {
        dpc $$5 = $$0.a(ki.D);
        if ($$5 == null) {
            return false;
        }
        if (!$$1.B_() && $$2.e($$1, $$3) != 0.0f && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, cgv.a);
        }
        return true;
    }

    public boolean b(dlt $$0, eoh $$1) {
        dpc $$2 = $$0.a(ki.D);
        return $$2 != null && $$2.b($$1);
    }

    public cdc a(dlt $$0, ddm $$1, chl $$2, cdb $$3) {
        return cdc.e;
    }

    public String toString() {
        return mi.h.e(this).g();
    }

    public final dlt i() {
        return this.d == null ? dlt.l : new dlt(this.d);
    }

    public void a(dlt $$0, axf $$1, cgk $$2, @Nullable cgv $$3) {
    }

    public void c(dlt $$0, ddm $$1) {
        this.a($$0, $$1.ao());
    }

    public void a(dlt $$0, dwo $$1) {
    }

    public dlv b(dlt $$0) {
        dob $$1 = $$0.a(ki.z);
        if ($$1 != null) {
            return $$1.d();
        }
        if ($$0.c(ki.M)) {
            return dlv.d;
        }
        if ($$0.c(ki.O)) {
            return dlv.l;
        }
        return dlv.a;
    }

    public int a(dlt $$0, chl $$1) {
        dob $$2 = $$0.a(ki.z);
        if ($$2 != null) {
            return $$2.a();
        }
        if ($$0.c(ki.M) || $$0.c(ki.O)) {
            return 72000;
        }
        return 0;
    }

    public boolean a(dlt $$0, dwo $$1, chl $$2, int $$3) {
        return false;
    }

    @Deprecated
    public void a(dlt $$0, b $$1, dpd $$2, Consumer<yh> $$3, dnj $$4) {
    }

    public Optional<djs> k(dlt $$0) {
        return Optional.empty();
    }

    @VisibleForTesting
    public final String j() {
        return this.n;
    }

    public final yh l() {
        return this.c.a(ki.k, yg.a);
    }

    public yh a(dlt $$0) {
        return $$0.a().a(ki.k, yg.a);
    }

    public boolean d_(dlt $$0) {
        return $$0.F();
    }

    protected static fti a(dwo $$0, ddm $$1, dvw.b $$2) {
        ftm $$3 = $$1.bV();
        ftm $$4 = $$3.e($$1.c($$1.ee(), $$1.ec()).c($$1.hm()));
        return $$0.a(new dvw($$3, $$4, dvw.a.b, $$2, $$1));
    }

    public boolean e_(dlt $$0) {
        return false;
    }

    public dlt m() {
        return new dlt(this);
    }

    public boolean d() {
        return true;
    }

    @Override
    public dgz k() {
        return this.o;
    }

    public boolean a(dlt $$0, @Nullable ddm $$1) {
        return false;
    }

    public static class a {
        private static final aml<dlp, String> a = $$0 -> bhs.a("block", $$0.a());
        private static final aml<dlp, String> b = $$0 -> bhs.a("item", $$0.a());
        private final kf.a c = kf.a().a(ki.bb);
        @Nullable dlp d;
        dgz e = dhb.g;
        private @Nullable amt<dlp> f;
        private aml<dlp, String> g = b;
        private final aml<dlp, amo> h = amt::a;

        public a a(dhf $$0) {
            return this.a($$0, dod.a);
        }

        public a a(dhf $$0, dob $$1) {
            return this.a(ki.y, $$0).a(ki.z, $$1);
        }

        public a a(dlp $$0) {
            return this.a(ki.A, new dpi(new dlt($$0)));
        }

        public a a(float $$0) {
            return this.a(ki.B, new dpg($$0));
        }

        public a a(int $$0) {
            return this.a(ki.c, $$0);
        }

        public a b(int $$0) {
            this.a(ki.d, $$0);
            this.a(ki.c, 1);
            this.a(ki.e, 0);
            return this;
        }

        public a b(dlp $$0) {
            this.d = $$0;
            return this;
        }

        public a a(dmp $$0) {
            return this.a(ki.n, $$0);
        }

        public a a() {
            return this.a(ki.C, new dog(bdq.i));
        }

        public a a(amt<dlz> $$0) {
            return this.a(ki.al, new dly(new dku<dlz>($$0)));
        }

        public a c(int $$0) {
            return this.a(ki.G, new dsm($$0));
        }

        public a c(dlp $$0) {
            return this.a(ki.I, new dsw(jh.a($$0.e())));
        }

        public a a(bef<dlp> $$0) {
            je<dlp> $$1 = mi.a(mi.h);
            return this.a(ki.I, new dsw($$1.b($$0)));
        }

        public a a(cgv $$0) {
            return this.a(ki.H, dun.a($$0).a());
        }

        public a b(cgv $$0) {
            return this.a(ki.H, dun.a($$0).b(false).a());
        }

        public a a(dni $$0, bef<dzq> $$1, float $$2, float $$3, float $$4) {
            return $$0.a(this, $$1, $$2, $$3, $$4);
        }

        public a a(dni $$0, float $$1, float $$2) {
            return this.a($$0, bdp.bP, $$1, $$2, 0.0f);
        }

        public a b(dni $$0, float $$1, float $$2) {
            return this.a($$0, bdp.bN, $$1, $$2, 5.0f);
        }

        public a c(dni $$0, float $$1, float $$2) {
            return this.a($$0, bdp.bO, $$1, $$2, 0.0f);
        }

        public a d(dni $$0, float $$1, float $$2) {
            return this.a($$0, bdp.bQ, $$1, $$2, 0.0f);
        }

        public a e(dni $$0, float $$1, float $$2) {
            return $$0.a(this, $$1, $$2);
        }

        public a a(dni $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            return this.b($$0.b()).a($$0.f()).c($$0.e()).a(ki.j, new dku<cez>(cfa.E)).a(ki.O, new doq(10, (int)($$3 * 20.0f), doq.a.a((int)($$4 * 20.0f), $$5), doq.a.a((int)($$6 * 20.0f), $$7), doq.a.b((int)($$8 * 20.0f), $$9), 0.38f, $$2, Optional.of($$0 == dni.a ? bda.Bg : bda.Bd), Optional.of($$0 == dni.a ? bda.Bh : bda.Be))).a(ki.N, new dow(true, false, Optional.of($$0 == dni.a ? bda.Bi : bda.Bf), Optional.of($$0 == dni.a ? bda.Bh : bda.Be))).a(ki.F, new dnu(2.0f, 4.5f, 2.0f, 6.5f, 0.125f, 0.5f)).a(ki.i, Float.valueOf(1.0f)).a(ki.P, new dpb(dnf.c, (int)($$1 * 20.0f))).a(don.a().a(cis.d, new ciq(h, 0.0f + $$0.d(), ciq.a.a), cgw.b).a(cis.f, new ciq(i, (double)(1.0f / $$1) - 4.0, ciq.a.a), cgw.b).a()).a(ki.g, new dph(true, false, 1.0f)).a(ki.E, new dpj(1));
        }

        public a a(cgu<?> $$0) {
            return this.a(ki.af, dpf.a($$0, new uz()));
        }

        public a a(dui $$0, duk $$1) {
            return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(ki.H, dun.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
        }

        public a a(dui $$0) {
            return this.b(duk.e.a($$0.a())).a($$0.a(duk.e)).a($$0.g()).a(ki.H, dun.a(cgv.g).a($$0.d()).a($$0.h()).a(jh.a(cgu.bU.r())).e(true).b(mi.b.e(bda.aA)).a()).a(ki.aB, bda.Gb).a(1);
        }

        public a b(dui $$0) {
            je<cgu<?>> $$1 = mi.a(mi.g);
            return this.a($$0.a(duk.e)).a(ki.H, dun.a(cgv.g).a(bda.oG).a($$0.h()).a($$1.b(bdt.M)).c(false).e(true).b(bda.oH).a()).a(1);
        }

        public a c(dui $$0) {
            je<cgu<?>> $$1 = mi.a(mi.g);
            return this.a($$0.a(duk.e)).a(ki.H, dun.a(cgv.g).a(bda.aB).a($$0.h()).a($$1.b(bdt.N)).c(false).d(true).e(true).b(bda.aC).a()).a(1);
        }

        public a b(amt<dur> $$0) {
            return this.a(ki.aj, new dox($$0));
        }

        public a a(dgx ... $$0) {
            this.e = dhb.e.a($$0);
            return this;
        }

        public a c(amt<dlp> $$0) {
            this.f = $$0;
            return this;
        }

        public a a(String $$0) {
            this.g = aml.fixed($$0);
            return this;
        }

        public a b() {
            this.g = a;
            return this;
        }

        public a c() {
            this.g = b;
            return this;
        }

        protected String d() {
            return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
        }

        public amo e() {
            return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
        }

        public <T> a a(kh<T> $$0, T $$1) {
            this.c.a($$0, $$1);
            return this;
        }

        public a a(don $$0) {
            return this.a(ki.r, $$0);
        }

        kf a(yh $$0, amo $$1) {
            kf $$2 = this.c.a(ki.k, $$0).a(ki.l, $$1).a();
            if ($$2.c(ki.e) && $$2.a(ki.c, 1) > 1) {
                throw new IllegalStateException("Item cannot have both durability and be stackable");
            }
            return $$2;
        }
    }

    public static interface b {
        public static final b a = new b(){

            @Override
            public @Nullable jf.a a() {
                return null;
            }

            @Override
            public float b() {
                return 20.0f;
            }

            @Override
            public @Nullable fmw a(fmu $$0) {
                return null;
            }

            @Override
            public boolean c() {
                return false;
            }
        };

        public @Nullable jf.a a();

        public float b();

        public @Nullable fmw a(fmu var1);

        public boolean c();

        public static b a(final @Nullable dwo $$0) {
            if ($$0 == null) {
                return a;
            }
            return new b(){

                @Override
                public jf.a a() {
                    return $$0.J_();
                }

                @Override
                public float b() {
                    return $$0.y().f();
                }

                @Override
                public fmw a(fmu $$02) {
                    return $$0.a($$02);
                }

                @Override
                public boolean c() {
                    return $$0.av() == ccz.a;
                }
            };
        }

        public static b a(final jf.a $$0) {
            return new b(){

                @Override
                public jf.a a() {
                    return $$0;
                }

                @Override
                public float b() {
                    return 20.0f;
                }

                @Override
                public @Nullable fmw a(fmu $$02) {
                    return null;
                }

                @Override
                public boolean c() {
                    return false;
                }
            };
        }
    }
}
