/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class goy
implements gov {
    private final got a;
    private final a b;
    private int c = 0;

    private goy(a $$0) {
        this(0, 0, $$0);
    }

    public goy(int $$0, int $$1, a $$2) {
        this.a = new got($$0, $$1);
        this.b = $$2;
    }

    public goy a(int $$0) {
        this.b.a(this.a, $$0);
        return this;
    }

    public gox b() {
        return this.a.b();
    }

    public gox c() {
        return this.a.c();
    }

    public <T extends gow> T a(T $$0, gox $$1) {
        return this.b.a(this.a, $$0, this.c++, $$1);
    }

    public <T extends gow> T a(T $$0) {
        return this.a($$0, this.b());
    }

    public <T extends gow> T a(T $$0, Consumer<gox> $$1) {
        return this.b.a(this.a, $$0, this.c++, bhs.a(this.b(), $$1));
    }

    @Override
    public void b(Consumer<gow> $$0) {
        this.a.b($$0);
    }

    @Override
    public void a() {
        this.a.a();
    }

    @Override
    public int aS_() {
        return this.a.aS_();
    }

    @Override
    public int aR_() {
        return this.a.aR_();
    }

    @Override
    public void f(int $$0) {
        this.a.f($$0);
    }

    @Override
    public void g(int $$0) {
        this.a.g($$0);
    }

    @Override
    public int aT_() {
        return this.a.aT_();
    }

    @Override
    public int aU_() {
        return this.a.aU_();
    }

    public static goy d() {
        return new goy(goy$a.b);
    }

    public static goy e() {
        return new goy(goy$a.a);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        void a(got $$0, int $$1) {
            switch (this.ordinal()) {
                case 0: {
                    $$0.a($$1);
                    break;
                }
                case 1: {
                    $$0.b($$1);
                }
            }
        }

        public <T extends gow> T a(got $$0, T $$1, int $$2, gox $$3) {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> $$0.a($$1, 0, $$2, $$3);
                case 1 -> $$0.a($$1, $$2, 0, $$3);
            };
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = goy$a.a();
        }
    }
}

