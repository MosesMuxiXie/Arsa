/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class djy
extends dlp {
    protected static final Map<dzq, dzq> a = new ImmutableMap.Builder().put((Object)dzs.at, (Object)dzs.aB).put((Object)dzs.X, (Object)dzs.aq).put((Object)dzs.az, (Object)dzs.aH).put((Object)dzs.ad, (Object)dzs.ao).put((Object)dzs.u, (Object)dzs.aI).put((Object)dzs.ae, (Object)dzs.ap).put((Object)dzs.ax, (Object)dzs.aF).put((Object)dzs.ab, (Object)dzs.am).put((Object)dzs.ay, (Object)dzs.aG).put((Object)dzs.ac, (Object)dzs.an).put((Object)dzs.av, (Object)dzs.aD).put((Object)dzs.Z, (Object)dzs.ak).put((Object)dzs.aw, (Object)dzs.aE).put((Object)dzs.aa, (Object)dzs.al).put((Object)dzs.au, (Object)dzs.aC).put((Object)dzs.Y, (Object)dzs.aj).put((Object)dzs.ph, (Object)dzs.pi).put((Object)dzs.pj, (Object)dzs.pk).put((Object)dzs.pq, (Object)dzs.pr).put((Object)dzs.ps, (Object)dzs.pt).put((Object)dzs.aA, (Object)dzs.aJ).put((Object)dzs.af, (Object)dzs.ar).put((Object)dzs.ai, (Object)dzs.as).build();

    public djy(dni $$0, float $$1, float $$2, dlp.a $$3) {
        super($$3.b($$0, $$1, $$2));
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        ddm $$3 = $$0.o();
        if (djy.b($$0)) {
            return cdc.e;
        }
        Optional<eoh> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
        if ($$4.isEmpty()) {
            return cdc.e;
        }
        dlt $$5 = $$0.n();
        if ($$3 instanceof axg) {
            aj.O.a((axg)$$3, $$2, $$5);
        }
        $$1.a($$2, $$4.get(), 11);
        $$1.a(etk.c, $$2, etk.a.a($$3, $$4.get()));
        if ($$3 != null) {
            $$5.a(1, (chl)$$3, $$0.p().a());
        }
        return cdc.a;
    }

    private static boolean b(dpw $$0) {
        ddm $$1 = $$0.o();
        return $$0.p().equals((Object)cdb.a) && $$1.fy().c(ki.M) && !$$1.gA();
    }

    private Optional<eoh> a(dwo $$0, is $$12, @Nullable ddm $$2, eoh $$3) {
        Optional<eoh> $$4 = this.a($$3);
        if ($$4.isPresent()) {
            $$0.a((cgk)$$2, $$12, bda.aK, bdb.e, 1.0f, 1.0f);
            return $$4;
        }
        Optional<eoh> $$5 = ejq.b($$3);
        if ($$5.isPresent()) {
            djy.a($$0, $$12, $$2, $$3, bda.aL, 3005);
            return $$5;
        }
        Optional<eoh> $$6 = Optional.ofNullable((dzq)dlk.b.get().get((Object)$$3.b())).map($$1 -> $$1.m($$3));
        if ($$6.isPresent()) {
            djy.a($$0, $$12, $$2, $$3, bda.aM, 3004);
            return $$6;
        }
        return Optional.empty();
    }

    private static void a(dwo $$0, is $$1, @Nullable ddm $$2, eoh $$3, bcz $$4, int $$5) {
        $$0.a((cgk)$$2, $$1, $$4, bdb.e, 1.0f, 1.0f);
        $$0.a((cgk)$$2, $$5, $$1, 0);
        if ($$3.b() instanceof eau && $$3.c(eau.d) != eoz.a) {
            is $$6 = eau.b($$1, $$3);
            $$0.a(etk.c, $$6, etk.a.a($$2, $$0.a_($$6)));
            $$0.a((cgk)$$2, $$5, $$6, 0);
        }
    }

    private Optional<eoh> a(eoh $$0) {
        return Optional.ofNullable(a.get($$0.b())).map($$1 -> (eoh)$$1.m().b(egl.d, $$0.c(egl.d)));
    }
}

