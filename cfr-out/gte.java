/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gte {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<MapCodec<? extends atg>, gtd<?>> b = new HashMap();

    private static <T extends atg> void a(MapCodec<T> $$0, gtd<? super T> $$1) {
        b.put($$0, $$1);
    }

    private static <T extends atg> @Nullable gtd<T> a(T $$0) {
        return b.get($$0.a());
    }

    public static <T extends atg> void a(T $$0, gsb $$1, gtd.a $$2) {
        gtd<T> $$3 = gte.a($$0);
        if ($$3 == null) {
            a.warn("Unrecognized input control {}", $$0);
            return;
        }
        $$3.addControl($$0, $$1, $$2);
    }

    public static void a() {
        gte.a(atk.a, new d());
        gte.a(atj.a, new c());
        gte.a(atf.a, new a());
        gte.a(ati.a, new b());
    }

    static class d
    implements gtd<atk> {
        d() {
        }

        public void a(atk $$0, gsb $$1, gtd.a $$2) {
            Supplier<String> $$11;
            gjn $$10;
            gio $$3 = $$1.C();
            if ($$0.g().isPresent()) {
                atk.a $$4 = $$0.g().get();
                int $$5 = $$4.b().orElseGet(() -> {
                    int $$2 = $$4.a().orElse(4);
                    return Math.min($$1.b * $$2 + 8, 512);
                });
                gjx $$6 = gjx.v().a($$3, $$0.b(), $$5, yg.a);
                $$6.a($$0.f());
                $$4.a().ifPresent($$6::b);
                $$6.a($$0.e());
                gjx $$7 = $$6;
                Supplier<String> $$8 = $$6::u;
            } else {
                gjn $$9 = new gjn($$3, $$0.b(), 20, $$0.c());
                $$9.k($$0.f());
                $$9.a($$0.e());
                $$10 = $$9;
                $$11 = $$9::a;
            }
            gjn $$12 = $$0.d() ? goq.a($$3, $$10, $$0.c()) : $$10;
            $$2.accept($$12, new ast.a(){

                @Override
                public String a() {
                    return vx.c((String)$$11.get());
                }

                @Override
                public vz b() {
                    return vx.a((String)$$11.get());
                }
            });
        }

        @Override
        public /* synthetic */ void addControl(atg atg2, gsb gsb2, gtd.a a2) {
            this.a((atk)atg2, gsb2, a2);
        }
    }

    static class c
    implements gtd<atj> {
        c() {
        }

        public void a(atj $$0, gsb $$1, gtd.a $$2) {
            atj.a $$3 = $$0.b().orElse($$0.d().getFirst());
            gjl.a<atj.a> $$4 = gjl.a(atj.a::a, $$3).a((Collection<atj.a>)$$0.d()).a(!$$0.f() ? gjl.b.b : gjl.b.a);
            gjl<atj.a> $$5 = $$4.a(0, 0, $$0.c(), 20, $$0.e());
            $$2.accept($$5, ast.a.a(() -> ((atj.a)$$5.a()).b()));
        }

        @Override
        public /* synthetic */ void addControl(atg atg2, gsb gsb2, gtd.a a2) {
            this.a((atj)atg2, gsb2, a2);
        }
    }

    static class a
    implements gtd<atf> {
        a() {
        }

        public void a(final atf $$0, gsb $$1, gtd.a $$2) {
            gio $$3 = $$1.C();
            final gjg $$4 = gjg.a($$0.b(), $$3).a($$0.c()).a();
            $$2.accept($$4, new ast.a(){

                @Override
                public String a() {
                    return $$4.a() ? $$0.d() : $$0.e();
                }

                @Override
                public vz b() {
                    return ux.a($$4.a());
                }
            });
        }

        @Override
        public /* synthetic */ void addControl(atg atg2, gsb gsb2, gtd.a a2) {
            this.a((atf)atg2, gsb2, a2);
        }
    }

    static class b
    implements gtd<ati> {
        b() {
        }

        public void a(ati $$0, gsb $$1, gtd.a $$2) {
            float $$3 = $$0.e().a();
            final a $$4 = new a($$0, $$3);
            $$2.accept($$4, new ast.a(){

                @Override
                public String a() {
                    return $$4.d();
                }

                @Override
                public vz b() {
                    return vc.a($$4.e());
                }
            });
        }

        @Override
        public /* synthetic */ void addControl(atg atg2, gsb gsb2, gtd.a a2) {
            this.a((ati)atg2, gsb2, a2);
        }

        static class a
        extends giz {
            private final ati a;

            a(ati $$0, double $$1) {
                super(0, 0, $$0.b(), 20, gte$b$a.c($$0, $$1), $$1);
                this.a = $$0;
            }

            @Override
            protected void c() {
                this.a_(gte$b$a.c(this.a, this.e));
            }

            @Override
            protected void a() {
            }

            public String d() {
                return gte$b$a.b(this.a, this.e);
            }

            public float e() {
                return gte$b$a.a(this.a, this.e);
            }

            private static float a(ati $$0, double $$1) {
                return $$0.e().a((float)$$1);
            }

            private static String b(ati $$0, double $$1) {
                return gte$b$a.b(gte$b$a.a($$0, $$1));
            }

            private static yh c(ati $$0, double $$1) {
                return $$0.a(gte$b$a.b($$0, $$1));
            }

            private static String b(float $$0) {
                int $$1 = (int)$$0;
                if ((float)$$1 == $$0) {
                    return Integer.toString($$1);
                }
                return Float.toString($$0);
            }
        }
    }
}

