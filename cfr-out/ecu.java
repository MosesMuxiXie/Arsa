/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class ecu
extends edt {
    public static final MapCodec<ecu> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)epw.a.fieldOf("wood_type").forGetter($$0 -> $$0.S), ecu.x()).apply((Applicative)$$02, ecu::new));
    public static final eoy b = eox.y;
    public static final eoy c = eox.A;
    public static final eoy d = eox.t;
    private static final Map<iz.a, fug> e = fud.a(dzq.a(16.0, 16.0, 4.0));
    private static final Map<iz.a, fug> g = Maps.newEnumMap(bhs.a(e, (? super V1 $$0) -> fud.a($$0, dzq.b(16.0, 13.0, 16.0), ftq.e)));
    private static final Map<iz.a, fug> h = fud.a(dzq.a(16.0, 4.0, 0.0, 24.0));
    private static final Map<iz.a, fug> i = fud.a(dzq.a(16.0, 4.0, 5.0, 24.0));
    private static final Map<iz.a, fug> D = fud.a(fud.a(dzq.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dzq.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
    private static final Map<iz.a, fug> R = Maps.newEnumMap(bhs.a(D, (? super V1 $$0) -> $$0.a(0.0, -0.1875, 0.0).d()));
    private final epw S;

    public MapCodec<ecu> a() {
        return a;
    }

    public ecu(epw $$0, eog.d $$1) {
        super($$1.a($$0.d()));
        this.S = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false)).b(d, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        iz.a $$4 = ((iz)$$0.c(f)).o();
        return ($$0.c(d) != false ? g : e).get($$4);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        iz.a $$8 = $$4.o();
        if (((iz)$$0.c(f)).h().o() == $$8) {
            boolean $$9 = this.p($$6) || this.p($$1.a_($$3.a($$4.g())));
            return (eoh)$$0.b(d, $$9);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        iz.a $$3 = ((iz)$$0.c(f)).o();
        return $$0.c(b) != false ? fud.a() : i.get($$3);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        iz.a $$4 = ((iz)$$0.c(f)).o();
        return $$0.c(b) != false ? fud.a() : h.get($$4);
    }

    @Override
    protected fug d_(eoh $$0) {
        iz.a $$1 = ((iz)$$0.c(f)).o();
        return ($$0.c(d) != false ? R : D).get($$1);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        switch ($$1) {
            case a: {
                return $$0.c(b);
            }
            case b: {
                return false;
            }
            case c: {
                return $$0.c(b);
            }
        }
        return false;
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        boolean $$3 = $$1.I($$2);
        iz $$4 = $$0.g();
        iz.a $$5 = $$4.o();
        boolean $$6 = $$5 == iz.a.c && (this.p($$1.a_($$2.h())) || this.p($$1.a_($$2.i()))) || $$5 == iz.a.a && (this.p($$1.a_($$2.f())) || this.p($$1.a_($$2.g())));
        return (eoh)((eoh)((eoh)((eoh)this.m().b(f, $$4)).b(b, $$3)).b(c, $$3)).b(d, $$6);
    }

    private boolean p(eoh $$0) {
        return $$0.a(bdp.I);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$0.c(b).booleanValue()) {
            $$0 = (eoh)$$0.b(b, false);
            $$1.a($$2, $$0, 10);
        } else {
            iz $$5 = $$3.dg();
            if ($$0.c(f) == $$5.g()) {
                $$0 = (eoh)$$0.b(f, $$5);
            }
            $$0 = (eoh)$$0.b(b, true);
            $$1.a($$2, $$0, 10);
        }
        boolean $$6 = $$0.c(b);
        $$1.a((cgk)$$3, $$2, $$6 ? this.S.g() : this.S.f(), bdb.e, 1.0f, $$1.G_().i() * 0.1f + 0.9f);
        $$1.a((cgk)$$3, $$6 ? etk.h : etk.d, $$2);
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g() && !$$0.c(c).booleanValue()) {
            boolean $$5 = $$0.c(b);
            $$1.c($$2, (eoh)$$0.b(b, !$$5));
            $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), bdb.e, 1.0f, $$1.G_().i() * 0.1f + 0.9f);
            $$1.a($$5 ? etk.d : etk.h, $$2, etk.a.a($$0));
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        boolean $$6 = $$1.I($$2);
        if ($$0.c(c) != $$6) {
            $$1.a($$2, (eoh)((eoh)$$0.b(c, $$6)).b(b, $$6), 2);
            if ($$0.c(b) != $$6) {
                $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), bdb.e, 1.0f, $$1.G_().i() * 0.1f + 0.9f);
                $$1.a(null, $$6 ? etk.h : etk.d, $$2);
            }
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, b, c, d);
    }

    public static boolean a(eoh $$0, iz $$1) {
        return ((iz)$$0.c(f)).o() == $$1.h().o();
    }
}

