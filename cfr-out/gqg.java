/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public class gqg {
    private static final int a = 0x774444FF;
    private final List<a> b = new ArrayList<a>();
    private int c = Integer.MAX_VALUE;
    private a d;
    private final Set<Object> e = new HashSet<Object>();
    private @Nullable gpm f;

    public gqg() {
        this.a();
    }

    public void a() {
        this.d = new a(null);
        this.b.add(this.d);
    }

    public void b() {
        if (this.c != Integer.MAX_VALUE) {
            throw new IllegalStateException("Can only blur once per frame");
        }
        this.c = this.b.size() - 1;
    }

    public void c() {
        if (this.d.b == null) {
            this.d.b = new a(this.d);
        }
        this.d = this.d.b;
    }

    public void a(gqf $$0) {
        if (!this.a((gqi)$$0)) {
            return;
        }
        this.e.add($$0.c().i());
        this.d.a($$0);
        this.a($$0.n());
    }

    public void a(gqh $$0) {
        if (!this.a((gqi)$$0)) {
            return;
        }
        this.d.a($$0);
        this.a($$0.n());
    }

    public void a(gqs $$0) {
        if (!this.a((gqi)$$0)) {
            return;
        }
        this.d.a($$0);
        this.a($$0.n());
    }

    public void a(gqe $$0) {
        if (!this.a((gqi)$$0)) {
            return;
        }
        this.d.a($$0);
        this.a($$0.n());
    }

    private void a(@Nullable gpm $$0) {
        if (!w.z || $$0 == null) {
            return;
        }
        this.c();
        this.d.a(new gqc(hpa.aq, gpq.a(), (Matrix3x2fc)new Matrix3x2f(), 0, 0, 10000, 10000, 0x774444FF, 0x774444FF, $$0));
    }

    private boolean a(gqi $$0) {
        gpm $$1 = $$0.n();
        if ($$1 == null) {
            return false;
        }
        if (this.f != null && this.f.d($$1)) {
            this.c();
        } else {
            this.b($$1);
        }
        this.f = $$1;
        return true;
    }

    private void b(gpm $$0) {
        a $$1 = this.b.getLast();
        while ($$1.b != null) {
            $$1 = $$1.b;
        }
        boolean $$2 = false;
        while (!$$2) {
            boolean bl2 = $$2 = this.a($$0, $$1.c) || this.a($$0, $$1.e) || this.a($$0, $$1.f) || this.a($$0, $$1.g);
            if ($$1.a == null) break;
            if ($$2) continue;
            $$1 = $$1.a;
        }
        this.d = $$1;
        if ($$2) {
            this.c();
        }
    }

    private boolean a(gpm $$0, @Nullable List<? extends gqi> $$1) {
        if ($$1 != null) {
            for (gqi gqi2 : $$1) {
                gpm $$3 = gqi2.n();
                if ($$3 == null || !$$3.c($$0)) continue;
                return true;
            }
        }
        return false;
    }

    public void a(gqb $$0) {
        this.d.a($$0);
    }

    public void b(gqe $$0) {
        this.d.b($$0);
    }

    public Set<Object> d() {
        return this.e;
    }

    public void a(Consumer<gqe> $$0, b $$12) {
        this.b((a $$1) -> {
            if ($$1.c == null && $$1.d == null) {
                return;
            }
            if ($$1.c != null) {
                for (gqe $$2 : $$1.c) {
                    $$0.accept($$2);
                }
            }
            if ($$1.d != null) {
                for (gqe $$3 : $$1.d) {
                    $$0.accept($$3);
                }
            }
        }, $$12);
    }

    public void a(Consumer<gqf> $$0) {
        a $$12 = this.d;
        this.b((a $$1) -> {
            if ($$1.e != null) {
                this.d = $$1;
                for (gqf $$2 : $$1.e) {
                    $$0.accept($$2);
                }
            }
        }, gqg$b.a);
        this.d = $$12;
    }

    public void b(Consumer<gqh> $$0) {
        a $$12 = this.d;
        this.b((a $$1) -> {
            if ($$1.f != null) {
                for (gqh $$2 : $$1.f) {
                    this.d = $$1;
                    $$0.accept($$2);
                }
            }
        }, gqg$b.a);
        this.d = $$12;
    }

    public void c(Consumer<gqs> $$0) {
        a $$12 = this.d;
        this.b((a $$1) -> {
            if ($$1.g != null) {
                this.d = $$1;
                for (gqs $$2 : $$1.g) {
                    $$0.accept($$2);
                }
            }
        }, gqg$b.a);
        this.d = $$12;
    }

    public void a(Comparator<gqe> $$0) {
        this.b((a $$1) -> {
            if ($$1.c != null) {
                if (w.x) {
                    Collections.shuffle($$1.c);
                }
                $$1.c.sort($$0);
            }
        }, gqg$b.a);
    }

    private void b(Consumer<a> $$0, b $$1) {
        int $$2 = 0;
        int $$3 = this.b.size();
        if ($$1 == gqg$b.b) {
            $$3 = Math.min(this.c, this.b.size());
        } else if ($$1 == gqg$b.c) {
            $$2 = this.c;
        }
        for (int $$4 = $$2; $$4 < $$3; ++$$4) {
            a $$5 = this.b.get($$4);
            this.a($$5, $$0);
        }
    }

    private void a(a $$0, Consumer<a> $$1) {
        $$1.accept($$0);
        if ($$0.b != null) {
            this.a($$0.b, $$1);
        }
    }

    public void e() {
        this.e.clear();
        this.b.clear();
        this.c = Integer.MAX_VALUE;
        this.a();
    }

    static class a {
        public final @Nullable a a;
        public @Nullable a b;
        public @Nullable List<gqe> c;
        public @Nullable List<gqe> d;
        public @Nullable List<gqf> e;
        public @Nullable List<gqh> f;
        public @Nullable List<gqs> g;

        a(@Nullable a $$0) {
            this.a = $$0;
        }

        public void a(gqf $$0) {
            if (this.e == null) {
                this.e = new ArrayList<gqf>();
            }
            this.e.add($$0);
        }

        public void a(gqh $$0) {
            if (this.f == null) {
                this.f = new ArrayList<gqh>();
            }
            this.f.add($$0);
        }

        public void a(gqs $$0) {
            if (this.g == null) {
                this.g = new ArrayList<gqs>();
            }
            this.g.add($$0);
        }

        public void a(gqe $$0) {
            if (this.c == null) {
                this.c = new ArrayList<gqe>();
            }
            this.c.add($$0);
        }

        public void b(gqe $$0) {
            if (this.d == null) {
                this.d = new ArrayList<gqe>();
            }
            this.d.add($$0);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = gqg$b.a();
        }
    }
}

