/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Quaternionfc;

public class hcz {
    static float a(float $$0, float $$1, float $$2) {
        return bgj.a(bgj.f($$0, $$1, $$2), 0.0f, 1.0f);
    }

    public static <T extends idy> void a(hdg $$0, hdg $$1, boolean $$2, dlt $$3, T $$4) {
        int $$5 = $$2 ? 1 : -1;
        $$0.f = -0.1f * (float)$$5 + $$1.f;
        $$0.e = -1.5707964f + $$1.e + 0.8f;
        if ($$4.ai || $$4.ab > 0.0f) {
            $$0.e -= 0.9599311f;
        }
        $$0.f = (float)Math.PI / 180 * Math.clamp(57.295776f * $$0.f, -60.0f, 60.0f);
        $$0.e = (float)Math.PI / 180 * Math.clamp(57.295776f * $$0.e, -120.0f, 30.0f);
        if ($$4.ae <= 0.0f || $$4.al && $$4.ag != ($$2 ? cdb.a : cdb.b)) {
            return;
        }
        doq $$6 = $$3.a(ki.O);
        if ($$6 == null) {
            return;
        }
        a $$7 = a.a($$6, $$4.ae);
        $$0.f += (float)(-$$5) * $$7.j() * ((float)Math.PI / 180) * $$7.h() * 1.0f;
        $$0.g += (float)(-$$5) * $$7.i() * ((float)Math.PI / 180) * $$7.h() * 0.5f;
        $$0.e += (float)Math.PI / 180 * (-40.0f * $$7.b() + 30.0f * $$7.c() + -20.0f * $$7.d() + 20.0f * $$7.f() + 10.0f * $$7.g() + 0.6f * $$7.i() * $$7.h());
    }

    public static <S extends ich> void a(S $$0, fzm $$1, float $$2, chb $$3, dlt $$4) {
        doq $$5 = $$4.a(ki.O);
        if ($$5 == null || $$2 == 0.0f) {
            return;
        }
        float $$6 = bfi.z(hcz.a($$0.m, 0.05f, 0.2f));
        float $$7 = bfi.y(hcz.a($$0.m, 0.4f, 1.0f));
        a $$8 = a.a($$5, $$2);
        int $$9 = $$3 == chb.b ? 1 : -1;
        float $$10 = 1.0f - bfi.v(1.0f - $$8.a());
        float $$11 = 0.125f;
        float $$12 = hcz.a($$0.aB);
        $$1.a(0.0, (double)(-$$12) * 0.4, (double)(-$$5.g() * ($$10 - $$8.g()) + $$12));
        $$1.a((Quaternionfc)a.a.rotationDegrees(70.0f * ($$8.a() - $$8.g()) - 40.0f * ($$6 - $$7)), 0.0f, -0.03125f, 0.125f);
        $$1.a((Quaternionfc)a.d.rotationDegrees((float)($$9 * 90) * ($$8.a() - $$8.e() + 3.0f * $$7 + $$6)), 0.0f, 0.0f, 0.125f);
    }

    public static <T extends idy> void a(gzo<T> $$0, T $$1) {
        float $$2 = $$1.m;
        chb $$3 = $$1.af;
        $$0.k.f -= $$0.j.f;
        $$0.l.f -= $$0.j.f;
        $$0.l.e -= $$0.j.f;
        float $$4 = bfi.u(hcz.a($$2, 0.0f, 0.05f));
        float $$5 = bfi.z(hcz.a($$2, 0.05f, 0.2f));
        float $$6 = bfi.y(hcz.a($$2, 0.4f, 1.0f));
        $$0.a((chb)$$3).e += (90.0f * $$4 - 120.0f * $$5 + 30.0f * $$6) * ((float)Math.PI / 180);
    }

    public static <S extends ich> void a(S $$0, fzm $$1) {
        if ($$0.m <= 0.0f) {
            return;
        }
        doq $$2 = $$0.b().a(ki.O);
        float $$3 = $$2 != null ? $$2.g() : 0.0f;
        float $$4 = 0.125f;
        float $$5 = $$0.m;
        float $$6 = bfi.z(hcz.a($$5, 0.05f, 0.2f));
        float $$7 = bfi.y(hcz.a($$5, 0.4f, 1.0f));
        $$1.a((Quaternionfc)a.a.rotationDegrees(70.0f * ($$6 - $$7)), 0.0f, -0.125f, 0.125f);
        $$1.a(0.0f, $$3 * ($$6 - $$7), 0.0f);
    }

