/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 *  org.joml.Vector3fc
 */
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.List;
import org.joml.Vector3fc;

public class hpy {
    private static final iz[] a = iz.values();
    private final ggr b;
    private static final int c = 100;
    static final ThreadLocal<d> d = ThreadLocal.withInitial(d::new);

    public hpy(ggr $$0) {
        this.b = $$0;
    }

    public void a(dvq $$0, List<hqg> $$1, eoh $$2, is $$3, fzm $$4, fzp $$5, boolean $$6, int $$7) {
        if ($$1.isEmpty()) {
            return;
        }
        boolean $$8 = gfj.U() && $$2.k() == 0 && $$1.getFirst().a();
        $$4.a($$2.a($$3));
        try {
            if ($$8) {
                this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            } else {
                this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }
        }
        catch (Throwable $$9) {
            m $$10 = m.a($$9, "Tesselating block model");
            n $$11 = $$10.a("Block model being tesselated");
            n.a($$11, $$0, $$3, $$2);
            $$11.a("Using AO", $$8);
            throw new v($$10);
        }
    }

    private static boolean a(dvq $$0, eoh $$1, boolean $$2, iz $$3, is $$4) {
        if (!$$2) {
            return true;
        }
        eoh $$5 = $$0.a_($$4);
        return dzq.a($$1, $$5, $$3);
    }

    public void b(dvq $$0, List<hqg> $$1, eoh $$2, is $$3, fzm $$4, fzp $$5, boolean $$6, int $$7) {
        b $$8 = new b();
        int $$9 = 0;
        int $$10 = 0;
        for (hqg $$11 : $$1) {
            for (iz $$12 : a) {
                List<hqa> $$16;
                boolean $$15;
                int $$13 = 1 << $$12.ordinal();
                boolean $$14 = ($$9 & $$13) == 1;
                boolean bl2 = $$15 = ($$10 & $$13) == 1;
                if ($$14 && !$$15 || ($$16 = $$11.a($$12)).isEmpty()) continue;
                if (!$$14) {
                    $$15 = hpy.a($$0, $$2, $$6, $$12, $$8.a.a((jy)$$3, $$12));
                    $$9 |= $$13;
                    if ($$15) {
                        $$10 |= $$13;
                    }
                }
                if (!$$15) continue;
                this.a($$0, $$2, $$3, $$4, $$5, $$16, $$8, $$7);
            }
            List<hqa> $$17 = $$11.a(null);
            if ($$17.isEmpty()) continue;
            this.a($$0, $$2, $$3, $$4, $$5, $$17, $$8, $$7);
        }
    }

    public void c(dvq $$0, List<hqg> $$1, eoh $$2, is $$3, fzm $$4, fzp $$5, boolean $$6, int $$7) {
        e $$8 = new e();
        int $$9 = 0;
        int $$10 = 0;
        for (hqg $$11 : $$1) {
            for (iz $$12 : a) {
                List<hqa> $$16;
                boolean $$15;
                int $$13 = 1 << $$12.ordinal();
                boolean $$14 = ($$9 & $$13) == 1;
                boolean bl2 = $$15 = ($$10 & $$13) == 1;
                if ($$14 && !$$15 || ($$16 = $$11.a($$12)).isEmpty()) continue;
                is.a $$17 = $$8.a.a((jy)$$3, $$12);
                if (!$$14) {
                    $$15 = hpy.a($$0, $$2, $$6, $$12, $$17);
                    $$9 |= $$13;
                    if ($$15) {
                        $$10 |= $$13;
                    }
                }
                if (!$$15) continue;
                int $$18 = $$8.h.a($$2, $$0, $$17);
                this.a($$0, $$2, $$3, $$18, $$7, false, $$4, $$5, $$16, $$8);
            }
            List<hqa> $$19 = $$11.a(null);
            if ($$19.isEmpty()) continue;
            this.a($$0, $$2, $$3, -1, $$7, true, $$4, $$5, $$19, $$8);
        }
    }

    private void a(dvq $$0, eoh $$1, is $$2, fzm $$3, fzp $$4, List<hqa> $$5, b $$6, int $$7) {
        for (hqa $$8 : $$5) {
            hpy.a($$0, $$1, $$2, $$8, $$6);
            $$6.a($$0, $$1, $$2, $$8.k(), $$8.m());
            this.a($$0, $$1, $$2, $$4, $$3.c(), $$8, (e)$$6, $$7);
        }
    }

