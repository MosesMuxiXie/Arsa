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

public class eiw
extends edt
implements ehg {
    public static final MapCodec<eiw> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)eow.a.fieldOf("block_set_type").forGetter($$0 -> $$0.h), eiw.x()).apply((Applicative)$$02, eiw::new));
    public static final eoy b = eox.y;
    public static final epf<epg> c = eox.ai;
    public static final eoy d = eox.A;
    public static final eoy e = eox.I;
    private static final Map<iz, fug> g = fud.d(dzq.c(16.0, 13.0, 16.0));
    private final eow h;

    public MapCodec<? extends eiw> a() {
        return a;
    }

    protected eiw(eow $$0, eog.d $$1) {
        super($$1.a($$0.g()));
        this.h = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(b, false)).b(c, epg.b)).b(d, false)).b(e, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g.get($$0.c(b) != false ? $$0.c(f) : ($$0.c(c) == epg.a ? iz.a : iz.b));
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        switch ($$1) {
            case a: {
                return $$0.c(b);
            }
            case b: {
                return $$0.c(e);
            }
            case c: {
                return $$0.c(b);
            }
        }
        return false;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!this.h.c()) {
            return cdc.e;
        }
        this.b($$0, $$1, $$2, $$3);
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g() && this.h.d() && !$$0.c(d).booleanValue()) {
            this.b($$0, (dwo)$$1, $$2, null);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    private void b(eoh $$0, dwo $$1, is $$2, @Nullable ddm $$3) {
        eoh $$4 = (eoh)$$0.a(b);
        $$1.a($$2, $$4, 2);
        if ($$4.c(e).booleanValue()) {
            $$1.a($$2, flc.c, flc.c.a($$1));
        }
        this.a($$3, $$1, $$2, (boolean)$$4.c(b));
    }

    protected void a(@Nullable ddm $$0, dwo $$1, is $$2, boolean $$3) {
        $$1.a((cgk)$$0, $$2, $$3 ? this.h.k() : this.h.j(), bdb.e, 1.0f, $$1.G_().i() * 0.1f + 0.9f);
        $$1.a((cgk)$$0, $$3 ? etk.h : etk.d, $$2);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        boolean $$6 = $$1.I($$2);
        if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
                $$0 = (eoh)$$0.b(b, $$6);
                this.a(null, $$1, $$2, $$6);
            }
            $$1.a($$2, (eoh)$$0.b(d, $$6), 2);
            if ($$0.c(e).booleanValue()) {
                $$1.a($$2, flc.c, flc.c.a($$1));
            }
        }
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = this.m();
        flb $$2 = $$0.q().b_($$0.a());
        iz $$3 = $$0.k();
        $$1 = $$0.c() || !$$3.o().d() ? (eoh)((eoh)$$1.b(f, $$0.g().g())).b(c, $$3 == iz.b ? epg.b : epg.a) : (eoh)((eoh)$$1.b(f, $$3)).b(c, $$0.l().h - (double)$$0.a().v() > 0.5 ? epg.a : epg.b);
        if ($$0.q().I($$0.a())) {
            $$1 = (eoh)((eoh)$$1.b(b, true)).b(d, true);
        }
        return (eoh)$$1.b(e, $$2.a() == flc.c);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, b, c, d, e);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    protected eow q() {
        return this.h;
    }
}

