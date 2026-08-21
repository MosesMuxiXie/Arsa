/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface iof
extends iny {
    public static final boolean a = true;
    public static final ioi.a b = ioi.a.b;

    public ioi a();

    public @Nullable iof b();

    public static hqp a(iof $$0) {
        hqp.c $$2 = new hqp.c();
        for (iof $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
            $$2.a($$1.a().e());
        }
        return $$2.a($$0);
    }

    default public hqp g() {
        return iof.a(this);
    }

    public static boolean b(iof $$0) {
        while ($$0 != null) {
            Boolean $$1 = $$0.a().c();
            if ($$1 != null) {
                return $$1;
            }
            $$0 = $$0.b();
        }
        return true;
    }

    default public boolean c() {
        return iof.b(this);
    }

    public static ioi.a c(iof $$0) {
        while ($$0 != null) {
            ioi.a $$1 = $$0.a().b();
            if ($$1 != null) {
                return $$1;
            }
            $$0 = $$0.b();
        }
        return b;
    }

    default public ioi.a d() {
        return iof.c(this);
    }

    public static ioh d(iof $$0) {
        while ($$0 != null) {
            ioh $$1 = $$0.a().a();
            if ($$1 != null) {
                return $$1;
            }
            $$0 = $$0.b();
        }
        return ioh.a;
    }

    default public ioh f() {
        return iof.d(this);
    }

    default public iod a(hqp $$0, inw $$1, ioc $$2) {
        return this.f().bake($$0, $$1, $$2, this);
    }

    public static ilp a(hqp $$0, inw $$1, iny $$2) {
        return $$1.b().a($$0, "particle", $$2);
    }

    default public ilp a(hqp $$0, inw $$1) {
        return iof.a($$0, $$1, this);
    }

    public static hqk a(iof $$0, dlr $$1) {
        while ($$0 != null) {
            hqk $$3;
            hql $$2 = $$0.a().d();
            if ($$2 != null && ($$3 = $$2.a($$1)) != hqk.a) {
                return $$3;
            }
            $$0 = $$0.b();
        }
        return hqk.a;
    }

    public static hql e(iof $$0) {
        hqk $$1 = iof.a($$0, dlr.b);
        hqk $$2 = iof.a($$0, dlr.c);
        hqk $$3 = iof.a($$0, dlr.d);
        hqk $$4 = iof.a($$0, dlr.e);
        hqk $$5 = iof.a($$0, dlr.f);
        hqk $$6 = iof.a($$0, dlr.g);
        hqk $$7 = iof.a($$0, dlr.h);
        hqk $$8 = iof.a($$0, dlr.i);
        hqk $$9 = iof.a($$0, dlr.j);
        return new hql($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    default public hql e() {
        return iof.e(this);
    }
}