    private void a(dvq $$0, eoh $$1, is $$2, fzp $$3, fzm.a $$4, hqa $$5, e $$6, int $$7) {
        float $$16;
        float $$15;
        float $$14;
        int $$8 = $$5.j();
        if ($$8 != -1) {
            int $$10;
            if ($$6.f == $$8) {
                int $$9 = $$6.g;
            } else {
                $$10 = this.b.a($$1, $$0, $$2, $$8);
                $$6.f = $$8;
                $$6.g = $$10;
            }
            float $$11 = bel.n($$10);
            float $$12 = bel.o($$10);
            float $$13 = bel.p($$10);
        } else {
            $$14 = 1.0f;
            $$15 = 1.0f;
            $$16 = 1.0f;
        }
        $$3.a($$4, $$5, $$6.d, $$14, $$15, $$16, 1.0f, $$6.e, $$7);
    }

    private static void a(dvq $$0, eoh $$1, is $$2, hqa $$3, e $$4) {
        float $$5 = 32.0f;
        float $$6 = 32.0f;
        float $$7 = 32.0f;
        float $$8 = -32.0f;
        float $$9 = -32.0f;
        float $$10 = -32.0f;
        for (int $$11 = 0; $$11 < 4; ++$$11) {
            Vector3fc $$12 = $$3.a($$11);
            float $$13 = $$12.x();
            float $$14 = $$12.y();
            float $$15 = $$12.z();
            $$5 = Math.min($$5, $$13);
            $$6 = Math.min($$6, $$14);
            $$7 = Math.min($$7, $$15);
            $$8 = Math.max($$8, $$13);
            $$9 = Math.max($$9, $$14);
            $$10 = Math.max($$10, $$15);
        }
        if ($$4 instanceof b) {
            b $$16 = (b)$$4;
            $$16.i[f.e.n] = $$5;
            $$16.i[f.f.n] = $$8;
            $$16.i[f.a.n] = $$6;
            $$16.i[f.b.n] = $$9;
            $$16.i[f.c.n] = $$7;
            $$16.i[f.d.n] = $$10;
            $$16.i[f.k.n] = 1.0f - $$5;
            $$16.i[f.l.n] = 1.0f - $$8;
            $$16.i[f.g.n] = 1.0f - $$6;
            $$16.i[f.h.n] = 1.0f - $$9;
            $$16.i[f.i.n] = 1.0f - $$7;
            $$16.i[f.j.n] = 1.0f - $$10;
        }
        float $$17 = 1.0E-4f;
        float $$18 = 0.9999f;
        $$4.c = switch ($$3.k()) {
            default -> throw new MatchException(null, null);
            case iz.a, iz.b -> {
                if ($$5 >= 1.0E-4f || $$7 >= 1.0E-4f || $$8 <= 0.9999f || $$10 <= 0.9999f) {
                    yield true;
                }
                yield false;
            }
            case iz.c, iz.d -> {
                if ($$5 >= 1.0E-4f || $$6 >= 1.0E-4f || $$8 <= 0.9999f || $$9 <= 0.9999f) {
                    yield true;
                }
                yield false;
            }
            case iz.e, iz.f -> $$6 >= 1.0E-4f || $$7 >= 1.0E-4f || $$9 <= 0.9999f || $$10 <= 0.9999f;
        };
        $$4.b = switch ($$3.k()) {
            default -> throw new MatchException(null, null);
            case iz.a -> {
                if ($$6 == $$9 && ($$6 < 1.0E-4f || $$1.m($$0, $$2))) {
                    yield true;
                }
                yield false;
            }
            case iz.b -> {
                if ($$6 == $$9 && ($$9 > 0.9999f || $$1.m($$0, $$2))) {
                    yield true;
                }
                yield false;
            }
            case iz.c -> {
                if ($$7 == $$10 && ($$7 < 1.0E-4f || $$1.m($$0, $$2))) {
                    yield true;
                }
                yield false;
            }
            case iz.d -> {
                if ($$7 == $$10 && ($$10 > 0.9999f || $$1.m($$0, $$2))) {
                    yield true;
                }
                yield false;
            }
            case iz.e -> {
                if ($$5 == $$8 && ($$5 < 1.0E-4f || $$1.m($$0, $$2))) {
                    yield true;
                }
                yield false;
            }
            case iz.f -> $$5 == $$8 && ($$8 > 0.9999f || $$1.m($$0, $$2));
        };
    }

