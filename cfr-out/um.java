/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class um {
    static final ThreadLocal<@Nullable ui> a = new ThreadLocal();

    private um() {
    }

    public static a a(ui $$0) {
        a $$1 = new a();
        a.set($$0);
        return $$1;
    }

    public static uk a(uh $$0) {
        ui $$1 = a.get();
        if ($$1 == null) {
            throw new IllegalStateException("Gizmos cannot be created here! No GizmoCollector has been registered.");
        }
        return $$1.add($$0);
    }

    public static uk a(fth $$0, ul $$1) {
        return um.a($$0, $$1, false);
    }

    public static uk a(fth $$0, ul $$1, boolean $$2) {
        return um.a(new ug($$0, $$1, $$2));
    }

    public static uk a(is $$0, ul $$1) {
        return um.a(new fth($$0), $$1);
    }

    public static uk a(is $$0, float $$1, ul $$2) {
        return um.a(new fth($$0).g($$1), $$2);
    }

    public static uk a(ftm $$0, float $$1, ul $$2) {
        return um.a(new uf($$0, $$1, $$2));
    }

    public static uk a(ftm $$0, ftm $$1, int $$2) {
        return um.a(new un($$0, $$1, $$2, 3.0f));
    }

    public static uk a(ftm $$0, ftm $$1, int $$2, float $$3) {
        return um.a(new un($$0, $$1, $$2, $$3));
    }

    public static uk b(ftm $$0, ftm $$1, int $$2) {
        return um.a(new ue($$0, $$1, $$2, 2.5f));
    }

    public static uk b(ftm $$0, ftm $$1, int $$2, float $$3) {
        return um.a(new ue($$0, $$1, $$2, $$3));
    }

    public static uk a(ftm $$0, ftm $$1, iz $$2, ul $$3) {
        return um.a(up.a($$0, $$1, $$2, $$3));
    }

    public static uk a(ftm $$0, ftm $$1, ftm $$2, ftm $$3, ul $$4) {
        return um.a(new up($$0, $$1, $$2, $$3, $$4));
    }

    public static uk a(ftm $$0, int $$1, float $$2) {
        return um.a(new uo($$0, $$1, $$2));
    }

    public static uk a(String $$0, is $$1, int $$2, int $$3, float $$4) {
        double $$5 = 1.3;
        double $$6 = 0.2;
        uk $$7 = um.a($$0, ftm.a($$1, 0.5, 1.3 + (double)$$2 * 0.2, 0.5), ur.a.a($$3).a($$4));
        $$7.a();
        return $$7;
    }

    public static uk a(cgk $$0, int $$1, String $$2, int $$3, float $$4) {
        double $$5 = 2.4;
        double $$6 = 0.25;
        double $$7 = (double)$$0.dO() + 0.5;
        double $$8 = $$0.dR() + 2.4 + (double)$$1 * 0.25;
        double $$9 = (double)$$0.dU() + 0.5;
        float $$10 = 0.5f;
        uk $$11 = um.a($$2, new ftm($$7, $$8, $$9), ur.a.b($$3).a($$4).b(0.5f));
        $$11.a();
        return $$11;
    }

    public static uk a(String $$0, ftm $$1, ur.a $$2) {
        return um.a(new ur($$1, $$0, $$2));
    }

    public static class a
    implements AutoCloseable {
        private final @Nullable ui a = a.get();
        private boolean b;

        a() {
        }

        @Override
        public void close() {
            if (!this.b) {
                this.b = true;
                a.set(this.a);
            }
        }
    }
}

