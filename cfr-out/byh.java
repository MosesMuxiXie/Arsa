/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface byh<S> {
    public void a(int var1, byn<S> var2, Object var3);

    default public void a(int $$0, Object $$1) {
        this.a($$0, byn.b(), $$1);
    }

    public void a(int var1);

    public static class byh$a<S>
    implements byh<S> {
        private @Nullable a<S>[] a = new a[16];
        private int b;
        private int c = -1;

        private void b(int $$0) {
            if ($$0 > this.c) {
                this.c = $$0;
                this.b = 0;
            }
        }

        @Override
        public void a(int $$0) {
            this.b($$0);
        }

        @Override
        public void a(int $$0, byn<S> $$1, Object $$2) {
            this.b($$0);
            if ($$0 == this.c) {
                this.a($$1, $$2);
            }
        }

        private void a(byn<S> $$0, Object $$1) {
            int $$5;
            a<S> $$6;
            int $$2 = this.a.length;
            if (this.b >= $$2) {
                int $$3 = bhs.a($$2, this.b + 1);
                a[] $$4 = new a[$$3];
                System.arraycopy(this.a, 0, $$4, 0, $$2);
                this.a = $$4;
            }
            if (($$6 = this.a[$$5 = this.b++]) == null) {
                this.a[$$5] = $$6 = new a();
            }
            $$6.a = $$0;
            $$6.b = $$1;
        }

        public List<byi<S>> a() {
            int $$0 = this.b;
            if ($$0 == 0) {
                return List.of();
            }
            ArrayList<byi<S>> $$1 = new ArrayList<byi<S>>($$0);
            for (int $$2 = 0; $$2 < $$0; ++$$2) {
                a<S> $$3 = this.a[$$2];
                $$1.add(new byi(this.c, $$3.a, $$3.b));
            }
            return $$1;
        }

        public int b() {
            return this.c;
        }

        static class a<S> {
            byn<S> a = byn.b();
            Object b = "empty";

            a() {
            }
        }
    }

    public static class b<S>
    implements byh<S> {
        @Override
        public void a(int $$0, byn<S> $$1, Object $$2) {
        }

        @Override
        public void a(int $$0) {
        }
    }
}

