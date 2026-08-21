/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Set;

public class cek {
    public static final cec a = cec.a().a(ceg.i, cen.j, new cen.b(0.6f, 0.75f)).a(ceg.a, cen.h, bel.a(1.0f, 0.5f, 0.5f, 0.6f)).a(ceg.k, cen.j, new cen.b(0.24f, 0.5f)).a(ceg.z, ceo.e, new cep(4.0f, 0.3125f)).a(ceg.r, cen.e, bel.a(0.3125f, fvo.g)).a(ceg.s, ceo.e, new cep(0.24f, 0.3125f)).a(ceg.q, Float.valueOf(0.0f)).a(ceg.j, cen.i, bel.a(1.0f, 0.5f, 0.5f, 0.6f)).a(ceg.O, true).a();
    public static final cec b = cec.a().a(ceg.i, cen.j, new cen.b(0.24f, 0.94f)).a(ceg.a, cen.h, bel.a(1.0f, 0.25f, 0.25f, 0.3f)).a(ceg.k, cen.j, new cen.b(0.095f, 0.94f)).a(ceg.z, ceo.e, new cep(4.0f, 0.52734375f)).a(ceg.r, cen.e, bel.a(0.52734375f, fvo.g)).a(ceg.s, ceo.e, new cep(0.24f, 0.52734375f)).a(ceg.q, Float.valueOf(0.0f)).a(ceg.j, cen.i, bel.a(1.0f, 0.25f, 0.25f, 0.3f)).a(ceg.O, true).a();
    private static final Set<cea<?>> c = Sets.union(a.b(), b.b());

    public static void a(cef.a $$0, a $$1) {
        for (cea<?> $$2 : c) {
            cek.a($$0, $$1, $$2);
        }
    }

    private static <Value> void a(cef.a $$0, a $$1, cea<Value> $$2) {
        cec.b $$3 = a.a($$2);
        cec.b $$42 = b.a($$2);
        $$0.a($$2, ($$4, $$5) -> {
            float $$6 = $$1.b();
            float $$7 = $$1.a() - $$6;
            if ($$3 != null && $$7 > 0.0f) {
                Object $$8 = $$3.a($$4);
                $$4 = $$2.a().e().apply($$7, $$4, $$8);
            }
            if ($$42 != null && $$6 > 0.0f) {
                Object $$9 = $$42.a($$4);
                $$4 = $$2.a().e().apply($$6, $$4, $$9);
            }
            return $$4;
        });
    }

    public static interface a {
        public static a a(final dwo $$0) {
            return new a(){

                @Override
                public float a() {
                    return $$0.c(1.0f);
                }

                @Override
                public float b() {
                    return $$0.a(1.0f);
                }
            };
        }

        public float a();

        public float b();
    }
}

