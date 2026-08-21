/*
 * Decompiled with CFR 0.152.
 */
public class ipp {

    public static class b
    extends iot {
        public static final int n = 40;
        private final hnh o;
        private int p;

        public b(hnh $$0) {
            super(bda.z, bdb.i, ipm.u());
            this.o = $$0;
            this.i = true;
            this.j = 0;
            this.d = 1.0f;
            this.l = true;
        }

        @Override
        public void q() {
            if (this.o.eh() || this.p < 0) {
                this.n();
                return;
            }
            this.p = this.o.bC() ? ++this.p : (this.p -= 2);
            this.p = Math.min(this.p, 40);
            this.d = Math.max(0.0f, Math.min((float)this.p / 40.0f, 1.0f));
        }
    }

    public static class a
    extends iot {
        private final hnh n;

        protected a(hnh $$0, bcz $$1) {
            super($$1, bdb.i, ipm.u());
            this.n = $$0;
            this.i = false;
            this.j = 0;
            this.d = 1.0f;
            this.l = true;
        }

        @Override
        public void q() {
            if (this.n.eh() || !this.n.bC()) {
                this.n();
            }
        }
    }
}

