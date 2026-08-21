/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class egw
extends eez
implements egq {
    public static final MapCodec<egw> e = egw.b(egw::new);
    private final efa f = new efa(new a(this, efa.a));
    private final efa g = new efa(new a(this, efa.e.a));

    public MapCodec<egw> a() {
        return e;
    }

    public egw(eog.d $$0) {
        super($$0);
    }

    @Override
    public efa c() {
        return this.f;
    }

    public efa q() {
        return this.g;
    }

    public static boolean a(dwp $$0, is $$1, eoh $$2, Collection<iz> $$3) {
        boolean $$4 = false;
        eoh $$5 = dzs.rT.m();
        for (iz $$6 : $$3) {
            if (!egw.a((dvt)$$0, $$1, $$6)) continue;
            $$5 = (eoh)$$5.b(egw.b($$6), true);
            $$4 = true;
        }
        if (!$$4) {
            return false;
        }
        if (!$$2.y().c()) {
            $$5 = (eoh)$$5.b(eey.c, true);
        }
        $$0.a($$1, $$5, 3);
        return true;
    }

    @Override
    public void a(dwp $$0, eoh $$1, is $$2, bgr $$3) {
        if (!$$1.a(this)) {
            return;
        }
        for (iz $$4 : d) {
            eoy $$5 = egw.b($$4);
            if (!$$1.c($$5).booleanValue() || !$$0.a_($$2.a($$4)).a(dzs.rS)) continue;
            $$1 = (eoh)$$1.b($$5, false);
        }
        if (!egw.r($$1)) {
            flb $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dzs.a : dzs.J).m();
        }
        $$0.a($$2, $$1, 3);
        egq.super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public int a(egv.a $$0, dwp $$1, is $$2, bgr $$3, egv $$4, boolean $$5) {
        if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
            return $$0.b() - 1;
        }
        return $$3.a($$4.f()) == 0 ? bgj.b((float)$$0.b() * 0.5f) : $$0.b();
    }

    private boolean a(egv $$0, dwp $$1, is $$2, bgr $$3) {
        eoh $$4 = $$1.a_($$2);
        bef<dzq> $$5 = $$0.c();
        for (iz $$6 : iz.a($$3)) {
            is $$7;
            eoh $$8;
            if (!egw.a($$4, $$6) || !($$8 = $$1.a_($$7 = $$2.a($$6))).a($$5)) continue;
            eoh $$9 = dzs.rS.m();
            $$1.a($$7, $$9, 3);
            dzq.a($$8, $$9, $$1, $$7);
            $$1.a(null, $$7, bda.yO, bdb.e, 1.0f, 1.0f);
            this.f.a($$9, $$1, $$7, $$0.h());
            iz $$10 = $$6.g();
            for (iz $$11 : d) {
                is $$12;
                eoh $$13;
                if ($$11 == $$10 || !($$13 = $$1.a_($$12 = $$7.a($$11))).a(this)) continue;
                this.a($$1, $$13, $$12, $$3);
            }
            return true;
        }
        return false;
    }

    public static boolean a(dwp $$0, eoh $$1, is $$2) {
        if (!$$1.a(dzs.rT)) {
            return false;
        }
        for (iz $$3 : d) {
            if (!egw.a($$1, $$3) || !$$0.a_($$2.a($$3)).a(bdp.ch)) continue;
            return true;
        }
        return false;
    }

    class a
    extends efa.a {
        private final efa.e[] b;

        public a(egw egw2, efa.e ... $$0) {
            super(egw2);
            this.b = $$0;
        }

        @Override
        public boolean a(dvt $$0, is $$1, is $$2, iz $$3, eoh $$4) {
            is $$6;
            eoh $$5 = $$0.a_($$2.a($$3));
            if ($$5.a(dzs.rS) || $$5.a(dzs.rU) || $$5.a(dzs.ca)) {
                return false;
            }
            if ($$1.k($$2) == 2 && $$0.a_($$6 = $$1.a($$3.g())).c($$0, $$6, $$3)) {
                return false;
            }
            flb $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(flc.c)) {
                return false;
            }
            if ($$4.a(bdp.aY)) {
                return false;
            }
            return $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public efa.e[] a() {
            return this.b;
        }

        @Override
        public boolean a(eoh $$0) {
            return !$$0.a(dzs.rT);
        }
    }
}

