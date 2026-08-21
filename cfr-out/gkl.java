/*
 * Decompiled with CFR 0.152.
 */
public interface gkl {
    default public boolean a(int $$0, int $$1, int $$2) {
        return $$0 >= 0 && $$0 < $$2 && $$1 >= 0 && $$1 < $$2;
    }

    default public boolean b(int $$0, int $$1, int $$2) {
        return $$0 >= 0 && $$0 < $$2 / 2 && $$1 >= 0 && $$1 < $$2;
    }

    default public boolean c(int $$0, int $$1, int $$2) {
        return $$0 >= $$2 / 2 && $$0 < $$2 && $$1 >= 0 && $$1 < $$2;
    }

    default public boolean d(int $$0, int $$1, int $$2) {
        return $$0 >= $$2 / 2 && $$0 < $$2 && $$1 >= 0 && $$1 < $$2 / 2;
    }

    default public boolean e(int $$0, int $$1, int $$2) {
        return $$0 >= $$2 / 2 && $$0 < $$2 && $$1 >= $$2 / 2 && $$1 < $$2;
    }

    default public boolean f(int $$0, int $$1, int $$2) {
        return $$0 >= 0 && $$0 < $$2 / 2 && $$1 >= 0 && $$1 < $$2 / 2;
    }

    default public boolean g(int $$0, int $$1, int $$2) {
        return $$0 >= 0 && $$0 < $$2 / 2 && $$1 >= $$2 / 2 && $$1 < $$2;
    }
}

