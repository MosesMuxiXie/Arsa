/*
 * Decompiled with CFR 0.152.
 */
public interface gnf {
    public static final int a = 182;
    public static final int b = 5;
    public static final int c = 24;
    public static final gnf d = new gnf(){

        @Override
        public void a(gir $$0, gez $$1) {
        }

        @Override
        public void b(gir $$0, gez $$1) {
        }
    };

    default public int a(fyk $$0) {
        return ($$0.o() - 182) / 2;
    }

    default public int b(fyk $$0) {
        return $$0.p() - 24 - 5;
    }

    public void a(gir var1, gez var2);

    public void b(gir var1, gez var2);

    public static void a(gir $$0, gio $$1, int $$2) {
        yw $$3 = yh.a("gui.experience.level", $$2);
        int $$4 = ($$0.a() - $$1.a($$3)) / 2;
        int $$5 = $$0.b() - 24 - $$1.b - 2;
        $$0.a($$1, (yh)$$3, $$4 + 1, $$5, -16777216, false);
        $$0.a($$1, (yh)$$3, $$4 - 1, $$5, -16777216, false);
        $$0.a($$1, (yh)$$3, $$4, $$5 + 1, -16777216, false);
        $$0.a($$1, (yh)$$3, $$4, $$5 - 1, -16777216, false);
        $$0.a($$1, (yh)$$3, $$4, $$5, -8323296, false);
    }
}