    private void a(dvq $$0, eoh $$1, is $$2, int $$3, int $$4, boolean $$5, fzm $$6, fzp $$7, List<hqa> $$8, e $$9) {
        for (hqa $$10 : $$8) {
            float $$12;
            if ($$5) {
                hpy.a($$0, $$1, $$2, $$10, $$9);
                is $$11 = $$9.b ? $$9.a.a((jy)$$2, $$10.k()) : $$2;
                $$3 = $$9.h.a($$1, $$0, $$11);
            }
            $$9.d[0] = $$12 = $$0.a($$10.k(), $$10.m());
            $$9.d[1] = $$12;
            $$9.d[2] = $$12;
            $$9.d[3] = $$12;
            $$9.e[0] = $$3;
            $$9.e[1] = $$3;
            $$9.e[2] = $$3;
            $$9.e[3] = $$3;
            this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$9, $$4);
        }
    }

    public static void a(fzm.a $$0, fzp $$1, hqh $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
        for (hqg $$8 : $$2.a(bgr.a(42L))) {
            for (iz $$9 : a) {
                hpy.a($$0, $$1, $$3, $$4, $$5, $$8.a($$9), $$6, $$7);
            }
            hpy.a($$0, $$1, $$3, $$4, $$5, $$8.a(null), $$6, $$7);
        }
    }

    private static void a(fzm.a $$0, fzp $$1, float $$2, float $$3, float $$4, List<hqa> $$5, int $$6, int $$7) {
        for (hqa $$8 : $$5) {
            float $$14;
            float $$13;
            float $$12;
            if ($$8.a()) {
                float $$9 = bgj.a($$2, 0.0f, 1.0f);
                float $$10 = bgj.a($$3, 0.0f, 1.0f);
                float $$11 = bgj.a($$4, 0.0f, 1.0f);
            } else {
                $$12 = 1.0f;
                $$13 = 1.0f;
                $$14 = 1.0f;
            }
            $$1.a($$0, $$8, $$12, $$13, $$14, 1.0f, $$6, $$7);
        }
    }

    public static void a() {
        d.get().a();
    }

    public static void b() {
        d.get().b();
    }

    static class b
    extends e {
        final float[] i = new float[f.m];

        public void a(dvq $$0, eoh $$1, is $$2, iz $$3, boolean $$4) {
            int $$47;
            float $$46;
            int $$42;
            float $$41;
            int $$37;
            float $$36;
            int $$32;
            float $$31;
            boolean $$27;
            is $$5 = this.b ? $$2.a($$3) : $$2;
            a $$6 = hpy$a.a($$3);
            is.a $$7 = this.a;
            $$7.a((jy)$$5, $$6.g[0]);
            eoh $$8 = $$0.a_($$7);
            int $$9 = this.h.a($$8, $$0, $$7);
            float $$10 = this.h.b($$8, $$0, $$7);
            $$7.a((jy)$$5, $$6.g[1]);
            eoh $$11 = $$0.a_($$7);
            int $$12 = this.h.a($$11, $$0, $$7);
            float $$13 = this.h.b($$11, $$0, $$7);
            $$7.a((jy)$$5, $$6.g[2]);
            eoh $$14 = $$0.a_($$7);
            int $$15 = this.h.a($$14, $$0, $$7);
            float $$16 = this.h.b($$14, $$0, $$7);
            $$7.a((jy)$$5, $$6.g[3]);
            eoh $$17 = $$0.a_($$7);
            int $$18 = this.h.a($$17, $$0, $$7);
            float $$19 = this.h.b($$17, $$0, $$7);
            eoh $$20 = $$0.a_($$7.a((jy)$$5, $$6.g[0]).c($$3));
            boolean $$21 = !$$20.k($$0, $$7) || $$20.g() == 0;
            eoh $$22 = $$0.a_($$7.a((jy)$$5, $$6.g[1]).c($$3));
            boolean $$23 = !$$22.k($$0, $$7) || $$22.g() == 0;
            eoh $$24 = $$0.a_($$7.a((jy)$$5, $$6.g[2]).c($$3));
            boolean $$25 = !$$24.k($$0, $$7) || $$24.g() == 0;
            eoh $$26 = $$0.a_($$7.a((jy)$$5, $$6.g[3]).c($$3));
            boolean bl2 = $$27 = !$$26.k($$0, $$7) || $$26.g() == 0;
            if ($$25 || $$21) {
                $$7.a((jy)$$5, $$6.g[0]).c($$6.g[2]);
                eoh $$28 = $$0.a_($$7);
                float $$29 = this.h.b($$28, $$0, $$7);
                int $$30 = this.h.a($$28, $$0, $$7);
            } else {
                $$31 = $$10;
                $$32 = $$9;
            }
            if ($$27 || $$21) {
                $$7.a((jy)$$5, $$6.g[0]).c($$6.g[3]);
                eoh $$33 = $$0.a_($$7);
                float $$34 = this.h.b($$33, $$0, $$7);
                int $$35 = this.h.a($$33, $$0, $$7);
            } else {
                $$36 = $$10;
                $$37 = $$9;
            }
            if ($$25 || $$23) {
                $$7.a((jy)$$5, $$6.g[1]).c($$6.g[2]);
                eoh $$38 = $$0.a_($$7);
                float $$39 = this.h.b($$38, $$0, $$7);
                int $$40 = this.h.a($$38, $$0, $$7);
            } else {
                $$41 = $$10;
                $$42 = $$9;
            }
            if ($$27 || $$23) {
                $$7.a((jy)$$5, $$6.g[1]).c($$6.g[3]);
                eoh $$43 = $$0.a_($$7);
                float $$44 = this.h.b($$43, $$0, $$7);
                int $$45 = this.h.a($$43, $$0, $$7);
            } else {
                $$46 = $$10;
                $$47 = $$9;
            }
            int $$48 = this.h.a($$1, $$0, $$2);
            $$7.a((jy)$$2, $$3);
            eoh $$49 = $$0.a_($$7);
            if (this.b || !$$49.s()) {
                $$48 = this.h.a($$49, $$0, $$7);
            }
            float $$50 = this.b ? this.h.b($$0.a_($$5), $$0, $$5) : this.h.b($$0.a_($$2), $$0, $$2);
            c $$51 = hpy$c.a($$3);
            if (!this.c || !$$6.h) {
                float $$52 = ($$19 + $$10 + $$36 + $$50) * 0.25f;
                float $$53 = ($$16 + $$10 + $$31 + $$50) * 0.25f;
                float $$54 = ($$16 + $$13 + $$41 + $$50) * 0.25f;
                float $$55 = ($$19 + $$13 + $$46 + $$50) * 0.25f;
                this.e[$$51.g] = hpy$b.a($$18, $$9, $$37, $$48);
                this.e[$$51.h] = hpy$b.a($$15, $$9, $$32, $$48);
                this.e[$$51.i] = hpy$b.a($$15, $$12, $$42, $$48);
                this.e[$$51.j] = hpy$b.a($$18, $$12, $$47, $$48);
                this.d[$$51.g] = $$52;
                this.d[$$51.h] = $$53;
                this.d[$$51.i] = $$54;
                this.d[$$51.j] = $$55;
            } else {
                float $$56 = ($$19 + $$10 + $$36 + $$50) * 0.25f;
                float $$57 = ($$16 + $$10 + $$31 + $$50) * 0.25f;
                float $$58 = ($$16 + $$13 + $$41 + $$50) * 0.25f;
                float $$59 = ($$19 + $$13 + $$46 + $$50) * 0.25f;
                float $$60 = this.i[$$6.i[0].n] * this.i[$$6.i[1].n];
                float $$61 = this.i[$$6.i[2].n] * this.i[$$6.i[3].n];
                float $$62 = this.i[$$6.i[4].n] * this.i[$$6.i[5].n];
                float $$63 = this.i[$$6.i[6].n] * this.i[$$6.i[7].n];
                float $$64 = this.i[$$6.j[0].n] * this.i[$$6.j[1].n];
                float $$65 = this.i[$$6.j[2].n] * this.i[$$6.j[3].n];
                float $$66 = this.i[$$6.j[4].n] * this.i[$$6.j[5].n];
                float $$67 = this.i[$$6.j[6].n] * this.i[$$6.j[7].n];
                float $$68 = this.i[$$6.k[0].n] * this.i[$$6.k[1].n];
                float $$69 = this.i[$$6.k[2].n] * this.i[$$6.k[3].n];
                float $$70 = this.i[$$6.k[4].n] * this.i[$$6.k[5].n];
                float $$71 = this.i[$$6.k[6].n] * this.i[$$6.k[7].n];
                float $$72 = this.i[$$6.l[0].n] * this.i[$$6.l[1].n];
                float $$73 = this.i[$$6.l[2].n] * this.i[$$6.l[3].n];
                float $$74 = this.i[$$6.l[4].n] * this.i[$$6.l[5].n];
                float $$75 = this.i[$$6.l[6].n] * this.i[$$6.l[7].n];
                this.d[$$51.g] = Math.clamp($$56 * $$60 + $$57 * $$61 + $$58 * $$62 + $$59 * $$63, 0.0f, 1.0f);
                this.d[$$51.h] = Math.clamp($$56 * $$64 + $$57 * $$65 + $$58 * $$66 + $$59 * $$67, 0.0f, 1.0f);
                this.d[$$51.i] = Math.clamp($$56 * $$68 + $$57 * $$69 + $$58 * $$70 + $$59 * $$71, 0.0f, 1.0f);
                this.d[$$51.j] = Math.clamp($$56 * $$72 + $$57 * $$73 + $$58 * $$74 + $$59 * $$75, 0.0f, 1.0f);
                int $$76 = hpy$b.a($$18, $$9, $$37, $$48);
                int $$77 = hpy$b.a($$15, $$9, $$32, $$48);
                int $$78 = hpy$b.a($$15, $$12, $$42, $$48);
                int $$79 = hpy$b.a($$18, $$12, $$47, $$48);
                this.e[$$51.g] = hpy$b.a($$76, $$77, $$78, $$79, $$60, $$61, $$62, $$63);
                this.e[$$51.h] = hpy$b.a($$76, $$77, $$78, $$79, $$64, $$65, $$66, $$67);
                this.e[$$51.i] = hpy$b.a($$76, $$77, $$78, $$79, $$68, $$69, $$70, $$71);
                this.e[$$51.j] = hpy$b.a($$76, $$77, $$78, $$79, $$72, $$73, $$74, $$75);
            }
            float $$80 = $$0.a($$3, $$4);
            int $$81 = 0;
            while ($$81 < this.d.length) {
                int n2 = $$81++;
                this.d[n2] = this.d[n2] * $$80;
            }
        }

        private static int a(int $$0, int $$1, int $$2, int $$3) {
            if ($$0 == 0) {
                $$0 = $$3;
            }
            if ($$1 == 0) {
                $$1 = $$3;
            }
            if ($$2 == 0) {
                $$2 = $$3;
            }
            return $$0 + $$1 + $$2 + $$3 >> 2 & 0xFF00FF;
        }

        private static int a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
            int $$8 = (int)((float)($$0 >> 16 & 0xFF) * $$4 + (float)($$1 >> 16 & 0xFF) * $$5 + (float)($$2 >> 16 & 0xFF) * $$6 + (float)($$3 >> 16 & 0xFF) * $$7) & 0xFF;
            int $$9 = (int)((float)($$0 & 0xFF) * $$4 + (float)($$1 & 0xFF) * $$5 + (float)($$2 & 0xFF) * $$6 + (float)($$3 & 0xFF) * $$7) & 0xFF;
            return $$8 << 16 | $$9;
        }
    }

    static class e {
        public final is.a a = new is.a();
        public boolean b;
        public boolean c;
        public final float[] d = new float[4];
        public final int[] e = new int[4];
        public int f = -1;
        public int g;
        public final d h = d.get();

        e() {
        }
    }

    static class d {
        private boolean a;
        private final Long2IntLinkedOpenHashMap b = bhs.a(() -> {
            Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25f){

                protected void rehash(int $$0) {
                }
            };
            $$0.defaultReturnValue(Integer.MAX_VALUE);
            return $$0;
        });
        private final Long2FloatLinkedOpenHashMap c = bhs.a(() -> {
            Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(100, 0.25f){

                protected void rehash(int $$0) {
                }
            };
            $$0.defaultReturnValue(Float.NaN);
            return $$0;
        });
        private final hoh.a d = ($$0, $$1) -> {
            long $$2 = $$1.a();
            int $$3 = this.b.get($$2);
            if ($$3 != Integer.MAX_VALUE) {
                return $$3;
            }
            int $$4 = hoh.a.a.packedBrightness($$0, $$1);
            if (this.b.size() == 100) {
                this.b.removeFirstInt();
            }
            this.b.put($$2, $$4);
            return $$4;
        };

        private d() {
        }

        public void a() {
            this.a = true;
        }

        public void b() {
            this.a = false;
            this.b.clear();
            this.c.clear();
        }

        public int a(eoh $$0, dvq $$1, is $$2) {
            return hoh.a(this.a ? this.d : hoh.a.a, $$1, $$0, $$2);
        }

        public float b(eoh $$0, dvq $$1, is $$2) {
            float $$4;
            long $$3 = $$2.a();
            if (this.a && !Float.isNaN($$4 = this.c.get($$3))) {
                return $$4;
            }
            float $$5 = $$0.c($$1, $$2);
            if (this.a) {
                if (this.c.size() == 100) {
                    this.c.removeFirstFloat();
                }
                this.c.put($$3, $$5);
            }
            return $$5;
        }
    }

    protected static final class f
    extends Enum<f> {
        public static final /* enum */ f a = new f(0);
        public static final /* enum */ f b = new f(1);
        public static final /* enum */ f c = new f(2);
        public static final /* enum */ f d = new f(3);
        public static final /* enum */ f e = new f(4);
        public static final /* enum */ f f = new f(5);
        public static final /* enum */ f g = new f(6);
        public static final /* enum */ f h = new f(7);
        public static final /* enum */ f i = new f(8);
        public static final /* enum */ f j = new f(9);
        public static final /* enum */ f k = new f(10);
        public static final /* enum */ f l = new f(11);
        public static final int m;
        final int n;
        private static final /* synthetic */ f[] o;

        public static f[] values() {
            return (f[])o.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        private f(int $$0) {
            this.n = $$0;
        }

        private static /* synthetic */ f[] a() {
            return new f[]{a, b, c, d, e, f, g, h, i, j, k, l};
        }

        static {
            o = hpy$f.a();
            m = hpy$f.values().length;
        }
    }

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(new iz[]{iz.e, iz.f, iz.c, iz.d}, 0.5f, true, new f[]{hpy$f.k, hpy$f.d, hpy$f.k, hpy$f.j, hpy$f.e, hpy$f.j, hpy$f.e, hpy$f.d}, new f[]{hpy$f.k, hpy$f.c, hpy$f.k, hpy$f.i, hpy$f.e, hpy$f.i, hpy$f.e, hpy$f.c}, new f[]{hpy$f.l, hpy$f.c, hpy$f.l, hpy$f.i, hpy$f.f, hpy$f.i, hpy$f.f, hpy$f.c}, new f[]{hpy$f.l, hpy$f.d, hpy$f.l, hpy$f.j, hpy$f.f, hpy$f.j, hpy$f.f, hpy$f.d});
        public static final /* enum */ a b = new a(new iz[]{iz.f, iz.e, iz.c, iz.d}, 1.0f, true, new f[]{hpy$f.f, hpy$f.d, hpy$f.f, hpy$f.j, hpy$f.l, hpy$f.j, hpy$f.l, hpy$f.d}, new f[]{hpy$f.f, hpy$f.c, hpy$f.f, hpy$f.i, hpy$f.l, hpy$f.i, hpy$f.l, hpy$f.c}, new f[]{hpy$f.e, hpy$f.c, hpy$f.e, hpy$f.i, hpy$f.k, hpy$f.i, hpy$f.k, hpy$f.c}, new f[]{hpy$f.e, hpy$f.d, hpy$f.e, hpy$f.j, hpy$f.k, hpy$f.j, hpy$f.k, hpy$f.d});
        public static final /* enum */ a c = new a(new iz[]{iz.b, iz.a, iz.f, iz.e}, 0.8f, true, new f[]{hpy$f.b, hpy$f.k, hpy$f.b, hpy$f.e, hpy$f.h, hpy$f.e, hpy$f.h, hpy$f.k}, new f[]{hpy$f.b, hpy$f.l, hpy$f.b, hpy$f.f, hpy$f.h, hpy$f.f, hpy$f.h, hpy$f.l}, new f[]{hpy$f.a, hpy$f.l, hpy$f.a, hpy$f.f, hpy$f.g, hpy$f.f, hpy$f.g, hpy$f.l}, new f[]{hpy$f.a, hpy$f.k, hpy$f.a, hpy$f.e, hpy$f.g, hpy$f.e, hpy$f.g, hpy$f.k});
        public static final /* enum */ a d = new a(new iz[]{iz.e, iz.f, iz.a, iz.b}, 0.8f, true, new f[]{hpy$f.b, hpy$f.k, hpy$f.h, hpy$f.k, hpy$f.h, hpy$f.e, hpy$f.b, hpy$f.e}, new f[]{hpy$f.a, hpy$f.k, hpy$f.g, hpy$f.k, hpy$f.g, hpy$f.e, hpy$f.a, hpy$f.e}, new f[]{hpy$f.a, hpy$f.l, hpy$f.g, hpy$f.l, hpy$f.g, hpy$f.f, hpy$f.a, hpy$f.f}, new f[]{hpy$f.b, hpy$f.l, hpy$f.h, hpy$f.l, hpy$f.h, hpy$f.f, hpy$f.b, hpy$f.f});
        public static final /* enum */ a e = new a(new iz[]{iz.b, iz.a, iz.c, iz.d}, 0.6f, true, new f[]{hpy$f.b, hpy$f.d, hpy$f.b, hpy$f.j, hpy$f.h, hpy$f.j, hpy$f.h, hpy$f.d}, new f[]{hpy$f.b, hpy$f.c, hpy$f.b, hpy$f.i, hpy$f.h, hpy$f.i, hpy$f.h, hpy$f.c}, new f[]{hpy$f.a, hpy$f.c, hpy$f.a, hpy$f.i, hpy$f.g, hpy$f.i, hpy$f.g, hpy$f.c}, new f[]{hpy$f.a, hpy$f.d, hpy$f.a, hpy$f.j, hpy$f.g, hpy$f.j, hpy$f.g, hpy$f.d});
        public static final /* enum */ a f = new a(new iz[]{iz.a, iz.b, iz.c, iz.d}, 0.6f, true, new f[]{hpy$f.g, hpy$f.d, hpy$f.g, hpy$f.j, hpy$f.a, hpy$f.j, hpy$f.a, hpy$f.d}, new f[]{hpy$f.g, hpy$f.c, hpy$f.g, hpy$f.i, hpy$f.a, hpy$f.i, hpy$f.a, hpy$f.c}, new f[]{hpy$f.h, hpy$f.c, hpy$f.h, hpy$f.i, hpy$f.b, hpy$f.i, hpy$f.b, hpy$f.c}, new f[]{hpy$f.h, hpy$f.d, hpy$f.h, hpy$f.j, hpy$f.b, hpy$f.j, hpy$f.b, hpy$f.d});
        final iz[] g;
        final boolean h;
        final f[] i;
        final f[] j;
        final f[] k;
        final f[] l;
        private static final a[] m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(iz[] $$0, float $$1, boolean $$2, f[] $$3, f[] $$4, f[] $$5, f[] $$6) {
            this.g = $$0;
            this.h = $$2;
            this.i = $$3;
            this.j = $$4;
            this.k = $$5;
            this.l = $$6;
        }

        public static a a(iz $$0) {
            return m[$$0.d()];
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            n = hpy$a.a();
            m = bhs.a(new a[6], $$0 -> {
                $$0[iz.a.d()] = a;
                $$0[iz.b.d()] = b;
                $$0[iz.c.d()] = c;
                $$0[iz.d.d()] = d;
                $$0[iz.e.d()] = e;
                $$0[iz.f.d()] = f;
            });
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c(0, 1, 2, 3);
        public static final /* enum */ c b = new c(2, 3, 0, 1);
        public static final /* enum */ c c = new c(3, 0, 1, 2);
        public static final /* enum */ c d = new c(0, 1, 2, 3);
        public static final /* enum */ c e = new c(3, 0, 1, 2);
        public static final /* enum */ c f = new c(1, 2, 3, 0);
        final int g;
        final int h;
        final int i;
        final int j;
        private static final c[] k;
        private static final /* synthetic */ c[] l;

        public static c[] values() {
            return (c[])l.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(int $$0, int $$1, int $$2, int $$3) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
            this.j = $$3;
        }

        public static c a(iz $$0) {
            return k[$$0.d()];
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d, e, f};
        }

        static {
            l = hpy$c.a();
            k = bhs.a(new c[6], $$0 -> {
                $$0[iz.a.d()] = a;
                $$0[iz.b.d()] = b;
                $$0[iz.c.d()] = c;
                $$0[iz.d.d()] = d;
                $$0[iz.e.d()] = e;
                $$0[iz.f.d()] = f;
            });
        }
    }
}

