/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class ciz {
    public static cje<dcx> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.d), $$0.a(cqw.c)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
            jc $$6 = (jc)$$0.b($$1);
            if (!$$6.b().a($$4.dI(), 2.0) && !$$4.gU()) {
                return false;
            }
            $$1.b();
            $$2.a($$6);
            $$3.a((cgk)$$4, (byte)14);
            if (!$$4.gZ().b().a(dda.b)) {
                return true;
            }
            MinecraftServer $$7 = $$3.s();
            Optional.ofNullable($$7.a($$6.a())).flatMap($$1 -> $$1.F().c($$6.b())).flatMap($$0 -> mi.y.c().filter($$1 -> ((dda)$$1.a()).b().test((jd<cta>)$$0)).findFirst()).ifPresent($$2 -> {
                $$4.a($$4.gZ().b((jd<dda>)$$2));
                $$4.i($$3);
            });
            return true;
        }));
    }
}

