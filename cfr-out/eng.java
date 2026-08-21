/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface eng {
    public static final eng a = ($$0, $$1, $$22, $$32, $$4) -> $$1.a($$0, $$2 -> $$2.dK().a($$22, $$32) && !$$2.ha() && !$$2.au()).stream().filter($$3 -> !$$4 || eng.a($$0, $$22.b(), $$3.bV())).map(cgk::cY).toList();
    public static final eng b = ($$0, $$1, $$22, $$32, $$4) -> $$1.a($$0, $$2 -> $$2.dK().a($$22, $$32) && !$$2.au()).stream().filter($$3 -> !$$4 || eng.a($$0, $$22.b(), $$3.bV())).map(cgk::cY).toList();
    public static final eng c = ($$0, $$1, $$2, $$32, $$4) -> {
        fth $$5 = new fth($$2).g($$32);
        return $$1.a($$0, cgu.bj, $$5, chl::cb).stream().filter($$3 -> !$$4 || eng.a($$0, $$2.b(), $$3.bV())).map(cgk::cY).toList();
    };

    public List<UUID> detect(axf var1, a var2, is var3, double var4, boolean var6);

    private static boolean a(dwo $$0, ftm $$1, ftm $$2) {
        fti $$3 = $$0.a(new dvw($$2, $$1, dvw.a.c, dvw.b.a, ftr.a()));
        return $$3.b().equals(is.a($$1)) || $$3.d() == ftk.a.a;
    }

    public static interface a {
        public static final a a = new a(){

            public List<axg> a(axf $$0, Predicate<? super ddm> $$1) {
                return $$0.a($$1);
            }

            @Override
            public <T extends cgk> List<T> a(axf $$0, esw<cgk, T> $$1, fth $$2, Predicate<? super T> $$3) {
                return $$0.a($$1, $$2, $$3);
            }
        };

        public List<? extends ddm> a(axf var1, Predicate<? super ddm> var2);

        public <T extends cgk> List<T> a(axf var1, esw<cgk, T> var2, fth var3, Predicate<? super T> var4);

        public static a a(ddm $$0) {
            return eng$a.a(List.of($$0));
        }

        public static a a(final List<ddm> $$0) {
            return new a(){

                public List<ddm> a(axf $$02, Predicate<? super ddm> $$1) {
                    return $$0.stream().filter($$1).toList();
                }

                @Override
                public <T extends cgk> List<T> a(axf $$02, esw<cgk, T> $$1, fth $$2, Predicate<? super T> $$3) {
                    return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
                }
            };
        }
    }
}

