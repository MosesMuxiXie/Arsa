/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class ebz
extends dzq {
    public static final MapCodec<ebz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)eow.a.fieldOf("block_set_type").forGetter(ebz::b), ebz.x()).apply((Applicative)$$0, ebz::new));
    public static final epf<iz> b = edt.f;
    public static final epf<epd> c = eox.ah;
    public static final epf<epc> d = eox.bj;
    public static final eoy e = eox.y;
    public static final eoy f = eox.A;
    private static final Map<iz, fug> g = fud.c(dzq.c(16.0, 13.0, 16.0));
    private final eow h;

    public MapCodec<? extends ebz> a() {
        return a;
    }

    protected ebz(eow $$0, eog.d $$1) {
        super($$1.a($$0.g()));
        this.h = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(e, false)).b(d, epc.a)).b(f, false)).b(c, epd.b));
    }

    public eow b() {
        return this.h;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        iz $$4 = $$0.c(b);
        iz $$5 = $$0.c(e).booleanValue() ? ($$0.c(d) == epc.b ? $$4.i() : $$4.h()) : $$4;
        return g.get($$5);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        epd $$8 = $$0.c(c);
        if ($$4.o() == iz.a.b && $$8 == epd.b == ($$4 == iz.b)) {
            if ($$6.b() instanceof ebz && $$6.c(c) != $$8) {
                return (eoh)$$6.b(c, $$8);
            }
            return dzs.a.m();
        }
        if ($$8 == epd.b && $$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g() && $$0.c(c) == epd.b && this.h.d() && !$$0.c(f).booleanValue()) {
            this.a(null, (dwo)$$1, $$0, $$2, !this.n($$0));
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if (!($$0.B_() || !$$3.gM() && $$3.d($$2))) {
            ecb.b($$0, $$1, $$2, $$3);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return switch ($$1) {
            default -> throw new MatchException(null, null);
            case flq.a, flq.c -> $$0.c(e);
            case flq.b -> false;
        };
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        is $$1 = $$0.a();
        dwo $$2 = $$0.q();
        if ($$1.v() < $$2.aw() && $$2.a_($$1.d()).a($$0)) {
            boolean $$3 = $$2.I($$1) || $$2.I($$1.d());
            return (eoh)((eoh)((eoh)((eoh)((eoh)this.m().b(b, $$0.g())).b(d, this.b($$0))).b(f, $$3)).b(e, $$3)).b(c, epd.b);
        }
        return null;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        $$0.a($$1.d(), (eoh)$$2.b(c, epd.a), 3);
    }

    private epc b(dpu $$0) {
        boolean $$17;
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        iz $$3 = $$0.g();
        is $$4 = $$2.d();
        iz $$5 = $$3.i();
        is $$6 = $$2.a($$5);
        eoh $$7 = $$1.a_($$6);
        is $$8 = $$4.a($$5);
        eoh $$9 = $$1.a_($$8);
        iz $$10 = $$3.h();
        is $$11 = $$2.a($$10);
        eoh $$12 = $$1.a_($$11);
        is $$13 = $$4.a($$10);
        eoh $$14 = $$1.a_($$13);
        int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
        boolean $$16 = $$7.b() instanceof ebz && $$7.c(c) == epd.b;
        boolean bl2 = $$17 = $$12.b() instanceof ebz && $$12.c(c) == epd.b;
        if ($$16 && !$$17 || $$15 > 0) {
            return epc.b;
        }
        if ($$17 && !$$16 || $$15 < 0) {
            return epc.a;
        }
        int $$18 = $$3.j();
        int $$19 = $$3.l();
        ftm $$20 = $$0.l();
        double $$21 = $$20.g - (double)$$2.u();
        double $$22 = $$20.i - (double)$$2.w();
        return $$18 < 0 && $$22 < 0.5 || $$18 > 0 && $$22 > 0.5 || $$19 < 0 && $$21 > 0.5 || $$19 > 0 && $$21 < 0.5 ? epc.b : epc.a;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!this.h.c()) {
            return cdc.e;
        }
        $$0 = (eoh)$$0.a(e);
        $$1.a($$2, $$0, 10);
        this.a($$3, $$1, $$2, (boolean)$$0.c(e));
        $$1.a((cgk)$$3, this.n($$0) ? etk.h : etk.d, $$2);
        return cdc.a;
    }

    public boolean n(eoh $$0) {
        return $$0.c(e);
    }

    public void a(@Nullable cgk $$0, dwo $$1, eoh $$2, is $$3, boolean $$4) {
        if (!$$2.a(this) || $$2.c(e) == $$4) {
            return;
        }
        $$1.a($$3, (eoh)$$2.b(e, $$4), 10);
        this.a($$0, $$1, $$3, $$4);
        $$1.a($$0, $$4 ? etk.h : etk.d, $$3);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        boolean $$6;
        boolean bl2 = $$1.I($$2) || $$1.I($$2.a($$0.c(c) == epd.b ? iz.b : iz.a)) ? true : ($$6 = false);
        if (!this.m().a($$3) && $$6 != $$0.c(f)) {
            if ($$6 != $$0.c(e)) {
                this.a(null, $$1, $$2, $$6);
                $$1.a(null, $$6 ? etk.h : etk.d, $$2);
            }
            $$1.a($$2, (eoh)((eoh)$$0.b(f, $$6)).b(e, $$6), 2);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        if ($$0.c(c) == epd.b) {
            return $$4.c((dvt)$$1, $$3, iz.b);
        }
        return $$4.a(this);
    }

    private void a(@Nullable cgk $$0, dwo $$1, is $$2, boolean $$3) {
        $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), bdb.e, 1.0f, $$1.G_().i() * 0.1f + 0.9f);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        if ($$1 == eev.a) {
            return $$0;
        }
        return (eoh)$$0.a($$1.a($$0.c(b))).a(d);
    }

    @Override
    protected long a(eoh $$0, is $$1) {
        return bgj.b($$1.u(), $$1.c($$0.c(c) == epd.b ? 0 : 1).v(), $$1.w());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, b, e, d, f);
    }

    public static boolean a(dwo $$0, is $$1) {
        return ebz.p($$0.a_($$1));
    }

    public static boolean p(eoh $$0) {
        ebz $$1;
        dzq dzq2 = $$0.b();
        return dzq2 instanceof ebz && ($$1 = (ebz)dzq2).b().c();
    }
}

