/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.joml.Matrix4f
 *  org.jspecify.annotations.Nullable
 */
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public class gio {
    private static final float c = 0.01f;
    private static final float d = 0.01f;
    private static final float e = -0.01f;
    public static final float a = 0.03f;
    public final int b = 9;
    private final bgr f = bgr.a();
    final e g;
    private final gfu h;

    public gio(e $$02) {
        this.g = $$02;
        this.h = new gfu(($$0, $$1) -> this.a($$1.l()).a($$0).a().a($$1.c()));
    }

    private gip a(ym $$0) {
        return this.g.a($$0);
    }

    public String a(String $$0) {
        try {
            Bidi $$1 = new Bidi(new ArabicShaping(8).shape($$0), 127);
            $$1.setReorderingMode(0);
            return $$1.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return $$0;
        }
    }

    public void a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, hon $$6, a $$7, int $$8, int $$9) {
        c $$10 = this.a($$0, $$1, $$2, $$3, $$4, $$8);
        $$10.a(gio$b.a($$6, $$5, $$7, $$9));
    }

    public void a(yh $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, hon $$6, a $$7, int $$8, int $$9) {
        c $$10 = this.a($$0.g(), $$1, $$2, $$3, $$4, false, $$8);
        $$10.a(gio$b.a($$6, $$5, $$7, $$9));
    }

    public void a(bfr $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, hon $$6, a $$7, int $$8, int $$9) {
        c $$10 = this.a($$0, $$1, $$2, $$3, $$4, false, $$8);
        $$10.a(gio$b.a($$6, $$5, $$7, $$9));
    }

    public void a(bfr $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, hon $$62, int $$72) {
        d $$82 = new d(0.0f, 0.0f, $$4, false, false);
        for (int $$9 = -1; $$9 <= 1; ++$$9) {
            for (int $$10 = -1; $$10 <= 1; ++$$10) {
                if ($$9 == 0 && $$10 == 0) continue;
                float[] $$11 = new float[]{$$1};
                int $$12 = $$9;
                int $$13 = $$10;
                $$0.accept(($$6, $$7, $$8) -> {
                    boolean $$9 = $$7.c();
                    goa $$10 = this.a($$8, $$7);
                    $$0.f = $$11[0] + (float)$$12 * $$10.a().b();
                    $$0.g = $$2 + (float)$$13 * $$10.a().b();
                    $$1[0] = $$11[0] + $$10.a().a($$9);
                    return $$82.a($$6, $$7.a($$4), $$10);
                });
            }
        }
        b $$14 = gio$b.a($$62, $$5, gio$a.a, $$72);
        for (gnz.a $$15 : $$82.p) {
            $$14.a($$15);
        }
        d $$16 = new d($$1, $$2, $$3, false, true);
        $$0.accept($$16);
        $$16.a(gio$b.a($$62, $$5, gio$a.c, $$72));
    }

    goa a(int $$0, zf $$1) {
        gip $$2 = this.a($$1.l());
        goa $$3 = $$2.a($$0);
        if ($$1.g() && $$0 != 32) {
            int $$4 = bgj.d($$3.a().a(false));
            $$3 = $$2.a(this.f, $$4);
        }
        return $$3;
    }

    public c a(String $$0, float $$1, float $$2, int $$3, boolean $$4, int $$5) {
        if (this.a()) {
            $$0 = this.a($$0);
        }
        d $$6 = new d($$1, $$2, $$3, $$5, $$4, false);
        bhg.c($$0, zf.a, $$6);
        return $$6;
    }

    public c a(bfr $$0, float $$1, float $$2, int $$3, boolean $$4, boolean $$5, int $$6) {
        d $$7 = new d($$1, $$2, $$3, $$6, $$4, $$5);
        $$0.accept($$7);
        return $$7;
    }

    public int b(String $$0) {
        return bgj.d(this.h.a($$0));
    }

    public int a(yn $$0) {
        return bgj.d(this.h.a($$0));
    }

    public int a(bfr $$0) {
        return bgj.d(this.h.a($$0));
    }

    public String a(String $$0, int $$1, boolean $$2) {
        return $$2 ? this.h.c($$0, $$1, zf.a) : this.h.b($$0, $$1, zf.a);
    }

    public String a(String $$0, int $$1) {
        return this.h.b($$0, $$1, zf.a);
    }

    public yn a(yn $$0, int $$1) {
        return this.h.a($$0, $$1, zf.a);
    }

    public int b(yn $$0, int $$1) {
        return 9 * this.h.b($$0, $$1, zf.a).size();
    }

    public List<bfr> c(yn $$0, int $$1) {
        return uu.a().a(this.h.b($$0, $$1, zf.a));
    }

    public List<yn> d(yn $$0, int $$1) {
        return this.h.b($$0, $$1, zf.a);
    }

    public boolean a() {
        return uu.a().b();
    }

    public gfu b() {
        return this.h;
    }

    public static interface e {
        public gip a(ym var1);

        public goc a();
    }

    public static interface c {
        public void a(b var1);

        public @Nullable gpm a();
    }

    public static interface b {
        public static b a(final hon $$0, final Matrix4f $$1, final a $$2, final int $$3) {
            return new b(){

                @Override
                public void a(gnz.a $$02) {
                    this.b($$02);
                }

                @Override
                public void a(gnz $$02) {
                    this.b($$02);
                }

                private void b(gnz $$02) {
                    fzp $$12 = $$0.a($$02.a($$2));
                    $$02.a($$1, $$12, $$3, false);
                }
            };
        }

        default public void a(gnz.a $$0) {
        }

        default public void a(gnz $$0) {
        }

        default public void a(gno $$0) {
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = gio$a.a();
        }
    }

    class d
    implements bfs,
    c {
        private final boolean b;
        private final int c;
        private final int d;
        private final boolean e;
        float f;
        float g;
        private float h = Float.MAX_VALUE;
        private float i = Float.MAX_VALUE;
        private float j = -3.4028235E38f;
        private float k = -3.4028235E38f;
        private float l = Float.MAX_VALUE;
        private float m = Float.MAX_VALUE;
        private float n = -3.4028235E38f;
        private float o = -3.4028235E38f;
        final List<gnz.a> p = new ArrayList<gnz.a>();
        private @Nullable List<gnz> q;
        private @Nullable List<gno> r;

        public d(float $$0, float $$1, int $$2, boolean $$3, boolean $$4) {
            this($$0, $$1, $$2, 0, $$3, $$4);
        }

        public d(float $$0, float $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
            this.f = $$0;
            this.g = $$1;
            this.b = $$4;
            this.c = $$2;
            this.d = $$3;
            this.e = $$5;
            this.a($$0, $$1, 0.0f);
        }

        private void a(float $$0, float $$1, float $$2, float $$3) {
            this.h = Math.min(this.h, $$0);
            this.i = Math.min(this.i, $$1);
            this.j = Math.max(this.j, $$2);
            this.k = Math.max(this.k, $$3);
        }

        private void a(float $$0, float $$1, float $$2) {
            if (bel.b(this.d) == 0) {
                return;
            }
            this.l = Math.min(this.l, $$0 - 1.0f);
            this.m = Math.min(this.m, $$1 - 1.0f);
            this.n = Math.max(this.n, $$0 + $$2);
            this.o = Math.max(this.o, $$1 + 9.0f);
            this.a(this.l, this.m, this.n, this.o);
        }

        private void a(gnz.a $$0) {
            this.p.add($$0);
            this.a($$0.r(), $$0.t(), $$0.s(), $$0.u());
        }

        private void a(gnz $$0) {
            if (this.q == null) {
                this.q = new ArrayList<gnz>();
            }
            this.q.add($$0);
            this.a($$0.r(), $$0.t(), $$0.s(), $$0.u());
        }

        private void a(gno $$0) {
            if (this.r == null) {
                this.r = new ArrayList<gno>();
            }
            this.r.add($$0);
        }

        @Override
        public boolean accept(int $$0, zf $$1, int $$2) {
            goa $$3 = gio.this.a($$2, $$1);
            return this.a($$0, $$1, $$3);
        }

        public boolean a(int $$0, zf $$1, goa $$2) {
            float $$10;
            fwp $$3 = $$2.a();
            boolean $$4 = $$1.c();
            zh $$5 = $$1.a();
            int $$6 = this.a($$5);
            int $$7 = this.a($$1, $$6);
            float $$8 = $$3.a($$4);
            float $$9 = $$0 == 0 ? this.f - 1.0f : this.f;
            float $$11 = $$4 ? $$3.a() : 0.0f;
            gnz.a $$12 = $$2.a(this.f, this.g, $$6, $$7, $$1, $$11, $$10 = $$3.b());
            if ($$12 != null) {
                this.a($$12);
            } else if (this.e) {
                this.a(new gno(this.f, this.g, $$8, 7.0f, 9.0f, $$1));
            }
            this.a(this.f, this.g, $$8);
            if ($$1.e()) {
                this.a(gio.this.g.a().a($$9, this.g + 4.5f - 1.0f, this.f + $$8, this.g + 4.5f, 0.01f, $$6, $$7, $$10));
            }
            if ($$1.f()) {
                this.a(gio.this.g.a().a($$9, this.g + 9.0f - 1.0f, this.f + $$8, this.g + 9.0f, 0.01f, $$6, $$7, $$10));
            }
            this.f += $$8;
            return true;
        }

        @Override
        public void a(b $$0) {
            if (bel.b(this.d) != 0) {
                $$0.a(gio.this.g.a().a(this.l, this.m, this.n, this.o, -0.01f, this.d, 0, 0.0f));
            }
            for (gnz.a $$1 : this.p) {
                $$0.a($$1);
            }
            if (this.q != null) {
                for (gnz $$2 : this.q) {
                    $$0.a($$2);
                }
            }
            if (this.r != null) {
                for (gno $$3 : this.r) {
                    $$0.a($$3);
                }
            }
        }

        private int a(@Nullable zh $$0) {
            if ($$0 != null) {
                int $$1 = bel.b(this.c);
                int $$2 = $$0.a();
                return bel.f($$1, $$2);
            }
            return this.c;
        }

        private int a(zf $$0, int $$1) {
            Integer $$2 = $$0.b();
            if ($$2 != null) {
                float $$3 = bel.m($$1);
                float $$4 = bel.m($$2);
                if ($$3 != 1.0f) {
                    return bel.f(bel.d($$3 * $$4), $$2);
                }
                return $$2;
            }
            if (this.b) {
                return bel.b($$1, 0.25f);
            }
            return 0;
        }

        @Override
        public @Nullable gpm a() {
            if (this.h >= this.j || this.i >= this.k) {
                return null;
            }
            int $$0 = bgj.b(this.h);
            int $$1 = bgj.b(this.i);
            int $$2 = bgj.d(this.j);
            int $$3 = bgj.d(this.k);
            return new gpm($$0, $$1, $$2 - $$0, $$3 - $$1);
        }
    }
}

