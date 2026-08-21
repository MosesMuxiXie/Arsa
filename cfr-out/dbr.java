/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class dbr<E extends dbj> {
    public static cje<chl> a(int $$0) {
        return cmv.a($$1 -> $$1.group($$1.b(cqw.ao), $$1.a(cqw.M)).apply((Applicative)$$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
            if (!$$5.fy().f()) {
                return false;
            }
            Optional $$7 = $$1.a($$3);
            if ($$7.isPresent() && ((czl)$$7.get()).a((cgk)$$5, (double)$$0)) {
                return false;
            }
            $$2.b();
            return true;
        }));
    }
}

