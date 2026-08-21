/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hrw
implements hri<eob, hsy> {
    public hsy a() {
        return new hsy();
    }

    @Override
    public void a(eob $$0, hsy $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.c = $$0.b($$2);
        $$1.d = $$0.c($$2);
        $$1.e = $$0.d($$2);
        $$1.a = null;
        $$1.b = null;
        eoh $$5 = $$0.h();
        dwo $$6 = $$0.j();
        if ($$6 != null && !$$5.l()) {
            is $$7 = $$0.aD_().a($$0.f().g());
            jd<dxo> $$8 = $$6.z($$7);
            if ($$5.a(dzs.bJ) && $$0.a($$2) <= 4.0f) {
                $$5 = (eoh)$$5.b(enz.d, $$0.a($$2) <= 0.5f);
                $$1.a = hrw.a($$7, $$5, $$8, $$6);
            } else if ($$0.d() && !$$0.a()) {
                epj $$9 = $$5.a(dzs.by) ? epj.b : epj.a;
                eoh $$10 = (eoh)((eoh)dzs.bJ.m().b(enz.c, $$9)).b(enz.a, (iz)$$5.c(eny.a));
                $$10 = (eoh)$$10.b(enz.d, $$0.a($$2) >= 0.5f);
                $$1.a = hrw.a($$7, $$10, $$8, $$6);
                is $$11 = $$7.a($$0.f());
                $$5 = (eoh)$$5.b(eny.c, true);
                $$1.b = hrw.a($$11, $$5, $$8, $$6);
            } else {
                $$1.a = hrw.a($$7, $$5, $$8, $$6);
            }
        }
    }

    @Override
    public void a(hsy $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a == null) {
            return;
        }
        $$1.a();
        $$1.a($$0.c, $$0.d, $$0.e);
        $$2.a($$1, $$0.a);
        $$1.b();
        if ($$0.b != null) {
            $$2.a($$1, $$0.b);
        }
    }

    private static hpz a(is $$0, eoh $$1, jd<dxo> $$2, dwo $$3) {
        hpz $$4 = new hpz();
        $$4.a = $$0;
        $$4.b = $$0;
        $$4.c = $$1;
        $$4.d = $$2;
        $$4.e = $$3;
        return $$4;
    }

    @Override
    public int bl_() {
        return 68;
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

