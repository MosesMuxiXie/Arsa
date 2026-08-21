/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.OptionalBox;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class ckc {
    private static final int a = 20;
    private static final double b = 3.0;
    private static final double c = 2.0;

    public static cje<chl> a() {
        MutableObject $$0 = new MutableObject();
        MutableInt $$1 = new MutableInt(0);
        return cmv.a((cmv.b<E> $$2) -> $$2.group($$2.b(cqw.u), $$2.a(cqw.w), $$2.a(cqw.g)).apply((Applicative)$$2, ($$3, $$4, $$5) -> ($$62, $$7, $$8) -> {
            ebz $$18;
            is $$16;
            eoh $$17;
            flp $$9 = (flp)$$2.b($$3);
            Optional<Set<jc>> $$10 = $$2.a($$4);
            if ($$9.b() || $$9.c()) {
                return false;
            }
            if (Objects.equals($$0.get(), $$9.h())) {
                $$1.setValue(20);
            } else if ($$1.decrementAndGet() > 0) {
                return false;
            }
            $$0.setValue((Object)$$9.h());
            fln $$11 = $$9.i();
            fln $$12 = $$9.h();
            is $$13 = $$11.a();
            eoh $$14 = $$62.a_($$13);
            if ($$14.a(bdp.as, $$0 -> $$0.b() instanceof ebz)) {
                ebz $$15 = (ebz)$$14.b();
                if (!$$15.n($$14)) {
                    $$15.a($$7, (dwo)$$62, $$14, $$13, true);
                }
                $$10 = ckc.a($$4, $$10, $$62, $$13);
            }
            if (($$17 = $$62.a_($$16 = $$12.a())).a(bdp.as, $$0 -> $$0.b() instanceof ebz) && !($$18 = (ebz)$$17.b()).n($$17)) {
                $$18.a($$7, (dwo)$$62, $$17, $$16, true);
                $$10 = ckc.a($$4, $$10, $$62, $$16);
            }
            $$10.ifPresent($$6 -> ckc.a($$62, $$7, $$11, $$12, $$6, $$2.a($$5)));
            return true;
        }));
    }

    public static void a(axf $$02, chl $$1, @Nullable fln $$2, @Nullable fln $$3, Set<jc> $$4, Optional<List<chl>> $$5) {
        Iterator<jc> $$6 = $$4.iterator();
        while ($$6.hasNext()) {
            jc $$7 = $$6.next();
            is $$8 = $$7.b();
            if ($$2 != null && $$2.a().equals($$8) || $$3 != null && $$3.a().equals($$8)) continue;
            if (ckc.a($$02, $$1, $$7)) {
                $$6.remove();
                continue;
            }
            eoh $$9 = $$02.a_($$8);
            if (!$$9.a(bdp.as, $$0 -> $$0.b() instanceof ebz)) {
                $$6.remove();
                continue;
            }
            ebz $$10 = (ebz)$$9.b();
            if (!$$10.n($$9)) {
                $$6.remove();
                continue;
            }
            if (ckc.a($$1, $$8, $$5)) {
                $$6.remove();
                continue;
            }
            $$10.a($$1, (dwo)$$02, $$9, $$8, false);
            $$6.remove();
        }
    }

    private static boolean a(chl $$0, is $$12, Optional<List<chl>> $$2) {
        if ($$2.isEmpty()) {
            return false;
        }
        return $$2.get().stream().filter($$1 -> $$1.ay() == $$0.ay()).filter($$1 -> $$12.a($$1.dI(), 2.0)).anyMatch($$1 -> ckc.a($$1.ev(), $$12));
    }

    private static boolean a(cim<?> $$0, is $$1) {
        if (!$$0.a(cqw.u)) {
            return false;
        }
        flp $$2 = $$0.c(cqw.u).get();
        if ($$2.c()) {
            return false;
        }
        fln $$3 = $$2.i();
        if ($$3 == null) {
            return false;
        }
        fln $$4 = $$2.h();
        return $$1.equals($$3.a()) || $$1.equals($$4.a());
    }

    private static boolean a(axf $$0, chl $$1, jc $$2) {
        return $$2.a() != $$0.aq() || !$$2.b().a($$1.dI(), 3.0);
    }

    private static Optional<Set<jc>> a(cmw<OptionalBox.Mu, Set<jc>> $$0, Optional<Set<jc>> $$12, axf $$2, is $$3) {
        jc $$4 = jc.a($$2.aq(), $$3);
        return Optional.of($$12.map($$1 -> {
            $$1.add($$4);
            return $$1;
        }).orElseGet(() -> {
            HashSet $$2 = Sets.newHashSet((Object[])new jc[]{$$4});
            $$0.a($$2);
            return $$2;
        }));
    }
}

