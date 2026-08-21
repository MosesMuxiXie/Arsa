/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class clb<E extends chl>
extends cjs<E> {
    public clb(List<Pair<? extends cje<? super E>, Integer>> $$0) {
        this((Map<cqw<?>, cqx>)ImmutableMap.of(), (List<Pair<cje<E>, Integer>>)$$0);
    }

    public clb(Map<cqw<?>, cqx> $$0, List<Pair<? extends cje<? super E>, Integer>> $$1) {
        super($$0, (Set<cqw<?>>)ImmutableSet.of(), cjs.a.b, cjs.b.a, $$1);
    }
}

