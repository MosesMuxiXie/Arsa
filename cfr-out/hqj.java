/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class hqj
implements ioi {
    public static final amo a = amo.b("builtin/generated");
    public static final List<String> b = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
    private static final float d = 7.5f;
    private static final float e = 8.5f;
    private static final hqp.a f = new hqp.a.a().a("particle", "layer0").a();
    private static final hqc.b g = new hqc.b(0.0f, 0.0f, 16.0f, 16.0f);
    private static final hqc.b h = new hqc.b(16.0f, 0.0f, 0.0f, 16.0f);
    private static final float i = 0.1f;

    @Override
    public hqp.a e() {
        return f;
    }

    @Override
    public ioh a() {
        return hqj::a;
    }

    @Override
    public @Nullable ioi.a b() {
        return ioi.a.a;
    }

    private static iod a(hqp $$0, inw $$1, ioc $$2, iny $$3) {
        String $$6;
        ins $$7;
        ArrayList<hqb> $$4 = new ArrayList<hqb>();
        for (int $$5 = 0; $$5 < b.size() && ($$7 = $$0.a($$6 = b.get($$5))) != null; ++$$5) {
            ilk $$8 = $$1.b().a($$7, $$3).e();
            $$4.addAll(hqj.a($$5, $$6, $$8));
        }
        return hqn.a($$4, $$0, $$1, $$2, $$3);
    }

    private static List<hqb> a(int $$0, String $$1, ilk $$2) {
        Map<iz, hqc> $$3 = Map.of(iz.d, new hqc(null, $$0, $$1, g, g.a), iz.c, new hqc(null, $$0, $$1, h, g.a));
        ArrayList<hqb> $$4 = new ArrayList<hqb>();
        $$4.add(new hqb((Vector3fc)new Vector3f(0.0f, 0.0f, 7.5f), (Vector3fc)new Vector3f(16.0f, 16.0f, 8.5f), $$3));
        $$4.addAll(hqj.a($$2, $$1, $$0));
        return $$4;
    }

    private static List<hqb> a(ilk $$0, String $$1, int $$2) {
        float $$3 = 16.0f / (float)$$0.b();
        float $$4 = 16.0f / (float)$$0.c();
        ArrayList<hqb> $$5 = new ArrayList<hqb>();
        for (b $$6 : hqj.a($$0)) {
            float $$15;
            float $$14;
            float $$7 = $$6.b();
            float $$8 = $$6.c();
            a $$9 = $$6.a();
            float $$10 = $$7 + 0.1f;
            float $$11 = $$7 + 1.0f - 0.1f;
            if ($$9.b()) {
                float $$12 = $$8 + 0.1f;
                float $$13 = $$8 + 1.0f - 0.1f;
            } else {
                $$14 = $$8 + 1.0f - 0.1f;
                $$15 = $$8 + 0.1f;
            }
            float $$16 = $$7;
            float $$17 = $$8;
            float $$18 = $$7;
            float $$19 = $$8;
            switch ($$9.ordinal()) {
                case 0: {
                    $$18 += 1.0f;
                    break;
                }
                case 1: {
                    $$18 += 1.0f;
                    $$17 += 1.0f;
                    $$19 += 1.0f;
                    break;
                }
                case 2: {
                    $$19 += 1.0f;
                    break;
                }
                case 3: {
                    $$16 += 1.0f;
                    $$18 += 1.0f;
                    $$19 += 1.0f;
                }
            }
            $$16 *= $$3;
            $$18 *= $$3;
            $$17 *= $$4;
            $$19 *= $$4;
            $$17 = 16.0f - $$17;
            $$19 = 16.0f - $$19;
            Map<iz, hqc> $$20 = Map.of($$9.a(), new hqc(null, $$2, $$1, new hqc.b($$10 * $$3, $$14 * $$3, $$11 * $$4, $$15 * $$4), g.a));
            switch ($$9.ordinal()) {
                case 0: {
                    $$5.add(new hqb((Vector3fc)new Vector3f($$16, $$17, 7.5f), (Vector3fc)new Vector3f($$18, $$17, 8.5f), $$20));
                    break;
                }
                case 1: {
                    $$5.add(new hqb((Vector3fc)new Vector3f($$16, $$19, 7.5f), (Vector3fc)new Vector3f($$18, $$19, 8.5f), $$20));
                    break;
                }
                case 2: {
                    $$5.add(new hqb((Vector3fc)new Vector3f($$16, $$17, 7.5f), (Vector3fc)new Vector3f($$16, $$19, 8.5f), $$20));
                    break;
                }
                case 3: {
                    $$5.add(new hqb((Vector3fc)new Vector3f($$18, $$17, 7.5f), (Vector3fc)new Vector3f($$18, $$19, 8.5f), $$20));
                }
            }
        }
        return $$5;
    }

    private static Collection<b> a(ilk $$0) {
        int $$1 = $$0.b();
        int $$2 = $$0.c();
        HashSet<b> $$3 = new HashSet<b>();
        $$0.e().forEach($$4 -> {
            for (int $$5 = 0; $$5 < $$2; ++$$5) {
                for (int $$6 = 0; $$6 < $$1; ++$$6) {
                    boolean $$7;
                    boolean bl2 = $$7 = !hqj.a($$0, $$4, $$6, $$5, $$1, $$2);
                    if (!$$7) continue;
                    hqj.a(hqj$a.a, $$3, $$0, $$4, $$6, $$5, $$1, $$2);
                    hqj.a(hqj$a.b, $$3, $$0, $$4, $$6, $$5, $$1, $$2);
                    hqj.a(hqj$a.c, $$3, $$0, $$4, $$6, $$5, $$1, $$2);
                    hqj.a(hqj$a.d, $$3, $$0, $$4, $$6, $$5, $$1, $$2);
                }
            }
        });
        return $$3;
    }

    private static void a(a $$0, Set<b> $$1, ilk $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        if (hqj.a($$2, $$3, $$4 - $$0.e.j(), $$5 - $$0.e.k(), $$6, $$7)) {
            $$1.add(new b($$0, $$4, $$5));
        }
    }

    private static boolean a(ilk $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if ($$2 < 0 || $$3 < 0 || $$2 >= $$4 || $$3 >= $$5) {
            return true;
        }
        return $$0.a($$1, $$2, $$3);
    }

    record b(a a, int b, int c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "facing;x;y", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "facing;x;y", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "facing;x;y", "a", "b", "c"}, this, $$0);
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(iz.b);
        public static final /* enum */ a b = new a(iz.a);
        public static final /* enum */ a c = new a(iz.f);
        public static final /* enum */ a d = new a(iz.e);
        final iz e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(iz $$0) {
            this.e = $$0;
        }

        public iz a() {
            return this.e;
        }

        boolean b() {
            return this == b || this == a;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d};
        }

        static {
            f = hqj$a.c();
        }
    }
}

