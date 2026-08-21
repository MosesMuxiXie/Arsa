/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class hur
implements hug.a {
    private static final float a = 80.0f;
    private static final int b = 8;
    private static final boolean c = false;
    private static final boolean d = true;
    private static final boolean e = false;
    private static final boolean f = false;
    private static final boolean g = true;
    private static final boolean h = true;
    private static final float i = 0.32f;

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$32, htx $$42, float $$5) {
        $$32.c(bxf.f, ($$3, $$4) -> hur.a($$0, $$1, $$2, $$4.a(), $$4.b()));
    }

    private static void a(double $$0, double $$1, double $$2, flp $$3, float $$4) {
        hur.a($$3, $$4, true, true, $$0, $$1, $$2);
    }

    public static void a(flp $$0, float $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6) {
        hur.a($$0, $$4, $$5, $$6);
        is $$7 = $$0.l();
        if (hur.a($$7, $$4, $$5, $$6) <= 80.0f) {
            um.a(new fth((float)$$7.u() + 0.25f, (float)$$7.v() + 0.25f, (double)$$7.w() + 0.25, (float)$$7.u() + 0.75f, (float)$$7.v() + 0.75f, (float)$$7.w() + 0.75f), ul.b(bel.a(0.5f, 0.0f, 1.0f, 0.0f)));
            for (int $$8 = 0; $$8 < $$0.e(); ++$$8) {
                fln $$9 = $$0.a($$8);
                if (!(hur.a($$9.a(), $$4, $$5, $$6) <= 80.0f)) continue;
                float $$10 = $$8 == $$0.f() ? 1.0f : 0.0f;
                float $$11 = $$8 == $$0.f() ? 0.0f : 1.0f;
                fth $$12 = new fth((float)$$9.a + 0.5f - $$1, (float)$$9.b + 0.01f * (float)$$8, (float)$$9.c + 0.5f - $$1, (float)$$9.a + 0.5f + $$1, (float)$$9.b + 0.25f + 0.01f * (float)$$8, (float)$$9.c + 0.5f + $$1);
                um.a($$12, ul.b(bel.a(0.5f, $$10, 0.0f, $$11)));
            }
        }
        flp.a $$13 = $$0.k();
        if ($$2 && $$13 != null) {
            for (fln $$14 : $$13.b()) {
                if (!(hur.a($$14.a(), $$4, $$5, $$6) <= 80.0f)) continue;
                um.a(new fth((float)$$14.a + 0.5f - $$1 / 2.0f, (float)$$14.b + 0.01f, (float)$$14.c + 0.5f - $$1 / 2.0f, (float)$$14.a + 0.5f + $$1 / 2.0f, (double)$$14.b + 0.1, (float)$$14.c + 0.5f + $$1 / 2.0f), ul.b(bel.a(0.5f, 1.0f, 0.8f, 0.8f)));
            }
            for (fln $$15 : $$13.a()) {
                if (!(hur.a($$15.a(), $$4, $$5, $$6) <= 80.0f)) continue;
                um.a(new fth((float)$$15.a + 0.5f - $$1 / 2.0f, (float)$$15.b + 0.01f, (float)$$15.c + 0.5f - $$1 / 2.0f, (float)$$15.a + 0.5f + $$1 / 2.0f, (double)$$15.b + 0.1, (float)$$15.c + 0.5f + $$1 / 2.0f), ul.b(bel.a(0.5f, 0.8f, 1.0f, 1.0f)));
            }
        }
        if ($$3) {
            for (int $$16 = 0; $$16 < $$0.e(); ++$$16) {
                fln $$17 = $$0.a($$16);
                if (!(hur.a($$17.a(), $$4, $$5, $$6) <= 80.0f)) continue;
                um.a(String.valueOf((Object)$$17.l), new ftm((double)$$17.a + 0.5, (double)$$17.b + 0.75, (double)$$17.c + 0.5), ur.a.a().a(0.32f)).a();
                um.a(String.format(Locale.ROOT, "%.2f", Float.valueOf($$17.k)), new ftm((double)$$17.a + 0.5, (double)$$17.b + 0.25, (double)$$17.c + 0.5), ur.a.a().a(0.32f)).a();
            }
        }
    }

    public static void a(flp $$0, double $$1, double $$2, double $$3) {
        if ($$0.e() < 2) {
            return;
        }
        ftm $$4 = $$0.a(0).b();
        for (int $$5 = 1; $$5 < $$0.e(); ++$$5) {
            fln $$6 = $$0.a($$5);
            if (hur.a($$6.a(), $$1, $$2, $$3) > 80.0f) {
                $$4 = $$6.b();
                continue;
            }
            float $$7 = (float)$$5 / (float)$$0.e() * 0.33f;
            int $$8 = bel.g(bgj.g($$7, 0.9f, 0.9f));
            um.b($$4.b(0.5, 0.5, 0.5), $$6.b().b(0.5, 0.5, 0.5), $$8);
            $$4 = $$6.b();
        }
    }

    private static float a(is $$0, double $$1, double $$2, double $$3) {
        return (float)(Math.abs((double)$$0.u() - $$1) + Math.abs((double)$$0.v() - $$2) + Math.abs((double)$$0.w() - $$3));
    }

    private static /* synthetic */ void a(bxg $$0, double $$1, double $$2, double $$3, cgk $$4) {
        bxb $$5 = $$0.a(bxf.f, $$4);
        if ($$5 != null) {
            hur.a($$1, $$2, $$3, $$5.a(), $$5.b());
        }
    }
}

