/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fhu {
    private static final int b = 30;
    private static final int c = 10;
    public static final int a = 64;
    static final n[] d = new n[]{new n(c.class, 30, 0, true), new n(a.class, 10, 4), new n(o.class, 10, 4), new n(p.class, 10, 3), new n(l.class, 5, 2), new n(f.class, 5, 1)};
    static final n[] e = new n[]{new n(i.class, 25, 0, true), new n(g.class, 15, 5), new n(j.class, 5, 10), new n(h.class, 5, 10), new n(d.class, 10, 3, true), new n(e.class, 7, 2), new n(k.class, 5, 2)};

    static @Nullable m a(n $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7) {
        Class<? extends m> $$8 = $$0.a;
        m $$9 = null;
        if ($$8 == c.class) {
            $$9 = fhu$c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == a.class) {
            $$9 = fhu$a.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == o.class) {
            $$9 = o.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == p.class) {
            $$9 = p.a($$1, $$3, $$4, $$5, $$7, $$6);
        } else if ($$8 == l.class) {
            $$9 = l.a($$1, $$3, $$4, $$5, $$7, $$6);
        } else if ($$8 == f.class) {
            $$9 = f.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == i.class) {
            $$9 = i.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == j.class) {
            $$9 = j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == h.class) {
            $$9 = h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == d.class) {
            $$9 = fhu$d.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == e.class) {
            $$9 = fhu$e.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == g.class) {
            $$9 = g.a($$1, $$3, $$4, $$5, $$6, $$7);
        } else if ($$8 == k.class) {
            $$9 = k.a($$1, $$3, $$4, $$5, $$6, $$7);
        }
        return $$9;
    }

    static class n {
        public final Class<? extends m> a;
        public final int b;
        public int c;
        public final int d;
        public final boolean e;

        public n(Class<? extends m> $$0, int $$1, int $$2, boolean $$3) {
            this.a = $$0;
            this.b = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public n(Class<? extends m> $$0, int $$1, int $$2) {
            this($$0, $$1, $$2, false);
        }

        public boolean a(int $$0) {
            return this.d == 0 || this.c < this.d;
        }

        public boolean a() {
            return this.d == 0 || this.c < this.d;
        }
    }

    public static class c
    extends m {
        private static final int a = 5;
        private static final int b = 10;
        private static final int c = 19;

        public c(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.g, $$0, $$2);
            this.a($$3);
        }

        public c(uz $$0) {
            super(fgf.g, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 1, 3, false);
        }

        public static @Nullable c a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 19, $$5);
            if (!fhu$c.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new c($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 3, 0, 4, 4, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 5, 0, 3, 7, 18, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 5, 0, 0, 5, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 5, 0, 4, 5, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 4, 2, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 13, 4, 2, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 0, 0, 4, 1, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 0, 15, 4, 1, 18, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$7 = 0; $$7 <= 4; ++$$7) {
                for (int $$8 = 0; $$8 <= 2; ++$$8) {
                    this.b($$0, dzs.gc.m(), $$7, -1, $$8, $$4);
                    this.b($$0, dzs.gc.m(), $$7, -1, 18 - $$8, $$4);
                }
            }
            eoh $$9 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            eoh $$10 = (eoh)$$9.b(ect.b, true);
            eoh $$11 = (eoh)$$9.b(ect.d, true);
            this.a($$0, $$4, 0, 1, 1, 0, 4, 1, $$10, $$10, false);
            this.a($$0, $$4, 0, 3, 4, 0, 4, 4, $$10, $$10, false);
            this.a($$0, $$4, 0, 3, 14, 0, 4, 14, $$10, $$10, false);
            this.a($$0, $$4, 0, 1, 17, 0, 4, 17, $$10, $$10, false);
            this.a($$0, $$4, 4, 1, 1, 4, 4, 1, $$11, $$11, false);
            this.a($$0, $$4, 4, 3, 4, 4, 4, 4, $$11, $$11, false);
            this.a($$0, $$4, 4, 3, 14, 4, 4, 14, $$11, $$11, false);
            this.a($$0, $$4, 4, 1, 17, 4, 4, 17, $$11, $$11, false);
        }
    }

    public static class a
    extends m {
        private static final int a = 19;
        private static final int b = 10;
        private static final int c = 19;

        public a(int $$0, ffg $$1, iz $$2) {
            super(fgf.e, $$0, $$1);
            this.a($$2);
        }

        protected a(int $$0, int $$1, iz $$2) {
            super(fgf.e, 0, ffs.a($$0, 64, $$1, $$2, 19, 10, 19));
            this.a($$2);
        }

        protected a(fgf $$0, uz $$1) {
            super($$0, $$1);
        }

        public a(uz $$0) {
            this(fgf.e, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 8, 3, false);
            this.b((q)$$0, $$1, $$2, 3, 8, false);
            this.c((q)$$0, $$1, $$2, 3, 8, false);
        }

        public static @Nullable a a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -8, -3, 0, 19, 10, 19, $$4);
            if (!fhu$a.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new a($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 7, 3, 0, 11, 4, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 3, 7, 18, 4, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 5, 0, 10, 7, 18, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 5, 8, 18, 7, 10, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 7, 5, 0, 7, 5, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 7, 5, 11, 7, 5, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 0, 11, 5, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 11, 11, 5, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 7, 7, 5, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 7, 18, 5, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 11, 7, 5, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 11, 18, 5, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 7, 2, 0, 11, 2, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 7, 2, 13, 11, 2, 18, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 7, 0, 0, 11, 1, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 7, 0, 15, 11, 1, 18, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$7 = 7; $$7 <= 11; ++$$7) {
                for (int $$8 = 0; $$8 <= 2; ++$$8) {
                    this.b($$0, dzs.gc.m(), $$7, -1, $$8, $$4);
                    this.b($$0, dzs.gc.m(), $$7, -1, 18 - $$8, $$4);
                }
            }
            this.a($$0, $$4, 0, 2, 7, 5, 2, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 13, 2, 7, 18, 2, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 0, 7, 3, 1, 11, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 15, 0, 7, 18, 1, 11, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$9 = 0; $$9 <= 2; ++$$9) {
                for (int $$10 = 7; $$10 <= 11; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$9, -1, $$10, $$4);
                    this.b($$0, dzs.gc.m(), 18 - $$9, -1, $$10, $$4);
                }
            }
        }
    }

    public static class o
    extends m {
        private static final int a = 7;
        private static final int b = 9;
        private static final int c = 7;

        public o(int $$0, ffg $$1, iz $$2) {
            super(fgf.q, $$0, $$1);
            this.a($$2);
        }

        public o(uz $$0) {
            super(fgf.q, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 2, 0, false);
            this.b((q)$$0, $$1, $$2, 0, 2, false);
            this.c((q)$$0, $$1, $$2, 0, 2, false);
        }

        public static @Nullable o a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -2, 0, 0, 7, 9, 7, $$4);
            if (!o.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new o($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 6, 7, 6, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 2, 0, 1, 6, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 6, 1, 6, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 2, 0, 6, 6, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 2, 6, 6, 6, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 0, 6, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 5, 0, 6, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 2, 0, 6, 6, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 2, 5, 6, 6, 6, dzs.gc.m(), dzs.gc.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, $$4, 2, 6, 0, 4, 6, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
            this.a($$0, $$4, 2, 6, 6, 4, 6, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 6, 4, 5, 6, $$7, $$7, false);
            this.a($$0, $$4, 0, 6, 2, 0, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 2, 0, 5, 4, $$8, $$8, false);
            this.a($$0, $$4, 6, 6, 2, 6, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 5, 2, 6, 5, 4, $$8, $$8, false);
            for (int $$9 = 0; $$9 <= 6; ++$$9) {
                for (int $$10 = 0; $$10 <= 6; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$9, -1, $$10, $$4);
                }
            }
        }
    }

    public static class p
    extends m {
        private static final int a = 7;
        private static final int b = 11;
        private static final int c = 7;

        public p(int $$0, ffg $$1, iz $$2) {
            super(fgf.r, $$0, $$1);
            this.a($$2);
        }

        public p(uz $$0) {
            super(fgf.r, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.c((q)$$0, $$1, $$2, 6, 2, false);
        }

        public static @Nullable p a(fft $$0, int $$1, int $$2, int $$3, int $$4, iz $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -2, 0, 0, 7, 11, 7, $$5);
            if (!p.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new p($$4, $$6, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 6, 10, 6, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 2, 0, 1, 8, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 2, 0, 6, 8, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 1, 0, 8, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 2, 1, 6, 8, 6, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 2, 6, 5, 8, 6, dzs.gc.m(), dzs.gc.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, $$4, 0, 3, 2, 0, 5, 4, $$8, $$8, false);
            this.a($$0, $$4, 6, 3, 2, 6, 5, 2, $$8, $$8, false);
            this.a($$0, $$4, 6, 3, 4, 6, 5, 4, $$8, $$8, false);
            this.a($$0, dzs.gc.m(), 5, 2, 5, $$4);
            this.a($$0, $$4, 4, 2, 5, 4, 3, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 3, 2, 5, 3, 4, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 2, 5, 2, 5, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 2, 5, 1, 6, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 7, 1, 5, 7, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 8, 2, 6, 8, 4, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 2, 6, 0, 4, 8, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
            for (int $$9 = 0; $$9 <= 6; ++$$9) {
                for (int $$10 = 0; $$10 <= 6; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$9, -1, $$10, $$4);
                }
            }
        }
    }

    public static class l
    extends m {
        private static final int a = 7;
        private static final int b = 8;
        private static final int c = 9;
        private boolean d;

        public l(int $$0, ffg $$1, iz $$2) {
            super(fgf.p, $$0, $$1);
            this.a($$2);
        }

        public l(uz $$0) {
            super(fgf.p, $$0);
            this.d = $$0.b("Mob", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Mob", this.d);
        }

        public static @Nullable l a(fft $$0, int $$1, int $$2, int $$3, int $$4, iz $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -2, 0, 0, 7, 8, 9, $$5);
            if (!l.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new l($$4, $$6, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            is.a $$9;
            this.a($$0, $$4, 0, 2, 0, 6, 7, 7, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 1, 0, 0, 5, 1, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 2, 1, 5, 2, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 3, 2, 5, 3, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 4, 3, 5, 4, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 2, 0, 1, 4, 2, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 2, 0, 5, 4, 2, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 5, 2, 1, 5, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 5, 2, 5, 5, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 3, 0, 5, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 5, 3, 6, 5, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 5, 8, 5, 5, 8, dzs.gc.m(), dzs.gc.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, (eoh)dzs.gd.m().b(ect.d, true), 1, 6, 3, $$4);
            this.a($$0, (eoh)dzs.gd.m().b(ect.b, true), 5, 6, 3, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.b, true)).b(ect.a, true), 0, 6, 3, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.a, true), 6, 6, 3, $$4);
            this.a($$0, $$4, 0, 6, 4, 0, 6, 7, $$8, $$8, false);
            this.a($$0, $$4, 6, 6, 4, 6, 6, 7, $$8, $$8, false);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.b, true)).b(ect.c, true), 0, 6, 8, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.c, true), 6, 6, 8, $$4);
            this.a($$0, $$4, 1, 6, 8, 5, 6, 8, $$7, $$7, false);
            this.a($$0, (eoh)dzs.gd.m().b(ect.b, true), 1, 7, 8, $$4);
            this.a($$0, $$4, 2, 7, 8, 4, 7, 8, $$7, $$7, false);
            this.a($$0, (eoh)dzs.gd.m().b(ect.d, true), 5, 7, 8, $$4);
            this.a($$0, (eoh)dzs.gd.m().b(ect.b, true), 2, 8, 8, $$4);
            this.a($$0, $$7, 3, 8, 8, $$4);
            this.a($$0, (eoh)dzs.gd.m().b(ect.d, true), 4, 8, 8, $$4);
            if (!this.d && $$4.b($$9 = this.b(3, 5, 5))) {
                this.d = true;
                $$0.a((is)$$9, dzs.cP.m(), 2);
                elb $$10 = $$0.c_($$9);
                if ($$10 instanceof emw) {
                    emw $$11 = (emw)$$10;
                    $$11.a(cgu.q, $$3);
                }
            }
            for (int $$12 = 0; $$12 <= 6; ++$$12) {
                for (int $$13 = 0; $$13 <= 6; ++$$13) {
                    this.b($$0, dzs.gc.m(), $$12, -1, $$13, $$4);
                }
            }
        }
    }

    public static class f
    extends m {
        private static final int a = 13;
        private static final int b = 14;
        private static final int c = 13;

        public f(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.j, $$0, $$2);
            this.a($$3);
        }

        public f(uz $$0) {
            super(fgf.j, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 5, 3, true);
        }

        public static @Nullable f a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -5, -3, 0, 13, 14, 13, $$5);
            if (!f.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new f($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 8, 0, 7, 8, 0, dzs.gd.m(), dzs.gd.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            for (int $$9 = 1; $$9 <= 11; $$9 += 2) {
                this.a($$0, $$4, $$9, 10, 0, $$9, 11, 0, $$7, $$7, false);
                this.a($$0, $$4, $$9, 10, 12, $$9, 11, 12, $$7, $$7, false);
                this.a($$0, $$4, 0, 10, $$9, 0, 11, $$9, $$8, $$8, false);
                this.a($$0, $$4, 12, 10, $$9, 12, 11, $$9, $$8, $$8, false);
                this.a($$0, dzs.gc.m(), $$9, 13, 0, $$4);
                this.a($$0, dzs.gc.m(), $$9, 13, 12, $$4);
                this.a($$0, dzs.gc.m(), 0, 13, $$9, $$4);
                this.a($$0, dzs.gc.m(), 12, 13, $$9, $$4);
                if ($$9 == 11) continue;
                this.a($$0, $$7, $$9 + 1, 13, 0, $$4);
                this.a($$0, $$7, $$9 + 1, 13, 12, $$4);
                this.a($$0, $$8, 0, 13, $$9 + 1, $$4);
                this.a($$0, $$8, 12, 13, $$9 + 1, $$4);
            }
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.b, true), 0, 13, 0, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.c, true)).b(ect.b, true), 0, 13, 12, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.c, true)).b(ect.d, true), 12, 13, 12, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.d, true), 12, 13, 0, $$4);
            for (int $$10 = 3; $$10 <= 9; $$10 += 2) {
                this.a($$0, $$4, 1, 7, $$10, 1, 8, $$10, (eoh)$$8.b(ect.d, true), (eoh)$$8.b(ect.d, true), false);
                this.a($$0, $$4, 11, 7, $$10, 11, 8, $$10, (eoh)$$8.b(ect.b, true), (eoh)$$8.b(ect.b, true), false);
            }
            this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$11 = 4; $$11 <= 8; ++$$11) {
                for (int $$12 = 0; $$12 <= 2; ++$$12) {
                    this.b($$0, dzs.gc.m(), $$11, -1, $$12, $$4);
                    this.b($$0, dzs.gc.m(), $$11, -1, 12 - $$12, $$4);
                }
            }
            for (int $$13 = 0; $$13 <= 2; ++$$13) {
                for (int $$14 = 4; $$14 <= 8; ++$$14) {
                    this.b($$0, dzs.gc.m(), $$13, -1, $$14, $$4);
                    this.b($$0, dzs.gc.m(), 12 - $$13, -1, $$14, $$4);
                }
            }
            this.a($$0, $$4, 5, 5, 5, 7, 5, 7, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 1, 6, 6, 4, 6, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, dzs.gc.m(), 6, 0, 6, $$4);
            this.a($$0, dzs.K.m(), 6, 5, 6, $$4);
            is.a $$15 = this.b(6, 5, 6);
            if ($$4.b($$15)) {
                $$0.a((is)$$15, flc.e, 0);
            }
        }
    }

    public static class i
    extends m {
        private static final int a = 5;
        private static final int b = 7;
        private static final int c = 5;

        public i(int $$0, ffg $$1, iz $$2) {
            super(fgf.m, $$0, $$1);
            this.a($$2);
        }

        public i(uz $$0) {
            super(fgf.m, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 1, 0, true);
        }

        public static @Nullable i a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
            if (!i.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new i($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dzs.a.m(), dzs.a.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$7, $$7, false);
            this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$7, $$7, false);
            this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$7, $$7, false);
            this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$7, $$7, false);
            this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$8 = 0; $$8 <= 4; ++$$8) {
                for (int $$9 = 0; $$9 <= 4; ++$$9) {
                    this.b($$0, dzs.gc.m(), $$8, -1, $$9, $$4);
                }
            }
        }
    }

    public static class j
    extends m {
        private static final int a = 5;
        private static final int b = 7;
        private static final int c = 5;
        private boolean d;

        public j(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.n, $$0, $$2);
            this.a($$3);
            this.d = $$1.a(3) == 0;
        }

        public j(uz $$0) {
            super(fgf.n, $$0);
            this.d = $$0.b("Chest", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Chest", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.c((q)$$0, $$1, $$2, 0, 1, true);
        }

        public static @Nullable j a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
            if (!j.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new j($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dzs.a.m(), dzs.a.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$8, $$8, false);
            this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$8, $$8, false);
            this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 2, 4, 4, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
            this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
            if (this.d && $$4.b(this.b(1, 2, 3))) {
                this.d = false;
                this.a($$0, $$4, $$3, 1, 2, 3, fnv.u);
            }
            this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$9 = 0; $$9 <= 4; ++$$9) {
                for (int $$10 = 0; $$10 <= 4; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$9, -1, $$10, $$4);
                }
            }
        }
    }

    public static class h
    extends m {
        private static final int a = 5;
        private static final int b = 7;
        private static final int c = 5;
        private boolean d;

        public h(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.l, $$0, $$2);
            this.a($$3);
            this.d = $$1.a(3) == 0;
        }

        public h(uz $$0) {
            super(fgf.l, $$0);
            this.d = $$0.b("Chest", false);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Chest", this.d);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.b((q)$$0, $$1, $$2, 0, 1, true);
        }

        public static @Nullable h a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
            if (!h.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new h($$6, $$1, $$7, $$5);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dzs.a.m(), dzs.a.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$8, $$8, false);
            this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$8, $$8, false);
            this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 4, 3, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
            this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
            if (this.d && $$4.b(this.b(3, 2, 3))) {
                this.d = false;
                this.a($$0, $$4, $$3, 3, 2, 3, fnv.u);
            }
            this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$9 = 0; $$9 <= 4; ++$$9) {
                for (int $$10 = 0; $$10 <= 4; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$9, -1, $$10, $$4);
                }
            }
        }
    }

    public static class d
    extends m {
        private static final int a = 5;
        private static final int b = 14;
        private static final int c = 10;

        public d(int $$0, ffg $$1, iz $$2) {
            super(fgf.h, $$0, $$1);
            this.a($$2);
        }

        public d(uz $$0) {
            super(fgf.h, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 1, 0, true);
        }

        public static @Nullable d a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -1, -7, 0, 5, 14, 10, $$4);
            if (!fhu$d.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new d($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            eoh $$7 = (eoh)dzs.ge.m().b(ehz.b, iz.d);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            for (int $$9 = 0; $$9 <= 9; ++$$9) {
                int $$10 = Math.max(1, 7 - $$9);
                int $$11 = Math.min(Math.max($$10 + 5, 14 - $$9), 13);
                int $$12 = $$9;
                this.a($$0, $$4, 0, 0, $$12, 4, $$10, $$12, dzs.gc.m(), dzs.gc.m(), false);
                this.a($$0, $$4, 1, $$10 + 1, $$12, 3, $$11 - 1, $$12, dzs.a.m(), dzs.a.m(), false);
                if ($$9 <= 6) {
                    this.a($$0, $$7, 1, $$10 + 1, $$12, $$4);
                    this.a($$0, $$7, 2, $$10 + 1, $$12, $$4);
                    this.a($$0, $$7, 3, $$10 + 1, $$12, $$4);
                }
                this.a($$0, $$4, 0, $$11, $$12, 4, $$11, $$12, dzs.gc.m(), dzs.gc.m(), false);
                this.a($$0, $$4, 0, $$10 + 1, $$12, 0, $$11 - 1, $$12, dzs.gc.m(), dzs.gc.m(), false);
                this.a($$0, $$4, 4, $$10 + 1, $$12, 4, $$11 - 1, $$12, dzs.gc.m(), dzs.gc.m(), false);
                if (($$9 & 1) == 0) {
                    this.a($$0, $$4, 0, $$10 + 2, $$12, 0, $$10 + 3, $$12, $$8, $$8, false);
                    this.a($$0, $$4, 4, $$10 + 2, $$12, 4, $$10 + 3, $$12, $$8, $$8, false);
                }
                for (int $$13 = 0; $$13 <= 4; ++$$13) {
                    this.b($$0, dzs.gc.m(), $$13, -1, $$12, $$4);
                }
            }
        }
    }

    public static class e
    extends m {
        private static final int a = 9;
        private static final int b = 7;
        private static final int c = 9;

        public e(int $$0, ffg $$1, iz $$2) {
            super(fgf.i, $$0, $$1);
            this.a($$2);
        }

        public e(uz $$0) {
            super(fgf.i, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            int $$3 = 1;
            iz $$4 = this.i();
            if ($$4 == iz.e || $$4 == iz.c) {
                $$3 = 5;
            }
            this.b((q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
            this.c((q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
        }

        public static @Nullable e a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -3, 0, 0, 9, 7, 9, $$4);
            if (!fhu$e.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new e($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            this.a($$0, $$4, 0, 0, 0, 8, 1, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 8, 5, 8, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 6, 0, 8, 6, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 2, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 2, 0, 8, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 3, 0, 1, 4, 0, $$8, $$8, false);
            this.a($$0, $$4, 7, 3, 0, 7, 4, 0, $$8, $$8, false);
            this.a($$0, $$4, 0, 2, 4, 8, 2, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 1, 4, 2, 2, 4, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 6, 1, 4, 7, 2, 4, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 1, 3, 8, 7, 3, 8, $$8, $$8, false);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.b, true)).b(ect.c, true), 0, 3, 8, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.c, true), 8, 3, 8, $$4);
            this.a($$0, $$4, 0, 3, 6, 0, 3, 7, $$7, $$7, false);
            this.a($$0, $$4, 8, 3, 6, 8, 3, 7, $$7, $$7, false);
            this.a($$0, $$4, 0, 3, 4, 0, 5, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 3, 4, 8, 5, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 3, 5, 2, 5, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 6, 3, 5, 7, 5, 5, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 1, 4, 5, 1, 5, 5, $$8, $$8, false);
            this.a($$0, $$4, 7, 4, 5, 7, 5, 5, $$8, $$8, false);
            for (int $$9 = 0; $$9 <= 5; ++$$9) {
                for (int $$10 = 0; $$10 <= 8; ++$$10) {
                    this.b($$0, dzs.gc.m(), $$10, -1, $$9, $$4);
                }
            }
        }
    }

    public static class g
    extends m {
        private static final int a = 5;
        private static final int b = 7;
        private static final int c = 5;

        public g(int $$0, ffg $$1, iz $$2) {
            super(fgf.k, $$0, $$1);
            this.a($$2);
        }

        public g(uz $$0) {
            super(fgf.k, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 1, 0, true);
            this.b((q)$$0, $$1, $$2, 0, 1, true);
            this.c((q)$$0, $$1, $$2, 0, 1, true);
        }

        public static @Nullable g a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
            if (!g.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new g($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 4, 0, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 2, 4, 4, 5, 4, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$7 = 0; $$7 <= 4; ++$$7) {
                for (int $$8 = 0; $$8 <= 4; ++$$8) {
                    this.b($$0, dzs.gc.m(), $$7, -1, $$8, $$4);
                }
            }
        }
    }

    public static class k
    extends m {
        private static final int a = 13;
        private static final int b = 14;
        private static final int c = 13;

        public k(int $$0, ffg $$1, iz $$2) {
            super(fgf.o, $$0, $$1);
            this.a($$2);
        }

        public k(uz $$0) {
            super(fgf.o, $$0);
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            this.a((q)$$0, $$1, $$2, 5, 3, true);
            this.a((q)$$0, $$1, $$2, 5, 11, true);
        }

        public static @Nullable k a(fft $$0, int $$1, int $$2, int $$3, iz $$4, int $$5) {
            ffg $$6 = ffg.a($$1, $$2, $$3, -5, -3, 0, 13, 14, 13, $$4);
            if (!k.a($$6) || $$0.a($$6) != null) {
                return null;
            }
            return new k($$5, $$6, $$4);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dzs.gc.m(), dzs.gc.m(), false);
            eoh $$7 = (eoh)((eoh)dzs.gd.m().b(ect.d, true)).b(ect.b, true);
            eoh $$8 = (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.c, true);
            eoh $$9 = (eoh)$$8.b(ect.d, true);
            eoh $$10 = (eoh)$$8.b(ect.b, true);
            for (int $$11 = 1; $$11 <= 11; $$11 += 2) {
                this.a($$0, $$4, $$11, 10, 0, $$11, 11, 0, $$7, $$7, false);
                this.a($$0, $$4, $$11, 10, 12, $$11, 11, 12, $$7, $$7, false);
                this.a($$0, $$4, 0, 10, $$11, 0, 11, $$11, $$8, $$8, false);
                this.a($$0, $$4, 12, 10, $$11, 12, 11, $$11, $$8, $$8, false);
                this.a($$0, dzs.gc.m(), $$11, 13, 0, $$4);
                this.a($$0, dzs.gc.m(), $$11, 13, 12, $$4);
                this.a($$0, dzs.gc.m(), 0, 13, $$11, $$4);
                this.a($$0, dzs.gc.m(), 12, 13, $$11, $$4);
                if ($$11 == 11) continue;
                this.a($$0, $$7, $$11 + 1, 13, 0, $$4);
                this.a($$0, $$7, $$11 + 1, 13, 12, $$4);
                this.a($$0, $$8, 0, 13, $$11 + 1, $$4);
                this.a($$0, $$8, 12, 13, $$11 + 1, $$4);
            }
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.b, true), 0, 13, 0, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.c, true)).b(ect.b, true), 0, 13, 12, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.c, true)).b(ect.d, true), 12, 13, 12, $$4);
            this.a($$0, (eoh)((eoh)dzs.gd.m().b(ect.a, true)).b(ect.d, true), 12, 13, 0, $$4);
            for (int $$12 = 3; $$12 <= 9; $$12 += 2) {
                this.a($$0, $$4, 1, 7, $$12, 1, 8, $$12, $$9, $$9, false);
                this.a($$0, $$4, 11, 7, $$12, 11, 8, $$12, $$10, $$10, false);
            }
            eoh $$13 = (eoh)dzs.ge.m().b(ehz.b, iz.c);
            for (int $$14 = 0; $$14 <= 6; ++$$14) {
                int $$15 = $$14 + 4;
                for (int $$16 = 5; $$16 <= 7; ++$$16) {
                    this.a($$0, $$13, $$16, 5 + $$14, $$15, $$4);
                }
                if ($$15 >= 5 && $$15 <= 8) {
                    this.a($$0, $$4, 5, 5, $$15, 7, $$14 + 4, $$15, dzs.gc.m(), dzs.gc.m(), false);
                } else if ($$15 >= 9 && $$15 <= 10) {
                    this.a($$0, $$4, 5, 8, $$15, 7, $$14 + 4, $$15, dzs.gc.m(), dzs.gc.m(), false);
                }
                if ($$14 < 1) continue;
                this.a($$0, $$4, 5, 6 + $$14, $$15, 7, 9 + $$14, $$15, dzs.a.m(), dzs.a.m(), false);
            }
            for (int $$17 = 5; $$17 <= 7; ++$$17) {
                this.a($$0, $$13, $$17, 12, 11, $$4);
            }
            this.a($$0, $$4, 5, 6, 7, 5, 7, 7, $$10, $$10, false);
            this.a($$0, $$4, 7, 6, 7, 7, 7, 7, $$9, $$9, false);
            this.a($$0, $$4, 5, 13, 12, 7, 13, 12, dzs.a.m(), dzs.a.m(), false);
            this.a($$0, $$4, 2, 5, 2, 3, 5, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 9, 3, 5, 10, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 2, 5, 4, 2, 5, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 9, 5, 2, 10, 5, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 9, 5, 9, 10, 5, 10, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 10, 5, 4, 10, 5, 8, dzs.gc.m(), dzs.gc.m(), false);
            eoh $$18 = (eoh)$$13.b(ehz.b, iz.f);
            eoh $$19 = (eoh)$$13.b(ehz.b, iz.e);
            this.a($$0, $$19, 4, 5, 2, $$4);
            this.a($$0, $$19, 4, 5, 3, $$4);
            this.a($$0, $$19, 4, 5, 9, $$4);
            this.a($$0, $$19, 4, 5, 10, $$4);
            this.a($$0, $$18, 8, 5, 2, $$4);
            this.a($$0, $$18, 8, 5, 3, $$4);
            this.a($$0, $$18, 8, 5, 9, $$4);
            this.a($$0, $$18, 8, 5, 10, $$4);
            this.a($$0, $$4, 3, 4, 4, 4, 4, 8, dzs.ez.m(), dzs.ez.m(), false);
            this.a($$0, $$4, 8, 4, 4, 9, 4, 8, dzs.ez.m(), dzs.ez.m(), false);
            this.a($$0, $$4, 3, 5, 4, 4, 5, 8, dzs.gf.m(), dzs.gf.m(), false);
            this.a($$0, $$4, 8, 5, 4, 9, 5, 8, dzs.gf.m(), dzs.gf.m(), false);
            this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dzs.gc.m(), dzs.gc.m(), false);
            this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$20 = 4; $$20 <= 8; ++$$20) {
                for (int $$21 = 0; $$21 <= 2; ++$$21) {
                    this.b($$0, dzs.gc.m(), $$20, -1, $$21, $$4);
                    this.b($$0, dzs.gc.m(), $$20, -1, 12 - $$21, $$4);
                }
            }
            for (int $$22 = 0; $$22 <= 2; ++$$22) {
                for (int $$23 = 4; $$23 <= 8; ++$$23) {
                    this.b($$0, dzs.gc.m(), $$22, -1, $$23, $$4);
                    this.b($$0, dzs.gc.m(), 12 - $$22, -1, $$23, $$4);
                }
            }
        }
    }

    public static class b
    extends m {
        private static final int a = 5;
        private static final int b = 10;
        private static final int c = 8;
        private final int d;

        public b(int $$0, bgr $$1, ffg $$2, iz $$3) {
            super(fgf.f, $$0, $$2);
            this.a($$3);
            this.d = $$1.f();
        }

        public b(uz $$0) {
            super(fgf.f, $$0);
            this.d = $$0.b("Seed", 0);
        }

        public static @Nullable b a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6) {
            ffg $$7 = ffg.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 8, $$5);
            if (!fhu$b.a($$7) || $$0.a($$7) != null) {
                return null;
            }
            return new b($$6, $$1, $$7, $$5);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Seed", this.d);
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            bgr $$7 = bgr.a(this.d);
            for (int $$8 = 0; $$8 <= 4; ++$$8) {
                for (int $$9 = 3; $$9 <= 4; ++$$9) {
                    int $$10 = $$7.a(8);
                    this.a($$0, $$4, $$8, $$9, 0, $$8, $$9, $$10, dzs.gc.m(), dzs.gc.m(), false);
                }
            }
            int $$11 = $$7.a(8);
            this.a($$0, $$4, 0, 5, 0, 0, 5, $$11, dzs.gc.m(), dzs.gc.m(), false);
            int $$12 = $$7.a(8);
            this.a($$0, $$4, 4, 5, 0, 4, 5, $$12, dzs.gc.m(), dzs.gc.m(), false);
            for (int $$13 = 0; $$13 <= 4; ++$$13) {
                int $$14 = $$7.a(5);
                this.a($$0, $$4, $$13, 2, 0, $$13, 2, $$14, dzs.gc.m(), dzs.gc.m(), false);
            }
            for (int $$15 = 0; $$15 <= 4; ++$$15) {
                for (int $$16 = 0; $$16 <= 1; ++$$16) {
                    int $$17 = $$7.a(3);
                    this.a($$0, $$4, $$15, $$16, 0, $$15, $$16, $$17, dzs.gc.m(), dzs.gc.m(), false);
                }
            }
        }
    }

    public static class q
    extends a {
        @Nullable n b;
        final List<n> c = new ArrayList<n>();
        final List<n> d = new ArrayList<n>();
        public final List<ffs> a = Lists.newArrayList();

        public q(bgr $$0, int $$1, int $$2) {
            super($$1, $$2, q.a($$0));
            for (n $$3 : d) {
                $$3.c = 0;
                this.c.add($$3);
            }
            for (n $$4 : e) {
                $$4.c = 0;
                this.d.add($$4);
            }
        }

        public q(uz $$0) {
            super(fgf.s, $$0);
        }
    }

    static abstract class m
    extends ffs {
        protected m(fgf $$0, int $$1, ffg $$2) {
            super($$0, $$1, $$2);
        }

        public m(fgf $$0, uz $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
        }

        private int a(List<n> $$0) {
            boolean $$1 = false;
            int $$2 = 0;
            for (n $$3 : $$0) {
                if ($$3.d > 0 && $$3.c < $$3.d) {
                    $$1 = true;
                }
                $$2 += $$3.b;
            }
            return $$1 ? $$2 : -1;
        }

        private @Nullable m a(q $$0, List<n> $$1, fft $$2, bgr $$3, int $$4, int $$5, int $$6, iz $$7, int $$8) {
            int $$9 = this.a($$1);
            boolean $$10 = $$9 > 0 && $$8 <= 30;
            int $$11 = 0;
            block0: while ($$11 < 5 && $$10) {
                ++$$11;
                int $$12 = $$3.a($$9);
                for (n $$13 : $$1) {
                    if (($$12 -= $$13.b) >= 0) continue;
                    if (!$$13.a($$8) || $$13 == $$0.b && !$$13.e) continue block0;
                    m $$14 = fhu.a($$13, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
                    if ($$14 == null) continue;
                    ++$$13.c;
                    $$0.b = $$13;
                    if (!$$13.a()) {
                        $$1.remove($$13);
                    }
                    return $$14;
                }
            }
            return fhu$b.a($$2, $$3, $$4, $$5, $$6, $$7, $$8);
        }

        private @Nullable ffs a(q $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7, boolean $$8) {
            m $$10;
            if (Math.abs($$3 - $$0.f().h()) > 112 || Math.abs($$5 - $$0.f().j()) > 112) {
                return fhu$b.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }
            List<n> $$9 = $$0.c;
            if ($$8) {
                $$9 = $$0.d;
            }
            if (($$10 = this.a($$0, $$9, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1)) != null) {
                $$1.a($$10);
                $$0.a.add($$10);
            }
            return $$10;
        }

        protected @Nullable ffs a(q $$0, fft $$1, bgr $$2, int $$3, int $$4, boolean $$5) {
            iz $$6 = this.i();
            if ($$6 != null) {
                switch ($$6) {
                    case c: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$6, this.g(), $$5);
                    }
                    case d: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$6, this.g(), $$5);
                    }
                    case e: {
                        return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$6, this.g(), $$5);
                    }
                    case f: {
                        return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$6, this.g(), $$5);
                    }
                }
            }
            return null;
        }

        protected @Nullable ffs b(q $$0, fft $$1, bgr $$2, int $$3, int $$4, boolean $$5) {
            iz $$6 = this.i();
            if ($$6 != null) {
                switch ($$6) {
                    case c: {
                        return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iz.e, this.g(), $$5);
                    }
                    case d: {
                        return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iz.e, this.g(), $$5);
                    }
                    case e: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iz.c, this.g(), $$5);
                    }
                    case f: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iz.c, this.g(), $$5);
                    }
                }
            }
            return null;
        }

        protected @Nullable ffs c(q $$0, fft $$1, bgr $$2, int $$3, int $$4, boolean $$5) {
            iz $$6 = this.i();
            if ($$6 != null) {
                switch ($$6) {
                    case c: {
                        return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iz.f, this.g(), $$5);
                    }
                    case d: {
                        return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iz.f, this.g(), $$5);
                    }
                    case e: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iz.d, this.g(), $$5);
                    }
                    case f: {
                        return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iz.d, this.g(), $$5);
                    }
                }
            }
            return null;
        }

        protected static boolean a(ffg $$0) {
            return $$0.i() > 10;
        }
    }
}

