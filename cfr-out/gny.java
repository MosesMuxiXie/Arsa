/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class gny {
    private final Supplier<String> a;
    private final Consumer<String> b;
    private final Supplier<String> c;
    private final Consumer<String> d;
    private final Predicate<String> e;
    private int f;
    private int g;

    public gny(Supplier<String> $$0, Consumer<String> $$1, Supplier<String> $$2, Consumer<String> $$3, Predicate<String> $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f();
    }

    public static Supplier<String> a(gfj $$0) {
        return () -> gny.b($$0);
    }

    public static String b(gfj $$0) {
        return l.a($$0.o.a().replaceAll("\\r", ""));
    }

    public static Consumer<String> c(gfj $$0) {
        return $$1 -> gny.a($$0, $$1);
    }

    public static void a(gfj $$0, String $$1) {
        $$0.o.a($$1);
    }

    public boolean a(gyy $$0) {
        if ($$0.b()) {
            this.a(this.a.get(), $$0.a());
        }
        return true;
    }

    public boolean a(gzb $$0) {
        a $$1;
        if ($$0.p()) {
            this.d();
            return true;
        }
        if ($$0.q()) {
            this.c();
            return true;
        }
        if ($$0.r()) {
            this.b();
            return true;
        }
        if ($$0.s()) {
            this.a();
            return true;
        }
        a a2 = $$1 = $$0.o() ? gny$a.b : gny$a.a;
        if ($$0.t() == 259) {
            this.a(-1, $$1);
            return true;
        }
        if ($$0.t() == 261) {
            this.a(1, $$1);
        } else {
            if ($$0.f()) {
                this.a(-1, $$0.m(), $$1);
                return true;
            }
            if ($$0.g()) {
                this.a(1, $$0.m(), $$1);
                return true;
            }
            if ($$0.t() == 268) {
                this.a($$0.m());
                return true;
            }
            if ($$0.t() == 269) {
                this.b($$0.m());
                return true;
            }
        }
        return false;
    }

    private int g(int $$0) {
        return bgj.a($$0, 0, this.a.get().length());
    }

    private void a(String $$0, String $$1) {
        if (this.g != this.f) {
            $$0 = this.c($$0);
        }
        this.f = bgj.a(this.f, 0, $$0.length());
        String $$2 = new StringBuilder($$0).insert(this.f, $$1).toString();
        if (this.e.test($$2)) {
            this.b.accept($$2);
            this.g = this.f = Math.min($$2.length(), this.f + $$1.length());
        }
    }

    public void a(String $$0) {
        this.a(this.a.get(), $$0);
    }

    private void c(boolean $$0) {
        if (!$$0) {
            this.g = this.f;
        }
    }

    public void a(int $$0, boolean $$1, a $$2) {
        switch ($$2.ordinal()) {
            case 0: {
                this.a($$0, $$1);
                break;
            }
            case 1: {
                this.b($$0, $$1);
            }
        }
    }

    public void a(int $$0) {
        this.a($$0, false);
    }

    public void a(int $$0, boolean $$1) {
        this.f = bhs.a(this.a.get(), this.f, $$0);
        this.c($$1);
    }

    public void b(int $$0) {
        this.b($$0, false);
    }

    public void b(int $$0, boolean $$1) {
        this.f = gfu.a(this.a.get(), $$0, this.f, true);
        this.c($$1);
    }

    public void a(int $$0, a $$1) {
        switch ($$1.ordinal()) {
            case 0: {
                this.d($$0);
                break;
            }
            case 1: {
                this.c($$0);
            }
        }
    }

    public void c(int $$0) {
        int $$1 = gfu.a(this.a.get(), $$0, this.f, true);
        this.d($$1 - this.f);
    }

    public void d(int $$0) {
        String $$1 = this.a.get();
        if (!$$1.isEmpty()) {
            String $$6;
            if (this.g != this.f) {
                String $$2 = this.c($$1);
            } else {
                int $$3 = bhs.a($$1, this.f, $$0);
                int $$4 = Math.min($$3, this.f);
                int $$5 = Math.max($$3, this.f);
                $$6 = new StringBuilder($$1).delete($$4, $$5).toString();
                if ($$0 < 0) {
                    this.g = this.f = $$4;
                }
            }
            this.b.accept($$6);
        }
    }

    public void a() {
        String $$0 = this.a.get();
        this.d.accept(this.b($$0));
        this.b.accept(this.c($$0));
    }

    public void b() {
        this.a(this.a.get(), this.c.get());
        this.g = this.f;
    }

    public void c() {
        this.d.accept(this.b(this.a.get()));
    }

    public void d() {
        this.g = 0;
        this.f = this.a.get().length();
    }

    private String b(String $$0) {
        int $$1 = Math.min(this.f, this.g);
        int $$2 = Math.max(this.f, this.g);
        return $$0.substring($$1, $$2);
    }

    private String c(String $$0) {
        if (this.g == this.f) {
            return $$0;
        }
        int $$1 = Math.min(this.f, this.g);
        int $$2 = Math.max(this.f, this.g);
        String $$3 = $$0.substring(0, $$1) + $$0.substring($$2);
        this.g = this.f = $$1;
        return $$3;
    }

    public void e() {
        this.a(false);
    }

    public void a(boolean $$0) {
        this.f = 0;
        this.c($$0);
    }

    public void f() {
        this.b(false);
    }

    public void b(boolean $$0) {
        this.f = this.a.get().length();
        this.c($$0);
    }

    public int g() {
        return this.f;
    }

    public void e(int $$0) {
        this.c($$0, true);
    }

    public void c(int $$0, boolean $$1) {
        this.f = this.g($$0);
        this.c($$1);
    }

    public int h() {
        return this.g;
    }

    public void f(int $$0) {
        this.g = this.g($$0);
    }

    public void a(int $$0, int $$1) {
        int $$2 = this.a.get().length();
        this.f = bgj.a($$0, 0, $$2);
        this.g = bgj.a($$1, 0, $$2);
    }

    public boolean i() {
        return this.f != this.g;
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

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = gny$a.a();
        }
    }
}

