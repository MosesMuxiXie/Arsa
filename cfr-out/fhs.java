/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fhs {
    private static final int b = 3;
    private static final int c = 3;
    private static final int d = 5;
    private static final int e = 20;
    private static final int f = 50;
    private static final int g = 8;
    public static final int a = 50;

    private static @Nullable c a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5, int $$6, fht.a $$7) {
        int $$8 = $$1.a(100);
        if ($$8 >= 80) {
            ffg $$9 = fhs$b.a($$0, $$1, $$2, $$3, $$4, $$5);
            if ($$9 != null) {
                return new b($$6, $$9, $$5, $$7);
            }
        } else if ($$8 >= 70) {
            ffg $$10 = fhs$e.a($$0, $$1, $$2, $$3, $$4, $$5);
            if ($$10 != null) {
                return new e($$6, $$10, $$5, $$7);
            }
        } else {
            ffg $$11 = fhs$a.a($$0, $$1, $$2, $$3, $$4, $$5);
            if ($$11 != null) {
                return new a($$6, $$1, $$11, $$5, $$7);
            }
        }
        return null;
    }

    static @Nullable c a(ffs $$0, fft $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, int $$7) {
        if ($$7 > 8) {
            return null;
        }
        if (Math.abs($$3 - $$0.f().h()) > 80 || Math.abs($$5 - $$0.f().j()) > 80) {
            return null;
        }
        fht.a $$8 = ((c)$$0).a;
        c $$9 = fhs.a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
        if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
        }
        return $$9;
    }

    public static class b
    extends c {
        private final iz b;
        private final boolean c;

        public b(uz $$0) {
            super(fgf.b, $$0);
            this.c = $$0.b("tf", false);
            this.b = $$0.a("D", iz.l).orElse(iz.d);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("tf", this.c);
            $$1.a("D", iz.l, this.b);
        }

        public b(int $$0, ffg $$1, @Nullable iz $$2, fht.a $$3) {
            super(fgf.b, $$0, $$3, $$1);
            this.b = $$2;
            this.c = $$1.e() > 3;
        }

        public static @Nullable ffg a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5) {
            ffg $$11;
            int $$7;
            if ($$1.a(4) == 0) {
                int $$6 = 6;
            } else {
                $$7 = 2;
            }
            switch ($$5) {
                default: {
                    ffg $$8 = new ffg(-1, 0, -4, 3, $$7, 0);
                    break;
                }
                case d: {
                    ffg $$9 = new ffg(-1, 0, 0, 3, $$7, 4);
                    break;
                }
                case e: {
                    ffg $$10 = new ffg(-4, 0, -1, 0, $$7, 3);
                    break;
                }
                case f: {
                    $$11 = new ffg(0, 0, -1, 4, $$7, 3);
                }
            }
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) != null) {
                return null;
            }
            return $$11;
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            int $$3 = this.g();
            switch (this.b) {
                default: {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, iz.c, $$3);
                    fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, iz.e, $$3);
                    fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, iz.f, $$3);
                    break;
                }
                case d: {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, iz.d, $$3);
                    fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, iz.e, $$3);
                    fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, iz.f, $$3);
                    break;
                }
                case e: {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, iz.c, $$3);
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, iz.d, $$3);
                    fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j() + 1, iz.e, $$3);
                    break;
                }
                case f: {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.j() - 1, iz.c, $$3);
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i(), this.f.m() + 1, iz.d, $$3);
                    fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j() + 1, iz.f, $$3);
                }
            }
            if (this.c) {
                if ($$2.h()) {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.j() - 1, iz.c, $$3);
                }
                if ($$2.h()) {
                    fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + 3 + 1, this.f.j() + 1, iz.e, $$3);
                }
                if ($$2.h()) {
                    fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + 3 + 1, this.f.j() + 1, iz.f, $$3);
                }
                if ($$2.h()) {
                    fhs.a($$0, $$1, $$2, this.f.h() + 1, this.f.i() + 3 + 1, this.f.m() + 1, iz.d, $$3);
                }
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            if (this.a($$0, $$4)) {
                return;
            }
            eoh $$7 = this.a.d();
            if (this.c) {
                this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j(), this.f.k() - 1, this.f.i() + 3 - 1, this.f.m(), e, e, false);
                this.a($$0, $$4, this.f.h(), this.f.i(), this.f.j() + 1, this.f.k(), this.f.i() + 3 - 1, this.f.m() - 1, e, e, false);
                this.a($$0, $$4, this.f.h() + 1, this.f.l() - 2, this.f.j(), this.f.k() - 1, this.f.l(), this.f.m(), e, e, false);
                this.a($$0, $$4, this.f.h(), this.f.l() - 2, this.f.j() + 1, this.f.k(), this.f.l(), this.f.m() - 1, e, e, false);
                this.a($$0, $$4, this.f.h() + 1, this.f.i() + 3, this.f.j() + 1, this.f.k() - 1, this.f.i() + 3, this.f.m() - 1, e, e, false);
            } else {
                this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j(), this.f.k() - 1, this.f.l(), this.f.m(), e, e, false);
                this.a($$0, $$4, this.f.h(), this.f.i(), this.f.j() + 1, this.f.k(), this.f.l(), this.f.m() - 1, e, e, false);
            }
            this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.j() + 1, this.f.l());
            this.a($$0, $$4, this.f.h() + 1, this.f.i(), this.f.m() - 1, this.f.l());
            this.a($$0, $$4, this.f.k() - 1, this.f.i(), this.f.j() + 1, this.f.l());
            this.a($$0, $$4, this.f.k() - 1, this.f.i(), this.f.m() - 1, this.f.l());
            int $$8 = this.f.i() - 1;
            for (int $$9 = this.f.h(); $$9 <= this.f.k(); ++$$9) {
                for (int $$10 = this.f.j(); $$10 <= this.f.m(); ++$$10) {
                    this.a($$0, $$4, $$7, $$9, $$8, $$10);
                }
            }
        }

        private void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5) {
            if (!this.a((dvt)$$0, $$2, $$5 + 1, $$4, $$1).l()) {
                this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
            }
        }
    }

    public static class e
    extends c {
        public e(int $$0, ffg $$1, iz $$2, fht.a $$3) {
            super(fgf.d, $$0, $$3, $$1);
            this.a($$2);
        }

        public e(uz $$0) {
            super(fgf.d, $$0);
        }

        public static @Nullable ffg a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5) {
            ffg $$9;
            switch ($$5) {
                default: {
                    ffg $$6 = new ffg(0, -5, -8, 2, 2, 0);
                    break;
                }
                case d: {
                    ffg $$7 = new ffg(0, -5, 0, 2, 2, 8);
                    break;
                }
                case e: {
                    ffg $$8 = new ffg(-8, -5, 0, 0, 2, 2);
                    break;
                }
                case f: {
                    $$9 = new ffg(0, -5, 0, 8, 2, 2);
                }
            }
            $$9.a($$2, $$3, $$4);
            if ($$0.a($$9) != null) {
                return null;
            }
            return $$9;
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            int $$3 = this.g();
            iz $$4 = this.i();
            if ($$4 != null) {
                switch ($$4) {
                    default: {
                        fhs.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.j() - 1, iz.c, $$3);
                        break;
                    }
                    case d: {
                        fhs.a($$0, $$1, $$2, this.f.h(), this.f.i(), this.f.m() + 1, iz.d, $$3);
                        break;
                    }
                    case e: {
                        fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), this.f.j(), iz.e, $$3);
                        break;
                    }
                    case f: {
                        fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), this.f.j(), iz.f, $$3);
                    }
                }
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            if (this.a($$0, $$4)) {
                return;
            }
            this.a($$0, $$4, 0, 5, 0, 2, 7, 1, e, e, false);
            this.a($$0, $$4, 0, 0, 7, 2, 2, 8, e, e, false);
            for (int $$7 = 0; $$7 < 5; ++$$7) {
                this.a($$0, $$4, 0, 5 - $$7 - ($$7 < 4 ? 1 : 0), 2 + $$7, 2, 7 - $$7, 2 + $$7, e, e, false);
            }
        }
    }

    public static class a
    extends c {
        private final boolean b;
        private final boolean c;
        private boolean d;
        private final int h;

        public a(uz $$0) {
            super(fgf.a, $$0);
            this.b = $$0.b("hr", false);
            this.c = $$0.b("sc", false);
            this.d = $$0.b("hps", false);
            this.h = $$0.b("Num", 0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("hr", this.b);
            $$1.a("sc", this.c);
            $$1.a("hps", this.d);
            $$1.a("Num", this.h);
        }

        public a(int $$0, bgr $$1, ffg $$2, iz $$3, fht.a $$4) {
            super(fgf.a, $$0, $$4, $$2);
            this.a($$3);
            this.b = $$1.a(3) == 0;
            this.c = !this.b && $$1.a(23) == 0;
            this.h = this.i().o() == iz.a.c ? $$2.f() / 5 : $$2.d() / 5;
        }

        public static @Nullable ffg a(fft $$0, bgr $$1, int $$2, int $$3, int $$4, iz $$5) {
            for (int $$6 = $$1.a(3) + 2; $$6 > 0; --$$6) {
                ffg $$11;
                int $$7 = $$6 * 5;
                switch ($$5) {
                    default: {
                        ffg $$8 = new ffg(0, 0, -($$7 - 1), 2, 2, 0);
                        break;
                    }
                    case d: {
                        ffg $$9 = new ffg(0, 0, 0, 2, 2, $$7 - 1);
                        break;
                    }
                    case e: {
                        ffg $$10 = new ffg(-($$7 - 1), 0, 0, 0, 2, 2);
                        break;
                    }
                    case f: {
                        $$11 = new ffg(0, 0, 0, $$7 - 1, 2, 2);
                    }
                }
                $$11.a($$2, $$3, $$4);
                if ($$0.a($$11) != null) {
                    continue;
                }
                return $$11;
            }
            return null;
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            block24: {
                int $$3 = this.g();
                int $$4 = $$2.a(4);
                iz $$5 = this.i();
                if ($$5 != null) {
                    switch ($$5) {
                        default: {
                            if ($$4 <= 1) {
                                fhs.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, $$5, $$3);
                                break;
                            }
                            if ($$4 == 2) {
                                fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), iz.e, $$3);
                                break;
                            }
                            fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), iz.f, $$3);
                            break;
                        }
                        case d: {
                            if ($$4 <= 1) {
                                fhs.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, $$5, $$3);
                                break;
                            }
                            if ($$4 == 2) {
                                fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, iz.e, $$3);
                                break;
                            }
                            fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.m() - 3, iz.f, $$3);
                            break;
                        }
                        case e: {
                            if ($$4 <= 1) {
                                fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                                break;
                            }
                            if ($$4 == 2) {
                                fhs.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.j() - 1, iz.c, $$3);
                                break;
                            }
                            fhs.a($$0, $$1, $$2, this.f.h(), this.f.i() - 1 + $$2.a(3), this.f.m() + 1, iz.d, $$3);
                            break;
                        }
                        case f: {
                            if ($$4 <= 1) {
                                fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() - 1 + $$2.a(3), this.f.j(), $$5, $$3);
                                break;
                            }
                            if ($$4 == 2) {
                                fhs.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.j() - 1, iz.c, $$3);
                                break;
                            }
                            fhs.a($$0, $$1, $$2, this.f.k() - 3, this.f.i() - 1 + $$2.a(3), this.f.m() + 1, iz.d, $$3);
                        }
                    }
                }
                if ($$3 >= 8) break block24;
                if ($$5 == iz.c || $$5 == iz.d) {
                    int $$6 = this.f.j() + 3;
                    while ($$6 + 3 <= this.f.m()) {
                        int $$7 = $$2.a(5);
                        if ($$7 == 0) {
                            fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i(), $$6, iz.e, $$3 + 1);
                        } else if ($$7 == 1) {
                            fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i(), $$6, iz.f, $$3 + 1);
                        }
                        $$6 += 5;
                    }
                } else {
                    int $$8 = this.f.h() + 3;
                    while ($$8 + 3 <= this.f.k()) {
                        int $$9 = $$2.a(5);
                        if ($$9 == 0) {
                            fhs.a($$0, $$1, $$2, $$8, this.f.i(), this.f.j() - 1, iz.c, $$3 + 1);
                        } else if ($$9 == 1) {
                            fhs.a($$0, $$1, $$2, $$8, this.f.i(), this.f.m() + 1, iz.d, $$3 + 1);
                        }
                        $$8 += 5;
                    }
                }
            }
        }

        @Override
        protected boolean a(dxn $$0, ffg $$1, bgr $$2, int $$3, int $$4, int $$5, amt<fof> $$6) {
            is.a $$7 = this.b($$3, $$4, $$5);
            if ($$1.b($$7) && $$0.a_($$7).l() && !$$0.a_($$7.e()).l()) {
                eoh $$8 = (eoh)dzs.dn.m().b(efy.c, $$2.h() ? epl.a : epl.b);
                this.a($$0, $$8, $$3, $$4, $$5, $$1);
                dgm $$9 = cgu.B.a($$0.a(), cgt.b);
                if ($$9 != null) {
                    $$9.o((double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
                    $$9.a($$6, $$2.g());
                    $$0.b($$9);
                }
                return true;
            }
            return false;
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            if (this.a($$0, $$4)) {
                return;
            }
            boolean $$7 = false;
            int $$8 = 2;
            boolean $$9 = false;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            eoh $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8f, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
                this.a($$0, $$4, $$3, 0.6f, 0, 0, 0, 2, 1, $$11, dzs.bz.m(), e, false, true);
            }
            for (int $$13 = 0; $$13 < this.h; ++$$13) {
                int $$14 = 2 + $$13 * 5;
                this.a($$0, $$4, 0, 0, $$14, 2, 2, $$3);
                this.a($$0, $$4, $$3, 0.1f, 0, 2, $$14 - 1);
                this.a($$0, $$4, $$3, 0.1f, 2, 2, $$14 - 1);
                this.a($$0, $$4, $$3, 0.1f, 0, 2, $$14 + 1);
                this.a($$0, $$4, $$3, 0.1f, 2, 2, $$14 + 1);
                this.a($$0, $$4, $$3, 0.05f, 0, 2, $$14 - 2);
                this.a($$0, $$4, $$3, 0.05f, 2, 2, $$14 - 2);
                this.a($$0, $$4, $$3, 0.05f, 0, 2, $$14 + 2);
                this.a($$0, $$4, $$3, 0.05f, 2, 2, $$14 + 2);
                if ($$3.a(100) == 0) {
                    this.a($$0, $$4, $$3, 2, 0, $$14 - 1, fnv.t);
                }
                if ($$3.a(100) == 0) {
                    this.a($$0, $$4, $$3, 0, 0, $$14 + 1, fnv.t);
                }
                if (!this.c || this.d) continue;
                boolean $$15 = true;
                int $$16 = $$14 - 1 + $$3.a(3);
                is.a $$17 = this.b(1, 0, $$16);
                if (!$$4.b($$17) || !this.b($$0, 1, 0, $$16, $$4)) continue;
                this.d = true;
                $$0.a((is)$$17, dzs.cP.m(), 2);
                elb $$18 = $$0.c_($$17);
                if (!($$18 instanceof emw)) continue;
                emw $$19 = (emw)$$18;
                $$19.a(cgu.y, $$3);
            }
            for (int $$20 = 0; $$20 <= 2; ++$$20) {
                for (int $$21 = 0; $$21 <= $$11; ++$$21) {
                    this.a($$0, $$4, $$12, $$20, -1, $$21);
                }
            }
            int $$22 = 2;
            this.a($$0, $$4, 0, -1, 2);
            if (this.h > 1) {
                int $$23 = $$11 - 2;
                this.a($$0, $$4, 0, -1, $$23);
            }
            if (this.b) {
                eoh $$24 = (eoh)dzs.dn.m().b(efy.c, epl.a);
                for (int $$25 = 0; $$25 <= $$11; ++$$25) {
                    eoh $$26 = this.a((dvt)$$0, 1, -1, $$25, $$4);
                    if ($$26.l() || !$$26.s()) continue;
                    float $$27 = this.b($$0, 1, 0, $$25, $$4) ? 0.7f : 0.9f;
                    this.a($$0, $$4, $$3, $$27, 1, 0, $$25, $$24);
                }
            }
        }

        private void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4) {
            eoh $$5 = this.a.b();
            eoh $$6 = this.a.d();
            if (this.a((dvt)$$0, $$2, $$3, $$4, $$1).a($$6.b())) {
                this.c($$0, $$5, $$2, $$3, $$4, $$1);
            }
            if (this.a((dvt)$$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
                this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
            }
        }

        @Override
        protected void b(dxn $$0, eoh $$1, int $$2, int $$3, int $$4, ffg $$5) {
            is.a $$6 = this.b($$2, $$3, $$4);
            if (!$$5.b($$6)) {
                return;
            }
            int $$7 = $$6.v();
            while (this.a($$0.a_($$6)) && $$6.v() > $$0.K_() + 1) {
                $$6.c(iz.a);
            }
            if (!this.a($$0, $$6, $$0.a_($$6))) {
                return;
            }
            while ($$6.v() < $$7) {
                $$6.c(iz.b);
                $$0.a((is)$$6, $$1, 2);
            }
        }

        protected void c(dxn $$0, eoh $$1, int $$2, int $$3, int $$4, ffg $$5) {
            is.a $$6 = this.b($$2, $$3, $$4);
            if (!$$5.b($$6)) {
                return;
            }
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;
            boolean $$10 = true;
            while ($$9 || $$10) {
                if ($$9) {
                    boolean $$12;
                    $$6.q($$7 - $$8);
                    eoh $$11 = $$0.a_($$6);
                    boolean bl2 = $$12 = this.a($$11) && !$$11.a(dzs.K);
                    if (!$$12 && this.a($$0, $$6, $$11)) {
                        fhs$a.a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                        return;
                    }
                    boolean bl3 = $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.K_() + 1;
                }
                if ($$10) {
                    $$6.q($$7 + $$8);
                    eoh $$13 = $$0.a_($$6);
                    boolean $$14 = this.a($$13);
                    if (!$$14 && this.b($$0, $$6, $$13)) {
                        $$0.a((is)$$6.q($$7 + 1), this.a.e(), 2);
                        fhs$a.a($$0, dzs.fE.m(), $$6, $$7 + 2, $$7 + $$8);
                        return;
                    }
                    $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.aw();
                }
                ++$$8;
            }
        }

        private static void a(dxn $$0, eoh $$1, is.a $$2, int $$3, int $$4) {
            for (int $$5 = $$3; $$5 < $$4; ++$$5) {
                $$0.a((is)$$2.q($$5), $$1, 2);
            }
        }

        private boolean a(dwr $$0, is $$1, eoh $$2) {
            return $$2.c((dvt)$$0, $$1, iz.b);
        }

        private boolean b(dwr $$0, is $$1, eoh $$2) {
            return dzq.a($$0, $$1, iz.a) && !($$2.b() instanceof ecr);
        }

        private void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, bgr $$7) {
            if (!this.a((dvt)$$0, $$1, $$2, $$6, $$5, $$4)) {
                return;
            }
            eoh $$8 = this.a.d();
            eoh $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, (eoh)$$9.b(ect.d, true), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, (eoh)$$9.b(ect.b, true), e, false);
            if ($$7.a(4) == 0) {
                this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
                this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
                this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
                this.a($$0, $$1, $$7, 0.05f, $$2 + 1, $$5, $$4 - 1, (eoh)dzs.cM.m().b(ejn.e, iz.d));
                this.a($$0, $$1, $$7, 0.05f, $$2 + 1, $$5, $$4 + 1, (eoh)dzs.cM.m().b(ejn.e, iz.c));
            }
        }

        private void a(dxn $$0, ffg $$1, bgr $$2, float $$3, int $$4, int $$5, int $$6) {
            if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
                this.a($$0, dzs.bz.m(), $$4, $$5, $$6, $$1);
            }
        }

        private boolean a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5) {
            is.a $$6 = this.b($$2, $$3, $$4);
            int $$7 = 0;
            for (iz $$8 : iz.values()) {
                $$6.c($$8);
                if ($$1.b($$6) && $$0.a_($$6).c((dvt)$$0, (is)$$6, $$8.g()) && ++$$7 >= $$5) {
                    return true;
                }
                $$6.c($$8.g());
            }
            return false;
        }
    }

    static abstract class c
    extends ffs {
        protected fht.a a;

        public c(fgf $$0, int $$1, fht.a $$2, ffg $$3) {
            super($$0, $$1, $$3);
            this.a = $$2;
        }

        public c(fgf $$0, uz $$1) {
            super($$0, $$1);
            this.a = fht.a.a($$1.b("MST", 0));
        }

        @Override
        protected boolean a(dwr $$0, int $$1, int $$2, int $$3, ffg $$4) {
            eoh $$5 = this.a((dvt)$$0, $$1, $$2, $$3, $$4);
            return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(dzs.fE);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            $$1.a("MST", this.a.ordinal());
        }

        protected boolean a(dvt $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5) {
            for (int $$6 = $$2; $$6 <= $$3; ++$$6) {
                if (!this.a($$0, $$6, $$4 + 1, $$5, $$1).l()) continue;
                return false;
            }
            return true;
        }

        protected boolean a(dwp $$0, ffg $$1) {
            int $$7;
            int $$6;
            int $$2 = Math.max(this.f.h() - 1, $$1.h());
            int $$3 = Math.max(this.f.i() - 1, $$1.i());
            int $$4 = Math.max(this.f.j() - 1, $$1.j());
            int $$5 = Math.min(this.f.k() + 1, $$1.k());
            is.a $$8 = new is.a(($$2 + $$5) / 2, ($$3 + ($$6 = Math.min(this.f.l() + 1, $$1.l()))) / 2, ($$4 + ($$7 = Math.min(this.f.m() + 1, $$1.m()))) / 2);
            if ($$0.z($$8).a(bdo.Y)) {
                return true;
            }
            for (int $$9 = $$2; $$9 <= $$5; ++$$9) {
                for (int $$10 = $$4; $$10 <= $$7; ++$$10) {
                    if ($$0.a_($$8.d($$9, $$3, $$10)).n()) {
                        return true;
                    }
                    if (!$$0.a_($$8.d($$9, $$6, $$10)).n()) continue;
                    return true;
                }
            }
            for (int $$11 = $$2; $$11 <= $$5; ++$$11) {
                for (int $$12 = $$3; $$12 <= $$6; ++$$12) {
                    if ($$0.a_($$8.d($$11, $$12, $$4)).n()) {
                        return true;
                    }
                    if (!$$0.a_($$8.d($$11, $$12, $$7)).n()) continue;
                    return true;
                }
            }
            for (int $$13 = $$4; $$13 <= $$7; ++$$13) {
                for (int $$14 = $$3; $$14 <= $$6; ++$$14) {
                    if ($$0.a_($$8.d($$2, $$14, $$13)).n()) {
                        return true;
                    }
                    if (!$$0.a_($$8.d($$5, $$14, $$13)).n()) continue;
                    return true;
                }
            }
            return false;
        }

        protected void a(dxn $$0, ffg $$1, eoh $$2, int $$3, int $$4, int $$5) {
            if (!this.b($$0, $$3, $$4, $$5, $$1)) {
                return;
            }
            is.a $$6 = this.b($$3, $$4, $$5);
            eoh $$7 = $$0.a_($$6);
            if (!$$7.c((dvt)$$0, (is)$$6, iz.b)) {
                $$0.a((is)$$6, $$2, 2);
            }
        }
    }

    public static class d
    extends c {
        private final List<ffg> b = Lists.newLinkedList();

        public d(int $$0, bgr $$1, int $$2, int $$3, fht.a $$4) {
            super(fgf.c, $$0, $$4, new ffg($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
            this.a = $$4;
        }

        public d(uz $$0) {
            super(fgf.c, $$0);
            this.b.addAll($$0.a("Entrances", ffg.a.listOf()).orElse(List.of()));
        }

        @Override
        public void a(ffs $$0, fft $$1, bgr $$2) {
            int $$5;
            int $$3 = this.g();
            int $$4 = this.f.e() - 3 - 1;
            if ($$4 <= 0) {
                $$4 = 1;
            }
            for ($$5 = 0; $$5 < this.f.d() && ($$5 += $$2.a(this.f.d())) + 3 <= this.f.d(); $$5 += 4) {
                c $$6 = fhs.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.j() - 1, iz.c, $$3);
                if ($$6 == null) continue;
                ffg $$7 = $$6.f();
                this.b.add(new ffg($$7.h(), $$7.i(), this.f.j(), $$7.k(), $$7.l(), this.f.j() + 1));
            }
            for ($$5 = 0; $$5 < this.f.d() && ($$5 += $$2.a(this.f.d())) + 3 <= this.f.d(); $$5 += 4) {
                c $$8 = fhs.a($$0, $$1, $$2, this.f.h() + $$5, this.f.i() + $$2.a($$4) + 1, this.f.m() + 1, iz.d, $$3);
                if ($$8 == null) continue;
                ffg $$9 = $$8.f();
                this.b.add(new ffg($$9.h(), $$9.i(), this.f.m() - 1, $$9.k(), $$9.l(), this.f.m()));
            }
            for ($$5 = 0; $$5 < this.f.f() && ($$5 += $$2.a(this.f.f())) + 3 <= this.f.f(); $$5 += 4) {
                c $$10 = fhs.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, iz.e, $$3);
                if ($$10 == null) continue;
                ffg $$11 = $$10.f();
                this.b.add(new ffg(this.f.h(), $$11.i(), $$11.j(), this.f.h() + 1, $$11.l(), $$11.m()));
            }
            for ($$5 = 0; $$5 < this.f.f() && ($$5 += $$2.a(this.f.f())) + 3 <= this.f.f(); $$5 += 4) {
                c $$12 = fhs.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$2.a($$4) + 1, this.f.j() + $$5, iz.f, $$3);
                if ($$12 == null) continue;
                ffg $$13 = $$12.f();
                this.b.add(new ffg(this.f.k() - 1, $$13.i(), $$13.j(), this.f.k(), $$13.l(), $$13.m()));
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            if (this.a($$0, $$4)) {
                return;
            }
            this.a($$0, $$4, this.f.h(), this.f.i() + 1, this.f.j(), this.f.k(), Math.min(this.f.i() + 3, this.f.l()), this.f.m(), e, e, false);
            for (ffg $$7 : this.b) {
                this.a($$0, $$4, $$7.h(), $$7.l() - 2, $$7.j(), $$7.k(), $$7.l(), $$7.m(), e, e, false);
            }
            this.a($$0, $$4, this.f.h(), this.f.i() + 4, this.f.j(), this.f.k(), this.f.l(), this.f.m(), e, false);
        }

        @Override
        public void a(int $$0, int $$1, int $$2) {
            super.a($$0, $$1, $$2);
            for (ffg $$3 : this.b) {
                $$3.a($$0, $$1, $$2);
            }
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Entrances", ffg.a.listOf(), this.b);
        }
    }
}

