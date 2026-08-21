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
import org.jspecify.annotations.Nullable;

public class ejn
extends eit {
    public static final MapCodec<ejn> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)a.forGetter($$0 -> $$0.c), ejn.x()).apply((Applicative)$$02, ejn::new));
    public static final epf<iz> e = edt.f;
    private static final Map<iz, fug> f = fud.c(dzq.a(5.0, 3.0, 13.0, 11.0, 16.0));

    public MapCodec<ejn> a() {
        return d;
    }

    protected ejn(md $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)((eoh)this.C.b()).b(e, iz.c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return ejn.p($$0);
    }

    public static fug p(eoh $$0) {
        return f.get($$0.c(e));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return ejn.b($$1, $$2, $$0.c(e));
    }

    public static boolean b(dwr $$0, is $$1, iz $$2) {
        is $$3 = $$1.a($$2.g());
        eoh $$4 = $$0.a_($$3);
        return $$4.c((dvt)$$0, $$3, $$2);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz[] $$4;
        eoh $$1 = this.m();
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$5 : $$4 = $$0.f()) {
            iz $$6;
            if (!$$5.o().d() || !($$1 = (eoh)$$1.b(e, $$6 = $$5.g())).a((dwr)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(e) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return $$0;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        iz $$4 = $$0.c(e);
        double $$5 = (double)$$2.u() + 0.5;
        double $$6 = (double)$$2.v() + 0.7;
        double $$7 = (double)$$2.w() + 0.5;
        double $$8 = 0.22;
        double $$9 = 0.27;
        iz $$10 = $$4.g();
        $$1.a(ly.ai, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
        $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(e, $$1.a($$0.c(e)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(e)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{e});
    }
}

