/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eax
extends efm {
    public static final MapCodec<eax> a = eax.b(eax::new);

    public MapCodec<eax> a() {
        return a;
    }

    protected eax(eog.d $$0) {
        super(10.0f, $$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false)).b(d, false)).b(e, false)).b(f, false)).b(g, false));
    }

    @Override
    public eoh a(dpu $$0) {
        return eax.a((dvt)$$0.q(), $$0.a(), this.m());
    }

    public static eoh a(dvt $$0, is $$1, eoh $$2) {
        eoh $$3 = $$0.a_($$1.e());
        eoh $$4 = $$0.a_($$1.d());
        eoh $$5 = $$0.a_($$1.f());
        eoh $$6 = $$0.a_($$1.i());
        eoh $$7 = $$0.a_($$1.g());
        eoh $$8 = $$0.a_($$1.h());
        dzq $$9 = $$2.b();
        return (eoh)((eoh)((eoh)((eoh)((eoh)((eoh)$$2.c(g, $$3.a($$9) || $$3.a(dzs.lr) || $$3.a(dzs.go))).c(f, $$4.a($$9) || $$4.a(dzs.lr))).c(b, $$5.a($$9) || $$5.a(dzs.lr))).c(c, $$6.a($$9) || $$6.a(dzs.lr))).c(d, $$7.a($$9) || $$7.a(dzs.lr))).c(e, $$8.a($$9) || $$8.a(dzs.lr));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
        boolean $$8 = $$6.a(this) || $$6.a(dzs.lr) || $$4 == iz.a && $$6.a(dzs.go);
        return (eoh)$$0.b((epk)h.get($$4), $$8);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();
        for (iz $$5 : iz.c.a) {
            is $$6 = $$2.a($$5);
            eoh $$7 = $$1.a_($$6);
            if (!$$7.a(this)) continue;
            if ($$4) {
                return false;
            }
            eoh $$8 = $$1.a_($$6.e());
            if (!$$8.a(this) && !$$8.a(dzs.go)) continue;
            return true;
        }
        return $$3.a(this) || $$3.a(dzs.go);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d, e, f, g);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

