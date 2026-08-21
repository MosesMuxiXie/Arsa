/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Collections;
import java.util.List;

public class cka {
    public static cje<cht> a(float $$0) {
        return cmv.a($$12 -> $$12.group($$12.c(cqw.n)).apply((Applicative)$$12, $$1 -> ($$22, $$3, $$4) -> {
            if ($$22.k($$3.dK())) {
                return false;
            }
            is $$5 = $$3.dK();
            List $$6 = is.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(is::j).collect(bhs.b());
            Collections.shuffle($$6);
            $$6.stream().filter($$1 -> !$$22.k((is)$$1)).filter($$2 -> $$22.a((is)$$2, (cgk)$$3)).filter($$2 -> $$22.g($$3)).findFirst().ifPresent($$2 -> $$1.a(new cqz((is)$$2, $$0, 0)));
            return true;
        }));
    }
}

