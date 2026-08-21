/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface djc {
    public static final djc a = new djc(){

        @Override
        public void a(xa $$0) {
        }

        @Override
        public void a(dlt $$0) {
        }

        @Override
        public boolean b(dlt $$0) {
            return true;
        }
    };

    public void a(dlt var1);

    public void a(xa var1);

    public boolean b(dlt var1);

    public static class a
    implements djc {
        private final wz.a b;
        private @Nullable dlt c = null;
        private @Nullable xa d = null;

        public a(wz.a $$0) {
            this.b = $$0;
        }

        @Override
        public void a(dlt $$0) {
            this.c = $$0.v();
            this.d = null;
        }

        @Override
        public void a(xa $$0) {
            this.c = null;
            this.d = $$0;
        }

        @Override
        public boolean b(dlt $$0) {
            if (this.c != null) {
                return dlt.a(this.c, $$0);
            }
            if (this.d != null && this.d.a($$0, this.b)) {
                this.c = $$0.v();
                return true;
            }
            return false;
        }

        public void a(a $$0) {
            this.c = $$0.c;
            this.d = $$0.d;
        }
    }
}

