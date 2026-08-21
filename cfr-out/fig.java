/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fig {
    private static final int b = 3;
    private static final int c = 3;
    private static final int d = 50;
    private static final int e = 10;
    private static final boolean f = true;
    public static final int a = 64;
    private static final f[] g = new f[]{new f(n.class, 40, 0), new f(h.class, 5, 5), new f(d.class, 20, 0), new f(i.class, 20, 0), new f(j.class, 10, 6), new f(o.class, 5, 5), new f(l.class, 5, 5), new f(c.class, 5, 4), new f(a.class, 5, 4), new f(e.class, 10, 2){

        @Override
        public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
        }
    }, new f(g.class, 20, 1){

        @Override
        public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
        }
    }};
    private static List<f> h;
    static @Nullable Class<? extends p> i;
    private static int j;
    static final k k;

    public static void a() {
        h = Lists.newArrayList();
        for (f $$0 : g) {
            $$0.c = 0;
            h.add($$0);
        }
        i = null;
    }

    private static boolean b() {
        boolean $$0 = false;
        j = 0;
        for (f $$1 : h) {
            if ($$1.d > 0 && $$1.c < $$1.d) {
                $$0 = true;
            }
            j += $$1.b;
        }
        return $$0;
    }

    private static @Nullable p a(Class<? extends p> $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7) {
        p $$8 = null;
        if ($$0 == n.class) {
            $$8 = n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == h.class) {
            $$8 = fig$h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == d.class) {
            $$8 = fig$d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == i.class) {
            $$8 = fig$i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == j.class) {
            $$8 = fig$j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == o.class) {
            $$8 = o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == l.class) {
            $$8 = l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == c.class) {
            $$8 = fig$c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == a.class) {
            $$8 = fig$a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == e.class) {
            $$8 = fig$e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$0 == g.class) {
            $$8 = fig$g.a($$1, $$3, $$4, $$5, $$6, $$7);
        }
        return $$8;
    }

    private static @Nullable p a(m $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7) {
        if (!fig.b()) {
            return null;
        }
        if (i != null) {
            p $$8 = fig.a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
                return $$8;
            }
        }
        int $$9 = 0;
        block0: while ($$9 < 5) {
            ++$$9;
            int $$10 = $$2.a(j);
            for (f $$11 : h) {
                if (($$10 -= $$11.b) >= 0) continue;
                if (!$$11.a($$7) || $$11 == $$0.a) continue block0;
                p $$12 = fig.a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                if ($$12 == null) continue;
                ++$$11.c;
                $$0.a = $$11;
                if (!$$11.a()) {
                    h.remove($$11);
                }
                return $$12;
            }
        }
        ffg $$13 = fig$b.a($$1, $$2, $$3, $$4, $$5, $$6);
        if ($$13 != null && $$13.i() > 1) {
            return new b($$7, $$13, $$6);
        }
        return null;
    }

    static @Nullable ffs b(m $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7) {
        if ($$7 > 50) {
            return null;
        }
        if (Math.abs($$3 - $$0.f().h()) > 112 || Math.abs($$5 - $$0.f().j()) > 112) {
            return null;
        }
        p $$8 = fig.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
        if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
        }
        return $$8;
    }

    static {
        k = new k();
    }

    static class f {
        public final Class<? extends p> a;
        public final int b;
        public int c;
        public final int d;

        public f(Class<? extends p> $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.d = $$2;
        }

        public boolean a(int $$0) {
            return this.d == 0 || this.c < this.d;
        }

        public boolean a() {
            return this.d == 0 || this.c < this.d;
        }
    }

    public static class n
    extends p {
        private static final int a = 5;
        private static final int b = 5;
        private static final int c = 7;
        private final boolean d;
        private final boolean i;

        public n(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.E, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.a(2) == 0;
            this.i = $$1.a(2) == 0;
        }

        public n(uz $$0) {
            super(fgf.E, $$0);
            this.d = $$0.b("Left", false);
            this.i = $$0.b("Right", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Left", this.d);
            $$1.a("Right", this.i);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
            if (this.d) {
                this.b((m)$$0, $$1, $$2, 1, 2);
            }
            if (this.i) {
                this.c((m)$$0, $$1, $$2, 1, 2);
            }
        }

        public static @Nullable n a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
            if (!n.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new n($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 6);
            eoh $$7 = (eoh)dzs.cM.m().b(ejn.e, iz.f);
            eoh $$8 = (eoh)dzs.cM.m().b(ejn.e, iz.e);
            this.a($$0, $$4, $$3, 0.1f, 1, 2, 1, $$7);
            this.a($$0, $$4, $$3, 0.1f, 3, 2, 1, $$8);
            this.a($$0, $$4, $$3, 0.1f, 1, 2, 5, $$7);
            this.a($$0, $$4, $$3, 0.1f, 3, 2, 5, $$8);
            if (this.d) {
                this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
            }
            if (this.i) {
                this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
            }
        }
    }

    public static class h
    extends p {
        protected static final int a = 9;
        protected static final int b = 5;
        protected static final int c = 11;

        public h(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.z, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public h(uz $$0) {
            super(fgf.z, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static @Nullable h a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
            if (!fig$h.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new h($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
            this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, k);
            this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, k);
            this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, k);
            this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, k);
            for (int $$7 = 1; $$7 <= 3; ++$$7) {
                this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true), 4, $$7, 4, $$4);
                this.a($$0, (eoh)((eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true)).b(edy.b, true), 4, $$7, 5, $$4);
                this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true), 4, $$7, 6, $$4);
                this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.d, true)).b(edy.b, true), 5, $$7, 5, $$4);
                this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.d, true)).b(edy.b, true), 6, $$7, 5, $$4);
                this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.d, true)).b(edy.b, true), 7, $$7, 5, $$4);
            }
            this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true), 4, 3, 2, $$4);
            this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true), 4, 3, 8, $$4);
            eoh $$8 = (eoh)dzs.dZ.m().b(ebz.b, iz.e);
            eoh $$9 = (eoh)((eoh)dzs.dZ.m().b(ebz.b, iz.e)).b(ebz.c, epd.a);
            this.a($$0, $$8, 4, 1, 2, $$4);
            this.a($$0, $$9, 4, 2, 2, $$4);
            this.a($$0, $$8, 4, 1, 8, $$4);
            this.a($$0, $$9, 4, 2, 8, $$4);
        }
    }

    public static class d
    extends q {
        public d(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.w, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public d(uz $$0) {
            super(fgf.w, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            iz $$3 = this.i();
            if ($$3 == iz.c || $$3 == iz.f) {
                this.b((m)$$0, $$1, $$2, 1, 1);
            } else {
                this.c((m)$$0, $$1, $$2, 1, 1);
            }
        }

        public static @Nullable d a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
            if (!fig$d.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new d($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            iz $$7 = this.i();
            if ($$7 == iz.c || $$7 == iz.f) {
                this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
            } else {
                this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
            }
        }
    }

    public static class i
    extends q {
        public i(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.A, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public i(uz $$0) {
            super(fgf.A, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            iz $$3 = this.i();
            if ($$3 == iz.c || $$3 == iz.f) {
                this.c((m)$$0, $$1, $$2, 1, 1);
            } else {
                this.b((m)$$0, $$1, $$2, 1, 1);
            }
        }

        public static @Nullable i a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
            if (!fig$i.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new i($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            iz $$7 = this.i();
            if ($$7 == iz.c || $$7 == iz.f) {
                this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
            } else {
                this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
            }
        }
    }

    public static class j
    extends p {
        protected static final int a = 11;
        protected static final int b = 7;
        protected static final int c = 11;
        protected final int d;

        public j(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.B, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.a(5);
        }

        public j(uz $$0) {
            super(fgf.B, $$0);
            this.d = $$0.b("Type", 0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Type", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((m)$$0, $$1, $$2, 4, 1);
            this.b((m)$$0, $$1, $$2, 1, 4);
            this.c((m)$$0, $$1, $$2, 1, 4);
        }

        public static @Nullable j a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
            if (!fig$j.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new j($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 1, 0);
            this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
            this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
            this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
            switch (this.d) {
                default: {
                    break;
                }
                case 0: {
                    this.a($$0, dzs.fn.m(), 5, 1, 5, $$4);
                    this.a($$0, dzs.fn.m(), 5, 2, 5, $$4);
                    this.a($$0, dzs.fn.m(), 5, 3, 5, $$4);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.e), 4, 3, 5, $$4);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.f), 6, 3, 5, $$4);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.d), 5, 3, 4, $$4);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.c), 5, 3, 6, $$4);
                    this.a($$0, dzs.kx.m(), 4, 1, 4, $$4);
                    this.a($$0, dzs.kx.m(), 4, 1, 5, $$4);
                    this.a($$0, dzs.kx.m(), 4, 1, 6, $$4);
                    this.a($$0, dzs.kx.m(), 6, 1, 4, $$4);
                    this.a($$0, dzs.kx.m(), 6, 1, 5, $$4);
                    this.a($$0, dzs.kx.m(), 6, 1, 6, $$4);
                    this.a($$0, dzs.kx.m(), 5, 1, 4, $$4);
                    this.a($$0, dzs.kx.m(), 5, 1, 6, $$4);
                    break;
                }
                case 1: {
                    for (int $$7 = 0; $$7 < 5; ++$$7) {
                        this.a($$0, dzs.fn.m(), 3, 1, 3 + $$7, $$4);
                        this.a($$0, dzs.fn.m(), 7, 1, 3 + $$7, $$4);
                        this.a($$0, dzs.fn.m(), 3 + $$7, 1, 3, $$4);
                        this.a($$0, dzs.fn.m(), 3 + $$7, 1, 7, $$4);
                    }
                    this.a($$0, dzs.fn.m(), 5, 1, 5, $$4);
                    this.a($$0, dzs.fn.m(), 5, 2, 5, $$4);
                    this.a($$0, dzs.fn.m(), 5, 3, 5, $$4);
                    this.a($$0, dzs.J.m(), 5, 4, 5, $$4);
                    break;
                }
                case 2: {
                    for (int $$8 = 1; $$8 <= 9; ++$$8) {
                        this.a($$0, dzs.m.m(), 1, 3, $$8, $$4);
                        this.a($$0, dzs.m.m(), 9, 3, $$8, $$4);
                    }
                    for (int $$9 = 1; $$9 <= 9; ++$$9) {
                        this.a($$0, dzs.m.m(), $$9, 3, 1, $$4);
                        this.a($$0, dzs.m.m(), $$9, 3, 9, $$4);
                    }
                    this.a($$0, dzs.m.m(), 5, 1, 4, $$4);
                    this.a($$0, dzs.m.m(), 5, 1, 6, $$4);
                    this.a($$0, dzs.m.m(), 5, 3, 4, $$4);
                    this.a($$0, dzs.m.m(), 5, 3, 6, $$4);
                    this.a($$0, dzs.m.m(), 4, 1, 5, $$4);
                    this.a($$0, dzs.m.m(), 6, 1, 5, $$4);
                    this.a($$0, dzs.m.m(), 4, 3, 5, $$4);
                    this.a($$0, dzs.m.m(), 6, 3, 5, $$4);
                    for (int $$10 = 1; $$10 <= 3; ++$$10) {
                        this.a($$0, dzs.m.m(), 4, $$10, 4, $$4);
                        this.a($$0, dzs.m.m(), 6, $$10, 4, $$4);
                        this.a($$0, dzs.m.m(), 4, $$10, 6, $$4);
                        this.a($$0, dzs.m.m(), 6, $$10, 6, $$4);
                    }
                    this.a($$0, dzs.cM.m(), 5, 3, 5, $$4);
                    for (int $$11 = 2; $$11 <= 8; ++$$11) {
                        this.a($$0, dzs.n.m(), 2, 3, $$11, $$4);
                        this.a($$0, dzs.n.m(), 3, 3, $$11, $$4);
                        if ($$11 <= 3 || $$11 >= 7) {
                            this.a($$0, dzs.n.m(), 4, 3, $$11, $$4);
                            this.a($$0, dzs.n.m(), 5, 3, $$11, $$4);
                            this.a($$0, dzs.n.m(), 6, 3, $$11, $$4);
                        }
                        this.a($$0, dzs.n.m(), 7, 3, $$11, $$4);
                        this.a($$0, dzs.n.m(), 8, 3, $$11, $$4);
                    }
                    eoh $$12 = (eoh)dzs.dm.m().b(eed.b, iz.e);
                    this.a($$0, $$12, 9, 1, 3, $$4);
                    this.a($$0, $$12, 9, 2, 3, $$4);
                    this.a($$0, $$12, 9, 3, 3, $$4);
                    this.a($$0, $$4, $$3, 3, 4, 8, fnv.w);
                }
            }
        }
    }

    public static class o
    extends p {
        private static final int a = 5;
        private static final int b = 11;
        private static final int c = 8;

        public o(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.F, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public o(uz $$0) {
            super(fgf.F, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static @Nullable o a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
            if (!o.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new o($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 7, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 7);
            eoh $$7 = (eoh)dzs.do.m().b(ehz.b, iz.d);
            for (int $$8 = 0; $$8 < 6; ++$$8) {
                this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
                this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
                this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
                if ($$8 >= 5) continue;
                this.a($$0, dzs.fn.m(), 1, 5 - $$8, 1 + $$8, $$4);
                this.a($$0, dzs.fn.m(), 2, 5 - $$8, 1 + $$8, $$4);
                this.a($$0, dzs.fn.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
        }
    }

    public static class l
    extends p {
        private static final int a = 5;
        private static final int b = 11;
        private static final int c = 5;
        private final boolean d;

        public l(fgf $$0, int $$1, int $$2, int $$3, iz $$4) {
            super($$0, $$1, l.a($$2, 64, $$3, $$4, 5, 11, 5));
            this.d = true;
            this.a($$4);
            this.h = p.a.a;
        }

        public l(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.C, $$0, $$2);
            this.d = false;
            this.a($$3);
            this.h = this.b($$1);
        }

        public l(fgf $$0, uz $$1) {
            super($$0, $$1);
            this.d = $$1.b("Source", false);
        }

        public l(uz $$0) {
            this(fgf.C, $$0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Source", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            if (this.d) {
                i = c.class;
            }
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static @Nullable l a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
            if (!l.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new l($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 7, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 4);
            this.a($$0, dzs.fn.m(), 2, 6, 1, $$4);
            this.a($$0, dzs.fn.m(), 1, 5, 1, $$4);
            this.a($$0, dzs.kx.m(), 1, 6, 1, $$4);
            this.a($$0, dzs.fn.m(), 1, 5, 2, $$4);
            this.a($$0, dzs.fn.m(), 1, 4, 3, $$4);
            this.a($$0, dzs.kx.m(), 1, 5, 3, $$4);
            this.a($$0, dzs.fn.m(), 2, 4, 3, $$4);
            this.a($$0, dzs.fn.m(), 3, 3, 3, $$4);
            this.a($$0, dzs.kx.m(), 3, 4, 3, $$4);
            this.a($$0, dzs.fn.m(), 3, 3, 2, $$4);
            this.a($$0, dzs.fn.m(), 3, 2, 1, $$4);
            this.a($$0, dzs.kx.m(), 3, 3, 1, $$4);
            this.a($$0, dzs.fn.m(), 2, 2, 1, $$4);
            this.a($$0, dzs.fn.m(), 1, 1, 1, $$4);
            this.a($$0, dzs.kx.m(), 1, 2, 1, $$4);
            this.a($$0, dzs.fn.m(), 1, 1, 2, $$4);
            this.a($$0, dzs.kx.m(), 1, 1, 3, $$4);
        }
    }

    public static class c
    extends p {
        protected static final int a = 10;
        protected static final int b = 9;
        protected static final int c = 11;
        private final boolean d;
        private final boolean i;
        private final boolean j;
        private final boolean k;

        public c(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.v, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.d = $$1.h();
            this.i = $$1.h();
            this.j = $$1.h();
            this.k = $$1.a(3) > 0;
        }

        public c(uz $$0) {
            super(fgf.v, $$0);
            this.d = $$0.b("leftLow", false);
            this.i = $$0.b("leftHigh", false);
            this.j = $$0.b("rightLow", false);
            this.k = $$0.b("rightHigh", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("leftLow", this.d);
            $$1.a("leftHigh", this.i);
            $$1.a("rightLow", this.j);
            $$1.a("rightHigh", this.k);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            int $$3 = 3;
            int $$4 = 5;
            iz $$5 = this.i();
            if ($$5 == iz.e || $$5 == iz.c) {
                $$3 = 8 - $$3;
                $$4 = 8 - $$4;
            }
            this.a((m)$$0, $$1, $$2, 5, 1);
            if (this.d) {
                this.b((m)$$0, $$1, $$2, $$3, 1);
            }
            if (this.i) {
                this.b((m)$$0, $$1, $$2, $$4, 7);
            }
            if (this.j) {
                this.c((m)$$0, $$1, $$2, $$3, 1);
            }
            if (this.k) {
                this.c((m)$$0, $$1, $$2, $$4, 7);
            }
        }

        public static @Nullable c a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
            if (!fig$c.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new c($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 3, 0);
            if (this.d) {
                this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
            }
            if (this.j) {
                this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
            }
            if (this.i) {
                this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
            }
            if (this.k) {
                this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
            }
            this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
            this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, k);
            this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, k);
            this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, k);
            this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, k);
            this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, k);
            this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, k);
            this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dzs.kx.m(), dzs.kx.m(), false);
            this.a($$0, $$4, 5, 5, 7, 7, 5, 9, (eoh)dzs.kx.m().b(ehi.b, epq.c), (eoh)dzs.kx.m().b(ehi.b, epq.c), false);
            this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.d), 6, 5, 6, $$4);
        }
    }

    public static class a
    extends p {
        private static final int a = 5;
        private static final int b = 5;
        private static final int c = 7;
        private boolean d;

        public a(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.t, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
        }

        public a(uz $$0) {
            super(fgf.t, $$0);
            this.d = $$0.b("Chest", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Chest", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((m)$$0, $$1, $$2, 1, 1);
        }

        public static @Nullable a a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
            if (!fig$a.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new a($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 1, 1, 0);
            this.a($$0, $$3, $$4, p.a.a, 1, 1, 6);
            this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dzs.fn.m(), dzs.fn.m(), false);
            this.a($$0, dzs.kD.m(), 3, 1, 1, $$4);
            this.a($$0, dzs.kD.m(), 3, 1, 5, $$4);
            this.a($$0, dzs.kD.m(), 3, 2, 2, $$4);
            this.a($$0, dzs.kD.m(), 3, 2, 4, $$4);
            for (int $$7 = 2; $$7 <= 4; ++$$7) {
                this.a($$0, dzs.kD.m(), 2, 1, $$7, $$4);
            }
            if (!this.d && $$4.b(this.b(3, 2, 3))) {
                this.d = true;
                this.a($$0, $$4, $$3, 3, 2, 3, fnv.x);
            }
        }
    }

    public static class e
    extends p {
        protected static final int a = 14;
        protected static final int b = 6;
        protected static final int c = 11;
        protected static final int d = 15;
        private final boolean i;

        public e(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.x, $$0, $$2);
            this.a($$3);
            this.h = this.b($$1);
            this.i = $$2.e() > 6;
        }

        public e(uz $$0) {
            super(fgf.x, $$0);
            this.i = $$0.b("Tall", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Tall", this.i);
        }

        public static @Nullable e a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
            if (!(fig$e.a($$7) && $$0.a($$7) == null || fig$e.a($$7 = ffg.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5)) && $$0.a($$7) == null)) {
                return null;
            }
            return new e($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            int $$7 = 11;
            if (!this.i) {
                $$7 = 6;
            }
            this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, k);
            this.a($$0, $$3, $$4, this.h, 4, 1, 0);
            this.a($$0, $$4, $$3, 0.07f, 2, 1, 1, 11, 4, 13, dzs.bz.m(), dzs.bz.m(), false, false);
            boolean $$8 = true;
            int $$9 = 12;
            for (int $$10 = 1; $$10 <= 13; ++$$10) {
                if (($$10 - 1) % 4 == 0) {
                    this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dzs.n.m(), dzs.n.m(), false);
                    this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dzs.n.m(), dzs.n.m(), false);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.f), 2, 3, $$10, $$4);
                    this.a($$0, (eoh)dzs.cM.m().b(ejn.e, iz.e), 11, 3, $$10, $$4);
                    if (!this.i) continue;
                    this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dzs.n.m(), dzs.n.m(), false);
                    this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dzs.n.m(), dzs.n.m(), false);
                    continue;
                }
                this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dzs.cv.m(), dzs.cv.m(), false);
                this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dzs.cv.m(), dzs.cv.m(), false);
                if (!this.i) continue;
                this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dzs.cv.m(), dzs.cv.m(), false);
                this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dzs.cv.m(), dzs.cv.m(), false);
            }
            for (int $$11 = 3; $$11 < 12; $$11 += 2) {
                this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dzs.cv.m(), dzs.cv.m(), false);
                this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dzs.cv.m(), dzs.cv.m(), false);
                this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dzs.cv.m(), dzs.cv.m(), false);
            }
            if (this.i) {
                this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dzs.n.m(), dzs.n.m(), false);
                this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dzs.n.m(), dzs.n.m(), false);
                this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dzs.n.m(), dzs.n.m(), false);
                this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dzs.n.m(), dzs.n.m(), false);
                this.a($$0, dzs.n.m(), 9, 5, 11, $$4);
                this.a($$0, dzs.n.m(), 8, 5, 11, $$4);
                this.a($$0, dzs.n.m(), 9, 5, 10, $$4);
                eoh $$12 = (eoh)((eoh)dzs.ex.m().b(ect.d, true)).b(ect.b, true);
                eoh $$13 = (eoh)((eoh)dzs.ex.m().b(ect.a, true)).b(ect.c, true);
                this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
                this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
                this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
                this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
                this.a($$0, (eoh)((eoh)dzs.ex.m().b(ect.a, true)).b(ect.b, true), 3, 6, 2, $$4);
                this.a($$0, (eoh)((eoh)dzs.ex.m().b(ect.c, true)).b(ect.b, true), 3, 6, 12, $$4);
                this.a($$0, (eoh)((eoh)dzs.ex.m().b(ect.a, true)).b(ect.d, true), 10, 6, 2, $$4);
                for (int $$14 = 0; $$14 <= 2; ++$$14) {
                    this.a($$0, (eoh)((eoh)dzs.ex.m().b(ect.c, true)).b(ect.d, true), 8 + $$14, 6, 12 - $$14, $$4);
                    if ($$14 == 2) continue;
                    this.a($$0, (eoh)((eoh)dzs.ex.m().b(ect.a, true)).b(ect.b, true), 8 + $$14, 6, 11 - $$14, $$4);
                }
                eoh $$15 = (eoh)dzs.dm.m().b(eed.b, iz.d);
                this.a($$0, $$15, 10, 1, 13, $$4);
                this.a($$0, $$15, 10, 2, 13, $$4);
                this.a($$0, $$15, 10, 3, 13, $$4);
                this.a($$0, $$15, 10, 4, 13, $$4);
                this.a($$0, $$15, 10, 5, 13, $$4);
                this.a($$0, $$15, 10, 6, 13, $$4);
                this.a($$0, $$15, 10, 7, 13, $$4);
                int $$16 = 7;
                int $$17 = 7;
                eoh $$18 = (eoh)dzs.ex.m().b(ect.b, true);
                this.a($$0, $$18, 6, 9, 7, $$4);
                eoh $$19 = (eoh)dzs.ex.m().b(ect.d, true);
                this.a($$0, $$19, 7, 9, 7, $$4);
                this.a($$0, $$18, 6, 8, 7, $$4);
                this.a($$0, $$19, 7, 8, 7, $$4);
                eoh $$20 = (eoh)((eoh)$$13.b(ect.d, true)).b(ect.b, true);
                this.a($$0, $$20, 6, 7, 7, $$4);
                this.a($$0, $$20, 7, 7, 7, $$4);
                this.a($$0, $$18, 5, 7, 7, $$4);
                this.a($$0, $$19, 8, 7, 7, $$4);
                this.a($$0, (eoh)$$18.b(ect.a, true), 6, 7, 6, $$4);
                this.a($$0, (eoh)$$18.b(ect.c, true), 6, 7, 8, $$4);
                this.a($$0, (eoh)$$19.b(ect.a, true), 7, 7, 6, $$4);
                this.a($$0, (eoh)$$19.b(ect.c, true), 7, 7, 8, $$4);
                eoh $$21 = dzs.cL.m();
                this.a($$0, $$21, 5, 8, 7, $$4);
                this.a($$0, $$21, 8, 8, 7, $$4);
                this.a($$0, $$21, 6, 8, 6, $$4);
                this.a($$0, $$21, 6, 8, 8, $$4);
                this.a($$0, $$21, 7, 8, 6, $$4);
                this.a($$0, $$21, 7, 8, 8, $$4);
            }
            this.a($$0, $$4, $$3, 3, 3, 5, fnv.v);
            if (this.i) {
                this.a($$0, e, 12, 9, 1, $$4);
                this.a($$0, $$4, $$3, 12, 8, 1, fnv.v);
            }
        }
    }

    public static class g
    extends p {
        protected static final int a = 11;
        protected static final int b = 8;
        protected static final int c = 16;
        private boolean d;

        public g(int $$0, ffg $$1, iz $$2) {
            super(fgf.y, $$0, $$1);
            this.a($$2);
        }

        public g(uz $$0) {
            super(fgf.y, $$0);
            this.d = $$0.b("Mob", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Mob", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            if ($$0 != null) {
                ((m)$$0).b = this;
            }
        }

        public static @Nullable g a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
            if (!fig$g.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new g($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            is.a $$22;
            this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, k);
            this.a($$0, $$3, $$4, p.a.c, 4, 1, 0);
            int $$7 = 6;
            this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, k);
            this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, k);
            this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, k);
            this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, k);
            this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, k);
            this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, k);
            this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dzs.K.m(), dzs.K.m(), false);
            this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dzs.K.m(), dzs.K.m(), false);
            this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, k);
            this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dzs.K.m(), dzs.K.m(), false);
            eoh $$8 = (eoh)((eoh)dzs.fC.m().b(edy.a, true)).b(edy.c, true);
            eoh $$9 = (eoh)((eoh)dzs.fC.m().b(edy.d, true)).b(edy.b, true);
            for (int $$10 = 3; $$10 < 14; $$10 += 2) {
                this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
                this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
            }
            for (int $$11 = 2; $$11 < 9; $$11 += 2) {
                this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
            }
            eoh $$12 = (eoh)dzs.fS.m().b(ehz.b, iz.c);
            this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, k);
            this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, k);
            this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, k);
            for (int $$13 = 4; $$13 <= 6; ++$$13) {
                this.a($$0, $$12, $$13, 1, 4, $$4);
                this.a($$0, $$12, $$13, 2, 5, $$4);
                this.a($$0, $$12, $$13, 3, 6, $$4);
            }
            eoh $$14 = (eoh)dzs.gn.m().b(eck.b, iz.c);
            eoh $$15 = (eoh)dzs.gn.m().b(eck.b, iz.d);
            eoh $$16 = (eoh)dzs.gn.m().b(eck.b, iz.f);
            eoh $$17 = (eoh)dzs.gn.m().b(eck.b, iz.e);
            boolean $$18 = true;
            boolean[] $$19 = new boolean[12];
            for (int $$20 = 0; $$20 < $$19.length; ++$$20) {
                $$19[$$20] = $$3.i() > 0.9f;
                $$18 &= $$19[$$20];
            }
            this.a($$0, (eoh)$$14.b(eck.c, $$19[0]), 4, 3, 8, $$4);
            this.a($$0, (eoh)$$14.b(eck.c, $$19[1]), 5, 3, 8, $$4);
            this.a($$0, (eoh)$$14.b(eck.c, $$19[2]), 6, 3, 8, $$4);
            this.a($$0, (eoh)$$15.b(eck.c, $$19[3]), 4, 3, 12, $$4);
            this.a($$0, (eoh)$$15.b(eck.c, $$19[4]), 5, 3, 12, $$4);
            this.a($$0, (eoh)$$15.b(eck.c, $$19[5]), 6, 3, 12, $$4);
            this.a($$0, (eoh)$$16.b(eck.c, $$19[6]), 3, 3, 9, $$4);
            this.a($$0, (eoh)$$16.b(eck.c, $$19[7]), 3, 3, 10, $$4);
            this.a($$0, (eoh)$$16.b(eck.c, $$19[8]), 3, 3, 11, $$4);
            this.a($$0, (eoh)$$17.b(eck.c, $$19[9]), 7, 3, 9, $$4);
            this.a($$0, (eoh)$$17.b(eck.c, $$19[10]), 7, 3, 10, $$4);
            this.a($$0, (eoh)$$17.b(eck.c, $$19[11]), 7, 3, 11, $$4);
            if ($$18) {
                eoh $$21 = dzs.gm.m();
                this.a($$0, $$21, 4, 3, 9, $$4);
                this.a($$0, $$21, 5, 3, 9, $$4);
                this.a($$0, $$21, 6, 3, 9, $$4);
                this.a($$0, $$21, 4, 3, 10, $$4);
                this.a($$0, $$21, 5, 3, 10, $$4);
                this.a($$0, $$21, 6, 3, 10, $$4);
                this.a($$0, $$21, 4, 3, 11, $$4);
                this.a($$0, $$21, 5, 3, 11, $$4);
                this.a($$0, $$21, 6, 3, 11, $$4);
            }
            if (!this.d && $$4.b($$22 = this.b(5, 3, 6))) {
                this.d = true;
                $$0.a((is)$$22, dzs.cP.m(), 2);
                elb $$23 = $$0.c_($$22);
                if ($$23 instanceof emw) {
                    emw $$24 = (emw)$$23;
                    $$24.a(cgu.bm, $$3);
                }
            }
        }
    }

    static abstract class p
    extends ffs {
        protected a h = a.a;

        protected p(fgf $$0, int $$1, ffg $$2) {
            super($$0, $$1, $$2);
        }

        public p(fgf $$0, uz $$1) {
            super($$0, $$1);
            this.h = $$1.a("EntryDoor", a.e).orElseThrow();
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            $$1.a("EntryDoor", a.e, this.h);
        }

        protected void a(dxn $$0, bgr $$1, ffg $$2, a $$3, int $$4, int $$5, int $$6) {
            switch ($$3.ordinal()) {
                case 0: {
                    this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
                    break;
                }
                case 1: {
                    this.a($$0, dzs.fn.m(), $$4, $$5, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5, $$6, $$2);
                    this.a($$0, dzs.dl.m(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, (eoh)dzs.dl.m().b(ebz.c, epd.a), $$4 + 1, $$5 + 1, $$6, $$2);
                    break;
                }
                case 2: {
                    this.a($$0, dzs.nZ.m(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, dzs.nZ.m(), $$4 + 1, $$5 + 1, $$6, $$2);
                    this.a($$0, (eoh)dzs.fC.m().b(edy.d, true), $$4, $$5, $$6, $$2);
                    this.a($$0, (eoh)dzs.fC.m().b(edy.d, true), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.b, true)).b(edy.d, true), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.b, true)).b(edy.d, true), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, (eoh)((eoh)dzs.fC.m().b(edy.b, true)).b(edy.d, true), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, (eoh)dzs.fC.m().b(edy.b, true), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, (eoh)dzs.fC.m().b(edy.b, true), $$4 + 2, $$5, $$6, $$2);
                    break;
                }
                case 3: {
                    this.a($$0, dzs.fn.m(), $$4, $$5, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4, $$5 + 1, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 1, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5 + 2, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5 + 1, $$6, $$2);
                    this.a($$0, dzs.fn.m(), $$4 + 2, $$5, $$6, $$2);
                    this.a($$0, dzs.dZ.m(), $$4 + 1, $$5, $$6, $$2);
                    this.a($$0, (eoh)dzs.dZ.m().b(ebz.c, epd.a), $$4 + 1, $$5 + 1, $$6, $$2);
                    this.a($$0, (eoh)dzs.eo.m().b(eab.f, iz.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
                    this.a($$0, (eoh)dzs.eo.m().b(eab.f, iz.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
                }
            }
        }

        protected a b(bgr $$0) {
            int $$1 = $$0.a(5);
            switch ($$1) {
                default: {
                    return a.a;
                }
                case 2: {
                    return a.b;
                }
                case 3: {
                    return a.c;
                }
                case 4: 
            }
            return a.d;
        }

        protected @Nullable ffs a(m $$0, fft $$1, bgr $$2, int $$3, int $$4) {
            iz $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
                    }
                    case d: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
                    }
                    case e: {
                        return fig.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
                    }
                    case f: {
                        return fig.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
                    }
                }
            }
            return null;
        }

        protected @Nullable ffs b(m $$0, fft $$1, bgr $$2, int $$3, int $$4) {
            iz $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return fig.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iz.e, this.g());
                    }
                    case d: {
                        return fig.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iz.e, this.g());
                    }
                    case e: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iz.c, this.g());
                    }
                    case f: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iz.c, this.g());
                    }
                }
            }
            return null;
        }

        protected @Nullable ffs c(m $$0, fft $$1, bgr $$2, int $$3, int $$4) {
            iz $$5 = this.i();
            if ($$5 != null) {
                switch ($$5) {
                    case c: {
                        return fig.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iz.f, this.g());
                    }
                    case d: {
                        return fig.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iz.f, this.g());
                    }
                    case e: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iz.d, this.g());
                    }
                    case f: {
                        return fig.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iz.d, this.g());
                    }
                }
            }
            return null;
        }

        protected static boolean a(ffg $$0) {
            return $$0.i() > 10;
        }

        protected static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            public static final /* enum */ a c = new a();
            public static final /* enum */ a d = new a();
            @Deprecated
            public static final Codec<a> e;
            private static final /* synthetic */ a[] f;

            public static a[] values() {
                return (a[])f.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d};
            }

            static {
                f = fig$p$a.a();
                e = bfm.c(a::valueOf);
            }
        }
    }

    public static class m
    extends l {
        public @Nullable f a;
        public @Nullable g b;
        public final List<ffs> c = Lists.newArrayList();

        public m(bgr $$0, int $$1, int $$2) {
            super(fgf.D, 0, $$1, $$2, m.a($$0));
        }

        public m(uz $$0) {
            super(fgf.D, $$0);
        }

        @Override
        public is h() {
            if (this.b != null) {
                return this.b.h();
            }
            return super.h();
        }
    }

    public static class b
    extends p {
        private final int a;

        public b(int $$0, ffg $$1, iz $$2) {
            super(fgf.u, $$0, $$1);
            this.a($$2);
            this.a = $$2 == iz.c || $$2 == iz.d ? $$1.f() : $$1.d();
        }

        public b(uz $$0) {
            super(fgf.u, $$0);
            this.a = $$0.b("Steps", 0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Steps", this.a);
        }

        public static @Nullable ffg a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5) {
            int $$6 = 3;
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
            ffs $$8 = $$0.a($$7);
            if ($$8 == null) {
                return null;
            }
            if ($$8.f().i() == $$7.i()) {
                for (int $$9 = 2; $$9 >= 1; --$$9) {
                    $$7 = ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                    if ($$8.f().a($$7)) continue;
                    return ffg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                }
            }
            return null;
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            for (int $$7 = 0; $$7 < this.a; ++$$7) {
                this.a($$0, dzs.fn.m(), 0, 0, $$7, $$4);
                this.a($$0, dzs.fn.m(), 1, 0, $$7, $$4);
                this.a($$0, dzs.fn.m(), 2, 0, $$7, $$4);
                this.a($$0, dzs.fn.m(), 3, 0, $$7, $$4);
                this.a($$0, dzs.fn.m(), 4, 0, $$7, $$4);
                for (int $$8 = 1; $$8 <= 3; ++$$8) {
                    this.a($$0, dzs.fn.m(), 0, $$8, $$7, $$4);
                    this.a($$0, dzs.nZ.m(), 1, $$8, $$7, $$4);
                    this.a($$0, dzs.nZ.m(), 2, $$8, $$7, $$4);
                    this.a($$0, dzs.nZ.m(), 3, $$8, $$7, $$4);
                    this.a($$0, dzs.fn.m(), 4, $$8, $$7, $$4);
                }
                this.a($$0, dzs.fn.m(), 0, 4, $$7, $$4);
                this.a($$0, dzs.fn.m(), 1, 4, $$7, $$4);
                this.a($$0, dzs.fn.m(), 2, 4, $$7, $$4);
                this.a($$0, dzs.fn.m(), 3, 4, $$7, $$4);
                this.a($$0, dzs.fn.m(), 4, 4, $$7, $$4);
            }
        }
    }

    static class k
    extends ffs.a {
        k() {
        }

        @Override
        public void a(bgr $$0, int $$1, int $$2, int $$3, boolean $$4) {
            float $$5;
            this.a = $$4 ? (($$5 = $$0.i()) < 0.2f ? dzs.fp.m() : ($$5 < 0.5f ? dzs.fo.m() : ($$5 < 0.55f ? dzs.fv.m() : dzs.fn.m()))) : dzs.nZ.m();
        }
    }

    public static abstract class q
    extends p {
        protected static final int a = 5;
        protected static final int b = 5;
        protected static final int c = 5;

        protected q(fgf $$0, int $$1, ffg $$2) {
            super($$0, $$1, $$2);
        }

        public q(fgf $$0, uz $$1) {
            super($$0, $$1);
        }
    }
}