    private static float a(float $$0) {
        return 0.4f * (bfi.w(hcz.a($$0, 1.0f, 3.0f)) - bfi.u(hcz.a($$0, 3.0f, 10.0f)));
    }

    public static void a(float $$0, fzm $$1, float $$2, chb $$3, dlt $$4) {
        doq $$5 = $$4.a(ki.O);
        if ($$5 == null) {
            return;
        }
        a $$6 = a.a($$5, $$2);
        int $$7 = $$3 == chb.b ? 1 : -1;
        $$1.a((double)((float)$$7 * ($$6.a() * 0.15f + $$6.d() * -0.05f + $$6.e() * -0.1f + $$6.i() * 0.005f)), (double)($$6.a() * -0.075f + $$6.c() * 0.075f + $$6.j() * 0.01f), (double)$$6.b() * 0.05 + (double)$$6.d() * -0.05 + (double)($$6.i() * 0.005f));
        $$1.a((Quaternionfc)a.b.rotationDegrees(-65.0f * bfi.D($$6.a()) - 35.0f * $$6.f() + 100.0f * $$6.g() + -0.5f * $$6.j()), 0.0f, 0.1f, 0.0f);
        $$1.a((Quaternionfc)a.c.rotationDegrees((float)$$7 * (-90.0f * hcz.a($$6.a(), 0.5f, 0.55f) + 90.0f * $$6.e() + 2.0f * $$6.i())), (float)$$7 * 0.15f, 0.0f, 0.0f);
        $$1.a(0.0f, -hcz.a($$0), 0.0f);
    }

    public static void a(float $$0, fzm $$1, int $$2, chb $$3) {
        float $$4 = bfi.u(hcz.a($$0, 0.0f, 0.05f));
        float $$5 = bfi.v(hcz.a($$0, 0.05f, 0.2f));
        float $$6 = bfi.y(hcz.a($$0, 0.4f, 1.0f));
        $$1.a((float)$$2 * 0.1f * ($$4 - $$5), -0.075f * ($$4 - $$6), 0.65f * ($$4 - $$5));
        $$1.a((Quaternionfc)a.b.rotationDegrees(-70.0f * ($$4 - $$6)));
        $$1.a(0.0, 0.0, -0.25 * (double)($$6 - $$5));
    }

    record a(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j) {
        public static a a(doq $$0, float $$1) {
            int $$2 = $$0.c();
            int $$3 = $$0.d().map(doq.a::a).orElse(0) + $$2;
            int $$4 = $$3 - 20;
            int $$5 = $$0.e().map(doq.a::a).orElse(0) + $$2;
            int $$6 = $$5 - 40;
            int $$7 = $$0.f().map(doq.a::a).orElse(0) + $$2;
            float $$8 = hcz.a($$1, 0.0f, $$2);
            float $$9 = hcz.a($$8, 0.0f, 0.5f);
            float $$10 = hcz.a($$8, 0.5f, 0.8f);
            float $$11 = hcz.a($$8, 0.8f, 1.0f);
            float $$12 = hcz.a($$1, $$4, $$6);
            float $$13 = bfi.x(bfi.B(hcz.a($$1 - 20.0f, $$6, $$5)));
            float $$14 = hcz.a($$1, $$7 - 5, $$7);
            float $$15 = 2.0f * bfi.A($$12) - 2.0f * bfi.C($$14);
            float $$16 = bgj.a((double)($$1 * 19.0f * ((float)Math.PI / 180))) * $$15;
            float $$17 = bgj.a((double)($$1 * 30.0f * ((float)Math.PI / 180))) * $$15;
            return new a($$8, $$9, $$10, $$11, $$12, $$13, $$14, $$15, $$16, $$17);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "raiseProgress;raiseProgressStart;raiseProgressMiddle;raiseProgressEnd;swayProgress;lowerProgress;raiseBackProgress;swayIntensity;swayScaleSlow;swayScaleFast", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }
    }
}

