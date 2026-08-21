/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class igr
extends igu {
    private static final int a = 8;
    private static final float b = -160.0f;
    private static final float c = -256.0f;
    private float d;

    @Override
    public int a(hif $$0, ger $$1, int $$2, float $$3) {
        int $$4 = $$1.k().a(ceg.a, $$3);
        if ($$2 >= 4) {
            int $$10;
            float $$11;
            float $$5 = $$1.k().a(ceg.m, $$3).floatValue() * ((float)Math.PI / 180);
            float $$6 = bgj.a((double)$$5) > 0.0f ? -1.0f : 1.0f;
            hos $$7 = gfj.V().i.e();
            Vector3fc $$8 = $$7 != null ? $$7.a() : $$1.n();
            float $$9 = $$8.dot($$6, 0.0f, 0.0f);
            if ($$9 > 0.0f && ($$11 = bel.m($$10 = $$1.k().a(ceg.j, $$3).intValue())) > 0.0f) {
                $$4 = bel.a($$9 * $$11, $$4, bel.g($$10));
            }
        }
        int $$12 = $$1.k().a(ceg.i, $$3);
        $$12 = igr.a($$12, $$0.c($$3), $$0.a($$3));
        float $$13 = Math.min($$1.k().a(ceg.d, $$3).floatValue() / 16.0f, (float)$$2);
        float $$14 = bgj.b($$13 / 32.0f, 0.25f, 1.0f);
        $$14 = 1.0f - (float)Math.pow($$14, 0.25);
        $$4 = bel.a($$14, $$4, $$12);
        return $$4;
    }

    private static int a(int $$0, float $$1, float $$2) {
        if ($$1 > 0.0f) {
            float $$3 = 1.0f - $$1 * 0.5f;
            float $$4 = 1.0f - $$1 * 0.4f;
            $$0 = bel.a($$0, $$3, $$3, $$4);
        }
        if ($$2 > 0.0f) {
            $$0 = bel.b($$0, 1.0f - $$2 * 0.5f);
        }
        return $$0;
    }

    @Override
    public void a(igp $$0, ger $$1, hif $$2, float $$3, gez $$4) {
        this.a($$1, $$2, $$4);
        float $$5 = $$4.a(false);
        $$0.a = $$1.k().a(ceg.b, $$5).floatValue();
        $$0.c = $$1.k().a(ceg.c, $$5).floatValue();
        $$0.a += -160.0f * this.d;
        float $$6 = Math.min(96.0f, $$0.c);
        $$0.c = Math.max($$6, $$0.c + -256.0f * this.d);
        $$0.e = Math.min($$3, $$1.k().a(ceg.d, $$5).floatValue());
        $$0.f = Math.min((float)(gfj.V().k.l().b() * 16), $$1.k().a(ceg.e, $$5).floatValue());
        if (gfj.V().j.k().d()) {
            $$0.a = Math.min($$0.a, 10.0f);
            $$0.e = $$0.c = Math.min($$0.c, 96.0f);
            $$0.f = $$0.c;
        }
    }

    private void a(ger $$0, hif $$1, gez $$2) {
        is $$3 = $$0.d();
        dxo $$4 = $$1.z($$3).a();
        float $$5 = $$2.a();
        float $$6 = $$2.a(false);
        boolean $$7 = $$4.b();
        float $$8 = bgj.a(((float)$$1.C_().a(dww.a).b($$3) - 8.0f) / 7.0f, 0.0f, 1.0f);
        float $$9 = $$1.c($$6) * $$8 * ($$7 ? 1.0f : 0.5f);
        this.d += ($$9 - this.d) * $$5 * 0.2f;
    }

    @Override
    public boolean a(@Nullable fld $$0, cgk $$1) {
        return $$0 == fld.d;
    }
}

