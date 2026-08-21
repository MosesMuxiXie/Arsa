/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

@Deprecated
public class cle {
    public static cje<chl> a(float $$02, ccn $$1) {
        return cle.a($$02, $$1, (chl $$0) -> true);
    }

    public static cje<chl> a(cgu<?> $$0, float $$12, ccn $$2) {
        return cle.a($$12, $$2, (chl $$1) -> $$0.equals($$1.ay()));
    }

    private static cje<chl> a(float $$0, ccn $$1, Predicate<chl> $$2) {
        float $$32 = $$0 * $$0;
        a $$4 = new a($$1);
        return cmv.a((cmv.b<E> $$3) -> $$3.group($$3.c(cqw.o), $$3.b(cqw.h)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            Optional<chl> $$9 = ((cqy)$$3.b($$5)).a($$2.and($$2 -> $$2.g($$7) <= (double)$$32));
            if ($$9.isEmpty()) {
                return false;
            }
            if (!$$4.a($$6.y)) {
                return false;
            }
            $$4.a(new cjp($$9.get(), true));
            return true;
        }));
    }

    public static final class a {
        private final ccn a;
        private int b;

        public a(ccn $$0) {
            if ($$0.a() <= 1) {
                throw new IllegalArgumentException();
            }
            this.a = $$0;
        }

        public boolean a(bgr $$0) {
            if (this.b == 0) {
                this.b = this.a.a($$0) - 1;
                return false;
            }
            return --this.b == 0;
        }
    }
}

