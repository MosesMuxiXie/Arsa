/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class edu
extends dzq {
    public static final MapCodec<edu> a = edu.b(edu::new);
    public static final eoy b = efm.b;
    public static final eoy c = efm.c;
    public static final eoy d = efm.d;
    public static final eoy e = efm.e;
    public static final eoy f = efm.f;
    public static final eoy g = efm.g;
    private static final Map<iz, eoy> h = efm.h;

    public MapCodec<edu> a() {
        return a;
    }

    public edu(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, true)).b(c, true)).b(d, true)).b(e, true)).b(f, true)).b(g, true));
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        return (eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.m().b(g, !$$1.a_($$2.e()).a(this))).b(f, !$$1.a_($$2.d()).a(this))).b(b, !$$1.a_($$2.f()).a(this))).b(c, !$$1.a_($$2.i()).a(this))).b(d, !$$1.a_($$2.g()).a(this))).b(e, !$$1.a_($$2.h()).a(this));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$6.a(this)) {
            return (eoh)$$0.b(h.get($$4), false);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)((eoh)((eoh)((eoh)((eoh)((eoh)$$0.b(h.get($$1.a(iz.c)), $$0.c(b))).b(h.get($$1.a(iz.d)), $$0.c(d))).b(h.get($$1.a(iz.f)), $$0.c(c))).b(h.get($$1.a(iz.e)), $$0.c(e))).b(h.get($$1.a(iz.b)), $$0.c(f))).b(h.get($$1.a(iz.a)), $$0.c(g));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)((eoh)((eoh)((eoh)((eoh)((eoh)$$0.b(h.get($$1.b(iz.c)), $$0.c(b))).b(h.get($$1.b(iz.d)), $$0.c(d))).b(h.get($$1.b(iz.f)), $$0.c(c))).b(h.get($$1.b(iz.e)), $$0.c(e))).b(h.get($$1.b(iz.b)), $$0.c(f))).b(h.get($$1.b(iz.a)), $$0.c(g));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, g, b, c, d, e);
    }
}

