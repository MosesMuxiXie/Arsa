/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class grt {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<dis<?>, a<?, ?>> b = Maps.newHashMap();

    public static <T extends dhi> void a(dis<T> $$0, gfj $$1, int $$2, yh $$3) {
        a<T, ?> $$4 = grt.a($$0);
        if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", (Object)mi.q.b($$0));
            return;
        }
        $$4.a($$3, $$0, $$1, $$2);
    }

    private static <T extends dhi> @Nullable a<T, ?> a(dis<T> $$0) {
        return b.get($$0);
    }

    private static <M extends dhi, U extends gsb> void a(dis<? extends M> $$0, a<M, U> $$1) {
        a<M, U> $$2 = b.put($$0, $$1);
        if ($$2 != null) {
            throw new IllegalStateException("Duplicate registration for " + String.valueOf(mi.q.b($$0)));
        }
    }

    public static boolean a() {
        boolean $$0 = false;
        for (dis dis2 : mi.q) {
            if (b.containsKey(dis2)) continue;
            a.debug("Menu {} has no matching screen", (Object)mi.q.b(dis2));
            $$0 = true;
        }
        return $$0;
    }

    static {
        grt.a(dis.a, gtw::new);
        grt.a(dis.b, gtw::new);
        grt.a(dis.c, gtw::new);
        grt.a(dis.d, gtw::new);
        grt.a(dis.e, gtw::new);
        grt.a(dis.f, gtw::new);
        grt.a(dis.g, guc::new);
        grt.a(dis.h, gtx::new);
        grt.a(dis.i, gtn::new);
        grt.a(dis.j, gto::new);
        grt.a(dis.k, gtp::new);
        grt.a(dis.l, gtt::new);
        grt.a(dis.m, gty::new);
        grt.a(dis.n, guf::new);
        grt.a(dis.o, gug::new);
        grt.a(dis.p, guh::new);
        grt.a(dis.q, guj::new);
        grt.a(dis.r, guo::new);
        grt.a(dis.s, gup::new);
        grt.a(dis.t, gur::new);
        grt.a(dis.u, guv::new);
        grt.a(dis.v, gux::new);
        grt.a(dis.w, guy::new);
        grt.a(dis.x, gtu::new);
        grt.a(dis.y, guz::new);
    }

    static interface a<T extends dhi, U extends gsb> {
        default public void a(yh $$0, dis<T> $$1, gfj $$2, int $$3) {
            U $$4 = this.create($$1.a($$3, $$2.s.gK()), $$2.s.gK(), $$0);
            $$2.s.cn = ((guq)$$4).F();
            $$2.a((gsb)$$4);
        }

        public U create(T var1, ddl var2, yh var3);
    }
}

