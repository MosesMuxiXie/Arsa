/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class bdf
extends bdd {
    public static final String b = "recipeBook";
    private static final Logger e = LogUtils.getLogger();
    private final a f;
    @VisibleForTesting
    protected final Set<amt<dqs<?>>> c = Sets.newIdentityHashSet();
    @VisibleForTesting
    protected final Set<amt<dqs<?>>> d = Sets.newIdentityHashSet();

    public bdf(a $$0) {
        this.f = $$0;
    }

    public void a(amt<dqs<?>> $$0) {
        this.c.add($$0);
    }

    public boolean b(amt<dqs<?>> $$0) {
        return this.c.contains($$0);
    }

    public void c(amt<dqs<?>> $$0) {
        this.c.remove($$0);
        this.d.remove($$0);
    }

    public void d(amt<dqs<?>> $$0) {
        this.d.remove($$0);
    }

    private void e(amt<dqs<?>> $$0) {
        this.d.add($$0);
    }

    public int a(Collection<dqx<?>> $$0, axg $$1) {
        ArrayList<afs.a> $$22 = new ArrayList<afs.a>();
        for (dqx<?> $$3 : $$0) {
            amt<dqs<?>> $$4 = $$3.a();
            if (this.c.contains($$4) || $$3.b().ar_()) continue;
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2 -> $$22.add(new afs.a((drz)$$2, $$3.b().i(), true)));
            aj.g.a($$1, $$3);
        }
        if (!$$22.isEmpty()) {
            $$1.g.b(new afs($$22, false));
        }
        return $$22.size();
    }

    public int b(Collection<dqx<?>> $$0, axg $$12) {
        ArrayList $$2 = Lists.newArrayList();
        for (dqx<?> $$3 : $$0) {
            amt<dqs<?>> $$4 = $$3.a();
            if (!this.c.contains($$4)) continue;
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1 -> $$2.add($$1.a()));
        }
        if (!$$2.isEmpty()) {
            $$12.g.b(new aft($$2));
        }
        return $$2.size();
    }

    private void a(List<amt<dqs<?>>> $$0, Consumer<amt<dqs<?>>> $$1, Predicate<amt<dqs<?>>> $$2) {
        for (amt<dqs<?>> $$3 : $$0) {
            if (!$$2.test($$3)) {
                e.error("Tried to load unrecognized recipe: {} removed now.", $$3);
                continue;
            }
            $$1.accept($$3);
        }
    }

    public void a(axg $$0) {
        $$0.g.b(new afu(this.a().a()));
        ArrayList<afs.a> $$1 = new ArrayList<afs.a>(this.c.size());
        for (amt<dqs<?>> $$22 : this.c) {
            this.f.displaysForRecipe($$22, $$2 -> $$1.add(new afs.a((drz)$$2, false, this.d.contains($$22))));
        }
        $$0.g.b(new afs($$1, true));
    }

    public void a(bdf $$0) {
        this.a($$0.b());
    }

    public b b() {
        return new b(this.a.a(), List.copyOf(this.c), List.copyOf(this.d));
    }

    private void a(b $$0) {
        this.c.clear();
        this.d.clear();
        this.a.a($$0.b);
        this.c.addAll($$0.c);
        this.d.addAll($$0.d);
    }

    public void a(b $$0, Predicate<amt<dqs<?>>> $$1) {
        this.a.a($$0.b);
        this.a($$0.c, this.c::add, $$1);
        this.a($$0.d, this.d::add, $$1);
    }

    @FunctionalInterface
    public static interface a {
        public void displaysForRecipe(amt<dqs<?>> var1, Consumer<drz> var2);
    }

    public static final class b
    extends Record {
        final bde b;
        final List<amt<dqs<?>>> c;
        final List<amt<dqs<?>>> d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bde.b.forGetter(b::a), (App)dqs.b.listOf().fieldOf("recipes").forGetter(b::b), (App)dqs.b.listOf().fieldOf("toBeDisplayed").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(bde $$0, List<amt<dqs<?>>> $$1, List<amt<dqs<?>>> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "settings;known;highlight", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "settings;known;highlight", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "settings;known;highlight", "b", "c", "d"}, this, $$0);
        }

        public bde a() {
            return this.b;
        }

        public List<amt<dqs<?>>> b() {
            return this.c;
        }

        public List<amt<dqs<?>>> c() {
            return this.d;
        }
    }
}

