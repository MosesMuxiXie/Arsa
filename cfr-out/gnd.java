/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gnd
implements gnb {
    private static final amo h = amo.b("toast/tutorial");
    public static final int a = 154;
    public static final int e = 1;
    public static final int f = 3;
    public static final int g = 4;
    private static final int i = 7;
    private static final int j = 3;
    private static final int k = 11;
    private static final int l = 30;
    private static final int m = 126;
    private final a n;
    private final List<bfr> o;
    private gnb.a p = gnb.a.a;
    private long q;
    private float r;
    private float s;
    private final boolean t;
    private final int u;

    public gnd(gio $$0, a $$1, yh $$2, @Nullable yh $$3, boolean $$4, int $$5) {
        this.n = $$1;
        this.o = new ArrayList<bfr>(2);
        this.o.addAll($$0.c($$2.f().b(-11534256), 126));
        if ($$3 != null) {
            this.o.addAll($$0.c($$3, 126));
        }
        this.t = $$4;
        this.u = $$5;
    }

    public gnd(gio $$0, a $$1, yh $$2, @Nullable yh $$3, boolean $$4) {
        this($$0, $$1, $$2, $$3, $$4, 0);
    }

    @Override
    public gnb.a a() {
        return this.p;
    }

    @Override
    public void a(gnc $$0, long $$1) {
        if (this.u > 0) {
            this.r = this.s = Math.min((float)$$1 / (float)this.u, 1.0f);
            this.q = $$1;
            if ($$1 > (long)this.u) {
                this.c();
            }
        } else if (this.t) {
            this.r = bgj.b((float)($$1 - this.q) / 100.0f, this.r, this.s);
            this.q = $$1;
        }
    }

    @Override
    public int f() {
        return 7 + this.g() + 3;
    }

    private int g() {
        return Math.max(this.o.size(), 2) * 11;
    }

    @Override
    public void a(gir $$0, gio $$1, long $$2) {
        int $$3 = this.f();
        $$0.a(hpa.at, h, 0, 0, this.e(), $$3);
        this.n.a($$0, 6, 6);
        int $$4 = this.o.size() * 11;
        int $$5 = 7 + (this.g() - $$4) / 2;
        for (int $$6 = 0; $$6 < this.o.size(); ++$$6) {
            $$0.a($$1, this.o.get($$6), 30, $$5 + $$6 * 11, -16777216, false);
        }
        if (this.t) {
            int $$9;
            int $$7 = $$3 - 4;
            $$0.a(3, $$7, 157, $$7 + 1, -1);
            if (this.s >= this.r) {
                int $$8 = -16755456;
            } else {
                $$9 = -11206656;
            }
            $$0.a(3, $$7, (int)(3.0f + 154.0f * this.r), $$7 + 1, $$9);
        }
    }

    public void c() {
        this.p = gnb.a.b;
    }

    public void a(float $$0) {
        this.s = $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amo.b("toast/movement_keys"));
        public static final /* enum */ a b = new a(amo.b("toast/mouse"));
        public static final /* enum */ a c = new a(amo.b("toast/tree"));
        public static final /* enum */ a d = new a(amo.b("toast/recipe_book"));
        public static final /* enum */ a e = new a(amo.b("toast/wooden_planks"));
        public static final /* enum */ a f = new a(amo.b("toast/social_interactions"));
        public static final /* enum */ a g = new a(amo.b("toast/right_click"));
        private final amo h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(amo $$0) {
            this.h = $$0;
        }

        public void a(gir $$0, int $$1, int $$2) {
            $$0.a(hpa.at, this.h, $$1, $$2, 20, 20);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            i = gnd$a.a();
        }
    }
}

