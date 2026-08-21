/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class hpt {
    private static final float a = 0.225f;
    private static final int b = 10;
    private static final amo c = amo.b("textures/environment/rain.png");
    private static final amo d = amo.b("textures/environment/snow.png");
    private static final int e = 32;
    private static final int f = 16;
    private int g;
    private final float[] h = new float[1024];
    private final float[] i = new float[1024];

    public hpt() {
        for (int $$0 = 0; $$0 < 32; ++$$0) {
            for (int $$1 = 0; $$1 < 32; ++$$1) {
                float $$2 = $$1 - 16;
                float $$3 = $$0 - 16;
                float $$4 = bgj.g($$2, $$3);
                this.h[$$0 * 32 + $$1] = -$$3 / $$4;
                this.i[$$0 * 32 + $$1] = $$2 / $$4;
            }
        }
    }

    public void a(dwo $$0, int $$1, float $$2, ftm $$3, ikw $$4) {
        $$4.c = $$0.c($$2);
        if ($$4.c <= 0.0f) {
            return;
        }
        $$4.d = gfj.V().k.m().b();
        int $$5 = bgj.c($$3.g);
        int $$6 = bgj.c($$3.h);
        int $$7 = bgj.c($$3.i);
        is.a $$8 = new is.a();
        bgr $$9 = bgr.a();
        for (int $$10 = $$7 - $$4.d; $$10 <= $$7 + $$4.d; ++$$10) {
            for (int $$11 = $$5 - $$4.d; $$11 <= $$5 + $$4.d; ++$$11) {
                dxo.c $$15;
                int $$12 = $$0.a(euq.a.e, $$11, $$10);
                int $$13 = Math.max($$6 - $$4.d, $$12);
                int $$14 = Math.max($$6 + $$4.d, $$12);
                if ($$14 - $$13 == 0 || ($$15 = this.a($$0, $$8.d($$11, $$6, $$10))) == dxo.c.a) continue;
                int $$16 = $$11 * $$11 * 3121 + $$11 * 45238971 ^ $$10 * $$10 * 418711 + $$10 * 13761;
                $$9.b((long)$$16);
                int $$17 = Math.max($$6, $$12);
                int $$18 = hoh.a($$0, $$8.d($$11, $$17, $$10));
                if ($$15 == dxo.c.b) {
                    $$4.a.add(this.a($$9, $$1, $$11, $$13, $$14, $$10, $$18, $$2));
                    continue;
                }
                if ($$15 != dxo.c.c) continue;
                $$4.b.add(this.b($$9, $$1, $$11, $$13, $$14, $$10, $$18, $$2));
            }
        }
    }

    public void a(hon $$0, ftm $$1, ikw $$2) {
        if (!$$2.a.isEmpty()) {
            ijs $$3 = ijt.f(c, gfj.T());
            this.a($$0.a($$3), $$2.a, $$1, 1.0f, $$2.d, $$2.c);
        }
        if (!$$2.b.isEmpty()) {
            ijs $$4 = ijt.f(d, gfj.T());
            this.a($$0.a($$4), $$2.b, $$1, 0.8f, $$2.d, $$2.c);
        }
    }

    private a a(bgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
        int $$8 = $$1 & 0x1FFFF;
        int $$9 = $$2 * $$2 * 3121 + $$2 * 45238971 + $$5 * $$5 * 418711 + $$5 * 13761 & 0xFF;
        float $$10 = 3.0f + $$0.i();
        float $$11 = -((float)($$8 + $$9) + $$7) / 32.0f * $$10;
        float $$12 = $$11 % 32.0f;
        return new a($$2, $$5, $$3, $$4, 0.0f, $$12, $$6);
    }

    private a b(bgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
        float $$8 = (float)$$1 + $$7;
        float $$9 = (float)($$0.j() + (double)($$8 * 0.01f * (float)$$0.k()));
        float $$10 = (float)($$0.j() + (double)($$8 * (float)$$0.k() * 0.001f));
        float $$11 = -((float)($$1 & 0x1FF) + $$7) / 512.0f;
        int $$12 = hoj.a((hoj.a($$6) * 3 + 15) / 4, (hoj.b($$6) * 3 + 15) / 4);
        return new a($$2, $$5, $$3, $$4, $$9, $$11 + $$10, $$12);
    }

    private void a(fzp $$0, List<a> $$1, ftm $$2, float $$3, int $$4, float $$5) {
        float $$6 = $$4 * $$4;
        for (a $$7 : $$1) {
            float $$8 = (float)((double)$$7.a + 0.5 - $$2.g);
            float $$9 = (float)((double)$$7.b + 0.5 - $$2.i);
            float $$10 = (float)bgj.e((double)$$8, (double)$$9);
            float $$11 = bgj.h(Math.min($$10 / $$6, 1.0f), $$3, 0.5f) * $$5;
            int $$12 = bel.b($$11);
            int $$13 = ($$7.b - bgj.c($$2.i) + 16) * 32 + $$7.a - bgj.c($$2.g) + 16;
            float $$14 = this.h[$$13] / 2.0f;
            float $$15 = this.i[$$13] / 2.0f;
            float $$16 = $$8 - $$14;
            float $$17 = $$8 + $$14;
            float $$18 = (float)((double)$$7.d - $$2.h);
            float $$19 = (float)((double)$$7.c - $$2.h);
            float $$20 = $$9 - $$15;
            float $$21 = $$9 + $$15;
            float $$22 = $$7.e + 0.0f;
            float $$23 = $$7.e + 1.0f;
            float $$24 = (float)$$7.c * 0.25f + $$7.f;
            float $$25 = (float)$$7.d * 0.25f + $$7.f;
            $$0.a($$16, $$18, $$20).a($$22, $$24).a($$12).c($$7.g);
            $$0.a($$17, $$18, $$21).a($$23, $$24).a($$12).c($$7.g);
            $$0.a($$17, $$19, $$21).a($$23, $$25).a($$12).c($$7.g);
            $$0.a($$16, $$19, $$20).a($$22, $$25).a($$12).c($$7.g);
        }
    }

    public void a(hif $$0, ger $$1, int $$2, awx $$3, int $$4) {
        float $$5 = $$0.c(1.0f);
        if ($$5 <= 0.0f) {
            return;
        }
        bgr $$6 = bgr.a((long)$$2 * 312987231L);
        is $$7 = is.a($$1.b());
        jy $$8 = null;
        int $$9 = 2 * $$4 + 1;
        int $$10 = $$9 * $$9;
        int $$11 = (int)(0.225f * (float)$$10 * $$5 * $$5) / ($$3 == awx.b ? 2 : 1);
        for (int $$12 = 0; $$12 < $$11; ++$$12) {
            int $$14;
            int $$13 = $$6.a($$9) - $$4;
            is $$15 = $$0.a(euq.a.e, $$7.b($$13, 0, $$14 = $$6.a($$9) - $$4));
            if ($$15.v() <= $$0.K_() || $$15.v() > $$7.v() + 10 || $$15.v() < $$7.v() - 10 || this.a($$0, $$15) != dxo.c.b) continue;
            $$8 = $$15.e();
            if ($$3 == awx.c) break;
            double $$16 = $$6.j();
            double $$17 = $$6.j();
            eoh $$18 = $$0.a_((is)$$8);
            flb $$19 = $$0.b_((is)$$8);
            fug $$20 = $$18.g($$0, (is)$$8);
            double $$21 = $$20.b(iz.a.b, $$16, $$17);
            double $$22 = $$19.a($$0, (is)$$8);
            double $$23 = Math.max($$21, $$22);
            md $$24 = $$19.a(bdv.b) || $$18.a(dzs.lF) || eag.h($$18) ? ly.ai : ly.ah;
            $$0.a($$24, (double)$$8.u() + $$16, (double)$$8.v() + $$23, (double)$$8.w() + $$17, 0.0, 0.0, 0.0);
        }
        if ($$8 != null && $$6.a(3) < this.g++) {
            this.g = 0;
            if ($$8.v() > $$7.v() + 1 && $$0.a(euq.a.e, $$7).v() > bgj.b((float)$$7.v())) {
                $$0.a((is)$$8, bda.Fx, bdb.d, 0.1f, 0.5f, false);
            } else {
                $$0.a((is)$$8, bda.Fw, bdb.d, 0.2f, 1.0f, false);
            }
        }
    }

    private dxo.c a(dwo $$0, is $$1) {
        if (!$$0.ac().b(jw.a($$1.u()), jw.a($$1.w()))) {
            return dxo.c.a;
        }
        dxo $$2 = $$0.z($$1).a();
        return $$2.a($$1, $$0.V());
    }

    public static final class a
    extends Record {
        final int a;
        final int b;
        final int c;
        final int d;
        final float e;
        final float f;
        final int g;

        public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, int $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;z;bottomY;topY;uOffset;vOffset;lightCoords", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public float e() {
            return this.e;
        }

        public float f() {
            return this.f;
        }

        public int g() {
            return this.g;
        }
    }
}

