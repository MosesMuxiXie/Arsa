/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Predicate;

public interface ka {
    public static final Map<String, a> a = new Object2ObjectArrayMap();
    public static final Codec<a> b = Codec.stringResolver(a::a, a::get);
    public static final a c = ka.a("empty");
    public static final a d = ka.a("water");
    public static final a e = ka.a("lava");
    public static final a f = ka.a("powder_snow");

    public static a a(String $$02) {
        Object2ObjectOpenHashMap $$12 = new Object2ObjectOpenHashMap();
        $$12.defaultReturnValue(($$0, $$1, $$2, $$3, $$4, $$5) -> cdc.f);
        a $$22 = new a($$02, (Map<dlp, ka>)$$12);
        a.put($$02, $$22);
        return $$22;
    }

    public cdc interact(eoh var1, dwo var2, is var3, ddm var4, cdb var5, dlt var6);

    public static void a() {
        Map<dlp, ka> $$03 = c.b();
        ka.a($$03);
        $$03.put(dlx.up, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            dnr $$6 = $$5.a(ki.Y);
            if ($$6 == null || !$$6.a(dns.a)) {
                return cdc.f;
            }
            if (!$$1.B_()) {
                dlp $$7 = $$5.h();
                $$3.a($$4, dlw.a($$5, $$3, new dlt(dlx.uo)));
                $$3.a(bdk.Y);
                $$3.b(bdk.c.b($$7));
                $$1.c($$2, dzs.gj.m());
                $$1.a(null, $$2, bda.cN, bdb.e, 1.0f, 1.0f);
                $$1.a(null, etk.z, $$2);
            }
            return cdc.a;
        });
        Map<dlp, ka> $$12 = d.b();
        ka.a($$12);
        $$12.put(dlx.sk, ($$02, $$1, $$2, $$3, $$4, $$5) -> ka.a($$02, $$1, $$2, $$3, $$4, $$5, new dlt(dlx.sl), $$0 -> $$0.c(eeg.g) == 3, bda.dv));
        $$12.put(dlx.uo, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            if (!$$1.B_()) {
                dlp $$6 = $$5.h();
                $$3.a($$4, dlw.a($$5, $$3, dnr.a(dlx.up, dns.a)));
                $$3.a(bdk.Y);
                $$3.b(bdk.c.b($$6));
                eeg.c($$0, $$1, $$2);
                $$1.a(null, $$2, bda.cO, bdb.e, 1.0f, 1.0f);
                $$1.a(null, etk.y, $$2);
            }
            return cdc.a;
        });
        $$12.put(dlx.up, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
            if ($$0.c(eeg.g) == 3) {
                return cdc.f;
            }
            dnr $$6 = $$5.a(ki.Y);
            if ($$6 == null || !$$6.a(dns.a)) {
                return cdc.f;
            }
            if (!$$1.B_()) {
                $$3.a($$4, dlw.a($$5, $$3, new dlt(dlx.uo)));
                $$3.a(bdk.Y);
                $$3.b(bdk.c.b($$5.h()));
                $$1.c($$2, (eoh)$$0.a(eeg.g));
                $$1.a(null, $$2, bda.cN, bdb.e, 1.0f, 1.0f);
                $$1.a(null, etk.z, $$2);
            }
            return cdc.a;
        });
        $$12.put(dlx.rh, ka::f);
        $$12.put(dlx.rg, ka::f);
        $$12.put(dlx.rf, ka::f);
        $$12.put(dlx.re, ka::f);
        $$12.put(dlx.wY, ka::f);
        $$12.put(dlx.pS, ka::f);
        $$12.put(dlx.xe, ka::e);
        $$12.put(dlx.xl, ka::e);
        $$12.put(dlx.xt, ka::e);
        $$12.put(dlx.xp, ka::e);
        $$12.put(dlx.xq, ka::e);
        $$12.put(dlx.xn, ka::e);
        $$12.put(dlx.xr, ka::e);
        $$12.put(dlx.xh, ka::e);
        $$12.put(dlx.xm, ka::e);
        $$12.put(dlx.xj, ka::e);
        $$12.put(dlx.xg, ka::e);
        $$12.put(dlx.xf, ka::e);
        $$12.put(dlx.xk, ka::e);
        $$12.put(dlx.xo, ka::e);
        $$12.put(dlx.xs, ka::e);
        $$12.put(dlx.xi, ka::e);
        $$12.put(dlx.jW, ka::d);
        $$12.put(dlx.kd, ka::d);
        $$12.put(dlx.kl, ka::d);
        $$12.put(dlx.kh, ka::d);
        $$12.put(dlx.ki, ka::d);
        $$12.put(dlx.kf, ka::d);
        $$12.put(dlx.kj, ka::d);
        $$12.put(dlx.jZ, ka::d);
        $$12.put(dlx.ke, ka::d);
        $$12.put(dlx.kb, ka::d);
        $$12.put(dlx.jY, ka::d);
        $$12.put(dlx.jX, ka::d);
        $$12.put(dlx.kc, ka::d);
        $$12.put(dlx.kg, ka::d);
        $$12.put(dlx.kk, ka::d);
        $$12.put(dlx.ka, ka::d);
        Map<dlp, ka> $$22 = e.b();
        $$22.put(dlx.sk, ($$02, $$1, $$2, $$3, $$4, $$5) -> ka.a($$02, $$1, $$2, $$3, $$4, $$5, new dlt(dlx.sm), $$0 -> true, bda.dy));
        ka.a($$22);
        Map<dlp, ka> $$32 = f.b();
        $$32.put(dlx.sk, ($$02, $$1, $$2, $$3, $$4, $$5) -> ka.a($$02, $$1, $$2, $$3, $$4, $$5, new dlt(dlx.sn), $$0 -> $$0.c(eeg.g) == 3, bda.dz));
        ka.a($$32);
    }

    public static void a(Map<dlp, ka> $$0) {
        $$0.put(dlx.sm, ka::b);
        $$0.put(dlx.sl, ka::a);
        $$0.put(dlx.sn, ka::c);
    }

    public static cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5, dlt $$6, Predicate<eoh> $$7, bcz $$8) {
        if (!$$7.test($$0)) {
            return cdc.f;
        }
        if (!$$1.B_()) {
            dlp $$9 = $$5.h();
            $$3.a($$4, dlw.a($$5, $$3, $$6));
            $$3.a(bdk.Y);
            $$3.b(bdk.c.b($$9));
            $$1.c($$2, dzs.gi.m());
            $$1.a(null, $$2, $$8, bdb.e, 1.0f, 1.0f);
            $$1.a(null, etk.y, $$2);
        }
        return cdc.a;
    }

    public static cdc a(dwo $$0, is $$1, ddm $$2, cdb $$3, dlt $$4, eoh $$5, bcz $$6) {
        if (!$$0.B_()) {
            dlp $$7 = $$4.h();
            $$2.a($$3, dlw.a($$4, $$2, new dlt(dlx.sk)));
            $$2.a(bdk.X);
            $$2.b(bdk.c.b($$7));
            $$0.c($$1, $$5);
            $$0.a(null, $$1, $$6, bdb.e, 1.0f, 1.0f);
            $$0.a(null, etk.z, $$1);
        }
        return cdc.a;
    }

    private static cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        return ka.a($$1, $$2, $$3, $$4, $$5, (eoh)dzs.gj.m().b(eeg.g, 3), bda.dp);
    }

    private static cdc b(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        return ka.a($$1, $$2) ? cdc.c : ka.a($$1, $$2, $$3, $$4, $$5, dzs.gk.m(), bda.ds);
    }

    private static cdc c(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        return ka.a($$1, $$2) ? cdc.c : ka.a($$1, $$2, $$3, $$4, $$5, (eoh)dzs.gl.m().b(eeg.g, 3), bda.dt);
    }

    private static cdc d(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        dzq $$6 = dzq.a($$5.h());
        if (!($$6 instanceof ehd)) {
            return cdc.f;
        }
        if (!$$1.B_()) {
            dlt $$7 = $$5.a(dzs.lL, 1);
            $$3.a($$4, dlw.a($$5, $$3, $$7, false));
            $$3.a(bdk.ab);
            eeg.c($$0, $$1, $$2);
        }
        return cdc.a;
    }

    private static cdc e(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        ekr $$6 = $$5.a(ki.at, ekr.a);
        if ($$6.b().isEmpty()) {
            return cdc.f;
        }
        if (!$$1.B_()) {
            dlt $$7 = $$5.c(1);
            $$7.b(ki.at, $$6.a());
            $$3.a($$4, dlw.a($$5, $$3, $$7, false));
            $$3.a(bdk.aa);
            eeg.c($$0, $$1, $$2);
        }
        return cdc.a;
    }

    private static cdc f(eoh $$0, dwo $$1, is $$2, ddm $$3, cdb $$4, dlt $$5) {
        if (!$$5.a(bdy.cj)) {
            return cdc.f;
        }
        if (!$$5.c(ki.R)) {
            return cdc.f;
        }
        if (!$$1.B_()) {
            $$5.e(ki.R);
            $$3.a(bdk.Z);
            eeg.c($$0, $$1, $$2);
        }
        return cdc.a;
    }

    private static boolean a(dwo $$0, is $$1) {
        flb $$2 = $$0.b_($$1.d());
        return $$2.a(bdv.a);
    }

    public record a(String a, Map<dlp, ka> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;map", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;map", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;map", "a", "b"}, this, $$0);
        }
    }
}

