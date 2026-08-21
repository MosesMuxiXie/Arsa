/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class uq
implements ui {
    private final List<a> c = new ArrayList<a>();
    private final List<a> d = new ArrayList<a>();

    @Override
    public uk add(uh $$0) {
        a $$1 = new a($$0);
        this.c.add($$1);
        return $$1;
    }

    public List<a> a() {
        ArrayList<a> $$0 = new ArrayList<a>(this.c);
        $$0.addAll(this.d);
        long $$12 = bhs.c();
        this.c.removeIf($$1 -> $$1.d() < $$12);
        this.d.clear();
        return $$0;
    }

    public List<a> b() {
        return this.c;
    }

    public void a(Collection<a> $$0) {
        this.d.addAll($$0);
    }

    public static class a
    implements uk {
        private final uh a;
        private boolean b;
        private long c;
        private long d;
        private boolean e;

        a(uh $$0) {
            this.a = $$0;
        }

        @Override
        public uk a() {
            this.b = true;
            return this;
        }

        @Override
        public uk a(int $$0) {
            this.c = bhs.c();
            this.d = this.c + (long)$$0;
            return this;
        }

        @Override
        public uk b() {
            this.e = true;
            return this;
        }

        public float a(long $$0) {
            if (this.e) {
                long $$1 = this.d - this.c;
                long $$2 = $$0 - this.c;
                return 1.0f - bgj.a((float)$$2 / (float)$$1, 0.0f, 1.0f);
            }
            return 1.0f;
        }

        public boolean c() {
            return this.b;
        }

        public long d() {
            return this.d;
        }

        public uh e() {
            return this.a;
        }
    }
}

