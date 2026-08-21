/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class de<T extends a>
implements am<T> {
    private final Map<anb, Set<am.a<T>>> a = Maps.newIdentityHashMap();

    @Override
    public final void a(anb $$02, am.a<T> $$1) {
        this.a.computeIfAbsent($$02, $$0 -> Sets.newHashSet()).add($$1);
    }

    @Override
    public final void b(anb $$0, am.a<T> $$1) {
        Set<am.a<T>> $$2 = this.a.get($$0);
        if ($$2 != null) {
            $$2.remove($$1);
            if ($$2.isEmpty()) {
                this.a.remove($$0);
            }
        }
    }

    @Override
    public final void a(anb $$0) {
        this.a.remove($$0);
    }

    protected void a(axg $$0, Predicate<T> $$1) {
        anb $$2 = $$0.U();
        Set<am.a<T>> $$3 = this.a.get($$2);
        if ($$3 == null || $$3.isEmpty()) {
            return;
        }
        fnz $$4 = bs.b($$0, $$0);
        List $$5 = null;
        for (am.a<T> $$6 : $$3) {
            Optional<bc> $$8;
            a $$7 = (a)$$6.a();
            if (!$$1.test($$7) || !($$8 = $$7.a()).isEmpty() && !$$8.get().a($$4)) continue;
            if ($$5 == null) {
                $$5 = Lists.newArrayList();
            }
            $$5.add($$6);
        }
        if ($$5 != null) {
            for (am.a<Object> $$9 : $$5) {
                $$9.a($$2);
            }
        }
    }

    public static interface a
    extends an {
        @Override
        default public void a(bd $$0) {
            $$0.a(this.a(), "player");
        }

        public Optional<bc> a();
    }
}

