/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import java.util.Map;
import org.joml.Vector3f;

public class hum
implements hug.a {
    private final gfj a;
    private static final int b = 2;
    private static final float c = 0.09375f;

    public hum(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        hif $$6 = this.a.r;
        is $$7 = is.a($$0, 0.0, $$2);
        for (int $$8 = -2; $$8 <= 2; ++$$8) {
            for (int $$9 = -2; $$9 <= 2; ++$$9) {
                eqf $$10 = $$6.E($$7.b($$8 * 16, 0, $$9 * 16));
                for (Map.Entry<euq.a, euq> $$11 : $$10.e()) {
                    euq.a $$12 = $$11.getKey();
                    dvu $$13 = $$10.f();
                    Vector3f $$14 = this.a($$12);
                    for (int $$15 = 0; $$15 < 16; ++$$15) {
                        for (int $$16 = 0; $$16 < 16; ++$$16) {
                            int $$17 = jw.a($$13.h, $$15);
                            int $$18 = jw.a($$13.i, $$16);
                            float $$19 = (float)$$6.a($$12, $$17, $$18) + (float)$$12.ordinal() * 0.09375f;
                            um.a(new fth((float)$$17 + 0.25f, $$19, (float)$$18 + 0.25f, (float)$$17 + 0.75f, $$19 + 0.09375f, (float)$$18 + 0.75f), ul.b(bel.a(1.0f, $$14.x(), $$14.y(), $$14.z())));
                        }
                    }
                }
            }
        }
    }

    private Vector3f a(euq.a $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case euq.a.a -> new Vector3f(1.0f, 1.0f, 0.0f);
            case euq.a.c -> new Vector3f(1.0f, 0.0f, 1.0f);
            case euq.a.b -> new Vector3f(0.0f, 0.7f, 0.0f);
            case euq.a.d -> new Vector3f(0.0f, 0.0f, 0.5f);
            case euq.a.e -> new Vector3f(0.0f, 0.3f, 0.3f);
            case euq.a.f -> new Vector3f(0.0f, 0.5f, 0.5f);
        };
    }
}

