/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ehz
extends dzq
implements ehg {
    public static final MapCodec<ehz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)eoh.a.fieldOf("base_state").forGetter($$0 -> $$0.f), ehz.x()).apply((Applicative)$$02, ehz::new));
    public static final epf<iz> b = edt.f;
    public static final epf<epg> c = eox.ai;
    public static final epf<epr> d = eox.bn;
    public static final eoy e = eox.I;
    private static final fug g = fud.a(dzq.b(16.0, 0.0, 8.0), dzq.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
    private static final fug h = fud.a(g, fud.a(g, f.ab));
    private static final fug i = fud.a(h, fud.a(h, f.ab));
    private static final Map<iz, fug> D = fud.c(g);
    private static final Map<iz, fug> R = fud.c(h);
    private static final Map<iz, fug> S = fud.c(i);
    private static final Map<iz, fug> T = fud.b(g, f.A);
    private static final Map<iz, fug> U = fud.b(h, f.A);
    private static final Map<iz, fug> V = fud.b(i, f.A);
    private final dzq W;
    protected final eoh f;

    public MapCodec<? extends ehz> a() {
        return a;
    }

    protected ehz(eoh $$0, eog.d $$1) {
        super($$1);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, epg.b)).b(d, epr.a)).b(e, false));
        this.W = $$0.b();
        this.f = $$0;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        boolean $$4 = $$0.c(c) == epg.b;
        iz $$5 = $$0.c(b);
        return (switch ($$0.c(d)) {
            default -> throw new MatchException(null, null);
            case epr.a -> {
                if ($$4) {
                    yield R;
                }
                yield U;
            }
            case epr.c, epr.b -> {
                if ($$4) {
                    yield S;
                }
                yield V;
            }
            case epr.d, epr.e -> $$4 ? D : T;
        }).get(switch ($$0.c(d)) {
            default -> throw new MatchException(null, null);
            case epr.a, epr.d, epr.c -> $$5;
            case epr.b -> $$5.i();
            case epr.e -> $$5.h();
        });
    }

    @Override
    public float e() {
        return this.W.e();
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$1 = $$0.k();
        is $$2 = $$0.a();
        flb $$3 = $$0.q().b_($$2);
        eoh $$4 = (eoh)((eoh)((eoh)this.m().b(b, $$0.g())).b(c, $$1 == iz.a || $$1 != iz.b && $$0.l().h - (double)$$2.v() > 0.5 ? epg.a : epg.b)).b(e, $$3.a() == flc.c);
        return (eoh)$$4.b(d, ehz.e($$4, $$0.q(), $$2));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4.o().d()) {
            return (eoh)$$0.b(d, ehz.e($$0, $$1, $$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private static epr e(eoh $$0, dvt $$1, is $$2) {
        iz $$7;
        iz $$5;
        iz $$3 = $$0.c(b);
        eoh $$4 = $$1.a_($$2.a($$3));
        if (ehz.p($$4) && $$0.c(c) == $$4.c(c) && ($$5 = $$4.c(b)).o() != $$0.c(b).o() && ehz.c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
                return epr.d;
            }
            return epr.e;
        }
        eoh $$6 = $$1.a_($$2.a($$3.g()));
        if (ehz.p($$6) && $$0.c(c) == $$6.c(c) && ($$7 = $$6.c(b)).o() != $$0.c(b).o() && ehz.c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
                return epr.b;
            }
            return epr.c;
        }
        return epr.a;
    }

    private static boolean c(eoh $$0, dvt $$1, is $$2, iz $$3) {
        eoh $$4 = $$1.a_($$2.a($$3));
        return !ehz.p($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
    }

    public static boolean p(eoh $$0) {
        return $$0.b() instanceof ehz;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        iz $$2 = $$0.c(b);
        epr $$3 = $$0.c(d);
        switch ($$1) {
            case b: {
                if ($$2.o() != iz.a.c) break;
                switch ($$3) {
                    case b: {
                        return (eoh)$$0.a(egm.c).b(d, epr.c);
                    }
                    case c: {
                        return (eoh)$$0.a(egm.c).b(d, epr.b);
                    }
                    case d: {
                        return (eoh)$$0.a(egm.c).b(d, epr.e);
                    }
                    case e: {
                        return (eoh)$$0.a(egm.c).b(d, epr.d);
                    }
                }
                return $$0.a(egm.c);
            }
            case c: {
                if ($$2.o() != iz.a.a) break;
                switch ($$3) {
                    case b: {
                        return (eoh)$$0.a(egm.c).b(d, epr.b);
                    }
                    case c: {
                        return (eoh)$$0.a(egm.c).b(d, epr.c);
                    }
                    case d: {
                        return (eoh)$$0.a(egm.c).b(d, epr.e);
                    }
                    case e: {
                        return (eoh)$$0.a(egm.c).b(d, epr.d);
                    }
                    case a: {
                        return $$0.a(egm.c);
                    }
                }
                break;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

