/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.UUID;

public class clx {
    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.am)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
            Optional.ofNullable($$2.d((UUID)$$0.b($$1))).map($$0 -> {
                chl $$1;
                return $$0 instanceof chl ? ($$1 = (chl)$$0) : null;
            }).filter(chl::fa).filter($$1 -> $$1.ay() != cgu.cb || $$2.U().a(eua.o) != false).ifPresent($$1 -> $$1.b());
            return true;
        }));
    }
}

