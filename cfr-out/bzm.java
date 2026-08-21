/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public interface bzm {
    public static final String b = "root";

    public void a();

    public void b();

    public void a(String var1);

    public void a(Supplier<String> var1);

    public void c();

    public void b(String var1);

    public void b(Supplier<String> var1);

    default public void e(String $$0) {
    }

    default public void a(long $$0) {
    }

    default public void a(int $$0) {
    }

    default public bzr d(String $$0) {
        this.a($$0);
        return new bzr(this);
    }

    default public bzr c(Supplier<String> $$0) {
        this.a($$0);
        return new bzr(this);
    }

    public void a(caw var1);

    default public void f(String $$0) {
        this.a($$0, 1);
    }

    public void a(String var1, int var2);

    default public void d(Supplier<String> $$0) {
        this.a($$0, 1);
    }

    public void a(Supplier<String> var1, int var2);

    public static bzm a(bzm $$0, bzm $$1) {
        if ($$0 == bzi.a) {
            return $$1;
        }
        if ($$1 == bzi.a) {
            return $$0;
        }
        return new a($$0, $$1);
    }

    public static class a
    implements bzm {
        private final bzm a;
        private final bzm c;

        public a(bzm $$0, bzm $$1) {
            this.a = $$0;
            this.c = $$1;
        }

        @Override
        public void a() {
            this.a.a();
            this.c.a();
        }

        @Override
        public void b() {
            this.a.b();
            this.c.b();
        }

        @Override
        public void a(String $$0) {
            this.a.a($$0);
            this.c.a($$0);
        }

        @Override
        public void a(Supplier<String> $$0) {
            this.a.a($$0);
            this.c.a($$0);
        }

        @Override
        public void a(caw $$0) {
            this.a.a($$0);
            this.c.a($$0);
        }

        @Override
        public void c() {
            this.a.c();
            this.c.c();
        }

        @Override
        public void b(String $$0) {
            this.a.b($$0);
            this.c.b($$0);
        }

        @Override
        public void b(Supplier<String> $$0) {
            this.a.b($$0);
            this.c.b($$0);
        }

        @Override
        public void a(String $$0, int $$1) {
            this.a.a($$0, $$1);
            this.c.a($$0, $$1);
        }

        @Override
        public void a(Supplier<String> $$0, int $$1) {
            this.a.a($$0, $$1);
            this.c.a($$0, $$1);
        }

        @Override
        public void e(String $$0) {
            this.a.e($$0);
            this.c.e($$0);
        }

        @Override
        public void a(long $$0) {
            this.a.a($$0);
            this.c.a($$0);
        }

        @Override
        public void a(int $$0) {
            this.a.a($$0);
            this.c.a($$0);
        }
    }
}

