/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gjr
extends gjc {
    gjr(int $$0, int $$1, int $$2, int $$3) {
        super($$0, $$1, $$2, $$3, yg.a);
    }

    public static gjr a(int $$0, int $$1, amo $$2, int $$3, int $$4) {
        return new b(0, 0, $$0, $$1, $$2, $$3, $$4);
    }

    public static gjr a(int $$0, int $$1, amo $$2) {
        return new a(0, 0, $$0, $$1, $$2);
    }

    @Override
    protected void a(gpd $$0) {
    }

    @Override
    public void a(iqr $$0) {
    }

    @Override
    public boolean b() {
        return false;
    }

    public abstract void a(amo var1);

    @Override
    public @Nullable gin a(gpi $$0) {
        return null;
    }

    static class b
    extends gjr {
        private amo a;
        private final int b;
        private final int c;

        public b(int $$0, int $$1, int $$2, int $$3, amo $$4, int $$5, int $$6) {
            super($$0, $$1, $$2, $$3);
            this.a = $$4;
            this.b = $$5;
            this.c = $$6;
        }

        @Override
        protected void a_(gir $$0, int $$1, int $$2, float $$3) {
            $$0.a(hpa.at, this.a, this.aT_(), this.aU_(), 0.0f, 0.0f, this.aS_(), this.aR_(), this.b, this.c);
        }

        @Override
        public void a(amo $$0) {
            this.a = $$0;
        }
    }

    static class a
    extends gjr {
        private amo a;

        public a(int $$0, int $$1, int $$2, int $$3, amo $$4) {
            super($$0, $$1, $$2, $$3);
            this.a = $$4;
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            $$0.a(hpa.at, this.a, this.aT_(), this.aU_(), this.aS_(), this.aR_());
        }

        @Override
        public void a(amo $$0) {
            this.a = $$0;
        }
    }
}

