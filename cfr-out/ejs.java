/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.common.collect.ImmutableList
 *  org.apache.commons.lang3.function.TriFunction
 */
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.function.TriFunction;

public record ejs(dzq a, dzq b, dzq c, dzq d, dzq e, dzq f, dzq g, dzq h) {
    private final dzq a;
    private final dzq b;
    private final dzq c;
    private final dzq d;
    private final dzq e;
    private final dzq f;
    private final dzq g;
    private final dzq h;

    public static <WaxedBlock extends dzq, WeatheringBlock extends dzq> ejs a(String $$0, TriFunction<String, Function<eog.d, dzq>, eog.d, dzq> $$12, Function<eog.d, WaxedBlock> $$2, BiFunction<ejq.a, eog.d, WeatheringBlock> $$3, Function<ejq.a, eog.d> $$4) {
        return new ejs((dzq)$$12.apply((Object)$$0, $$1 -> (dzq)$$3.apply(ejq.a.a, (eog.d)$$1), (Object)$$4.apply(ejq.a.a)), (dzq)$$12.apply((Object)("exposed_" + $$0), $$1 -> (dzq)$$3.apply(ejq.a.b, (eog.d)$$1), (Object)$$4.apply(ejq.a.b)), (dzq)$$12.apply((Object)("weathered_" + $$0), $$1 -> (dzq)$$3.apply(ejq.a.c, (eog.d)$$1), (Object)$$4.apply(ejq.a.c)), (dzq)$$12.apply((Object)("oxidized_" + $$0), $$1 -> (dzq)$$3.apply(ejq.a.d, (eog.d)$$1), (Object)$$4.apply(ejq.a.d)), (dzq)$$12.apply((Object)("waxed_" + $$0), $$2::apply, (Object)$$4.apply(ejq.a.a)), (dzq)$$12.apply((Object)("waxed_exposed_" + $$0), $$2::apply, (Object)$$4.apply(ejq.a.b)), (dzq)$$12.apply((Object)("waxed_weathered_" + $$0), $$2::apply, (Object)$$4.apply(ejq.a.c)), (dzq)$$12.apply((Object)("waxed_oxidized_" + $$0), $$2::apply, (Object)$$4.apply(ejq.a.d)));
    }

    public ImmutableBiMap<dzq, dzq> a() {
        return ImmutableBiMap.of((Object)this.a, (Object)this.b, (Object)this.b, (Object)this.c, (Object)this.c, (Object)this.d);
    }

    public ImmutableBiMap<dzq, dzq> b() {
        return ImmutableBiMap.of((Object)this.a, (Object)this.e, (Object)this.b, (Object)this.f, (Object)this.c, (Object)this.g, (Object)this.d, (Object)this.h);
    }

    public ImmutableList<dzq> c() {
        return ImmutableList.of((Object)this.a, (Object)this.e, (Object)this.b, (Object)this.f, (Object)this.c, (Object)this.g, (Object)this.d, (Object)this.h);
    }

    public void a(Consumer<dzq> $$0) {
        $$0.accept(this.a);
        $$0.accept(this.b);
        $$0.accept(this.c);
        $$0.accept(this.d);
        $$0.accept(this.e);
        $$0.accept(this.f);
        $$0.accept(this.g);
        $$0.accept(this.h);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ejs.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ejs.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ejs.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public dzq d() {
        return this.a;
    }

    public dzq e() {
        return this.b;
    }

    public dzq f() {
        return this.c;
    }

    public dzq g() {
        return this.d;
    }

    public dzq h() {
        return this.e;
    }

    public dzq i() {
        return this.f;
    }

    public dzq j() {
        return this.g;
    }

    public dzq k() {
        return this.h;
    }
}

